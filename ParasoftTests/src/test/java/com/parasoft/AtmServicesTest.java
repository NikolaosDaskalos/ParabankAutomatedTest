package com.parasoft;

import com.parasoft.atmservices.ATMServices;
import com.parasoft.pages.Pages;
import com.parasoft.screenshot.ScreenShot;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Parabank Homepage")
@Feature("ATM Menu Test")
@DisplayName("ATM Services Homepage Menu")
public class AtmServicesTest {
    @BeforeAll
    public static void startUp(){
        Browser.startUp();
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }

    @Test
    @DisplayName("Withdraw Funds link text")
    @Story("Withdraw Funds link text click test")
    @Description("Home page click Withdraw Funds link text from ATM services menu")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://parabank.parasoft.com/parabank/services/ParaBank?wsdl")
    public void withdrawalFunds() {
        Pages.homePage().goTo();
        ATMServices.withdrawFunds().clickWithdrawFundsText();
        assertTrue(ATMServices.withdrawFunds().isAt());
        ScreenShot.ifFailScreenShot("Withdraw Funds link text fail",ATMServices.withdrawFunds().isAt());
    }

    @Test
    @DisplayName("Transfer Funds link text")
    @Story("Transfer Funds link text click test")
    @Description("TesHome page click Transfer Funds link text from ATM services menu")
    @Severity(SeverityLevel.MINOR)
    @Link("https://parabank.parasoft.com/parabank/services/ParaBank?wsdl")
    public void transferFunds() {
        Pages.homePage().goTo();
        ATMServices.transferFunds().clickTransferFundsText();
        assertTrue(ATMServices.transferFunds().isAt());
        ScreenShot.ifFailScreenShot("Transfer Funds link text fail",ATMServices.transferFunds().isAt());

    }

    @Test
    @DisplayName("Check Balances link text")
    @Story("Check Balances link text click test")
    @Description("TesHome page click Check Balances link text from ATM services menu")
    @Severity(SeverityLevel.MINOR)
    @Link("https://parabank.parasoft.com/parabank/services/ParaBank?wsdl")
    public void checkBalances() {
        Pages.homePage().goTo();
        ATMServices.checkBalances().clickCheckBalancesText();
        assertTrue(ATMServices.checkBalances().isAt());
        ScreenShot.ifFailScreenShot("Check Balances link text fail",ATMServices.checkBalances().isAt());
    }

    @Test
    @DisplayName("Make Deposits link text")
    @Description("TesHome page click Make Deposits link text from ATM services menu")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://parabank.parasoft.com/parabank/services/ParaBank?wsdl")
    public void makeDeposits() {
        Pages.homePage().goTo();
        ATMServices.makeDeposits().clickMakeDepositsText();
        assertTrue(ATMServices.makeDeposits().isAt());
        ScreenShot.ifFailScreenShot("Make Deposits link text fail",ATMServices.makeDeposits().isAt());
    }
}
