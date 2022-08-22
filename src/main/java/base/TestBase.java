package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver=null;
	
	public TestBase(WebDriver driver)
	{
		this.driver=driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		driver.get("https://www.google.co.in/");
	}
	
	public void initialize() {
		
	//driver.get("");
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
		
	
}
