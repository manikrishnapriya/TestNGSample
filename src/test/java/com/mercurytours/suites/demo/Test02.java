package com.mercurytours.suites.demo;

import com.mercurytours.pages.HomePage;
import com.sampleFw.base.ConfigBase;
import com.sampleFw.generic.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test02 extends ConfigBase {

    @Test
    public void setup(){
        HomePage homePage = new HomePage(driver);

        homePage.navigateToHomePage();

        homePage.userLogin("sdfadsgadsfg","dgadfgfd");
    }


}
