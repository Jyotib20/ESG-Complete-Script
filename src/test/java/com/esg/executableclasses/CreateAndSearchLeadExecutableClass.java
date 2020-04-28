package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.CreateAndSearchLeadTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class CreateAndSearchLeadExecutableClass extends CreateAndSearchLeadTestClass {
	@BeforeTest
	public static void Initialization() {
				initialization();
			}
	@Test(priority=1)
	public static void CreateAndSearchLead_Login() {
		 test=Report.startTest("Login EECP");
		    login(); 
	
	}
	@Test(priority=2)
	public static void CreateAndSearchLead_CreateNewLead() {
		    test=Report.startTest("CreateAndSearchLead_CreateNewLead");
		    Navigate_To_LeadDetailsPage(); 
		    Create_Lead();
		    Search_Lead();
		}
	@AfterMethod
	public static void getStatusWithScreenshot(ITestResult result) throws IOException
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
	public static void Report() {
				generateReport();
			}
}
