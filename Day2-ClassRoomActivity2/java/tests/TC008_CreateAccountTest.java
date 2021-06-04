package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;

public class TC008_CreateAccountTest extends TestNgHooks {
	
	@BeforeTest
	public void createAccount() {
		testCaseName = "Create Accounts To Leaftaps App";
		testDescription = "Create New Accounts";
		nodes = "Accounts";
		authors = "Prakash";
		category = "Smoke";
		dataSheetName = "TC001";
	}
	@Test(dataProvider = "fetchData")
	public void createLeaf(String username, String password , String accountname, String number) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickAccounts()
		.clickCreateAccount()
		.enterAccountName(accountname)
		.enterPhoneNumber(number);
		
	}


}
	
	


