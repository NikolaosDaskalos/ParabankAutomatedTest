package com.parasoft.footerpanel;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class HomeTextFooter {
    static String url ="https://parabank.parasoft.com/parabank/index.htm";
    static String title = "ParaBank | Welcome | Online Banking";

    public void clickFooterHomeText(){
        Pages.aboutUsPage().goTo();
        Browser.footerHomeTextClick();
    }

    public boolean isAt(){
       return Browser.title().equals(title);
    }

    public boolean isAtUrl(){
        return Browser.getUrl().equals(url);
    }
}
