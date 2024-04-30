import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Selenuim webdriver/chromedriver-win64/chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a URL
        driver.get("https://www.example.com");

        // Other test automation code here...

        // Close the browser
        driver.quit();
    }
}
