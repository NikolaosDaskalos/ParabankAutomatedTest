package com.parasoft.pages;

import com.parasoft.Browser;

public class AboutUsPage {
    static String url = "https://parabank.parasoft.com/parabank/about.htm";
    static String title = "ParaBank | About Us";

    public void goTo(){
        Browser.goTo(url);
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
