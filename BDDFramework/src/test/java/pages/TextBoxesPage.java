package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxesPage {
	TextBoxesPage TB;
	
	public WebDriver driver;

	public TextBoxesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
 @FindBy(xpath="//input[@id='userName']")
 public WebElement fullname;

public WebElement getFullName() {
	return fullname;
}
 
 @FindBy(xpath=" //input[@id='userEmail']")
 public WebElement email;

public WebElement getemail() {
	return email;
}
 
 @FindBy(xpath="//textarea[@id='currentAddress']")
 public WebElement currentAddress;
 
 public WebElement getCurrentAddress() {
	 return currentAddress;
 }
 
 @FindBy(xpath="//textarea[@id='permanentAddress']")
 public WebElement permanentAddress;
 
 public WebElement getPermanentAddress() {
	 return permanentAddress;
 }
 
 @FindBy(xpath="//button[@id='submit']")
 public WebElement submit;
 
 public WebElement getSubmit() {
	 return submit;
 }
 
}
