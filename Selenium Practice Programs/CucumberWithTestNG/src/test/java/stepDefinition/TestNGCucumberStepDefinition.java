package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestNGCucumberStepDefinition {
    @Given("User is on home page")
    public void user_is_on_home_page() {
        System.out.println("TestNGCucumber feature : User is on home page");
    }
    @When("User selects first item")
    public void user_selects_first_item() {
        System.out.println("TestNGCucumber feature : User selects first item");
    }
    @When("Clicks on Add to cart button")
    public void clicks_on_add_to_cart_button() {
        System.out.println("TestNGCucumber feature : clicks on add to cart button");
    }
    @Then("Selected item should be added to the cart")
    public void selected_item_should_be_added_to_the_cart() {
        System.out.println("TestNGCucumber feature : item should be added to the cart");
    }
}
