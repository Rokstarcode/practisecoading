package Step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_NetSalary {
	public int Gross;
	public int Income;
	public int Professional;
	public int PF;
	public int t1;
	public int t2;
	
	
	
	@Given("User will launch application browser")
	public void user_will_launch_application_browser() {
		System.out.println("Browser launched");
		
	}

	@When("User enters netsalary calculator page")
	public void user_enters_netsalary_calculator_page() {
	   System.out.println("Netsalary calculator page");
	}

	@When("User enters {int}")
	public void user_enters(int Gross ) {
		this.Gross = Gross;
	    System.out.println("Gross data value ="+ Gross );
	}

@When("User enters {int} in the field")
public void user_enters_in_the_field(int PF) {
	 this.PF = PF;
	 System.out.println("PF value =" +PF );

}
	

	@When("User enters {int} and {int}")
	public void user_enters_and(int Income , int Professional ) {
	   this.Income  = Income;
	   this.Professional = Professional;
	   System.out.println("Income Tax value="+Income);
	   System.out.println("Professional tax value="+Professional);
	}

 @Then("Net salary of an employee is displayed")
 public void net_salary_of_an_employee_is_displayed() {
		Calculator cal=new Calculator();
	System.out.println("Gross="+Gross); 
	int netIncome =cal.s1(Gross, PF, Income, Professional);
		
	 /*int N2=cal.s1(N1, Income);
	 System.out.println(N2);
	 int N3=cal.s1(N2, Professional);
	 System.out.println(N3);*/
	 
	System.out.println("Net Salary="+netIncome);
}





}
