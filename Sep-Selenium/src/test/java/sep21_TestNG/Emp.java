package sep21_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Emp {
  @Test
  public void Emp1() {
	  
	  System.out.println("The Emp1 name is Sivaram");
  }
  @Test(enabled = false)
  public void Emp2() {
	  
	  System.out.println("The Emp2 name is Chiranjivi");
  }
  
  @BeforeMethod
  public void beforemethod() {
	  
	  System.out.println("I am form before method");
  }
  @AfterMethod
  public void aftermethod() {
	  
	  System.out.println("I am from after method");
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("I am from before class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("I am from after class");
  }

}
