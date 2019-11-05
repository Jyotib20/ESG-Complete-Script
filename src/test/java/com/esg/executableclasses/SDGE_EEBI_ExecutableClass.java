package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.SDGE_EEBI_TestClasses;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class SDGE_EEBI_ExecutableClass extends SDGE_EEBI_TestClasses{
	
@BeforeTest
public static void Initialization() {
			initialization();
		}
@Test(priority=1)
public static void SDGE_EEBI_Login() {
	    login(); 
	}
@Test(priority=2)
public static void SDGE_EEBI_CreateEnrollment() {
    test=Report.startTest("SDGE_EEBI_CreateEnrollment");
    NavigateToEnrollment(); 
}
@Test(priority=3)
public static void SDGE_EEBI_Application() {
	    test=Report.startTest("SDGE_EEBI_Application");
	    CompleteApplicationWorkflowStep();
	    CompleteMeasureAndProcessApplication();
	}
@Test(priority=4)
public static void SDGE_EEBI_Pre_Inspection() {
	    test=Report.startTest("AusSolarPV_Pre_Inspection");
	    Process_Pre_InspectionWorkflowStep();
	}
@Test(priority=5)
public static void SDGE_EEBI_Pre_Engineering() {
	    test=Report.startTest("SDGE_EEBI_Pre_Engineering");
	    Process_Pre_EngineeringWorkflowStep();
	}
@Test(priority=6)
public static void SDGE_EEBI_Installation() {
	    test=Report.startTest("SDGE_EEBI_Installation");
	    Process_InstallationWorkflowStep();
	}
@Test(priority=7)
public static void SDGE_EEBI_Inspection() {
	    test=Report.startTest("SDGE_EEBI_Inspection");
	    Process_InspectionWorkflowStep();
	}
@Test(priority=8)
public static void SDGE_EEBI_Post_Engineering() {
	    test=Report.startTest("SDGE_EEBI_Post_Engineering");
	    Process_Post_EngineeringWorkflowStep();
	}
@Test(priority=9)
public static void SDGE_EEBI_Management_Review() {
	    test=Report.startTest("SDGE_EEBI_Management_Review");
	    Process_Management_ReviewWorkflowStep();
	}
@Test(priority=10)
public static void SDGE_EEBI_VerifyEnrollment() {
	    test=Report.startTest("SDGE_EEBI_VerifyEnrollment");
	    VerifyEnrollment();
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
