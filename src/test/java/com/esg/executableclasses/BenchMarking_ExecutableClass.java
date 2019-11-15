package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Benchmarking_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class BenchMarking_ExecutableClass extends Benchmarking_TestClass {
	
	@BeforeTest
	public static void Initialization() {
		initialization();
	}
	@Test(priority = 1)
	public static void LoginPage() {
		
		test = Report.startTest("LoginPage");
				Login();
	}
	@Test(priority = 2)
	public static void Property1_CommercialModule() {
		test = Report.startTest("Property1 Commercial Module");
		Property1_Commercial();
	}
	@Test(priority = 3)
	public static void Property2_ComRes1Module() {
		test = Report.startTest("Property2 ComRes1 Module");
		Property2_ComRes1();
	}
	@Test(priority = 4)
	public static void Property3_ComRes2Module() {
		test = Report.startTest("Property2 ComRes3 Module");
		Property3_ComRes2();
	}
	@Test(priority = 5)
	public static void Property4_UnverifiedAddressModule() {
		test = Report.startTest("Property4 Unverified Address Module");
		Property4_UnverifiedAddress();
	}
	@Test(priority = 6)
	public static void Property5_AppartmentcampusModule() {
		test = Report.startTest("Property5 Appartment campus Module");
		Property5_Appartmentcampus();
	}
	@Test(priority = 7)
	public static void EECP_PortfolioConfig_Module() {
		test = Report.startTest("EECP Portfolio Configuration Module");
		EECP_PortfolioConfig();
	}
	@Test(priority = 8)
	public static void Verify_Last_Bill_Amount_Module() {
		test = Report.startTest("Verify Last Bill Amount Module");
		Verify_Last_Bill_Amount();
	}
/*	@Test(priority = 8)
	public static void BenchMarkingOnline1_Module() {
		test = Report.startTest("BenchMarking Online1 Module");
		BenchMarkingOnline1();
	}*/@Test(priority = 9)
	public static void BenchmarkingDataRequestPortalModule() {
		test = Report.startTest("Benchmarking Data Request Portal Module");
		BenchmarkingDataRequestPortal();
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
