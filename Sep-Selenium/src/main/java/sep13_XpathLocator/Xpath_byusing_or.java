package sep13_XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byusing_or {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("T-shirt");
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		
		
	}

}
