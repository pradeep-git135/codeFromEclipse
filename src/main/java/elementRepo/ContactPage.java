package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Contact...']") private WebElement contactImage;

	public WebElement getContactImage() {
		return contactImage;
	}

	public void setContactImage(WebElement contactImage) {
		this.contactImage = contactImage;
	}
	
	public void clickOnCreateImage() {
		contactImage.click();
	}
	
	

}
