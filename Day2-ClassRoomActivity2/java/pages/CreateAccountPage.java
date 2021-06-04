package pages;

import hooks.TestNgHooks;

public class CreateAccountPage extends TestNgHooks {
	
	public CreateAccountPage enterAccountName(String accountname) {
		clearAndType(locateElement("id", "accountName"), accountname);
		return this;
	}
	public CreateAccountPage enterPhoneNumber(String number) {
		clearAndType(locateElement("id", "primaryPhoneNumber"), number);
		return this;
	}
	public AccountDetailsPage clickSubmitAccount() {
		click(locateElement("xpath", "//input[@value='Create Account']"));
		return new AccountDetailsPage();
	}

	

}
