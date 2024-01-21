package org.example.selenium.bonigarciaselenium.tests;

import org.example.bonigarciaselenium.pageobjets.SignUpPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpTest extends BaseTest {
    SignUpPage signUpPage;

    @BeforeEach
    public void setSignUpPage() {
        signUpPage = new SignUpPage(driver);
    }

    @BeforeEach
    public void SignUpPage() {
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void userAlreadyExistsTest() {
        signUpPage.getSignUpButton().click();
        signUpPage.inputUserName("Georgica");
        signUpPage.inputPassword("123456");
        signUpPage.clickSignUp(); //SignUpPage .click() la final, nu mai trec .click() la test

        signUpPage.getWait().until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();

        String alertText = alert2.getText();
        Assertions.assertTrue((alertText.contains("This user already exists.")));
        alert2.accept();
    }
}

   /* @Test
    public void positiveSignUpTest() {
        signUpPage.getSignUpButton().click();
        signUpPage.inputUserName(String.valueOf(System.currentTimeMillis())); //username = timp in milisecunde
        signUpPage.inputPassword("123456");
        signUpPage.clickSignUp(); //SignUpPage .click() la final, nu mai trec .click() la test

        signUpPage.getWait().until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();

        String alertText = alert2.getText();
        Assertions.assertTrue((alertText.contains("Sign up successful.")));
        alert2.accept();
    }*/