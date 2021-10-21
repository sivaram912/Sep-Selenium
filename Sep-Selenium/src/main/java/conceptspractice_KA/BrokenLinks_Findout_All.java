package conceptspractice_KA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Findout_All {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		
		System.out.println("Total no of Links:"+ size);
		
		for (int i=0;i<size;i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
			httpcon.connect();
			int Response = httpcon.getResponseCode();
			
			if (Response>400) {
				System.out.println(url + ": is broken Link");
			}else {
				System.out.println(url + ": is valid Link");
			}
		}

		
		
		
		
		
		
	}

}
