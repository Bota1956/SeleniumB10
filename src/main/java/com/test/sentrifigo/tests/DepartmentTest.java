package com.test.sentrifigo.tests;

import com.test.sentrifigo.TestBase;
import com.test.sentrifigo.pages.DepartmentPage;
import com.test.sentrifigo.pages.HomePage;
import com.test.sentrifigo.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DepartmentTest extends TestBase {
    DepartmentPage departmentPage;
    HomePage homePage;
    LogInPage loginPage;

    @BeforeMethod
    public void initializePages(){
        departmentPage = new DepartmentPage(driver);
        homePage = new HomePage(driver);
        loginPage = new LogInPage(driver);

    }

    @Test
    public void validateNewDepartment() throws InterruptedException {

        loginPage.login("EM01","sentrifugo");
        homePage.clickDepartments();
        departmentPage.clickAddButton();
        departmentPage.sendDepartmentInfo("Finance","1234");
        departmentPage.clickSubmit();
        Thread.sleep(500);
        String actualMessage= departmentPage.getSuccessMessage();
        Assert.assertEquals(actualMessage,"Department added successfully.");

    }
}
