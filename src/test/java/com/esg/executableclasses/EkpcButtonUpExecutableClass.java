package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.EkpcButtonUpTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class EkpcButtonUpExecutableClass extends EkpcButtonUpTestClass {

	@BeforeTest
	public static void Intilize() {

		initialization();
	}

	@Test(priority = 1)
	public static void LoginPage() {
		test = Report.startTest("Login");
		Login();
	}

	@Test(priority = 2)
	public static void CreateNewEnrollment() {
		test = Report.startTest("Create New Enrollment");
		Enrollment();
	}

	@Test(priority = 3)
	public static void LeadModule() {
		test = Report.startTest("Lead");
		Lead();
	}

	@Test(priority = 4)
	public static void NeedtoBeRammedModule() {
		test = Report.startTest("Need to be Rammed");
		NeedToBeRammed();
	}

	@Test(priority = 5)
	public static void ValidationMethod() {
		test = Report.startTest("Validation");
		Verification();
	}

	@Test(priority = 6)
	public static void InvoicingMethod() {
		test = Report.startTest("Invoicing");
		Invoicing();
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
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
