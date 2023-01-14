package com.sk.tests;

import com.sk.drivers.DriverFactory;
import com.sk.pages.HomePage;
import com.sk.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class BaseTest {
    DriverFactory driverFactory;
    WebDriver driver;
    Properties prop;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeTest
    public void setup(){
        driverFactory = new DriverFactory();
        prop = driverFactory.init_prop(prop);
        driver = driverFactory.init_driver(prop);
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
