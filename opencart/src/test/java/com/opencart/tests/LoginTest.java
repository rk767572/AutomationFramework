package com.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.opencart.base.BaseClass;
import com.opencart.pages.LoginPage;

public class LoginTest extends BaseClass {

    // Yeh default constructor add karein
    public LoginTest() {
        super();
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin(prop.getProperty("email"), prop.getProperty("password"));
        boolean flag = loginPage.isMyAccountPageExists();
        Assert.assertTrue(flag, "Login failed or My Account page not found");
    }
}