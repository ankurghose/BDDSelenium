package stepDef;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FormPages;
import pages.TextBoxesPage;

public class TextBox extends Base {
TextBoxesPage TB;
	
	@Test
	@Given("^I am on the textbox page$")
	public void i_am_on_the_textbox_page()  {
		getdriver();
		TB = PageFactory.initElements(driver, TextBoxesPage.class);
		TB.fullname.sendKeys("Ankur James");
		TB.email.sendKeys("AnkurJames@gmail.com");
		TB.currentAddress.sendKeys("1234 Broadway");
		TB.permanentAddress.sendKeys("5678 Broadway");
		TB.submit.click();
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
