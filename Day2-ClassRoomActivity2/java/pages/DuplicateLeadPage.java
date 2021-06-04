package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import hooks.TestNgHooks;



public class DuplicateLeadPage extends TestNgHooks {


	public DuplicateLeadPage(){
		PageFactory.initElements(getDriver(), this);	
	}


	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadDublicate;
	public ViewLeadPage clickCreateLeadDublicate(){
		click(eleCreateLeadDublicate);
		return new ViewLeadPage();
	}
}
