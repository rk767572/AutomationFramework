package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.opencart.base.BaseClass;

public class LoginPage extends BaseClass {
    private WebDriver driver;

    private By emailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By loginBtn = By.xpath("//input[@value='Login']");
    private By myAccountHeader = By.xpath("//h2[text()='My Account']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void doLogin(String email, String pwd) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }

    public boolean isMyAccountPageExists() {
        return driver.findElement(myAccountHeader).isDisplayed();
    }
}