
/// Part: 15 -- Mouse Clicks and Keyboard events actions class in Selenium ///

// 1. clickAndHold()
// 2. contexClick()
// 3. doubleClick()
// 4. dragAndDrop(source, target)
// 5. keyDown(modifier_key)
// 6. keyUp(modifier_key)
// 7. moveToElement(toElement)
// 8. release()
// 9. Build().perform()


package conceptspractice_KA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicksandKeyboardEventsActions {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Charts.html");
		
		Actions act = new Actions(driver);
		
//		WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));
//		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));
//		
//	//	act.clickAndHold(element1).clickAndHold(element2).build().perform();
//		
//		WebElement element3 = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[1]/ul[1]/li[2]/a[1]"));
//		
//		act.clickAndHold(element1).clickAndHold(element2).clickAndHold(element3).click().build().perform();
		
		WebElement Source = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement Target = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		
		act.clickAndHold(Source).moveToElement(Target).release().build().perform();
		
		
		
		
	}

}
