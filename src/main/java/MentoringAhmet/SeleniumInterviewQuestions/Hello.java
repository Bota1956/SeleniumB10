package MentoringAhmet.SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hello {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement helloSign= driver.findElement(By.xpath("//span[.='Hello, Sign in']"));
        helloSign.click();

        WebElement createAccount= driver.findElement(By.id("createAccountSubmit"));
        createAccount.click();
        WebElement name= driver.findElement(By.xpath("//input[@autocomplete=\"name\"]"));
        name.sendKeys("Akbota");
        WebElement email= driver.findElement(By.xpath("//input[@autocomplete=\"email\"]"));
        email.sendKeys("a.@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@name=\"password\"]"));
        WebElement repassword= driver.findElement(By.xpath("//input[@name=\"passwordCheck\"]"));
        password.sendKeys("12345A");
        repassword.sendKeys("12345A");
        WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Email address already in use')]"))
                .isDisplayed());




    }
}
