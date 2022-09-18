package com.parasoft.footerpanel;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class AboutUsTextFooter {
    static String url ="https://parabank.parasoft.com/parabank/about.htm";
    static String title = "ParaBank | About Us";

    public void clickFooterAboutUsText(){
        Pages.homePage().goTo();
        Browser.footerAboutUsTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }

    public boolean isAtUrl(){
        return Browser.getUrl().equals(url);
    }
}
