package sep21_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Student {
	@Test
	public void Student1() {

		System.out.println("The student name is sivaram");
	}

	@Test
	public void Student2() {

		System.out.println("The student name is Chiranjivi");

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("I am from Before Method");

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("I am from After Method");
	}

}
