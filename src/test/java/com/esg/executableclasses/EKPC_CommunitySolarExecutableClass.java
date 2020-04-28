package com.esg.executableclasses;

import java.io.IOException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.esg.testclasses.EKPC_CommunitySolarTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class EKPC_CommunitySolarExecutableClass extends EKPC_CommunitySolarTestClass {

	@BeforeTest
	public static void Initialization() {
		initialization();
	}

	@Test(priority = 1)
	public static void EKPC_CommunitySolar_Login() {
		test = Report.startTest("Login");
		login();
	}

	@Test(priority = 2)
	public static void EKPC_CommunitySolar_InventoryCheck() {
		test = Report.startTest("EKPC_CommunitySolar_InventoryCheck");
		//InventoryCheck();
	}

	@Test(priority = 3)
	public static void EKPC_CommunitySolar_OnlineApplication() throws IOException {
		test = Report.startTest("EKPC_CommunitySolar_OnlineApplication");
		//OnlineApplication();
	}
	@Test(priority = 4)
	public static void EKPC_CommunitySolar_Verify_and_ProcessApplication () throws IOException {
		test = Report.startTest("EKPC_CommunitySolar_Verify_and_ProcessApplication");
		//Verify_Enrollment_Application_Info();
		//SearchInventory_by_SerialNo();
		Terminate_Enrollment();
		SearchInventory_by_SerialNo();//Verify Enrollment Terminated or not
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
