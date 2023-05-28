package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class hook_1 {
	

	
		
		@Before(order=1)
	    public void beforeScenario(){
	        System.out.println("Start the browser and Clear the cookies");
	    }	
		@Before(order=0)
	    public void beforeScenarioStart(){
	        System.out.println("-----------------Start of Scenario-----------------");
	    }	
		@BeforeStep
		public void beforeStep() {
			 System.out.println("-----------------Start of Step-----------------");
		}
		
		@AfterStep
		public void afterStep() { 
			System.out.println("-----------------End of Step-----------------");
			
		}
		
		
		@After(order=0)
	    public void afterScenarioFinish(){
	        System.out.println("-----------------End of Scenario-----------------");
	    }	
		@After(order=1)
	    public void afterScenario(){
	        System.out.println("Log out the user and close the browser");
	    }	

	}

