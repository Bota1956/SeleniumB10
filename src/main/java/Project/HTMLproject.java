package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLproject {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/akbotakokybassova/Desktop/HTML/Newbies.html");

        WebElement contactMe = driver.findElement(By.xpath("//a[text()='Contact Me']"));
        driver.manage().window().maximize();


        contactMe.click();
        WebElement date = driver.findElement(By.name("date"));
        WebElement name = driver.findElement(By.name("name"));
        WebElement email = driver.findElement(By.name("Email"));
        WebElement message = driver.findElement(By.name("Message"));
        WebElement submit = driver.findElement(By.name("submit"));

        date.sendKeys("02251993");
        Thread.sleep(1000);
        name.sendKeys("Newbies");
        Thread.sleep(1000);
        email.sendKeys("newbies@gmail.com");
        Thread.sleep(1000);
        message.sendKeys("We love Selenium");
        Thread.sleep(1000);
        submit.click();



        driver.quit();







    }
}
