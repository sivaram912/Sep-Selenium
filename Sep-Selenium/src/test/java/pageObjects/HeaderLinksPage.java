package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderLinksPage {

	WebDriver driver;

	public HeaderLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Headerlinks

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement lnk_logo;

	// Women - Sub Header Links under Home Page

	@FindBy(xpath = "//a[@class='sf-with-ul' and @title='Women']")
	private WebElement lnk_women;

	// Drop down links under Women Sub footer

	@FindBy(xpath = "//a[@title='Tops']")
	private WebElement lnk_women_TOPS;

	@FindBy(xpath = "//ul[@class=\"submenu-container clearfix first-in-line-xs\"]//a[@title='T-shirts']")
	private WebElement lnk_women_Tshirts;

	@FindBy(xpath = "//a[@title='Blouses']")
	private WebElement lnk_women_Blouses;

	// Dresses - Sub Header Links under Home Page

	@FindBy(xpath = "//*[@id=\'block_top_menu\']/ul/li[2]/a") // Once Link has to be check temporarily copy pasted
																// directly
	private WebElement lnk_Dresses;

	@FindBy(xpath = "//a[@title='Casual Dresses']")
	private WebElement lnk_Dresses_CasualDresses;

	@FindBy(xpath = "//a[@title=\\'Evening Dresses\\']")
	private WebElement lnk_Dresses_EvngDresses;

	@FindBy(xpath = "//a[@title=\\'Summer Dresses\\']")
	private WebElement lnk_Dresses_SummerDresses;

	// T-Shirts - Sub Header Links under Home Page

	@FindBy(xpath = "//a[@title=\\'Summer Dresses\\']")
	private WebElement lnk_Tshirts;

	public WebElement getLnk_logo() {
		return lnk_logo;
	}

	public void setLnk_logo(WebElement lnk_logo) {
		this.lnk_logo = lnk_logo;
	}


	public WebElement getLnk_women() {
		return lnk_women;
	}

	public void setLnk_women(WebElement lnk_women) {
		this.lnk_women = lnk_women;
	}

	public WebElement getLnk_women_TOPS() {
		return lnk_women_TOPS;
	}

	public void setLnk_women_TOPS(WebElement lnk_women_TOPS) {
		this.lnk_women_TOPS = lnk_women_TOPS;
	}

	public WebElement getLnk_women_Tshirts() {
		return lnk_women_Tshirts;
	}

	public void setLnk_women_Tshirts(WebElement lnk_women_Tshirts) {
		this.lnk_women_Tshirts = lnk_women_Tshirts;
	}

	public WebElement getLnk_women_Blouses() {
		return lnk_women_Blouses;
	}

	public void setLnk_women_Blouses(WebElement lnk_women_Blouses) {
		this.lnk_women_Blouses = lnk_women_Blouses;
	}

	public WebElement getLnk_Dresses() {
		return lnk_Dresses;
	}

	public void setLnk_Dresses(WebElement lnk_Dresses) {
		this.lnk_Dresses = lnk_Dresses;
	}

	public WebElement getLnk_Dresses_CasualDresses() {
		return lnk_Dresses_CasualDresses;
	}

	public void setLnk_Dresses_CasualDresses(WebElement lnk_Dresses_CasualDresses) {
		this.lnk_Dresses_CasualDresses = lnk_Dresses_CasualDresses;
	}

	public WebElement getLnk_Dresses_EvngDresses() {
		return lnk_Dresses_EvngDresses;
	}

	public void setLnk_Dresses_EvngDresses(WebElement lnk_Dresses_EvngDresses) {
		this.lnk_Dresses_EvngDresses = lnk_Dresses_EvngDresses;
	}

	public WebElement getLnk_Dresses_SummerDresses() {
		return lnk_Dresses_SummerDresses;
	}

	public void setLnk_Dresses_SummerDresses(WebElement lnk_Dresses_SummerDresses) {
		this.lnk_Dresses_SummerDresses = lnk_Dresses_SummerDresses;
	}

	public WebElement getLnk_Tshirts() {
		return lnk_Tshirts;
	}

	public void setLnk_Tshirts(WebElement lnk_Tshirts) {
		this.lnk_Tshirts = lnk_Tshirts;
	}

	
	
	
	
	}

