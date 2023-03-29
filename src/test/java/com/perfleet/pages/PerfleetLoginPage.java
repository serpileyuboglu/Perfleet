package com.perfleet.pages;


import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PerfleetLoginPage {


    public PerfleetLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement inputPassword;


    @FindBy(xpath ="//button[text()='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='input-field-group']/..//div//div")
    public WebElement warmingMessage;



    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement shownUserName;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement logoutButton;



    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();

    }
    public boolean popUpMessage(String message) {
        boolean flag = false;
        if (inputUsername.getText().equals("")){
            if(inputUsername.getAttribute("validationMessage").equals(message)){
                flag = true;
            }
        }
        if(inputPassword.getText().equals("")){
            if(inputPassword.getAttribute("validationMessage").equals(message)){
                flag = true;
            }
        }
        return flag;
    }




//    public void loginWithConfig(){
//        inputUsername.sendKeys(ConfigurationReader.getProperty(per.username));
//        inputPassword.sendKeys(ConfigurationReader.getProperty(per.password));
//        loginButton.click();
//    }


}
