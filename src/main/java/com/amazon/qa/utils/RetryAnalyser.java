package main.java.com.amazon.qa.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import test.java.com.amazon.qa.BaseTest;

public class RetryAnalyser extends BaseTest implements IRetryAnalyzer {
    int retryCount = Integer.parseInt(configReader.getProperty("retryCount"));
    int count = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        while (count < retryCount) {
            count++;
            return true;
        }
        return false;
    }
}
