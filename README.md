# UI Test: Placeholder Validation

This repository contains a Selenium test script to validate the UI elements on `https://www.saucedemo.com/v1/`.

## Prerequisites

- Java JDK 8 installed
- Maven installed
- WebDriver binaries for Chrome, Edge, and Firefox

## Test Cases

The script, `placeHolderValidation`, contains the following test cases:

1. **Validating username input field exists**: This test ensures the username input field is present on the page.
2. **Validating password input field exists**: This test ensures the password input field is present on the page.
3. **Validating login button exists**: This test checks if the login button is present.
4. **Validating placeholders are correct**: The test verifies that the placeholders for the username and password input fields display the correct text.
5. **Validating login button value**: This test checks if the value on the login button displays as "LOGIN".

Each test case initializes the specified browser, navigates to the URL, runs the test, and then closes the browser at the end.

## Maven Dependencies

The following Maven dependencies are included in this project:

1. **Selenium WebDriver**
   - **Group ID**: org.seleniumhq.selenium
   - **Artifact ID**: selenium-java
   - **Version**: 4.11.0
   - [Maven Repository Link](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)

2. **WebDriver Manager**
   - **Group ID**: io.github.bonigarcia
   - **Artifact ID**: webdrivermanager
   - **Version**: 5.4.1
   - [Maven Repository Link](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)

3. **TestNG Framework**
   - **Group ID**: org.testng
   - **Artifact ID**: testng
   - **Version**: 7.7.1
   - [Maven Repository Link](https://mvnrepository.com/artifact/org.testng/testng)

## Execution

To execute the tests, navigate to the root directory of the project and run:

```bash
mvn clean test
