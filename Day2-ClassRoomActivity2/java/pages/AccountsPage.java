package pages;

import hooks.TestNgHooks;

public class AccountsPage extends TestNgHooks {
	
	public CreateAccountPage clickCreateAccount() {
		click(locateElement("link","Create Account"));
		return new CreateAccountPage();
	}

}
