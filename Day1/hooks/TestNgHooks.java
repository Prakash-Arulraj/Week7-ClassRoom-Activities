package hooks;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import wrappers.BaseDriver;

public class TestNgHooks extends BaseDriver {

	@BeforeSuite
	public void init() {
		// start reporting
	}

	@BeforeTest
	public void setUpTests() {
		// later, lets do it!!
	}

	@BeforeClass
	public void beforClass() {
		// later, lets do it !!
	}

	@BeforeMethod
	public void invoke() {
		// starting the application
		startApp("chrome", "http:/leaftaps.com/opentaps");
	}

	@AfterMethod
	public void close() {
		// close the browser
		closeActiveBrowser();
	}

	@AfterClass
	public void afterClass() {
		// later, lets do it !!
	}

	@AfterTest
	public void completeTests() {
		// later, lets do it !!
	}

	@AfterSuite
	public void tearDown() {
		// publish the report
	}

}
