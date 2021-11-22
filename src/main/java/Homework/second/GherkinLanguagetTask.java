package Homework.second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GherkinLanguagetTask {
    /*
    Functionality-Acceptance Criteria(Gherkin Language)
Given the user on saucedemo home page
Then user click the burger button on saucedemo home page
And the user will click the logout button
And user should see the login page
When the user navigate back from login page
Then the user still should see login page
SELENIUM TECTHTORIAL
Description: The user should not see the home page after logout since the user already click the logout button. Write the
test case to test this function and validate it is working correctly or not.
     */
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username= driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();

        WebElement burgerButton= driver.findElement(By.id("react-burger-menu-btn"));
        burgerButton.click();
        Thread.sleep(1000);
        WebElement logOut= driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
        Thread.sleep(1000);
        Actions actions=new Actions(driver);
        actions.moveToElement(logOut).click().perform();

        String currentUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.saucedemo.com/";
        Assert.assertEquals(currentUrl,expectedUrl);
    }
}
