package org.example.selenium.bonigarciaselenium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryPage extends HomePage {

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getItems(){
        return getDriver().findElements(By.cssSelector("div.card.h-100"));

    }
}
