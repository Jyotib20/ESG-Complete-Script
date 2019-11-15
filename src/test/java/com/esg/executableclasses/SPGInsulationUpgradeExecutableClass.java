package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.SPGInsulationUpgradeTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class SPGInsulationUpgradeExecutableClass extends SPGInsulationUpgradeTestClass{
	@BeforeTest
	public static void Intilize() {
	
	initialization();
	}
	@Test(priority = 1)
	public static void OpenOnlineApplicationStep() {
		test = Report.startTest("Open Online Application");
		OpenOnlineApplication();
	
}
	@Test(priority = 2)
	public static void AtticInsulationModule() throws IOException {
		test = Report.startTest("Attic Insulation Module");
		AtticInsulation();
}
	@Test(priority = 3)
	public static void NaturalGasModule() throws IOException {
		test = Report.startTest("Natural Gas Module");
		NaturalGas();
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
