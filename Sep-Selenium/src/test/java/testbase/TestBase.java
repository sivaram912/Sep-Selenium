package testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import excel.ExcelReader;
import listeners.EventListener;
import pageObjects.AuthenticationPage;
import pageObjects.ContactUsPage;
import pageObjects.FooterLinksPage;
import pageObjects.HeaderLinksPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;

public class TestBase {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public ExcelReader datatable;

	public AuthenticationPage AuthPageObj;
	public FooterLinksPage FooterLinksObj;
	public HeaderLinksPage HeaderLinksObj;
	public HomePage HomePageObj;
	public ContactUsPage ContactUsPageObj;
	public MyAccountPage MyAccountPageObj;

	//create two instance variable
	public static ExtentReports extent;
	public static ExtentTest extentLogger;

	@BeforeTest
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\extent-config.xml"));
	}
	
	@AfterTest
	public void testafter() { 
		extent.close();
	}
	
	
	@BeforeClass
	public void beforeclass() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
		System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config_properties"); // This is
		
		prop.load(fis);

		datatable = new ExcelReader(
		System.getProperty("user.dir") + "\\src\\test\\resources\\excelcopies\\TestData.xlsx"); 	
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Eclipse_Home\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (prop.getProperty("browser").equals("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\Eclipse_Home\\Sep-Selenium\\drivers\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		if (prop.getProperty("browser").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Eclipse_Home\\Sep-Selenium\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Provided browser is not supported");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//class file which we created in above step
		EventListener ecapture = new EventListener(); 
		
		//pass the driver to EventFiringWebDriver
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		
		//pass ecapture tp eventHandler
		eventHandler.register(ecapture);

		AuthPageObj = new AuthenticationPage(eventHandler);
		FooterLinksObj = new FooterLinksPage(eventHandler);
		HeaderLinksObj = new HeaderLinksPage(eventHandler);
		HomePageObj = new HomePage(eventHandler);
		ContactUsPageObj = new ContactUsPage(eventHandler);
		MyAccountPageObj = new MyAccountPage(eventHandler);
	}

	@BeforeMethod
	public void beforemethod() {
		driver.get(prop.getProperty("url"));
	}

	
	@AfterMethod
	public void aftermethod() {
		extent.endTest(extentLogger);
		extent.flush();
	}

	@AfterClass
	public void afterclass() {
		driver.quit();
		
	}

}
