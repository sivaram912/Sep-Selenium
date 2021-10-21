package sep24_properties_file;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testbase.TestBase;

public class Testcases extends TestBase {
	@Test(groups = {"P1"})
	public void testcase001() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		act.moveToElement(search).click().sendKeys(datatable.getCellData("Sheet1", "VegName", 3)).doubleClick().build().perform();
		Thread.sleep(5000);
	}

	@Test (groups = {"P2"})
	public void testcase002() {
		String vegName = datatable.getCellData("Sheet1", "VegName", 3);

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegName).build().perform();

	}

	@Test (groups = {"P1"})
	public void testcase003() {
		Actions act = new Actions(driver);

		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));

		act.moveToElement(shopByCat).build().perform();

		if (shopByCat.isDisplayed() && shopByCat.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		} else {
			System.out.println("WebElement is not present");
		}

	}

}
