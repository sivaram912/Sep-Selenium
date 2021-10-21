package conceptspractice_KA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	private static final TimeUnit Tread = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// get() method //

		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

		// getTitle() method //

		System.out.println(driver.getTitle());

		// getCurrentUrl() method //

		System.out.println(driver.getCurrentUrl());

		// close method //

		Thread.sleep(10000);

		driver.close();

	}

}
