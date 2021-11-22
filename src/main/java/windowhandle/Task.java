package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        Thread.sleep(1000);
        WebElement firstElement= driver.findElement(By.linkText("LatentView Analytics Pvt Ltd."));
    }
}
