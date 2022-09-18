package com.parasoft.footerpanel;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class SiteMapTextFooter {
    static String url ="https://parabank.parasoft.com/parabank/sitemap.htm";
    static String title = "ParaBank | Site Map";

    public void clickFooterSiteMapText(){
        Pages.homePage().goTo();
        Browser.footerSiteMapTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }

    public boolean isAtUrl(){
        return Browser.getUrl().equals(url);
    }
}
