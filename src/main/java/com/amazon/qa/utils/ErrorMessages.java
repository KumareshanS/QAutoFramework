package main.java.com.amazon.qa.utils;

public interface ErrorMessages {
    String TITLE_MISMATCH = "The actual title: %s didn't match the expected title: %s";
    String URL_MISMATCH = "The actual URL: %s didn't match the expected URL: %s";
    String TEXT_MISMATCH = "The actual text: %s didn't match the expected text: %s";
    String ATTRIBUTE_MISMATCH = "The actual attribute value: %s didn't match the expected attribute value: %s";
    String ELEMENT_COUNT_MISMATCH = "The actual count: %s didn't match the expected count: %s";
}
