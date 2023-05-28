package Step_definations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_Testdata {
	public static WebDriver driver;
	
	@Given("User is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver(option);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.manage().window().maximize();    
	}




@When("User enters Credentials to LogIn")
public void user_enters_credentials_to_log_in(DataTable usercredentials) {
	List<List<String>> data = usercredentials.cells();
	driver.findElement(By.id("Email")).clear();
	   driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
	   driver.findElement(By.id("Password")).clear();
	   driver.findElement(By.id("Password")).sendKeys(data.get(0).get(1));
	   driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click() ;
}

@When("User Navigate to LogIn Page")
public void user_navigate_to_log_in_page() {
	System.out.println("Logged in");
}

@Then("Message displayed Login Successfully")
public void message_displayed_login_successfully() {
	System.out.println("Login successful");
}

@When("User LogOut from the Application")
public void user_log_out_from_the_application() {
	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
}

@Then("Message displayed LogOut Successfully")
public void message_displayed_log_out_successfully() {
	System.out.println("Logout sucessful");
}




}
