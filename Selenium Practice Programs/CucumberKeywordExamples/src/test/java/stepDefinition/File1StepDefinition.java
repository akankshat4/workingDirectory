package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class File1StepDefinition {
    @Given("I navigate to the log-in page")
    public void i_navigate_to_the_log_in_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User navigates to the log in page");
    }
    @When("I submit username and password")
    public void i_submit_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User submits username and password");
    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should be logged in");
    }

    @Given("User search for lenovo laptop")
    public void user_search_for_lenovo_laptop() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User searches for lenovo laptop");
    }
    @When("Add first laptop from search results to the basket")
    public void add_first_laptop_from_search_results_to_the_basket() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("First laptop from the search result added to the user basket");
    }
    /*
    @Then("User basket should display the added item")
    public void user_basket_should_display_the_added_item() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User basket displays the added item");
    }*/

    @Given("User navigate for Lenovo laptop")
    public void user_navigate_for_lenovo_laptop() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User navigate for lenovo laptop");
    }
    @When("Add laptop to the user basket")
    public void add_laptop_to_the_user_basket() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Lenovo laptop added to the user baskets");
    }

    @Then("user basket should display the added item")
    public void user_basket_should_display_the_added_item() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User basket should display the added item");
    }

}
