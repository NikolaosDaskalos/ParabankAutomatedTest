package com.parasoft.buttons;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class ContactButton {

    static String title= "ParaBank | Customer Care";

    public void pressContactButton(){
        Pages.homePage().goTo();
        Browser.contactButton();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}

