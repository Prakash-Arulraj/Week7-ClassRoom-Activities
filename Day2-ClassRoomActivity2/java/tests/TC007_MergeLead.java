package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.FindLeadPopPage;
import pages.LoginPage;



public class TC007_MergeLead extends TestNgHooks {

	@BeforeTest
	public void setValues(){
		testCaseName = "TC007_MergeLead";
		testDescription = "Merge two Lead on LeafTaps";
		nodes = "Leads";
		dataSheetName = "TC007";
		category = "Regression";
		authors = "Babu";		
	}

	@Test(dataProvider = "fetchData")
	public void mergeLead(String uName, String pwd,String f_LeadName,String l_LeadName, String errorMsg){
		String fromLeadId = 
			new LoginPage()
				.enterUserName(uName)
				.enterPassword(pwd)
				.clickLogin()
				.clickCRMSFA()
				.clickLeadLink()
				.clickMergeLead()
				.clickFromLeadLookup()
				.enterFirstName( f_LeadName)
				.clickFindleadsButton()
				.getFirstResultingLead();
			new FindLeadPopPage()
				.clickResultingLeads()
				.clickToLeadLookup()
				.enterFirstName( l_LeadName)
				.clickFindleadsButton()
				.clickResultingLeads()
				.clickMergeButton()
				.clickFindLead()
				.enterLeadId(fromLeadId)
				.clickFindleadsButton()
				.verifyErrorMsg(errorMsg);

	}


}










