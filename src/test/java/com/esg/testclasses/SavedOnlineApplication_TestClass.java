package com.esg.testclasses;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import com.esg.utilities.HelperClass;
import com.esg.utilities.WriteExcel;
import com.relevantcodes.extentreports.LogStatus;

public class SavedOnlineApplication_TestClass extends HelperClass {
	
	
	public static void OpenOnlineApplication(String Relevant_Filename,String Provided_URL) 
	{
		  test = Report.startTest("Login");
		  ExecutingAgainst("Saved_Online_Application", "Version");
		  OpenBrowser(Relevant_Filename, Provided_URL);
		  implicitlywait(250);
		  defineLogs("Automation - Saved Online Application", "Automation - Saved Online Application", "Automation - Saved Online Application", "User navigate to Online Application Successfully", "User is not able to navigate to Online Application","Saved_Online_Application", "Varify_Online_Application");
		  Report.endTest(test);
	}   
	
	public static void Step1_GettingStarted() {
		clickWebelement("Saved_Online_Application", "AccountHolder");
		enterTextboxValue("Saved_Online_Application", "AccountNumber", "Saved Online Application", "SavedOnlineApplication", 3, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "NameOnAccount", "Saved Online Application", "SavedOnlineApplication", 4, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "StreetNumber", "Saved Online Application", "SavedOnlineApplication", 5, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "Unit", "Saved Online Application", "SavedOnlineApplication", 6, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "ZIP_or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 7, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "City", "Saved Online Application", "SavedOnlineApplication", 8, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "State", "Saved Online Application", "SavedOnlineApplication", 9, 1);
		clickWebelement("Saved_Online_Application", "SelectAnswerFor_TheAnswerisB");
		clickWebelement("Saved_Online_Application", "SelectAnswerFor_TheAnswerisC");
		threadWait(3000);
		clickWebelement("Saved_Online_Application", "NEXT_Button");
		threadWait(2000);
		defineLogs("Customer Information", "Customer Information", "Customer Information", "Navigate to Customer Information Successfully", "Unable to Navigate to Customer Information", "Saved_Online_Application", "VerifyCustomerInformation");	
	}
	
	public static void VerifyCustmerInformation_Step2() {
		 //Verify Customer Information-Complete Customer Information
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_AccountNumber", "Saved Online Application", "SavedOnlineApplication", 13, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_NameOnAccount", "Saved Online Application", "SavedOnlineApplication", 14, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 15, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 16, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 17, 1);
		//VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_Email", "Saved Online Application", "SavedOnlineApplication", 18, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_AlternateServiceProvider", "Saved Online Application", "SavedOnlineApplication", 19, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_AlternateAccountNumber", "Saved Online Application", "SavedOnlineApplication", 20, 1);		
	}
	
	public static void VerifyAccountHolderTaxInformation_Step2() {
		//Verify Account Holder Tax Information-Complete Customer Information
	    VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_AccountHolderTaxStatus", "Saved Online Application", "SavedOnlineApplication", 22, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_62yearsOrGreater", "Saved Online Application", "SavedOnlineApplication", 23, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_Disabled", "Saved Online Application", "SavedOnlineApplication", 24, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_DisabilityIdentification", "Saved Online Application", "SavedOnlineApplication", 25, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_Ethnicity", "Saved Online Application", "SavedOnlineApplication", 26, 1);
	}
	
	public static void VerifyApplicantInformation_Step2() {
		//Verify Applicant Information-Complete Customer Information
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_FirstName", "Saved Online Application", "SavedOnlineApplication", 28, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_LastName", "Saved Online Application", "SavedOnlineApplication", 29, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 30, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 31, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Applicant_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 32, 1);
		//VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_Email", "Saved Online Application", "SavedOnlineApplication", 33, 2);
		
	}
	public static void VerifyInstallationAddress_Step2() {
		//Verify Installation Address-Complete Customer Information
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_Street", "Saved Online Application", "SavedOnlineApplication", 35, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Installation_Address_Unit", "Saved Online Application", "SavedOnlineApplication", 36, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_ZIP_Or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 37, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_City", "Saved Online Application", "SavedOnlineApplication", 38, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_State", "Saved Online Application", "SavedOnlineApplication", 39, 1);
	}
	public static void VerifyMailingAddress_Step2() {
		//Verify Mailing Address-Complete Customer Information
		validationWithelementVisibility("Saved_Online_Application", "Mailing_Address_Is_mailing_address_same_as_Installation_Address_No", "Redio button 'No' is in checked state", "Redio button 'Yes' is in checked state");
		validationWithelementVisibility("Saved_Online_Application", "Mailing_Address_Is_this_a_PO_Box", "Redio button is in unchecked state", "Redio button is in checked state");
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Mailing_Address_Country", "Saved Online Application", "SavedOnlineApplication", 41, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_Street", "Saved Online Application", "SavedOnlineApplication", 42, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Mailing_Address_Unit", "Saved Online Application", "SavedOnlineApplication", 43, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_ZIP_Or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 44, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_City", "Saved Online Application", "SavedOnlineApplication", 45, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_State", "Saved Online Application", "SavedOnlineApplication", 46, 1);
	}
	public static void VerifyPropertyInformation_Step2() {
		//Verify Property Information-Complete Customer Information
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_BuildingType", "Saved Online Application", "SavedOnlineApplication", 48, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 49, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AccesstoAllRooms", "Saved Online Application", "SavedOnlineApplication", 50, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AirConditioned", "Saved Online Application", "SavedOnlineApplication", 51, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AirConditionedSquareFootage", "Saved Online Application", "SavedOnlineApplication", 52, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AnticipatedDateforClosing", "Saved Online Application", "SavedOnlineApplication", 53, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AuditPerformed", "Saved Online Application", "SavedOnlineApplication", 54, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AvailableDateforInspection", "Saved Online Application", "SavedOnlineApplication", 55, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_BenchmarkCompleted", "Saved Online Application", "SavedOnlineApplication", 56, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_BuildingPermitNumber", "Saved Online Application", "SavedOnlineApplication", 57, 1);
		
		validationWithelementVisibility("Saved_Online_Application", "Property_Information_Checkbox", "Check box is in unchecked state", "Check box is in checked state");
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_ConstructionType", "Saved Online Application", "SavedOnlineApplication", 58, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Date", "Saved Online Application", "SavedOnlineApplication", 59, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_DropDownList", "Saved Online Application", "SavedOnlineApplication", 60, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Formula", "Saved Online Application", "SavedOnlineApplication", 61, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_FoundationType", "Saved Online Application", "SavedOnlineApplication", 62, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_HERSCertificationDate", "Saved Online Application", "SavedOnlineApplication", 63, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_HERSIndex", "Saved Online Application", "SavedOnlineApplication", 64, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_IsEnergyStar", "Saved Online Application", "SavedOnlineApplication", 65, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 66, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_NumberofBedrooms", "Saved Online Application", "SavedOnlineApplication", 67, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_NumberofEmployees", "Saved Online Application", "SavedOnlineApplication", 68, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_NumberofOccupants", "Saved Online Application", "SavedOnlineApplication", 69, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_NumericValue", "Saved Online Application", "SavedOnlineApplication", 70, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_ParkName", "Saved Online Application", "SavedOnlineApplication", 71, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_PremiseSquareFootage", "Saved Online Application", "SavedOnlineApplication", 72, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_ServiceDistrict", "Saved Online Application", "SavedOnlineApplication", 73, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SiteBlockNumber", "Saved Online Application", "SavedOnlineApplication", 74, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SiteLotNumber", "Saved Online Application", "SavedOnlineApplication", 75, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SpaceHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 76, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SpaceHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 77, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SubdivisionName", "Saved Online Application", "SavedOnlineApplication", 78, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_TextBox", "Saved Online Application", "SavedOnlineApplication", 79, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_WaterHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 80, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_WaterHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 81, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_WeeklyHoursofOperation", "Saved Online Application", "SavedOnlineApplication", 82, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_YearBuilt", "Saved Online Application", "SavedOnlineApplication", 83, 1);
	}
	public static void VerifyGeneralApplicationInformation_Step2() {
		//Verify General Application Information-Complete Customer Information
		VerifyElementForExistingValueWithText("Saved_Online_Application", "General_Application_Information_Organization", "Saved Online Application", "SavedOnlineApplication", 85, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "General_Application_Information_ProjectType", "Saved Online Application", "SavedOnlineApplication", 86, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "General_Application_Information_TerminationDate", "Saved Online Application", "SavedOnlineApplication", 87, 1);
	}
	
	public static void Step2_Complete_CustomerInformation() {	
		
		//Enter Values in Customer Information
		enterTextboxValue("Saved_Online_Application", "Customer_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 90, 1);
		enterTextboxValue("Saved_Online_Application", "Customer_Information_Email", "Saved Online Application", "SavedOnlineApplication", 91, 1);
		selectDropdown("Saved_Online_Application", "Customer_Information_AlternateServiceProvider","Customer_Information_AlternateServiceProvider", "Saved Online Application", "SavedOnlineApplication", 92, 1);
		enterTextboxValue("Saved_Online_Application", "Customer_Information_AlternateAccountNumber", "Saved Online Application", "SavedOnlineApplication", 93, 1);
		
		//Enter Values in Account Holder Tax Information
		selectDropdown("Saved_Online_Application", "Tax_Information_AccountHolderTaxStatus","Tax_Information_AccountHolderTaxStatus", "Saved Online Application", "SavedOnlineApplication", 95, 1);
		selectDropdown("Saved_Online_Application", "Tax_Information_AccountHolderTaxIDType","Tax_Information_AccountHolderTaxIDType", "Saved Online Application", "SavedOnlineApplication", 96, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "Tax_Information_AccountHolderTaxID_SSN", "Saved Online Application", "SavedOnlineApplication", 97, 1);
		selectDropdown("Saved_Online_Application", "Tax_Information_62yearsOrGreater","Tax_Information_62yearsOrGreater", "Saved Online Application", "SavedOnlineApplication", 98, 1);
		selectDropdown("Saved_Online_Application", "Tax_Information_Disabled","Tax_Information_Disabled", "Saved Online Application", "SavedOnlineApplication", 99, 1);
		selectDropdown("Saved_Online_Application", "Tax_Information_DisabilityIdentification","Tax_Information_DisabilityIdentification", "Saved Online Application", "SavedOnlineApplication", 100, 1);
		selectDropdown("Saved_Online_Application", "Tax_Information_Ethnicity","Tax_Information_Ethnicity", "Saved Online Application", "SavedOnlineApplication", 101, 1);
		
		//Enter Values in Applicant Information
		enterTextboxValue("Saved_Online_Application", "Applicant_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 103, 1);
		enterTextboxValue("Saved_Online_Application", "Applicant_Information_Email", "Saved Online Application", "SavedOnlineApplication", 104, 1);
		
		//Enter Values in Property Information
		selectDropdown("Saved_Online_Application", "Property_Information_AccesstoAllRooms","Property_Information_AccesstoAllRooms", "Saved Online Application", "SavedOnlineApplication", 106, 1);
		selectDropdown("Saved_Online_Application", "Property_Information_AirConditioned","Property_Information_AirConditioned", "Saved Online Application", "SavedOnlineApplication", 107, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_AirConditionedSquareFootage", "Saved Online Application", "SavedOnlineApplication", 108, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_AnticipatedDateforClosing", "Saved Online Application", "SavedOnlineApplication", 109, 1);
		selectDropdown("Saved_Online_Application", "Property_Information_AuditPerformed","Property_Information_AuditPerformed", "Saved Online Application", "SavedOnlineApplication", 110, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_AvailableDateforInspection", "Saved Online Application", "SavedOnlineApplication", 111, 1);
		selectDropdown("Saved_Online_Application", "Property_Information_BenchmarkCompleted","Property_Information_BenchmarkCompleted", "Saved Online Application", "SavedOnlineApplication", 112, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_BenchmarkScore", "Saved Online Application", "SavedOnlineApplication", 113, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_BuildingPermitNumber", "Saved Online Application", "SavedOnlineApplication", 114, 1);
		clickWebelement("Saved_Online_Application", "Property_Information_Checkbox");
		selectDropdown("Saved_Online_Application", "Property_Information_ConstructionType","Property_Information_ConstructionType", "Saved Online Application", "SavedOnlineApplication", 115, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_Date", "Saved Online Application", "SavedOnlineApplication", 116, 1);
		selectDropdown("Saved_Online_Application", "Property_Information_DropDownList","Property_Information_DropDownList", "Saved Online Application", "SavedOnlineApplication", 117, 1);
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Formula", "Saved Online Application", "SavedOnlineApplication", 118, 1);
		
		selectDropdown("Saved_Online_Application", "Property_Information_FoundationType","Property_Information_FoundationType", "Saved Online Application", "SavedOnlineApplication", 119, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_HERSCertificationDate", "Saved Online Application", "SavedOnlineApplication", 120, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_HERSIndex", "Saved Online Application", "SavedOnlineApplication", 121, 1);
		selectDropdown("Saved_Online_Application", "Property_Information_IsEnergyStar","Property_Information_IsEnergyStar", "Saved Online Application", "SavedOnlineApplication", 122, 1);
		
		//clickWebelement("Saved_Online_Application", "Property_Information_MultiSelect");
		enterTextboxValue("Saved_Online_Application", "Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 123, 1);
		Enter(KeyEvent.VK_ENTER);
		//clickWebelement("Saved_Online_Application", "Property_Information_MultiSelect");
		enterTextboxValue("Saved_Online_Application", "Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 123, 2);
		Enter(KeyEvent.VK_ENTER);
		//clickWebelement("Saved_Online_Application", "Property_Information_MultiSelect");
		enterTextboxValue("Saved_Online_Application", "Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 123, 3);
		Enter(KeyEvent.VK_ENTER);
		
		enterTextboxValue("Saved_Online_Application", "Property_Information_NumberofBedrooms", "Saved Online Application", "SavedOnlineApplication", 124, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_NumberofEmployees", "Saved Online Application", "SavedOnlineApplication", 125, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_NumberofOccupants", "Saved Online Application", "SavedOnlineApplication", 126, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_NumericValue", "Saved Online Application", "SavedOnlineApplication", 127, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_ParkName", "Saved Online Application", "SavedOnlineApplication", 128, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_PremiseSquareFootage", "Saved Online Application", "SavedOnlineApplication", 129, 1);
		
		selectDropdown("Saved_Online_Application", "Property_Information_ServiceDistrict", "Property_Information_ServiceDistrict", "Saved Online Application", "SavedOnlineApplication", 130, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_SiteBlockNumber", "Saved Online Application", "SavedOnlineApplication", 131, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_SiteLotNumber", "Saved Online Application", "SavedOnlineApplication", 132, 1);		
		selectDropdown("Saved_Online_Application", "Property_Information_SpaceHeatingServiceProvider","Property_Information_SpaceHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 133, 1);
		selectDropdown("Saved_Online_Application", "Property_Information_SpaceHeatingFuelType","Property_Information_SpaceHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 134, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_SubdivisionName", "Saved Online Application", "SavedOnlineApplication", 135, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_TextBox", "Saved Online Application", "SavedOnlineApplication", 136, 1);		
		selectDropdown("Saved_Online_Application", "Property_Information_WaterHeatingServiceProvider","Property_Information_WaterHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 137, 1);
		selectDropdown("Saved_Online_Application", "Property_Information_WaterHeatingFuelType","Property_Information_WaterHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 138, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_WeeklyHoursofOperation", "Saved Online Application", "SavedOnlineApplication", 139, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_YearBuilt", "Saved Online Application", "SavedOnlineApplication", 140, 1);
		
		//Enter Values in General Application Information
		enterTextboxValue("Saved_Online_Application", "General_Application_Information_Organization", "Saved Online Application", "SavedOnlineApplication", 142, 1);
		selectDropdown("Saved_Online_Application", "General_Application_Information_ProjectType","General_Application_Information_ProjectType", "Saved Online Application", "SavedOnlineApplication", 143, 1);
		enterTextboxValue("Saved_Online_Application", "General_Application_Information_TerminationDate", "Saved Online Application", "SavedOnlineApplication", 144, 1);
		
		clickWebelement("Saved_Online_Application", "NEXT_Button");
		threadWait(2000);
		defineLogs("Installer Information", "Installer Information", "Installer Information", "Navigate to Installer Information Successfully", "Unable to Navigate to Installer Information", "Saved_Online_Application", "VerifyInstallerInformation");

	}
	
public static void Step3_Complete_InstallerInformation() {
		
		clickWebelement("Saved_Online_Application", "Installer_Information_WorkPerformedBy_Installer");
		clickWebelement("Saved_Online_Application", "Installer_Information_Company");
		enterTextboxValue("Saved_Online_Application", "Installer_Information_Company", "Saved Online Application", "SavedOnlineApplication", 149, 1);
		threadWait(3000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "Installer_Information_ContactName", "Saved Online Application", "SavedOnlineApplication", 150, 1);
		threadWait(3000);
		Enter(KeyEvent.VK_ENTER);
		threadWait(5000);
		//Verify Installer Information
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactPhone", "Saved Online Application", "SavedOnlineApplication", 155, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactEmail", "Saved Online Application", "SavedOnlineApplication", 104, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactFax", "Saved Online Application", "SavedOnlineApplication", 157, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Website", "Saved Online Application", "SavedOnlineApplication", 158, 1);
		
		validationWithelementVisibility("Saved_Online_Application", "Installer_Information_Isthis_A_POBox", "PO box selected checkbox is: Yes", "PO box selected checkbox is: No");
		
		//VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_InCareof_or_Recipient", "Saved Online Application", "SavedOnlineApplication", 159, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Street", "Saved Online Application", "SavedOnlineApplication", 160, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Unit", "Saved Online Application", "SavedOnlineApplication", 161, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ZIP_or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 162, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_City", "Saved Online Application", "SavedOnlineApplication", 163, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_State", "Saved Online Application", "SavedOnlineApplication", 164, 1);
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "NEXT_Button");
		threadWait(2000);
		defineLogs("Payee Information", "Payee Information", "Payee Information", "Navigate to Payee Information Successfully", "Unable to Navigate to Payee Information", "Saved_Online_Application", "VerifyPayeeInformation");	
	}
	
public static void Step4_Complete_PayeeInformation() {
	clickWebelement("Saved_Online_Application", "Applicant");
	threadWait(3000);
	//Verify Payee Information
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payee_Information_Name", "Saved Online Application", "SavedOnlineApplication", 168, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payee_Information_Phone", "Saved Online Application", "SavedOnlineApplication", 169, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payee_Information_TaxStatus", "Saved Online Application", "SavedOnlineApplication", 170, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_InCareof_or_Recipient", "Saved Online Application", "SavedOnlineApplication", 171, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_Street", "Saved Online Application", "SavedOnlineApplication", 172, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_Unit", "Saved Online Application", "SavedOnlineApplication", 173, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_ZIP_or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 174, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_City", "Saved Online Application", "SavedOnlineApplication", 175, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_State", "Saved Online Application", "SavedOnlineApplication", 176, 1);
	
	//clickWebelement("Saved_Online_Application", "Payee_Information_TaxStatus");
	selectDropdown("Saved_Online_Application", "Payee_Information_TaxStatus", "Payee_Information_TaxStatus", "Saved Online Application", "SavedOnlineApplication", 179, 1);
	clickWebelement("Saved_Online_Application", "Payee_Information_TaxIDType_SSN");
	enterTextboxValue("Saved_Online_Application", "Payee_Information_TaxIDNumber", "Saved Online Application", "SavedOnlineApplication", 180, 1);
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information", "Saved_Online_Application", "VerifyEquipmentInformation");	
}

public static void Step5_Complete_EquipmentInformation() {
	clickWebelement("Saved_Online_Application", "Equipment_Information_Select_DateImage");
	Enter(KeyEvent.VK_ENTER);	
	clickWebelement("Saved_Online_Application", "Equipment_Information_Add_Equipment");
	
	WaitForElement(3000, "Saved_Online_Application", "Equipment_Information_Verify_AddEquipment");
	clickWebelement("Saved_Online_Application", "Equipment_Information_Add_CPLEnergyStar_ClothesWasher_Residential");
	clickWebelement("Saved_Online_Application", "Equipment_Information_Add_Regression_SavedOnlineApplicationMeasure");
	threadWait(2000);
	clickWebelement("Saved_Online_Application", "Equipment_Information_Clickon_OKButton");
	
	//Enter Value for CPL: Energy Star - Clothes Washer - Residential
	enterTextboxValue("Saved_Online_Application", "CPL_EnergyStar_Quantity", "Saved Online Application", "SavedOnlineApplication", 189, 1);
	WaitForElement(3000, "Saved_Online_Application", "CPL_EnergyStar_BrandName");
	selectDropdown("Saved_Online_Application", "CPL_EnergyStar_BrandName","CPL_EnergyStar_BrandName", "Saved Online Application", "SavedOnlineApplication", 190, 1);
	WaitForElement(3000, "Saved_Online_Application", "CPL_EnergyStar_ModelNumber");
	selectDropdown("Saved_Online_Application", "CPL_EnergyStar_ModelNumber","CPL_EnergyStar_ModelNumber", "Saved Online Application", "SavedOnlineApplication", 191, 1);
	
	//Enter Value for Regression - Saved Online Application Measure
	enterTextboxValue("Saved_Online_Application", "Saved_Online_Application_Measure_Quantity", "Saved Online Application", "SavedOnlineApplication", 223, 1);
	clickWebelement("Saved_Online_Application", "Saved_Online_Application_Measure_CheckBox");
	clickWebelement("Saved_Online_Application", "Saved_Online_Application_Measure_CheckBoxGroup_One");
	enterTextboxValue("Saved_Online_Application", "Saved_Online_Application_Measure_Date", "Saved Online Application", "SavedOnlineApplication", 224, 1);
	enterTextboxValue("Saved_Online_Application", "Saved_Online_Application_Measure_DDL", "Saved Online Application", "SavedOnlineApplication", 225, 1);
	enterTextboxValue("Saved_Online_Application", "Saved_Online_Application_Measure_Numeric", "Saved Online Application", "SavedOnlineApplication", 226, 1);
	clickWebelement("Saved_Online_Application", "Saved_Online_Application_Measure_RadioButtonGroup_Three");
	enterTextboxValue("Saved_Online_Application", "Saved_Online_Application_Measure_TextBox", "Saved Online Application", "SavedOnlineApplication", 227, 1);
	
	//Verify CPL: Energy Star - Clothes Washer - Residential
	scrollToElement("Saved_Online_Application", "CPL_EnergyStar_BrandName");
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_BrandName", "Saved Online Application", "SavedOnlineApplication", 194, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_ModelNumber", "Saved Online Application", "SavedOnlineApplication", 195, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_LoadConfiguration", "Saved Online Application", "SavedOnlineApplication", 196, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_AdditionalModelInformation", "Saved Online Application", "SavedOnlineApplication", 197, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_AdditionalWasherFeatures", "Saved Online Application", "SavedOnlineApplication", 198, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_AnnualEnergyUse", "Saved Online Application", "SavedOnlineApplication", 199, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_AnnualWaterUse", "Saved Online Application", "SavedOnlineApplication", 200, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_CommunicationStandardApplicationLayer", "Saved Online Application", "SavedOnlineApplication", 201, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_Connected", "Saved Online Application", "SavedOnlineApplication", 202, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_ConnectsUsing", "Saved Online Application", "SavedOnlineApplication", 203, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_DateAvailableOnMarket", "Saved Online Application", "SavedOnlineApplication", 204, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_DateCertified", "Saved Online Application", "SavedOnlineApplication", 205, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_DirectOn_premisesOpen_StandardBasedInterConnection", "Saved Online Application", "SavedOnlineApplication", 206, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_ENERGYSTARModel_Identifier", "Saved Online Application", "SavedOnlineApplication", 207, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_ENERGYSTARUniqueID", "Saved Online Application", "SavedOnlineApplication", 208, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_IntegratedModifiedEnergyFactor", "Saved Online Application", "SavedOnlineApplication", 209, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_IntegratedWaterFactor", "Saved Online Application", "SavedOnlineApplication", 210, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_IntendedMarket", "Saved Online Application", "SavedOnlineApplication", 211, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_Markets", "Saved Online Application", "SavedOnlineApplication", 212, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_MeetsENERGYSTARMostEfficient_2018Criteria", "Saved Online Application", "SavedOnlineApplication", 213, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_PairedENERGYSTARClothesDryerAvailable", "Saved Online Application", "SavedOnlineApplication", 214, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_PairedENERGYSTARClothesDryer_ENERGYSTARModel_Identifier", "Saved Online Application", "SavedOnlineApplication", 215, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_UPC", "Saved Online Application", "SavedOnlineApplication", 216, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_USFederalStandard_IMEF", "Saved Online Application", "SavedOnlineApplication", 217, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_USFederalStandard_IWF", "Saved Online Application", "SavedOnlineApplication", 218, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_Volume", "Saved Online Application", "SavedOnlineApplication", 219, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_Incentive", "Saved Online Application", "SavedOnlineApplication", 220, 1);
	
	//Verify Regression - Saved Online Application Measure
	Enter(KeyEvent.VK_END);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Saved_Online_Application_Measure_Cost", "Saved Online Application", "SavedOnlineApplication", 230, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Saved_Online_Application_Measure_Formula", "Saved Online Application", "SavedOnlineApplication", 231, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Saved_Online_Application_Measure_Incentive", "Saved Online Application", "SavedOnlineApplication", 232, 1);
	
	//Verify Equipment Information
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Equipment_Information_TotalProjectCost", "Saved Online Application", "SavedOnlineApplication", 184, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Equipment_Information_IncentiveSummary", "Saved Online Application", "SavedOnlineApplication", 185, 1);
	
	threadWait(2000);
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	threadWait(5000);
	defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "Navigate to Incentive Summary Successfully", "Unable to Navigate to Incentive Summary", "Saved_Online_Application", "VerifyIncentiveSummary");
}

public static void Step6_Complete_IncentiveSummary() {
	threadWait(2000);
	defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "The Element varified successfully", "Unable to Verify the element", "Saved_Online_Application", "Applied_for");
	
	//Verify CPL: Energy Star - Clothes Washer - Residential
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Quantity", "Saved Online Application", "SavedOnlineApplication", 237, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Total", "Saved Online Application", "SavedOnlineApplication", 238, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_BrandName", "Saved Online Application", "SavedOnlineApplication", 239, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_ModelNumber", "Saved Online Application", "SavedOnlineApplication", 240, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_LoadConfiguration", "Saved Online Application", "SavedOnlineApplication", 241, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_AdditionalModelInformation", "Saved Online Application", "SavedOnlineApplication", 242, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_AdditionalWasherFeatures", "Saved Online Application", "SavedOnlineApplication", 243, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_AnnualEnergyUse", "Saved Online Application", "SavedOnlineApplication", 244, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_AnnualWaterUse", "Saved Online Application", "SavedOnlineApplication", 245, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_CommunicationStandardApplicationLayer", "Saved Online Application", "SavedOnlineApplication", 246, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Connected", "Saved Online Application", "SavedOnlineApplication", 247, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_ConnectsUsing", "Saved Online Application", "SavedOnlineApplication", 248, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_DateAvailableonMarket", "Saved Online Application", "SavedOnlineApplication", 249, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_DateCertified", "Saved Online Application", "SavedOnlineApplication", 250, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_DirectOnpremises_Openstandard_BasedInterconnection", "Saved Online Application", "SavedOnlineApplication", 251, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_ENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 252, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_ENERGYSTARUniqueID", "Saved Online Application", "SavedOnlineApplication", 253, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_IntegratedModifiedEnergyFactor", "Saved Online Application", "SavedOnlineApplication", 254, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_IntegratedWaterFactor", "Saved Online Application", "SavedOnlineApplication", 255, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_IntendedMarket", "Saved Online Application", "SavedOnlineApplication", 256, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Markets", "Saved Online Application", "SavedOnlineApplication", 257, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_MeetsENERGYSTARMostEfficient2018Criteria", "Saved Online Application", "SavedOnlineApplication", 258, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_PairedENERGYSTARClothesDryerAvailable", "Saved Online Application", "SavedOnlineApplication", 259, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 260, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_UPC", "Saved Online Application", "SavedOnlineApplication", 261, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_USFederalStandard_IMEF", "Saved Online Application", "SavedOnlineApplication", 262, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_USFederalStandard_IWF", "Saved Online Application", "SavedOnlineApplication", 263, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Volume", "Saved Online Application", "SavedOnlineApplication", 264, 1);
	
	//Verify Regression - Saved Online Application Measure
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Quantity", "Saved Online Application", "SavedOnlineApplication", 266, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Total", "Saved Online Application", "SavedOnlineApplication", 267, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_CheckBox", "Saved Online Application", "SavedOnlineApplication", 268, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_CheckBoxGroup", "Saved Online Application", "SavedOnlineApplication", 269, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Date", "Saved Online Application", "SavedOnlineApplication", 270, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_DDL", "Saved Online Application", "SavedOnlineApplication", 271, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Formula", "Saved Online Application", "SavedOnlineApplication", 272, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Numeric", "Saved Online Application", "SavedOnlineApplication", 273, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_RadioButtonGroup", "Saved Online Application", "SavedOnlineApplication", 274, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_TextBox", "Saved Online Application", "SavedOnlineApplication", 275, 1);
	
	defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "The Element varified successfully", "Unable to Verify the element", "Saved_Online_Application", "Total");
	threadWait(2000);
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	threadWait(2000);
	defineLogs("Payment Information", "Payment Information", "Payment Information", "Navigate to Payment Information Successfully", "Unable to Navigate to Payment Information", "Saved_Online_Application", "VerifyPaymentInformation");	
}

public static void Step7_Complete_PaymentInformation() {
	threadWait(2000);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payment_Information_Verify_Total", "Saved Online Application", "SavedOnlineApplication", 278, 1);
	selectDropdown("Saved_Online_Application", "Payment_Information_Select_Payment_Method","Payment_Information_Select_Payment_Method", "Saved Online Application", "SavedOnlineApplication", 279, 1);
	clickWebelement("Saved_Online_Application", "Payment_Information_Pay_Full_Amount");
	selectDropdown("Saved_Online_Application", "Payment_Information_Choose_Payment_Terms","Payment_Information_Choose_Payment_Terms", "Saved Online Application", "SavedOnlineApplication", 280, 1);
	threadWait(2000);
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	threadWait(2000);
	defineLogs("How did you hear about us?", "How did you hear about us?", "How did you hear about us?", "Navigate to How did you hear about us? Successfully", "Unable to Navigate to How did you hear about us?", "Saved_Online_Application", "Verify_Howdidyouhearaboutus");	
}

public static void Step8_Complete_How_did_you_hear_about_us() {
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_LeadSourceCategory","How_Did_You_Hear_About_Us_LeadSourceCategory", "Saved Online Application", "SavedOnlineApplication", 283, 1);
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_LeadSource","How_Did_You_Hear_About_Us_LeadSource", "Saved Online Application", "SavedOnlineApplication", 284, 1);
	WaitForElement(30, "Saved_Online_Application", "How_Did_You_Hear_About_Us_OutreachSource_TradeAlly");
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_OutreachSource_TradeAlly","How_Did_You_Hear_About_Us_OutreachSource_TradeAlly", "Saved Online Application", "SavedOnlineApplication", 285, 1);
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_OutreachSource_Employee","How_Did_You_Hear_About_Us_OutreachSource_Employee", "Saved Online Application", "SavedOnlineApplication", 286, 1);
	//clickWebelement("Saved_Online_Application", "How_Did_You_Hear_About_Us_ClickAccountExecutive");
	//WaitForElement(30, "Saved_Online_Application", "How_Did_You_Hear_About_Us_AccountExecutive");
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_AccountExecutive","How_Did_You_Hear_About_Us_AccountExecutive", "Saved Online Application", "SavedOnlineApplication", 287, 1);
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_Campaign","How_Did_You_Hear_About_Us_Campaign", "Saved Online Application", "SavedOnlineApplication", 288, 1);
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_MarketingRep","How_Did_You_Hear_About_Us_MarketingRep", "Saved Online Application", "SavedOnlineApplication", 289, 1);
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_Segment","How_Did_You_Hear_About_Us_Segment", "Saved Online Application", "SavedOnlineApplication", 290, 1);
	selectDropdown("Saved_Online_Application", "How_Did_You_Hear_About_Us_TargetMarket","How_Did_You_Hear_About_Us_TargetMarket", "Saved Online Application", "SavedOnlineApplication", 291, 1);
	clickWebelement("Saved_Online_Application", "How_Did_You_Hear_About_Us_Was_your_house_built_before1993_Yes");
	clickWebelement("Saved_Online_Application", "How_Did_You_Hear_About_Us_Have_you_replaced_your_water_heater_in_the_last5years");
	threadWait(2000);
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	threadWait(2000);
	defineLogs("Documentation", "Documentation", "Documentation", "Navigate to Documentation Successfully", "Unable to Navigate to Documentation", "Saved_Online_Application", "VerifyDocumentation");	
}

public static void Step9_Complete_Documentation() {
	clickWebelement("Saved_Online_Application", "Documentation_AddDocument");
	selectDropdown("Saved_Online_Application", "Documentation_DocumentType","Documentation_DocumentType", "Saved Online Application", "SavedOnlineApplication", 294, 1);
	clickWebelement("Saved_Online_Application", "Documentation_ChooseFile");
	try {
		UploadFile("Saved_Online_Application", "Documentation_FilePath");
	} catch (AWTException e) {
		System.out.println("Unable to upload File");
	}
	clickWebelement("Saved_Online_Application", "Documentation_Description");
	enterTextboxValue("Saved_Online_Application", "Documentation_Description", "Saved Online Application", "SavedOnlineApplication", 295, 1);
	clickWebelement("Saved_Online_Application", "Documentation_Upload");
	threadWait(5000);
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	threadWait(2000);
	defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions", "Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions", "Saved_Online_Application", "VerifyTermsandCondition");	
}

public static void Step10_Complete_Terms_and_Conditions() {
	clickWebelement("Saved_Online_Application", "Accept_Agreement");
	threadWait(2000);
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	threadWait(2000);
	defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "Saved_Online_Application", "VerifyReviewAndSubmit");	
	
}

public static void VerifyCustmerInformation_Step11() {
	 //Verify Customer Information-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_NameOnAccount", "Saved Online Application", "SavedOnlineApplication", 302, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 303, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 304, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 305, 1);
	//VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_Email", "Saved Online Application", "SavedOnlineApplication", 306, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_AlternateServiceProvider", "Saved Online Application", "SavedOnlineApplication", 307, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_AlternateAccountNumber", "Saved Online Application", "SavedOnlineApplication", 308, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_62years_or_greater", "Saved Online Application", "SavedOnlineApplication", 309, 1);		
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_Disabled", "Saved Online Application", "SavedOnlineApplication", 310, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_DisabilityIdentification", "Saved Online Application", "SavedOnlineApplication", 311, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_Ethnicity", "Saved Online Application", "SavedOnlineApplication", 312, 1);
}

public static void VerifyAccountHolderTaxInformation_Step11() {
	//Verify Account Holder Tax Information-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_AccountHolder_TaxInformation_AccountHolderTaxStatus", "Saved Online Application", "SavedOnlineApplication", 315, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_AccountHolder_TaxInformation_AccountHolderTaxIDType", "Saved Online Application", "SavedOnlineApplication", 316, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_AccountHolder_TaxInformation_Account_Holder_Tax_ID_or_SSN", "Saved Online Application", "SavedOnlineApplication", 317, 1);
}

public static void VerifyApplicantInformation_Step11() {
	//Verify Applicant Information-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_ApplicantName", "Saved Online Application", "SavedOnlineApplication", 320, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_Phone", "Saved Online Application", "SavedOnlineApplication", 321, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 322, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 323, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_Email", "Saved Online Application", "SavedOnlineApplication", 324, 1);
	
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_InstallationAddress_Street", "Saved Online Application", "SavedOnlineApplication", 325, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_InstallationAddress_State", "Saved Online Application", "SavedOnlineApplication", 326, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_InstallationAddress_City", "Saved Online Application", "SavedOnlineApplication", 327, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_InstallationAddress_PostalCode", "Saved Online Application", "SavedOnlineApplication", 328, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_Street", "Saved Online Application", "SavedOnlineApplication", 329, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_State", "Saved Online Application", "SavedOnlineApplication", 330, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_City", "Saved Online Application", "SavedOnlineApplication", 331, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_PostalCode", "Saved Online Application", "SavedOnlineApplication", 332, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_Country", "Saved Online Application", "SavedOnlineApplication", 333, 1);
	
}

public static void VerifyPropertyInformation_Step11() {
	//Verify Property Information-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BuildingType", "Saved Online Application", "SavedOnlineApplication", 336, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 337, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AccesstoAllRooms", "Saved Online Application", "SavedOnlineApplication", 338, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AirConditioned", "Saved Online Application", "SavedOnlineApplication", 339, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AirConditionedSquareFootage", "Saved Online Application", "SavedOnlineApplication", 340, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AnticipatedDateforClosing", "Saved Online Application", "SavedOnlineApplication", 341, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AuditPerformed", "Saved Online Application", "SavedOnlineApplication", 342, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AvailableDateforInspection", "Saved Online Application", "SavedOnlineApplication", 343, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BenchmarkCompleted", "Saved Online Application", "SavedOnlineApplication", 344, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BenchmarkExempt", "Saved Online Application", "SavedOnlineApplication", 345, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BenchmarkScore", "Saved Online Application", "SavedOnlineApplication", 346, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BuildingPermitNumber", "Saved Online Application", "SavedOnlineApplication", 347, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_Checkbox", "Saved Online Application", "SavedOnlineApplication", 348, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_ConstructionType", "Saved Online Application", "SavedOnlineApplication", 349, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_Date", "Saved Online Application", "SavedOnlineApplication", 350, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_DropDownList", "Saved Online Application", "SavedOnlineApplication", 351, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_Formula", "Saved Online Application", "SavedOnlineApplication", 352, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_FoundationType", "Saved Online Application", "SavedOnlineApplication", 353, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_HERSCertificationDate", "Saved Online Application", "SavedOnlineApplication", 354, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_HERSIndex", "Saved Online Application", "SavedOnlineApplication", 355, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_IsEnergyStar", "Saved Online Application", "SavedOnlineApplication", 356, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 357, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_NumberofBedrooms", "Saved Online Application", "SavedOnlineApplication", 358, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_NumberofEmployees", "Saved Online Application", "SavedOnlineApplication", 359, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_NumberofOccupants", "Saved Online Application", "SavedOnlineApplication", 360, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_NumericValue", "Saved Online Application", "SavedOnlineApplication", 361, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_ParkName", "Saved Online Application", "SavedOnlineApplication", 362, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_PremiseSquareFootage", "Saved Online Application", "SavedOnlineApplication", 363, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_ServiceDistrict", "Saved Online Application", "SavedOnlineApplication", 364, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SiteBlockNumber", "Saved Online Application", "SavedOnlineApplication", 365, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SiteLotNumber", "Saved Online Application", "SavedOnlineApplication", 366, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SpaceHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 367, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SpaceHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 368, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SubdivisionName", "Saved Online Application", "SavedOnlineApplication", 369, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_TextBox", "Saved Online Application", "SavedOnlineApplication", 370, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_WaterHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 371, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_WaterHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 372, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_WeeklyHoursofOperation", "Saved Online Application", "SavedOnlineApplication", 373, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_YearBuilt", "Saved Online Application", "SavedOnlineApplication", 374, 1);
}

public static void VerifyInstallerInformation_Step11() {
	//Verify Installer Information-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_Regression_Saved_Online_Application_TradeAlly", "Saved Online Application", "SavedOnlineApplication", 377, 1);
	
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_InstallerAddress_Street", "Saved Online Application", "SavedOnlineApplication", 378, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_InstallerAddress_State", "Saved Online Application", "SavedOnlineApplication", 379, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_InstallerAddress_City", "Saved Online Application", "SavedOnlineApplication", 380, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_InstallerAddress_PostalCode", "Saved Online Application", "SavedOnlineApplication", 381, 1);
}
public static void VerifyPayeeInformation_Step11() {
	//Verify Payee Information-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_Payee","Saved Online Application", "SavedOnlineApplication", 384, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_Name","Saved Online Application", "SavedOnlineApplication", 385, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_TaxStatus", "Saved Online Application", "SavedOnlineApplication", 386, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_TaxId", "Saved Online Application", "SavedOnlineApplication", 387, 1);
	
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_MailingAddress_Street", "Saved Online Application", "SavedOnlineApplication", 388, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_MailingAddress_State", "Saved Online Application", "SavedOnlineApplication", 389, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_MailingAddress_City", "Saved Online Application", "SavedOnlineApplication", 390, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_MailingAddress_PostalCode", "Saved Online Application", "SavedOnlineApplication", 391, 1);
}

public static void VerifyGeneralApplicationInformation_Step11() {
	//Verify General Application Information-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_General_Application_Information_Organization", "Saved Online Application", "SavedOnlineApplication", 394, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_General_Application_Information_ProjectType", "Saved Online Application", "SavedOnlineApplication", 395, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_General_Application_Information_TerminationDate", "Saved Online Application", "SavedOnlineApplication", 396, 1);
}

public static void VerifyEquipmentInformation_Step11() {
	//Verify Equipment Information-Complete Review and Submit
	//Verify CPL:Energy Star-Clothes Washer-Residential-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Quantity", "Saved Online Application", "SavedOnlineApplication", 400, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Total", "Saved Online Application", "SavedOnlineApplication", 401, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_BrandName", "Saved Online Application", "SavedOnlineApplication", 402, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_ModelNumber", "Saved Online Application", "SavedOnlineApplication", 403, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_LoadConfiguration", "Saved Online Application", "SavedOnlineApplication", 404, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_AdditionalModelInformation", "Saved Online Application", "SavedOnlineApplication", 405, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_AdditionalWasherFeatures", "Saved Online Application", "SavedOnlineApplication", 406, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_AnnualEnergyUse", "Saved Online Application", "SavedOnlineApplication", 407, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_AnnualWaterUse", "Saved Online Application", "SavedOnlineApplication", 408, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_CommunicationStandardApplicationLayer", "Saved Online Application", "SavedOnlineApplication", 409, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Connected", "Saved Online Application", "SavedOnlineApplication", 410, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_ConnectsUsing", "Saved Online Application", "SavedOnlineApplication", 411, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_DateAvailableonMarket", "Saved Online Application", "SavedOnlineApplication", 412, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_DateCertified", "Saved Online Application", "SavedOnlineApplication", 413, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_DirectOnpremises_Openstandard_BasedInterconnection", "Saved Online Application", "SavedOnlineApplication", 414, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_ENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 415, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_ENERGYSTARUniqueID", "Saved Online Application", "SavedOnlineApplication", 416, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_IntegratedModifiedEnergyFactor", "Saved Online Application", "SavedOnlineApplication", 417, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_IntegratedWaterFactor", "Saved Online Application", "SavedOnlineApplication", 418, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_IntendedMarket", "Saved Online Application", "SavedOnlineApplication", 419, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Markets", "Saved Online Application", "SavedOnlineApplication", 420, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_MeetsENERGYSTARMostEfficient2018Criteria", "Saved Online Application", "SavedOnlineApplication", 421, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_PairedENERGYSTARClothesDryerAvailable", "Saved Online Application", "SavedOnlineApplication", 422, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 423, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_UPC", "Saved Online Application", "SavedOnlineApplication", 424, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_USFederalStandard_IMEF", "Saved Online Application", "SavedOnlineApplication", 425, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_USFederalStandard_IWF", "Saved Online Application", "SavedOnlineApplication", 426, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Volume", "Saved Online Application", "SavedOnlineApplication", 427, 1);
	
	//Verify Regression-Saved Online Application Measure-Complete Review and Submit
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Quantity", "Saved Online Application", "SavedOnlineApplication", 429, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Total", "Saved Online Application", "SavedOnlineApplication", 430, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_CheckBox", "Saved Online Application", "SavedOnlineApplication", 431, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_CheckBoxGroup", "Saved Online Application", "SavedOnlineApplication", 432, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Date", "Saved Online Application", "SavedOnlineApplication", 433, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_DDL", "Saved Online Application", "SavedOnlineApplication", 434, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Formula", "Saved Online Application", "SavedOnlineApplication", 435, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Numeric", "Saved Online Application", "SavedOnlineApplication", 436, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_RadioButtonGroup", "Saved Online Application", "SavedOnlineApplication", 437, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_TextBox", "Saved Online Application", "SavedOnlineApplication", 438, 1);
}

public static void VerifyPaymentInformation_Step11() {
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payment_Information_Method", "Saved Online Application", "SavedOnlineApplication", 441, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payment_Information_Terms", "Saved Online Application", "SavedOnlineApplication", 442, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payment_Information_Total", "Saved Online Application", "SavedOnlineApplication", 443, 1);
}

public static void VerifyDocumentation_Step11() {
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Documentation_DocumentType", "Saved Online Application", "SavedOnlineApplication", 446, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Documentation_Description", "Saved Online Application", "SavedOnlineApplication", 447, 1);
}

public static void Step11_Complete_ReviewandSubmit() {
	clickWebelement("Saved_Online_Application", "ReviewAndSubmit_CustomerSignDate_Image");
	Enter(KeyEvent.VK_ENTER);
	enterTextboxValue("Saved_Online_Application", "ReviewAndSubmit_Email1", "Saved Online Application", "SavedOnlineApplication", 298, 2);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_ContactEmail", "Saved Online Application", "SavedOnlineApplication", 299, 1);
	threadWait(10000);
	
	clickWebelement("Saved_Online_Application", "ReviewAndSubmit_ClickOn_SaveProgress");
	enterTextboxValue("Saved_Online_Application", "ReviewAndSubmit_SaveProgress_EmailAddress", "Saved Online Application", "SavedOnlineApplication", 298, 2);
	clickWebelement("Saved_Online_Application", "ReviewAndSubmit_Click_OK_Button");
	defineLogs("Confirmation", "Confirmation", "Confirmation", "Confirmation Message reflected successfully", "Confirmation Message is not reflected", "Saved_Online_Application", "ReviewAndSubmit_Confirmation_Message");
	clickWebelement("Saved_Online_Application", "ReviewAndSubmit_Confirmation_OkButton");
	
}

public static void LoginEECP() {
	login("Helper","BaseURL", 2, 0, 2, 1);
}

public static void Search_Saved_Online_Applications() {
	linkText("Main Menu").click();
	linkText("Saved Online Applications").click();
	clickWebelement("Saved_Online_Application", "Search_Saved_Online_Applications_SearchWith_SavedDate_From");
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("Saved_Online_Application", "Search_Saved_Online_Applications_Search_Button");
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Search_Saved_Online_Applications_Account", "Saved Online Application", "SavedOnlineApplication", 450, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Search_Saved_Online_Applications_Program", "Saved Online Application", "SavedOnlineApplication", 451, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Search_Saved_Online_Applications_EmailsAddress", "Saved Online Application", "SavedOnlineApplication", 452, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Search_Saved_Online_Applications_SavedDate", "Saved Online Application", "SavedOnlineApplication", 453, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Search_Saved_Online_Applications_ExpirationDate", "Saved Online Application", "SavedOnlineApplication", 454, 1);
	clickWebelement("Saved_Online_Application", "Search_Saved_Online_Applications_ApplicationLink");
	SwitchToChild();
	threadWait(7000);
	defineLogs("Automation - Saved Online Application", "Automation - Saved Online Application", "Automation - Saved Online Application", "User navigate to Online Application Successfully", "User is not able to navigate to Online Application","Saved_Online_Application", "Varify_Online_Application");
}

public static void AccessEmail( int UsernameRow,int UsernameColumn,int PasswordRow,int PasswordColumn) {
	  OpenBrowser("Saved_Online_Application", "AccessEmail_URL");
	  Clear("Saved_Online_Application", "AccessEmail_Username");
	  enterTextboxValue("Saved_Online_Application", "AccessEmail_Username", "LoginData", "Login", UsernameRow, UsernameColumn);
	  enterTextboxValue("Saved_Online_Application", "AccessEmail_Password", "LoginData", "Login", PasswordRow, PasswordColumn);
	  clickWebelement("Saved_Online_Application","AccessEmail_Signin");
	  //clickWebelement("Saved_Online_Application","SearchMail_With_Sender");
	  //enterTextboxValue("Saved_Online_Application", "SearchMail_With_Sender", "Saved Online Application", "SavedOnlineApplication", 457, 1);
	  //Enter(KeyEvent.VK_ENTER);
	  clickWebelement("Saved_Online_Application","Select_Recent_Email");
	  VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Subject", "Saved Online Application", "SavedOnlineApplication", 459, 1);
	  defineLogs("New mail", "New mail", "New mail", "Date and time verified Successfully", "Date and time was not verified","Saved_Online_Application", "Verify_DateandTime");
	  clickWebelement("Saved_Online_Application","Access_Link");
	  SwitchToChild();
	  WaitForElement(120, "Saved_Online_Application", "Varify_Online_Application");
	  defineLogs("Automation - Saved Online Application", "Automation - Saved Online Application", "Automation - Saved Online Application", "User navigate to Online Application Successfully", "User is not able to navigate to Online Application","Saved_Online_Application", "Varify_Online_Application");
}

public static void Verify_GettingStarted_AfterSaveProcess_Step1() {
	//Verify Getting Started-After SaveProcess
    Pass_Message("Verify Installer Information-After SaveProcess");
	
	validationWithelementVisibility("Saved_Online_Application", "AccountHolder", "Account Holder selected checkbox is: Yes", "Account Holder selected checkbox is: No");
	validationWithelementVisibility("Saved_Online_Application", "SelectAnswerFor_TheAnswerisB", "'B'checkbox is selected for 'The answer is B' successfully", "'B'checkbox is not selected for 'The answer is B' successfully");
	validationWithelementVisibility("Saved_Online_Application", "SelectAnswerFor_TheAnswerisC", "'C'checkbox is selected for 'The answer is C' successfully", "'C'checkbox is not selected for 'The answer is C' successfully");
	//Enter Value in Account Information
	enterTextboxValue("Saved_Online_Application", "AccountNumber", "Saved Online Application", "SavedOnlineApplication", 3, 1);
	Enter(KeyEvent.VK_TAB);
	enterTextboxValue("Saved_Online_Application", "NameOnAccount", "Saved Online Application", "SavedOnlineApplication", 4, 1);
	Enter(KeyEvent.VK_TAB);
	enterTextboxValue("Saved_Online_Application", "StreetNumber", "Saved Online Application", "SavedOnlineApplication", 5, 1);
	Enter(KeyEvent.VK_TAB);
	enterTextboxValue("Saved_Online_Application", "Unit", "Saved Online Application", "SavedOnlineApplication", 6, 1);
	Enter(KeyEvent.VK_TAB);
	enterTextboxValue("Saved_Online_Application", "ZIP_or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 7, 1);
	Enter(KeyEvent.VK_TAB);
	enterTextboxValue("Saved_Online_Application", "City", "Saved Online Application", "SavedOnlineApplication", 8, 1);
	Enter(KeyEvent.VK_TAB);
	enterTextboxValue("Saved_Online_Application", "State", "Saved Online Application", "SavedOnlineApplication", 9, 1);
	
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("Customer Information", "Customer Information", "Customer Information", "Navigate to Customer Information Successfully", "Unable to Navigate to Customer Information", "Saved_Online_Application", "VerifyCustomerInformation");	
	clickWebelement("Saved_Online_Application", "Getting_Started_SavedApplication_OkButton");
}

public static void Verify_CustomerInformation_AfterSaveProcess_Step2() {

		//Verify Customer Information-After SaveProcess
	    Pass_Message("Verify Customer Information-After SaveProcess");
	    
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_AccountNumber", "Saved Online Application", "SavedOnlineApplication", 462, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_NameOnAccount", "Saved Online Application", "SavedOnlineApplication", 463, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 464, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 465, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 466, 1);
		//VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_Email", "Saved Online Application", "SavedOnlineApplication", 467, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_AlternateServiceProvider", "Saved Online Application", "SavedOnlineApplication", 468, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_AlternateAccountNumber", "Saved Online Application", "SavedOnlineApplication", 469, 1);		

		//Verify Account Holder Tax Information-After SaveProcess
		Pass_Message("Verify Account Holder Tax Information-Complete Customer Information After SaveProcess");
		
	    VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_AccountHolderTaxStatus", "Saved Online Application", "SavedOnlineApplication", 471, 1);
	    VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_AccountHolderTaxIDType", "Saved Online Application", "SavedOnlineApplication", 472, 1);
	    VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Tax_Information_AccountHolderTaxID_SSN", "Saved Online Application", "SavedOnlineApplication", 473, 1);
	    VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_62yearsOrGreater", "Saved Online Application", "SavedOnlineApplication", 474, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_Disabled", "Saved Online Application", "SavedOnlineApplication", 475, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_DisabilityIdentification", "Saved Online Application", "SavedOnlineApplication", 476, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_Ethnicity", "Saved Online Application", "SavedOnlineApplication", 477, 1);

		//Verify Applicant Information-After SaveProcess
		Pass_Message("Verify Applicant Information-After SaveProcess");
		
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_FirstName", "Saved Online Application", "SavedOnlineApplication", 479, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_LastName", "Saved Online Application", "SavedOnlineApplication", 480, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 481, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 482, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 483, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_Email", "Saved Online Application", "SavedOnlineApplication", 484, 1);
		
		//Verify Installation Address-After SaveProcess
		Pass_Message("Verify Installation Address-After SaveProcess ");
		
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_Street", "Saved Online Application", "SavedOnlineApplication", 486, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Installation_Address_Unit", "Saved Online Application", "SavedOnlineApplication", 487, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_ZIP_Or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 488, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_City", "Saved Online Application", "SavedOnlineApplication", 489, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_State", "Saved Online Application", "SavedOnlineApplication", 490, 1);

		//Verify Mailing Address-After SaveProcess
		Pass_Message("Verify Mailing Address-After SaveProcess");
		
		if (Xpath("Saved_Online_Application", "Mailing_Address_Is_mailing_address_same_as_Installation_Address_No").isSelected()==false) {
			test.log(LogStatus.WARNING, "Redio button 'No' checked Successfully");
			clickWebelement("Saved_Online_Application", "Mailing_Address_Is_mailing_address_same_as_Installation_Address_No");
		} else {
			validationWithelementVisibility("Saved_Online_Application", "Mailing_Address_Is_mailing_address_same_as_Installation_Address_No", "Redio button 'No' is in checked state", "Redio button 'Yes' is in checked state");
		}
		validationWithelementVisibility("Saved_Online_Application", "Mailing_Address_Is_this_a_PO_Box", "Redio button is in unchecked state", "Redio button is in checked state");
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Mailing_Address_Country", "Saved Online Application", "SavedOnlineApplication", 492, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_Street", "Saved Online Application", "SavedOnlineApplication", 493, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Mailing_Address_Unit", "Saved Online Application", "SavedOnlineApplication", 494, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_ZIP_Or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 495, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_City", "Saved Online Application", "SavedOnlineApplication", 496, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_State", "Saved Online Application", "SavedOnlineApplication", 497, 1);
	
		//Verify Property Information-After SaveProcess
		Pass_Message("Verify Property Information-After SaveProcess");
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_BuildingType", "Saved Online Application", "SavedOnlineApplication", 499, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 500, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AccesstoAllRooms", "Saved Online Application", "SavedOnlineApplication", 501, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AirConditioned", "Saved Online Application", "SavedOnlineApplication", 502, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_AirConditionedSquareFootage", "Saved Online Application", "SavedOnlineApplication", 503, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_AnticipatedDateforClosing", "Saved Online Application", "SavedOnlineApplication", 504, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AuditPerformed", "Saved Online Application", "SavedOnlineApplication", 505, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_AvailableDateforInspection", "Saved Online Application", "SavedOnlineApplication", 506, 1);
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_BenchmarkCompleted", "Saved Online Application", "SavedOnlineApplication", 507, 1);
		
		validationWithelementVisibility("Saved_Online_Application", "Property_Information_BenchmarkExempt", "Check box is in unchecked state", "Check box is in checked state");
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_BenchmarkScore", "Saved Online Application", "SavedOnlineApplication", 508, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_BuildingPermitNumber", "Saved Online Application", "SavedOnlineApplication", 509, 1);
		
		validationWithelementVisibility("Saved_Online_Application", "Property_Information_Checkbox", "Check box is in unchecked state", "Check box is in checked state");
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_ConstructionType", "Saved Online Application", "SavedOnlineApplication", 510, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_Date", "Saved Online Application", "SavedOnlineApplication", 511, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_DropDownList", "Saved Online Application", "SavedOnlineApplication", 512, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Formula", "Saved Online Application", "SavedOnlineApplication", 513, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_FoundationType", "Saved Online Application", "SavedOnlineApplication", 514, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_HERSCertificationDate", "Saved Online Application", "SavedOnlineApplication", 515, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_HERSIndex", "Saved Online Application", "SavedOnlineApplication", 516, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_IsEnergyStar", "Saved Online Application", "SavedOnlineApplication", 517, 1);
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Verify1st_Element", "Saved Online Application", "SavedOnlineApplication", 518, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Verify2nd_Element", "Saved Online Application", "SavedOnlineApplication", 518, 2);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Verify3rd_Element", "Saved Online Application", "SavedOnlineApplication", 518, 3);
		
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_NumberofBedrooms", "Saved Online Application", "SavedOnlineApplication", 519, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_NumberofEmployees", "Saved Online Application", "SavedOnlineApplication", 520, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_NumberofOccupants", "Saved Online Application", "SavedOnlineApplication", 521, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_NumericValue", "Saved Online Application", "SavedOnlineApplication", 522, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_ParkName", "Saved Online Application", "SavedOnlineApplication", 523, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_PremiseSquareFootage", "Saved Online Application", "SavedOnlineApplication", 524, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_ServiceDistrict", "Saved Online Application", "SavedOnlineApplication", 525, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_SiteBlockNumber", "Saved Online Application", "SavedOnlineApplication", 526, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_SiteLotNumber", "Saved Online Application", "SavedOnlineApplication", 527, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SpaceHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 528, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SpaceHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 529, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_SubdivisionName", "Saved Online Application", "SavedOnlineApplication", 530, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_TextBox", "Saved Online Application", "SavedOnlineApplication", 531, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_WaterHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 532, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_WaterHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 533, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_WeeklyHoursofOperation", "Saved Online Application", "SavedOnlineApplication", 534, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Property_Information_YearBuilt", "Saved Online Application", "SavedOnlineApplication", 535, 1);

		//Verify General Application Information-After SaveProcess
		Pass_Message("Verify General Application Information-After SaveProcess");
		
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "General_Application_Information_Organization", "Saved Online Application", "SavedOnlineApplication", 537, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "General_Application_Information_ProjectType", "Saved Online Application", "SavedOnlineApplication", 538, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "General_Application_Information_TerminationDate", "Saved Online Application", "SavedOnlineApplication", 539, 1);
		
		clickWebelement("Saved_Online_Application", "NEXT_Button");
		defineLogs("Installer Information", "Installer Information", "Installer Information", "Navigate to Installer Information Successfully", "Unable to Navigate to Installer Information", "Saved_Online_Application", "VerifyInstallerInformation");
	
}

public static void Verify_InstallerInformation_AfterSaveProcess_Step3() {
	        //Verify Installer Information-After SaveProcess
	        Pass_Message("Verify Installer Information-After SaveProcess");
	        
	        validationWithelementVisibility("Saved_Online_Application", "Installer_Information_WorkPerformedBy_Installer", "Installer checkbox selected successfully", "Installer checkbox is not selected");
	        VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Company", "Saved Online Application", "SavedOnlineApplication", 542, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactName", "Saved Online Application", "SavedOnlineApplication", 543, 1);
	        
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactPhone", "Saved Online Application", "SavedOnlineApplication", 544, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactEmail", "Saved Online Application", "SavedOnlineApplication", 545, 2);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactFax", "Saved Online Application", "SavedOnlineApplication", 546, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Website", "Saved Online Application", "SavedOnlineApplication", 547, 1);
			
			validationWithelementVisibility("Saved_Online_Application", "Installer_Information_Isthis_A_POBox", "PO box selected checkbox is: Yes", "PO box selected checkbox is: No");
			
			//VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_InCareof_or_Recipient", "Saved Online Application", "SavedOnlineApplication", 548, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Street", "Saved Online Application", "SavedOnlineApplication", 549, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Unit", "Saved Online Application", "SavedOnlineApplication", 550, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ZIP_or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 551, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_City", "Saved Online Application", "SavedOnlineApplication", 552, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_State", "Saved Online Application", "SavedOnlineApplication", 553, 1);
			
			clickWebelement("Saved_Online_Application", "NEXT_Button");
			defineLogs("Payee Information", "Payee Information", "Payee Information", "Navigate to Payee Information Successfully", "Unable to Navigate to Payee Information", "Saved_Online_Application", "VerifyPayeeInformation");	
	
}

public static void Verify_PayeeInformation_AfterSaveProcess_Step4() {
	//Verify Payee Information-After SaveProcess
    Pass_Message("Verify Payee Information-After SaveProcess");
    
	validationWithelementVisibility("Saved_Online_Application", "Applicant", "Applicant checkbox selected successfully", "Applicant checkbox is not selected");
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payee_Information_Name", "Saved Online Application", "SavedOnlineApplication", 556, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payee_Information_Phone", "Saved Online Application", "SavedOnlineApplication", 557, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payee_Information_TaxStatus", "Saved Online Application", "SavedOnlineApplication", 558, 1);
	
	validationWithelementVisibility("Saved_Online_Application", "Payee_Information_TaxIDType_SSN", "SSN checkbox selected successfully", "SSN checkbox is not selected");
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_TaxIDNumber", "Saved Online Application", "SavedOnlineApplication", 559, 1);
	
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_InCareof_or_Recipient", "Saved Online Application", "SavedOnlineApplication", 560, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_Street", "Saved Online Application", "SavedOnlineApplication", 561, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_Unit", "Saved Online Application", "SavedOnlineApplication", 562, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_ZIP_or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 563, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_City", "Saved Online Application", "SavedOnlineApplication", 564, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Payee_Information_State", "Saved Online Application", "SavedOnlineApplication", 565, 1);
	
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information", "Saved_Online_Application", "VerifyEquipmentInformation");	
}

public static void Verify_EquipmentInformation_AfterSaveProcess_Step5() {
	//Verify CPL: Energy Star - Clothes Washer - Residential-After SaveProcess
    Pass_Message("Verify CPL: Energy Star - Clothes Washer - Residential-After SaveProcess");
    
	//scrollToElement("Saved_Online_Application", "CPL_EnergyStar_BrandName");
    VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "CPL_EnergyStar_Quantity", "Saved Online Application", "SavedOnlineApplication", 572, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_BrandName", "Saved Online Application", "SavedOnlineApplication", 573, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_ModelNumber", "Saved Online Application", "SavedOnlineApplication", 574, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_LoadConfiguration", "Saved Online Application", "SavedOnlineApplication", 575, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_AdditionalModelInformation", "Saved Online Application", "SavedOnlineApplication", 576, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_AdditionalWasherFeatures", "Saved Online Application", "SavedOnlineApplication", 577, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_AnnualEnergyUse", "Saved Online Application", "SavedOnlineApplication", 578, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_AnnualWaterUse", "Saved Online Application", "SavedOnlineApplication", 579, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_CommunicationStandardApplicationLayer", "Saved Online Application", "SavedOnlineApplication", 580, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_Connected", "Saved Online Application", "SavedOnlineApplication", 581, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_ConnectsUsing", "Saved Online Application", "SavedOnlineApplication", 582, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_DateAvailableOnMarket", "Saved Online Application", "SavedOnlineApplication", 583, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_DateCertified", "Saved Online Application", "SavedOnlineApplication", 584, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_DirectOn_premisesOpen_StandardBasedInterConnection", "Saved Online Application", "SavedOnlineApplication", 585, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_ENERGYSTARModel_Identifier", "Saved Online Application", "SavedOnlineApplication", 586, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_ENERGYSTARUniqueID", "Saved Online Application", "SavedOnlineApplication", 587, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_IntegratedModifiedEnergyFactor", "Saved Online Application", "SavedOnlineApplication", 588, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_IntegratedWaterFactor", "Saved Online Application", "SavedOnlineApplication", 589, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_IntendedMarket", "Saved Online Application", "SavedOnlineApplication", 590, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_Markets", "Saved Online Application", "SavedOnlineApplication", 591, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_MeetsENERGYSTARMostEfficient_2018Criteria", "Saved Online Application", "SavedOnlineApplication", 592, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_PairedENERGYSTARClothesDryerAvailable", "Saved Online Application", "SavedOnlineApplication", 593, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_PairedENERGYSTARClothesDryer_ENERGYSTARModel_Identifier", "Saved Online Application", "SavedOnlineApplication", 594, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_UPC", "Saved Online Application", "SavedOnlineApplication", 595, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_USFederalStandard_IMEF", "Saved Online Application", "SavedOnlineApplication", 596, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_USFederalStandard_IWF", "Saved Online Application", "SavedOnlineApplication", 597, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_Volume", "Saved Online Application", "SavedOnlineApplication", 598, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_EnergyStar_Incentive", "Saved Online Application", "SavedOnlineApplication", 599, 1);
	
	//Verify Regression - Saved Online Application Measure-After SaveProcess
    Pass_Message("Verify Regression - Saved Online Application Measure-After SaveProcess");
    
    VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Saved_Online_Application_Measure_Quantity", "Saved Online Application", "SavedOnlineApplication", 601, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Saved_Online_Application_Measure_Cost", "Saved Online Application", "SavedOnlineApplication", 602, 1);
	
	validationWithelementVisibility("Saved_Online_Application", "Saved_Online_Application_Measure_CheckBox", "Checkbox selected successfully", "Checkbox is not selected");
	validationWithelementVisibility("Saved_Online_Application", "Saved_Online_Application_Measure_CheckBoxGroup_One", "Checkbox Group One selected successfully", "Checkbox Group One is not selected");
	
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Saved_Online_Application_Measure_Date", "Saved Online Application", "SavedOnlineApplication", 603, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Saved_Online_Application_Measure_DDL", "Saved Online Application", "SavedOnlineApplication", 604, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Saved_Online_Application_Measure_Formula", "Saved Online Application", "SavedOnlineApplication", 605, 1);
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Saved_Online_Application_Measure_Numeric", "Saved Online Application", "SavedOnlineApplication", 606, 1);
	
	validationWithelementVisibility("Saved_Online_Application", "Saved_Online_Application_Measure_RadioButtonGroup_Three", "Radio Button Group-Three selected successfully", "Radio Button Group-Three is not selected");
	
	VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Saved_Online_Application_Measure_TextBox", "Saved Online Application", "SavedOnlineApplication", 607, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Saved_Online_Application_Measure_Incentive", "Saved Online Application", "SavedOnlineApplication", 608, 1);
		
	//Verify Equipment Information-After SaveProcess
    Pass_Message("Verify Equipment Information-After SaveProcess");
    
    VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Equipment_Information_Select_DateInput", "Saved Online Application", "SavedOnlineApplication", 568, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Equipment_Information_TotalProjectCost", "Saved Online Application", "SavedOnlineApplication", 569, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Equipment_Information_IncentiveSummary", "Saved Online Application", "SavedOnlineApplication", 570, 1);
	
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "Navigate to Incentive Summary Successfully", "Unable to Navigate to Incentive Summary", "Saved_Online_Application", "VerifyIncentiveSummary");
}
  
public static void Verify_IncentiveSummary_AfterSaveProcess_Step6() {
	defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "The Element varified successfully", "Unable to Verify the element", "Saved_Online_Application", "Applied_for");
	
	//Verify CPL: Energy Star - Clothes Washer - Residential-After SaveProcess
    Pass_Message("Verify CPL: Energy Star - Clothes Washer - Residential-After SaveProcess");
    
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Quantity", "Saved Online Application", "SavedOnlineApplication", 612, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Total", "Saved Online Application", "SavedOnlineApplication", 613, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_BrandName", "Saved Online Application", "SavedOnlineApplication", 614, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_ModelNumber", "Saved Online Application", "SavedOnlineApplication", 615, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_LoadConfiguration", "Saved Online Application", "SavedOnlineApplication", 616, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_AdditionalModelInformation", "Saved Online Application", "SavedOnlineApplication", 617, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_AdditionalWasherFeatures", "Saved Online Application", "SavedOnlineApplication", 618, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_AnnualEnergyUse", "Saved Online Application", "SavedOnlineApplication", 619, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_AnnualWaterUse", "Saved Online Application", "SavedOnlineApplication", 620, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_CommunicationStandardApplicationLayer", "Saved Online Application", "SavedOnlineApplication", 621, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Connected", "Saved Online Application", "SavedOnlineApplication", 622, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_ConnectsUsing", "Saved Online Application", "SavedOnlineApplication", 623, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_DateAvailableonMarket", "Saved Online Application", "SavedOnlineApplication", 624, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_DateCertified", "Saved Online Application", "SavedOnlineApplication", 625, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_DirectOnpremises_Openstandard_BasedInterconnection", "Saved Online Application", "SavedOnlineApplication", 626, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_ENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 627, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_ENERGYSTARUniqueID", "Saved Online Application", "SavedOnlineApplication", 628, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_IntegratedModifiedEnergyFactor", "Saved Online Application", "SavedOnlineApplication", 629, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_IntegratedWaterFactor", "Saved Online Application", "SavedOnlineApplication", 630, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_IntendedMarket", "Saved Online Application", "SavedOnlineApplication", 631, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Markets", "Saved Online Application", "SavedOnlineApplication", 632, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_MeetsENERGYSTARMostEfficient2018Criteria", "Saved Online Application", "SavedOnlineApplication", 633, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_PairedENERGYSTARClothesDryerAvailable", "Saved Online Application", "SavedOnlineApplication", 634, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 635, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_UPC", "Saved Online Application", "SavedOnlineApplication", 636, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_USFederalStandard_IMEF", "Saved Online Application", "SavedOnlineApplication", 637, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_USFederalStandard_IWF", "Saved Online Application", "SavedOnlineApplication", 638, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "CPL_Volume", "Saved Online Application", "SavedOnlineApplication", 639, 1);
	
	//Verify Regression - Saved Online Application Measure-After SaveProcess
    Pass_Message("Verify Regression - Saved Online Application Measure-After SaveProcess");
    
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Quantity", "Saved Online Application", "SavedOnlineApplication", 641, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Total", "Saved Online Application", "SavedOnlineApplication", 642, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_CheckBox", "Saved Online Application", "SavedOnlineApplication", 643, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_CheckBoxGroup", "Saved Online Application", "SavedOnlineApplication", 644, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Date", "Saved Online Application", "SavedOnlineApplication", 645, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_DDL", "Saved Online Application", "SavedOnlineApplication", 646, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Formula", "Saved Online Application", "SavedOnlineApplication", 647, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_Numeric", "Saved Online Application", "SavedOnlineApplication", 648, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_RadioButtonGroup", "Saved Online Application", "SavedOnlineApplication", 649, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Regression_Saved_Online_Application_Measure_TextBox", "Saved Online Application", "SavedOnlineApplication", 650, 1);
	
	defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "The Element varified successfully", "Unable to Verify the element", "Saved_Online_Application", "Total");
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("Payment Information", "Payment Information", "Payment Information", "Navigate to Payment Information Successfully", "Unable to Navigate to Payment Information", "Saved_Online_Application", "VerifyPaymentInformation");	
}

public static void Verify_PaymentInformation_AfterSaveProcess_Step7() {
	//Verify Payment Information-After SaveProcess
    Pass_Message("Verify Payment Information-After SaveProcess");
    
    VerifyElementForExistingValueWithText("Saved_Online_Application", "Payment_Information_Select_Payment_Method", "Saved Online Application", "SavedOnlineApplication", 652, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payment_Information_Choose_Payment_Terms", "Saved Online Application", "SavedOnlineApplication", 653, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "Payment_Information_Verify_Total", "Saved Online Application", "SavedOnlineApplication", 654, 1);
	
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("How did you hear about us?", "How did you hear about us?", "How did you hear about us?", "Navigate to How did you hear about us? Successfully", "Unable to Navigate to How did you hear about us?", "Saved_Online_Application", "Verify_Howdidyouhearaboutus");	
}

public static void Verify_How_did_you_hear_about_us_AfterSaveProcess_Step8() {
	//Verify How did you hear about us-After SaveProcess
    Pass_Message("Verify Installer Information-After SaveProcess");
	
    VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_LeadSourceCategory", "Saved Online Application", "SavedOnlineApplication", 656, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_LeadSource", "Saved Online Application", "SavedOnlineApplication", 657, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_OutreachSource_TradeAlly", "Saved Online Application", "SavedOnlineApplication", 658, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_OutreachSource_Employee", "Saved Online Application", "SavedOnlineApplication", 659, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_AccountExecutive", "Saved Online Application", "SavedOnlineApplication", 660, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_Campaign", "Saved Online Application", "SavedOnlineApplication", 661, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_MarketingRep", "Saved Online Application", "SavedOnlineApplication", 662, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_Segment", "Saved Online Application", "SavedOnlineApplication", 663, 1);
	VerifyElementForExistingValueWithText("Saved_Online_Application", "How_Did_You_Hear_About_Us_TargetMarket", "Saved Online Application", "SavedOnlineApplication", 664, 1);
	    
    validationWithelementVisibility("Saved_Online_Application", "How_Did_You_Hear_About_Us_Was_your_house_built_before1993_Yes", "Was your house built before 1993?-Yes selected successfully", "Was your house built before 1993?-Yes is not selected");
    validationWithelementVisibility("Saved_Online_Application", "How_Did_You_Hear_About_Us_Have_you_replaced_your_water_heater_in_the_last5years", "Have you replaced your water heater in the last 5 years?-Yes selected successfully", "Have you replaced your water heater in the last 5 years?-Yes is not selected");
    
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("Documentation", "Documentation", "Documentation", "Navigate to Documentation Successfully", "Unable to Navigate to Documentation", "Saved_Online_Application", "VerifyDocumentation");	
}

public static void Verify_Documentation_AfterSaveProcess_Step9() {
	//Verify Documentation-After SaveProcess
    Pass_Message("Verify Documentation-After SaveProcess");
	
    VerifyElementForExistingValueWithText("Saved_Online_Application", "Documentation_Verify_DocumentType", "Saved Online Application", "SavedOnlineApplication", 666, 1);
   	VerifyElementForExistingValueWithText("Saved_Online_Application", "Documentation_Verify_DocumentName", "Saved Online Application", "SavedOnlineApplication", 667, 1);
   	//VerifyElementForExistingValueWithText("Saved_Online_Application", "Documentation_Verify_Comments", "Saved Online Application", "SavedOnlineApplication", 668, 1);
   	
	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions", "Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions", "Saved_Online_Application", "VerifyTermsandCondition");	
}

public static void Verify_Terms_and_Conditions_AfterSaveProcess_Step10() {
	//Verify Terms and Conditions-After SaveProcess
    Pass_Message("Verify Terms and Conditions-After SaveProcess");
    
    validationWithelementVisibility("Saved_Online_Application", "Accept_Agreement", "'I agree to the terms and conditions of this program' checkbox selected successfully", "'I agree to the terms and conditions of this program' checkbox is not selected");

	clickWebelement("Saved_Online_Application", "NEXT_Button");
	defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "Saved_Online_Application", "VerifyReviewAndSubmit");	
	
}



public static void Verify_ReviewandSubmit_AfterSaveProcess_Step11() {
	
	    //Verify Review and Submit-After SaveProcess
		Pass_Message("Verify Review and Submit-After SaveProcess");
			
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "ReviewAndSubmit_CustomerSignDate", "Saved Online Application", "SavedOnlineApplication", 672, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_ContactEmail", "Saved Online Application", "SavedOnlineApplication", 671, 1);
		VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "ReviewAndSubmit_Email1", "Saved Online Application", "SavedOnlineApplication", 670, 2);
				
		//Verify Customer Information- Review and Submit-After SaveProcess
        Pass_Message("Verify Customer Information- Review and Submit-After SaveProcess");
    
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_NameOnAccount", "Saved Online Application", "SavedOnlineApplication", 674, 1 );
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 675, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 676, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 677, 1);
		//VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_Email", "Saved Online Application", "SavedOnlineApplication", 678, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_AlternateServiceProvider", "Saved Online Application", "SavedOnlineApplication", 679, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_AlternateAccountNumber", "Saved Online Application", "SavedOnlineApplication", 680, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_62years_or_greater", "Saved Online Application", "SavedOnlineApplication", 681, 1);		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_Disabled", "Saved Online Application", "SavedOnlineApplication", 682, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_DisabilityIdentification", "Saved Online Application", "SavedOnlineApplication", 683, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Customer_Information_Ethnicity", "Saved Online Application", "SavedOnlineApplication", 684, 1);
	
		//Verify Account Holder Tax Information- Review and Submit-After SaveProcess
        Pass_Message("Verify Account Holder Tax Information- Review and Submit-After SaveProcess");
        
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_AccountHolder_TaxInformation_AccountHolderTaxStatus", "Saved Online Application", "SavedOnlineApplication", 686, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_AccountHolder_TaxInformation_AccountHolderTaxIDType", "Saved Online Application", "SavedOnlineApplication", 687, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_AccountHolder_TaxInformation_Account_Holder_Tax_ID_or_SSN", "Saved Online Application", "SavedOnlineApplication", 688, 1);

		//Verify Applicant Information- Review and Submit-After SaveProcess
        Pass_Message("Verify Applicant Information- Review and Submit-After SaveProcess");
        
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_ApplicantName", "Saved Online Application", "SavedOnlineApplication", 690, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_Phone", "Saved Online Application", "SavedOnlineApplication", 691, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 692, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 693, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_Email", "Saved Online Application", "SavedOnlineApplication", 694, 1);
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_InstallationAddress_Street", "Saved Online Application", "SavedOnlineApplication", 695, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_InstallationAddress_State", "Saved Online Application", "SavedOnlineApplication", 696, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_InstallationAddress_City", "Saved Online Application", "SavedOnlineApplication", 697, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_InstallationAddress_PostalCode", "Saved Online Application", "SavedOnlineApplication", 698, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_Street", "Saved Online Application", "SavedOnlineApplication", 699, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_State", "Saved Online Application", "SavedOnlineApplication", 700, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_City", "Saved Online Application", "SavedOnlineApplication", 701, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_PostalCode", "Saved Online Application", "SavedOnlineApplication", 702, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Applicant_Information_MailingAddress_Country", "Saved Online Application", "SavedOnlineApplication", 703, 1);

		//Verify Property Information- Review and Submit-After SaveProcess
        Pass_Message("Verify Property Information- Review and Submit-After SaveProcess");
        
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BuildingType", "Saved Online Application", "SavedOnlineApplication", 705, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 706, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AccesstoAllRooms", "Saved Online Application", "SavedOnlineApplication", 707, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AirConditioned", "Saved Online Application", "SavedOnlineApplication", 708, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AirConditionedSquareFootage", "Saved Online Application", "SavedOnlineApplication", 709, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AnticipatedDateforClosing", "Saved Online Application", "SavedOnlineApplication", 710, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AuditPerformed", "Saved Online Application", "SavedOnlineApplication", 711, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_AvailableDateforInspection", "Saved Online Application", "SavedOnlineApplication", 712, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BenchmarkCompleted", "Saved Online Application", "SavedOnlineApplication", 713, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BenchmarkExempt", "Saved Online Application", "SavedOnlineApplication", 714, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BenchmarkScore", "Saved Online Application", "SavedOnlineApplication", 715, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_BuildingPermitNumber", "Saved Online Application", "SavedOnlineApplication", 716, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_Checkbox", "Saved Online Application", "SavedOnlineApplication", 717, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_ConstructionType", "Saved Online Application", "SavedOnlineApplication", 718, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_Date", "Saved Online Application", "SavedOnlineApplication", 719, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_DropDownList", "Saved Online Application", "SavedOnlineApplication", 720, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_Formula", "Saved Online Application", "SavedOnlineApplication", 721, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_FoundationType", "Saved Online Application", "SavedOnlineApplication", 722, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_HERSCertificationDate", "Saved Online Application", "SavedOnlineApplication", 723, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_HERSIndex", "Saved Online Application", "SavedOnlineApplication", 724, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_IsEnergyStar", "Saved Online Application", "SavedOnlineApplication", 725, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 726, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_NumberofBedrooms", "Saved Online Application", "SavedOnlineApplication", 727, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_NumberofEmployees", "Saved Online Application", "SavedOnlineApplication", 728, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_NumberofOccupants", "Saved Online Application", "SavedOnlineApplication", 729, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_NumericValue", "Saved Online Application", "SavedOnlineApplication", 730, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_ParkName", "Saved Online Application", "SavedOnlineApplication", 731, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_PremiseSquareFootage", "Saved Online Application", "SavedOnlineApplication", 732, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_ServiceDistrict", "Saved Online Application", "SavedOnlineApplication", 733, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SiteBlockNumber", "Saved Online Application", "SavedOnlineApplication", 734, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SiteLotNumber", "Saved Online Application", "SavedOnlineApplication", 735, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SpaceHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 736, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SpaceHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 737, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_SubdivisionName", "Saved Online Application", "SavedOnlineApplication", 738, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_TextBox", "Saved Online Application", "SavedOnlineApplication", 739, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_WaterHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 740, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_WaterHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 741, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_WeeklyHoursofOperation", "Saved Online Application", "SavedOnlineApplication", 742, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Property_Information_YearBuilt", "Saved Online Application", "SavedOnlineApplication", 743, 1);

		//Verify Installer Information- Review and Submit-After SaveProcess
        Pass_Message("Verify Installer Information- Review and Submit-After SaveProcess");
        
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_Regression_Saved_Online_Application_TradeAlly", "Saved Online Application", "SavedOnlineApplication", 745, 1);
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_InstallerAddress_Street", "Saved Online Application", "SavedOnlineApplication", 746, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_InstallerAddress_State", "Saved Online Application", "SavedOnlineApplication", 747, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_InstallerAddress_City", "Saved Online Application", "SavedOnlineApplication", 748, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Installer_Information_InstallerAddress_PostalCode", "Saved Online Application", "SavedOnlineApplication", 749, 1);

		//Verify Payee Information- Review and Submit-After SaveProcess
		Pass_Message("Verify Payee Information- Review and Submit-After SaveProcess");
        
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_Payee","Saved Online Application", "SavedOnlineApplication", 751, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_Name","Saved Online Application", "SavedOnlineApplication", 752, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_TaxStatus", "Saved Online Application", "SavedOnlineApplication", 753, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_TaxId", "Saved Online Application", "SavedOnlineApplication", 754, 1);
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_MailingAddress_Street", "Saved Online Application", "SavedOnlineApplication", 755, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_MailingAddress_State", "Saved Online Application", "SavedOnlineApplication", 756, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_MailingAddress_City", "Saved Online Application", "SavedOnlineApplication", 757, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payee_Information_MailingAddress_PostalCode", "Saved Online Application", "SavedOnlineApplication", 758, 1);

		//Verify General Application Information- Review and Submit-After SaveProcess
        Pass_Message("Verify General Application Information- Review and Submit-After SaveProcess");
        
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_General_Application_Information_Organization", "Saved Online Application", "SavedOnlineApplication", 760, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_General_Application_Information_ProjectType", "Saved Online Application", "SavedOnlineApplication", 761, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_General_Application_Information_TerminationDate", "Saved Online Application", "SavedOnlineApplication", 762, 1);
	
		//Verify Equipment Information- Review and Submit-After SaveProcess
        Pass_Message("Verify Equipment Information- Review and Submit-After SaveProcess");
        
		//Verify CPL:Energy Star-Clothes Washer-Residential- Review and Submit-After SaveProcess
        Pass_Message("Verify CPL:Energy Star-Clothes Washer-Residential- Review and Submit-After SaveProcess");
        
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Quantity", "Saved Online Application", "SavedOnlineApplication", 765, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Total", "Saved Online Application", "SavedOnlineApplication", 766, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_BrandName", "Saved Online Application", "SavedOnlineApplication", 767, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_ModelNumber", "Saved Online Application", "SavedOnlineApplication", 768, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_LoadConfiguration", "Saved Online Application", "SavedOnlineApplication", 769, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_AdditionalModelInformation", "Saved Online Application", "SavedOnlineApplication", 770, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_AdditionalWasherFeatures", "Saved Online Application", "SavedOnlineApplication", 771, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_AnnualEnergyUse", "Saved Online Application", "SavedOnlineApplication", 772, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_AnnualWaterUse", "Saved Online Application", "SavedOnlineApplication", 773, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_CommunicationStandardApplicationLayer", "Saved Online Application", "SavedOnlineApplication", 774, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Connected", "Saved Online Application", "SavedOnlineApplication", 775, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_ConnectsUsing", "Saved Online Application", "SavedOnlineApplication", 776, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_DateAvailableonMarket", "Saved Online Application", "SavedOnlineApplication", 777, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_DateCertified", "Saved Online Application", "SavedOnlineApplication", 778, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_DirectOnpremises_Openstandard_BasedInterconnection", "Saved Online Application", "SavedOnlineApplication", 779, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_ENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 780, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_ENERGYSTARUniqueID", "Saved Online Application", "SavedOnlineApplication", 781, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_IntegratedModifiedEnergyFactor", "Saved Online Application", "SavedOnlineApplication", 782, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_IntegratedWaterFactor", "Saved Online Application", "SavedOnlineApplication", 783, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_IntendedMarket", "Saved Online Application", "SavedOnlineApplication", 784, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Markets", "Saved Online Application", "SavedOnlineApplication", 785, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_MeetsENERGYSTARMostEfficient2018Criteria", "Saved Online Application", "SavedOnlineApplication", 786, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_PairedENERGYSTARClothesDryerAvailable", "Saved Online Application", "SavedOnlineApplication", 787, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 788, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_UPC", "Saved Online Application", "SavedOnlineApplication", 789, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_USFederalStandard_IMEF", "Saved Online Application", "SavedOnlineApplication", 790, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_USFederalStandard_IWF", "Saved Online Application", "SavedOnlineApplication", 791, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_CPL_Volume", "Saved Online Application", "SavedOnlineApplication", 792, 1);
		
		//Verify Regression-Saved Online Application Measure- Review and Submit-After SaveProcess
        Pass_Message("Verify Regression-Saved Online Application Measure- Review and Submit-After SaveProcess");
        
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Quantity", "Saved Online Application", "SavedOnlineApplication", 794, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Total", "Saved Online Application", "SavedOnlineApplication", 795, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_CheckBox", "Saved Online Application", "SavedOnlineApplication", 796, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_CheckBoxGroup", "Saved Online Application", "SavedOnlineApplication", 797, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Date", "Saved Online Application", "SavedOnlineApplication", 798, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_DDL", "Saved Online Application", "SavedOnlineApplication", 799, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Formula", "Saved Online Application", "SavedOnlineApplication", 800, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_Numeric", "Saved Online Application", "SavedOnlineApplication", 801, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_RadioButtonGroup", "Saved Online Application", "SavedOnlineApplication", 802, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Saved_Online_Application_Measure_TextBox", "Saved Online Application", "SavedOnlineApplication", 803, 1);
       
		//Verify Payment Information Review and Submit-After SaveProcess
		Pass_Message("Verify Payment Information Review and Submit-After SaveProcess");
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payment_Information_Method", "Saved Online Application", "SavedOnlineApplication", 805, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payment_Information_Terms", "Saved Online Application", "SavedOnlineApplication", 806, 1);
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Payment_Information_Total", "Saved Online Application", "SavedOnlineApplication", 807, 1);
       
		//Verify Documentation Review and Submit-After SaveProcess
		Pass_Message("Verify Documentation Review and Submit-After SaveProcess");
		
		VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Documentation_DocumentType", "Saved Online Application", "SavedOnlineApplication", 809, 1);
		//VerifyElementForExistingValueWithText("Saved_Online_Application", "ReviewAndSubmit_Documentation_Description", "Saved Online Application", "SavedOnlineApplication", 810, 1);
	
		clickWebelement("Saved_Online_Application", "Submit_Button");
		//WaitForElementForAccessible(5000, "Saved_Online_Application", "VerifySubmittionofApplication");
		threadWait(15000);
		TrackEnrollmentNumber("Saved_Online_Application", "VerifySubmittionofApplication");
}
public static  void TrackEnrollmentNumber(String FileName, String Webelement) {
	String input= Xpath(FileName, Webelement).getText();
	     String EnrollmentNo=input.replaceAll("[^0-9]", "");
	      System.out.println("\nEnrollment Numbers is: " + EnrollmentNo);
	      try {
			WriteExcel.WriteData("Saved Online Application", "SavedOnlineApplication",EnrollmentNo, 813,1);
		} catch (IOException e) {
			System.out.println("Unable to update data");
		}
	    
}
public static void Navigate_To_Enrollment() {
	/*SwitchTabandCloseChildTab("Helper","BaseURL");
    enterTextboxValue("helper", "Username_Xpath", "LoginData", "Login", 2, 0);
	enterTextboxValue("helper", "Password_Xpath", "LoginData", "Login", 2, 1);
	clickWebelement("helper","Login_Xpath");
	defineLogs("Logout", "Logout", "Logout", "User was Loggedin Successfully", "User is not able to Login","helper", "Logout_Xpath");
	 */
	linkText("Main Menu").click();
	linkText("Enrollments").click();
	enterTextboxValue("Saved_Online_Application", "Verify_Application_Workflow_Enter_Enrollment_No", "Saved Online Application", "SavedOnlineApplication", 813, 1);
	scrollToElement("Saved_Online_Application", "Verify_Application_Workflow_Search_Enrollment");
	clickWebelement("Saved_Online_Application", "Verify_Application_Workflow_Search_Enrollment");
	WaitForElement(300, "Saved_Online_Application", "Verify_Application_Workflow_Click_On_Enrollment_Link");
	clickWebelement("Saved_Online_Application", "Verify_Application_Workflow_Click_On_Enrollment_Link");
}
public static void Verify_Created_Application() {
	clickWebelement("Saved_Online_Application", "Verify_Application_Workflow_Navigate_To_Applicaction_Workflow_Page");
	WaitForElement(300, "Saved_Online_Application", "Verify_Application_Workflow_CustomerSignDate");
	       //Verify General Application Information-Application Workflow
			Pass_Message("Verify General Application Information-Application Workflow");
				
			//VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_ApplicationDate", "Saved Online Application", "SavedOnlineApplication", 455, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_CustomerSignDate", "Saved Online Application", "SavedOnlineApplication", 672, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_InstallationDate", "Saved Online Application", "SavedOnlineApplication", 568, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_TerminationDate", "Saved Online Application", "SavedOnlineApplication", 762, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_IndividualCompletingtheApplication", "Saved Online Application", "SavedOnlineApplication", 814, 1);
			//VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_ProjectDescription", "Saved Online Application", "SavedOnlineApplication", 670, 2);
			//VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_TotalProjectCost", "Saved Online Application", "SavedOnlineApplication", 672, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_AccountHolderTaxStatus", "Saved Online Application", "SavedOnlineApplication", 686, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_AccountHolderTaxIDType", "Saved Online Application", "SavedOnlineApplication", 687, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_AccountHolderTaxID_SSN", "Saved Online Application", "SavedOnlineApplication", 816, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Organization", "Saved Online Application", "SavedOnlineApplication", 760, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_ProjectType", "Saved Online Application", "SavedOnlineApplication", 761, 1);
					
			//Verify Customer Information-Application Workflow
	        Pass_Message("Verify Customer Information-Application Workflow");
	    
	        VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_Customer_Information_AccountNumber", "Saved Online Application", "SavedOnlineApplication", 462, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_AlternateServiceProvider", "Saved Online Application", "SavedOnlineApplication", 679, 1 );
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_AlternateAccountNumber", "Saved Online Application", "SavedOnlineApplication", 680, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_AccountName", "Saved Online Application", "SavedOnlineApplication", 674, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_Email", "Saved Online Application", "SavedOnlineApplication", 678, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 675, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 676, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 677, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_62yearsorgreater", "Saved Online Application", "SavedOnlineApplication", 681, 1);		
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_Disabled", "Saved Online Application", "SavedOnlineApplication", 682, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_DisabilityIdentification", "Saved Online Application", "SavedOnlineApplication", 683, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Customer_Information_Ethnicity", "Saved Online Application", "SavedOnlineApplication", 684, 1);
		
			//Verify Installation Address-Application Workflow
			Pass_Message("Verify Installation Address-Application Workflow");
			
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Installation_Address_Street", "Saved Online Application", "SavedOnlineApplication", 695, 1);
			//VarifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Installation_Address_Unit", "Saved Online Application", "SavedOnlineApplication", 696, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Installation_Address_City", "Saved Online Application", "SavedOnlineApplication", 696, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Installation_Address_State", "Saved Online Application", "SavedOnlineApplication", 697, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Installation_Address_Zip", "Saved Online Application", "SavedOnlineApplication", 698, 1);
			
			//Verify Applicant Information-Application Workflow
	        Pass_Message("Verify Applicant Information-Application Workflow");
			
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Applicant_Information_FirstName", "Saved Online Application", "SavedOnlineApplication", 479, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Applicant_Information_LastName", "Saved Online Application", "SavedOnlineApplication", 480, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Applicant_Information_Email", "Saved Online Application", "SavedOnlineApplication", 484, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Applicant_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 481, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Applicant_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 482, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Applicant_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 483, 1);
			
			//Verify Mailing Address-Application Workflow
			Pass_Message("Verify Mailing Address-Application Workflow");
			
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Mailing_Address_Street", "Saved Online Application", "SavedOnlineApplication", 699, 1);
			//VarifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Mailing_Address_Unit", "Saved Online Application", "SavedOnlineApplication", 699, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Mailing_Address_City", "Saved Online Application", "SavedOnlineApplication", 700, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Mailing_Address_State", "Saved Online Application", "SavedOnlineApplication", 701, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Mailing_Address_Zip", "Saved Online Application", "SavedOnlineApplication", 702, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Mailing_Address_Country", "Saved Online Application", "SavedOnlineApplication", 703, 2);
			
			//Verify Property Information-Application Workflow
	        Pass_Message("Verify Property Information-Application Workflow");
	        
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_BuildingType", "Saved Online Application", "SavedOnlineApplication", 705, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 706, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_AccesstoAllRooms", "Saved Online Application", "SavedOnlineApplication", 707, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_AirConditioned", "Saved Online Application", "SavedOnlineApplication", 708, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_AirConditionedSquareFootage", "Saved Online Application", "SavedOnlineApplication", 709, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_AnticipatedDateforClosing", "Saved Online Application", "SavedOnlineApplication", 710, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_AuditPerformed", "Saved Online Application", "SavedOnlineApplication", 711, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_AvailableDateforInspection", "Saved Online Application", "SavedOnlineApplication", 712, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_BenchmarkCompleted", "Saved Online Application", "SavedOnlineApplication", 713, 1);
			
			validationWithelementVisibility("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_BenchmarkExempt", "Check box is in unchecked state", "Check box is in checked state");
			
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_BenchmarkScore", "Saved Online Application", "SavedOnlineApplication", 715, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_BuildingPermitNumber", "Saved Online Application", "SavedOnlineApplication", 716, 1);
			
			validationWithelementVisibility("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_Checkbox", "Check box is in unchecked state", "Check box is in checked state");
			
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_ConstructionType", "Saved Online Application", "SavedOnlineApplication", 718, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_Date", "Saved Online Application", "SavedOnlineApplication", 719, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_DropDownList", "Saved Online Application", "SavedOnlineApplication", 720, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_Formula", "Saved Online Application", "SavedOnlineApplication", 721, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_FoundationType", "Saved Online Application", "SavedOnlineApplication", 722, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_HERSCertificationDate", "Saved Online Application", "SavedOnlineApplication", 723, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_HERSIndex", "Saved Online Application", "SavedOnlineApplication", 724, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_IsEnergyStar", "Saved Online Application", "SavedOnlineApplication", 725, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_MultiSelect_1stElement", "Saved Online Application", "SavedOnlineApplication", 726, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_MultiSelect_2ndElement", "Saved Online Application", "SavedOnlineApplication", 726, 2);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_MultiSelect_3rdElement", "Saved Online Application", "SavedOnlineApplication", 726, 3);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_NumberofBedrooms", "Saved Online Application", "SavedOnlineApplication", 727, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_NumberofEmployees", "Saved Online Application", "SavedOnlineApplication", 728, 2);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_NumberofOccupants", "Saved Online Application", "SavedOnlineApplication", 729, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_NumericValue", "Saved Online Application", "SavedOnlineApplication", 730, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_ParkName", "Saved Online Application", "SavedOnlineApplication", 731, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_PremiseSquareFootage", "Saved Online Application", "SavedOnlineApplication", 732, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_ServiceDistrict", "Saved Online Application", "SavedOnlineApplication", 733, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_SiteBlockNumber", "Saved Online Application", "SavedOnlineApplication", 734, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_SiteLotNumber", "Saved Online Application", "SavedOnlineApplication", 735, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_SpaceHeating_ServiceProvider", "Saved Online Application", "SavedOnlineApplication", 736, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_SpaceHeating_FuelType", "Saved Online Application", "SavedOnlineApplication", 737, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_SubdivisionName", "Saved Online Application", "SavedOnlineApplication", 738, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_TextBox", "Saved Online Application", "SavedOnlineApplication", 739, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_WaterHeating_ServiceProvider", "Saved Online Application", "SavedOnlineApplication", 740, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_WaterHeating_FuelType", "Saved Online Application", "SavedOnlineApplication", 741, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_WeeklyHoursofOperation", "Saved Online Application", "SavedOnlineApplication", 742, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Property_Information_YearBuilt", "Saved Online Application", "SavedOnlineApplication", 743, 1);
			
			//Verify Marketing Information-Application Workflow
		    Pass_Message("Verify Marketing Information-Application Workflow");
			
		    VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_LeadSourceCategory", "Saved Online Application", "SavedOnlineApplication", 656, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_LeadSource", "Saved Online Application", "SavedOnlineApplication", 657, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_OutreachSourceTradeAlly", "Saved Online Application", "SavedOnlineApplication", 658, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_OutreachSourceEmployee", "Saved Online Application", "SavedOnlineApplication", 659, 2);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_AccountExecutive", "Saved Online Application", "SavedOnlineApplication", 660, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_Campaign", "Saved Online Application", "SavedOnlineApplication", 661, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_MarketingRep", "Saved Online Application", "SavedOnlineApplication", 662, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_Segment", "Saved Online Application", "SavedOnlineApplication", 663, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Marketing_Information_TargetMarket", "Saved Online Application", "SavedOnlineApplication", 664, 1);
			 
			//Verify Payee Information-Application Workflow
			Pass_Message("Verify Payee Information-Application Workflow");
	        
			validationWithelementVisibility("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_Applicant", "Applicant checkbox selected successfully", "Applicant checkbox is not selected");
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_Name","Saved Online Application", "SavedOnlineApplication", 752, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_Phone", "Saved Online Application", "SavedOnlineApplication", 557, 1);
			
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_Street", "Saved Online Application", "SavedOnlineApplication", 755, 1);
			//VarifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_Unit", "Saved Online Application", "SavedOnlineApplication", 754, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_State", "Saved Online Application", "SavedOnlineApplication", 756, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_City", "Saved Online Application", "SavedOnlineApplication", 757, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_Zip", "Saved Online Application", "SavedOnlineApplication", 758, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_Country", "Saved Online Application", "SavedOnlineApplication", 703, 2);
			
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_TaxStatus", "Saved Online Application", "SavedOnlineApplication", 753, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_TaxIdType", "Saved Online Application", "SavedOnlineApplication", 817, 1);
			VerifyElementForExistingValueWithAttribute("Saved_Online_Application", "Verify_Application_Workflow_Payee_Information_TaxId_SSN", "Saved Online Application", "SavedOnlineApplication", 754, 1);
			
			//Verify Payment Information Application Workflow
			Pass_Message("Verify Payment Information Application Workflow");
			
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payment_Information_TotalAmount", "Saved Online Application", "SavedOnlineApplication", 807, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payment_Information_PaymentMethod", "Saved Online Application", "SavedOnlineApplication", 805, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Payment_Information_Amount", "Saved Online Application", "SavedOnlineApplication", 807, 1);
			
			defineLogs("Workflow Step Costs", "Workflow Step Costs", "Workflow Step Costs", "Incentive Amount verified Successfully", "Unable to verify Incentive Amount", "Saved_Online_Application", "Verify_Application_Workflow_Payment_Information_Incentive");	
			defineLogs("Workflow Step Costs", "Workflow Step Costs", "Workflow Step Costs", "Total Cost verified Successfully", "Unable to verify Total Cost", "Saved_Online_Application", "Verify_Application_Workflow_Payment_Information_TotalCost");	
			
			//Verify Questionnaire
			Pass_Message("Verify Questionnaire");
			
			scrollToElement("Saved_Online_Application", "Verify_Application_Workflow_Questionnaires_Tab");
			clickWebelement("Saved_Online_Application", "Verify_Application_Workflow_Questionnaires_Tab");

			validationWithelementVisibility("Saved_Online_Application", "Verify_Application_Workflow_Questionnaire_Pre_qualification_Questions_The_answer_is_B", "'B'checkbox is selected for 'The answer is B' successfully", "'B'checkbox is not selected for 'The answer is B' successfully");
			validationWithelementVisibility("Saved_Online_Application", "Verify_Application_Workflow_Questionnaire_Pre_qualification_Questions_The_answer_is_C", "'C'checkbox is selected for 'The answer is C' successfully", "'C'checkbox is not selected for 'The answer is C' successfully");
		    validationWithelementVisibility("Saved_Online_Application", "Verify_Application_Workflow_Questionnaire_Enrollment_Survey_Questions_Was_your_house_built_before_1993_Yes", "Was your house built before 1993?-Yes selected successfully", "Was your house built before 1993?-Yes is not selected");
		    validationWithelementVisibility("Saved_Online_Application", "Verify_Application_Workflow_Questionnaire_Enrollment_Survey_Questions_Have_you_replaced_your_water_heater_in_the_last_5years_Yes", "Have you replaced your water heater in the last 5 years?-Yes selected successfully", "Have you replaced your water heater in the last 5 years?-Yes is not selected");
			
			//Verify Uploaded Document
			Pass_Message("Verify Uploaded Document");
			
			scrollToElement("Saved_Online_Application", "Verify_Application_Workflow_Documents_Tab");
		    clickWebelement("Saved_Online_Application", "Verify_Application_Workflow_Documents_Tab");
		    
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Documentation_DocumentType", "Saved Online Application", "SavedOnlineApplication", 666, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Documentation_DocumentName", "Saved Online Application", "SavedOnlineApplication", 667, 1);
			//VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Documentation_Comments", "Saved Online Application", "SavedOnlineApplication", 668, 1);
		    
			//Verify Enrollment Measure-Application Workflow
	        Pass_Message("Verify Enrollment Measure-Application Workflow");
		   
	        scrollToElement("Saved_Online_Application", "Verify_Application_Workflow_Measures_Tab");
		    clickWebelement("Saved_Online_Application", "Verify_Application_Workflow_Measures_Tab");
		    
		    VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Total_MeasureCost", "Saved Online Application", "SavedOnlineApplication", 569, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Total_Incentive", "Saved Online Application", "SavedOnlineApplication", 570, 1);
		    
			//Verify CPL:Energy Star-Clothes Washer-Residential-Application Workflow
	        Pass_Message("Verify CPL:Energy Star-Clothes Washer-Residential-Application Workflow");
	        
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_Quantity", "Saved Online Application", "SavedOnlineApplication", 765, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_Total", "Saved Online Application", "SavedOnlineApplication", 766, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_BrandName", "Saved Online Application", "SavedOnlineApplication", 767, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_ModelNumber", "Saved Online Application", "SavedOnlineApplication", 768, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_LoadConfiguration", "Saved Online Application", "SavedOnlineApplication", 769, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_AdditionalModelInformation", "Saved Online Application", "SavedOnlineApplication", 770, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_AdditionalWasherFeatures", "Saved Online Application", "SavedOnlineApplication", 771, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_AnnualEnergyUse", "Saved Online Application", "SavedOnlineApplication", 772, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_AnnualWaterUse", "Saved Online Application", "SavedOnlineApplication", 773, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_CommunicationStandardApplicationLayer", "Saved Online Application", "SavedOnlineApplication", 774, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_Connected", "Saved Online Application", "SavedOnlineApplication", 775, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_ConnectsUsing", "Saved Online Application", "SavedOnlineApplication", 776, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_DateAvailableonMarket", "Saved Online Application", "SavedOnlineApplication", 777, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_DateCertified", "Saved Online Application", "SavedOnlineApplication", 778, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_DirectOnpremises_Openstandard_BasedInterconnection", "Saved Online Application", "SavedOnlineApplication", 779, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_ENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 780, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_ENERGYSTARUniqueID", "Saved Online Application", "SavedOnlineApplication", 781, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_IntegratedModifiedEnergyFactor", "Saved Online Application", "SavedOnlineApplication", 782, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_IntegratedWaterFactor", "Saved Online Application", "SavedOnlineApplication", 783, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_IntendedMarket", "Saved Online Application", "SavedOnlineApplication", 784, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_Markets", "Saved Online Application", "SavedOnlineApplication", 785, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_MeetsENERGYSTARMostEfficient2018Criteria", "Saved Online Application", "SavedOnlineApplication", 786, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_PairedENERGYSTARClothesDryerAvailable", "Saved Online Application", "SavedOnlineApplication", 787, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "Saved Online Application", "SavedOnlineApplication", 788, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_UPC", "Saved Online Application", "SavedOnlineApplication", 789, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_USFederalStandard_IMEF", "Saved Online Application", "SavedOnlineApplication", 790, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_USFederalStandard_IWF", "Saved Online Application", "SavedOnlineApplication", 791, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_CPL_Volume", "Saved Online Application", "SavedOnlineApplication", 792, 1);
			
			//Verify Regression-Saved Online Application Measure-Application Workflow
	        Pass_Message("Verify Regression-Saved Online Application Measure-Application Workflow");
	        
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_Quantity", "Saved Online Application", "SavedOnlineApplication", 794, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_Total", "Saved Online Application", "SavedOnlineApplication", 795, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_CheckBox", "Saved Online Application", "SavedOnlineApplication", 796, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_CheckBoxGroup", "Saved Online Application", "SavedOnlineApplication", 797, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_Date", "Saved Online Application", "SavedOnlineApplication", 798, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_DDL", "Saved Online Application", "SavedOnlineApplication", 799, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_Formula", "Saved Online Application", "SavedOnlineApplication", 800, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_Numeric", "Saved Online Application", "SavedOnlineApplication", 801, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_RadioButtonGroup", "Saved Online Application", "SavedOnlineApplication", 802, 1);
			VerifyElementForExistingValueWithText("Saved_Online_Application", "Verify_Application_Workflow_Enrollment_Measure_Saved_Online_Application_Measure_TextBox", "Saved Online Application", "SavedOnlineApplication", 803, 1);
	      
			clickWebelement("Saved_Online_Application", "Process_Button");
			defineLogs("Closed - Work Completed", "Closed - Work Completed", "Closed - Work Completed", "Workflow status Closed - Work Completed Successfully", "Unable to verify workflow status Closed - Work Completed", "Saved_Online_Application", "Verify_Application_Workflow_Status");	
	
}

}
