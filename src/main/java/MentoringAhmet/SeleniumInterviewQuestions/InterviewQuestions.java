package MentoringAhmet.SeleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestions {

    /*
    1) What are the advantages and disadvantages of Selenium
    Advantages: Free open sources
       *It supports multiple languages(java, javaScript, phyton. C sharp, ruby)
       *Big community
       *It supports ,ultiBrowsers(chrome, safari, internet Explorer, firefox)

    Disadvantages: *captcha, pictures, finger prien etc.. can not be automated by Selenium
                   * There is not direct call for the selenium since it is open-source.
                   *It only automates the web applications.

       2) What type of testing can you automate with Selenium?
          * Smoke test
          * Regression test
          * Functional test(positive-negative UI)  (Assert)

       3) What are the test types we do not automate with Selenium?
         * Performance Testing
         * Manual Testing (adHoc testing=>randomly=>monkey)
         * Load Testing ?
         * Stress Testing

       4) What is locator and what are the locator types?
       Locator is a way of  finding the web element in the Dom.
       Locator Types are: xpath, id, tagName, classname,linkText, partialLinkTest, name, Css;

       5) How do you handle Dynamic elements?
       In my company I faced many dynamic elements ,and I used different ways to handle with
       * I used parent=child-sibling (xpath) to locate the elements *******
       * I went with different to locate the elements **********

       6)Difference between close() and quit() ?
       Close: it is specifically closes the window that you are currently working on.
       Quit: it specifically closes the whole browser. It means it closes all of the windows.

       7) Difference between navigate()to() and get()
        Navigate().to(): it doesn't wait web elements(page) to be loaded.
                       *it has some methods(forward, back, refresh)
        get: it waits the web elements(page) to be loaded.

        8) What is XPATH?
        * XPATH is used to find the location of elements on the webPage using HTML structure.
        * There are two types of XPATH:
        - Absolute Xpath: it goes from parent to child.
        - Relative Xpath: it goes directly to the element location.

        9) What is the difference between Absolute and Relative Xpath?
        - Absolute Xpath: it goes from parent to child. Has SINGLE slash / before xpath structure.
        - Relative Xpath: it goes directly to the element location. Has doublw / slash before xpath structure.

        10) How to handle static drop down menus?

        I would definitely check the tag of the location.
        *If the tage is select --> I use select Class
              Select select = new Select(webElement)
         *If the tag is not select--> I use locators to locate the elements
         *I can also use Actions Class to handle the drop downs. **** (movetoElement)

         11) WHAT ARE THE METHODS OF SELECT?
         Select class is really useful to locate the elements
         * I can locate the elements with
         *SelectByVisibleText
         *SelectByIndex
         *SelectByValue

         12) What kind of exceptions did you face in Selenium?
         * NoSuchException
         * StaleElementsReference Exception
         * NoSuchWindow Exception
         * NoSuchFrame Exception

         13) In what condition do you get StaleElementReference Exception?
         *Once the element is not there anymore.
         *Navigate to the another page.
       *****I CAN HANDLE WITH (refreshing the website  or reinitiliaze the driver)

      14)How do you handle alerts?
      *Operation System Alert :I cannot handle it directly. I need to use ROBOT
      Class to handle it.
      *HTML Alert :I just need to find the element Click the Button you want.
      *JavaScript(Browser) Alert : Alert Class

       15) FOR THE ALERT Interface WHAT KIND OF METHODS DO YOU KNOW?
       *Alert alert= driver.switchto.Alert()
       *Accept --> ok
       *Dismiss--> cancel
       *sendkeys() -- > sendkeys
       *getText()-->get the text

       16) What do you know about iframe(Frame)? Can you tell me the type that you used before ?
       and How do you handle the iframe? ***********
       Different Types: Here is the scenario we have a website and I would like to get the text of price
       from products. all xpath is correct and there is problem with attribute as well. BUT i cannot
       get it. What do you think the reasons could be?
       ** The reason could be the Iframe,so I basically go to the website and in the dom I just
       search for the iframe.
       ??check the exception ???
       *iframe is the html inside of the another html>?
       *driver.switchTo().frame(1)
       ******* driver.switchTo().defaultContent() ************
       *driver.switchTo()frame(2)
       *** if you have multiple iframes into each other. Then I should use
       driver.switchTo()ParentFrame()

       17) What do you know about ACTIONS CLASS?
       *Actions class is really useful to handle some issues in my project since I use some
       actions class methods. Some of the important ones are :
       *SendKeys
       *DoubleClick
       *ClickAndHold
       *DragAndDrop
       *MoveToElements
       *ContextClick(rightClick)*****
       *Click
       Select select = new Select(WebElement);--> select tagname
       Actions actions = new Actions(driver); --> anytime
       *actions.click.PERFORM() --> YOU MUST SAY PERFORM AT THE END otherwise it will not execute.

       18)What is the difference between Find Element and Find Elements?
      *Find Element--> Return single webElement
          Once the elements is not found  *** it throws the NoSUchElement Exception
      *Find Elements--> return the list of the elements
            You can access the elements by using the index number
            *Once the elements is not found ** it doesn't throw any exception but it returns
            EMPTY LIST.

       19) Difference between isDisplayed? isEnabled? and IsSelected ?
       *IsDisplayed -- >it displayed the elements it is VISIBLE or not
       *isEnabled --> the elements is enabled or not
       *IsSelected -->the elements is selected or not.

       20)what is the difference between check box and radio button?
        * Selected and checkbox mentally is similar but the difference is you can only
        choose one radio button option
        *For the selected you can choose as many as you want.

        21) How do you switch the windows (2 windows) from one to another ?
        I switch the windows by using driver.switchTo().window(id) -->
        String mainWindow = driver.getWindowHandle() -- >it returns String "id"
        Set<String> ids = driver.getWindowHandles()--> it returns the set of the ids
        ********
        for(String id : ids){  facebook page (id 12345 and twitter page (1234567)
        if(!id.equals(mainWindow){
        driver.switchTo().window
        }
        for(String id : ids){  facebook page (id 12345 and Twitter page (1234567), ebay page (2131253)
          driver.switchTo.window(id)
        if(!driver.getTitle.equals(ebayPage){
        }

        22)How do you switch the multiple windows(more than 2) from one to another?
           for(String id : ids){  facebook page (id 12345 and twitter page (1234567), ebay page (2131253)
              driver.switchTo.window(id)
            if(!driver.getTitle.equals(ebayPage){
             }

       23) How do you scroll down the page from Web Browser?

       -I would use JavaScript with ScrollIntoView and Point Class

       24)How do you download and upload file in Selenium?

       -Selenium itself CAN NOT verify downloads, can click on download link but can not go outside
       the browser and the downloaded file.
       -Selenium handles the upload but does it differently compared to actual user
          *Find the element that triggers the upload window
          *Find the path of the file you want to upload

           driver.findElement(uploadButton location).sendKeys(file)
           file="C://Users//And Desktop//folder

       25)***** What is the difference between Assert and SoftASSERT?
       Assert: is a class that have some methods to validate the actual and expected data.
       the methods like equal, true, false we can do validation.(like comparison actual-expected)

        **** Once you user Assertion for validation, if code fails it will Right Away Throws The exception which will
        stop the execution.(1000 test case example remember that)

        softAssert:is a class that have some methods to validate the actual and expected data.
        the methods like equal, true, false we can do validation.(like comparison actual-expected)

        *** Once you use Soft Assertion for validation. if code fails it will not THROWS exception
        Right Away and it will keep executing the codes. At the end you can see the failing ones to fix it.
        ****** Do NOT FORGET TO USE SoftAssert.ALL at the end otherwise all test scenarios will pass
        (might cause some issues)
       26) What is the difference between Validation and Verification?
         Validation is executing the codes
         Verification is the reading the codes NO EXECUTION>


       27) POM -> Page Object Model: Is the way to organize your implementation, test scenarios, specific methods
       (TestBase, Pages, Test, UTILS...)  that help to understand the structure of the PROJECT.


       TASK:
       1) I want you go to Amazon
       2) I want you click
     */


}
