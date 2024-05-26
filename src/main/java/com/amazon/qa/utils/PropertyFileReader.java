package main.java.com.amazon.qa.utils;

import test.java.com.amazon.qa.BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;

public class PropertyFileReader extends BaseTest {
    private static Properties properties = new Properties();
    private String filePath;

    public PropertyFileReader(String filePath) {
        this.filePath = filePath;
        loadProperties();
    }

    private void loadProperties() {
        try (InputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
        } catch (FileNotFoundException e) {
            log.error("Config file not found: " + filePath, e);
        } catch (IOException e) {
            log.error("Error loading config file: " + filePath, e);
        }
    }

    public String getProperty(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            log.error("Property not found: " + key);
        } else if (key.startsWith("username") || key.startsWith("password")) {
            value = maskString(value);
        }
        return value;
    }

    private String maskString(String value) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            sb.append('*');
        }
        return sb.toString();
    }
}