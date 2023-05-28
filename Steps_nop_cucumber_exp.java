package Step_definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_nop_cucumber_exp {
public	static WebDriver driver;

@Given("Launch chrome browser")
public void launch_chrome_browser() throws InterruptedException {
	  
	}
	   

    

@When("User opens url {string}")
public void user_opens_url(String url) throws InterruptedException {
	Thread.sleep(2000);
	driver.get(url);   
}

@When("User enters email {string} and password {string}")
public void user_enters_email_and_password(String email, String password) {
	driver.findElement(By.id("Email")).clear();
	   driver.findElement(By.id("Email")).sendKeys(email);
	   driver.findElement(By.id("Password")).clear();
	   driver.findElement(By.id("Password")).sendKeys(password);  
}

@When("User clicks on Login")
public void user_clicks_on_login() {
	driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click() ;   
}

@When("User clicks logout application")
public void user_clicks_logout_application() {
	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();	
  
}

@Then("Close Browser")
public void close_browser() {
	driver.close();   
}





	   









}
