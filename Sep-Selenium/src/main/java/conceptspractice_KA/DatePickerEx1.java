package conceptspractice_KA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/#other-months");
		
		String date = "20-January-2023";
		String a[] = date.split("-");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		int rows = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr")).size();
		int columns = 7;
		
		boolean flag = false;
		
		while(true) {
			if(month.equals(a[1]) && year.equals(a[2])) {
				for (int i=1;i<=rows;i++) {
					for (int j=1;j<=columns;j++) {
						String day = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
						
						if (day.equals(a[0])) {
							driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr["+i+"]/td["+j+"]")).click();
							flag=true;
							break; // to stop columns loop
						}
						}
						}
						if(flag) {
								System.out.println("SUCCESS");
								break;
						}else {
								System.out.println("PLEASE ENTER CORRECT DATE");
								driver.close();
								break;
								}
				
			}else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
			}
		}
	}

}
