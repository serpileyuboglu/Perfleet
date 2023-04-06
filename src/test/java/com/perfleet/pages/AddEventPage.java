package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddEventPage {

    public AddEventPage() {


        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleetButton;
    @FindBy(xpath  ="//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement vehiclesButton;
    @FindBy(xpath = "//tbody[@class='grid-body']/tr[5]")
    public WebElement vehiclesTable;
    @FindBy(xpath = "//a[@title=\'Add an event to this record\']")
    public WebElement addEventButton;

    @FindBy(xpath = "//label[contains(@for, 'title')]")
    public WebElement title;

    @FindBy(xpath = "//label[contains(@for, 'ame')]")
    public WebElement organizerDisplayName;

    @FindBy(xpath = "//label[contains(@for, 'mail')]")
    public WebElement organizerEmail;

    @FindBy(xpath = "//label[contains(@for, 'start')]")
    public WebElement startDate;
    @FindBy(xpath = "//label[contains(@for, '_end')]")
    public WebElement endDate;

    @FindBy(xpath  ="//*[@id=\"grid-custom-entity-grid-1642258686\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]")
    public WebElement vehicles;
    

    }



