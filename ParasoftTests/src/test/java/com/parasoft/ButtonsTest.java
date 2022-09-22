package com.parasoft;

import com.parasoft.buttons.Buttons;
import com.parasoft.screenshot.ScreenShot;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Parabank Homepage")
@Feature("Buttons Test")
@DisplayName("Buttons Test")
public class ButtonsTest {
    @BeforeAll
    public static void startUp(){
        Browser.startUp();
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }

    @Test
    @DisplayName("Home button")
    @Story("Home button click test")
    @Description("Landing on About Us page and then click Home Button")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://parabank.parasoft.com/parabank/index.htm")
    public void canGotoHomePageFromButton() {
        Buttons.homeButton().pressHomeButton();
        assertTrue(Buttons.homeButton().isAt());
        ScreenShot.ifFailScreenShot("Home Button click fail",Buttons.homeButton().isAt());
    }

    @Test
    @DisplayName("About Us button")
    @Story("About Us button click test")
    @Description("Landing on Homepage and then click About Us Button")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://parabank.parasoft.com/parabank/about.htm")
    public void canGotoAboutUsPageFromButton() {
        Buttons.aboutUsButton().pressAboutUsButton();
        assertTrue(Buttons.aboutUsButton().isAt());
        ScreenShot.ifFailScreenShot("About Us Button click fail",Buttons.aboutUsButton().isAt());
    }

    @Test
    @DisplayName("Contact button")
    @Story("Contact button click test")
    @Description("Landing on Homepage and then click Contact Button")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://parabank.parasoft.com/parabank/contact.htm")
    public void canGotoContactPageFromButton() {
        Buttons.contactButton().pressContactButton();
        assertTrue(Buttons.contactButton().isAt());
        ScreenShot.ifFailScreenShot("Contact Button click fail",Buttons.contactButton().isAt());
    }
}
