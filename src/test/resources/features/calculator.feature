@tag
Feature: Calculator

  Scenario: Multiply two integers
    Given I have entered the first integer as 6
    And I have entered the second integer as 2
    When I press the multiply button
    Then the result should be 12

  Scenario: Divide two integers
    Given I have entered the first integer as 6
    And I have entered the second integer as 2
    When I press the divide button
    Then the result should be 3

  Scenario: Raise one integer to the power of another
    Given I have entered the first integer as 6
    And I have entered the second integer as 2
    When I press the exponentiate button
    Then the result should be 36

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5  	|
      | 2     | 2      | 4	    |