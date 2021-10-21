package sep7_SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sep8_seleniumDemo2 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");	
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Tshirt");
		
		//driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).click();
		
	}

}
