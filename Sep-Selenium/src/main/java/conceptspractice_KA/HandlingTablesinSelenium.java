/// Handling tables in Selenium ///
// 1. Static
// 2. Dynamic

package conceptspractice_KA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTablesinSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table"));
		
		List <WebElement> rows = table.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/thead/tr"));
		int rows_count = rows.size();
		System.out.println(rows_count);
		
		List <WebElement> Columns = table.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/thead/tr[1]/th"));
		int Columns_count = Columns.size();
		System.out.println(Columns_count);
		
		for (int i=1;i<=1;i++) {
			for (int j=1;j<=Columns_count;j++) {
				System.out.print(table.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/thead/tr["+i+"]/th["+j+"]")).getText()+" ");
			}
				System.out.println();
		}
		 
		for (int i=2;i<=rows_count;i++) { 
			for (int j=1;j<=Columns_count;j++) {
				System.out.print(table.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/thead/tr["+i+"]/td["+j+"]")).getText()+" ");
		  }
			  	System.out.println(); }
		 			
	}

}
