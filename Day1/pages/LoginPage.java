package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import hooks.TestNgHooks;

public class LoginPage extends TestNgHooks {

	public LoginPage typeUsername(String Username) {
		WebElement element = locateElement("id", "username");
		type(element, Username);
		return this;
	}

	public LoginPage typePassword(String password) {
		type(locateElement("id", "password"), password);
		return this;
	}

	public HomePage directLogin(String password) {
		typeAndEnter(locateElement("id", "password"), password);
		return new HomePage();
	}

	public HomePage clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
		return new HomePage();
	}

	public LoginPage loginFailure() {
		click(locateElement("class", "decorativeSubmit"));
		return this;
	}

}
