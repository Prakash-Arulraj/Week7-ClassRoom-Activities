package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.FindLeadPage;
import pages.LoginPage;



public class TC005_DeleteLead extends TestNgHooks{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete a Lead - LeafTaps";
		nodes = "Leads";
		dataSheetName="TC005";
		category="Sanity";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String phoneNum,String errorMsg){

		String firstResultingLead =
			new LoginPage()
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()
				.clickCRMSFA()
				.clickLeadLink()		
				.clickFindLead()
				.clickPhoneTab()
				.enterPhoneNumberField(phoneNum)
				.clickFindleadsButton()
				.getFirstResultingLead();
		
			new FindLeadPage()
				.clickFirstResultingLead()
				.clickDeleteLeadLink()
				.clickFindLead()
				.enterLeadId(firstResultingLead)
				.clickFindleadsButton()
				.verifyErrorMsg(errorMsg);
	}
}
