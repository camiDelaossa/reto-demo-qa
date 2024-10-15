Feature: Student Registration

  Background:
    Given I am on the DemoQA homepage https://demoqa.com/

  Scenario: Successful student registration
    And I select the practice form option under the forms section
    When I fill in the form fields correctly
    And I click the submit button
    Then I should verify that the entered data has been submitted correctly