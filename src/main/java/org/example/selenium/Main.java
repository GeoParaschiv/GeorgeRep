package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a demo page (replace with your desired URL)
        driver.get("https://www.demoblaze.com/");

                // Perform actions on the page (e.g., interact with elements)

                // Close the browser
                //driver.quit();
    }
}
