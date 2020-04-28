package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Ekpc_esapTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Ekpc_esapExecutableClass extends Ekpc_esapTestClass {
	@BeforeTest
	public static void Initialization() {
		initialization();
	}

	@Test(priority = 1)
	public static void login() {
		test = Report.startTest("login");
		login("helper", "BaseURL", 3, 0, 3, 1);
	}
	@Test(priority = 2)
	public static void createnewenrollement() {
		test = Report.startTest("create new enrollement");
	createenrollment();
}
	@Test(priority = 3)
	public static void newenrollement() {
		test = Report.startTest("new enrollement");
	enrollmentapplication();
	}
	@Test(priority = 4)
	public static void newmeasure() {
		test = Report.startTest("new measure");
	measure();
	}
	@Test(priority = 5)
	public static void OverrideModule() {
		test = Report.startTest("Override Module");
		overrides();
	}
	@Test(priority = 6)
	public static void ApplicationStatus_Module() {
		test = Report.startTest("Application Status_Module Module");
		ApplicationStatus();
	}
	@Test(priority = 7)
	public static void JobCostSummaryValidation_Module() {
		test = Report.startTest("JobCost Summary Validation Module");
		JobCostSummaryValidation();
	}

	
	
@AfterMethod
public static void getStatusWithScreenshot(ITestResult result) throws IOException {
	if (result.getStatus() == ITestResult.FAILURE) {
		String screenShotPath = GetScreenShot.capture(driver);
		test.log(LogStatus.FAIL, result.getThrowable());
		test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	}
	Report.endTest(test);
}

@AfterTest
public static void Report() {
	generateReport();
}
}