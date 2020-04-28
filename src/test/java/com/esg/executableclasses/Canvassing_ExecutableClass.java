package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Canvassing_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Canvassing_ExecutableClass extends Canvassing_TestClass {

	@BeforeTest
	public static void Initialization() {
		initialization();
	}
	@Test(priority =1)
	public static void Login_Module() {
		test = Report.startTest("Login Module");
		Login();
	}
	@Test(priority =2)
	public static void Create_Canvassing_List() {
		test = Report.startTest("Create Canvassing List");
		Create_New_Canvassing_List();
	}
	@Test(priority =3)
	public static void Adding_Customers() throws IOException {
		test = Report.startTest("Adding Customers to Canvassing List");
		Adding_Customers_To_Canvassing_List();
	}
	
	@Test(priority =4)
	public static void Remove_Customers() throws IOException {
		test = Report.startTest("Remove Customers from Canvassing List");
		Remove_Customers_From_Canvassing_List();
	}
	
	@Test(priority =5)
	public static void Create_Open_Lead_Module() throws IOException {
		test = Report.startTest("Create Open Lead");
		Create_Open_Lead();
	}
	@Test(priority =6)
	public static void Create_Cancelled_Lead_Module() throws IOException {
		test = Report.startTest("Create Cancelled Lead");
		Create_Cancel_Lead();
	}
	@Test(priority =7)
	public static void Export_Customer_Canvassing_List_Module() throws IOException {
		test = Report.startTest("Export Customer Canvassing List");
		Export_Customer_Canvassing_List();
	}
	
	@Test(priority =8)
	public static void Copy_Customer_Canvassing_List_Module() throws IOException {
		test = Report.startTest("Copy Customer Canvassing List");
		Copy_Customer_Canvasing_List();
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
