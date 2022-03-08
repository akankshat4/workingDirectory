Feature: To test data tables as list of map
  Scenario: DT2 Datatable Example
    Given DT2 User is on home page
    When DT2 User navigates to log-in page
    And DT2 User enters credentials to login
      |userName |password|
      |testUser1|Test@123|
      |testUser2|Test@123|
    Then DT2 login success message displayed successfully