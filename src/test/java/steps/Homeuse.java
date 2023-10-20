package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homeuse {
	private WebDriver driver;
	
	String url="https://dsportalapp.herokuapp.com/";
	
	By button=By.xpath("//button[@class='btn']");
    By button1=By.xpath("//button[@class='btn']");
    By dropdown=By.xpath("//a[@class='nav-link dropdown-toggle']");
    By signin=By.xpath("//a[normalize-space()='Arrays']");
    By alert=By.xpath("//div[@role='alert']");
    
    
    
	@Given("The user opens DS-Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		 System.setProperty("webdriver.chrome.driver", "/Users/elahigill/Downloads/chromedriver-mac-arm64/chromedriver");
	        driver = new ChromeDriver();
	       
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(url);
			
			

			
	}

	@And("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		driver.findElement(button).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}

	@And("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		driver.navigate().back();
		//driver.close();
	}

	@When("The user clicks get started button")
	public void the_user_clicks_get_started_button() {
		driver.findElement(button1).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@And("The user clicks Data structure drop down")
	public void the_user_clicks_data_structure_drop_down() {
		driver.findElement(dropdown).click();
	}

	@And("The user selects any data structures item from dropdown without sign in")
	public void the_user_selects_any_data_structures_item_from_dropdown_without_sign_in() {
		driver.findElement(signin).click();
	}

	/*@And("The user clicks signin")
				public void the_user_clicks_signin() {
			   	driver.findElement(By.linkText("Sign in")).click();
	}		   
		/@Then("The user clicks Register")
		public void the_user_clicks_Register() {
			driver.findElement(By.linkText( "Register ")).click();
	
	}*/
	@Then("It should alert the user with a message You are not Logged in.")
	public void it_should_alert_the_user_with_a_message_you_are_not_logged_in() {
	    driver.findElement(alert);
	    
}
}

	