package com.parasoft;

import com.parasoft.footerpanel.FooterPanel;
import com.parasoft.pages.Pages;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Footer Panel link Texts Test")
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
    public void homeLinkTextFooterPanel(){
        FooterPanel.homeTextFooter().clickFooterHomeText();
        assertAll(
                ()->assertTrue(FooterPanel.homeTextFooter().isAt()),
                ()->assertTrue(FooterPanel.homeTextFooter().isAtUrl())
        );
    }

    @Test
    @DisplayName("About Us link text test")
    public void aboutUsLinkTextFooterPanel(){
        FooterPanel.aboutUsTextFooter().clickFooterAboutUsText();
        assertTrue(FooterPanel.aboutUsTextFooter().isAt());
    }

    @Test
    @DisplayName("Services link text test")
    public void servicesLinkTextFooterPanel(){
        FooterPanel.servicesTextFooter().clickFooterServicesText();
        assertAll(
                ()->assertTrue(FooterPanel.servicesTextFooter().isAt()),
                ()->assertTrue(FooterPanel.servicesTextFooter().isAtUrl())
        );
    }

    @Test
    @DisplayName("Products link text test")
    public void productsLinkTextFooterPanel(){
        FooterPanel.productsTextFooter().clickFooterProductsText();
        assertAll(
                ()->assertTrue(FooterPanel.productsTextFooter().isAt()),
                ()->assertTrue(FooterPanel.productsTextFooter().isAtUrl())
        );
    }

    @Test
    @DisplayName("Locations link text test")
    public void locationsLinkTextFooterPanel(){
        FooterPanel.locationsTextFooter().clickFooterLocationsText();
        assertAll(
                ()->assertTrue(FooterPanel.locationsTextFooter().isAt()),
                ()->assertTrue(FooterPanel.locationsTextFooter().isAtUrl())
        );
    }

    @Test
    @DisplayName("Forum link text test")
    public void forumLinkTextFooterPanel(){
        FooterPanel.forumTextFooter().clickFooterForumText();
        assertAll(
                ()->assertTrue(FooterPanel.forumTextFooter().isAt()),
                ()->assertTrue(FooterPanel.forumTextFooter().isAtUrl())
        );
    }
    @Test
    @DisplayName("Site Map link text test")
    public void siteMapLinkTextFooterPanel(){
        FooterPanel.siteMapTextFooter().clickFooterSiteMapText();
        assertAll(
                ()->assertTrue(FooterPanel.siteMapTextFooter().isAt()),
                ()->assertTrue(FooterPanel.siteMapTextFooter().isAtUrl())
        );
    }
    @Test
    @DisplayName("Contuct Us link text test")
    public void contactUsLinkTextFooterPanel(){
        FooterPanel.contactUsTextFooter().clickFooterContactUsText();
        assertAll(
                ()->assertTrue(FooterPanel.contactUsTextFooter().isAt()),
                ()->assertTrue(FooterPanel.contactUsTextFooter().isAtUrl())
        );
    }
}
