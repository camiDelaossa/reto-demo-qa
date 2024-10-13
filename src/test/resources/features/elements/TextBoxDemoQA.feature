Feature: Textbox Form Submission

  Background:
    Given I am on the DemoQA homepage https://demoqa.com/

  Scenario: Successful form submission in DemoQA
    And I select the Textbox option
    When I fill in the form fields with the required information
    And I click the Submit button
    Then I verify that the information displayed after submission matches exactly what was entered in the form
