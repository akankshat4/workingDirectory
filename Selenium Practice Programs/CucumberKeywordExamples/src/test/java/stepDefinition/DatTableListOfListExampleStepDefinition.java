package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DatTableListOfListExampleStepDefinition {
    @Given("User is on home page")
    public void user_is_on_home_page() {
        System.out.println("User is on home page");
    }

    @When("User navigates to log-in page")
    public void user_navigates_to_log_in_page() {
        System.out.println("User navigates to the log-in page");
    }

    @When("User enters credentials to login")
    public void user_enters_credentials_to_login(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        for (List<String> columns : data){
            System.out.println("The user name is "+columns.get(0)+" and the password is "+columns.get(1));
        }
    }

    @Then("login success message displayed successfully")
    public void login_success_message_displayed_successfully() {
        System.out.println("User logged in successfully");
    }
}
