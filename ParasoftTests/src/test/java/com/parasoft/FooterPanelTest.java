package com.parasoft;

import com.parasoft.footerpanel.FooterPanel;
import com.parasoft.pages.Pages;
import com.parasoft.screenshot.ScreenShot;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Footer Panel link Texts Test")
@Epic("Parabank Homepage")
@Feature("Footer Panel Test")
public class FooterPanelTest {

    @BeforeAll
    public static void startUp(){
        Browser.startUp();
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }

    @Test
    @DisplayName("Home link text test")
    @Story("Footer Panel Home link text button click test")
    @Description("Landing on About Us page and then click Home link text from footer panel")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://parabank.parasoft.com/parabank/index.htm")
    public void homeLinkTextFooterPanel(){
        FooterPanel.homeTextFooter().clickFooterHomeText();
        assertAll(
                ()->assertTrue(FooterPanel.homeTextFooter().isAt()),
                ()->assertTrue(FooterPanel.homeTextFooter().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Footer Panel's Home LinkText Title fail",FooterPanel.homeTextFooter().isAt());
        ScreenShot.ifFailScreenShot("Footer Panel's Home LinkText Url fail",FooterPanel.homeTextFooter().isAtUrl());
    }

    @Test
    @DisplayName("About Us link text test")
    @Story("Footer Panel About Us link text button click test")
    @Description("Landing on Home page and then click About Us link text from footer panel")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://parabank.parasoft.com/parabank/about.htm")
    public void aboutUsLinkTextFooterPanel(){
        FooterPanel.aboutUsTextFooter().clickFooterAboutUsText();
        assertTrue(FooterPanel.aboutUsTextFooter().isAt());
        ScreenShot.ifFailScreenShot("Footer Panel's About Us LinkText Title fail",FooterPanel.aboutUsTextFooter().isAt());
    }

    @Test
    @DisplayName("Services link text test")
    @Story("Footer Panel Services link text button click test")
    @Description("Landing on Home page and then click Services link text from footer panel")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://parabank.parasoft.com/parabank/services.htm")
    public void servicesLinkTextFooterPanel(){
        FooterPanel.servicesTextFooter().clickFooterServicesText();
        assertAll(
                ()->assertTrue(FooterPanel.servicesTextFooter().isAt()),
                ()->assertTrue(FooterPanel.servicesTextFooter().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Footer Panel's Services LinkText Title fail",FooterPanel.servicesTextFooter().isAt());
        ScreenShot.ifFailScreenShot("Footer Panel's Services LinkText Url fail",FooterPanel.servicesTextFooter().isAtUrl());
    }

    @Test
    @DisplayName("Products link text test")
    @Story("Footer Panel Product link text button click test")
    @Description("Landing on Home page and then click Product link text from footer panel")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://www.parasoft.com/products/")
    public void productsLinkTextFooterPanel(){
        FooterPanel.productsTextFooter().clickFooterProductsText();
        assertAll(
                ()->assertTrue(FooterPanel.productsTextFooter().isAt()),
                ()->assertTrue(FooterPanel.productsTextFooter().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Footer Panel's Product LinkText Title fail",FooterPanel.productsTextFooter().isAt());
        ScreenShot.ifFailScreenShot("Footer Panel's Product LinkText Url fail",FooterPanel.productsTextFooter().isAtUrl());
    }

    @Test
    @DisplayName("Locations link text test")
    @Story("Footer Panel Locations link text button click test")
    @Description("Landing on Home page and then click Locations link text from footer panel")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://www.parasoft.com/solutions/")
    public void locationsLinkTextFooterPanel(){
        FooterPanel.locationsTextFooter().clickFooterLocationsText();
        assertAll(
                ()->assertTrue(FooterPanel.locationsTextFooter().isAt()),
                ()->assertTrue(FooterPanel.locationsTextFooter().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Footer Panel's Locations LinkText Title fail",FooterPanel.locationsTextFooter().isAt());
        ScreenShot.ifFailScreenShot("Footer Panel's Locations LinkText Url fail",FooterPanel.locationsTextFooter().isAtUrl());
    }

    @Test
    @DisplayName("Forum link text test")
    @Story("Footer Panel Forum link text button click test")
    @Description("Landing on Home page and then click Forum link text from footer panel")
    @Severity(SeverityLevel.MINOR)
    @Link("https://forums.parasoft.com/")
    public void forumLinkTextFooterPanel(){
        FooterPanel.forumTextFooter().clickFooterForumText();
        assertAll(
                ()->assertTrue(FooterPanel.forumTextFooter().isAt()),
                ()->assertTrue(FooterPanel.forumTextFooter().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Footer Panel's Forum LinkText Title fail",FooterPanel.forumTextFooter().isAt());
        ScreenShot.ifFailScreenShot("Footer Panel's Forum LinkText Url fail",FooterPanel.forumTextFooter().isAtUrl());
    }

    @Test
    @DisplayName("Site Map link text test")
    @Story("Footer Panel Site Map link text button click test")
    @Description("Landing on Home page and then click Site Map link text from footer panel")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://parabank.parasoft.com/parabank/sitemap.htm")
    public void siteMapLinkTextFooterPanel(){
        FooterPanel.siteMapTextFooter().clickFooterSiteMapText();
        assertAll(
                ()->assertTrue(FooterPanel.siteMapTextFooter().isAt()),
                ()->assertTrue(FooterPanel.siteMapTextFooter().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Footer Panel's Site Map LinkText Title fail",FooterPanel.siteMapTextFooter().isAt());
        ScreenShot.ifFailScreenShot("Footer Panel's Site Map LinkText Url fail",FooterPanel.siteMapTextFooter().isAtUrl());
    }

    @Test
    @DisplayName("Contact Us link text test")
    @Story("Footer Panel Contact Us link text button click test")
    @Description("Landing on Home page and then click Contact Us link text from footer panel")
    @Severity(SeverityLevel.MINOR)
    @Link("https://parabank.parasoft.com/parabank/contact.htm")
    public void contactUsLinkTextFooterPanel(){
        FooterPanel.contactUsTextFooter().clickFooterContactUsText();
        assertAll(
                ()->assertTrue(FooterPanel.contactUsTextFooter().isAt()),
                ()->assertTrue(FooterPanel.contactUsTextFooter().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Footer Panel's Contact Us LinkText Title fail",FooterPanel.contactUsTextFooter().isAt());
        ScreenShot.ifFailScreenShot("Footer Panel's Contact Us LinkText Url fail",FooterPanel.contactUsTextFooter().isAtUrl());
    }
}
