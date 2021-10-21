package sep24_excelEx2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testbase.TestBase;

public class TestCasesonSearch extends TestBase {
	@Test
	public void searchAproduct() throws InterruptedException {
		Actions act = new Actions(driver);

		WebElement womenbutton = driver.findElement(By.xpath("//a[text()=\"Women\"]")); //a[@title='T-shirts']
		WebElement clickonproduct = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
		//img[@class="replace-2x img-responsive" and @title="Faded Short Sleeve T-shirts" and @itemprop="image" and @alt="Faded Short Sleeve T-shirts"]
		
		WebElement addtokart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		
		act.moveToElement(womenbutton).click().build().perform();
		act.moveToElement(clickonproduct).click().build().perform();
		act.moveToElement(addtokart).click().build().perform();
		
		Thread.sleep(5000);
	}
	

//	@Test
//	public void addtocart() throws InterruptedException {
//		Actions act = new Actions(driver);
//
//		WebElement ClickonImage = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
//		String ImageSpecif = "Faded Short Sleeve T-shirts";
//		String Readednameofimage = driver.findElement(By.xpath("//h1[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
//
//		if (Readednameofimage.equalsIgnoreCase(ImageSpecif)) {
//
//			driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
//
//		} else {
//			System.out.println("Provided link is incorrect");
//		}
//
//		Thread.sleep(5000);
//
//	}

}
