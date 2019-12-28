package com.mercurytours.pages;

import com.sampleFw.generic.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver=null;

    public DriverBase driverBase=null;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
        this.driverBase = new DriverBase(this.driver);

    }


    @CacheLookup
    @FindBy(xpath = "//input[@name='userName']")
    public WebElement input_userName;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    public WebElement input_password;



    public void navigateToHomePage(){

        driverBase.navigateUrl("http://newtours.demoaut.com");
    }


    public void userLogin(String username,String password){


        driverBase.enterTextInputbox(input_userName,"mercury");


        driverBase.enterTextInputbox(input_password,"mercury");
    }


}
