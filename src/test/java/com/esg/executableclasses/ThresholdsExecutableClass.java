package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.ThresholdsTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class ThresholdsExecutableClass extends ThresholdsTestClass{
	@BeforeTest()
	public static void Initialization() {
		initialization();
	}
	@Test(priority = 1)
	public static void Thresholds_Login() {
		login();
	}

	@Test(priority = 2, invocationCount = 8)
	public static void Thresholds_Inspections() {
		test = Report.startTest("Thresholds_Inspections");
		NavigateToEnrollment(2, 1, 3, 1,"Customer");
		Process_Application();
		Verify_PreInspection_KickOff();
		Complete_Installation();
		Verify_Post_Inspection_KickOff();
	}
	
	@Test(priority = 3, invocationCount = 4)
	public static void Thresholds_ProgramYearMeasures() {
		test = Report.startTest("Thresholds_ProgramYearMeasures");
		Program_Percent();
		Measure_Percent();
		Not_Necessary();
		Mandatory();
	}
	
	@Test(priority = 4, invocationCount = 4)
	public static void Thresholds_QAReview_by_ApplicationProcessor() {
		test = Report.startTest("Thresholds_QAReview_by_ApplicationProcessor");
		Zero_Percent();
		Fifty_Percent();
		Hundred_Percent();
	}
	
	
	
	@AfterMethod()
	public static void getStatusWithScreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = GetScreenShot.capture(driver);
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		}
		Report.endTest(test);
	}

	@AfterTest()
	public static void Report() {
		generateReport();
	}

}
