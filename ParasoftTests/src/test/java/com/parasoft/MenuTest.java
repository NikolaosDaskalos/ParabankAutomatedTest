package com.parasoft;

import com.parasoft.menu.Menu;
import com.parasoft.screenshot.ScreenShot;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Parabank Homepage")
@Feature("Left Menu Test")
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
    @Story("About Us Left Menu link text click test")
    @Description("Landing on Home page and then click About Us link text from Left Menu ")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://parabank.parasoft.com/parabank/about.htm")
    public void aboutUsLeftMenu() {
        Menu.aboutUsMenu().pressAboutUsMenuText();
        assertTrue(Menu.aboutUsMenu().isAt());
        ScreenShot.ifFailScreenShot("Left Menu About Us link text fail",Menu.aboutUsMenu().isAt());

    }

    @Test
    @DisplayName("Services Left Menu link text")
    @Story("Services Left Menu link text click test")
    @Description("Landing on Home page and then click Services link text from Left Menu ")
    @Severity(SeverityLevel.MINOR)
    @Link("https://parabank.parasoft.com/parabank/services.htm")
    public void servicesLeftMenu() {
        Menu.servicesMenu().pressServicesMenuText();
        assertTrue(Menu.servicesMenu().isAt());
        ScreenShot.ifFailScreenShot("Left Menu Services link text fail",Menu.servicesMenu().isAt());
    }

    @Test
    @DisplayName("Products Left Menu link text")
    @Story("Products Left Menu link text click test")
    @Description("Landing on Home page and then click Products link text from Left Menu ")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://www.parasoft.com/products/")
    public void productsLeftMenu() {
        Menu.productsMenu().pressProductsMenuText();
        assertTrue(Menu.productsMenu().isAt());
        ScreenShot.ifFailScreenShot("Left Menu Products link text fail",Menu.productsMenu().isAt());
    }

    @Test
    @DisplayName("Locations Left Menu link text")
    @Story("Locations Left Menu link text click test")
    @Description("Landing on Home page and then click Locations link text from Left Menu ")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://www.parasoft.com/solutions/")
    public void locationsLeftMenu() {
        Menu.locationsMenu().pressLocationsMenuText();
        assertTrue(Menu.locationsMenu().isAt());
        ScreenShot.ifFailScreenShot("Left Menu Locations link text fail",Menu.locationsMenu().isAt());
    }

    @Test
    @DisplayName("Admin Page Left Menu link text")
    @Story("Admin Page Left Menu link text click test")
    @Description("Landing on Home page and then click Admin Page link text from Left Menu ")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://parabank.parasoft.com/parabank/admin.htm")
    public void adminPageLeftMenu() {
        Menu.adminPageMenu().pressAdminPageMenuText();
        Menu.adminPageMenu().clickSOAPRadioButton();
        Menu.adminPageMenu().printName();
        assertAll(
                () -> assertTrue(Menu.adminPageMenu().isSelected()),
                () -> assertTrue(Menu.adminPageMenu().getRadioButtonName()),
                () -> assertTrue(Menu.adminPageMenu().isAt())
        );
        ScreenShot.ifFailScreenShot("Admin Page SOAP radio button is selected fail",Menu.adminPageMenu().isSelected());
        ScreenShot.ifFailScreenShot("Admin Page SOAP radio button name fail",Menu.adminPageMenu().getRadioButtonName());
        ScreenShot.ifFailScreenShot("Left Menu Admin Page link text fail",Menu.adminPageMenu().isAt());
    }

}
