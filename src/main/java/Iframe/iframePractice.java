package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframePractice {

    @Test
    public  void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("Hello Java!");

        driver.switchTo().parentFrame();
        //parentFrame() goes one parent up on HTML

        WebElement title = driver.findElement(By.tagName("h3"));
        Thread.sleep(1000);
        String actualTitle = title.getText().trim();
        String expectedTitle="An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
