@login
Feature: orangeHrm login
  Scenario:Valid login
    Given I am on login page
    When I enter correct username in the username field
    And  I enter correct password in the password field
    And I click on the login button
    Then I see the home page