package com.sk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By SignIn = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");

    public String getHomePageTitle() {
        return driver.getTitle();
    }
    public LoginPage doSingIn(){
        driver.findElement(SignIn).click();
        return new LoginPage(driver);
    }
}
