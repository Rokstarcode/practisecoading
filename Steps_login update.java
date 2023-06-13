package Step_definations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_login {
public	static WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver(option);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.manage().window().maximize();  
	}
	
	@When("users enters username and password")
	public void users_enters_username_and_password() throws InterruptedException {
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("entered credentials");
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
			}
	

	@When("logout the orange hrm application")
	public void logout_the_orange_hrm_application() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='oxd-userdropdown-tab']")));
		
	      driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();;//patient
	   
	    Thread.sleep(3000);

	   driver.findElement(By.linkText("Logout")).click();
	}
	@Then("close  browser")
	public void close_browser() {
	   driver.close();

	}
	


	
	

}
