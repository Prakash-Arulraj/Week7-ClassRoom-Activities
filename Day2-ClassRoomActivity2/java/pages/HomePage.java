package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import hooks.TestNgHooks;

public class HomePage extends TestNgHooks{

	public HomePage(){
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Demo')]]")
	public WebElement eleLoggedName;

	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	public WebElement eleCRMSFALink;

	public MyHomePage clickCRMSFA(){
		click(eleCRMSFALink);
		return new MyHomePage();
	}

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogout() {
		click(eleLogOut);
		return new LoginPage();

	}
	
	

}










