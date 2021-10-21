package sep17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingondiffBrowsers {

	public static void main(String[] args) {
		
		String Browser = "firefox";
		WebDriver driver = null;
		
		if(Browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (Browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else {
			System.out.println("Provided browser not exist with us");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}

}
