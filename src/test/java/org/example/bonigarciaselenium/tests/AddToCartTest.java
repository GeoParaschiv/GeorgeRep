package org.example.bonigarciaselenium.tests;

import org.example.bonigarciaselenium.pageobjects.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AddToCartTest extends BaseTest {

    LoginPage loginPage;

    @BeforeEach
    public void setupPages() throws InterruptedException {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void addToCart() throws InterruptedException {
        loginPage.performLogin("skillbrainuser", "123456");
        Assertions.assertTrue(loginPage.isWelcomeUser(), "Welcome skillbrainuser is present");
        loginPage.getMonitorsCategoryButton().click();
        Thread.sleep(500);
        CategoryPage categoryPage = new CategoryPage(driver);
        List<WebElement> monitors = categoryPage.getItems();
        for (WebElement webElement : monitors) {
            WebElement currentMonitor = webElement.findElement(By.cssSelector("a.hrefch"));
            if (currentMonitor.getText().equals("Apple monitor 24")) {
                currentMonitor.click();
                break;
            }
        }


        ItemPage itemPage = new ItemPage(driver);
        itemPage.getToAddCartButton().click();
        itemPage.getWait().until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        itemPage.getCartButton().click();
        Thread.sleep(500);
        CartPage cartPage = new CartPage(driver);
        cartPage.getPlaceOrderButton().click();

        PlaceOrderDetailsPage placeOrderDetailsPage = new PlaceOrderDetailsPage(driver);
        //placeOrderDetailsPage.getPlaceOrderButton().click();
        placeOrderDetailsPage.getNameInput().sendKeys("Andreea");
        placeOrderDetailsPage.getCreditCard().sendKeys("12345678");

        placeOrderDetailsPage.getPurchaseButton().click();

    //String thankYou = placeOrderDetailsPage.getPurchaseSuccessMessage().getText();

    }
}