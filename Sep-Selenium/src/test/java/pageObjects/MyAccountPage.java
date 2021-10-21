package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class MyAccountPage {

	WebDriver driver;

	public MyAccountPage(WebDriver driver2) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// My Account Page
	
	@FindBy (xpath = "//h1[@class=\'page-heading\']")
	private WebElement txt_MyAccount;

	@FindBy (xpath = "//a[@class=\'logout\']")
	private WebElement lnk_Signout;

	public WebElement getTxt_MyAccount() {
		return txt_MyAccount;
	}

	public WebElement getLnk_Signout() {
		return lnk_Signout;
	}

	
	
	
}
