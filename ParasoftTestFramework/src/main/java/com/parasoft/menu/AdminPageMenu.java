package com.parasoft.menu;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;
import org.openqa.selenium.WebElement;

public class AdminPageMenu {
    static String title= "ParaBank | Administration";
    static String soap = "soap";

    public void pressAdminPageMenuText(){
        Pages.homePage().goTo();
        Browser.adminPageMenuText();
    }

    public void clickSOAPRadioButton(){
        WebElement selectedRadioButton = Browser.SOAPRadioButton();
        selectedRadioButton.click();
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }

    public boolean isSelected(){
        return Browser.isRadioButtonSelected();
    }

    public boolean getRadioButtonName(){
        return Browser.getRadioButtonText().equals(soap);
    }
    public void printName(){
        System.out.println(Browser.getRadioButtonText());
    }
}
