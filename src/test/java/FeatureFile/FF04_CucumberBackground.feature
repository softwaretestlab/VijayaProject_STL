Feature:
    #background method will run first before executing any Scenario in the Feature
  Background:
    Given use is on homepage

  Scenario: Account link
    Given user clicks on account link from homepage
    Then User is navigated to Create an account screen

  Scenario: Account link-1
    Given user clicks on account link from homepage-1
    Then User is navigated to Create an account screen-1

