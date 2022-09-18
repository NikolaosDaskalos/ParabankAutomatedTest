package com.parasoft.pages;

import com.parasoft.Browser;

public class HomePage {

    static String url = "https://parabank.parasoft.com/";
    static String title = "ParaBank | Welcome | Online Banking";

    public void goTo(){
        Browser.goTo(url);
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
