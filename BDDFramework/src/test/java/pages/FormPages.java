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
 
 @FindBy(xpath="//input[@id='userEmail']")
 public WebElement email;
 
 public WebElement getEmail() {
	 return email;
 }
 
 @FindBy(xpath="//input[@id='gender-radio-2']")
 public WebElement gender;
 
 public WebElement getGender() {
	 return gender;
 }
 
 @FindBy(xpath="//input[@id='userNumber']")
 public WebElement mobile;
 
 public WebElement getMobile() {
	 return mobile;
 }
 
 @FindBy(xpath="//input[@id='dateOfBirthInput']")
 public WebElement dob;
 
 public WebElement getDOB() {
	 return dob;
 }
 
 @FindBy(xpath="//div[@id='subjectsContainer']")
 public WebElement subject;
 
 public WebElement getSubject() {
	 return subject;
 }
 
 @FindBy(xpath="//input[@id='hobbies-checkbox-1']")
 public WebElement hobbies;
 
 public WebElement getHobbies() {
	 return hobbies;
 }
 
 @FindBy(xpath="//input[@id='uploadPicture']")
 public WebElement picture;
 
 public WebElement getPicture() {
	 return picture;
 }
 
 @FindBy(xpath="//textarea[@id='currentAddress']")
 public WebElement address;
 
 public WebElement getAddress() {
	 return address;
 }

 
 
 
 
 
	
	
	

}
