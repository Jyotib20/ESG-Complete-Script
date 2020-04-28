package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.ConsolidatedStatusCheckTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class ConsolidatedStatusCheckExecutableClass extends ConsolidatedStatusCheckTestClass{
	@BeforeTest 
	public static void Intilize() {
		
	initialization();
	}
	@Test(priority = 1)
	public static void LoginStep() {
		test = Report.startTest("Login");
		Login();
}
	@Test(priority = 2)
	public static void Account() {
		test = Report.startTest("Account");
		AccountModule();
	}	@Test(priority = 3)
	public static void Email() {
		test = Report.startTest("Email");
		EmailModule();
	}
	@Test(priority = 4)
	public static void Phone() {
		test = Report.startTest("Phone");
		PhoneModule();
	}
	@Test(priority = 5)
	public static void Enrollment() {
		test = Report.startTest("Enrollment");
		EnrollmentModule();
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