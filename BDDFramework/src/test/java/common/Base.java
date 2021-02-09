package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	
	public WebDriver driver;
	
	public WebDriver getdriver() {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver88");
		driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		//driver.get("https://www.jetblue.com/");
		driver.get("https://demoqa.com/automation-practice-form");

		return driver;
		//e
		
}
}
