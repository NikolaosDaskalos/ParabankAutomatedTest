package com.parasoft.footerpanel;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class ContactUsTextFooter {
    static String url ="https://parabank.parasoft.com/parabank/contact.htm";
    static String title = "ParaBank | Customer Care";

    public void clickFooterContactUsText(){
        Pages.homePage().goTo();
        Browser.footerContactUsTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }

    public boolean isAtUrl(){
        return Browser.getUrl().equals(url);
    }
}
