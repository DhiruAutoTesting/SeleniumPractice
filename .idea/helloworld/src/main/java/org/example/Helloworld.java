package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/DELL-PC/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Add a delay to see if the browser opens
        Thread.sleep(5000);

        driver.get("https://onehealthassist.com/");
    }
}
