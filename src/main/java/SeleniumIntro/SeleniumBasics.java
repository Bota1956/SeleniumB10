package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

    public static void main(String[] args) {

        // we are defining the chromedriver into the project as a property. Otherwise, it's not going to
        // understand the file location

        //Mac:
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Windows :
        //  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // get method navigates to the given url
        driver.get("http://www.techtorialacademy.com/");

        // getTitle() method gets the title from page and returns String.
       String title = driver.getTitle();
        // Home Page - Techtorial
        if(title.equals("Home Page - Techtorial"))
            System.out.println("true");
        else
           System.out.println("false");


        System.out.println(driver.getCurrentUrl());
    }


}
