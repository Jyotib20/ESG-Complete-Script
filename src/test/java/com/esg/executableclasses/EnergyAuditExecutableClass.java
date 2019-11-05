package com.esg.executableclasses;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.*;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class EnergyAuditExecutableClass extends EnergyAuditTestClass {
	
	@BeforeTest
	public static void Intilize() {
	
	initialization();
	}
	@Test(priority = 1)
	public static void EnergyLogin() {
		test = Report.startTest("Energy");
		
		login(1, 0, 1, 1);
		Enrollment();
		SaveIncomplete();
		Worktype();
		InsulationInformation();
		DuctSealInformation();

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