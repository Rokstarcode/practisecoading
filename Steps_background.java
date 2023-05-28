package Step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_background {
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	    System.out.println("browser launched");
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
		System.out.println("credential"); 
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		System.out.println("logged");
	}

	@Given("User search for DELL Laptop")
	public void user_search_for_dell_laptop() {
		System.out.println("search");
	}

	@When("Add the first laptop that appears in the search result to the basket")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
		System.out.println("basket");
	}

	@Then("User basket should display with added item")
	public void user_basket_should_display_with_added_item() {
		System.out.println("display");
	}

	@Given("User navigate for DELL Laptop")
	public void user_navigate_for_dell_laptop() {
		System.out.println("navigate");
	}

	@When("Add the laptop to the basket")
	public void add_the_laptop_to_the_basket() {
		System.out.println("ordered");
	}


}
