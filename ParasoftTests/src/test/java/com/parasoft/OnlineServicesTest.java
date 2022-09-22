package com.parasoft;

import com.parasoft.onlineservices.OnlineServices;
import com.parasoft.pages.Pages;
import com.parasoft.screenshot.ScreenShot;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Parabank Homepage")
@Feature("Online Services Menu ")
@DisplayName("Online Services Homepage Menu")
public class OnlineServicesTest {
    @BeforeAll
    public static void startUp(){
        Browser.startUp();
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }

    @Test
    @DisplayName("Bill Pay link text")
    @Story("Bill Pay text link click test")
    @Description("Landing on Home page and then click Bill Pay link text from Online Services Menu")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://parabank.parasoft.com/parabank/services/bank?_wadl&_type=xml")
    public void billPay() {
        Pages.homePage().goTo();
        OnlineServices.billPay().clickBillPayText();
        assertTrue(OnlineServices.billPay().isAt());
        ScreenShot.ifFailScreenShot("Online Services Menu Bill Pay link text click fail",OnlineServices.billPay().isAt());
    }

    @Test
    @DisplayName("Account History link text")
    @Story("Account History text link click test")
    @Description("Landing on Home page and then click Account History link text from Online Services Menu")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://parabank.parasoft.com/parabank/services/bank?_wadl&_type=xml")
    public void accountHistory() {
        Pages.homePage().goTo();
        OnlineServices.accountHistory().clickAccountHistoryText();
        assertTrue(OnlineServices.accountHistory().isAt());
        ScreenShot.ifFailScreenShot("Online Services Menu Account History link text click fail",OnlineServices.accountHistory().isAt());
    }

    @Test
    @DisplayName("Transfer Funds link text")
    @Story("Transfer Funds text link click test")
    @Description("Landing on Home page and then click Transfer Funds link text from Online Services Menu")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://parabank.parasoft.com/parabank/services/bank?_wadl&_type=xml")
    public void transferFunds() {
        Pages.homePage().goTo();
        OnlineServices.transferFunds().clickTransferFundsOnlineServicesText();
        assertTrue(OnlineServices.transferFunds().isAt());
        ScreenShot.ifFailScreenShot("Online Services Menu Transfer Funds link text click fail",OnlineServices.transferFunds().isAt());
    }
}
