package sep23_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void Flipkart() {
	  	WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");

		//Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9493050200");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dsr@7989588912");
		driver.findElement(By.xpath("//div[@class='_1D1L_j']//button[@type='submit']")).click();
		
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("T-SHIRT");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@data-id='TSHFWWQ4ZMVRFYNC']//img[@class='_2r_T1I']")).click();
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
  }
}
