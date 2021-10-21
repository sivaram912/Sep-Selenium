package conceptspractice_KA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--headless"); // Method(1) : by using addArguments
		opt.setHeadless(true); // Method (2) : by using setHeadless(true)
		driver = new ChromeDriver(opt);
		
		//driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
	}

}
