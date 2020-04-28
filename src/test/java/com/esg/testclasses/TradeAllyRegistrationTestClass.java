package com.esg.testclasses;

import java.awt.event.KeyEvent;
import java.util.Set;

import com.esg.utilities.HelperClass;

public class TradeAllyRegistrationTestClass extends HelperClass {
	
	public static void login() {

		login("Helper","BaseURL", 1, 0, 1, 1);
	}
	public static void SwitchTabandClose() {
		
		Set <String> windows = driver.getWindowHandles();
	   String mainwindow = driver.getWindowHandle();

	    for (String handle: windows)
	    {
	    	
	        driver.switchTo().window(handle);
	        System.out.println("switched to "+driver.getTitle()+"  Window");
	    String pagetitle = driver.getTitle();
	        if(pagetitle.equalsIgnoreCase("Online Trade Ally Registration"))
	        {
	            //driver.close();
	            System.out.println("Closed the  '"+pagetitle+"' Tab now ...");
	        }
	    }

	     driver.switchTo().window(mainwindow);
	    }
		
	public static void loginAgain() {
		  SwitchTabandClose();
		  ExecutingAgainst("helper", "Version");
		  openURL("helper", "BaseURL");
	}

	public static void NavigateToProgramList() {
		//enterTextboxValue("TradeAllyRegistration", "Configuration", "ESG Values", "TradeAlly_Registration", 1, 1);
		linkText("Configuration").click();
		linkText("Programs").click();
	}
	public static void NavigateToRegistration() {
		//enterTextboxValue("TradeAllyRegistration", "MainMenu", "ESG Values", "TradeAlly_Registration", 3, 1);
		linkText("Main Menu").click();
		linkText("Registration").click();
	}
	public static void NavigateToOnlineApplication() {
		NavigateToProgramList();
		enterTextboxValue("TradeAllyRegistration", "SearchByProgramName", "ESG Values", "TradeAlly_Registration", 5, 1);
		clickWebelement("TradeAllyRegistration", "SearchTradeAlly");
		WaitForElement(300, "TradeAllyRegistration", "ProgramLink");
		clickWebelement("TradeAllyRegistration", "ProgramLink");
		WaitForElement(300, "TradeAllyRegistration", "TradeAllyRegistration");
		scrollToElement("TradeAllyRegistration", "TradeAllyRegistration");
		clickWebelement("TradeAllyRegistration", "TradeAllyRegistration");
		clickWebelement("TradeAllyRegistration", "OnlineApplicationEnrollmentURL");
		clickWebelement("TradeAllyRegistration", "ShareLink");
		WaitForElement(300, "TradeAllyRegistration", "ShareLink_OnlineApplicarion");
		clickWebelement("TradeAllyRegistration", "ShareLink_OnlineApplicarion");
		threadWait(2000);
		SwitchTab("TradeAllyRegistration", "CloseShareLink");
		clickWebelement("TradeAllyRegistration", "VerifyGettingStarted");
		//WaitForElement(60, "TradeAllyRegistration", "VerifyGettingStarted");
		//SwitchTab("TradeAllyRegistration", "VerifyGettingStarted");
		defineLogs("Getting Started", "Getting Started", "Getting Started",
				"Navigate to Getting Started Successfully", "Unable to Navigate to Getting Started",
				"TradeAllyRegistration", "VerifyGettingStarted");
	}

	public static void Step1_GettingStarted() {
		//clickWebelement("TradeAllyRegistration", "ProgramYear");
		selectDropdown("TradeAllyRegistration", "ProgramYear","ProgramYear", "ESG Values", "TradeAlly_Registration",
				8, 1);
		selectDropdown("TradeAllyRegistration", "TaxID","TaxID", "ESG Values", "TradeAlly_Registration",
				9, 1);
		clearWebelement("TradeAllyRegistration", "EnterUniqueID");
		enterTextboxValue("TradeAllyRegistration", "EnterUniqueID", "ESG Values", "TradeAlly_Registration", 10, 1);
		threadWait(3000);
		clickWebelement("TradeAllyRegistration", "Next_Button");
		threadWait(2000);
		defineLogs("User Information", "User Information", "User Information",
				"Navigate to User Information Successfully", "Unable to Navigate to User Information",
				"TradeAllyRegistration", "VerifyUserInformation");
	}

	public static void Step2_UserInformation() {
		clickWebelement("TradeAllyRegistration", "FirstName");
		enterTextboxValue("TradeAllyRegistration", "FirstName", "ESG Values", "TradeAlly_Registration", 13, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "LastName", "ESG Values", "TradeAlly_Registration", 14, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "PhoneNumber", "ESG Values", "TradeAlly_Registration", 15, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "EmailAddress", "ESG Values", "TradeAlly_Registration", 16, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "ConfirmEmailAddress", "ESG Values", "TradeAlly_Registration", 17, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "Password", "ESG Values", "TradeAlly_Registration", 18, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "ConfirmPassword", "ESG Values", "TradeAlly_Registration", 19, 1);
		WaitForElement(300, "TradeAllyRegistration", "Next_Button");
		clickWebelement("TradeAllyRegistration", "Next_Button");
		//threadWait(2000);
		defineLogs("Company Profile Information", "Company Profile Information", "Company Profile Information",
				"Navigate to Company Profile Information Successfully", "Unable to Navigate to Company Profile Information",
				"TradeAllyRegistration", "VerifyCompanyProfileInformation");
	}

	public static void Step3_CompanyProfileInformation() {
		clickWebelement("TradeAllyRegistration", "CompanyName");
		enterTextboxValue("TradeAllyRegistration", "CompanyName", "ESG Values", "TradeAlly_Registration", 23, 1);
		Enter(KeyEvent.VK_TAB);
		selectDropdown("TradeAllyRegistration", "TaxStatus","TaxStatus", "ESG Values", "TradeAlly_Registration",
				24, 1);
		
		clickWebelement("TradeAllyRegistration", "OfficeAddressStreet");
		enterTextboxValue("TradeAllyRegistration", "OfficeAddressStreet", "ESG Values", "TradeAlly_Registration", 25, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		
		clickWebelement("TradeAllyRegistration", "ZIP_PostalCode");
		enterTextboxValue("TradeAllyRegistration", "ZIP_PostalCode", "ESG Values", "TradeAlly_Registration", 26, 1);
		clickWebelement("TradeAllyRegistration", "CompanyWebsite");
		enterTextboxValue("TradeAllyRegistration", "CompanyWebsite", "ESG Values", "TradeAlly_Registration", 27, 1);
		
		clickWebelement("TradeAllyRegistration", "AddCompanyContact");
		//threadWait(2000);
		enterTextboxValue("TradeAllyRegistration", "Contacts_Name", "ESG Values", "TradeAlly_Registration", 29, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "Contacts_Title", "ESG Values", "TradeAlly_Registration", 30, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "Contacts_Email", "ESG Values", "TradeAlly_Registration", 31, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "Contacts_PhoneNumber", "ESG Values", "TradeAlly_Registration", 32, 1);
		clickWebelement("TradeAllyRegistration", "Contacts_Street");
		enterTextboxValue("TradeAllyRegistration", "Contacts_Street", "ESG Values", "TradeAlly_Registration", 33, 1);
		threadWait(2000);
		/*Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);*/
		Enter(KeyEvent.VK_TAB);
		clickWebelement("TradeAllyRegistration", "Contacts_PostalCode");
		enterTextboxValue("TradeAllyRegistration", "Contacts_PostalCode", "ESG Values", "TradeAlly_Registration", 34, 1);
		clickWebelement("TradeAllyRegistration", "Contacts_PrimaryContact");
		clickWebelement("TradeAllyRegistration", "SaveContact");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "AddLicense");
		//threadWait(2000);
		enterTextboxValue("TradeAllyRegistration", "Licenses_Number", "ESG Values", "TradeAlly_Registration", 36, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "Licensing_Agency", "ESG Values", "TradeAlly_Registration", 37, 1);
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "Licensing_ExpirationDate_Image");
		threadWait(2000);
		Enter(KeyEvent.VK_ENTER);
		//enterTextboxValue("TradeAllyRegistration", "Licensing_ExpirationDate", "ESG Values", "TradeAlly_Registration", 38, 1);
		//threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "SaveLicense");
		//threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "AddCertification");
		//threadWait(2000);
		enterTextboxValue("TradeAllyRegistration", "Certification", "ESG Values", "TradeAlly_Registration", 40, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TradeAllyRegistration", "CertifyingAgency", "ESG Values", "TradeAlly_Registration", 41, 1);
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "Certification_ExpirationDate_Image");
		threadWait(2000);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		//enterTextboxValue("TradeAllyRegistration", "Certification_ExpirationDate", "ESG Values", "TradeAlly_Registration", 42, 1);
		clickWebelement("TradeAllyRegistration", "SaveCertification");
		WaitForElement(300, "TradeAllyRegistration", "AddInsurancePolicies");
		clickWebelement("TradeAllyRegistration", "AddInsurancePolicies");
		enterTextboxValue("TradeAllyRegistration", "PolicyType", "ESG Values", "TradeAlly_Registration", 44, 1);
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "InsurancePolicy_ExpirationDate_Image");
		threadWait(2000);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		//enterTextboxValue("TradeAllyRegistration", "InsurancePolicy_ExpirationDate", "ESG Values", "TradeAlly_Registration", 45, 1);
		clickWebelement("TradeAllyRegistration", "SavePolicyType");
		WaitForElement(300, "TradeAllyRegistration", "Next_Button");
		clickWebelement("TradeAllyRegistration", "Next_Button");
		threadWait(2000);
		defineLogs("Qualification Information", "Qualification Information", "Qualification Information",
				"Navigate to Qualification Information Successfully", "Unable to Navigate to Qualification Information",
				"TradeAllyRegistration", "VerifyQualificationInformation");
	}

	public static void Step4_QualificationInformation() {
		clickWebelement("TradeAllyRegistration", "AddGeneralReference");
		WaitForElement(300, "TradeAllyRegistration", "GeneralReference_Name");
		clickWebelement("TradeAllyRegistration", "GeneralReference_Name");
		enterTextboxValue("TradeAllyRegistration", "GeneralReference_Name", "ESG Values", "TradeAlly_Registration", 48, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "GeneralReference_Street", "ESG Values", "TradeAlly_Registration", 49, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("TradeAllyRegistration", "GeneralReference_PostalCode");
		enterTextboxValue("TradeAllyRegistration", "GeneralReference_PostalCode", "ESG Values", "TradeAlly_Registration", 50, 1);
		clickWebelement("TradeAllyRegistration", "GeneralReference_PhoneNumber");
		enterTextboxValue("TradeAllyRegistration", "GeneralReference_PhoneNumber", "ESG Values", "TradeAlly_Registration", 51, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "GeneralReference_referencetype", "ESG Values", "TradeAlly_Registration", 52, 1);
		clickWebelement("TradeAllyRegistration", "SaveGeneralReference");
		WaitForElement(300, "TradeAllyRegistration", "AddCustomerReference");
		
		clickWebelement("TradeAllyRegistration", "AddCustomerReference");
		WaitForElement(300, "TradeAllyRegistration", "CustomerReference_Name");
		clickWebelement("TradeAllyRegistration", "CustomerReference_Name");
		enterTextboxValue("TradeAllyRegistration", "CustomerReference_Name", "ESG Values", "TradeAlly_Registration", 54, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "CustomerReference_Email", "ESG Values", "TradeAlly_Registration", 55, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "CustomerReference_PhoneNumber", "ESG Values", "TradeAlly_Registration", 56, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "CustomerReference_Servicesprovided", "ESG Values", "TradeAlly_Registration", 57, 1);
		clickWebelement("TradeAllyRegistration", "SaveCustomerReference");
		WaitForElement(300, "TradeAllyRegistration", "AddUtilityReference");
		
		clickWebelement("TradeAllyRegistration", "AddUtilityReference");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "UtilityReference_Name");
		enterTextboxValue("TradeAllyRegistration", "UtilityReference_Name", "ESG Values", "TradeAlly_Registration", 59, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "UtilityReference_ProjectYear", "ESG Values", "TradeAlly_Registration", 60, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "UtilityReference_ContactName", "ESG Values", "TradeAlly_Registration", 61, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "UtilityReference_ContactEmail", "ESG Values", "TradeAlly_Registration", 62, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "UtilityReference_PhoneNumber", "ESG Values", "TradeAlly_Registration", 63, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "UtilityReference_NumberofHomesTreated_InReferencedUtilityProgram", "ESG Values", "TradeAlly_Registration", 64, 1);
		clickWebelement("TradeAllyRegistration", "SaveUtilityReference");
		WaitForElement(300, "TradeAllyRegistration", "AddTradeReference");
		clickWebelement("TradeAllyRegistration", "AddTradeReference");
		WaitForElement(300, "TradeAllyRegistration", "TradeReference_Name");
		clickWebelement("TradeAllyRegistration", "TradeReference_Name");
		enterTextboxValue("TradeAllyRegistration", "TradeReference_Name", "ESG Values", "TradeAlly_Registration", 66, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "TradeReference_Title", "ESG Values", "TradeAlly_Registration", 67, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "TradeReference_PhoneNumber", "ESG Values", "TradeAlly_Registration", 68, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "TradeReference_Street", "ESG Values", "TradeAlly_Registration", 69, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("TradeAllyRegistration", "TradeReference_PostalCode");
		enterTextboxValue("TradeAllyRegistration", "TradeReference_PostalCode", "ESG Values", "TradeAlly_Registration",70, 1);
		clickWebelement("TradeAllyRegistration", "SaveTradeReference");
		WaitForElement(300, "TradeAllyRegistration", "Next_Button");
		clickWebelement("TradeAllyRegistration", "Next_Button");
		threadWait(2000);
		defineLogs("Program Information", "Program Information", "Program Information",
				"Navigate to Program Information Successfully", "Unable to Navigate to Program Information",
				"TradeAllyRegistration", "VerifyProgramInformation");
	}
	public static void Step5_ProgramInformation() {
		clickWebelement("TradeAllyRegistration", "ProgramContact");
		WaitForElement(300, "TradeAllyRegistration", "PrimaryProgramContact");
		clickWebelement("TradeAllyRegistration", "PrimaryProgramContact");
		
		clickWebelement("TradeAllyRegistration", "AddSubcontractors");
		WaitForElement(300, "TradeAllyRegistration", "Subcontractors_CompanyName");
		clickWebelement("TradeAllyRegistration", "Subcontractors_CompanyName");
		enterTextboxValue("TradeAllyRegistration", "Subcontractors_CompanyName", "ESG Values", "TradeAlly_Registration", 73, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "Subcontractors_ContactName", "ESG Values", "TradeAlly_Registration", 74, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "Subcontractors_ContactEmail", "ESG Values", "TradeAlly_Registration", 75, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "Subcontractors_PhoneNumber", "ESG Values", "TradeAlly_Registration", 76, 1);
		clickWebelement("TradeAllyRegistration", "Subcontractors_Street");
		enterTextboxValue("TradeAllyRegistration", "Subcontractors_Street", "ESG Values", "TradeAlly_Registration", 77, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("TradeAllyRegistration", "Subcontractors_PostalCode");
		enterTextboxValue("TradeAllyRegistration", "Subcontractors_PostalCode", "ESG Values", "TradeAlly_Registration", 78, 1);
		clickWebelement("TradeAllyRegistration", "SaveSubcontractors");
		WaitForElement(300, "TradeAllyRegistration", "MeasureToBeInstalled");
		
		clickWebelement("TradeAllyRegistration", "MeasureToBeInstalled");
		selectDropdown("TradeAllyRegistration", "MeasureType","MeasureType", "ESG Values", "TradeAlly_Registration",
				80, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "MeasureInstalledBy", "ESG Values", "TradeAlly_Registration", 81, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "yearsOfExperienceInInstallingMeasure", "ESG Values", "TradeAlly_Registration", 82, 1);
		Enter(KeyEvent.VK_TAB);		
		enterTextboxValue("TradeAllyRegistration", "ExplanationOfAnyThirdPartyTraining", "ESG Values", "TradeAlly_Registration", 83, 1);
		clickWebelement("TradeAllyRegistration", "SaveMeasure");
		
		clickWebelement("TradeAllyRegistration", "Next_Button");
		threadWait(2000);
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit",
				"TradeAllyRegistration", "VerifyReviewAndSubmit");
	}
	public static void Step6_ReviewAndSubmit() {
		scrollToElement("TradeAllyRegistration", "ReviewApplication");
		clickWebelement("TradeAllyRegistration", "ReviewApplication");
		WaitForElement(300, "TradeAllyRegistration", "Submit_Button");
		clickWebelement("TradeAllyRegistration", "Submit_Button");
		defineLogs("Thank you! Your registration has been successfully submitted. A confirmation email will be sent to you momentarily.", "Thank you! Your registration has been successfully submitted. A confirmation email will be sent to you momentarily.", "Thank you! Your registration has been successfully submitted. A confirmation email will be sent to you momentarily.",
				"Navigate to Confirmation page Successfully", "Unable to Navigate to Confirmation Page",
				"TradeAllyRegistration", "VerifySubmittionofApplication");
	}
	
	public static void ConfigureRegistrationTradeAlly() {
		NavigateToRegistration();
		clickWebelement("TradeAllyRegistration", "Registration_CompanyName");
		enterTextboxValue("TradeAllyRegistration", "Registration_CompanyName", "ESG Values", "TradeAlly_Registration", 23, 1);
		//clickWebelement("TradeAllyRegistration", "Registration_TaxID_or_SSN");
		//enterTextboxValue("TradeAllyRegistration", "Registration_TaxID_or_SSN", "ESG Values", "TradeAlly_Registration", 10, 1);
		selectDropdown("TradeAllyRegistration", "Registration_Status","Registration_Status", "ESG Values", "TradeAlly_Registration",
				86, 1);
		clickWebelement("TradeAllyRegistration", "Registration_Search_Button");
		WaitForElement(300, "TradeAllyRegistration", "Registration_CompanyLink");
		clickWebelement("TradeAllyRegistration", "Registration_CompanyLink");
		WaitForElement(300, "TradeAllyRegistration", "Registration_Abbreviation");
		clickWebelement("TradeAllyRegistration", "Registration_Abbreviation");
		enterTextboxValue("TradeAllyRegistration", "Registration_Abbreviation", "ESG Values", "TradeAlly_Registration", 87, 1);
		selectDropdown("TradeAllyRegistration", "Registration_TradeAllyType","Registration_TradeAllyType", "ESG Values", "TradeAlly_Registration",
				88, 1);
		clickonProcess();
		clickWebelement("TradeAllyRegistration", "Approved_Button");
		threadWait(2000);
		scrollToElement("TradeAllyRegistration", "Select_Regression_TradeAllyRegistration");
		clickWebelement("TradeAllyRegistration", "Select_Regression_TradeAllyRegistration");
		WaitForElement(300, "TradeAllyRegistration", "ProcessRegistration");
		clickWebelement("TradeAllyRegistration", "ProcessRegistration");
	}

}
