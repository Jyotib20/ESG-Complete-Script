package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.RNCRegressionTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class RNCRegressionExecutableClass extends RNCRegressionTestClass {
	
	@BeforeTest 
	public static void Intilize() {
		
	initialization();
	}
	@Test(priority = 1)
	public static void LoginPage() {
		test = Report.startTest("LoginPage");
		login("helper", "BaseURL", 1, 0, 1, 1);
	}
/*	@Test(priority = 2)
	public static void PositiveBasicFlow() {
		test = Report.startTest("Positive Basic Flow");
		Enrollment();
		Application();
		PreEnginneringMethod();
		Lot1();
		PostEngineeringMethod();
		QAreviewMethod();
		InitiatePaymentMethod();
		Lot2();
		PostEngineeringMethod2();
		QAreviewMethod2();
		NonVerifiedInitiatePaymentMethod2();
		CloseMethod2();
	}*//*@Test(priority = 3)
	public static void PastPricing() {
		test = Report.startTest("Past Pricing");
		Enrollment();
		PastPricingApplication();
		PastPricingPreEnginneringMethod();
		PastPricingLot();
		PostEngineeringMethod();
		PastPricingQAreviewMethod();
		PastPricingInitiatePaymentMethod();
		CloseMethod();
	}*/
	@Test(priority = 4)
	public static void ChangingOrientation() {
		test = Report.startTest("Changing Orientation - Set Orientation on Install, Change on Inspection");
		Enrollment();
		ChangingOrientationApplication();
		ChangingOrientationPreEnginneringMethod();
		Lot1();
		PostEngineeringMethod();
		QAreviewMethod();
		ChangingOrientationInitiatePaymentMethod();
		CloseMethod();
	}
	
	/*@Test(priority = 5)
	public static void NonVerifiedLot() {
		test = Report.startTest("Non Verified Lot");
		Enrollment();
		NonVerifiedLotApplication();
		ChangingOrientationPreEnginneringMethod();
		Lot1();
		PostEngineeringMethod();
		QAreviewMethod();
		NonVerifiedInitiatePaymentMethod1();
		Lot2();
		PostEngineeringMethod2();
		QAreviewMethod2();
		NonVerifiedInitiatePaymentMethod2();
		CloseMethod2();
	}	*/
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
