package Homework.second;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case5 {
    @Test
    public void test() throws InterruptedException {
        /* Navigate to "https://demoqa.com/select-menu"
        Select Group 2, option 1
        Select Prof. and validate they are selected. */
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/select-menu");
        WebElement selectOption = driver.findElement(By.xpath("//div[contains(text(), 'Select Option')]"));

        Actions actions = new Actions(driver);

        actions.click().sendKeys(selectOption, "Group 2, option 1" + Keys.RETURN).perform();
        Thread.sleep(1000);
        WebElement selectTitle = driver.findElement(By.xpath("//div[contains(text(),'Select Title')]"));
        Thread.sleep(2000);
        Actions actions1 = new Actions(driver);
        actions1.click().sendKeys(selectTitle, "Prof." + Keys.RETURN).perform();


        WebElement actualSelectOption = driver.findElement(By.xpath("//div[contains(text(),'Group 2,')]"));
        Thread.sleep(1000);
        WebElement actualSelectTitle = driver.findElement(By.xpath("//div[contains(text(),'Select Title')]"));
        Thread.sleep(1000);
//        String actualSelectTitle = selectTitle.getText();
//        String actualSelectOption = selectOption.getText();


        String expectedOption = "Group 2, option 1";
        String expectedTitle = "Prof.";

        Assert.assertEquals(actualSelectOption.getText(), expectedOption);
        Assert.assertEquals(actualSelectTitle.getText(), expectedTitle);


    }
        @Test
        public void test2() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/select-menu");
            WebElement selectOption = driver.findElement(By.xpath("//div[contains(text(),'Select Option')]"));
            selectOption.click();

            Actions actions = new Actions(driver);

            actions.click().sendKeys(selectOption,"Group 2, option 1" + Keys.ENTER ).perform();
            Thread.sleep(1000);
            WebElement selectTitle = driver.findElement(By.xpath("//div[contains(text(),'Select Title')]"));
            Thread.sleep(1000);
            selectTitle.click();
            Thread.sleep(1000);
            actions.click().sendKeys(selectTitle,"Prof."+Keys.ENTER).perform();

            String expOption ="Group 2, option 1";
            String expTitle = "Prof.";
            WebElement actualOption = driver.findElement(By.xpath("//div[contains(text(),'Group 2,')]"));
            WebElement actualTitle = driver.findElement(By.xpath("//div[contains(text(),'Prof.')]"));
//        String actualOption = selectOption.getText();
//        String actualTitle= selectTitle.getText();

            Assert.assertEquals(actualOption.getText(),expOption);
            Assert.assertEquals(actualTitle.getText(),expTitle);




        }









    }

