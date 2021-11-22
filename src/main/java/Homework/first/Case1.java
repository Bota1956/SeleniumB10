package Homework.first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Case1 {
    /*
    Navigate to "https://demoqa.com/text-box"
Enter your full name, email, current and permanent address Click submit button.
Validate that your information is displayed. if everything is correct print true, otherwise print false.
Example:
Name:David
Email: david@gmail.com
Current Address :Current Address Permananet Address : permanent address
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Bota Kokybassova");
        Thread.sleep(2000);



        WebElement email = driver.findElement(By.xpath("//input[contains(@type,'email')]"));
        email.sendKeys("bota@gmail.com");
        Thread.sleep(2000);

        WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        address.sendKeys("5320 N Sheridan");
        Thread.sleep(2000);
        WebElement address2 = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        address2.sendKeys("5320 S Sheridan");
        Thread.sleep(2000);

        WebElement submitButton=driver.findElement(By.id("submit"));
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", submitButton);
        submitButton.click();

        Thread.sleep(2000);
        WebElement outPut = driver.findElement(By.xpath("//div[@id='output']"));

        List<WebElement> outputs = driver.findElements(By.xpath("//p[@class='mb-1']"));
        // First element from this outputs is name
        String actualName = outputs.get(0).getText();
        String actualEmail = outputs.get(1).getText();
        String actualAddress = outputs.get(2).getText();
        String actualAddress2 = outputs.get(3).getText();

        String expectedName ="Name:"+ "Bota Kokybassova";
        String expectedEmail ="Email:"+"bota@gmail.com";
        String expectedAddress ="Current Address :"+"5320 N Sheridan";
        String expectedAddress2 ="Permananet Address :"+"5320 S Sheridan";

        boolean isMatchingName = expectedName.equals(actualName);
        if (isMatchingName) {
            boolean isMatchingEmail = expectedEmail.equals(actualEmail);
            if (isMatchingEmail) {
                boolean isMatchingAddress = expectedAddress.equals(actualAddress);
                if (isMatchingAddress) {
                    boolean isMatchingAddress2 = expectedAddress2.equals(actualAddress2);

                    if (isMatchingAddress2){
                        System.out.println("Every info has been displayed correctly");
                    }else {
                        System.out.println("Permanent address display is failed!");
                    }
                } else {
                    System.out.println("Permanent address display is failed!");
                }
            } else {
                System.out.println("email is incorrect");
            }
        } else {
            System.out.println("name is incorrect");
        }
     driver.close();

    }
}
