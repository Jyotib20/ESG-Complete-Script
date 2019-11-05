package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.SavedOnlineApplication_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class SavedOnlineApplication_ExecutableClass extends SavedOnlineApplication_TestClass {
	
	@BeforeTest
	public static void Initialization() {
		
		initialization();
	}
	
	@Test(priority = 1)
	public static void AccessOnlineApplication() {
		test = Report.startTest("Access Online Application");
		OpenOnlineApplication("Saved_Online_Application", "AccessOnlineApplicationlink");
	}
	@Test(priority = 2)
	public static void Saved_Online_Application_Step_1() {
		test = Report.startTest("Saved Online Application-Step-1");
		Step1_GettingStarted();
	}

	@Test(priority = 3)
	public static void VerifyCustmerInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Custmer Information Saved Online Application-Step-2");
		VerifyCustmerInformation_Step2();
	}
	@Test(priority = 4)
	public static void VerifyAccountHolderTaxInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Account Holder Tax Information Saved Online Application-Step-2");
		VerifyAccountHolderTaxInformation_Step2();
	}
	@Test(priority = 5)
	public static void VerifyApplicantInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Applicant Information Saved Online Application-Step-2");
		VerifyApplicantInformation_Step2();
	}
	@Test(priority = 6)
	public static void VerifyInstallationAddress_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Installation Address Saved Online Application-Step-2");
		VerifyInstallationAddress_Step2();
	}
	@Test(priority = 7)
	public static void VerifyMailingAddress_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Mailing Address Saved Online Application-Step-2");
		VerifyMailingAddress_Step2();
	}
	@Test(priority = 8)
	public static void VerifyPropertyInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Property Information Saved Online Application-Step-2");
		VerifyPropertyInformation_Step2();
	}
	@Test(priority = 9)
	public static void VerifyGeneralApplicationInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify General Application Information Saved Online Application-Step-2");
		VerifyGeneralApplicationInformation_Step2();
	}
	@Test(priority = 10)
	public static void Complete_Customer_Information_Saved_Online_Application_Step_2() {
		test = Report.startTest("Complete Customer Information Saved Online Application-Step-2");
		Step2_Complete_CustomerInformation();
	}
	@Test(priority = 11)
	public static void Complete_Installer_Information_Saved_Online_Application_Step_3() {
		test = Report.startTest("Complete Installer Information Saved Online Application-Step-3");
		Step3_Complete_InstallerInformation();
	}

	/*@Test(priority = 4)
	public static void Saved_Online_Application_Step_3() {
		test = Report.startTest("Saved_Online_Application_Step_3");
		Step3_InstallerInformation();
	}

	@Test(priority = 5)
	public static void Saved_Online_Application_Step_4() {
		test = Report.startTest("Saved_Online_Application_Step_4");
		Step4_PayeeInformation();
	}

	@Test(priority = 6)
	public static void Saved_Online_Application_Step_5() {
		test = Report.startTest("Saved_Online_Application_Step_5");
		Step5_EquipmentInformation();
	}

	@Test(priority = 7)
	public static void Saved_Online_Application_Step_6() {
		test = Report.startTest("Saved_Online_Application_Step_6");
		Step6_IncentiveSummary();
	}

	@Test(priority = 8)
	public static void Saved_Online_Application_Step_7() {
		test = Report.startTest("Saved_Online_Application_Step_7");
		Step7_Documentation();
	}

	@Test(priority = 9)
	public static void Saved_Online_Application_Step_8() {
		test = Report.startTest("Saved_Online_Application_Step_8");
		Step8_TermsandCondition();
	}

	@Test(priority = 10)
	public static void Saved_Online_Application_Step_9() {
		test = Report.startTest("Saved_Online_Application_Step_9");
		Step9_ReviewandSubmit();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
