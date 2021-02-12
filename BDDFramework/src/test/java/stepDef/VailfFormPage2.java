package stepDef;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import common.Base2;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FormPages;

public class VailfFormPage2 extends Base2 {
FormPages PG;
	
	@Test
	@Given("^I am on the from's page$")
	public void i_am_on_the_from_s_page()  {
		getdriver();
	    
		PG = PageFactory.initElements(driver, FormPages.class);
		
		PG.firstname.sendKeys("Ankur");
		
		// going to add more code
		PG.lastname.sendKeys("james");
		
		PG.email.sendKeys("ankurjames@gmail.com");
		PG.gender.click();
		PG.mobile.sendKeys("2223334444");
		//PG.dob.sendKeys("");
		PG.subject.sendKeys("Math");
		PG.hobbies.click();
		//PG.picture.click();
		PG.address.sendKeys("3030 Broadway");
		
		
	
		

		PG.email.sendKeys("dsdssh@yhaoo.com");
		//commit2 

		
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
