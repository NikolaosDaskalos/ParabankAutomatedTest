package com.parasoft.latestnews;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class FirstLinkText {
    static String title= "ParaBank | News";
    static String url = "https://parabank.parasoft.com/parabank/news.htm#6";

    public void clickFirstLinkTextText(){
        Pages.homePage().goTo();
        Browser.firstLinkTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
    public boolean isAtUrl(){return Browser.getUrl().equals(url);}
}
