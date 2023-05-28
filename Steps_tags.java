package Step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_tags {
	@Given("Launching of browser")
	public void launching_of_browser() {
	    System.out.println("launched");
	}

	@When("enter  url")
	public void enter_url() {
	   System.out.println("entered url");
	}

	@When("enters email  and password")
	public void enters_email_and_password() {
	   System.out.println("entered cred");
	}

	@When("clicks on Login")
	public void clicks_on_login() {
	   System.out.println("LOGGED IN");
	}

	@Given("user enters Dashbd page")
	public void user_enters_dashbd_page() {
		System.out.println("home page");  
	}

	@When("user clicks on Catalog")
	public void user_clicks_on_catalog (){
		System.out.println("cliked catalog");
	}

	@When("User enters catagory name")
	public void user_enters_catagory_name() {
		System.out.println("catogery name");
	}

	@When("User enters published search field")
	public void user_enters_published_search_field() {
		System.out.println("published "); 
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button1() { 
		System.out.println("srch btn");
	}

@Given("user enters dashboardpage")
public void user_enters_dashboardpage() {
System.out.println("dashboardpage");
}
   
@When("User clicks on catlog")
public void user_clicks_on_catlog() {
	System.out.println("catalog");   
}

@When("User clicks on manufacturers")
public void user_clicks_on_manufacturers() {
	System.out.println("manufactureres");
}

@When("User enters manufacteres name")
public void user_enters_manufacteres_name() {
	System.out.println("manufacteres name");
}

@When("User enters published field")
public void user_enters_published_field() {
	System.out.println("published");
}

@Given("user enters dashboard pg")
public void user_enters_dashboard_pg() {
	System.out.println("dashbd");
}

@When("User clicks on customer")
public void user_clicks_on_customer() {
	System.out.println("customer");
}

@When("User clicks on GDPR requests log")
public void user_clicks_on_gdpr_requests_log() {
	System.out.println("rquests");
}

@When("User enters email and request type")
public void user_enters_email_and_request_type() {
	System.out.println("credential");
}
@Then("click on search btn")
public void click_on_search_btn() {
	System.out.println("search btn");   
}




}
		