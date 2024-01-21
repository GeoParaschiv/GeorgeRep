package org.example.bonigarciaselenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlaceOrderDetailsPage extends HomePage {

    public PlaceOrderDetailsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNameInput() {
        //return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(("input#name"))));

    }

    public WebElement getCreditCard() {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(("input#card"))));

    }
//public WebElement getPlaceOrderButton(){
        //return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[oneclick*='btn-success']")));
//}

    public WebElement getPurchaseButton() {
       return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(("button[onclick*='purchaseOrder']"))));

    }
}
