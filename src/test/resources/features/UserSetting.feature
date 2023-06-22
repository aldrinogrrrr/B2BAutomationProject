#  @RunSolo
Feature: B2B User Setting


#  @RunSolo
  Scenario: Go to User Setting
    Given user goes to B2B site
    And user logs in
    Then user clicks the profile icon
    Then user selects User Setting
    Then validate the texts and buttons
    Then user exits


#  @RunSolo
  Scenario: User modifies information
    Given user goes to B2B site
    And user logs in
    Then user clicks the profile icon
    Then user selects User Setting
    Then user clicks the edit button
    Then user fills in the fields
    Then user clicks the save button
    Then user exits


