package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack {
	
	public WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";
	By stack_getstarted = By.xpath("//a[@href='stack']");
	By operations_in_stack=By.xpath("//a[normalize-space()='Operations in Stack']");
	By Implementation = By.xpath("//a[normalize-space()='Implementation']");
	By Applications = By.xpath("//a[normalize-space()='Applications']");
	By codemirror=By.xpath("//div[@class='CodeMirror-scroll']");
	By runbtn= By .xpath("//button[normalize-space()='Run']");
	By tryhere_stack= By.linkText("Try here>>>");;
	By Practise_Questions=By.linkText("Practice Questions");
	By getstarted = By.xpath("//button[normalize-space()='Get Started']");
	
	By signin= By.xpath("//a[normalize-space()='Sign in']");
	By username=By.id("id_username");
	By password=By.id("id_password");
	By login=By.xpath("//input[@value='Login']");
	By datastructures=By.xpath("//a[normalize-space()='Data Structures']");
	By queue=By.xpath("//a[normalize-space()='Queue']");
	

		@Given("The user is in the Stack page after logged in")
		public void the_user_is_in_the_stack_page_after_logged_in() {
			System.setProperty("webdriver.chrome.driver", "/Users/elahigill/Downloads/chromedriver-mac-arm64/chromedriver");
			driver = new ChromeDriver();
			
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			
			driver.findElement(getstarted).click();
			driver.findElement(signin).click();
			driver.findElement(username).sendKeys("elahi");
			driver.findElement(password).sendKeys("sarvgun123");
			driver.findElement(login).click();
			driver.findElement(stack_getstarted).click();
			driver.findElement(operations_in_stack).click();
		}
		@When("The user clicks Try Here9 button")
		public void the_user_clicks_try_here9_button() {
			driver.findElement(tryhere_stack).click();
		    
		}


		@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
		public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			Actions action = new Actions(driver);
		    WebElement txt1=driver.findElement(codemirror);
		    action.click(txt1).sendKeys("print('Hello')").perform();
		    driver.findElement(runbtn);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.navigate().back();
		}

		@When("The user clicks Operations in Stack button")
		public void the_user_clicks_operations_in_stack_button() {
			driver.findElement(operations_in_stack).click();
		}

		@And("The user should be directed to Operations in Stack Page")
		public void the_user_should_be_directed_to_operations_in_stack_page() {
			System.out.println("The user is in operations stack page");
			
			
		}
		
		

		@When("The user clicks Implementation button")
		public void the_user_clicks_implementation_button() {
			driver.findElement(Implementation).click();
		}

		@And("The user should be directed to Implementation Page")
		public void the_user_should_be_directed_to_implementation_page() {
			System.out.println("The user should be directed to implementation page");
		    driver.navigate().back();
		}
		
		
		    
		


		@When("The user clicks Application button")
		public void the_user_clicks_application_button() {
			driver.findElement(Applications).click();
		}

		@And("The user should be directed to Application page")
		public void the_user_should_be_directed_to_application_page() {
			System.out.println("The user should be directed to Application page");
		    driver.navigate().back();
		}

		@When("The user clicks Practice Questions button")
		public void the_user_clicks_practice_questions_button() {
			driver.findElement(Practise_Questions).click();
		}

		@And("The user should be redirected to Practise page")
		public void the_user_should_be_redirected_to_practise_page() {
			System.out.println("The user should be directed to practise page");
		    driver.navigate().back();
		}
		    

		@When("The users clicks the getting started button in queue pane or drop down menu")
		public void the_users_clicks_the_getting_started_button_in_queue_pane_or_drop_down_menu() {
			driver.findElement(datastructures).click();
		}

		@Then("The user should be in directed to Queue Page")
		public void the_user_should_be_in_directed_to_queue_page() {
			
			driver.findElement(queue).click();
		}




}
