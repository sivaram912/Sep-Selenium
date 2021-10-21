package sep24_properties_file;

import org.testng.annotations.Test;


//import basetest.BaseTest;
import testbase.TestBase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TestcaseEx2 extends TestBase {

	@Test(groups = { "P3" })
	public void testcase001() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		// Double click on the webelemebt
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();

		Thread.sleep(5000);
	}

	@Test(groups = { "P1" })
	public void testcase002() {
		String vegName = "tomato";

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegName).build().perform();

	}

	@Test(groups = { "P2" })
	public void testcase003() throws InterruptedException {
		Actions act = new Actions(driver);

		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));

		act.moveToElement(shopByCat).build().perform();

		Thread.sleep(5000);

		if (shopByCat.isDisplayed() && shopByCat.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		} else {
			System.out.println("WebElement is not present");
		}
	}

}
