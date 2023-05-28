package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks_3 {
	 @Before
	    public void setUp(){
	        System.out.println("Execution before every scenario");
	        
	    }
	    
	    @After
	    public void burnDown(){
	        System.out.println("Execution after every scenario");
	    }
	    
	    @Before("@CaseOne or @CaseTwo")
	    public void before(){
	        System.out.println("This will be executed before case one and two");
	    }
	    
	    @After("@CaseOne or @CaseTwo")
	    public void after(){
	        System.out.println("This will be executed after case one and two");
	    }
}
