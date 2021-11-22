package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class JSPractice {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.techtorialacademy.com/");

        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver; // we need to cast

        String title=javascriptExecutor.executeScript("return document.title").toString(); //get title

        System.out.println(title);

        WebElement browseCourse = driver.findElement(By.linkText("Browse Course"));
        javascriptExecutor.executeScript("arguments[0].click()", browseCourse);

        WebElement copyRights= driver.findElement(By.xpath("//p[contains(text(), 'Copyrights')]"));
       // javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", copyRights);
        BrowserUtils.scrollToView(driver,copyRights);

        WebElement studentLogin= driver.findElement(By.xpath("//a[.='Student login']"));

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[contains(text(),'Student login')]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", loginButton);


    }
}
