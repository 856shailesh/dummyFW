package com.sk.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    WebDriver driver;
    Properties prop;

    public WebDriver init_driver(Properties prop) {
        String browserName = prop.getProperty("browser");
        System.out.println("Running on browser : " + browserName);
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else
            System.out.println("Pass correct browsername");

        driver.get(prop.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }

    public Properties init_prop(Properties prop) {
        prop = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./src/test/resources/configs/config.property");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
}
