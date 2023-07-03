Feature: Insurance quote application

  @quote
  Scenario: Test main page of the application
    Given user navigates to the application
    When Assert the title ON the webpage
    And user enters the firstName 'Jhon'
    Then Check "Auto" under Interest
    And user click on Submit button
    Then Assert that the First Name field does not have an error message
    Then Assert the Last Name field error message using the variable, lastNameErrorMessage
