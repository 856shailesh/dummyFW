package com.sk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.xpath("//span[normalize-space()='Account & Lists']");
    private By usernameField = By.id("ap_email");
    private By continueBtn = By.id("continue");
    private By passwordField = By.id("ap_password");
    private By signInBtn = By.id("signInSubmit");


    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void doLogin(String uName, String pwd) {
        driver.findElement(usernameField).sendKeys(uName);
        driver.findElement(continueBtn).click();
        driver.findElement(passwordField).sendKeys(pwd);
        driver.findElement(signInBtn).click();
        //eleUtil.doSendKeys(email, uName);
        //eleUtil.doClick(cont);
        //eleUtil.doSendKeys(pass, pwd);
        //eleUtil.doClick(signInBtn);
    }

}
