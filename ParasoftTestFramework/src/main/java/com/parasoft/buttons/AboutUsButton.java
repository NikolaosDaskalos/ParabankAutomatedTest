package com.parasoft.buttons;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class AboutUsButton {
    static String title= "ParaBank | About Us";

    public void pressAboutUsButton(){
        Pages.homePage().goTo();
        Browser.aboutUsButton();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}

