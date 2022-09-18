package com.parasoft;

import com.parasoft.latestnews.LatestNews;
import com.parasoft.pages.Pages;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Latest News test")
public class LatestNewsTest {

    @BeforeAll
    public static void startUp(){
        Browser.startUp();
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }

    @Test
    @DisplayName("First link text")
    public void firstLink() {
        Pages.homePage().goTo();
        LatestNews.firstLinkText().clickFirstLinkTextText();
        assertAll(
                () -> assertTrue(LatestNews.firstLinkText().isAt()),
                () -> assertTrue(LatestNews.firstLinkText().isAtUrl())

        );
    }

    @Test
    @DisplayName("Second link text")
    public void secondLink() {
        Pages.homePage().goTo();
        LatestNews.secondLinkText().clickSecondLinkText();
        assertAll(
                () -> assertTrue(LatestNews.secondLinkText().isAt()),
                () -> assertTrue(LatestNews.secondLinkText().isAtUrl())

        );
    }

    @Test
    @DisplayName("Third link text")
    public void thirdLink() {
        Pages.homePage().goTo();
        LatestNews.thirdLinkText().clickThirdLinkTextText();
        assertAll(
                () -> assertTrue(LatestNews.thirdLinkText().isAt()),
                () -> assertTrue(LatestNews.thirdLinkText().isAtUrl())

        );
    }
}
