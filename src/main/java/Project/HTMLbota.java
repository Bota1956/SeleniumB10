package Project;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLbota {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/akbotakokybassova/Desktop/HTML/Bota.html");
        Thread.sleep(1000);

        WebElement contact = driver.findElement(By.linkText("Contact me"));
        driver.manage().window().maximize();
        contact.click();



        WebElement date = driver.findElement(By.name("date"));
        date.sendKeys("09192022");
        WebElement name = driver.findElement(By.cssSelector("input[name=name]"));
        name.sendKeys("Akbota");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.cssSelector("input[name=Email]"));
        email.sendKeys("ak@techtorialacademy.com");
        Thread.sleep(1000);
        WebElement message = driver.findElement(By.cssSelector("textarea[rows='10']"));
        message.sendKeys("I will find job easily as a SDET");
        Thread.sleep(1000);

        WebElement submit= driver.findElement(By.cssSelector("input[value=Submit]"));
        submit.sendKeys(Keys.RETURN);




    }
}
