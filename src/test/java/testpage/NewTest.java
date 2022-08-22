package testpage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver driver = new ChromeDriver();
  
	@Test(priority=1)
  public void checkTitle() {
	  String expectedTitle = "Google";
	  String title = driver.getTitle();
	  if(expectedTitle.equals(title))
	  {
		 System.out.println("Pass"); 
	  }
	  else
	  {
		  System.out.println("Fail");
		  
	  }
  }
  
  @Test(groups= {"Regression"})
  public void searchSelenium()
  {
	 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium"+Keys.ENTER);
  }
 
  
  @AfterClass
  public void closeBowser() {
	//  driver.close();
  }
  
  @BeforeClass
  public void launchUrl() {
	  WebDriverManager.chromedriver().setup();
	  driver.get("https://www.google.co.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
  }
    
  

  @Test(priority=3, groups= {"Regression"} )
  public void clickOnSelenium()
  {
	driver.findElement(By.xpath("//a[@href='https://www.selenium.dev/']")).click();
	
  }
  @Test(priority=4, groups= {"Regression"})
  public void clickOnDownloads()
  {
	driver.navigate().back();
	driver.findElement(By.xpath("//a[contains(text(),'Downloads')]")).click();
	
  }
  
}


