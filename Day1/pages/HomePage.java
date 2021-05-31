package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import hooks.TestNgHooks;


public class HomePage extends TestNgHooks{
	
	public HomePage verifyLogin() {
		verifyPartialText(locateElement("tag", "h2"), "Welcome");
		return this;
	}
	public LoginPage clickLogout() {
		click(locateElement("class", "decorativeSubmit"));
		return new LoginPage();
	}

}
