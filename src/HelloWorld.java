import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld { //code Add family
    public static void main (String[] args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver" , "C:/Selenuim webdriver/chromedriver-win64/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://onehealthassist.com/individual-login"); //login page
        driver.manage().window().maximize();
        driver.findElement(By.id("phone_number")).sendKeys("7021302938");
        driver.findElement(By.xpath("//*[@id=\"replace_div\"]/div[1]/form/div/div[4]/button")).click();
        Thread.sleep(5000);

        driver.findElement(By.name("otp1")).sendKeys("1");
        driver.findElement(By.name("otp2")).sendKeys("3");
        driver.findElement(By.name("otp3")).sendKeys("1");
        driver.findElement(By.name("otp4")).sendKeys("3");

        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div[2]/form/input[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"paitient-menu\"]/li[8]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[2]/input")).sendKeys("Dhiraj Somnath Suryawanshi");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[3]/input")).sendKeys("07-07-1997");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[4]/select")).sendKeys("Male");
        driver.findElement(By.id("phone")).sendKeys("7021302938");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[6]/input")).sendKeys("dhirajsuryawanshi97686@gmail.com");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[7]/input")).sendKeys("37");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[8]/input")).sendKeys("40");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[9]/select")).sendKeys("AB");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[10]/select")).sendKeys("son");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div/div[11]/button")).click();
        //driver.close();
    }
}