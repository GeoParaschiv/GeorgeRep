package org.example.selenium.bonigarciaselenium.tests;

import org.example.bonigarciaselenium.pageobjets.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @BeforeEach
    public void setupPages() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginPositiveTest() throws InterruptedException {
        loginPage.getLoginButton().click();

        Thread.sleep(500);
        loginPage.getUsername().sendKeys("skillbrainuser");
        loginPage.getPassword().sendKeys("123456");
        loginPage.getLoginSubmit().click();
        Assertions.assertTrue(loginPage.isWelcomeUser(), "Welcome skillbrainuser is present");
    }
}
