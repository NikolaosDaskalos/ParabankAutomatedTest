package com.parasoft;

import com.parasoft.atmservices.ATMServices;
import com.parasoft.pages.Pages;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void withdrawalFunds() {
        Pages.homePage().goTo();
        ATMServices.withdrawFunds().clickWithdrawFundsText();
        assertTrue(ATMServices.withdrawFunds().isAt());
    }

    @Test
    @DisplayName("Transfer Funds link text")
    public void transferFunds() {
        Pages.homePage().goTo();
        ATMServices.transferFunds().clickTransferFundsText();
        assertTrue(ATMServices.transferFunds().isAt());
    }

    @Test
    @DisplayName("Check Balances link text")
    public void checkBalances() {
        Pages.homePage().goTo();
        ATMServices.checkBalances().clickCheckBalancesText();
        assertTrue(ATMServices.checkBalances().isAt());
    }

    @Test
    @DisplayName("Make Deposits link text")
    public void makeDeposits() {
        Pages.homePage().goTo();
        ATMServices.makeDeposits().clickMakeDepositsText();
        assertTrue(ATMServices.makeDeposits().isAt());
    }
}
