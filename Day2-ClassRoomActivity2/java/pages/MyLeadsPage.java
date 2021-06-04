package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import hooks.TestNgHooks;



public class MyLeadsPage extends TestNgHooks {

	public MyLeadsPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreateLead;
	// Click Create Leads 
	public CreateLeadPage clickCreateLead(){
		click(elecreateLead);
		return new CreateLeadPage();
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	public WebElement elefindLead;
	
	public FindLeadPage clickFindLead(){
		click(elefindLead);
		return new FindLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	public WebElement elemergeLead;
	
	public MergeLeadPage clickMergeLead(){
		click(elemergeLead);		
		return new MergeLeadPage();
	}
	
	

}
