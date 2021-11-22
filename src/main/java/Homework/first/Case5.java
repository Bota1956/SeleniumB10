package Homework.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.*;

public class Case5 {
    /*
    Steps
Navigate to "https://www.saucedemo.com/" Enter username "standard_user"
Enter password "secret_sauce"
Click Login button
Get the all product name from home page
Validate the product names are unique values
Validate the product names are displayed in ascending order
     */
    public static <allProduct> void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();
        Thread.sleep(2000);
        List<WebElement> allProduct = driver.findElements(By.className("inventory_item_name"));


//        TreeSet<String> treeSet = new TreeSet<String>();
//        for(WebElement product : allProduct){
//            treeSet.add(product.getText());
//        }
//        System.out.println(treeSet);


        String prod1= allProduct.get(0).getText();
        String prod2= allProduct.get(1).getText();
        String prod3= allProduct.get(2).getText();
        String prod4= allProduct.get(3).getText();
        String prod5= allProduct.get(4).getText();
        String prod6= allProduct.get(5).getText();

        List<String> actual = new ArrayList<>();
        actual.add(prod1);
        actual.add(prod2);
        actual.add(prod3);
        actual.add(prod4);
        actual.add(prod5);
        actual.add(prod6);


        Set<String> expected= new TreeSet<>();
        expected.addAll(actual);
        Assert.assertEquals(actual,expected,"Error");
        System.out.println(expected);
        System.out.println(actual);


    driver.close();











    }
}
