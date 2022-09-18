package com.parasoft.onlineservices;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class TransferFundsOnlineServices {

        static String url= "https://parabank.parasoft.com/parabank/services/bank?_wadl&_type=xml";

        public void clickTransferFundsOnlineServicesText(){
            Pages.homePage().goTo();
            Browser.transferFundsOnlineServices();
        }

        public boolean isAt(){
            return Browser.getUrl().equals(url);
        }
}
