package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineStepDefinition {
    @Given("There are {int} cucumbers")
    public void there_are_cucumbers(Integer int1) {
        System.out.println("There are "+int1+" cucumbers");
    }

    @When("I eat {int} cucumbers")
    public void i_eat_cucumbers(Integer int1) {
        System.out.println("I ate "+int1+" cucumbers");
    }

    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer int1) {
        System.out.println("I should have "+int1+" cucumbers left");
    }
}
