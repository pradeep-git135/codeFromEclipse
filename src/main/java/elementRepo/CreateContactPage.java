package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
	public CreateContactPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "lastname") private WebElement lastNmaeTextfileld;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']") private WebElement saveButton;

	public WebElement getLastNmaeTextfileld() {
		return lastNmaeTextfileld;
	}

	public void setLastNmaeTextfileld(WebElement lastNmaeTextfileld) {
		this.lastNmaeTextfileld = lastNmaeTextfileld;
	}
	
	public void enterLastName(String lastName) {
		lastNmaeTextfileld.sendKeys(lastName);;
	}
	public void clickOnSaveButton() {
		saveButton.click();
	}

}
