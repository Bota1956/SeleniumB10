package actionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderPractice {

    @Test
    public void sliderTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider = driver.findElement(By.tagName("input"));
        WebElement text= driver.findElement(By.id("range"));
        navigateToTarget(slider, text, driver, 4.5);
//        Actions actions = new Actions(driver);
//        actions.clickAndHold(slider).moveByOffset(50, 0).perform(); //50 pixel is exactly coordinate your element

        Point point = slider.getLocation();  // returns location of the x, point is the class
        System.out.println(point.getX());//115
        System.out.println(point.getY());//163
        //source--> target--> find the webElement of the target then using Point class(getLocation() method,
        // you can provide the x and y coordinate.

        // TASK: create the function that takes webElementSlider,webElementNumText, driver, target number
        // navigateToTarget(slider, text, driver, 4);


    }

    public void navigateToTarget(WebElement slider, WebElement webElementNumText, WebDriver driver, Double targetNum) {
        Actions actions = new Actions(driver);
        driver = new ChromeDriver();
        if (targetNum == 2.5) {
            actions.click(slider).perform();
        } else if (targetNum > 2.5) {
            int count = 10; //3.5
            while (!webElementNumText.getText().equals(String.valueOf(targetNum))) {
                actions.clickAndHold(slider).moveByOffset(count, 0).perform();
                count += 5;//20
            }
        } else {
            int count = -10;
            while (!webElementNumText.getText().equals(String.valueOf(targetNum))) {
                actions.clickAndHold(slider).moveByOffset(count, 0).perform();
                count -= 5;//-20 //-30
            }
        }

//        public static void moveSlider(WebElement element,WebDriver driver, double targetNumber){
//            for (int i=0; i<targetNumber*2; i++){
//                element.sendKeys(Keys.ARROW_RIGHT);
//            }
//        }
    }
}