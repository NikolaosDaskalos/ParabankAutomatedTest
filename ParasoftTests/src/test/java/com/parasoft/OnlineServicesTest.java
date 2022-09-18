package com.parasoft;

import com.parasoft.onlineservices.OnlineServices;
import com.parasoft.pages.Pages;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void billPay() {
        Pages.homePage().goTo();
        OnlineServices.billPay().clickBillPayText();
        assertTrue(OnlineServices.billPay().isAt());
    }

    @Test
    @DisplayName("Account History link text")
    public void accountHistory() {
        Pages.homePage().goTo();
        OnlineServices.accountHistory().clickAccountHistoryText();
        assertTrue(OnlineServices.accountHistory().isAt());
    }

    @Test
    @DisplayName("Transfer Funds link text")
    public void transferFunds() {
        Pages.homePage().goTo();
        OnlineServices.transferFunds().clickTransferFundsOnlineServicesText();
        assertTrue(OnlineServices.transferFunds().isAt());
    }

}
