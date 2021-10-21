package conceptspractice_KA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");
		
		// click() -- METHOD //
		
		driver.findElement(By.linkText("Sign in")).click();
		
		// sendkeys() -- METHOD //
		//clear() -- METHOD //
		//getText() -- METHOD //
		//isDisplayed() -- METHOD //
		//isEnabled() -- METHOD //
		//isDisabled() -- MEHOD //
		//isSelected()--METHOD //
		//Submit()--METHOD //
		
		
 		
		
	}

}
