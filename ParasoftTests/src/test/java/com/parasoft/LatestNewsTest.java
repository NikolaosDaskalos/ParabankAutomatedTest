package com.parasoft;

import com.parasoft.footerpanel.FooterPanel;
import com.parasoft.latestnews.LatestNews;
import com.parasoft.pages.Pages;
import com.parasoft.screenshot.ScreenShot;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Parabank Homepage")
@Feature("Latest News Menu Test")
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
    @DisplayName("Top link text")
    @Story("Top link text click test")
    @Description("Landing on Home page and then click Top link text from Latest News Menu")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://parabank.parasoft.com/parabank/news.htm#6")
    public void topLink() {
        Pages.homePage().goTo();
        LatestNews.firstLinkText().clickFirstLinkTextText();
        assertAll(
                () -> assertTrue(LatestNews.firstLinkText().isAt()),
                () -> assertTrue(LatestNews.firstLinkText().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Latest News Menu Top LinkText Title fail", LatestNews.firstLinkText().isAt());
        ScreenShot.ifFailScreenShot("Latest News Menu Top LinkText Url fail",LatestNews.firstLinkText().isAtUrl());
    }

    @Test
    @DisplayName("Middle link text")
    @Story("Middle link text click test")
    @Description("Landing on Home page and then click Middle link text from Latest News Menu")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://parabank.parasoft.com/parabank/news.htm#5")
    public void middleLink() {
        Pages.homePage().goTo();
        LatestNews.secondLinkText().clickSecondLinkText();
        assertAll(
                () -> assertTrue(LatestNews.secondLinkText().isAt()),
                () -> assertTrue(LatestNews.secondLinkText().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Latest News Menu Top LinkText Title fail", LatestNews.secondLinkText().isAt());
        ScreenShot.ifFailScreenShot("Latest News Menu Top LinkText Url fail",LatestNews.secondLinkText().isAtUrl());
    }

    @Test
    @DisplayName("Bottom link text")
    @Story("Bottom link text click test")
    @Description("Landing on Home page and then click Bottom link text from Latest News Menu")
    @Severity(SeverityLevel.MINOR)
    @Link("https://parabank.parasoft.com/parabank/news.htm#4")
    public void bottomLink() {
        Pages.homePage().goTo();
        LatestNews.thirdLinkText().clickThirdLinkTextText();
        assertAll(
                () -> assertTrue(LatestNews.thirdLinkText().isAt()),
                () -> assertTrue(LatestNews.thirdLinkText().isAtUrl())
        );
        ScreenShot.ifFailScreenShot("Latest News Menu Top LinkText Title fail", LatestNews.thirdLinkText().isAt());
        ScreenShot.ifFailScreenShot("Latest News Menu Top LinkText Url fail",LatestNews.thirdLinkText().isAtUrl());
    }
}
