package org.example.selenium.bonigarciaselenium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends HomePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isWelcomeUser() {
        return getWait().until(ExpectedConditions.
                textToBe(By.cssSelector("a#nameofuser"), "Welcome skillbrainuser"));
    }

    public WebElement getUsername() {
        return  getWait().until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("input#loginusername")));
    }

    public WebElement getPassword() {
        return getDriver().findElement(By.cssSelector("input#loginpassword"));
    }

    public WebElement getLoginSubmit() {
        return getDriver().findElement(By.cssSelector("button[onclick='logIn()']"));
    }

    public void performLogin(String user, String password) throws InterruptedException {
        getLoginButton().click();
        Thread.sleep(500);
        getUsername().sendKeys(user);
        getPassword().sendKeys(password);
        getLoginSubmit().click();
    }
}

