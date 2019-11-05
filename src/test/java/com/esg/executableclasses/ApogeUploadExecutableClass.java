package com.esg.executableclasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.ApogeUploadTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class ApogeUploadExecutableClass extends ApogeUploadTestClass {
	@BeforeTest
	public static void Intilize() {
	initialization();
	}
	@Test(priority = 1)
	public static void LoginStep() {
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
	public static void VerifyApogeeWithModifiedFilesStep(){
		test = Report.startTest("Verify Apogee With Modified Files Step");
		VerifyApogeeWithModifiedFiles();
	}
	@Test(priority = 5)
	public static void VerifyApogeeWithoutModifiedFilesStep() throws AWTException {
		test = Report.startTest("Verify Apogee Without Modified Files Step");
		UploadFile2();
		Enrollment2();
		VerifyApogeeWithoutModifiedFiles();
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
