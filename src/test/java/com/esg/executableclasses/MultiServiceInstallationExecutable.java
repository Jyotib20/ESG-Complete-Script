package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.MultiServiceInstallationTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class MultiServiceInstallationExecutable extends MultiServiceInstallationTestClass{
	@BeforeTest
	public static void Initialization() {
		
		initialization();
	}
	
	@Test(priority = 1)
	public static void LoginClass() {
		test = Report.startTest("LoginClass");
		LogintoPage();
	}
	@Test(priority = 2)
	public static void Enrollment() {
		test = Report.startTest("Enrollment");
		CreateEnrollment();
	}
	@Test(priority = 3)
	public static void Application() {
		test = Report.startTest("Application");
		Application1();
	}
	
	@Test(priority = 4)
	public static void Measure() {
		test = Report.startTest("Measure");
		Measures3();
	}
	@Test(priority = 5)
	public static void InstallationProcess() {
		test = Report.startTest("InstallationProcess");
		Installation();
	}
	@Test(priority = 6)
	public static void JobCostSummary() {
		test = Report.startTest("JobCostSummary");
		JobCostSummaryStep();
	}
	@Test(priority = 7)
	public static void InspectionProcess() {
		test = Report.startTest("InspectionProcess");
		Inspection();
	}
	@Test(priority = 8)
	public static void CorrectionStep() {
		test = Report.startTest("CorrectionStep");
		Correction1();
		Correction2();
		Correction3();
	}
	@Test(priority = 9)
	public static void ReinspectionProcess() {
		Reinspection();
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

