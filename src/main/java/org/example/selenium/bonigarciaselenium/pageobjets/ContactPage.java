package org.example.selenium.bonigarciaselenium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactPage extends HomePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getEmail(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"recipient-email\"]"))); // sub forma de xpath
        //getDriver().findElement(By.cssSelector("input#recipient-name")).sendKeys(email);
    }

    public  WebElement contactName(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"recipient-name\"]"))); // sub forma de xpath

        //getDriver().findElement(By.cssSelector("")).sendKeys(contactName);
    }
    public WebElement getMessage(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("textarea#message-text"))); // sub forma de xpath
        //return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("textarea#message-text"))); // sub forma de xpath

    }
    public WebElement sendEmail(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-primary")));
    }
}
