package org.example.selenium.bonigarciaselenium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//import static org.example.bonigarciaselenium.utils.Constants.DURATION;

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

    public WebElement getMonitorsCategoryButton(){
        return driver.findElement(By.cssSelector("a[onclick*='monitor']"));
    }
    public WebElement getCartButton(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#cartur")));

        // return driver.findElement(By.cssSelector("a[onclick*='showcart']"));

    }
    public WebElement getSignUpButton() {
        return driver.findElement(By.cssSelector("a#signin2"));
    }
public WebElement getContactButton(){
        return driver.findElement(By.cssSelector("a[data-target=\"#exampleModal\"]"));
}

}
