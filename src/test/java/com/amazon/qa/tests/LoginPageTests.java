package test.java.com.amazon.qa.tests;

import main.java.com.amazon.qa.pageActions.HomePageActions;
import main.java.com.amazon.qa.pageActions.LoginPageActions;
import main.java.com.amazon.qa.pageObjects.LoginPageObjects;
import main.java.com.amazon.qa.utils.ElementFetch;
import main.java.com.amazon.qa.utils.ErrorMessages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.com.amazon.qa.BaseTest;

public class LoginPageTests extends BaseTest {
    private LoginPageActions loginPageActions;
    private HomePageActions homePageActions;

    @BeforeMethod
    public void setup() {
        loginPageActions = new LoginPageActions(new ElementFetch());
        homePageActions = new HomePageActions(new ElementFetch());
    }

    @Test
    public void verifyInvalidPasswordLogin() {
        homePageActions.clickSignIn();
        loginPageActions.logInToAmazon();
        Assert.assertEquals(loginPageActions.fetchInvalidPasswordErrorMessage(), LoginPageObjects.expectedIncorrectPwdMsg,
                String.format(ErrorMessages.TEXT_MISMATCH, loginPageActions.fetchInvalidPasswordErrorMessage(), LoginPageObjects.expectedIncorrectPwdMsg));
    }
}
