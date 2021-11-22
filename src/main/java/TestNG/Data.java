package TestNG;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name="NameTest")
    public Object[][] getData(){ //has to be Object not even String object

        return new Object[][]{  // first [] how may time u need to run your @test u don't need to provide anything

                {"David","Hunt","David Hunt"},
                {"Priyanka","Garla","Priyanka Garla"},
                {"Kushal","Pural","Kushal Pural"},
                {"Ajeesh", "Damo", "Ajeesh Damo"}

        };
    }
}
