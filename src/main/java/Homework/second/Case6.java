package Homework.second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case6 {
    /*
    Navigate to "https://demoqa.com/droppable"
    Select drag and drop to box
Validate color is changed of the box
Validate the text is "Dropped!"
     */

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");

        WebElement draggable = driver.findElement(By.xpath("//div[contains(text(), 'Drag me')]"));
        WebElement dropBox = driver.findElement(By.xpath("//div/p[contains(text(), 'Drop here')]"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, dropBox).perform();
        Thread.sleep(1000);

        dropBox = driver.findElement(By.xpath("//div/p[contains(text(), 'Dropped!')]/.."));

        String color = dropBox.getCssValue("background-color");
        Assert.assertEquals(color, "rgba(70, 130, 180, 1)");

        String actualText = dropBox.getText();
        String expectedText = "Dropped!";
        Assert.assertEquals(actualText, expectedText);


    }
}
