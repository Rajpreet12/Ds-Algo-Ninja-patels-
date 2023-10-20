
package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datastructure {
	 private WebDriver driver;
	 
	 String url="https://dsportalapp.herokuapp.com/";
		By button=By.xpath("//button[@class=\"btn\"]");
		By get=By.linkText("Get Started");
		By signinpag=By.linkText("Sign in");
		By username=By.xpath("//input[@name=\"username\"]");
		By password=By.xpath("//input[@name=\"password\"]");
		By signinpage=By.xpath("//input[@type=\"submit\"]");
		By practice=By.linkText("Practice Questions");
		By tryhere=By.xpath("//a[@class=\"btn btn-info\"]");
		By time=By.linkText("Time Complexity");
		By presentation=By.xpath("//div[@class=\"CodeMirror-scroll\"]");
		By run=By.xpath("//button[@type=\"button\"]");
		
		
		
		@Before
		@Given("user already sigin")
		public void user_already_sigin() {
			 System.setProperty("webdriver.chrome.driver", "/Users/elahigill/Downloads/chromedriver-mac-arm64/chromedriver");
		        driver = new ChromeDriver();
		       
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get(url);
				driver.findElement(button).click();
				 
				 driver.findElement(signinpag).click();
				 driver.findElement(username).sendKeys("elahi");
					driver.findElement(password).sendKeys("sarvgun123");
					driver.findElement(signinpage).click();
				
		}

	@And("The user click Get Started button")
	public void the_user_click_get_started_button() {
		
			 
			driver.findElement(get).click();
			
	}

	@When("The user clicks Time complexity button")
	public void the_user_clicks_time_complexity_button() {
		driver.findElement(time).click();
		//System.out.println("print('Hello, world!')");
		
	}

	@When("The user clicks the practice button")
	public void the_user_clicks_the_practice_button() {
		driver.findElement(practice).click();
		driver.navigate().back();
	    
	}
    @After
	@Then("The user  clicks Try here button")
	public void the_user_clicks_try_here_button() {
		driver.findElement(tryhere).click();
		driver.findElement(presentation);
		 Actions action = new Actions(driver);

		 WebElement ght= driver.findElement(presentation);
		    action.click(ght).sendKeys("print('Hello')").perform();  

		    driver.findElement(run).click();
		    driver.navigate().back();
		
	   
	}


}
