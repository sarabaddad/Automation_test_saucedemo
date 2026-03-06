# Automation_test_saucedemo

This project contains automated UI tests for the SauceDemo website using Selenium WebDriver and TestNG.

The tests simulate a real user scenario including logging in, adding products to the cart, and removing them.

Website under test: https://www.saucedemo.com/

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Microsoft Edge WebDriver

## Test Scenarios
The automation script performs the following actions:

1. Open the SauceDemo website
2. Login using valid credentials
3. Add all available products to the cart
4. Remove all products from the cart
5. Print confirmation messages in the console
6. Close the browser after the test is completed

## Test Credentials
Username: `standard_user`  
Password: `secret_sauce`

## Project Structure
- `@BeforeTest` → Opens the website and maximizes the browser
- `login()` → Performs login
- `AddAllItemsToCart()` → Adds all products to the cart
- `RemoveAllItemsFromCart()` → Removes all products and prints their names
- `@AfterTest` → Closes the browser

## Purpose
This project was created for practicing **automation testing using Selenium and TestNG** and demonstrating basic automated test scenarios for an e-commerce website.
