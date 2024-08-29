Feature: Login functionality

Scenario: Successful login with valid credentials
    Given User is on the Login page
    When User enters valid username and password
    And User clicks on login button
    Then User is redirected to the home page

Scenario: Unsuccessful login with invalid credentials
    Given User is on the Login page
    When User enters invalid username and password
    And User clicks on login button
    Then User sees an error message
