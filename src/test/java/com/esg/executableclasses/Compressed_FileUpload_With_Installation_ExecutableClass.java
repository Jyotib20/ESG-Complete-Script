package com.esg.executableclasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Compressed_FileUpload_With_Installation_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Compressed_FileUpload_With_Installation_ExecutableClass extends Compressed_FileUpload_With_Installation_TestClass {

	
	@BeforeTest
	public static void InitilizationModule() {
		initialization();
	}
	@Test(priority=1)
	public static void LoginModule() {
		test = Report.startTest("Login Module");
		login("helper", "BaseURL", 1, 0, 1, 1);
	}
	@Test(priority=2)
	public static void Upload() {
		test = Report.startTest("Upload Method");
		try {
			UploadFile();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	@Test(priority=3)
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
	public static void JobCostSummaryValidationModule() {
		test = Report.startTest("Job Cost Summary Validation Module");
		JobCostSummaryValidation();
	}
	@Test(priority = 7)
	public static void InvoicingModule() {
		test = Report.startTest("Invoicing Validation Module");
		Invoicing();
	}
	@Test(priority = 8)
	public static void GenerateInvoiceModule() {
		test = Report.startTest("Generate Invoice Module");
		GenerateInvoice();
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
