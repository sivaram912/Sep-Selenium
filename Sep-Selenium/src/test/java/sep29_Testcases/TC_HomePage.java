package sep29_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import testbase.TestBase;

public class TC_HomePage extends TestBase {

	@Test
	public void TC_HomePage_001() {

		// 1) to get the test method
//		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
//		// 2) to start the test
//		extentLogger = extent.startTest(TestcaseId, "test1 i am running");	
//		
		
		Actions act = new Actions(driver);
		WebElement Addtocartbtn = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		
//		extentLogger.log(LogStatus.INFO, "Text is entered or not");
		HomePageObj.setTxt_searchbox("T-shirts");
		HomePageObj.getBtn_search().click();
		act.moveToElement(Addtocartbtn).click();
		
//		extentLogger.log(LogStatus.INFO, "Verify the the item added cart or not");
		
		
		
	}
	
	
	
}
