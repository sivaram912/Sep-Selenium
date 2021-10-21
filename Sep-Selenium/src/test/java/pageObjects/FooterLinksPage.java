package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterLinksPage {
	
	WebDriver driver;
	
	public FooterLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/h4")
	@CacheLookup
	WebElement lnk_Newsletter;
	
	@FindBy(id="newsletter-input")
	@CacheLookup
	WebElement lnk_Newsletter_Email;

	@FindBy(xpath="//*[@id=\"social_block\"]/h4")
	@CacheLookup
	WebElement lnk_Followus;

	@FindBy(xpath="//li[@class=\'facebook\']//a[@target='_blank']")
	@CacheLookup
	WebElement lnk_FB;
	
	@FindBy(xpath="//li[@class=\'twitter\']//a[@target='_blank']")
	@CacheLookup
	WebElement lnk_Twitter;
	
	@FindBy(xpath="//li[@class=\'youtube\']//a[@target='_blank']")
	@CacheLookup
	WebElement lnk_Youtube;
	
	@FindBy(xpath="//li[@class='google-plus']//a[@target='_blank']")
	@CacheLookup
	WebElement lnk_gplus;
	
	@FindBy(xpath="//section[@class=\"blockcategories_footer footer-block col-xs-12 col-sm-2\"]//h4")
	@CacheLookup
	WebElement lnk_Categories;
	
	@FindBy(xpath="//div//li[@class='last']//a[contains(text(),'Women')]")
	@CacheLookup
	WebElement lnk_womenunderCategories;
	
	
	
	
	
}
