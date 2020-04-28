package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.InspectionProcessingTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class InspectionProcessingExecutableClass extends InspectionProcessingTestClass {
	
	@BeforeTest
	public static void Intilize() {
		
		initialization();
		}
		@Test(priority = 1)
		public static void LoginStep() {
			test = Report.startTest("Login Step");
			LoginPage();
			Enrollment();
	}
	/*@Test(priority = 2)
	public static void Inspection() {
			test = Report.startTest("Inspection");
			InspectionCGIModule();
			InspectionRefusedModule();
			InspectionCancelModule();
	}
	 @Test(priority = 3)
	public static void CorrectionModule() {
			test = Report.startTest("Correction");
			CorrectionCGIModule();
			CorrectionRefusedModule();
			CorrectionCancelModule();
			CorrectionNotCompletedModule();
	}
	 @Test(priority = 4)
	public static void ReInspectionModule() {
		test = Report.startTest("ReInspection");
		ReInspectionCGIModule();
		ReInspectionRefusedModule();
		ReInspectionCancelModule();
	}
	 @Test(priority = 5)
	public static void CorrectionStepDisabledAllFailModule() {
		test = Report.startTest("Correction Step Disabled AllFail");
		CorrectionStepDisabledAllFail();
		CorrectionStepDisabledPartialFail();
		
	}
	 @Test(priority = 6)
	public static void FailCodeNocorrectionRequiredModule() {
		test = Report.startTest("FailCode No correction Required");
		FailCodeNoCorrectionRequired();
	}*/
	   @Test(priority = 7)
	public static void PositiveWorkflows() {
		test = Report.startTest("Positive Workflow");
		PositiveCorrectionAndReInspection();
		PositiveInspectionNoCorrectionNeeded();
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
