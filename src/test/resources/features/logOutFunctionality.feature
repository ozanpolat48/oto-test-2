@testing2
Feature: Function to successfully exit the application and go to the home page

  Background: Navigates to login page
    Given user able to navigates login page

  Scenario: User able to login with valid credentials
    Given  user logged in with username as "Employee3" and password as "Employee123"
    When user clicks on logout button
    Then user successfully logout

  Scenario: User able to login with valid credentials
    Given  user logged in with username as "Employee3" and password as "Employee123"
    When user clicks on logout button
    And user clicks navigate back button on browser
    Then user successfully logout

