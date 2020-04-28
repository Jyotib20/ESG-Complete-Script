/*package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.End_To_End_ConfigurationTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class End_To_End_ConfigurationExecutableClass extends End_To_End_ConfigurationTestClass {

	@BeforeTest(groups= {"Create Measure","Create TradeAlly"})
	public static void Initialization() {
		initialization();
	}
	@Test(priority =1,groups= {"Create Measure","Create TradeAlly"})
	public static void Login_Module() {
		
		test = Report.startTest("Login Module");
		Login();
	}
	//Create A Measure
	@Test(priority =2,groups= {"Create Measure"})
	public static void CreateNewMeasure() {
		test = Report.startTest("Create New Measure");
		Create_New_Measure();
	}
	@Test(priority =3,groups= {"Create Measure"})
	public static void CreateNewMeasure_Add_Properties() {
		test = Report.startTest("Create New Measure Add New Properties");
		Create_New_Measure_Property();
	}
	@Test(priority =4,groups= {"Create Measure"})
	public static void CreateNewMeasure_Add_FailCodes_and_NonFeasibleCodes() {
		test = Report.startTest("Create New Measure Fail Codes and Non Feasible Codes");
		Create_New_Measure_FailCodes_and_NonFeasibleCodes();
	}
	//Create A TradeAlly
	@Test(priority =5,groups= {"Create TradeAlly"})
	public static void CreateNewTradeAlly() {
		test = Report.startTest("Create New TradeAlly");
		Create_New_TradeAlly();
	}
	
	
	
	@AfterMethod(groups= {"Create Measure","Create TradeAlly"})
	public static void getStatusWithScreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = GetScreenShot.capture(driver);
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		}
		
		Report.endTest(test);
	}
	
	

	@AfterTest(groups= {"Create Measure","Create TradeAlly"})
	public static void Report() {
		generateReport();
	}
}
*/