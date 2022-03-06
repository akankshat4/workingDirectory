Feature: Login action
  Scenario: Free CRM log in test scenario
    Given User is available on the Login page
    When Title of the login page is Free CRM
    When User clicks on login link
    When User enters userName
    When User enters password
    When User clicks on login button
    Then User should be logged in to the free CRM home page
    And Terminate the browser instance