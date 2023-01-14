package com.sk.tests;


import com.sk.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @BeforeTest
    public void loginPageSetup(){
        loginPage = homePage.doSingIn();
    }
    @Test
    public void loginPageUrlTest() {
        Assert.assertEquals(loginPage.getLoginPageTitle(), Constants.LOGIN_PAGE_TITLE);
    }

    @Test
    public void enterCredentials() throws InterruptedException {
        loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
        Thread.sleep(1000);
    }

}
