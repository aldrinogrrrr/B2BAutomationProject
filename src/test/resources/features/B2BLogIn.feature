#@RunSolo
Feature: B2B Log In


#  @RunSolo
  Scenario: Open B2B website
    Given user goes to B2B site
    And user logs in
    Then user sees the dashboard
    Then user clicks the profile icon
    Then user logs out

#  @RunSolo
  Scenario: Forgot Password
    Given user goes to B2B site
    And user clicks the Forgot Password



