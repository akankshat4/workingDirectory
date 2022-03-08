package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableAsListOfMapStepDefinition {
    @Given("DT2 User is on home page")
    public void dt2_user_is_on_home_page() {
        System.out.println("Data table example as list of map step1");
    }
    @When("DT2 User navigates to log-in page")
    public void dt2_user_navigates_to_log_in_page() {
        System.out.println("Data table example as list of map step2");
    }
    @When("DT2 User enters credentials to login")
    public void dt2_user_enters_credentials_to_login(DataTable dataTable) {
        List<Map<String, String>> dataRecords = dataTable.asMaps();
        for(Map<String, String> data:dataRecords) {
            System.out.println("**************************************");
            System.out.println(data.get("userName"));
            System.out.println(data.get("password"));
        }

    }
    @Then("DT2 login success message displayed successfully")
    public void dt2_login_success_message_displayed_successfully() {
        System.out.println("Data table example as list of map step4");
    }

}
