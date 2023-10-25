package steps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class arrays {

private WebDriver driver;

String URL = "https://dsportalapp.herokuapp.com/";
By getstartBtn = By.xpath("//button[@class=\"btn\"]");
By signinBtn = By.linkText("Sign in");
By usrName = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[2]");
By pwd = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[3]");
By login = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[4]");
By aGetstrBtn = By.xpath("//div[@class=\"row row-cols-1 row-cols-md-3 g-4\"]/div[2]/div/div/a");
By arrInPythLnk = By.linkText("Arrays in Python");
By tryHere = By.linkText("Try here>>>");
By codeMirr = By.xpath("//div[@class=\"CodeMirror-scroll\"]/div[1]/div/div/div/div[4]");
By runBtn = By.xpath("//div[@class=\"container\"]/div/form/button");
By arrUsinLstLnk = By.linkText("Arrays Using List");
By bscOpInLstsLnk = By.linkText("Basic Operations in Lists");
By appOfArrLnk = By.linkText("Applications of Array");
By pracQstnsLnk = By.linkText("Practice Questions");
By srchTheArrLnk = By.linkText("Search the array");
By maxCsctvOnesLnk = By.linkText("Max Consecutive Ones");
By fndNumWthEvnNumOfDgtsLnk = By.linkText("Find Numbers with Even Number of Digits");
By sqrsOfSrtdArrLnk = By.xpath("//a[text()=\"Squares of  a Sorted Array\"]");

@Given("The user is in the Array page after logged in")
public void the_user_is_in_the_array_page_after_logged_in() {
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace_san\\DSAlgo-NJ-Petals-San\\src\\test\\resources\\driver\\chromedriver.exe");
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(URL);
	driver.findElement(getstartBtn).click();
	driver.findElement(signinBtn).click();
	driver.findElement(usrName).sendKeys("sangeetha");
	driver.findElement(pwd).sendKeys("S@ibaba@123");
    driver.findElement(login).click();
    driver.findElement(aGetstrBtn).click();
 }
@When("clicks Arrays in Python link user should be redirected to Arrays in Python page")
public void clicks_arrays_in_python_link_user_should_be_redirected_to_arrays_in_python_page() {
	driver.findElement(arrInPythLnk).click();
}
@When("The user clicks Try Here button in Arrays in Python page")
public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	driver.findElement(tryHere).click();
}
@Then("The user should be redirected to a page having an tryEditor with a Run button to test1")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	
		Actions action = new Actions(driver);
	    WebElement txt = driver.findElement(codeMirr);
	    action.click(txt).sendKeys("print('Hello')").perform();  
	    driver.findElement(runBtn).click();
	    driver.close();
}

@When("clicks Arrays using List user should be redirected to Arrays using List page")
public void clicks_arrays_using_list_user_should_be_redirected_to_arrays_using_list_page() {
    driver.findElement(arrUsinLstLnk).click();
}
@When("The user clicks Try Here button in Arrays using List page")
public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
    driver.findElement(tryHere).click();
}

@When("clicks Basic operations in List user should be redirected to Basic operations in List page")
public void clicks_basic_operations_in_list_user_should_be_redirected_to_basic_operations_in_list_page() {
    driver.findElement(bscOpInLstsLnk).click();
}
@When("The user clicks Try Here button in Basic operations in List page")
public void the_user_clicks_try_here_button_in_basic_operations_in_list_page() {
     driver.findElement(tryHere).click();
}

@When("clicks Applications of Array user should be redirected to Applications of Array  page")
public void clicks_applications_of_array_user_should_be_redirected_to_applications_of_array_page() {
   driver.findElement(appOfArrLnk).click();
}
@When("The user clicks Try Here button in Applications of Array page")
public void the_user_clicks_try_here_button_in_applications_of_array_page() {
	driver.findElement(tryHere).click();
}

@Given("The user clicks Practice Questions in Applications of Array page user should be redirected to practice page")
public void the_user_clicks_practice_questions_in_applications_of_array_page_user_should_be_redirected_to_practice_page() {
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace\\DSAlgo_ninjapetals\\src\\test\\resources\\driver\\chromedriver.exe");
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(URL);
	driver.findElement(getstartBtn).click();
	driver.findElement(signinBtn).click();
	driver.findElement(usrName).sendKeys("sangeetha");
	driver.findElement(pwd).sendKeys("S@ibaba@123");
    driver.findElement(login).click();
    driver.findElement(aGetstrBtn).click();
    driver.findElement(appOfArrLnk).click();
	driver.findElement(pracQstnsLnk).click();
}
@When("The user clicks Search the array link")
public void the_user_clicks_search_the_array_link() {
	driver.findElement(srchTheArrLnk).click();
}
@Then("The user should be redirected to Question page contains question1, a tryEditor with Run and Submit buttons")
public void the_user_should_be_redirected_to_question_page_contains_question1_a_try_editor_with_run_and_submit_buttons() {
    System.out.println("User is in quetion1 page where he can write a program and run");

}
@And("The user navigates back to the Practice page")
public void the_user_navigates_back_to_the_practice_page() {
	driver.navigate().back();
}

@When("The user clicks Max Consecutive Ones link")
public void the_user_clicks_max_consecutive_ones_link() {
	driver.findElement(maxCsctvOnesLnk).click();
}

@Then("The user should be redirected to Question page contains question2, a tryEditor with Run and Submit buttons")
public void the_user_should_be_redirected_to_question_page_contains_question2_a_try_editor_with_run_and_submit_buttons() {
	  System.out.println("User is in quetion2 page where he can write a program and run");
}
@Then("The user should be redirected to Question page contains question3, a tryEditor with Run and Submit buttons")
public void the_user_should_be_redirected_to_question_page_contains_a_question_a_try_editor_with_run_and_submit_buttons() {
	  System.out.println("User is in quetion3 page where he can write a program and run");
}
@Then("The user should be redirected to Question page contains question4, a tryEditor with Run and Submit buttons")
public void the_user_should_be_redirected_to_question_page_contains_a_question4_a_try_editor_with_run_and_submit_buttons() {
	  System.out.println("User is in quetion4 page where he can write a program and run");
}

@When("The user clicks Find Numbers with Even Number of Digits link")
public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {
	driver.findElement(fndNumWthEvnNumOfDgtsLnk).click();
}

@When("The user clicks Squares of a Sorted Array link")
public void the_user_clicks_squares_of_a_sorted_array_link() {
	driver.findElement(sqrsOfSrtdArrLnk).click();
	driver.close();
}
}
