package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class signin {
    private WebDriver driver;
    String url="https://dsportalapp.herokuapp.com/";
	By button=By.xpath("//button[@class=\"btn\"]");
	By loginpage=By.xpath("//a[normalize-space()='Sign in']");
	By username=By.xpath("//input[@name=\"username\"]");
	By password=By.xpath("//input[@name=\"password\"]");
	By signinpage=By.xpath("//input[@type=\"submit\"]");
	By signoutpage=By.xpath("//a[normalize-space()='Sign out']");
		@Given("The user opens home Page")
		public void the_user_opens_home_page() {

	        System.setProperty("webdriver.chrome.driver", "/Users/elahigill/Downloads/chromedriver-mac-arm64/chromedriver");
	        driver = new ChromeDriver();
	       
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(url);
			driver.findElement(button).click();
			
			
		 
		}

		@When("The user opens Register page.")
		public void the_user_opens_register_page() {
			driver.findElement(loginpage).click();
			driver.findElement(username).sendKeys("elahi");
			driver.findElement(password).sendKeys("sarvgun123");
		}
		

		@And("The user  sign in page.")
		public void the_user_sign_in_page() {
		   driver.findElement(signinpage).click();
		}

@Then("The user signout page.")
public void the_user_signout_page() {
	driver.findElement(signoutpage).click();
    driver.close();
}
}



