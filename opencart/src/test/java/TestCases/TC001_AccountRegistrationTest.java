package TestCases;

import org.testng.annotations.Test;

import PageObject.AccountRegistrationPage;
import PageObject.Homepage;

public class TC001_AccountRegistrationTest extends BaseClass {

    @Test
    public void verify_account_registration() {
        Homepage hp = new Homepage(driver);
        hp.clickMyAccount();
        hp.clickRegister();

        AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

        regpage.setFirstname("John");
        regpage.setLastname("David");
        regpage.setEmail("john.david" + System.currentTimeMillis() + "@gmail.com"); // Dynamically generates unique email
        regpage.setTelephone("9876543210");
        regpage.setPassword("Test@1234");
        regpage.setPasswordConfirm("Test@1234");

        regpage.setPrivacyPolicy();
        regpage.clickContinue();
    }
}