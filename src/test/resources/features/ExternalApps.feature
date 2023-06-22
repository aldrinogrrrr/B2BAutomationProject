#  @RunSolo
Feature: Third-party applications


#  @RunSolo
  Scenario: Go to Xenon App
    Given user goes to B2B site
    And user logs in
    Then user sees the dashboard

#  @RunSolo
  Scenario: Go to Webshop App
    Given user goes to B2B site
    And user logs in
    Then user sees the dashboard

#  @RunSolo
  Scenario: Go to Aski App
    Given user goes to B2B site
    And user logs in
    Then user sees the dashboard

  @RunSolo
  Scenario: Go to AGB Hyperlink
    Given user goes to B2B site
    And user logs in
    Then user sees the dashboard
    Then user clicks the AGB

#  @RunSolo
  Scenario: Go to Impressum Hyperlink
    Given user goes to B2B site
    And user logs in
    Then user sees the dashboard
    Then user clicks the Impressum

 #  @RunSolo
  Scenario: Go to Datenschutz Hyperlink
    Given user goes to B2B site
    And user logs in
    Then user sees the dashboard
    Then user clicks the Datenschutz