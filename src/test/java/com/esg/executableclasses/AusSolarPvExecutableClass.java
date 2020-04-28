package com.esg.executableclasses;

import java.io.IOException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.esg.testclasses.AusSolarPvTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class AusSolarPvExecutableClass extends AusSolarPvTestClass {
@BeforeTest
public static void Initialization() {
		initialization();
	}
@Test(priority=1)
public static void AusSolarPV_Login() {
	test=Report.startTest("AusSolarPV_Login EECP");
    login(); 
}
@Test(priority=2)
public static void AusSolarPV_CreateEnrollment() {
    test=Report.startTest("AusSolarPV_CreateEnrollment");
    NavigateToEnrollment(); 
}
@Test(priority=3)
public static void AusSolarPV_Application() {
	    test=Report.startTest("AusSolarPV_Application");
	    CompleteApplicationWorkflowStep();
		CompleteMeasure();
		VerifyAndProcessApplicationWorkflowStep();
		ReviewAndProcess_ApplicationWorkflowStep();
	}
@Test(priority=4)
public static void AusSolarPV_Pre_Inspection() {
	    test=Report.startTest("AusSolarPV_Pre_Inspection");
	    Process_Pre_InspectionWorkflowStep();
	}
@Test(priority=5)
public static void AusSolarPV_Installation() {
	    test=Report.startTest("AusSolarPV_Installation");
	    Process_InstallationWorkflowStep();
	}
@Test(priority=6)
public static void AusSolarPV_DocumentReview() {
	    test=Report.startTest("AusSolarPV_DocumentReview");
	    Process_DocumentReviewWorkflowStep();
	}
@Test(priority=7)
public static void AusSolarPV_Inspection() {
	    test=Report.startTest("AusSolarPV_Inspection");
	    Process_InspectionWorkflowStep();
	}
@Test(priority=8)
public static void AusSolarPV_QA_Review() {
	    test=Report.startTest("AusSolarPV_QA_Review");
	    Process_QA_ReviewWorkflowStep();
	}
@Test(priority=9)
public static void AusSolarPV_InitiatePayment() {
	    test=Report.startTest("AusSolarPV_InitiatePayment");
	    Process_InitiatePaymentWorkflowStep();
	}
@Test(priority=10)
public static void AusSolarPV_Generate_PaymentRequest() {
	    test=Report.startTest("AusSolarPV_Generate_PaymentRequest");
	    Generate_PaymentRequest();
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


