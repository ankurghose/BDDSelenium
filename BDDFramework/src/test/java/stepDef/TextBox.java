package stepDef;

import org.testng.annotations.Test;

import common.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TextBox extends Base {

	
	@Test
	@Given("^I am on the textbox page$")
	public void i_am_on_the_textbox_page()  {
		getdriver();
	   
	}

	@Given("^I fill it out$")
	public void i_fill_it_out()  {
	    
	}

	@When("^I hit complete$")
	public void i_hit_complete()  {
	   
	}

	@Then("^the Textbox should be filled$")
	public void the_Textbox_should_be_filled() {
	   
	}
	
	
}
