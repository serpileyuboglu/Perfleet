package com.perfleet.step_definition;


import com.perfleet.pages.PerfleetLoginPage;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PerfleetLogin {

  PerfleetLoginPage perfleetLoginPage=new PerfleetLoginPage();

    @Given("user is on the perfleet login page")
    public void user_is_on_the_perfleet_login_page() {

      Driver.getDriver().get(ConfigurationReader.getProperty("perfleet.url"));
    }
    @When("user enters driver username")
    public void user_enters_driver_username() {
        perfleetLoginPage.inputUsername.sendKeys("user1");

    }
    @When("user enters driver password")
    public void user_enters_driver_password() {
        perfleetLoginPage.inputPassword.sendKeys("UserUser123");

    }


    @When("user enters Sales Manager username")
    public void user_enters_sales_manager_username() {
        perfleetLoginPage.inputUsername.sendKeys("salesmanager101");

    }
    @When("user enters Sales Manager password")
    public void user_enters_sales_manager_password() {
        perfleetLoginPage.inputPassword.sendKeys("UserUser123");

    }


    @When("user enters Store Manage username")
    public void user_enters_store_manage_username() {
        perfleetLoginPage.inputUsername.sendKeys("storemanager51");

    }
    @When("user enters Store Manage password")
    public void user_enters_store_manage_password() {
        perfleetLoginPage.inputPassword.sendKeys("UserUser123");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        perfleetLoginPage.loginButton.click();

        BrowserUtils.verifyTitle("Dashboard");

    }



}
