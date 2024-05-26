package main.java.com.amazon.qa.pageActions;

import main.java.com.amazon.qa.pageObjects.HomePageObjects;
import main.java.com.amazon.qa.utils.ElementFetch;

public class HomePageActions {
    private ElementFetch elementFetch;

    public HomePageActions(ElementFetch elementFetch) {
        this.elementFetch = elementFetch;
    }

    public void clickCompanyLogo() {
        elementFetch.getWebElement("ID", HomePageObjects.COMPANY_LOGO).click();
    }

    public boolean isTodaysDealsPresent() {
        return elementFetch.getWebElement("ID", HomePageObjects.TODAYS_DEALS).isDisplayed();
    }

    public void clickSignIn() {
        elementFetch.getWebElement("XPATH", HomePageObjects.SIGN_IN_BUTTON).click();
    }
}
