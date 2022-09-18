package com.parasoft.latestnews;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class SecondLinkText {
    static String title= "ParaBank | News";
    static String url = "https://parabank.parasoft.com/parabank/news.htm#5";

    public void clickSecondLinkText(){
        Pages.homePage().goTo();
        Browser.secondLinkTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
    public boolean isAtUrl(){return Browser.getUrl().equals(url);}
}
