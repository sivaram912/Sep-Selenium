package conceptspractice_KA;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleMultipleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.swtestacademy.com/window-handling-in-selenium/");
		
		driver.findElement(By.xpath("//*[@id=\'post-856\']/div/div[2]/p[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'post-856\']/div/div[2]/p[20]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'post-856\']/div/div[2]/p[28]/span/a")).click();
		
		
		  Set<String> Windows = driver.getWindowHandles(); int Size = Windows.size();
		  System.out.println("No of Windows:"+ Size);
		  
		  String id[] = new String[Size];
		  
		  Iterator<String> itr = Windows.iterator();
		  
		  for (int i=0;i<Size;i++) { id[i] = itr.next(); }
		  
		  System.out.println("Parent Window Title:" + driver.getTitle());
		  
		  driver.switchTo().window(id[2]);
		  System.out.println("Parent Top offers Window Title:" + driver.getTitle());
		 		
		driver.switchTo().window(id[2]);
		System.out.println("Parent Grocery Window Title:" + driver.getTitle());
		
		driver.switchTo().window(id[3]);
		System.out.println("Parent Mobile Window Title:" + driver.getTitle());
	}

}
