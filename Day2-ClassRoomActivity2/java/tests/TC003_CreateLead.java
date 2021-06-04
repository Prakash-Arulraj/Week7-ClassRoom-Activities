package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;

public class TC003_CreateLead extends TestNgHooks{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a new Lead on LeafTaps";
		nodes = "Leads";		
		dataSheetName="TC003";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String comnyName, String firstName, String lastName, String eMail){

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickCreateLead()
		.enterCompanyName(comnyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(eMail)
		.clickCreateLeadSubmit()		
		.verifyFirstName(firstName);			
	}
}
