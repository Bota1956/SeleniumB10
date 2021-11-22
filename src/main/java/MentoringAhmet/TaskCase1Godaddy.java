package MentoringAhmet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCase1Godaddy {
    public static void main(String[] args) throws InterruptedException {
    //Assignment Level - Beginner
//Test Case 1 - Open Godaddy.com and maximize browser window.
//Steps to Automate:
//1. Launch browser of your choice say., Firefox, chrome etc.
//2. Open this URL - https://www.godaddy.com/
//3. Maximize or set size of browser window.
//4. Close browser.
        //Interview question:
        //What is the function of Webdriver?
        //Webdriver is way of manipulating(changing) the web browser
        //What is the FireFox Driver>?
        //Firefox driver is GECHEKO Driver>
        // What is the difference between navigate().to() and get()
        //Get : it waits all elements to be loaded on the website
        //Get() doesn't have any method
        //Navigate to: It will wait for the specific element that you are looking for
        //Navigate to also has some methods like forward, back, refresh...
        // Close() will close the current web browser(tab)
        //Quit() will close the driver(it means all of the web browsers(tabs)
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.godaddy.com/");
        //suggestion: if you put all the elements' location correct snd still they are not working, make the
        //web browser full screen
        //2.Suggestion: Put the Thread.sleep(3000)
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();





    }
}
