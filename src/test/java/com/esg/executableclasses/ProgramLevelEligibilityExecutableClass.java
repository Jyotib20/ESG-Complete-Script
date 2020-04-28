package com.esg.executableclasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.ProgramLevelEligibilityTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class ProgramLevelEligibilityExecutableClass extends ProgramLevelEligibilityTestClass {

	
	@BeforeTest
	public static void Intilize() {
	
	initialization();
	}
	@Test(priority = 1)
	public static void OnlineApplication() throws AWTException, InterruptedException {
		test = Report.startTest("Online Application");
		Online();
	}
	@Test(priority = 2)
	public static void bacakendOnlineApplication1() {
		test = Report.startTest("Backend Online Application");
		BackendOnlineApplication();
	}
	@Test(priority = 3)
	public static void BackendWithCustomer1() throws AWTException {
		test = Report.startTest("Backend With Customer");
		BackendWithCustomer();
	}
	@Test(priority = 4)
	public static void BackendWithoutCustomer1() throws InterruptedException, AWTException {
		test = Report.startTest("Backend Without Customer");
		BackendWithoutCustomer();
	}
	@AfterMethod
	 public void getResult(ITestResult result) throws IOException
	    {
	        if(result.getStatus() == ITestResult.FAILURE)
	        {
	            String screenShotPath = GetScreenShot.capture(driver);
	            test.log(LogStatus.FAIL, result.getThrowable());
	            test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	        }
	        Report.endTest(test);
	    }

	@AfterTest
	 public static void Generate() {
		 
		generateReport();
	 }
}
