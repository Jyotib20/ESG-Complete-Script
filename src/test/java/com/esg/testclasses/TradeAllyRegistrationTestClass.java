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
		ClickByActionClass("TradeAllyRegistration", "Configuration", "ESG Values", "TradeAlly_Registration", 1, 1);
	}
	public static void NavigateToRegistration() {
		ClickByActionClass("TradeAllyRegistration", "MainMenu", "ESG Values", "TradeAlly_Registration", 3, 1);
	}
	public static void NavigateToOnlineApplication() {
		NavigateToProgramList();
		enterTextboxValue("TradeAllyRegistration", "SearchByProgramName", "ESG Values", "TradeAlly_Registration", 5, 1);
		clickWebelement("TradeAllyRegistration", "SearchTradeAlly");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "ProgramLink");
		clickWebelement("TradeAllyRegistration", "TradeAllyRegistration");
		clickWebelement("TradeAllyRegistration", "OnlineApplicationEnrollmentURL");
		clickWebelement("TradeAllyRegistration", "ShareLink");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "ShareLink_OnlineApplicarion");
		threadWait(2000);
		SwitchTab("TradeAllyRegistration", "CloseShareLink");
		clickWebelement("TradeAllyRegistration", "VerifyGettingStarted");
		//explicitWait(60, "TradeAllyRegistration", "VerifyGettingStarted");
		//SwitchTab("TradeAllyRegistration", "VerifyGettingStarted");
		defineLogs("Getting Started", "Getting Started", "Getting Started",
				"Navigate to Getting Started Successfully", "Unable to Navigate to Getting Started",
				"TradeAllyRegistration", "VerifyGettingStarted");
	}

	public static void Step1_GettingStarted() {
		clickWebelement("TradeAllyRegistration", "ProgramYear");
		selectDropdownByVisibleText("TradeAllyRegistration", "ProgramYear", "ESG Values", "TradeAlly_Registration",
				8, 1);
		selectDropdownByVisibleText("TradeAllyRegistration", "TaxID", "ESG Values", "TradeAlly_Registration",
				9, 1);
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
		enterValueByActionClass("TradeAllyRegistration", "FirstName", "ESG Values", "TradeAlly_Registration", 13, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "LastName", "ESG Values", "TradeAlly_Registration", 14, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "PhoneNumber", "ESG Values", "TradeAlly_Registration", 15, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "EmailAddress", "ESG Values", "TradeAlly_Registration", 16, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "ConfirmEmailAddress", "ESG Values", "TradeAlly_Registration", 17, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "Password", "ESG Values", "TradeAlly_Registration", 18, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "ConfirmPassword", "ESG Values", "TradeAlly_Registration", 19, 1);
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "Next_Button");
		threadWait(2000);
		defineLogs("Company Profile Information", "Company Profile Information", "Company Profile Information",
				"Navigate to Company Profile Information Successfully", "Unable to Navigate to Company Profile Information",
				"TradeAllyRegistration", "VerifyCompanyProfileInformation");
	}

	public static void Step3_CompanyProfileInformation() {
		clickWebelement("TradeAllyRegistration", "CompanyName");
		enterValueByActionClass("TradeAllyRegistration", "CompanyName", "ESG Values", "TradeAlly_Registration", 23, 1);
		Enter(KeyEvent.VK_TAB);
		selectDropdownByVisibleText("TradeAllyRegistration", "TaxStatus", "ESG Values", "TradeAlly_Registration",
				24, 1);
		
		clickWebelement("TradeAllyRegistration", "OfficeAddressStreet");
		enterValueByActionClass("TradeAllyRegistration", "OfficeAddressStreet", "ESG Values", "TradeAlly_Registration", 25, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		
		clickWebelement("TradeAllyRegistration", "ZIP_PostalCode");
		enterValueByActionClass("TradeAllyRegistration", "ZIP_PostalCode", "ESG Values", "TradeAlly_Registration", 26, 1);
		clickWebelement("TradeAllyRegistration", "CompanyWebsite");
		enterValueByActionClass("TradeAllyRegistration", "CompanyWebsite", "ESG Values", "TradeAlly_Registration", 27, 1);
		
		clickWebelement("TradeAllyRegistration", "AddCompanyContact");
		threadWait(2000);
		enterValueByActionClass("TradeAllyRegistration", "Contacts_Name", "ESG Values", "TradeAlly_Registration", 29, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "Contacts_Title", "ESG Values", "TradeAlly_Registration", 30, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "Contacts_Email", "ESG Values", "TradeAlly_Registration", 31, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "Contacts_PhoneNumber", "ESG Values", "TradeAlly_Registration", 32, 1);
		clickWebelement("TradeAllyRegistration", "Contacts_Street");
		enterValueByActionClass("TradeAllyRegistration", "Contacts_Street", "ESG Values", "TradeAlly_Registration", 33, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("TradeAllyRegistration", "Contacts_PostalCode");
		enterValueByActionClass("TradeAllyRegistration", "Contacts_PostalCode", "ESG Values", "TradeAlly_Registration", 34, 1);
		clickWebelement("TradeAllyRegistration", "Contacts_PrimaryContact");
		clickWebelement("TradeAllyRegistration", "SaveContact");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "AddLicense");
		threadWait(2000);
		enterValueByActionClass("TradeAllyRegistration", "Licenses_Number", "ESG Values", "TradeAlly_Registration", 36, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "Licensing_Agency", "ESG Values", "TradeAlly_Registration", 37, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "Licensing_ExpirationDate", "ESG Values", "TradeAlly_Registration", 38, 1);
		clickWebelement("TradeAllyRegistration", "SaveLicense");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "AddCertification");
		threadWait(2000);
		enterValueByActionClass("TradeAllyRegistration", "Certification", "ESG Values", "TradeAlly_Registration", 40, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "CertifyingAgency", "ESG Values", "TradeAlly_Registration", 41, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "Certification_ExpirationDate", "ESG Values", "TradeAlly_Registration", 42, 1);
		clickWebelement("TradeAllyRegistration", "SaveCertification");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "AddInsurancePolicies");
		threadWait(2000);
		enterValueByActionClass("TradeAllyRegistration", "PolicyType", "ESG Values", "TradeAlly_Registration", 44, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TradeAllyRegistration", "InsurancePolicy_ExpirationDate", "ESG Values", "TradeAlly_Registration", 45, 1);
		clickWebelement("TradeAllyRegistration", "SavePolicyType");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "Next_Button");
		threadWait(2000);
		defineLogs("Qualification Information", "Qualification Information", "Qualification Information",
				"Navigate to Qualification Information Successfully", "Unable to Navigate to Qualification Information",
				"TradeAllyRegistration", "VerifyQualificationInformation");
	}

	public static void Step4_QualificationInformation() {
		clickWebelement("TradeAllyRegistration", "AddGeneralReference");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "GeneralReference_Name");
		enterValueByActionClass("TradeAllyRegistration", "GeneralReference_Name", "ESG Values", "TradeAlly_Registration", 48, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "GeneralReference_Street", "ESG Values", "TradeAlly_Registration", 49, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("TradeAllyRegistration", "GeneralReference_PostalCode");
		enterValueByActionClass("TradeAllyRegistration", "GeneralReference_PostalCode", "ESG Values", "TradeAlly_Registration", 50, 1);
		clickWebelement("TradeAllyRegistration", "GeneralReference_PhoneNumber");
		enterValueByActionClass("TradeAllyRegistration", "GeneralReference_PhoneNumber", "ESG Values", "TradeAlly_Registration", 51, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "GeneralReference_referencetype", "ESG Values", "TradeAlly_Registration", 52, 1);
		clickWebelement("TradeAllyRegistration", "SaveGeneralReference");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "AddCustomerReference");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "CustomerReference_Name");
		enterValueByActionClass("TradeAllyRegistration", "CustomerReference_Name", "ESG Values", "TradeAlly_Registration", 54, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "CustomerReference_Email", "ESG Values", "TradeAlly_Registration", 55, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "CustomerReference_PhoneNumber", "ESG Values", "TradeAlly_Registration", 56, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "CustomerReference_Servicesprovided", "ESG Values", "TradeAlly_Registration", 57, 1);
		clickWebelement("TradeAllyRegistration", "SaveCustomerReference");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "AddUtilityReference");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "UtilityReference_Name");
		enterValueByActionClass("TradeAllyRegistration", "UtilityReference_Name", "ESG Values", "TradeAlly_Registration", 59, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "UtilityReference_ProjectYear", "ESG Values", "TradeAlly_Registration", 60, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "UtilityReference_ContactName", "ESG Values", "TradeAlly_Registration", 61, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "UtilityReference_ContactEmail", "ESG Values", "TradeAlly_Registration", 62, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "UtilityReference_PhoneNumber", "ESG Values", "TradeAlly_Registration", 63, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "UtilityReference_NumberofHomesTreated_InReferencedUtilityProgram", "ESG Values", "TradeAlly_Registration", 64, 1);
		clickWebelement("TradeAllyRegistration", "SaveUtilityReference");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "AddTradeReference");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "TradeReference_Name");
		enterValueByActionClass("TradeAllyRegistration", "TradeReference_Name", "ESG Values", "TradeAlly_Registration", 66, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "TradeReference_Title", "ESG Values", "TradeAlly_Registration", 67, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "TradeReference_PhoneNumber", "ESG Values", "TradeAlly_Registration", 68, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "TradeReference_Street", "ESG Values", "TradeAlly_Registration", 69, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("TradeAllyRegistration", "TradeReference_PostalCode");
		enterValueByActionClass("TradeAllyRegistration", "TradeReference_PostalCode", "ESG Values", "TradeAlly_Registration",70, 1);
		clickWebelement("TradeAllyRegistration", "SaveTradeReference");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "Next_Button");
		threadWait(2000);
		defineLogs("Program Information", "Program Information", "Program Information",
				"Navigate to Program Information Successfully", "Unable to Navigate to Program Information",
				"TradeAllyRegistration", "VerifyProgramInformation");
	}
	public static void Step5_ProgramInformation() {
		clickWebelement("TradeAllyRegistration", "ProgramContact");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "PrimaryProgramContact");
		
		clickWebelement("TradeAllyRegistration", "AddSubcontractors");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "Subcontractors_CompanyName");
		enterValueByActionClass("TradeAllyRegistration", "Subcontractors_CompanyName", "ESG Values", "TradeAlly_Registration", 73, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "Subcontractors_ContactName", "ESG Values", "TradeAlly_Registration", 74, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "Subcontractors_ContactEmail", "ESG Values", "TradeAlly_Registration", 75, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "Subcontractors_PhoneNumber", "ESG Values", "TradeAlly_Registration", 76, 1);
		clickWebelement("TradeAllyRegistration", "Subcontractors_Street");
		enterValueByActionClass("TradeAllyRegistration", "Subcontractors_Street", "ESG Values", "TradeAlly_Registration", 77, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("TradeAllyRegistration", "Subcontractors_PostalCode");
		enterValueByActionClass("TradeAllyRegistration", "Subcontractors_PostalCode", "ESG Values", "TradeAlly_Registration", 78, 1);
		clickWebelement("TradeAllyRegistration", "SaveSubcontractors");
		threadWait(2000);
		
		clickWebelement("TradeAllyRegistration", "MeasureToBeInstalled");
		threadWait(2000);
		selectDropdownByVisibleText("TradeAllyRegistration", "MeasureType", "ESG Values", "TradeAlly_Registration",
				80, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "MeasureInstalledBy", "ESG Values", "TradeAlly_Registration", 81, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "yearsOfExperienceInInstallingMeasure", "ESG Values", "TradeAlly_Registration", 82, 1);
		Enter(KeyEvent.VK_TAB);		
		enterValueByActionClass("TradeAllyRegistration", "ExplanationOfAnyThirdPartyTraining", "ESG Values", "TradeAlly_Registration", 83, 1);
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
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "Submit_Button");
		defineLogs("Thank you! Your registration has been successfully submitted. A confirmation email will be sent to you momentarily.", "Thank you! Your registration has been successfully submitted. A confirmation email will be sent to you momentarily.", "Thank you! Your registration has been successfully submitted. A confirmation email will be sent to you momentarily.",
				"Navigate to Confirmation page Successfully", "Unable to Navigate to Confirmation Page",
				"TradeAllyRegistration", "VerifySubmittionofApplication");
	}
	
	public static void ConfigureRegistrationTradeAlly() {
		NavigateToRegistration();
		clickWebelement("TradeAllyRegistration", "Registration_CompanyName");
		enterValueByActionClass("TradeAllyRegistration", "Registration_CompanyName", "ESG Values", "TradeAlly_Registration", 23, 1);
		//clickWebelement("TradeAllyRegistration", "Registration_TaxID_or_SSN");
		//enterValueByActionClass("TradeAllyRegistration", "Registration_TaxID_or_SSN", "ESG Values", "TradeAlly_Registration", 10, 1);
		selectDropdownByVisibleText("TradeAllyRegistration", "Registration_Status", "ESG Values", "TradeAlly_Registration",
				86, 1);
		clickWebelement("TradeAllyRegistration", "Registration_Search_Button");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "Registration_CompanyLink");
		threadWait(2000);
		clickWebelement("TradeAllyRegistration", "Registration_Abbreviation");
		enterValueByActionClass("TradeAllyRegistration", "Registration_Abbreviation", "ESG Values", "TradeAlly_Registration", 87, 1);
		selectDropdownByVisibleText("TradeAllyRegistration", "Registration_TradeAllyType", "ESG Values", "TradeAlly_Registration",
				88, 1);
		clickonProcess();
		clickWebelement("TradeAllyRegistration", "Approved_Button");
		threadWait(2000);
		scrollToElement("TradeAllyRegistration", "Select_Regression_TradeAllyRegistration");
		clickWebelement("TradeAllyRegistration", "Select_Regression_TradeAllyRegistration");
		
		clickWebelement("TradeAllyRegistration", "ProcessRegistration");
	}

}
