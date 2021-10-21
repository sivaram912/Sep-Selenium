package conceptspractice_KA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// navigate().to() method //
		
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.navigate().to("https://www.facebook.com/");
		
		
		// navigate().back() //
		
		driver.navigate().back();
		
		// navigate().forward() //
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		Thread.sleep(2000);
		
		// navigate().refresh() // 
		
		driver.navigate().refresh();
		
		// sendkeys(keys.F5) -- FOR REFRESH //
		

	}

}
