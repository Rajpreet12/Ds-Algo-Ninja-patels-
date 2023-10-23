package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signin {
	public WebDriver driver;
    String URL = "https://dsportalapp.herokuapp.com/";
	
	By getstartBtn = By.xpath("//button[@class=\"btn\"]");
	By signinBtn = By.linkText("Sign in");
	By usrName = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[2]");
	By pwd = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[3]");
	By login = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[4]");
	By qGetstrBtn = By.xpath("//div[@class=\"row row-cols-1 row-cols-md-3 g-4\"]/div[5]/div/div/a");
	By signOutBtn = By.xpath("//a[text()=\"Sign out\"]");
	By lgdOutMsg = By.xpath("//div[@class=\"alert alert-primary\"]");
	@Given("user navigates to  sign-in page")
	public void user_navigates_to_sign_in_page() {
	    
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace\\DSAlgo_ninjapetals\\src\\test\\resources\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(URL);
			driver.findElement(getstartBtn).click();
			driver.findElement(signinBtn).click();
	}

	@When("user dont enter any credentials and click on login button")
	public void user_dont_enter_any_credentials_and_click_on_login_button() {
		driver.findElement(usrName).sendKeys("");
	    driver.findElement(pwd).sendKeys("");
	    driver.findElement(login).click();
	}

	@Then("It should display an error {string} below username field")
	public void it_should_display_an_error_below_username_field(String error1) {
		System.out.println(">> Message displays "+error1);
		driver.close();
	}

	@When("user enters username and keep password field empty and click on login button")
	public void user_enters_username_and_keep_password_field_empty_and_click_on_login_button() {
		driver.findElement(usrName).sendKeys("sangeetha");
		driver.findElement(pwd).sendKeys("");
		driver.findElement(login).click();
	}

	@Then("It should display an error {string} below pwd field")
	public void it_should_display_an_error_below_pwd_field(String error2) {
		System.out.println(">> Message displays "+error2);
		driver.close();
	}

	@When("user enters invalid username and password click on login button")
	public void user_enters_invalid_username_and_password_click_on_login_button() {
		driver.findElement(usrName).sendKeys("wterryer");
		driver.findElement(pwd).sendKeys("sgdfj");
		driver.findElement(login).click();
	}

	
	@When("user enters invalid username and valid password and clicks on login button")
	public void user_enters_invalid_username_and_valid_password_and_clicks_on_login_button() {
		driver.findElement(usrName).sendKeys("weterytry");
		driver.findElement(pwd).sendKeys("S@ibaba@123");
		driver.findElement(login).click();
	}

	@When("user enters valid username and invalid password and clicks on login button")
	public void user_enters_valid_username_and_invalid_password_and_clicks_on_login_button() {
		driver.findElement(usrName).sendKeys("sangeetha");
		driver.findElement(pwd).sendKeys("dummy");
		driver.findElement(login).click();
	}
	@Then("It should display an error {string} message")
	public void it_should_display_an_error_message(String error3) {
		System.out.println(">> Message displays "+error3);
		driver.close();
	}
	@When("user enters valid username and password click on login button")
	public void user_enters_valid_username_and_password_click_on_login_button() {
		driver.findElement(usrName).sendKeys("sangeetha");
		driver.findElement(pwd).sendKeys("S@ibaba@123");
		driver.findElement(login).click();
	  
	}

	@Then("The user should be redirected to Home Page with the message {string} and with the user name on the top")
	public void the_user_should_be_redirected_to_home_page_with_the_message_and_with_the_user_name_on_the_top(String error4) 
	{
				System.out.println(">> Message displays "+error4);
				
	}

	
	@When("The user clicks Sign out")
	public void the_user_clicks_sign_out() {
		driver.findElement(signOutBtn).click();
	}

	@Then("User will be logged out")
	public void user_will_be_logged_out() 
	{
		String errorMessage = driver.findElement(lgdOutMsg).getText();
		System.out.println(errorMessage);
		driver.close();
        //Assert.assertTrue("Expected error message not found", !errorMessage.isEmpty());
	}


}
