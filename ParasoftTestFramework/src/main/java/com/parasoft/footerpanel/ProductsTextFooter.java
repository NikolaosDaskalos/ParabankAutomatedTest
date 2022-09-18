package com.parasoft.footerpanel;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class ProductsTextFooter {
    static String url ="https://www.parasoft.com/products/";
    static String title = "Automated Software Testing Tool Suite | Parasoft";

    public void clickFooterProductsText(){
        Pages.homePage().goTo();
        Browser.footerProductsTextClick();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }

    public boolean isAtUrl(){
        return Browser.getUrl().equals(url);
    }
}
