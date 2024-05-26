package main.java.com.amazon.qa.pageActions;

import main.java.com.amazon.qa.pageObjects.LoginPageObjects;
import main.java.com.amazon.qa.utils.ElementFetch;
import org.testng.Assert;
import test.java.com.amazon.qa.BaseTest;

public class LoginPageActions extends BaseTest {

    private ElementFetch elementFetch;

    public LoginPageActions(ElementFetch elementFetch) {
        this.elementFetch = elementFetch;
    }

    public void logInToAmazon() {
        String signIn = elementFetch.getWebElement("XPATH", LoginPageObjects.signInHeader).getText();
        Assert.assertTrue(signIn.contains("Sign in"), "Sign-In header did not match in login page");
        elementFetch.getWebElement("ID", LoginPageObjects.emailAddress).sendKeys(dataReader.getProperty("emailAddress"));
        elementFetch.getWebElement("XPATH", LoginPageObjects.continueButton).click();
        elementFetch.getWebElement("ID", LoginPageObjects.userPassword).sendKeys(dataReader.getProperty("userPassword"));
        elementFetch.getWebElement("ID", LoginPageObjects.signInButton).click();
    }

    public String fetchInvalidPasswordErrorMessage() {
        return elementFetch.getWebElement("XPATH", LoginPageObjects.incorrectPwdMsg).getText();
    }
}
