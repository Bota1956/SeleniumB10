package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone13 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Iphone 13");
        Thread.sleep(1000);
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        //search.sendKeys(Keys.RETURN); => mac
        //search.sendKeys(Keys.ENTER); => windows

        WebElement result = driver.findElement(By.tagName("nobr"));
        String resultStr = result.getText().replaceAll("[^0-9.]","");
        double sec = Double.parseDouble(resultStr);
          // Today's date is : 10/25/2020
        if(sec<3){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
