package conceptspractice_KA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTexBoxes_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");

		//getAttribute("value") -- METHOD -- For read and return the value over the texbox
		
		//getAttribute("type") -- METHOD -- Type of that box will print
		
		
		
		
	}

}
