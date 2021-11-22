package Homework.third;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBasePractice {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        driver.manage().window();
        driver.get("https://demo.openemr.io/openemr");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

}
