package actionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class DragAndDropPractice {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement orangeBox = driver.findElement(By.className("test2"));
        String actualText = BrowserUtils.getText(orangeBox);
        String expectedText = "... Or here.";

        Assert.assertEquals(actualText, expectedText);

        WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, orangeBox).perform();

        orangeBox = driver.findElement(By.className("test2"));
        //we should reinitialize the orangeBox to overcome the staleElementRefrenceException
        String successMessage = BrowserUtils.getText(orangeBox);
        String expectedMessage = "You did great!";

        Assert.assertEquals(successMessage, expectedMessage);

        String cssvalue = orangeBox.getCssValue("background-color");
        System.out.println(cssvalue);

        Assert.assertEquals(cssvalue, "rgba(238, 111, 11, 1)");
    }


        @Test
        public void test2() throws InterruptedException {

            WebDriver driver= new ChromeDriver();
            driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
            driver.manage().window().maximize();

            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement blueBox = driver.findElement(By.className("test1"));

            WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
            cookies.click();
            Thread.sleep(1000);

            Actions actions= new Actions(driver);
            actions.clickAndHold(draggable).moveToElement(blueBox).release().perform();

        }





    }


