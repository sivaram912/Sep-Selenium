package sep9_FindingElementsinSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatAnAccount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");	
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("sivaram912.d@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		driver.findElement(By.id("authentication")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Sivaram");
		driver.findElement(By.name("customer_lastname")).sendKeys("Donepudi");
	//	driver.findElement(By.name("email")).sendKeys("sivaram912.d@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("7989588912");
		driver.findElement(By.id("authentication")).sendKeys("20");
		driver.findElement(By.id("months")).sendKeys("07");
		driver.findElement(By.id("years")).sendKeys("1991");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.name("company")).sendKeys("Student");
		driver.findElement(By.name("address1")).sendKeys("1-212");
		driver.findElement(By.name("address2")).sendKeys("Yeleswaram");
		driver.findElement(By.name("city")).sendKeys("Yeleswaram");
		driver.findElement(By.name("id_state")).sendKeys("Andrapradesh");
		driver.findElement(By.name("postcode")).sendKeys("533429");
		driver.findElement(By.name("id_country")).sendKeys("India");
		driver.findElement(By.name("other")).sendKeys("7989588912");
		driver.findElement(By.name("phone")).sendKeys("7989588912");
		driver.findElement(By.name("phone_mobile")).sendKeys("7989588912");
		driver.findElement(By.name("alias")).sendKeys("Yeleswaram");
		
				
	}

}
