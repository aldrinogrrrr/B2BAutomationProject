#  @RunSolo
Feature: Company Selector


#  @RunSolo
  Scenario: User clicks the Company Selector
    Given user goes to B2B site
    And user logs in
    Then user clicks the Company Selector
    Then user validates the Company Selector


#  @RunSolo
  Scenario: User searches for a company
    Given user goes to B2B site
    And user logs in
    Then user clicks the Company Selector
    Then user searches for a company
    Then user clicks the result
    Then user sees the dashboard


#  @RunSolo
  Scenario: User onboards a company
    Given user goes to B2B site
    And user logs in
    Then user clicks the Company Selector
    Then user clicks the Company Onboarding button
    Then user validates the Company Onboarding Modal
    Then user onboards a company
    Then user sees the dashboard


#  @RunSolo
  Scenario: User onboards an existing company
    Given user goes to B2B site
    And user logs in
    Then user clicks the Company Selector
    Then user clicks the Company Onboarding button
    Then user validates the Company Onboarding Modal
    Then user onboards a company
    Then user sees the error message