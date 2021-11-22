package MentoringAhmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FacebookSignIn {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        /*
        Facebook Sign up:
Scenario:
Open a Chrome browser.
Navigate to "http://www.fb.com"
Verify that the page is redirected to "http://www.facebook.com", by getting the current URL. (use Assertion)
Verify that there is a "Create an account" section on the page.
Fill in the text boxes: First Name, Surname, Mobile Number or email address, "Re-enter mobile number", new password.
Update the date of birth in the drop-down.
Select gender.
Click on "Create an account".
Verify that the account is not created.
         */
        driver.navigate().to("http://www.fb.com");
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.facebook.com/");

        WebElement createButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createButton.click();

        Thread.sleep(2000);

        WebElement name = driver.findElement(By.xpath("//input[@placeholder='First name']"));
        name.sendKeys("Bota");
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Kokybassova");
        Thread.sleep(1000);
        WebElement mobileEmail = driver.findElement(By.xpath("//input[contains(@aria-label, 'Mobile number or email')]"));
        mobileEmail.sendKeys("3055870945");
        WebElement password = driver.findElement(By.xpath("//input[contains(@autocomplete,'new-password')]"));
        password.sendKeys("1234455A");
        WebElement month = driver.findElement(By.id("month"));
        month.sendKeys("Feb");
        WebElement day = driver.findElement(By.xpath("//select[contains(@id, 'day')]"));
        day.sendKeys("9");
        WebElement year = driver.findElement(By.xpath("//select[contains(@id, 'year')]"));
        year.sendKeys("1994");
        WebElement gender = driver.findElement(By.xpath("//label[contains(text(), 'Female')]"));
        gender.click();
        WebElement submit = driver.findElement(By.name("websubmit"));
        submit.click();


    }
}
