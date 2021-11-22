package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BrowserUtils;

public class SweetAlert {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window();
        System.out.println("It will run before each test annotation");
        driver.get("https://sweetalert.js.org/");
    }


    @Test
    public void sweetalert() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        WebElement swal = driver.findElement(By.xpath("//button[contains(@onclick,'swal')]"));
        swal.click();
        Thread.sleep(1000);

        WebElement popupMessage=driver.findElement(By.xpath("//div[@class='swal-text']"));
        String actualessge = BrowserUtils.getText(popupMessage).trim();
        Assert.assertEquals(actualessge, "Something went wrong!");
        WebElement okButton = driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]"));
        okButton.click();
        Thread.sleep(1000);
        Assert.assertFalse(okButton.isDisplayed());
        softAssert.assertAll(); // better to put at the end to see where is the test is not passing
    }
//
//        WebElement swal = driver.findElement(By.xpath("//button[@onclick=\"swal('Oops', " +
//                "'Something went wrong!', 'error')\"]"));
//        swal.click();
//        WebElement popupMessage = driver.findElement(By.xpath("//div[@class='swal-text']"));
//        String actualMessage = BrowserUtils.getText(popupMessage);
//        Assert.assertEquals(actualMessage, "Something went wrong!");
//
//        WebElement okButton = driver.findElement(By.xpath("//button[.='OK']"));
//        okButton.click();
//        Thread.sleep(1000);
//        Assert.assertFalse(okButton.isDisplayed());
//        System.out.println(okButton.isDisplayed());



    @Test
    public void jsAlert() throws InterruptedException {

        WebElement alert = driver.findElement(By.xpath("//button[contains(@onclick,'alert')]"));
        alert.click();
        Thread.sleep(1000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("It will run after each test annotation");
        driver.quit();
    }
}
