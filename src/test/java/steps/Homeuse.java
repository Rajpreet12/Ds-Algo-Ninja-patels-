	package steps;




	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;



	public class Homeuse {
		 private WebDriver driver;
		 
		 By clickgetstart = By.xpath("//button[@class='btn']");
		 By data_alert=By.xpath("//div[@role='alert']");
	     By datastrudropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
	     By click_Array = By.xpath("//a[@href='array']");
	     By click_Alert = By.xpath("//div[@role='alert']");
	     By click_Queue = By.xpath("//a[href='queue']");
	     By click_Register = By.xpath("//a[@href='/register']");
	     By click_signin=By.xpath("//a[normalize-space()='Sign in']");
	     By data_getstarted=By.xpath("//a[@href='data-structures-introduction']");
	     
	     public  Homeuse(WebDriver driver) {
	    	
			this.driver = driver;
	     }
	     
	     public void click_getstart() {
	    	 driver.findElement(clickgetstart).click();
	     }
	     public void data_getstart() {
	    	 driver.findElement(data_getstarted).click();
	     }
	     public void dataalert() {
	    	 driver.findElement(data_alert).click();
	     }
	     
	     public void datastru_dropdown() {
	    	 driver.findElement(datastrudropdown).click();
	     }
	     public void array() {
	    	 driver.findElement(click_Array).click();
	     }
	     public void alert() {
	    	 driver.findElement(click_Alert).click();
	     }
	     public void queue() {
	    	 driver.findElement(click_Queue).click();
	    	 
	     }
	     public void click_signin() {
	    	 driver.findElement(click_signin).click();
	     }
	     public void register() {
	    	 driver.findElement(click_Register).click();
	     }
	}



	
