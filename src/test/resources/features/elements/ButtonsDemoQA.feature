Feature: Button Selection
  Background:
    Given I am on the DemoQA homepage https://demoqa.com/

  Scenario: Select and verify buttons in DemoQA
    And I select the Buttons option from the Elements section
    When I click on the buttons Double Click Me, Right Click Me, and Click Me
    Then I validate that the buttons have been successfully clicked