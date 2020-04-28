package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.MultiUnitWaiverTestClasses;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class MultiUnitWaiverExecutableClass extends MultiUnitWaiverTestClasses {

	@BeforeTest
	public static void Initialization() {
		
		initialization();
	}
		
	@Test(priority = 1)
	public static void Create_Multi_Unit_Waiver_Step1() {
		test = Report.startTest("Create Multi Unit Waiver Step-1");
		Create_MultiUnitWaiver();
		CloseBrowserWindow();
	}
	
	@Test(priority = 2)
	public static void Add_Building_And_Units_Multi_Unit_Waiver_Step2() {
		test = Report.startTest("Add Building And Units Multi Unit Waiver Step-2");
		Add_BuildingAndUnits_MultiUnitWaiver();
		
	}
	
	@Test(priority = 3)
	public static void Verify_Added_BuildingAndUnits_Multi_Unit_Waiver_Step3() {
		test = Report.startTest("Verify Added Building And Units Multi Unit Waiver Step-3");
		Verify_Added_BuildingAndUnits_MultiUnitWaiver();
		CloseBrowserWindow();
	}
	
	@Test(priority = 4)
	public static void Create_Lead_Multi_Unit_Waiver_Step4() {
		test = Report.startTest("Create Lead Multi Unit Waiver Step-4");
		Create_Lead_MultiUnitWaiver();
		CloseBrowserWindow();
	}
	
	@Test(priority = 5)
	public static void Create_Enrollment_Multi_Unit_Waiver_Step5() {
		test = Report.startTest("Create Enrollment Multi Unit Waiver Step-5");
		Create_Enrollment_MultiUnitWaiver();
		CloseBrowserWindow();
	}
	
	@Test(priority = 6)
	public static void Unlink_Link_Lead_MultiUnitWaiver_Multi_Unit_Waiver() {
		test = Report.startTest("Unlink Link Lead Multi Unit Waiver");
		Unlink_Link_Lead_MultiUnitWaiver();
		CloseBrowserWindow();
	}
	
	@Test(priority = 7)
	public static void Unlink_Link_Enrollment_MultiUnitWaiver_Multi_Unit_Waiver() {
		test = Report.startTest("Unlink Link Enrollment Multi Unit Waiver");
		Unlink_Link_Enrollment_MultiUnitWaiver();
		CloseBrowserWindow();
	}
	
	@Test(priority = 8)
	public static void Add_Unit_And_Link_from_LinkLead_Dialog_Multi_Unit_Waiver() {
		test = Report.startTest("Add Unit and Link from Link Lead Dialog Multi Unit Waiver");
		Add_Unit_And_Link_from_LinkLead_Dialog_MultiUnitWaiver();
		CloseBrowserWindow();
	}
	
	@Test(priority = 9)
	public static void Add_Unit_And_Link_from_LinkEnrollment_Dialog_Multi_Unit_Waiver() {
		test = Report.startTest("Add Unit and Link from Link Enrollment Dialog Multi Unit Waiver");
		Add_Unit_And_Link_from_LinkEnrollment_Dialog_MultiUnitWaiver();
		CloseBrowserWindow();
	}
	
	
	
	
	@AfterMethod
	 public void getResult(ITestResult result) throws IOException
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
	 public static void Generate() {
		 
		generateReport();
	 }
}
