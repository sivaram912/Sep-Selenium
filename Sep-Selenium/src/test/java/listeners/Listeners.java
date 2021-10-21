package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	//When the suite is started
	public void onStart(ITestContext context) {
		System.out.println("This is onStart method : " + context.getOutputDirectory());
	}
	
	//when @Test started
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started : " + result.getName());
	}
	
	//when @Test is done
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successfully Finished : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : " + result.getName());
	}

	//how many testcases are passed and failed information	
	//When suite is ended it will executed
	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish method  : " + context.getPassedTests());
		System.out.println("This is onFinish method  : " + context.getFailedTests());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed but within success percentage : " + result.getName());
	}
	
}
