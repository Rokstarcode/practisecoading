package Step_definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_nop_reg_exp {
	
	public static WebDriver driver;
	
	@Given("^Launch browser$")
	public void launch_browser() throws InterruptedException {
	   ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver(option);
		//driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();     
	}

	@When("^opens url \"([^\"]*)\"$")
	public void opens_url(String url) throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url);     
	}

	@When("^enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_email_and_password(String email, String password) {
		driver.findElement(By.id("Email")).clear();
		   driver.findElement(By.id("Email")).sendKeys(email);
		   driver.findElement(By.id("Password")).clear();
		   driver.findElement(By.id("Password")).sendKeys(password); 
	}

	@When("^click on Login$")
	public void click_on_login() {
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click() ;      
	}

	@When("^clicks logout application$")
	public void clicks_logout_application() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click(); 
	}

	@Then("^close the Browser$")
	public void close_the_browser() {
		driver.close();   
	}

}