package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import hooks.TestNgHooks;


public class CreateLeadPage extends TestNgHooks {


	public CreateLeadPage(){
			PageFactory.initElements(getDriver(), this);		
	}


	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyName;

	public CreateLeadPage enterCompanyName(String comnyName){
		clearAndType(companyName, comnyName);
		return this;

	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String firstName){
		clearAndType(eleFirstName, firstName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage enterLastName(String lastName){
		clearAndType(eleLastName, lastName);
		return this;

	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadSubmit;
	public ViewLeadPage clickCreateLeadSubmit(){
		click(eleCreateLeadSubmit);
		return new ViewLeadPage();
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public CreateLeadPage enterEmail(String eMail){
		clearAndType(eleEmail, eMail);
		return this;
	}
}
