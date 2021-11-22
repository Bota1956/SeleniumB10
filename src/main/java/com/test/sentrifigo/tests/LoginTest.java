package com.test.sentrifigo.tests;

import com.test.sentrifigo.TestBase;
import com.test.sentrifigo.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void validateSuperAdmin(){
        LogInPage loginPage= new LogInPage(driver);
        loginPage.login("EM01", "sentrifugo");
        Assert.assertEquals(driver.getTitle(), "Sentrifugo - Open Source HRMS");
    }
    @Test
    public void validateSuperManagement(){
        LogInPage loginPage= new LogInPage(driver);
        loginPage.login("EM02", "sentrifugo");
        Assert.assertEquals(driver.getTitle(), "Sentrifugo - Open Source HRMS");
    }

    @Test
    public void validateSuperManager(){
        LogInPage loginPage= new LogInPage(driver);
        loginPage.login("EM03", "sentrifugo");
        Assert.assertEquals(driver.getTitle(), "Sentrifugo - Open Source HRMS");
    }
}
