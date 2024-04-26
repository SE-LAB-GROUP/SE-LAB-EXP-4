package calculator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I have entered the first integer as (\\d+)$")
    public void iHaveEnteredTheFirstIntegerAs(int arg0) {
    }

    @And("^I have entered the second integer as (\\d+)$")
    public void iHaveEnteredTheSecondIntegerAs(int arg0) {

    }

    @When("^I press the multiply button$")
    public void iPressTheMultiplyButton() {

    }

    @Then("^the result should be (\\d+)$")
    public void theResultShouldBe(int arg0) {
    }

    @When("^I press the divide button$")
    public void iPressTheDivideButton() {
    }

    @When("^I press the exponentiate button$")
    public void iPressTheExponentiateButton() {
    }
}
