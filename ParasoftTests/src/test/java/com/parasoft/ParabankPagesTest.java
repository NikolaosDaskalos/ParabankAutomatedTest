package com.parasoft;

import com.parasoft.pages.Pages;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        assertTrue(Pages.homePage().isAt());
    }


    @Test
    @DisplayName("Go to About Us page from menu ")
    public void canGotoAboutUsPageFromMenu(){
        Pages.aboutUsPage().goTo();
        assertTrue(Pages.aboutUsPage().isAt());
    }
}
