package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base2 {

	
	
	public WebDriver driver;
	
	public WebDriver getdriver() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver88.exe");
		driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		//driver.get("https://www.jetblue.com/");
		driver.get("https://demoqa.com/automation-practice-form");

		return driver;
		//e
		
}
}
