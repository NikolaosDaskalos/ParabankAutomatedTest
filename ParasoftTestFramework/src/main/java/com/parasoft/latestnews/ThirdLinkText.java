package com.parasoft.latestnews;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class ThirdLinkText {
    static String title= "ParaBank | News";
    static String url = "https://parabank.parasoft.com/parabank/news.htm#4";

    public void clickThirdLinkTextText(){
        Pages.homePage().goTo();
        Browser.thirdLinkTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
    public boolean isAtUrl(){return Browser.getUrl().equals(url);}
}
