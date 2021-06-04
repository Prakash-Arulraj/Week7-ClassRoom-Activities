package week7.day2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Reporter {

	public static void main(String[] args) throws IOException {
		String date = new SimpleDateFormat("dd-MMM-yy").format(new Date());
		File folder = new File("./reports/"+date);
		if (!folder.exists()) {
			folder.mkdir();
			
		}
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		File src = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(	src, new File(folder+"/snap2.png"));


		//step 1: create an Extent Report Object
		ExtentReports extent = new ExtentReports();
		
		//step 2: create an Object html report path and attach extent report
		ExtentHtmlReporter spark = new ExtentHtmlReporter(new File(folder+"/index.html"));
		spark.setAppendExisting(true);
		extent.attachReporter(spark);
		
		
		
		//step 3: test case name
		ExtentTest test = extent.createTest("create lead");
		test.assignAuthor("Prakash");
		test.assignCategory("Smoke");
		
		//step 4: test iteration
		ExtentTest node = test.createNode("iteration 2");
		MediaEntityModelProvider snap = MediaEntityBuilder.createScreenCaptureFromPath("./snap2.png").build();
		
		//step 5: test step pass/fail
		node.log(Status.PASS, "The create lead link is clicked",snap);
		node.log(Status.PASS, "the company name is entered");
		node.log(Status.PASS, "the first name is entered");
		node.log(Status.PASS, "the last name is entered");
		node.log(Status.PASS, "the create lead button is clicked");
		
		//step 6: test report publish
		extent.flush();
		

	}

}
