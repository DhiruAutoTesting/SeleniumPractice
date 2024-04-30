
package org.seleniumPractice.devbyteschool;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://devbyteschool.com/");
        //System.out.println("system");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement divElement = driver.findElement(By.className("youtube"));

        // Create JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the <div> element using JavaScript
        js.executeScript("arguments[0].scrollIntoView(true);",divElement);
        Thread.sleep(1000);

        divElement.click();

        //driver.findElement( By.xpath("/html/body/app-root/app-layout/app-header/header/div/nav/ul/li[2]/a")).click();
        //driver.findElement(By.xpath("/html/body/modal-container/div[2]/div/app-auth/app-login/div/div/div/div/form/div/div[2]/input")).sendKeys("dhirajsuryawanshi97686@gmsil.com");
        //driver.findElement(By.xpath("/html/body/modal-container/div[2]/div/app-auth/app-login/div/div/div/div/form/div/div[3]/input")).sendKeys("Dhiru@1997");
        //driver.findElement(By.xpath("/html/body/modal-container/div[2]/div/app-auth/app-login/div/div/div/div/form/div/div[4]/button")).click();
        //driver.close();

    }
}
