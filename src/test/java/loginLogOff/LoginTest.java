package loginLogOff;

import elementRepo.LoginPage;
import genericUtility.BaseClassUtility;

public class LoginTest extends BaseClassUtility{
	
	public void login() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(fileUtil.getPropertyFromKey("userName"), fileUtil.getPropertyFromKey("password"));
	}
	
}
