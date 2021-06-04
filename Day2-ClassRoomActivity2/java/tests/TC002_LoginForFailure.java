package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;

public class TC002_LoginForFailure extends TestNgHooks{

	@BeforeTest
	public void setValues() {

		testCaseName = "Login(Negative)";
		testDescription = "Login for Failure(Negative testCase)";
		nodes = "Leads";
		authors = "Babu";
		category = "Smoke";
		dataSheetName = "TC002";

	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd, String errMsg) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogInForFailer()
		.verifyErrorMsg(errMsg);
	}


}





