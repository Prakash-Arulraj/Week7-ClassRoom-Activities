package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import hooks.TestNgHooks;


public class EditLeadPage extends TestNgHooks {


	public EditLeadPage(){
		
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleupdateCompanyName;
	public EditLeadPage updateCompanyName(String updcomnyName){
		clearAndType(eleupdateCompanyName, updcomnyName);
		return this;

	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleUpdateSubmit;
	public ViewLeadPage clickUpdateSubmit(){
		click(eleUpdateSubmit);
		return new ViewLeadPage();
	}

}

