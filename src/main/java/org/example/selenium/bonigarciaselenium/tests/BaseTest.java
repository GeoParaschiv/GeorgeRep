package org.example.selenium.bonigarciaselenium.tests;

import org.example.bonigarciaselenium.setup.BrowserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static org.example.bonigarciaselenium.setup.WebDriverFactory.createWebDriver;
import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public class BaseTest {
    public static WebDriver driver;
    String siteURL = "https://www.demoblaze.com";
    static BrowserType browserType;

    @BeforeAll
    public static void setupBrowser(){
        browserType = BrowserType.CHROME;
    }

    @BeforeEach
    public void setupTest(){
        driver = createWebDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION));
        driver.get(siteURL);
    }

    @AfterEach
    public void tearDown(){
        //driver.quit();
    }

}
