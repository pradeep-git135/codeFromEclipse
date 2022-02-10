package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebdriverUtility;

public class HomePage extends WebdriverUtility{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement administraterIcon;
	@FindBy(xpath = "//a[text() = 'Sign Out']") private WebElement signoutLink;
	@FindBy(xpath = "//a[text() = 'Contacts']") private WebElement contactsLink;
	
	public WebElement getAdministraterIcon() {
		return administraterIcon;
	}
	public void setAdministraterIcon(WebElement administraterIcon) {
		this.administraterIcon = administraterIcon;
	}
	public WebElement getSignoutLink() {
		return signoutLink;
	}
	public void setSignoutLink(WebElement signoutLink) {
		this.signoutLink = signoutLink;
	}
	
	public void logoutFromApp() {
		mousehoverAndClick(driver,administraterIcon,signoutLink);
	}
	public WebElement getContactsLink() {
		return contactsLink;
	}
	public void setContactsLink(WebElement contactsLink) {
		this.contactsLink = contactsLink;
	}
	public void clickOnContactsLink() {
		contactsLink.click();
	}

}
