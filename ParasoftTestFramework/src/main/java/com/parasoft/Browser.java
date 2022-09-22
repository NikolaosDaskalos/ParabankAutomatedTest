package com.parasoft;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;

public class Browser {
    static WebDriver driver;
    public static void startUp(){driver = new ChromeDriver();}

    public static void takeScreenShot(String name) {
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES) ));
    }

    public static void goTo(String url){
        driver.get(url);
    }

    public static String title(){
        return driver.getTitle();
    }

    public static String getUrl(){
        return driver.getCurrentUrl();
    }

    public static void homeButton(){
        driver.findElement(By.className("home")).click();
    }

    public static void close(){
        driver.close();
    }

    public static void aboutUsButton() {
        driver.findElement(By.className("aboutus")).click();
    }

    public static void contactButton() {
        driver.findElement(By.className("contact")).click();
    }

    public static void aboutUsMenuText() {driver.findElement(By.linkText("About Us")).click();
    }

    public static void servicesMenuText() { driver.findElement(By.linkText("Services")).click();
    }

    public static void productsMenuText() {
        driver.findElement(By.linkText("Products")).click();
    }

    public static void locationsMenuText() { driver.findElement(By.linkText("Locations")).click();
    }

    public static void adminPageMenuText() {driver.findElement(By.linkText("Admin Page")).click();
    }

    public static WebElement SOAPRadioButton() {
        WebElement selectedRadioButton = driver.findElement(By.id("accessMode1"));
        return selectedRadioButton;
    }

    public static boolean isRadioButtonSelected() {
        return SOAPRadioButton().isSelected();
    }

    public static String getRadioButtonText() {
        return SOAPRadioButton().getAttribute("value");
    }

    public static void withdrawFunds() {driver.findElement(By.linkText("Withdraw Funds")).click();
    }

    public static void transferFunds() {driver.findElement(By.linkText("Transfer Funds")).click();
    }

    public static void checkBalances() {driver.findElement(By.linkText("Check Balances")).click();
    }

    public static void makeDeposits() {driver.findElement(By.linkText("Make Deposits")).click();
    }

    public static void billPay() {driver.findElement(By.linkText("Bill Pay")).click();
    }

    public static void accountHistory() {driver.findElement(By.linkText("Account History")).click();
    }

    public static void transferFundsOnlineServices() {driver.findElement(By.cssSelector(".servicestwo > li:nth-child(4) > a")).click();
    }

    public static void firstLinkTextClick() {driver.findElement(By.linkText("ParaBank Is Now Re-Opened")).click();
    }

    public static void secondLinkTextClick() {driver.findElement(By.linkText("New! Online Bill Pay")).click();
    }

    public static void thirdLinkTextClick() {driver.findElement(By.linkText("New! Online Account Transfers")).click();
    }

        public static void footerHomeTextClick() {driver.findElement(By.cssSelector("div#footerPanel li:nth-of-type(1)")).click();
    }

    public static void footerAboutUsTextClick() {driver.findElement(By.cssSelector("div#footerPanel li:nth-child(2)")).click();
    }

    public static void footerServicesTextClick() {driver.findElement(By.cssSelector("div#footerPanel li:nth-of-type(3)")).click();
    }

    public static void footerProductsTextClick() {driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[4]/a")).click();
    }

    public static void footerLocationsTextClick() {driver.findElement(By.cssSelector("div#footerPanel li:nth-of-type(5)")).click();
    }

    public static void footerForumTextClick() {driver.findElement(By.cssSelector("div#footerPanel li:nth-of-type(6)")).click();
    }

    public static void footerSiteMapTextClick() {driver.findElement(By.cssSelector("div#footerPanel li:nth-of-type(7)")).click();
    }

    public static void footerContactUsTextClick() {driver.findElement(By.cssSelector("div#footerPanel li:last-child")).click();
    }
}

