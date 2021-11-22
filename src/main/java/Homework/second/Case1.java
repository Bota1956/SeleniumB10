package Homework.second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Case1 {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        WebElement loginButton= driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();
        WebElement nameDropDown= driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select = new Select(nameDropDown);
        select.selectByValue("za");
        List<WebElement> actual = driver.findElements(By.className("inventory_item_name"));
        System.out.println(actual);
        List<String> expected = Arrays.asList("Test.allTheThings() T-Shirt (Red)",
                "Sauce Labs Onesie",
                "Sauce Labs Fleece Jacket",
                "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Bike Light",
                "Sauce Labs Backpack");
        for (int i = 0; i < actual.size(); i++) {
            Assert.assertEquals(actual.get(i).getText(),expected.get(i));
        }


       driver.close();




    }

}
