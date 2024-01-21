package org.example.selenium.bonigarciaselenium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends HomePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getPlaceOrderButton(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-success")));
    }



}
