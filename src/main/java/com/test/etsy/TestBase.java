package com.test.etsy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.Driver;

import java.time.Duration;

public class TestBase {

   public WebDriver driver;

    @BeforeMethod
    public void setUp(){

          driver= Driver.getDriver();


//        WebDriverManager.chromedriver().setup(); // it will update driver version
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Implicitly wait will wait all the page element that my Driver pointing.
        //It will wait 5 sec till element load is completed
        //After 5 sec If it still not loaded It will throw noSuchElementException

       driver.get(ConfigReader.readProperty("etsyUrl"));

    }
    @AfterMethod
    public void tearDown(ITestResult result){
        //ITestResult class or interface and has ready method, it will listen your @test annotation and will provide the result
        if(!result.isSuccess()){
            BrowserUtils.getScreenShot(driver, "etsyscreenshots");
        }
        Driver.tearDown();
    }
}
