package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DocStringExampleStepDefinition {

    @Given("I am on home page")
    public void i_am_on_home_page() {
        System.out.println("I am on home pages");
    }

    @Given("I follow {string}")
    public void i_follow(String string) {
        System.out.println("I follow : "+string);
    }

    @When("I fill {string} with {string}")
    public void i_fill_with(String string, String string2) {
        System.out.println("I fill '"+string+"' with '"+string2+"'");
    }

    @Then("I should receive email with  :")
    public void i_should_receive_email_with(String docString) {
        System.out.println("I should receive email with : "+docString);
    }
}
