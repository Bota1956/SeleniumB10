package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class NestedFramePractice {

    @Test
    public void nestedFrameValidation() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame(0); //frame top
        WebElement middleFrame = driver.findElement(By.name("frame-middle"));
        //we should find the webElement of Iframe
        driver.switchTo().frame(middleFrame);//frame-middle

        WebElement middleText = driver.findElement(By.id("content"));
        String actualtext = middleText.getText();
        String expectedText = "MIDDLE";
        Assert.assertEquals(actualtext, expectedText);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement bottom = driver.findElement(By.tagName("body"));
        Assert.assertEquals(bottom.getText().trim(), "BOTTOM");
    }

    @Test
    public void printRightAndLeft() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame(0);

        driver.switchTo().frame("frame-right");
        WebElement right = driver.findElement(By.xpath("//body[contains(text(), 'RIGHT')]"));
        System.out.println(BrowserUtils.getText(right));
        Assert.assertEquals(right.getText(), "RIGHT");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-left");
        WebElement left = driver.findElement(By.xpath("//body[contains(text(), 'LEFT')]"));
        System.out.println(BrowserUtils.getText(left));
        Assert.assertEquals(left.getText().trim(), "LEFT");


    }

}

