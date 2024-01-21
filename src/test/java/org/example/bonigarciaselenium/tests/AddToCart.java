package org.example.bonigarciaselenium.tests;

import org.example.bonigarciaselenium.pageobjects.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 1.Go to demoblaze.com
 * 2.Login with username and password
 * 3.select product
 * 4.add to cart (monitor 24)
 * 5.Place order
 * 6.Name and credit card.
 * 7.Click on purchase order
 */

public class AddToCart extends BaseTest {

    LoginPage loginPage;

    @BeforeEach
    public void setupPages() {
        loginPage = new LoginPage(driver);

    }

    @Test
    public void addToCart() throws InterruptedException {
        loginPage.performLogin("skillbrainuser", "123456");
        Assertions.assertTrue(loginPage.isWelcomeUser(), "Welcome skillbrainuser is present");
        loginPage.getMonitorsCategoryButton().click();
    }
}
