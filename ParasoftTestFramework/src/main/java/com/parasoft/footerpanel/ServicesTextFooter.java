package com.parasoft.footerpanel;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class ServicesTextFooter {
    static String url ="https://parabank.parasoft.com/parabank/services.htm";
    static String title = "ParaBank | Services";

    public void clickFooterServicesText(){
        Pages.homePage().goTo();
        Browser.footerServicesTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }

    public boolean isAtUrl(){
        return Browser.getUrl().equals(url);
    }
}
