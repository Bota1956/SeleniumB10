package Homework.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Case3 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Steps
Navigate to "https://www.saucedemo.com/" Enter username "Java"
Enter password "Selenium"
Click Login button
Validate "Epic sadface: Username and password do not match any user in this service" message
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("Java");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Selenium");
        WebElement submit = driver.findElement(By.xpath("//input[@value='Login']"));
        submit.click();
        Thread.sleep(2000);
        WebElement sadface = driver.findElement(By.xpath("//*[@data-test='error']"));
        String actual= sadface.getText();
        String expected ="Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actual, expected, "Sorry");


        driver.close();


    }
}
