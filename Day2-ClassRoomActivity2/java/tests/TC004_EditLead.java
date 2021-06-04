package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;



public class TC004_EditLead extends TestNgHooks{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit excisting Lead on LeafTaps";
		nodes = "Leads";
		dataSheetName="TC004";
		category="Sanity";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password , String f_Name, String updcompanyName){

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickFindLead()
		.enterFirstName(f_Name)
		.clickFindleadsButton()
		.clickFirstResultingLead()
		.clickEditLeadLink()
		.updateCompanyName(updcompanyName)
		.clickUpdateSubmit()
		.verifyCompanyName(updcompanyName);
		
	}

}
