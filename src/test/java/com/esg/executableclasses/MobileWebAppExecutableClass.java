package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.MobileWebAppTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class MobileWebAppExecutableClass extends MobileWebAppTestClass {

	@BeforeTest
	public static void Initialization() {
		
		
		initialization();
	}
	@Test(priority = 1)
	public static void OpenURL() {
		test = Report.startTest("Login Page");
		OpenWebURL();
	}
	@Test(priority = 2)
	public static void ProgramLevelEligibityModule() {
		test = Report.startTest("ProgramLevel Eligibity Error Module");
			ProgramEligibiltyError();
	}
	@Test(priority = 3)
	public static void MeasureEligibilityModule() {
		test = Report.startTest("Measure Eligibity Error Module");
		MeasureEligibilityError();
	}
	@Test(priority = 4)
	public static void MeasurePropertyValidationErrorModule() {
		test = Report.startTest("Measure Property Validation Error Module");
		MeasurePropertyValidationError();
	}
	@Test(priority = 5)
	public static void AccountValidationErrorModule() {
		test = Report.startTest("Account Validation Error Module");
		AccountValidationError();
	}
	@Test(priority = 6)
	public static void ThresholdExceedModule() {
		test = Report.startTest("Threshold Exceed Module");
		ThresholdExceed();
	}
	@Test(priority = 7)
	public static void PositiveWorkflowModule() {
		test = Report.startTest("Positive Workflow Module");
		PositiveWorkflow();
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


