package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class Task {
    /*
    /*
TASK:
1- GO to the https://skpatro.github.io/demo/iframes/
2- click category1
3- from new page validate the title is ending with 'qavalidation'
4- Click category3
5- validate the new url is
equals to "https://qavalidation.com/category/softwaretesting/"
 */
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/iframes/");

        driver.switchTo().frame("Framename1");
        WebElement category1= driver.findElement(By.xpath("//a[contains(text(), 'Category1')]"));
        category1.click();

        BrowserUtils.switchByTitle(driver,"SeleniumTesting Archives - qavalidation");
        String currentTitle= driver.getTitle();
        Assert.assertTrue(currentTitle.endsWith("qavalidation"));
        driver.close(); //it will close the SeleniumTestingWindow
        //after closing the SeleniumTesting window , driver will not go back to  the main page
        //We should switch back to the main window
        BrowserUtils.switchByTitle(driver, "iframes");

        driver.switchTo().frame("Frame2");
        WebElement cat3= driver.findElement(By.linkText("Category3"));
        cat3.click();
        BrowserUtils.switchByTitle(driver, "SoftwareTesting");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qavalidation.com/category/softwaretesting/");

        driver.quit();



    }
}
