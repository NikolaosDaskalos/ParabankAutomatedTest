package com.parasoft.footerpanel;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class LocationsTextFooter {
        static String url ="https://www.parasoft.com/solutions/";
        static String title = "Automated Software Testing Solutions For Every Testing Need";

        public void clickFooterLocationsText(){
            Pages.homePage().goTo();
            Browser.footerLocationsTextClick();
        }

        public boolean isAt(){
            return Browser.title().equals(title);
        }

        public boolean isAtUrl(){
            return Browser.getUrl().equals(url);
        }
}

