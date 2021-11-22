package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class CarSelect {
/*
TASK: https://www.cars.com/
Select New car - Porche - 911
Click search button
Validate header is equals to "New Porsche 911 for sale"
 */
  @Test
  public void testCars() throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.cars.com/");
    WebElement dropDown = driver.findElement(By.id("make-model-search-stocktype"));
    WebElement make = driver.findElement(By.id("makes"));
    WebElement model = driver.findElement(By.id("models"));
    WebElement searchButton = driver.findElement(By.xpath("//div[@id='by-make-tab']//button"));

    BrowserUtils.selectBy(dropDown, "New cars", "text");
    BrowserUtils.selectBy(make, "porsche", "value");
    BrowserUtils.selectBy(model,"4", "index");

//    Select select = new Select(dropDown);
//    select.selectByVisibleText("New cars");
//
//    Select select1= new Select(make);
//    select1.selectByValue("porsche");
//
//    Select select2 = new Select(model);
//    select2.selectByIndex(4);

    searchButton.click();
    Thread.sleep(1000);

    WebElement header =driver.findElement(By.xpath("//h1"));
    String actual = BrowserUtils.getText(header);
    String expected ="New Porsche 911 for sale";
    Assert.assertEquals(actual,expected);







  }

}
