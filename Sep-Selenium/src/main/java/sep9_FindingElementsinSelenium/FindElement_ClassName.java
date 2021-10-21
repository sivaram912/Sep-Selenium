package sep9_FindingElementsinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_ClassName {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");	
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
			
		driver.findElement(By.className("search_query form-control ac_input")).sendKeys("T-shirt");
		
		//driver.findElement(By.className("")).sendKeys("");
		
		//driver.findElement(By.className("btn btn-default button-search")).click();
		
	}

}
