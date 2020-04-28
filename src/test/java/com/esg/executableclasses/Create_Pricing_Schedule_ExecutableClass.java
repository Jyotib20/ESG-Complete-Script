/*package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Create_Pricing_Schedule_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Create_Pricing_Schedule_ExecutableClass extends Create_Pricing_Schedule_TestClass {

	@BeforeTest
	public static void Initialization() {
		
		initialization();
	}
	@Test(priority = 1)
	public static void LoginMethod() {
		test = Report.startTest("Login Method");
		login("Helper","BaseURL", 1, 0, 1, 1);
	}
	@Test(priority = 2)
	public static void Navigate_TO_Programs() {
		test = Report.startTest("Navigate_TO_Programs");
		Navigate_To_Program_Page();
	}
	@Test(priority = 3)
	public static void Create_New_Schedule_Step()  {
		test = Report.startTest("Create New Schedule Step");
		Create_New_Schedule();
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
*/