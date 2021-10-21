package sep21_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void Test1() {
	  
	  System.out.println("this is from Test1");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("This is from before test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("This is from after test");
  }

}
