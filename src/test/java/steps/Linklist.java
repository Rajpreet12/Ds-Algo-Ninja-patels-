package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Linklist {
	
	public WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";
	 By getstarted = By.xpath("//button[@class='btn']");
	 By signin= By.xpath("//a[normalize-space()='Sign in']");
	 By username=By.id("id_username");
	 By password=By.id("id_password");
	 By login=By.xpath("//input[@value='Login']");
	 By ll_getstarted= By.xpath("//a[@href='linked-list']");
	 By introduction = By.xpath("//a[@href='introduction']");
	 By tryhere = By.linkText("Try here>>>");
	 By codemirror=By.xpath("//div[@class='CodeMirror-scroll']");
	 By runbtn= By .xpath("//button[normalize-space()='Run']");
	 By creatinglinkedlist=By.xpath("//a[normalize-space()='Creating Linked LIst']");
	 
	 By typesoflinkedlist=By.linkText("Types of Linked List");
	 By implementllinpython=By.xpath("//a[normalize-space()='Implement Linked List in Python']");
     By traversal=By.xpath("//a[normalize-space()='Traversal']");
	 By insertion=By.linkText("Insertion");
	 By deletion = By.linkText("Deletion");
	 By practiseqa=By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	 By datastructures=By.xpath("//a[@class='nav-link dropdown-toggle']");
	 By Stack=By.xpath("//a[normalize-space()='Stack']");
	 
	 
	@Given("The user is in the Linkedlist page after loggedin")
	public void the_user_is_in_the_linkedlist_page_after_loggedin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace_san\\Ds-Algo-Ninja-patels-\\src\\test\\resources\\driver\\chromedriver.exe");
        
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   	    driver.manage().window().maximize();
		driver.findElement(getstarted).click();
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys("elahi");
		driver.findElement(password).sendKeys("sarvgun123");
		driver.findElement(login).click();
		driver.findElement(ll_getstarted).click();
	}

	@When("The user clicks Introduction button")
	public void the_user_clicks_introduction_button() {
		driver.findElement(introduction).click();
	    
	}

	@Then("The user should be directed to Linked list page")
	public void the_user_should_be_directed_to_linked_list_page() {
		System.out.println("The user is directed to linked list page");
	}

	@Then("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		driver.findElement(tryhere).click();
	    
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test() {
		 Actions action = new Actions(driver);
		    WebElement txt1=driver.findElement(codemirror);
		    action.click(txt1).sendKeys("print(''Hello)").perform();
		    driver.findElement(runbtn);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   // driver.navigate().back();
			driver.close();
	        
	}

	@When("The user clicks Creating a Linked List button")
	public void the_user_clicks_creating_a_linked_list_button() {
		driver.findElement(creatinglinkedlist).click();
	}

	@Then("The user should be directed to Creating a Linked list page")
	public void the_user_should_be_directed_to_creating_a_linked_list_page() {
		System.out.println("The user is in creating list button");
	}

	@Then("The user clicks Try Here button1")
	public void the_user_clicks_try_here_button1() {
		driver.findElement(tryhere).click();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test1")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test1() {
		Actions action = new Actions(driver);
	    WebElement txt1=driver.findElement(codemirror);
	    action.click(txt1).sendKeys("print(''Hello)").perform();
	    driver.findElement(runbtn);
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   // driver.navigate().back();
		driver.close();
	    
	}

	@When("The user clicks Types of Linked List button")
	public void the_user_clicks_types_of_linked_list_button() {
		driver.findElement(typesoflinkedlist).click();
	}

	@Then("The user should be directed to Types a Linked list page")
	public void the_user_should_be_directed_to_types_a_linked_list_page() {
	    
	}

	@Then("The user clicks Try Here button2")
	public void the_user_clicks_try_here_button2() {
		driver.findElement(tryhere).click();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test2")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test2() {
		System.out.println("The user is redirected to a tryEditor page");
	    //driver.navigate().back();
		driver.close();
	}

	@When("The user clicks Implement Linked List in Python button")
	public void the_user_clicks_implement_linked_list_in_python_button() {
		driver.findElement(implementllinpython).click();
	}

	@Then("The user should be directed to Implement Linked list in python page")
	public void the_user_should_be_directed_to_implement_linked_list_in_python_page() {
		System.out.println("The user is in Implement linked list in python page");
	}

	@Then("The user clicks Try Here button3")
	public void the_user_clicks_try_here_button3() {
		driver.findElement(tryhere).click();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test3")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test3() {
		System.out.println("The user is redirected to a tryEditor page");
	   //driver.navigate().back();
		driver.close();
	}

	@When("The user clicks Traversal button")
	public void the_user_clicks_traversal_button() {
	    driver.findElement(traversal).click();
	}

	@Then("The user should be directed to Traversal Page")
	public void the_user_should_be_directed_to_traversal_page() {
		System.out.println("The user is redirected to a tryEditor page");
		
	}

	@Then("The user clicks Try Here button4")
	public void the_user_clicks_try_here_button4() {
		driver.findElement(tryhere).click();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test4")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test4() {
		System.out.println("The user is redirected to a tryEditor page");
		//driver.navigate().back();
		driver.close();
	}

	@When("The user clicks Insertion button")
	public void the_user_clicks_insertion_button() {
		driver.findElement(insertion).click();
	}

	@Then("The user should be directed to Insertion Page")
	public void the_user_should_be_directed_to_insertion_page() {
		System.out.println("The user in to insertion page");
	}

	@Then("The user clicks Try Here button5")
	public void the_user_clicks_try_here_button5() {
		driver.findElement(tryhere).click();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test5")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test5() {
		System.out.println("The user is redirected to a tryEditor page");
		//driver.navigate().back();
		driver.close();
	}

	@When("The user clicks Deletion button")
	public void the_user_clicks_deletion_button() {
		driver.findElement(deletion).click();
	}

	@Then("The user should be directed to Deletion Page")
	public void the_user_should_be_directed_to_deletion_page() {
		System.out.println("The user is in deletion page");
	}

	@Then("The user clicks Try Here button6")
	public void the_user_clicks_try_here_button6() {
		driver.findElement(tryhere).click();
	}
	    

	@Then("The user should be redirected to a page having an tryEditor with a Run button test6")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test6() {
		System.out.println("The user is redirected to a tryEditor page");
		driver.navigate().back();
	}

	@When("The user clicks Practise Questions button")
	public void the_user_clicks_practise_questions_button() {
		driver.findElement(practiseqa).click();
		driver.close();
		
	}




}
