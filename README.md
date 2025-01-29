# Technical Assessment

## Overview
This project is a Java/Maven-based test automation suite that includes Web GUI and API test cases. The automation framework utilizes Selenium WebDriver for web testing and RestAssured for API testing. Additionally, Allure Reports are integrated for test reporting and analysis.

## Features
- Modular design following the **Page Object Model (POM)** pattern
- Web GUI test automation using **Selenium WebDriver**
- API test automation using **RestAssured**
- **Allure Reporting** for test execution results
- Automatic screenshots for Web UI tests
- API response body attachment in Allure Reports

## Technologies Used
- Java
- Maven
- Selenium WebDriver
- RestAssured
- TestNG
- Allure Reports

## Prerequisites
Before running the tests, ensure you have the following installed:
- **Java JDK 8+**
- **Maven**
- **Google Chrome** (for Web UI tests)
- **ChromeDriver** (compatible with your browser version)


## Test Cases
### Web GUI Test Automation
1. **Google Search Test**
   - Navigate to `https://www.google.com/ncr`
   - Search for "selenium webdriver"
   - Validate that the third result contains "What is Selenium WebDriver?"

2. **File Upload Test**
   - Navigate to `https://the-internet.herokuapp.com/`
   - Upload a file and verify success message

3. **Dynamic Loading Test**
   - Navigate to `https://the-internet.herokuapp.com/`
   - Click "Dynamic Loading > Example 2"
   - Start loading and verify that "Hello World!" appears

### API Test Automation
- Fetch a random cat fact from `https://alexwohlbruck.github.io/cat-facts/`
- Validate that the response text is not empty
- Attach API response body to Allure Reports

## Running Tests
### Execute All Tests
```
mvn clean test
```

### Generate Allure Report
```
mvn allure:serve
```

## Reporting
- **Allure Reports** provide detailed execution reports.
- Screenshots are attached for Web UI tests.


## Project Delivery
The project is packaged as a zip file and can be run in **IntelliJ IDEA** or any compatible Java IDE.

## Author
[Ahmed Ibrahim]
