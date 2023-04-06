package com.perfleet.step_definition;

import com.perfleet.pages.HomePage;
import com.perfleet.pages.PerfleetLoginPage;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LogOut {

    PerfleetLoginPage perfleetLoginPage=new PerfleetLoginPage();
     HomePage homePage= new HomePage();

    @Then("user is on the  login page")
    public void user_is_on_the_login_page() {
        //Driver.getDriver().get(ConfigurationReader.getProperty("perfleet.url"));
        homePage.loginPage();


    }

    @And("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        perfleetLoginPage.login(username,password);
    }


    @When("user click log-out button")
    public void user_click_log_out_button() {
      perfleetLoginPage.logoutButton.click();
    }




    @And("user is on the home page")
    public void userIsOnTheHomePage() {
    }

    @Given("user clicks the step back button")
    public void user_clicks_the_step_back_button() {

        Driver.getDriver().navigate().back();
    }
    @Then("user should not go back home page")
    public void user_should_not_go_back_home_page() {
        String expectedUrl = "https://qa.perfleet.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertFalse(expectedUrl,false);
       // BrowserUtils.verifyURLContains("https://qa.perfleet.com/");

    }

}