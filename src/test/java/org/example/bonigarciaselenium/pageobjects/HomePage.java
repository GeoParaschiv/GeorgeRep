package org.example.bonigarciaselenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.bouncycastle.asn1.BERTags.DURATION;


public abstract class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(DURATION));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("a#login2"));
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }


    public WebElement getMonitorsCategoryButton(){
        return driver.findElement(By.cssSelector("a[onclick*='monitor']"));
    }
    public WebElement getCartButton() {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#cartur")));

        // return driver.findElement(By.cssSelector("a[onclick='showcart']"));
    }
}