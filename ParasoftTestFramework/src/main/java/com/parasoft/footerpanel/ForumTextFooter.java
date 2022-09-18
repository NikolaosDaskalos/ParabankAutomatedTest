package com.parasoft.footerpanel;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class ForumTextFooter {
    static String url ="https://forums.parasoft.com/";
    static String title = "Welcome to the Forums";

    public void clickFooterForumText(){
        Pages.homePage().goTo();
        Browser.footerForumTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }

    public boolean isAtUrl(){
        return Browser.getUrl().equals(url);
    }
}
