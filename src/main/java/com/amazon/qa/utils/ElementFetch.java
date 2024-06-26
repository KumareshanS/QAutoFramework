package main.java.com.amazon.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.java.com.amazon.qa.BaseTest;

import java.util.List;

public class ElementFetch {
    public WebElement getWebElement(String identifierName, String identifierValue) {
        switch (identifierName) {
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElement(By.tagName(identifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            default:
                return null;

        }
    }

    public List<WebElement> getWebElements(String identifierName, String identifierValue) {
        switch (identifierName) {
            case "ID":
                return BaseTest.driver.findElements(By.id(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElements(By.tagName(identifierValue));
            case "CSS":
                return BaseTest.driver.findElements(By.cssSelector(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElements(By.xpath(identifierValue));
            default:
                return null;

        }
    }
}