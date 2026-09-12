package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

    public AccountRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement txtFirstname;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement txtLastname;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement txtTelephone;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement txtPasswordConfirm;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement chkdpolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btncontinue;

    // Action Methods
    public void setFirstname(String fname) {
        txtFirstname.sendKeys(fname);
    }

    public void setLastname(String lname) {
        txtLastname.sendKeys(lname);
    }

    public void setEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void setTelephone(String telephone) {
        txtTelephone.sendKeys(telephone);
    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void setPasswordConfirm(String pwd) {
        txtPasswordConfirm.sendKeys(pwd);
    }

    public void setPrivacyPolicy() {
        chkdpolicy.click();
    }

    public void clickContinue() {
        btncontinue.click();
    }
}