package org.example.selenium.bonigarciaselenium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItemPage extends HomePage{

    public ItemPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getToAddCartButton (){
       // return getDriver().findElement(By.cssSelector("a.btn"));
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn")));
    }



}
