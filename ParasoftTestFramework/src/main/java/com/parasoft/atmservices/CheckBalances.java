package com.parasoft.atmservices;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class CheckBalances {
    static String url= "https://parabank.parasoft.com/parabank/services/ParaBank?wsdl";

    public void clickCheckBalancesText(){
        Pages.homePage().goTo();
        Browser.checkBalances();
    }

    public boolean isAt(){
        return Browser.getUrl().equals(url);
    }
}
