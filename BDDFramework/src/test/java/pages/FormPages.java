package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPages {
	FormPages PG;
	
	public WebDriver driver;

	public FormPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
 @FindBy(xpath="//input[@id='firstName']")
 public WebElement firstname;

public WebElement getFirstname() {
	return firstname;
}
 
 @FindBy(id="lastName")
 public WebElement lastname;

public WebElement getLastname() {
	return lastname;
}
 
 
	
	
	

}
