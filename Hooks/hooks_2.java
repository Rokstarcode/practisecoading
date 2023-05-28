package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks_2 {
	 @Before
	    public void setUp(){
	        System.out.println("Execution before every scenario");
	        
	    }
	    
	    @After
	    public void burnDown(){
	        System.out.println("Execution after every scenario");
	    }
	    
	    @Before("@CaseOne")
	    public void beforeOne(){
	        System.out.println("This will be executed before case one");
	    }
	    
	    @After("@CaseOne")
	    public void afterOne(){
	        System.out.println("This will be executed after case one");
	    }
	    
	    @Before("@CaseTwo")
	    public void beforeTwo(){
	        System.out.println("This will be executed before case two");
	    }
	   /* @After("@CaseTwo")
	    public void afterTwo(){
	        System.out.println("This will be executed after case two");
	    }*/
	}

