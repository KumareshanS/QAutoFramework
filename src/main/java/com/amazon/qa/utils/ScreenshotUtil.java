package main.java.com.amazon.qa.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import test.java.com.amazon.qa.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil extends BaseTest {
    public static void captureScreenshot(WebDriver driver, String testName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String dest = "screenshots/" + testName + "_" + timestamp + ".png";
        try {
            FileUtils.copyFile(source, new File(dest));
            log.info("Screenshot taken: " + dest);
        } catch (IOException e) {
            log.info("Exception while taking screenshot " + e.getMessage());
        }
    }
}
