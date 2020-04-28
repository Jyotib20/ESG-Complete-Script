/*package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.ESA_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class ESA_ExecutableClass extends ESA_TestClass{
	
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
	public static void CreateNewLeadModule() {
		test = Report.startTest("Create New Lead Module");
		Create_New_Lead();
	}
	@Test(priority =3)
	public static void Update_Lead_Data() {
		test = Report.startTest("Update Lead Data");
		UpdateLeadData();
	}
	@Test(priority =4)
	public static void Verify_Application_Fields_Module() {
		test = Report.startTest("Verify Application Fields");
		Verify_Application_Fields();
	}
	@Test(priority =5)
	public static void Update_Fields_After_Resolve_Lead_Completed_Module() {
		test = Report.startTest("Update Fields After Resolve Lead Completed");
		Update_Fields_After_Resolve_Lead_Completed();
	}
	@Test(priority =6)
	public static void IncomeEligibilityTab_Module() {
		test = Report.startTest("Income Eligibility Tab");
		IncomeEligibilityTab();
	}
	@Test(priority =7)
	public static void Existing_Equipment_Tab_Module() {
		test = Report.startTest("Existing Equipment Tab");
		Existing_Equipment_Tab();
	}
	@Test(priority =8)
	public static void Verify_And_Delete_Measures_Module() {
		test = Report.startTest("Verify_And_Delete_Measures");
		Verify_And_Delete_Measures();
	}
	@Test(priority =9)
	public static void Add_Measure_Information_Module() {
		test = Report.startTest("Add_Measure_Information");
		Add_Measure_Information();
	}
	@Test(priority =10)
	public static void Verify_Incentives_Of_Each_Measure_Module() {
		test = Report.startTest("Verify_Incentives_Of_Each_Measure");
		Verify_Incentives_Of_Each_Measure();
	}
	@Test(priority =11)
	public static void Process_Application_Step() {
		test = Report.startTest("Process_Application");
		Process_Application();
	}
	@Test(priority =12)
	public static void Installation_Weatherization_Workflow_Step_Module() {
		test = Report.startTest("Installation_Weatherization_Workflow_Step");
		Installation_Weatherization_Workflow_Step();
	}
	@Test(priority =13)
	public static void NGAT_Workflow_Step_Module() {
		test = Report.startTest("NGAT_Workflow_Step");
		NGAT_Workflow_Step();
	}
	@Test(priority =14)
	public static void Gas_Equipment_Work_Authorization_Workflow_Step_Module() {
		test = Report.startTest("Gas_Equipment_Work_Authorization_Workflow_Step");
		Gas_Equipment_Work_Authorization_Workflow_Step();
	}
	@Test(priority =15)
	public static void Gas_Equipment_Work_Results_Workflow_Step_Module() {
		test = Report.startTest("Gas_Equipment_Work_Results_Workflow");
		Search_Enrollment_And_Navigate();
		Gas_Equipment_Work_Results_Workflow_Step();
	}
	@Test(priority =16)
	public static void Installation_Electric_Appliance_Workflow_Step_Module() {
		test = Report.startTest("Installation_Electric_Appliance_Workflow_Step");
		//Search_Enrollment_And_Navigate();
		Installation_Electric_Appliance_Workflow_Step();
	}
	
	
	
	
	@Test(priority =16)
	public static void Inspection_Gas_Appliances_Workflow_Step_Module() {
		test = Report.startTest("Inspection_Gas_Appliances_Workflow");
		Search_Enrollment_And_Navigate();
		Inspection_Gas_Appliances_Workflow_Step();
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
*/