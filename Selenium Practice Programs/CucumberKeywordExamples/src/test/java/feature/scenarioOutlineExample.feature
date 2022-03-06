Feature: To validate the scenario outline keyword
  Scenario Outline: To validate the calculator function
    Given There are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

    Examples:
    |start|eat|left|
    |12   |5  |7   |
    |20   |5  |15  |