package com.esg.executableclasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esg.testclasses.SingleFileUploadTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class SingleFileUploadExecutableClass extends SingleFileUploadTestClass {

	@BeforeClass
	public static void Initialize() {
		initialization();
	}
	@Test(priority = 1)
	public static void Login_Module() {
		test = Report.startTest("Login_Module");
		Login();
	}
	@Test(priority = 2)
	public static void UploadFile_Module() {
		test = Report.startTest("UploadFile Module");
		try {
			UploadFile();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}
	@Test(priority = 3)
	public static void EnrollmentModule() {
		test = Report.startTest("Enrollment Module");
		Enrollment();
	}
	@Test(priority = 4)
	public static void ApplicationValidationModule() {
		test = Report.startTest("Application Validation Module");
		ApplicationValidation();
	}
	@Test(priority = 5)
	public static void InstallationValidationModule() {
		test = Report.startTest("Installation Validation Module");
		InstallationValidation();
	}
	@Test(priority = 6)
	public static void InvoicingModule() {
		test = Report.startTest("Invoicing Validation Module");
		Invoicing();
	}
	@Test(priority = 7)
	public static void GenerateInvoiceModule() {
		test = Report.startTest("Generate Invoice Module");
		GenerateInvoice();
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