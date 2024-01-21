package org.example.selenium.bonigarciaselenium.tests;

import org.example.bonigarciaselenium.pageobjets.ContactPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactTest extends BaseTest {

    ContactPage contactPage;

    @BeforeEach
    public void setContactPage() {
        contactPage = new ContactPage(driver);
    }

    @Test
    public void positiveTest() {
        contactPage.getContactButton().click();
        contactPage.getEmail().sendKeys("george@yahoo.com");
        contactPage.contactName().sendKeys("George");
        contactPage.getMessage().sendKeys("Ma bucur ca mi a iesit si mie ceva de capul meu");
        contactPage.sendEmail().click();

        contactPage.getWait().until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
    }
}
