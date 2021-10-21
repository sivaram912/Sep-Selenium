package sep17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingonEdgeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
	}

}
