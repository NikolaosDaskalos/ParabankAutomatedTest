package com.parasoft.menu;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class LocationsMenu {
    static String title= "Automated Software Testing Solutions For Every Testing Need";

    public void pressLocationsMenuText(){
        Pages.homePage().goTo();
        Browser.locationsMenuText();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
