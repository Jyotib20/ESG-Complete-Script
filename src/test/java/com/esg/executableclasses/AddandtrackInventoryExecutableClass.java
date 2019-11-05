package com.esg.executableclasses;

	import java.io.IOException;

	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.esg.testclasses.AddandtrackInventoryTestClass;
	import com.esg.utilities.GetScreenShot;
	import com.relevantcodes.extentreports.LogStatus;

	public class AddandtrackInventoryExecutableClass extends AddandtrackInventoryTestClass {

		
		@BeforeTest
		public static void Initialization() {
			
			initialization();
		}
		@Test(priority = 1)
		public static void LoginPage() {
			test = Report.startTest("Login Page");
			Login();
		}
		/*@Test(priority = 2)
		public static void AddInventory() {
			test = Report.startTest("Add Inventory");
			AddInventoryStep();
		}*/
		@Test(priority = 3)
		public static void TrackInventory() {
			test = Report.startTest("Track Inventory");
			Inventorytracking();
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


