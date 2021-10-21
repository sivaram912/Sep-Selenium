package sep9_FindingElementsinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElement_name {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.name("search_query")).sendKeys("T-shirt");
		driver.findElement(By.name("submit_search")).click();
		driver.close();
		
		
	}

}
