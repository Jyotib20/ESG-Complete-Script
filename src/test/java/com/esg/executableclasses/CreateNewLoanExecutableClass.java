package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.CreateNewLoanTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class CreateNewLoanExecutableClass extends CreateNewLoanTestClass{
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
	public static void CreateLoanModule() {
		test = Report.startTest("Create Loan Module");
		CreateLoan();
}
	@Test(priority = 3)
	public static void LoanSearch() {
		test = Report.startTest("Loan Search");
		LoanSearchMoudle();
		
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