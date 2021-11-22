package com.test.orangehrm.data;

import org.testng.annotations.DataProvider;

public class UserRoles {

    @DataProvider(name = "roles")
    public Object [][] getRoles(){
        return new Object[][]{
                {"Admin"}, //if you have one value , provide only one parameter in AdminSearTest method
                {"ESS"}
        };
    }
}
