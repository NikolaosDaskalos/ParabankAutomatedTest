package com.parasoft.menu;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class ProductsMenu {
    static String title= "Automated Software Testing Tool Suite | Parasoft";

    public void pressProductsMenuText(){
        Pages.homePage().goTo();
        Browser.productsMenuText();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
