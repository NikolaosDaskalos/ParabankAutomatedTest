package com.parasoft.atmservices;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class MakeDeposits {

        static String url= "https://parabank.parasoft.com/parabank/services/ParaBank?wsdl";

        public void clickMakeDepositsText(){
            Pages.homePage().goTo();
            Browser.makeDeposits();
        }

        public boolean isAt(){
            return Browser.getUrl().equals(url);
        }
}