package contacts;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepo.ContactInformationPage;
import elementRepo.ContactPage;
import elementRepo.CreateContactPage;
import genericUtility.BaseClassUtility;
import genericUtility.JavaUtility;

public class CreateContactTest extends BaseClassUtility {
	public ContactPage cp;
	public CreateContactPage cct;

	@Test
	public void createContact() {

		hp.clickOnContactsLink();
		cp = new ContactPage(driver);
		cp.clickOnCreateImage();
		cct = new CreateContactPage(driver);
		JavaUtility javautil = new JavaUtility();
		cct.enterLastName("cr"+javautil.getRandomNum());
		cct.clickOnSaveButton();
		ContactInformationPage contactInfo = new ContactInformationPage(driver);
		String lastName = contactInfo.textInLastname();
		Assert.assertTrue(lastName.contains("cr"));;

	}
}
