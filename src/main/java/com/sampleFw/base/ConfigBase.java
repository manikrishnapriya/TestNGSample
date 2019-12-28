package com.sampleFw.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ConfigBase {


    // Read params from xml

    // First driver



    public WebDriver driver=null;


    @Parameters({"browser"})
    @BeforeMethod
    public void  initBrowser(String browser) {


        switch (browser) {
            case "chrome":
                driver=  chrome();
                break;

            case "firefox":
              driver =  firefox();
                break;

        }

    }

    public WebDriver chrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Automation_Setup\\selenium-hub-node-configs\\DRIVERS\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        return driver;
    }

    public WebDriver firefox(){
        System.setProperty("webdriver.gecko .driver","D:\\Automation_Setup\\selenium-hub-node-configs\\DRIVERS\\geckodriver.exe");


        WebDriver driver = new FirefoxDriver();



        return driver;
    }


    @AfterMethod
    public void closeBrowser(){
        driver.quit();

    }
}
