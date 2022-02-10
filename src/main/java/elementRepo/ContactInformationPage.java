package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
	public ContactInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "mouseArea_Last Name")  private WebElement lastName;

	public WebElement getLastNmae() {
		return lastName;
	}

	public void setLastNmae(WebElement lastNmae) {
		this.lastName = lastNmae;
	}
	
	public String textInLastname() {
		return lastName.getText();
	}
	
}
