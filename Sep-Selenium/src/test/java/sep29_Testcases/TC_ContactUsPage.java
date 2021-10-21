package sep29_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageObjects.ContactUsPage;
import testbase.TestBase;
				
public class TC_ContactUsPage extends TestBase{

	@Test
	public void TC_ContactUsPage_001(){
		
	// 1) to get the test method
	String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	// 2) to start the test
	extentLogger = extent.startTest(TestcaseId, "test1 i am running");	
		
	
	extentLogger.log(LogStatus.INFO, "Click on the ContactUs Link");
	HomePageObj.getBtn_ContactUs().click();

	extentLogger.log(LogStatus.INFO, "Verify the Link Page is exist or not");
	Assert.assertEquals(ContactUsPageObj.getRtxt_CSCONTACTUS().getText(), "CUSTOMER SERVICE - CONTACT US");
	
	extentLogger.log(LogStatus.INFO, "Enter the Data");
	ContactUsPageObj.getTxt_SubHeadforCustomerService();
	ContactUsPageObj.setCSCONTACTUS_EmailAddress("sivaram912.d@gmail.com");
	ContactUsPageObj.setCSCONTACTUS_OrderRef("12345");
	ContactUsPageObj.setCSCONTACTUS_MessageBox("My order is not recieved");
	ContactUsPageObj.getCSCONTACTUS_Sendbtn();	
	
	extentLogger.log(LogStatus.INFO, "Verify the Message displayed properly or not");
	Assert.assertEquals(ContactUsPageObj.getCSCONTACTUS_SuccessMassage().getText(), true);
	System.out.println("Message send Successfully");
	extentLogger.log(LogStatus.PASS, "Test case PASS");
	
	Assert.assertEquals(ContactUsPageObj.getCSCONTACTUS_ErrorMassage().getText(), true);
	System.out.println("Message is not send Successfully");
	extentLogger.log(LogStatus.FAIL, "Test case FAIL");
	
	}
}
