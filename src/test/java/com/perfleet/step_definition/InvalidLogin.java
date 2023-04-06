package com.perfleet.step_definition;

import com.perfleet.pages.PerfleetLoginPage;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class InvalidLogin {

    PerfleetLoginPage perfleetLoginPage = new PerfleetLoginPage();

//    @Given("User is on the  login page")
//    public void user_on_the_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("perfleet.url"));
//    }

    @When("the user enters invalid or {string} and {string}")
    public void the_user_enters_invalid_or_and(String userName, String passWord) {
        perfleetLoginPage.inputUsername.sendKeys(userName);
        perfleetLoginPage.inputPassword.sendKeys(passWord);

    }

    @When("User clicks Login Button")
    public void user_clicks_login_button() {
        perfleetLoginPage.loginButton.click();
    }

    @Then("warning {string} should be displayed")
    public void warning_should_be_displayed(String message) {
      Assert.assertEquals(perfleetLoginPage.warmingMessage.getText(),message);

    }

    @When("the user enters empty  {string} or {string}")
    public void theUserEntersEmptyOr(String username, String password) {

       perfleetLoginPage.login(username,password);
       BrowserUtils.waitFor(10);
    }

    @Then("error {string} should be displayed")
    public void errorShouldBeDisplayed(String string) {

        Assert.assertTrue(perfleetLoginPage.popUpMessage(string));
    }


    @When("User enters with valid {string} and {string} credentials")
    public void userEntersWithValidAndCredentials(String userName, String passWord) {
        perfleetLoginPage.login(userName,passWord);
    }

    @Then("User should see his {string} in the profile menu")
    public void userShouldSeeHisInTheProfileMenu(String username) {
        //Assert.assertFalse(perfleetLoginPage.shownUserName.getText(),false);
        Assert.assertEquals(perfleetLoginPage.shownUserName.getText(),username);

    }
}