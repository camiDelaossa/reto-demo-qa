Feature:  Interaction with Checkboxes

  Background:
    Given I am on the DemoQA homepage https://demoqa.com/

  Scenario: Selecting and verifying checkboxes in DemoQA
    And I select the Checkbox option under the Elements section
    When I click the expand all button to display more options
    And I select the checkboxes
      | Notes         |
      | WorkSpace     |
      | Office        |
      | Word File.doc |
    Then I validate that the checkboxes has been selected correctly
      | Notes     |
      | WorkSpace |
      | Office    |
      | wordFile  |

