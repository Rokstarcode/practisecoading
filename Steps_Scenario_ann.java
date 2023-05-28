package Step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Scenario_ann {

@Given("User is on dashboard page")
public void user_is_on_dashboard_page() {
    System.out.println("on dashboard page");
}

@When("User will Navigate to LogIn Page")
public void user_will_navigate_to_log_in_page() {
    System.out.println("logged in"); 
}

@When("User will enter Credentials to LogIn")
public void user_will_enter_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) {
    System.out.println("entered credentials");
}

@When("User will LogOut from the Application")
public void user_will_log_out_from_the_application() {
    System.out.println("logout from application");
}

@Then("Message will be displayed LogOut Successfully")
public void message_will_be_displayed_log_out_successfully() {
    System.out.println("logged out");
}



}
