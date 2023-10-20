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

public class Tree {
	
String url="https://dsportalapp.herokuapp.com/";
By button=By.xpath("//button[@class=\"btn\"]");
By signinpag=By.linkText("Sign in");
By username=By.xpath("//input[@name=\"username\"]");
By password=By.xpath("//input[@name=\"password\"]");
By signinpage=By.xpath("//input[@type=\"submit\"]");
By getbutton=By.xpath("//a[@href='tree']");
By  overview=By.xpath("//a[@href='overview-of-trees']");
By trybutton=By.linkText("Try here>>>");
By  text=By.xpath("//div[@class='CodeMirror-lines']");
By but=By.xpath("//button[normalize-space()='Run']");
By termi=By.xpath("//a[@href=\"/tree/terminologies/\"]");
By  but0=By.xpath("//a[normalize-space()='Try here>>>']");
By  types=By.xpath("//a[@href=\"/tree/types-of-trees/\"]");
By  but1=By.linkText("Try here>>>");
By  tree=By.xpath("//a[@href=\"/tree/tree-traversals/\"]");
By  but2=By.xpath("//a[@href=\"/tryEditor\"]");
By  traversal=By.xpath("//a[@href=\"/tree/traversals-illustration/\"]");
By  but3=By.xpath("//a[normalize-space()='Try here>>>']");
By binary=By.xpath("//a[normalize-space()='Binary Trees']");
By  but4=By.linkText("Try here>>>");
By  typesof=By.xpath("//a[normalize-space()='Types of Binary Trees']");
By  but5=By.xpath("//a[normalize-space()='Try here>>>']");
By  imple=By.xpath("//a[@href=\"/tree/implementation-in-python/\"]");
By  but6=By.xpath("//a[normalize-space()='Try here>>>']");

By  treetra=By.xpath("//a[@href=\"/tree/tree-traversals/\"]");
By  but7=By.xpath("//a[normalize-space()='Try here>>>']");

By   impleofbinary=By.xpath("//a[normalize-space()='Implementation of Binary Trees']");
By  but8=By.xpath("//a[normalize-space()='Try here>>>']");

By appli=By.xpath("//a[@href=\"/tree/applications-of-binary-trees/\"]");
By  but9=By.xpath("//a[normalize-space()='Try here>>>']");
By search=By.xpath("//a[@href=\"/tree/binary-search-trees/\"]");
By but10=By.xpath("//a[normalize-space()='Try here>>>']");

By bst=By.xpath("//a[@href=\"/tree/implementation-of-bst/\"]");
By but11=By.xpath("//a[normalize-space()='Try here>>>']");
By  pq=By.xpath("//a[normalize-space()='Practice Questions']");
private WebDriver driver;
@Given("user logged in and get started button")
	public void user_logged_in_and_get_started_button() {
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
			driver.findElement(getbutton).click();
		

	}

	@Given("user click overview of trees button")
	public void user_click_overview_of_trees_button() {
		driver.findElement(overview).click();
	   
	}

	@Given("user click try here button")
	public void user_click_try_here_button() {
		driver.findElement(trybutton).click();
		  Actions action = new Actions(driver);

		 WebElement ght= driver.findElement(text);
		    action.click(ght).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click();
		    driver.navigate().back();
	   
	}

	@Given("user clicks terminologies button")
	public void user_clicks_terminologies_button() {
		driver.findElement(termi).click();
	   
	}

	@Given("user clicks try here button")
	public void user_clicks_try_here_button() {
	    driver.findElement(but0).click();
	    Actions action = new Actions(driver);

		 WebElement ght1= driver.findElement(text);
		    action.click(ght1).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	}

	@When("the user clicks types of tree button")
	public void the_user_clicks_types_of_tree_button() {
		driver.findElement(types).click();
		
	}

	@When("the user click try here button")
	public void the_user_click_try_here_button() {
		 driver.findElement(but1).click();
		 Actions action = new Actions(driver);

		  WebElement ght2=driver.findElement(text);
		    action.click(ght2).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	}

	@When("the user clicks tree traversals button")
	public void the_user_clicks_tree_traversals_button() {
	    driver.findElement(tree).click();
	}

	@When("the user clicks try here button")
	public void the_user_click_try_here_button1() {
	   driver.findElement(but2).click();
	   Actions action = new Actions(driver);

		 WebElement ght3= driver.findElement(text);
		    action.click(ght3).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	}

	@When("the user clicks traversals-illustration button")
	public void the_user_clicks_traversals_illustration_button() {
	
		driver.findElement(traversal).click();
	    
	}

	@When("The user clicks try here button")
	public void the_user_clicks_try_here_button() {
		driver.findElement(but3).click();
		 Actions action = new Actions(driver);

		 WebElement ght4= driver.findElement(text);
		    action.click(ght4).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	}

	@When("the user click binary trees button")
	public void the_user_click_binary_trees_button() {
		driver.findElement(binary).click();
	   
	}

	@When("user clicked try here button")
	public void user_clicked_try_here_button() {
		driver.findElement(but4).click();
		 Actions action = new Actions(driver);

		 WebElement obj= driver.findElement(text);
		    action.click(obj).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	}

	@When("the user click types of binary trees button")
	public void the_user_click_types_of_binary_trees_button() {
	    driver.findElement(typesof).click();
	}

	@When("The user click again try here button")
	public void the_user_click_again_try_here_button() {
		driver.findElement(but5).click();
		 Actions action = new Actions(driver);

		  WebElement ght5=driver.findElement(text);
		    action.click(ght5).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click();
		    driver.navigate().back();
	   
	    
	}
	@When("the user clicks implementation button")
	public void the_user_clicks_implementation_button() {
		 driver.findElement(imple).click();
	}

	
	@When("the user  click on try here button")
	public void the_user_click_on_try_here_button() {
		driver.findElement(but6).click();
		 Actions action = new Actions(driver);

		 WebElement ght6= driver.findElement(text);
		    action.click(ght6).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	    
	}
	
	@When("the user clicks binary tree traversals button")
	public void the_user_clicks_binary_tree_traversals_button() {
		
		driver.findElement(treetra).click();
		
	}	
	@When("user click try here")
	public void user_click_try_here() {
	  
		driver.findElement(but7).click();
		 Actions action = new Actions(driver);

		 WebElement ght7= driver.findElement(text);
		    action.click(ght7).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	}
		    @When("the user clicks implementation of binary trees.")
			public void the_user_clicks_implementation_of_binary_tree() {
		    	driver.findElement(impleofbinary).click();
		    	
			}
			
		    @When("The user clik try button")
		    public void the_user_clik_try_button() {
		       
				driver.findElement(but8).click();
				 Actions action = new Actions(driver);

				 WebElement ght8= driver.findElement(text);
				    action.click(ght8).sendKeys("print('Hello')").perform();  

				    driver.findElement(but).click(); 
				    driver.navigate().back();
			   
			   	
		
		
		
	}
	
	@When("the user clicks application of binary trees button")
	public void the_user_clicks_application_of_binary_trees_button() {
		driver.findElement(appli).click();
	}
	
	@When("user clicks try buton")
	public void user_clicks_try_buton() {
	   

		driver.findElement(but9).click();
		 Actions action = new Actions(driver);

		WebElement ght9= driver.findElement(text);
		    action.click(ght9).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	}
	
	
	
	   
	
	
	

	
	@When("the user clicks binary search trees button")
	public void the_user_clicks_binary_search_trees_button() {
		driver.findElement(search).click();
	}


	
	
	
	@When("The user clicks try again")
	public void the_user_clicks_try_again() {
		driver.findElement(but10).click();
		 Actions action = new Actions(driver);

		 WebElement ght10= driver.findElement(text);
		    action.click(ght10).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click();
		    driver.navigate().back();
	   
	}

	@When("the user clicks implementation of BST button")
	public void the_user_clicks_implementation_of_bst_button() {
		driver.findElement(bst).click();
	}

	@When("user check try button")
	public void user_check_try_button() {
		driver.findElement(but11).click();
		 Actions action = new Actions(driver);

		 WebElement ght11= driver.findElement(text);
		    action.click(ght11).sendKeys("print('Hello')").perform();  

		    driver.findElement(but).click(); 
		    driver.navigate().back();
	   
	}

	@Then("The user clicks practice Question button")
	public void the_user_clicks_practice_question_button() {
		driver.findElement(pq).click();


}
	}
