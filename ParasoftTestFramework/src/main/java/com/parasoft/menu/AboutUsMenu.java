package com.parasoft.menu;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class AboutUsMenu {
    static String title= "ParaBank | About Us";

    public void pressAboutUsMenuText(){
        Pages.homePage().goTo();
        Browser.aboutUsMenuText();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }


}
