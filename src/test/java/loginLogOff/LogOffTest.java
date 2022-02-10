package loginLogOff;

import elementRepo.HomePage;
import genericUtility.BaseClassUtility;

public class LogOffTest extends BaseClassUtility {
	public void logout() {
		HomePage hp = new HomePage(driver);
		hp.logoutFromApp();
	}

}
