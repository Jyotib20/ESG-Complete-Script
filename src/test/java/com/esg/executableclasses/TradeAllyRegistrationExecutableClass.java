package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.TradeAllyRegistrationTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class TradeAllyRegistrationExecutableClass extends TradeAllyRegistrationTestClass {

	@BeforeTest
	public static void Initialization() {
		initialization();
	}

	@Test(priority = 1)
	public static void TradeAlly_Registration_Login() {
		test = Report.startTest("TradeAlly_Registration_Login");
		login();
	}

	@Test(priority = 2)
	public static void TradeAlly_Registration_CreateEnrollment() {
		test = Report.startTest("TradeAlly_Registration_NavigateToOnlineApplication");
		NavigateToOnlineApplication();
	}

	@Test(priority = 3)
	public static void TradeAlly_Registration_OnlineApplication_Step_1() {
		test = Report.startTest("TradeAlly_Registration_OnlineApplication_Step_1");
		Step1_GettingStarted();
	}

	@Test(priority = 4)
	public static void TradeAlly_Registration_OnlineApplication_Step_2() {
		test = Report.startTest("TradeAlly_Registration_OnlineApplication_Step_2");
		Step2_UserInformation();
	}

	@Test(priority = 5)
	public static void TradeAlly_Registration_OnlineApplication_Step_3() {
		test = Report.startTest("TradeAlly_Registration_OnlineApplication_Step_3");
		Step3_CompanyProfileInformation();
	}

	@Test(priority = 6)
	public static void TradeAlly_Registration_OnlineApplication_Step_4() {
		test = Report.startTest("TradeAlly_Registration_OnlineApplication_Step_4");
		Step4_QualificationInformation();
	}

	@Test(priority = 7)
	public static void TradeAlly_Registration_OnlineApplication_Step_5() {
		test = Report.startTest("TradeAlly_Registration_OnlineApplication_Step_5");
		Step5_ProgramInformation();

	}
	@Test(priority = 8)
	public static void TradeAlly_Registration_OnlineApplication_Step_6() {
		test = Report.startTest("TradeAlly_Registration_OnlineApplication_Step_6");
		Step6_ReviewAndSubmit();

	}
	@Test(priority = 9)
	public static void TradeAlly_Registration_ReOpenAndLoginAgain() {
		test = Report.startTest("TradeAlly_Registration_ReOpenAndLoginAgain");
		loginAgain();
	}
	@Test(priority = 10)
	public static void TradeAlly_Registration_Configure_RegistrationTradeAlly() {
		test = Report.startTest("TradeAlly_Registration_Configure_RegistrationTradeAlly");
		ConfigureRegistrationTradeAlly();
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
