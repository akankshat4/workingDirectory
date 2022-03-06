Feature: To test data tables as list of list
  Scenario: Successful log in using valid credentials
    Given User is on home page
    When User navigates to log-in page
    And User enters credentials to login
    |testUser1|Test@123|
    |testUser2|Test@123|
    Then login success message displayed successfully
