package org.example.selenium.bonigarciaselenium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlaceOrderDetailsPage extends HomePage{
    public PlaceOrderDetailsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getNameInput (){
      //  return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))); -alta metoda de scriere
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#name")));
    }
    public WebElement getCreditCard(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#card")));
    }
    public WebElement getPurchaseItem(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick*='purchaseOrder']")));
    }

    public WebElement getPurchaseSuccessMessage(){
        return getDriver().findElement(By.cssSelector("div.sweet-alert h2"));
    }

}
