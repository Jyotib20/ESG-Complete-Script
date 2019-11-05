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
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_1");
		Step1_GettingStarted();
	}

	@Test(priority = 3)
	public static void TECO_Lighting_OnlineApplication_Step_2() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_2");
		Step2_CustomerInformation();
	}

	@Test(priority = 4)
	public static void TECO_Lighting_OnlineApplication_Step_3() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_3");
		Step3_InstallerInformation();
	}

	@Test(priority = 5)
	public static void TECO_Lighting_OnlineApplication_Step_4() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_4");
		Step4_PayeeInformation();
	}

	@Test(priority = 6)
	public static void TECO_Lighting_OnlineApplication_Step_5() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_5");
		Step5_EquipmentInformation();
	}

	@Test(priority = 7)
	public static void TECO_Lighting_OnlineApplication_Step_6() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_6");
		Step6_IncentiveSummary();
	}

	@Test(priority = 8)
	public static void TECO_Lighting_OnlineApplication_Step_7() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_7");
		Step7_Documentation();
	}

	@Test(priority = 9)
	public static void TECO_Lighting_OnlineApplication_Step_8() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_8");
		Step8_TermsandCondition();
	}

	@Test(priority = 10)
	public static void TECO_Lighting_OnlineApplication_Step_9() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_Step_9");
		Step9_ReviewandSubmit();
	}

	@Test(priority = 11)
	public static void TECO_Lighting_OnlineApplication_VerifyEnrollment() {
		test = Report.startTest("TECO_Lighting_OnlineApplication_VerifyEnrollment");
		VerifyEnrollment();
		EditOnlineApplication();//"Unable to search Created Application to Edit"
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
