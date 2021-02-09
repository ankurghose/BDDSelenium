package stepDef;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FormPages;

public class VailfFormPage extends Base {
FormPages PG;
	
	@Test
	@Given("^I am on the from's page$")
	public void i_am_on_the_from_s_page()  {
		getdriver();
	    
		PG = PageFactory.initElements(driver, FormPages.class);
		
		PG.firstname.sendKeys("Ankur");
	}

	@Given("^I fill out the page$")
	public void i_fill_out_the_page()  {
	   
	}

	@When("^I complete the forms page$")
	public void i_complete_the_forms_page() {
	 
	}

	@Then("^I check if all boxs are filled$")
	public void i_check_if_all_boxs_are_filled()  {
	    
	}

	
	
}
