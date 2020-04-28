package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.TECO_LightingTestClasses;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class TECO_LightingExecutableClass extends TECO_LightingTestClasses {
	@BeforeTest
	public static void Initialization() {
		initialization();
	}

	@Test(priority = 1)
	public static void TECO_Lighting_Login() {
		OpenOnlineApplication();
	}

	@Test(priority = 2)
	public static void TECO_Lighting_OnlineApplication_Step_1() {
		test = Report.startTest("TECO Lighting Online Application Step-1");
		Step1_Complete_GettingStarted();
	}

	@Test(priority = 3)
	public static void TECO_Lighting_OnlineApplication_Step_2() {
		test = Report.startTest("TECO Lighting Online Application Step-2");
		Step2_Complete_CustomerInformation();
	}

	@Test(priority = 4)
	public static void TECO_Lighting_OnlineApplication_Step_3() {
		test = Report.startTest("TECO Lighting Online Application Step-3");
		Step3_InstallerInformation();
	}

	@Test(priority = 5)
	public static void TECO_Lighting_OnlineApplication_Step_4() {
		test = Report.startTest("TECO Lighting Online Application Step-4");
		Step4_PayeeInformation();
	}

	@Test(priority = 6)
	public static void TECO_Lighting_OnlineApplication_Step_5() {
		test = Report.startTest("TECO Lighting Online Application Step-5");
		Step5_EquipmentInformation();
	}

	@Test(priority = 7)
	public static void TECO_Lighting_OnlineApplication_Step_6() {
		test = Report.startTest("TECO Lighting Online Application Step-6");
		Step6_IncentiveSummary();
	}

	@Test(priority = 8)
	public static void TECO_Lighting_OnlineApplication_Step_7() {
		test = Report.startTest("TECO Lighting Online Application Step-7");
		Step7_Documentation();
	}

	@Test(priority = 9)
	public static void TECO_Lighting_OnlineApplication_Step_8() {
		test = Report.startTest("TECO Lighting Online Application Step-8");
		Step8_TermsandCondition();
	}

	@Test(priority = 10)
	public static void TECO_Lighting_OnlineApplication_Step_9() {
		test = Report.startTest("TECO Lighting Online Application Step-9");
		Step9_ReviewandSubmit();
		CloseBrowserWindow();
	}

	@Test(priority = 11)
	public static void TECO_Lighting_OnlineApplication_VerifyEnrollment() {
		test = Report.startTest("TECO Lighting Online Application Verify Enrollment");
		VerifyEnrollment();
		CloseBrowserWindow();
	}
	
	@Test(priority = 12)
	public static void TECO_Lighting_OnlineApplication_Edit_Online_Application() {
		test = Report.startTest("TECO Lighting Online Application Edit Online Application");
		EditOnlineApplication();//"Unable to search Created Application to Edit"
	}
	
	@Test(priority = 13)
	public static void TECO_Lighting_OnlineApplication_EditOnlineApplication_Step_2() {
		test = Report.startTest("TECO Lighting Online Application - Edit Online Application Step-2");
		Verify_Customer_Information_EditOnlineApplication();
	}

	@Test(priority = 14)
	public static void TECO_Lighting_OnlineApplication_EditOnlineApplication__Step_3() {
		test = Report.startTest("TECO Lighting Online Application - Edit Online Application Step-3");
		Verify_Installer_Information_EditOnlineApplication();
	}

	@Test(priority = 15)
	public static void TECO_Lighting_OnlineApplication_EditOnlineApplication__Step_4() {
		test = Report.startTest("TECO Lighting Online Application - Edit Online Application Step-4");
		Verify_Payee_Information_EditOnlineApplication();
	}

	@Test(priority = 16)
	public static void TECO_Lighting_OnlineApplication_EditOnlineApplication__Step_5() {
		test = Report.startTest("TECO Lighting Online Application - Edit Online Application Step-5");
		Verify_Equipment_Information_EditOnlineApplication();
	}

	@Test(priority = 17)
	public static void TECO_Lighting_OnlineApplication_EditOnlineApplication__Step_6() {
		test = Report.startTest("TECO Lighting Online Application - Edit Online Application Step-6");
		Verify_Incentive_Summary_EditOnlineApplication();
	}

	@Test(priority = 18)
	public static void TECO_Lighting_OnlineApplication_EditOnlineApplication__Step_7() {
		test = Report.startTest("TECO Lighting Online Application - Edit Online Application Step-7");
		Verify_Documentation_EditOnlineApplication();
	}

	@Test(priority = 19)
	public static void TECO_Lighting_OnlineApplication_EditOnlineApplication__Step_8() {
		test = Report.startTest("TECO Lighting Online Application - Edit Online Application Step-8");
		Verify_TermsandCondition_EditOnlineApplication();
	}

	@Test(priority = 20)
	public static void TECO_Lighting_OnlineApplication_EditOnlineApplication__Step_9() {
		test = Report.startTest("TECO Lighting Online Application - Edit Online Application Step-9");
		Verify_ReviewandSubmit_EditOnlineApplication();
		CloseBrowserWindow();
	}
	
	@Test(priority = 21)
	public static void TECO_Lighting_ApplicationWorkflowStep_ApplicantInformation_After_EditOnlineApplication() {
		test = Report.startTest("TECO Lighting Application Workflow Step Applicant Information After - Edit Online Application");
		Verify_ApplicationWorkflowStep_ApplicantInformation_After_EditOnlineApplication();
	}
	
	@Test(priority = 22)
	public static void TECO_Lighting_ApplicationWorkflowStep_Documentation_After_EditOnlineApplication() {
		test = Report.startTest("TECO Lighting Application Workflow Step Documentation After Edit Online Application");
		Verify_ApplicationWorkflowStep_Documentation_After_EditOnlineApplication();
	}
	
	@Test(priority = 23)//
	public static void TECO_Lighting_ApplicationWorkflowStep_Measures_After() {
		test = Report.startTest("TECO Lighting Application Workflow Step Measures After - Edit Online Application");
		Verify_ApplicationWorkflowStep_Measures_After_EditOnlineApplication();
	}
	
	@Test(priority = 24)
	public static void TECO_Lighting_PreVerification_WorkflowStep_Measures_After() {
		test = Report.startTest("TECO Lighting Pre-Verification Workflow Step Measures After - Edit Online Application");
		Access_and_Verify_PreVerification_Workflow_Step_After_EditOnlineApplication();
		CloseBrowserWindow();
	}

	@Test(priority = 25)
	public static void TECO_Lighting_OnlineApplication_Record_Installation_Result() {
		test = Report.startTest("TECO Lighting Online Application Record Installation Result");
		RecordInstallationResult();
	}
	
	@Test(priority = 26)
	public static void TECO_Lighting_Verify_RecordInstallationResult_OnlineApplication() {
		test = Report.startTest("TECO Lighting Verify Record Installation Result Online Application");
		Verify_RecordInstallationResult_OnlineApplication();
	}
	
	@Test(priority = 27)
	public static void TECO_Lighting_Complete_Documentation_RecordInstallationResult_OnlineApplication() {
		test = Report.startTest("TECO Lighting Complete Documentation Record Installation Result Online Application");
		Complete_Documentation_RecordInstallationResult_OnlineApplication();
	}
	
	@Test(priority = 28)
	public static void TECO_Lighting_Verify_ReviewandSubmit_RecordInstallationResult_OnlineApplication() {
		test = Report.startTest("TECO Lighting Verify Review and Submit Record Installation Result Online Application");
		Verify_ReviewandSubmit_RecordInstallationResult_OnlineApplication();
		CloseBrowserWindow();
	}
	
	@Test(priority = 29)//
	public static void TECO_Lighting_Verify_InstallationWorkflowStep_After_RecordInstallationResults() {
		test = Report.startTest("TECO Lighting Verify Installation Workflow Step Record Installation Result");
		Verify_InstallationWorkflowStep_After_RecordInstallationResults();
		CloseBrowserWindow();
	}
	

	@AfterMethod
	public static void getStatusWithScreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
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
