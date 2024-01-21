package org.example.selenium.bonigarciaselenium.tests;

import org.example.bonigarciaselenium.pageobjets.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * 1. go to site
 * 2. login with skillbrainuser & password
 * 3. Click on monitors category
 * 4. Add to cart (monitor 24)
 * 5. Place order
 * 6. Name and credit card
 * 7. Click and purchase order
 */
public class AddToCartTest extends BaseTest {
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
        CategoryPage categoryPage = new CategoryPage(driver);
        Thread.sleep(500);
        List<WebElement> monitors = categoryPage.getItems();
        for (WebElement webElement: monitors) {
            WebElement currentMonitor = webElement.findElement(By.cssSelector("a.hrefch"));
            if (currentMonitor.getText().equals("Apple monitor 24")){
                currentMonitor.click();
                break;
            }
        }
        ItemPage itemPage = new ItemPage(driver);
        itemPage.getToAddCartButton().click();
        //Thread.sleep(500);
        itemPage.getWait().until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        itemPage.getCartButton().click();
        //Thread.sleep(500);

        CartPage cartPage = new CartPage(driver);
        cartPage.getPlaceOrderButton().click();

        PlaceOrderDetailsPage placeOrderDetailsPage = new PlaceOrderDetailsPage(driver);
        placeOrderDetailsPage.getNameInput().sendKeys("Andreea");
        placeOrderDetailsPage.getCreditCard().sendKeys("1234565432543");
        placeOrderDetailsPage.getPurchaseItem().click();

        String thankYou = placeOrderDetailsPage.getPurchaseSuccessMessage().getText();
        Assertions.assertEquals("Thank you for your purchase!", thankYou);
    }
}
