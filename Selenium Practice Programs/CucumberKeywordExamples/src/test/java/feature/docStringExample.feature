Feature: As ecommerce store owner,
  I want customers are able to contact me in case of any query

  Background:
    Given I am on home page
    And I follow "Contact Us"

  Scenario: Fill in contact us form
    When I fill "email address" with "abc@gmail.com"
    Then I should receive email with  :
      """
      Dear Sir,

      Its been more than a week I didnt receive mz order.

      Sincerely,
      The Management
      """