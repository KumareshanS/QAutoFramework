package test.java.com.amazon.qa.tests;

import main.java.com.amazon.qa.pageActions.HomePageActions;
import main.java.com.amazon.qa.pageObjects.HomePageObjects;
import main.java.com.amazon.qa.utils.ElementFetch;
import main.java.com.amazon.qa.utils.ErrorMessages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.com.amazon.qa.BaseTest;

public class HomePageTests extends BaseTest {
    private HomePageActions homePageActions;

    @BeforeMethod
    public void setup() {
        homePageActions = new HomePageActions(new ElementFetch());
    }

    @Test(priority = 1)
    public void verifyHomePageURL() {
        Assert.assertEquals(driver.getCurrentUrl(), configReader.getProperty("baseUrl"),
                String.format(ErrorMessages.URL_MISMATCH, driver.getTitle(), configReader.getProperty("baseUrl")));
    }

    @Test(priority = 2)
    public void verifyHomePageTitle() {
        Assert.assertEquals(driver.getTitle(), HomePageObjects.EXPECTED_TITLE,
                String.format(ErrorMessages.TITLE_MISMATCH, driver.getTitle(), HomePageObjects.EXPECTED_TITLE));
    }

    @Test(priority = 3)
    public void verifyClickingOnCompanyLogoLandsInHomePage() {
        homePageActions.clickCompanyLogo();
        Assert.assertTrue(homePageActions.isTodaysDealsPresent());
    }
}
