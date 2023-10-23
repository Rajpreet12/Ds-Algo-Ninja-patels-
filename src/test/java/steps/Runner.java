package steps;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			plugin= {"pretty","html:target/sange.html"},
			monochrome=false,
			tags="@tag",
			features= {"src/test/resources/features"},
			glue = "steps") 
			
	public class Runner  extends AbstractTestNGCucumberTests{
		@Override
		@DataProvider(parallel=false)
		public Object[][] scenarios(){
			return super.scenarios();
		}

}
