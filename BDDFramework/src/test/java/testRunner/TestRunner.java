package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Features", 
		glue = "stepDef",
		tags = "@Smoke"
	
		
		
		
)




	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}

