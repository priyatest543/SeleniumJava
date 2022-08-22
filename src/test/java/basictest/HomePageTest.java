package basictest;

import org.testng.annotations.Test;

import pages.HomePage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class HomePageTest {
  
	WebDriver driver;
	HomePage homePage = new HomePage(driver);
	
	@Test
  public void testCase1() {
		homePage.checkLogo();
		
		
  }
  @BeforeClass
  public void beforeClass() {
	 // homePage.initialize();
  }

  @AfterClass
  public void afterClass() {
	  homePage.closeBrowser();
  }

}
