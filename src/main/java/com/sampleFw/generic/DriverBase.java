package com.sampleFw.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverBase {

    public WebDriver driver=null;

    public DriverBase(WebDriver driver){
        this.driver=driver;
    }

    public void navigateUrl(String url){
        try{

            this.driver.get(url);
        }catch (Exception e){
         e.printStackTrace();
        }
    }

    public void enterTextInputbox(WebElement element,String value){

        try{
            element.sendKeys(value);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void click(WebElement element){
        try{
            element.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
