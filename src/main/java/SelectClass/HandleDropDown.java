package SelectClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cars.com/");

        WebElement distance = driver.findElement(By.id("make-model-maximum-distance"));
        Select select = new Select(distance);
        //select.selectByValue("10"); //selects 10 miles by ' value '
        //select.selectByVisibleText("10 miles");// select by text>10 miles< // I commented bc 3 methods shows same result
        //select.selectByIndex(0); //by index number of options in <select> attribute

        //If u need to print all the matching options at the same time
        //selecting option from dropdown without using methods

        List<WebElement> allOptions= select.getOptions();
        for(WebElement option: allOptions){
            if(option.getText().equals("30 miles")){
                //30 miles it is the VisibleText
               option.click();
               Thread.sleep(1000);
               break;
            }
        }


    }

}
