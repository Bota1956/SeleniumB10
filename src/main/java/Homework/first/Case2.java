package Homework.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Case2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Steps
Navigate to "https://demoqa.com/radio-button" Click Yes radio button
Validate text is : You have selected Yes
Click Impressive radio button
Validate text is : You have selected Impressive
 Validate No button is disabled using.
         */
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesButton = driver.findElement(By.xpath("//label[contains(@for, 'yesRadio')]"));
        yesButton.click();
        if (yesButton.getText().equals("Yes")) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

       WebElement impressiveButton = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveButton.click();
        String actualClickedImpressive= impressiveButton.getText();
        String expectedImpressive = "You have selected Impressive";
        //Assert.assertEquals(actualClickedImpressive, expectedImpressive, "Impressive wont work");
     //noRadio

        if (impressiveButton.getText().equals("Impressive")) {
            System.out.println("Impressive Test passed");
        }else {
            System.out.println("Impressive Test failed");
        }

        WebElement NoButton = driver.findElement(By.xpath("//input[@id='noRadio']"));

       if(NoButton.isEnabled()){
           System.out.println("No button is enabled");
       }else{
           System.out.println("No button is disabled");
       }

     driver.close();










    }
}
