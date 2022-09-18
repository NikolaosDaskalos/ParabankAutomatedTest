package com.parasoft.atmservices;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class TransferFunds {

    static String url= "https://parabank.parasoft.com/parabank/services/ParaBank?wsdl";

    public void clickTransferFundsText(){
        Pages.homePage().goTo();
        Browser.transferFunds();
    }

    public boolean isAt(){
        return Browser.getUrl().equals(url);
    }
}
