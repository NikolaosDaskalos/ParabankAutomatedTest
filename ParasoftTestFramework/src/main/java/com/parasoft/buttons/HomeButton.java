package com.parasoft.buttons;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class HomeButton {
    static String title= "ParaBank | Welcome | Online Banking";

    public void pressHomeButton(){
        Pages.aboutUsPage().goTo();
        Browser.homeButton();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
