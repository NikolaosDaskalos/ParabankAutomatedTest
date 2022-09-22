package com.parasoft;

import com.parasoft.pages.Pages;
import com.parasoft.screenshot.ScreenShot;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Parabank Homepage")
@Feature("Parabank Pages Test ")
@DisplayName("Parabank pages test")
public class ParabankPagesTest {
    @BeforeAll
    public static void startUp(){
        Browser.startUp();
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }


    @Test
    @DisplayName("Go to Home page")
    @Story("Go to Home page test")
    @Description("Landing on Home page and check the title")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://parabank.parasoft.com/parabank/index.htm")
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        assertTrue(Pages.homePage().isAt());
        ScreenShot.ifFailScreenShot("Land on Homepage fail",Pages.homePage().isAt());
    }


    @Test
    @DisplayName("Go to About Us page from menu ")
    @Story("Go to About Us page test")
    @Description("Landing on About us page and check the title")
    @Severity(SeverityLevel.TRIVIAL)
    public void canGotoAboutUsPageFromMenu(){
        Pages.aboutUsPage().goTo();
        assertTrue(Pages.aboutUsPage().isAt());
        ScreenShot.ifFailScreenShot("Land on Homepage fail",Pages.aboutUsPage().isAt());
    }
}
