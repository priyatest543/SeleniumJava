package testpage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HomePageTest {
  
@Test
  public void f() {
	System.out.println("Test Method TC1");  
  }
@Test(groups= {"Regression"})
public void login() {
	System.out.println("Test Method TC2");  
}
  @BeforeMethod
  public void Test1() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void Test2() {
	  System.out.println("After Method");
  }

}
