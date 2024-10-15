Feature: interaction with dialogs modals

  Background:
    Given I am on the DemoQA homepage https://demoqa.com/

  Scenario: Interacting with the small modal
    And I select the alerts, frame, and windows option from the elements section
    When I click the small modal button
    Then I should verify that the small modal is displayed
    And I close the small modal by clicking the close button

  Scenario: Interacting with the large modal
    And I select the alerts, frame, and windows option from the elements section
    When I click the large modal button
    Then I should verify that the large modal is displayed
    And I close the latge modal by clicking the close button