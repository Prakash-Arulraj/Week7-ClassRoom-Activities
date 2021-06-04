package pages;

import hooks.TestNgHooks;

public class AccountDetailsPage extends TestNgHooks {

	public AccountDetailsPage verifyAccountDetails() {
		verifyPartialText(locateElement("id", "sectionHeaderTitle_accounts"), "Account Details");
		return this;

	}

}
