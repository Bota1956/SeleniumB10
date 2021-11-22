package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.util.Set;

public class NewWindow {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.techtorialacademy.com/')");
        js.executeScript("window.open('https://www.techtorialacademy.com/about-us')");
        js.executeScript("window.open('https://www.techtorialacademy.com/programs')");


        //switch to window until it is equals to about us

        BrowserUtils.switchByTitle(driver, "About Us");
        System.out.println(driver.getTitle());
        //close all the windows except main window


    }

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.techtorialacademy.com/')");
        js.executeScript("window.open('https://www.techtorialacademy.com/about-us')");
        js.executeScript("window.open('https://www.techtorialacademy.com/programs')");


        String mainWindowTitle = driver.getTitle(); //123
        Set<String> ids = driver.getWindowHandles(); //123-124

//  this method inside BrowserUtil.
//        for (String id : ids) {
//            driver.switchTo().window(id);
//            if (!driver.getTitle().equals(mainWindowTitle)) {
//                driver.close(); //close only one window
//            }
//        }

        BrowserUtils.closeWindowsByTitle(driver, mainWindowTitle);

    }
}