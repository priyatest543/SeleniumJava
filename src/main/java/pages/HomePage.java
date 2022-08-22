package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;

public class HomePage extends TestBase {

	//By logo = By.id("nav-logo-sprites");
	By username = By.id(null);
	By password = By.id(null);
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	public void checkLogo()
	{
		driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	}
	
	public void login()
	{
		driver.findElement(username).isDisplayed();
	}
	
	
	
	
	
}
