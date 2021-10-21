package conceptspractice_KA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");	
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("sivaram999.d@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		
		/// Handling Dropdown in Selenium ///
		
		// selectByIndex() :- To select an option based on its index, beginning with 0  //
		
		Select Dropdown = new Select(driver.findElement(By.id("months")));
		
		Dropdown.selectByIndex(5);
		
		// selectByvalue() :- To select an option based on its value attribute  //
		
		// selectByVisibleText() :- To select an option based on the text over the option  //

		// getOption() :- To get the all options belonging to the select tag. it taken no parameter and returns List<WebElements>//
		// List<WebElement> option = dropdown.getoptions();
		// int size = options.size();
		// System.out.println(size);
		// for (i=0;i<size;i++){
		// 		String OptValue = option.get(i).getText();
		// System.out.println(OptValue);

		
		
	}

}
