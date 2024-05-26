# Amazon QA Framework

This framework is designed to perform automated testing on Amazon's website. It includes page objects, page actions, utility classes, and test classes.

## Prerequisites

- Java 8 or higher
- Maven
- ChromeDriver, GeckoDriver, SafariDriver or IEDriver
- ExtentReports

## Getting Started

1. Clone the repository
2. Run `mvn clean install` to build the project
3. Run `mvn test` to execute the tests

## Framework Architecture

The TestNG framework follows the Page Object Model (POM) design pattern. It consists of the following components:

- **Page Objects**: Represent the pages of the application. They contain the WebElements and their locators.
- **Page Actions**: Contain the methods to perform actions on the WebElements.
- **Utility Classes**: Contain utility methods for WebDriver, properties, and error messages.
- **Test Classes**: Contain the test methods.

## Directory Structure

- `src/main/java`: Contains the Java code.
    - `com.amazon.qa.pageObjects`: Contains the page objects.
    - `com.amazon.qa.pageActions`: Contains the page actions.
    - `com.amazon.qa.utils`: Contains the utility classes.
- `src/main/resources`: Contains the configuration and test data files.
- `src/test/java`: Contains the test classes.

## Configuration

The framework uses two configuration files:

- `config.properties`: Contains the browser and base URL.
- `testData.properties`: Contains the email and password.

## Test Execution

The tests are executed using TestNG. The test execution results are generated in the `reports` directory using ExtentReports.

## Screenshots

Screenshots are taken for failed tests and saved in the `screenshots` directory.

## Error Handling

The framework uses a custom retry analyzer to retry failed tests. It also uses a custom listener to take screenshots for failed tests.

## Future Enhancements

- Add more test cases.
- Add data-driven testing.
- Add cross-browser & cross-platform testing using selenium grid.
- Code inspection using SonarQube.
- Encryption of properties file.
- Add test recording functionality.
- Automation of CICD pipeline using Jenkins, Docker and Kubernetes.