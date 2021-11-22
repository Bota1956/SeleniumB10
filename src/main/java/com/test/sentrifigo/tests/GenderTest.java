package com.test.sentrifigo.tests;

import com.test.sentrifigo.TestBase;
import com.test.sentrifigo.pages.GenderPage;
import com.test.sentrifigo.pages.HomePage;
import com.test.sentrifigo.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenderTest extends TestBase {
    LogInPage logInPage;
    HomePage homePage;
    GenderPage genderPage;

    @BeforeMethod
    public void initializePages(){
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);
        genderPage = new GenderPage(driver);
    }

    @Test
    public void validateGenderError(){
        logInPage.login("EM01","sentrifugo");
        homePage.clickGender();
        genderPage.clickAddButton();
        genderPage.sendGenderInfo("F","Female");
        genderPage.clickSaveButton();
        String genderCodeColor=genderPage.getGenderCodeColor();
        String genderColor=genderPage.getGenderColor();
        Assert.assertEquals(genderCodeColor, "rgba(255, 0, 0, 1)");
        Assert.assertEquals(genderColor, "rgba(255, 0, 0, 1)");
    }
//        System.out.println(genderColor);
//        System.out.println(genderCodeColor);


}
