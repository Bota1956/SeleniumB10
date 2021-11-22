package com.test.etsy.tests;

import com.test.etsy.TestBase;
import com.test.etsy.pages.EtsyHomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EtsyTest extends TestBase {
    @Parameters("item")
    @Test
    public void etsySearchTest(String item) {
        EtsyHomePage homePage = new EtsyHomePage(driver);
        homePage.searItem(item);
        Assert.assertTrue(homePage.validateTitle());
    }

    //homework :
    //change validateTitle method implementation that it will work with all the search values.
    //bc now it is working only with "java programming mug"

    @Test
    public void test() {
        EtsyHomePage homePage = new EtsyHomePage(driver);
        homePage.searItem("java programming mug");
        Assert.assertTrue(homePage.validateTitle());
    }
}