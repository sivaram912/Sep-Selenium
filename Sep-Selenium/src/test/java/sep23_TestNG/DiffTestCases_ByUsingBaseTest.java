package sep23_TestNG;

import org.testng.annotations.Test;

import testbase.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DiffTestCases_ByUsingBaseTest extends TestBase {

	@Test
	public void Testcase_001() {
		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("TOMOTO");
		driver.findElement(By.xpath("//i[@class='icon svg-header svg-search svg-search-dim hidden-sm hidden-xs']"))
				.click();
	}

	@Test
	public void Testcase_002() {
		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("CUCUMBER");
		driver.findElement(By.xpath("//i[@class='icon svg-header svg-search svg-search-dim hidden-sm hidden-xs']"))
				.click();

	}

}
