package com.sk.tests;

import com.sk.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void verifyTitle(){
        Assert.assertEquals(homePage.getHomePageTitle(), Constants.HOME_PAGE_TITLE);
    }

}
