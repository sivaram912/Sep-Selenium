package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[@class=\'page-heading bottom-indent\']")
	private WebElement Rtxt_CSCONTACTUS;
	
	@FindBy(xpath="//select[@id='id_contact']//option[@value='2']")
	private WebElement txt_SubHeadforCustomerService;
	
	@FindBy(xpath="//select[@id='id_contact']//option[@value='2']")
	private WebElement CSCONTACTUS_EmailAddress;
	
	@FindBy(xpath="//input[@class=\'form-control grey\']")
	private WebElement CSCONTACTUS_OrderRef;
	
	@FindBy(id="message")
	private WebElement CSCONTACTUS_MessageBox;
	
	@FindBy(xpath="//div[@class='submit']//button[@type='submit']")
	private WebElement CSCONTACTUS_Sendbtn;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement CSCONTACTUS_SuccessMassage;
	
	@FindBy(xpath="//li[text()='The message cannot be blank.']")
	private WebElement CSCONTACTUS_ErrorMassage;

	public WebElement getCSCONTACTUS_EmailAddress() {
		return CSCONTACTUS_EmailAddress;
	}

	public void setCSCONTACTUS_EmailAddress(String val) {
		CSCONTACTUS_EmailAddress.sendKeys(val);
	}

	public WebElement getCSCONTACTUS_OrderRef() {
		return CSCONTACTUS_OrderRef;
	}

	public void setCSCONTACTUS_OrderRef(String val) {
		CSCONTACTUS_OrderRef.sendKeys(val);;
	}

	public WebElement getRtxt_CSCONTACTUS() {
		return Rtxt_CSCONTACTUS;
	}

	public WebElement getTxt_SubHeadforCustomerService() {
		return txt_SubHeadforCustomerService;
	}

	public WebElement getCSCONTACTUS_Sendbtn() {
		return CSCONTACTUS_Sendbtn;
	}

	public WebElement getCSCONTACTUS_SuccessMassage() {
		return CSCONTACTUS_SuccessMassage;
	}

	public WebElement getCSCONTACTUS_ErrorMassage() {
		return CSCONTACTUS_ErrorMassage;
	}

	public WebElement getCSCONTACTUS_MessageBox() {
		return CSCONTACTUS_MessageBox;
	}

	public void setCSCONTACTUS_MessageBox(String cSCONTACTUS_MessageBox) {
		CSCONTACTUS_MessageBox.sendKeys(cSCONTACTUS_MessageBox);;
	}
	
}
