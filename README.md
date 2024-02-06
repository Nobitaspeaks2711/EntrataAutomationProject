
# Project Title

A brief description of what this project does and who it's for

# TestNG Project README

## Project Overview
This project is a TestNG-based test automation framework for testing web applications. It includes sample test cases to demonstrate the testing of a web application using the Page Object Model (POM) design pattern.

## Project Structure
The project is structured as follows:

- **Base Package (`testng.Base`):** Contains the `baseClass` class, which is responsible for setting up the test environment, including browser initialization and configuration.

- **PomClasses Package (`testng.PomClasses`):** Contains classes representing various pages of the web application using the Page Object Model (POM) design pattern. In this project, `homePage` and `formFillUp` classes are included.

- **TestNG Package (`testng`):** Contains the test classes written using TestNG annotations. The `newTest` class includes test methods for interacting with the web application.

## Prerequisites
Ensure the following prerequisites are met before running the tests:

- Java Development Kit (JDK) is installed.
- TestNG library is included in the project dependencies.
- Web browser driver executable is available and configured.

## Test Execution
To execute the tests:

1. Clone or download the project repository.
2. Open the project in your preferred Java IDE.
3. Update the browser driver path in the `baseClass` if necessary.
4. Run the `newTest` class as a TestNG test.

## Test Descriptions

### ClickOnMarketing Test
- **Priority:** -2
- This test method navigates to the marketing section of the web application.
- Steps:
  1. Launch the browser.
  2. Click on the "Cookies" to acknowledge.
  3. Move to the leasing section.
  4. Click on the leasing option.

### FillForm Test
- **Priority:** -1
- This test method fills out a form on the web application.
- Steps:
  1. Launch the browser.
  2. Click on the "Cookies" to acknowledge.
  3. Move to the leasing section.
  4. Click on the leasing option.
  5. Click on "Learn More."
  6. Fill out the form.



