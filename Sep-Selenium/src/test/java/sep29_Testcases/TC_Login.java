package sep29_Testcases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import oct01_Log4J.LogfileImpl;
import pageObjects.MyAccountPage;
import testbase.TestBase;

public class TC_Login extends TestBase {

	@Test
	public void TC_Login_001() {

		// 1) to get the test method
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		// 2) to start the test
		extentLogger = extent.startTest(TestcaseId, "test1 i am running");		
		
		extentLogger.log(LogStatus.INFO, "It is clicked or not on signin link");
		AuthPageObj.getLnk_Signin().click();
		AuthPageObj.setTxt_Email("sivaram912.d@gmail.com");
		AuthPageObj.setTxt_password("7989588912");
		AuthPageObj.getBtn_Signin().click();

		Assert.assertEquals(MyAccountPageObj.getLnk_Signout().isDisplayed(), true);
		extentLogger.log(LogStatus.PASS, "Test case is PASSED");
		
		MyAccountPageObj.getLnk_Signout().click();
		extentLogger.log(LogStatus.INFO, "Clicked on signout or not");
	}

	@Test
	public void TC_Login_002() {

		// 1) to get the test method
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		// 2) to start the test
		extentLogger = extent.startTest(TestcaseId, "test1 i am running");		
		
		
		extentLogger.log(LogStatus.INFO, "Clicked on signIN or not");
		AuthPageObj.getLnk_Signin().click();
		AuthPageObj.setTxt_Email("sivaram912.d@gmail.com");
		AuthPageObj.setTxt_password("12345");
		AuthPageObj.getBtn_Signin().click();

		Assert.assertEquals(MyAccountPageObj.getLnk_Signout().isDisplayed(), false);
		System.out.println("Authentication failed message");
		extentLogger.log(LogStatus.FAIL, "Test case is FAILED");

	}

}
