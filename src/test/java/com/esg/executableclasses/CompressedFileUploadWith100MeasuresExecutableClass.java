package com.esg.executableclasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.CompressedFileUploadWith100MeasuresTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class CompressedFileUploadWith100MeasuresExecutableClass extends CompressedFileUploadWith100MeasuresTestClass{
	
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
	public static void UploadFileStep() throws AWTException {
		test = Report.startTest("Upload File");
		UploadFile();
	}
@Test(priority =3)
	public static void EnrollmentStep() {
		test = Report.startTest("Enrollment");
		Enrollment();
	}
	@Test(priority = 4)
	public static void SubMenuSummaryValidaitionProcess() {
		test = Report.startTest("SubMenu Summary Validaition Process");
		SubMenuSummaryValidaition();
	}
	@Test(priority = 5)
	public static void ApplicationMeasuresValidationProcess() {
		test = Report.startTest("Application Measures Validation Process");
		ApplicationMeasuresValidation();
	}
	@Test(priority = 6)
	public static void JobCostSummaryValidationProcess() {
		test = Report.startTest("Job Cost Summary Validation Process");
		 JobCostSummaryValidation();
	}
	@Test(priority = 7)
	public static void QAReview() {
		test = Report.startTest("QA Review");
		QAReviewProcess();
	}
	@Test(priority = 8)
	public static void InitiatePayment() {
		test = Report.startTest("Initiate Payment Process");
		InitiatePaymentProcess();
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