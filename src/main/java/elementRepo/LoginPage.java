package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name") private WebElement userTextField;
	
	@FindBy(name = "user_password") private WebElement passwordTextField;
	
	@FindBy(id = "submitButton") private WebElement loginButton;

	public WebElement getUserTextField() {
		return userTextField;
	}

	public void setUserTextField(WebElement userTextField) {
		this.userTextField = userTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
	public void enterUserName(String userName) {
		userTextField.sendKeys(userName);
	}
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void loginToApplication(String userName, String password) {
		enterUserName(userName);
		enterPassword(password);
		clickOnLoginButton();
	}
}
