#  @RunSolo
Feature: Language Selector


#  @RunSolo
  Scenario: Select English Language
    Given user goes to B2B site
    And user logs in
    Then user clicks the language selector
    Then user chooses English
    Then user sees the dashboard
    Then user clicks the profile icon
    Then user logs out


#  @RunSolo
  Scenario: Select German Language
    Given user goes to B2B site
    And user logs in
    Then user clicks the language selector
    Then user chooses German
    Then user sees the dashboard
    Then user clicks the profile icon
    Then user logs out