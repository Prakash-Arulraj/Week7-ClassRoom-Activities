package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;

public class LoginPage extends TestNgHooks {
	
	@Test
	public void login() {
		new pages.LoginPage()
			.typeUsername("DemoSalesManager")
			.typePassword("crmsfa")
			.clickLogin()
			.verifyLogin()
			.clickLogout();
			
		
	}

}
