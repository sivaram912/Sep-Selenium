package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

	WebDriver driver;

	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Authentication page

	// ALREADY REGISTERED

	@FindBy(xpath = "//a[@class='login']")
	private WebElement lnk_Signin;

	@FindBy(id = "email")
	private WebElement txt_Email;

	@FindBy(id = "passwd")
	private WebElement txt_password;

	@FindBy(xpath = "//i[@class=\'icon-lock left\']")
	private WebElement btn_Signin;

	// Forgot Password

	@FindBy(xpath = "//a[@title=\'Recover your forgotten password\']")
	private WebElement lnk_Forgorpswd;

	@FindBy(xpath = "//p[@class=\'submit\']//i[@class=\'icon-chevron-right right\']")
	private WebElement lnk_Retrievepswd;

	@FindBy(xpath = "//li[text()='Authentication failed.']")
	private WebElement txt_Authfailedmessage;

	// CREATE AN ACCOUNT

	@FindBy(id = "email_create")
	private WebElement txt_createAnact;

	@FindBy(xpath = "//button[@class='btn btn-default button button-medium exclusive']")
	private WebElement btn_createAnact;

	public WebElement getTxt_Email() {
		return txt_Email;
	}

	public void setTxt_Email(String val) {
		this.txt_Email.sendKeys(val);
		;
	}

	public WebElement getTxt_password() {
		return txt_password;
	}

	public void setTxt_password(String val) {
		this.txt_password.sendKeys(val);
		;
	}

	public WebElement getTxt_createAnact() {
		return txt_createAnact;
	}

	public void setTxt_createAnact(String val) {
		this.txt_createAnact.sendKeys(val);
		
	}

	public WebElement getLnk_Signin() {
		return lnk_Signin;
	}

	public WebElement getLnk_Forgorpswd() {
		return lnk_Forgorpswd;
	}

	public WebElement getLnk_Retrievepswd() {
		return lnk_Retrievepswd;
	}

	public WebElement getBtn_Signin() {
		return btn_Signin;
	}

	public WebElement getBtn_createAnact() {
		return btn_createAnact;
	}

}
