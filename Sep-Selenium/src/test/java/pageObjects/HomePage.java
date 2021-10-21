package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	
public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Home Page
	
	@FindBy(xpath="//a[@title=\'Contact Us\']")
	private WebElement btn_ContactUs;
	
	@FindBy(xpath ="//input[@name='search_query']")
	private WebElement txt_searchbox;

	@FindBy(xpath="//form[@id=\'searchbox\']//button[@type=\'submit\']")
	private WebElement btn_search;
	
	
	public WebElement getTxt_searchbox() {
		return txt_searchbox;
	}

	public void setTxt_searchbox(String txt_searchbox) {
		this.txt_searchbox.sendKeys(txt_searchbox);
	}

	public WebElement getBtn_ContactUs() {
		return btn_ContactUs;
	}

	public WebElement getBtn_search() {
		return btn_search;
	} 
	
		
	
	
	
	
	
}
