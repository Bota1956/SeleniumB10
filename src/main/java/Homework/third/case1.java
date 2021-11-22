package Homework.third;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class case1 {
    /*
    Navigate to "https://demo.openemr.io/openemr"
Enter username "admin"
Enter password "pass"
Search the "Phil Belford" from the search box under the patient finder
Validate Name
Validate Phone Number
Validate SSN number
Validate external ID are matching in Home page and Patient Dashboard
Validate DOB is displayed
Validate age is correct according to the DOB of patient
     */

    public case1(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "authUser") // id is faster instead xpath;
    WebElement username;

    @FindBy(id="clearPass")
    WebElement password;

    @FindBy(xpath ="//button[@type=\"submit\"]")
    WebElement loginButton;

    @FindBy(xpath ="//div[@class=\"event_appointment event\"][2]")
    WebElement searchBox;

    @FindBy(xpath = "//span[.='Phil Belford']")
    WebElement namePatient;



    public void SignIn(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
    }
    public void Login(){
        loginButton.click();
    }
    public void ChoosePatient(){
        searchBox.click();

    }









}
