package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import hooks.TestNgHooks;




public class MyHomePage extends TestNgHooks {

	public MyHomePage(){
		PageFactory.initElements(getDriver(), this);	
	}

	@FindBy(how=How.LINK_TEXT,using="Leads")
	public WebElement eleLeadLink;
	// Click Leads 
	public MyLeadsPage clickLeadLink(){
		click(eleLeadLink);
		return new MyLeadsPage();
	}
	public AccountsPage clickAccounts() {
		click(locateElement("link","Accounts"));
		return new AccountsPage();
		
	}


}
