package sep11_DiffTypesOfgetmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatAnAccount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");	
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		
		
		driver.findElement(By.id("email_create")).sendKeys("sivaram912.d@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		
		//System.exit(0);

		
		driver.findElement(By.id("id_gender1")).click();
		
		String FirstName = "sivaram";
		String LastName = "Donepudi";
		
		driver.findElement(By.name("customer_firstname")).sendKeys(FirstName);
		driver.findElement(By.name("customer_lastname")).sendKeys(LastName);
	//	driver.findElement(By.name("email")).sendKeys("sivaram912.d@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("7989588912");
		
	// By regular method 	
		
		driver.findElement(By.id("days")).sendKeys("20  ");
		driver.findElement(By.id("months")).sendKeys("July ");
		driver.findElement(By.id("years")).sendKeys("1991");
		
		
		driver.findElement(By.id("newsletter")).click();
		
		boolean newletterchckbox= driver.findElement(By.id("newsletter")).isSelected();
		
		if(newletterchckbox == false) {
			driver.findElement(By.id("newsletter")).click();
		}
		
		driver.findElement(By.id("optin")).click();
		
		//Address
		
		String Address_FirstName = driver.findElement(By.id("firstname")).getAttribute("value");
		String Address_LastName = driver.findElement(By.id("lastname")).getAttribute("value");
		
		
		if ((FirstName==Address_FirstName) &&(LastName==Address_LastName)){
			System.out.println("Providing address is matching with first name and Last name");
		}else
		{
			System.out.println("Providing address is not matching with first name and Last name");
		}
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("lastname")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstname")).sendKeys("ABCD");
		driver.findElement(By.id("lastname")).sendKeys("Newyork");
		
		
		driver.findElement(By.name("company")).sendKeys("Newyork");
		driver.findElement(By.name("address1")).sendKeys("1-212");
		driver.findElement(By.name("city")).sendKeys("Newyork");
		driver.findElement(By.id("id_state")).sendKeys("New York");
		driver.findElement(By.name("postcode")).sendKeys("53300");
		driver.findElement(By.name("id_country")).sendKeys("India");
		driver.findElement(By.name("other")).sendKeys("123456789");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("phone_mobile")).sendKeys("123456789");
		driver.findElement(By.name("alias")).sendKeys("Newyork");
		
		driver.findElement(By.id("//*[@id=\"authentication\"]")).click();
				
	}

}
