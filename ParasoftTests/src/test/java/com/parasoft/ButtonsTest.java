package com.parasoft;

import com.parasoft.buttons.Buttons;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


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
    public void canGotoHomePageFromButton() {
        Buttons.homeButton().pressHomeButton();
        assertTrue(Buttons.homeButton().isAt());
    }

    @Test
    @DisplayName("About us button")
    public void canGotoAboutUsPageFromButton() {
        Buttons.aboutUsButton().pressAboutUsButton();
        assertTrue(Buttons.aboutUsButton().isAt());
    }

    @Test
    @DisplayName("Contact button")
    public void canGotoContactPageFromButton() {
        Buttons.contactButton().pressContactButton();
        assertTrue(Buttons.contactButton().isAt());
    }
}
