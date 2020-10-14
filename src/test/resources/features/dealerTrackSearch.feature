Feature: Do a search in google

  As a user
  I want to be able to search in google through automation
  So I can know the automation works

  Scenario: Search dealertrack in google
    Given the user navigates to google.com.br
    When the user searches for Dealertrack Brasil
    And the user clicks on the first link result
    Then the navigation displays the page www.dealertrack.com.br