package com.parasoft.onlineservices;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class AccountHistory {
    static String url= "https://parabank.parasoft.com/parabank/services/bank?_wadl&_type=xml";

    public void clickAccountHistoryText(){
        Pages.homePage().goTo();
        Browser.accountHistory();
    }

    public boolean isAt(){
        return Browser.getUrl().equals(url);
    }
}
