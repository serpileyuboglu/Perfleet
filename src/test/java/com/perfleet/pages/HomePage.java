package com.perfleet.pages;

import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void loginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("perfleet.url"));

    }
}
