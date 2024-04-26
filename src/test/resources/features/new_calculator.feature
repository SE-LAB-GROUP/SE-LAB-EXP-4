@tag
Feature: Calculator

  Scenario Outline: do operations on 2 numbers
    Given Two input values, <first> and <second> and with the operator <opt>
    When I calculate the expression
    Then I expect the result <result>

    Examples:
      | first | second | opt | result |
      | 6     | 2      | *   | 12     |
      | 6     | 2      | /   | 3      |
      | 6     | 2      | ^   | 36     |