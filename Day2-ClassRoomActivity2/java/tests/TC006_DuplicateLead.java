package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.FindLeadPage;
import pages.LoginPage;



public class TC006_DuplicateLead extends TestNgHooks{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate a Lead - LeafTaps";
		nodes = "Leads";
		dataSheetName="TC006";
		category="Regression";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String password ,String emailAddress) throws InterruptedException{

		String fName=
			new LoginPage()
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()		
				.clickCRMSFA()		
				.clickLeadLink()		
				.clickFindLead()
				.clickEmailTab()
				.enterEmailAddress(emailAddress)
				.clickFindleadsButton()
				.getFirstResultingFirstName();
			new FindLeadPage()
				.clickFirstResultingLead()
				.clickDuplicateLeadLink()
				.clickCreateLeadDublicate()
				.verifyFirstName(fName);

	}

}
