package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import hooks.TestNgHooks;

public class LoginPage extends TestNgHooks{
	
	public LoginPage(){
		PageFactory.initElements(getDriver(), this);
	}
	 
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	@FindBy(how=How.ID, using = "errorDiv")
	private WebElement eleVerifyErrMsg;
	
	
	@Given("Enter the username as (.*)")
	public LoginPage enterUserName(String data) {	
		clearAndType(eleUserName, data);
		return this;
	}	

	@Given("Enter the Password as (.*)")
	public LoginPage enterPassword(String data) {
		clearAndType(elePassword, data);
		return this;
	}	
	
	@Given("Click on the Login")
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage();		
	}
	
	public LoginPage clickLogInForFailer() {
		click(eleLogin);
		return this;		
	}
	
	@Given("Verify the error message (.*)")
	public LoginPage verifyErrorMsg(String data) {
		verifyPartialText(eleVerifyErrMsg, data);
		return this;
	}
	
	
}
