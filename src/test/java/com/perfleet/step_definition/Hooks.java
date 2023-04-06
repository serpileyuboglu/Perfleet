package com.perfleet.step_definition;


import com.perfleet.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setUp(){
        System.out.println();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();

    }
    @After
    public void tearDown(){

        Driver.closeDriver();
    }

}
