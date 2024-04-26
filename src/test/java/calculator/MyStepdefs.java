package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    private Calculator calculator;
    private int firstNumber;
    private int secondNumber;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^I have entered the first integer as (\\d+)$")
    public void iHaveEnteredTheFirstIntegerAs(int first) {
        this.firstNumber = first;
    }

    @And("^I have entered the second integer as (\\d+)$")
    public void iHaveEnteredTheSecondIntegerAs(int second) {
        this.secondNumber = second;
    }

    @When("^I press the multiply button$")
    public void iPressTheMultiplyButton() {
        this.result = calculator.multiply(firstNumber, secondNumber);
    }

    @When("^I press the divide button$")
    public void iPressTheDivideButton() {
        if (secondNumber != 0) {
            this.result = calculator.divide(firstNumber, secondNumber);
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    @When("^I press the exponentiate button$")
    public void iPressTheExponentiateButton() {
        // Exponentiate using Calculator (repeated multiplication)
        this.result = calculator.exponentiate(firstNumber, secondNumber);
    }

    @Then("^the result should be (\\d+)$")
    public void theResultShouldBe(int expectedResult) {
        assert this.result == expectedResult;
    }
}
