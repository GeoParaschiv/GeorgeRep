package org.example.selenium.bonigarciaselenium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends HomePage {



    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void inputUserName(String userName) {
        //getWait().until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input#sign-name"))))
                //.sendKeys(userName);
        getDriver().findElement(By.cssSelector("input#sign-username")).sendKeys(userName);
    }

    public void inputPassword(String password) {
        //getWait().until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input#sign-password"))))
        //.sendKeys(password);
        getDriver().findElement(By.cssSelector("input#sign-password")).sendKeys(password);
    }

    public void clickSignUp() {
        //return getWait().until(ExpectedConditions.visibilityOfElementLocated
        //(By.cssSelector("button[onclick*=\"register\"]")));
        getDriver().findElement(By.cssSelector("button[onclick*='register']")).click();
    }
}
