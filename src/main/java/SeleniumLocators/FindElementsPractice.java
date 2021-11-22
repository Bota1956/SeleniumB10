package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.findElement() --> RETURNS WEBELEMENT
        //driver.findElements() --> we need to use this method to store all matching elements from the locator.
        // RETURNS LIST<WEBELEMENT>
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.xpath("//li/a"));
        // print all the list from the list which has less than 12 character.
        // count of output
        int count =0;
        for(WebElement element: links){

            if(element.getText().length()<12){
                System.out.println(element.getText());
                System.out.println(element.getAttribute("href"));
                count++;
            }

        }
        System.out.println(count);

    }
}
