package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.MonitorTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class MonitorExecutableClass extends MonitorTestClass {
	@BeforeTest
	public static void Intilize() {
		
		initialization();
		}
		@Test(priority = 1)
		public static void LoginAndOpenApplicationStep() {
			test = Report.startTest("Login And OpenApplication Step");
			LoginAndOpenApplication();
	}@Test(priority = 2)
		public static void Monitor1to5() {
			test = Report.startTest("Monitor1to5");
			Monitor1();
	}@Test(priority = 3)
	public static void Monitor6to7() {
		test = Report.startTest("Monitor6to7");
		Monitor2();
	}
	@Test(priority = 4)
	public static void Monitor8to9() {
		test = Report.startTest("Monitor8to9");
		Monitor3();
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
