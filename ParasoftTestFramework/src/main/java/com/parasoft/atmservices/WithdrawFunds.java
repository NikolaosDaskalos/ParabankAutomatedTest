package com.parasoft.atmservices;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class WithdrawFunds {
    static String url= "https://parabank.parasoft.com/parabank/services/ParaBank?wsdl";

    public void clickWithdrawFundsText(){
            Pages.homePage().goTo();
            Browser.withdrawFunds();
    }

    public boolean isAt(){
        return Browser.getUrl().equals(url);
    }
}
