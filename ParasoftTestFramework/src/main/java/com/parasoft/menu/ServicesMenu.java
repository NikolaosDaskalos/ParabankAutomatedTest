package com.parasoft.menu;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class ServicesMenu {
    static String title= "ParaBank | Services";

    public void pressServicesMenuText(){
        Pages.homePage().goTo();
        Browser.servicesMenuText();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}

