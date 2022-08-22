package testpage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestAllMethod {
  @Test
  public void login() {
	  System.out.println("Login");
  }
  @Test(priority=0)
  public void searchPhone() {
	  System.out.println("Search Phone");
  }
  @Test(priority=1)
  public void addToCart() {
	  System.out.println("Add to Cart");
  }
  @Test(priority=1)
  public void placeOrder() {
	  System.out.println("Place Order");
  }
  @Test(priority=5)
  public void returnOrder() {
	  System.out.println("Return Order");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Launch URL");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Close the browser");
  }

}
