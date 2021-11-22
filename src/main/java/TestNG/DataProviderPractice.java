package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {




//    @DataProvider(name="NameTest")
//    public Object[][] getData(){
//
//        return new Object[][]{
//                {"David","Hunt","David Hunt"},
//                {"Priyanka","Garla","Priyanka Garla"},
//                {"Kushal","Pural","Kushal Pural"},
//                {"Ajeesh", "Damo", "Ajeesh Damo"}
//
//        };
//    }

    // Object obj= new Object[2][3]; --> Garla [1] [1]
    @Test(dataProvider = "NameTest", dataProviderClass = Data.class)
    public void test(String name, String lastName, String expected){
        String fname="David";
        String lname="Hunt";
        String fullName=fname+" "+lname;
        Assert.assertEquals(fullName,"David Hunt");
    }
}


