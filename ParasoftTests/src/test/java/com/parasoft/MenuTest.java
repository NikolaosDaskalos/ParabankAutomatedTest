package com.parasoft;

import com.parasoft.menu.Menu;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Menu Test")
public class MenuTest {
    @BeforeAll
    public static void startUp(){
        Browser.startUp();
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }

    @Test
    @DisplayName("About Us Left Menu link text")
    public void aboutUsLeftMenu() {
        Menu.aboutUsMenu().pressAboutUsMenuText();
        assertTrue(Menu.aboutUsMenu().isAt());
    }

    @Test
    @DisplayName("Services Left Menu link text")
    public void servicesLeftMenu() {
        Menu.servicesMenu().pressServicesMenuText();
        assertTrue(Menu.servicesMenu().isAt());
    }

    @Test
    @DisplayName("Products Left Menu link text")
    public void productsLeftMenu() {
        Menu.productsMenu().pressProductsMenuText();
        assertTrue(Menu.productsMenu().isAt());
    }

    @Test
    @DisplayName("Locations Left Menu link text")
    public void locationsLeftMenu() {
        Menu.locationsMenu().pressLocationsMenuText();
        assertTrue(Menu.locationsMenu().isAt());
    }

    @Test
    @DisplayName("Admin Page Left Menu link text")
    public void adminPageLeftMenu() {
        Menu.adminPageMenu().pressAdminPageMenuText();
        Menu.adminPageMenu().clickSOAPRadioButton();
        Menu.adminPageMenu().printName();
        assertAll(
                () -> assertTrue(Menu.adminPageMenu().isSelected()),
                () -> assertTrue(Menu.adminPageMenu().getRadioButtonName()),
                () -> assertTrue(Menu.adminPageMenu().isAt())
        );
    }

}
