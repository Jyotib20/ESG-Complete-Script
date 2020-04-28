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
		test = Report.startTest("Saved Online Application Step-1");
		Step1_GettingStarted();
	}

	@Test(priority = 3)
	public static void VerifyCustmerInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Custmer Information Saved Online Application Step-2");
		VerifyCustmerInformation_Step2();
	}
	@Test(priority = 4)
	public static void VerifyAccountHolderTaxInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Account Holder Tax Information Saved Online Application Step-2");
		VerifyAccountHolderTaxInformation_Step2();
	}
	@Test(priority = 5)
	public static void VerifyApplicantInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Applicant Information Saved Online Application Step-2");
		VerifyApplicantInformation_Step2();
	}
	@Test(priority = 6)
	public static void VerifyInstallationAddress_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Installation Address Saved Online Application Step-2");
		VerifyInstallationAddress_Step2();
	}
	@Test(priority = 7)
	public static void VerifyMailingAddress_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Mailing Address Saved Online Application Step-2");
		VerifyMailingAddress_Step2();
	}
	@Test(priority = 8)
	public static void VerifyPropertyInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify Property Information Saved Online Application Step-2");
		VerifyPropertyInformation_Step2();
	}
	@Test(priority = 9)
	public static void VerifyGeneralApplicationInformation_Saved_Online_Application_Step_2() {
		test = Report.startTest("Verify General Application Information Saved Online Application Step-2");
		VerifyGeneralApplicationInformation_Step2();
	}
	@Test(priority = 10)
	public static void Complete_Customer_Information_Saved_Online_Application_Step_2() {
		test = Report.startTest("Complete Customer Information Saved Online Application Step-2");
		Step2_Complete_CustomerInformation();
	}
	@Test(priority = 11)
	public static void Complete_Installer_Information_Saved_Online_Application_Step_3() {
		test = Report.startTest("Complete Installer Information Saved Online Application Step-3");
		//Enter In Care of/Recipient: Sally Smith ---BUG----Unable to access---Enter In Care of/Recipient: Sally Smith
		Step3_Complete_InstallerInformation();
		//Check Email if not populated-- check the employee record (Configuration -> Trade Ally -> Select Trade Ally -> Employees) to confirm if the email is populated
	}

	@Test(priority = 12)
	public static void Complete_Payee_Information_Saved_Online_Application_Step_4() {
		test = Report.startTest("Complete Payee Information Saved Online Application Step-4");
		Step4_Complete_PayeeInformation();
	}

	@Test(priority = 13)
	public static void Complete_Equipment_Information_Saved_Online_Application_Step_5() {
		test = Report.startTest("Complete Equipment Information Saved Online Application Step-5");
		Step5_Complete_EquipmentInformation();
	}

	@Test(priority = 14)
	public static void Complete_IncentiveSummary_Saved_Online_Application_Step_6() {
		test = Report.startTest("Complete Incentive Summary Saved Online Application Step-6");
		Step6_Complete_IncentiveSummary();
	}

	@Test(priority = 15)
	public static void Complete_Payment_Information_Saved_Online_Application_Step_7() {
		test = Report.startTest("Complete Payment Information Saved Online Application Step-7");
		Step7_Complete_PaymentInformation();
	}

	@Test(priority = 16)
	public static void Complete_How_did_you_hear_about_us_Saved_Online_Application_Step_8() {
		test = Report.startTest("How did you hear about us? Saved Online Application Step-8");
		Step8_Complete_How_did_you_hear_about_us();
	}

	@Test(priority = 17)
	public static void Complete_Documentation_Saved_Online_Application_Step_9() {
		test = Report.startTest("Complete Documentation Saved Online Application Step-9");
		Step9_Complete_Documentation();
	}
	
	@Test(priority = 18)
	public static void Complete_Terms_and_Conditions_Saved_Online_Application_Step_10() {
		test = Report.startTest("Complete Terms and Conditions Saved Online Application Step-10");
		Step10_Complete_Terms_and_Conditions();
	}
	
	@Test(priority = 19)
	public static void VerifyCustmerInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Custmer Information Saved Online Application Step-11");
		VerifyCustmerInformation_Step11();
	}
	@Test(priority = 20)
	public static void VerifyAccountHolderTaxInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Account Holder Tax Information Saved Online Application Step-11");
		VerifyAccountHolderTaxInformation_Step11();
	}
	@Test(priority = 21)
	public static void VerifyApplicantInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Applicant Information Saved Online Application Step-11");
		VerifyApplicantInformation_Step11();
	}
	@Test(priority = 22)
	public static void VerifyPropertyInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Property Information Saved Online Application Step-11");
		VerifyPropertyInformation_Step11();
	}
	@Test(priority = 23)
	public static void VerifyInstallerInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Installer Information Saved Online Application Step-11");
		VerifyInstallerInformation_Step11();
	}
	@Test(priority = 24)
	public static void VerifyPayeeInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Payee Information Saved Online Application Step-11");
		VerifyPayeeInformation_Step11();
	}
	
	@Test(priority = 25)
	public static void VerifyGeneralApplicationInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify General Application Information Saved Online Application Step-11");
		VerifyGeneralApplicationInformation_Step11();
	}
	@Test(priority = 26)
	public static void VerifyEquipmentInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Equipment Information Saved Online Application Step-11");
		VerifyEquipmentInformation_Step11();
	}
	@Test(priority = 27)
	public static void VerifyPaymentInformation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Payment Information Saved Online Application Step-11");
		VerifyPaymentInformation_Step11();
	}
	@Test(priority = 28)
	public static void VerifyDocumentation_Saved_Online_Application_Step_11() {
		test = Report.startTest("Verify Documentation Saved Online Application Step-11");
		VerifyDocumentation_Step11();
	}
		
@Test(priority = 29)
	public static void Complete_ReviewandSubmit_Saved_Online_Application_Step_11() {
		test = Report.startTest("Complete Review and Submit Saved Online Application Step-11");
		Step11_Complete_ReviewandSubmit();
		threadWait(5000);
		CloseBrowserWindow();
	}
	@Test(priority = 30)
	public static void Login_EECP() {
		test = Report.startTest("Login EECP");
		LoginEECP();
	}
	@Test(priority = 31)
	public static void Search_and_Verify_Saved_Online_Applications() {
		test = Report.startTest("Search and Verify Saved Online Application");
		Search_Saved_Online_Applications();
		CloseBrowserWindow();
	}
	@Test(priority = 32)
	public static void AccessEmail_Saved_Online_Application() {
		test = Report.startTest("Access Email Saved Online Application");
		AccessEmail(3, 0, 3, 1);
	}
	@Test(priority = 33)
	public static void Verify_GettingStarted_After_SaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Getting Started After Save Process Saved Online Application Step-1");
		Verify_GettingStarted_AfterSaveProcess_Step1();
	}
	@Test(priority = 34)
	public static void Verify_CustomerInformation_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Customer Information Saved Online Application Step-2");
		//Is the mailing address the same as the Installation Address: No (if default is Yes, then select No. This is a bug that needs to be fixed)
		Verify_CustomerInformation_AfterSaveProcess_Step2();
	}
	@Test(priority = 35)
	public static void Verify_InstallerInformation_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Installer Information Saved Online Application Step-3");
		Verify_InstallerInformation_AfterSaveProcess_Step3();
	}
	@Test(priority = 36)
	public static void Verify_PayeeInformation_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Payee Information Saved Online Application Step-4");
		Verify_PayeeInformation_AfterSaveProcess_Step4();
	}
	@Test(priority = 37)
	public static void Verify_EquipmentInformation_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Equipment Information Saved Online Application Step-5");
		Verify_EquipmentInformation_AfterSaveProcess_Step5();
	}
	@Test(priority = 38)
	public static void Verify_IncentiveSummary_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Incentive Summary Saved Online Application Step-6");
		Verify_IncentiveSummary_AfterSaveProcess_Step6();
	}
	@Test(priority = 39)
	public static void Verify_PaymentInformation_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Payment Information Saved Online Application Step-7");
		Verify_PaymentInformation_AfterSaveProcess_Step7();
	}
	@Test(priority = 40)
	public static void Verify_How_did_you_hear_about_us_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify 'How did you hear about us' Saved Online Application Step-8");
		Verify_How_did_you_hear_about_us_AfterSaveProcess_Step8();
	}
	@Test(priority = 41)
	public static void Verify_Documentation_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Documentation Saved Online Application Step-9");
		Verify_Documentation_AfterSaveProcess_Step9();
	}
	@Test(priority = 42)
	public static void Verify_Terms_and_Conditions_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Terms and Conditions Saved Online Application Step-10");
		Verify_Terms_and_Conditions_AfterSaveProcess_Step10();
	}
	@Test(priority = 43)
	public static void Verify_ReviewandSubmit_AfterSaveProcess_Saved_Online_Application() {
		test = Report.startTest("Verify Review and Submit Saved Online Application Step-11");
		Verify_ReviewandSubmit_AfterSaveProcess_Step11();
		CloseBrowserWindow();
	}
	
	@Test(priority = 44)
	public static void Navigate_To_Enrollment_Saved_Online_Application_Step() {
		test = Report.startTest("Navigate To Enrollment Saved Online Application");
		LoginEECP();
		Navigate_To_Enrollment();
		
	} 
	@Test(priority = 45)
	public static void Verify_Created_Application_Saved_Online_Application_Step() {
		test = Report.startTest("Verify Created Application Saved Online Application");
		Verify_Created_Application();
		//CloseBrowserWindow();
		
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
