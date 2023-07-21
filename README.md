# InsuranceTaskSelenium
Complete task using Java, Selenium WebDriver and Cucumber framework

Navigate to the "Request an Insurance Quote" page on our website, https://www.ssfcu.org/insurance/personal/request-a-quote

Assert the title ON the webpage (not driver.Title) using the variable, pageTitle

Fill in ONLY the first name field using the variable, firstName

Check "Auto" under Interest using the variable, interest
Click Submit
Assert that the First Name field does not have an error message

Assert the Last Name field error message using the variable, lastNameErrorMessage

Create a page object for the quote form page linked above that provides the functionality needed to complete this scenario using the variables provided.

Your finished script should compile and run successfully using the Chrome browser.
