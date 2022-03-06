Feature: Test background keyword of cucumber
  Background: User is logged-in
    Given I navigate to the log-in page
    When I submit username and password
    Then I should be logged in

  Scenario: Search the product and add the product to the user basket
    Given User search for lenovo laptop
    When Add first laptop from search results to the basket
    Then User basket should display the added item

  Scenario: Navigate to the product and add the same product to the user basket
    Given User navigate for Lenovo laptop
    When Add laptop to the user basket
    Then user basket should display the added item