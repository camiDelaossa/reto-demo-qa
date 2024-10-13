Feature: Selection of Radio Buttons

  Background:
    Given I am on the DemoQA homepage https://demoqa.com/

  Scenario: Select and verify a radio button in DemoQA
    And I select the Radio Buttons option from the Elements section
    When I click on the Yes radio button
    Then I validate that the Yes option is selected