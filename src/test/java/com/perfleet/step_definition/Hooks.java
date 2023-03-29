package com.perfleet.step_definition;


import com.perfleet.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before(value = "@smoke")
    public void init(){
        System.out.println("This is running before every step definitions");
    }

    @After
    public void tearDown(){
            Driver.closeDriver();
    }

}
