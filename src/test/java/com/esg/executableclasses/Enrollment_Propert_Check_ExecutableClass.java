package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Enrollment_Propert_Check_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Enrollment_Propert_Check_ExecutableClass extends Enrollment_Propert_Check_TestClass {

	@BeforeTest
	public static void Initialization() {
		
		initialization();
	}
	@Test(priority = 1)
	public static void LoginPage() {
		test = Report.startTest("Login Page");
		login("helper", "BaseURL", 1, 0, 1, 1);
	}
	@Test(priority = 2)
	public static void CreateNewEnrollmentModule() {
		test = Report.startTest("Create NewEnrollment");
		CreateNewEnrollment();
	}
	@Test(priority = 3)
	public static void AddMeasure_Module() {
		test = Report.startTest("AddMeasure");
		AddMeasure();
	}
	@Test(priority = 4)
	public static void EnrollmentPropertyFieldsValidation_Module() {
		test = Report.startTest("Enrollment Property Fields Validation");
		EnrollmentPropertyFieldsValidation();
	}
	@Test(priority = 5)
	public static void SetPropertyFieldsValidation_Module() {
		test = Report.startTest("Set Property Fields Validation");
		SetPropertyFieldsValidation();
	}
	@Test(priority = 6)
	public static void ApplicationFillUp_Module() {
		test = Report.startTest("Application FillUp");
		ApplicationFillUp();
	}
	@Test(priority = 7)
	public static void ApplicationDetailsValidationAfterSaveModule() {
		test = Report.startTest("Application Details Validation After Save");
		ApplicationDetailsValidationAfterSave();
	}
	@Test(priority = 8)
	public static void EnrollmentPropertyFieldsValidationAfterProcess_Module() {
		test = Report.startTest("Enrollment Property Fields Validation After Process");
		EnrollmentPropertyFieldsValidationAfterProcess();
	}
	@Test(priority = 9)
	public static void SetPropertyFieldsValidationAfterProcess_Module() {
		test = Report.startTest("Set Property Fields Validation After Process");
		SetPropertyFieldsValidationAfterProcess();
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