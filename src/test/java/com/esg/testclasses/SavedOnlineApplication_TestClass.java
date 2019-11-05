package com.esg.testclasses;

import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;
import com.esg.utilities.ReadExcel;
import com.relevantcodes.extentreports.LogStatus;

public class SavedOnlineApplication_TestClass extends HelperClass {
	
	
	public static void OpenOnlineApplication(String Relevant_Filename,String Provided_URL) 
	{
		  test = Report.startTest("Login");
		  ExecutingAgainst("Saved_Online_Application", "Version");
		  OpenBrowser(Relevant_Filename, Provided_URL);
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
		 //Verify Customer Information
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_AccountNumber", "Saved Online Application", "SavedOnlineApplication", 13, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_NameOnAccount", "Saved Online Application", "SavedOnlineApplication", 14, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 15, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 16, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 17, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Customer_Information_Email", "Saved Online Application", "SavedOnlineApplication", 18, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_AlternateServiceProvider", "Saved Online Application", "SavedOnlineApplication", 19, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Customer_Information_AlternateAccountNumber", "Saved Online Application", "SavedOnlineApplication", 20, 1);		
	}
	
	public static void VerifyAccountHolderTaxInformation_Step2() {
		//Verify Account Holder Tax Information
	    VarifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_AccountHolderTaxStatus", "Saved Online Application", "SavedOnlineApplication", 22, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_62yearsOrGreater", "Saved Online Application", "SavedOnlineApplication", 23, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_Disabled", "Saved Online Application", "SavedOnlineApplication", 24, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_DisabilityIdentification", "Saved Online Application", "SavedOnlineApplication", 25, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Tax_Information_Ethnicity", "Saved Online Application", "SavedOnlineApplication", 26, 1);
	}
	
	public static void VerifyApplicantInformation_Step2() {
		//Verify Applicant Information
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_FirstName", "Saved Online Application", "SavedOnlineApplication", 28, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_LastName", "Saved Online Application", "SavedOnlineApplication", 29, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 30, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_AltPhone", "Saved Online Application", "SavedOnlineApplication", 31, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Applicant_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 32, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Applicant_Information_Email", "Saved Online Application", "SavedOnlineApplication", 33, 1);
		
	}
	public static void VerifyInstallationAddress_Step2() {
		//Verify Installation Address
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_Street", "Saved Online Application", "SavedOnlineApplication", 35, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Installation_Address_Unit", "Saved Online Application", "SavedOnlineApplication", 36, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_ZIP_Or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 37, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_City", "Saved Online Application", "SavedOnlineApplication", 38, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installation_Address_State", "Saved Online Application", "SavedOnlineApplication", 39, 1);
	}
	public static void VerifyMailingAddress_Step2() {
		//Verify Mailing Address
		validationWithelementVisibility("Saved_Online_Application", "Mailing_Address_Is_mailing_address_same_as_Installation_Address", "Redio button is in unchecked state", "Redio button is in checked state");
		validationWithelementVisibility("Saved_Online_Application", "Mailing_Address_Is_this_a_PO_Box", "Redio button is in unchecked state", "Redio button is in checked state");
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Mailing_Address_Country", "Saved Online Application", "SavedOnlineApplication", 41, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_Street", "Saved Online Application", "SavedOnlineApplication", 42, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Mailing_Address_Unit", "Saved Online Application", "SavedOnlineApplication", 43, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_ZIP_Or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 44, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_City", "Saved Online Application", "SavedOnlineApplication", 45, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Mailing_Address_State", "Saved Online Application", "SavedOnlineApplication", 46, 1);
	}
	public static void VerifyPropertyInformation_Step2() {
		//Verify Property Information
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_BuildingType", "Saved Online Application", "SavedOnlineApplication", 48, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 49, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AccesstoAllRooms", "Saved Online Application", "SavedOnlineApplication", 50, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AirConditioned", "Saved Online Application", "SavedOnlineApplication", 51, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AirConditionedSquareFootage", "Saved Online Application", "SavedOnlineApplication", 52, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AnticipatedDateforClosing", "Saved Online Application", "SavedOnlineApplication", 53, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AuditPerformed", "Saved Online Application", "SavedOnlineApplication", 54, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_AvailableDateforInspection", "Saved Online Application", "SavedOnlineApplication", 55, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_BenchmarkCompleted", "Saved Online Application", "SavedOnlineApplication", 56, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_BuildingPermitNumber", "Saved Online Application", "SavedOnlineApplication", 57, 1);
		
		validationWithelementVisibility("Saved_Online_Application", "Property_Information_Checkbox", "Check box is in unchecked state", "Check box is in checked state");
		
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_ConstructionType", "Saved Online Application", "SavedOnlineApplication", 58, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Date", "Saved Online Application", "SavedOnlineApplication", 59, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_DropDownList", "Saved Online Application", "SavedOnlineApplication", 60, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Formula", "Saved Online Application", "SavedOnlineApplication", 61, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_FoundationType", "Saved Online Application", "SavedOnlineApplication", 62, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_HERSCertificationDate", "Saved Online Application", "SavedOnlineApplication", 63, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_HERSIndex", "Saved Online Application", "SavedOnlineApplication", 64, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_IsEnergyStar", "Saved Online Application", "SavedOnlineApplication", 65, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 66, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_NumberofBedrooms", "Saved Online Application", "SavedOnlineApplication", 67, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_NumberofEmployees", "Saved Online Application", "SavedOnlineApplication", 68, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_NumberofOccupants", "Saved Online Application", "SavedOnlineApplication", 69, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_NumericValue", "Saved Online Application", "SavedOnlineApplication", 70, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_ParkName", "Saved Online Application", "SavedOnlineApplication", 71, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_PremiseSquareFootage", "Saved Online Application", "SavedOnlineApplication", 72, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_ServiceDistrict", "Saved Online Application", "SavedOnlineApplication", 73, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SiteBlockNumber", "Saved Online Application", "SavedOnlineApplication", 74, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SiteLotNumber", "Saved Online Application", "SavedOnlineApplication", 75, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SpaceHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 76, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SpaceHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 77, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_SubdivisionName", "Saved Online Application", "SavedOnlineApplication", 78, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_TextBox", "Saved Online Application", "SavedOnlineApplication", 79, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_WaterHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 80, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_WaterHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 81, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_WeeklyHoursofOperation", "Saved Online Application", "SavedOnlineApplication", 82, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_YearBuilt", "Saved Online Application", "SavedOnlineApplication", 83, 1);
	}
	public static void VerifyGeneralApplicationInformation_Step2() {
		//Verify General Application Information
		VarifyElementForExistingValueWithText("Saved_Online_Application", "General_Application_Information_Organization", "Saved Online Application", "SavedOnlineApplication", 85, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "General_Application_Information_ProjectType", "Saved Online Application", "SavedOnlineApplication", 86, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "General_Application_Information_TerminationDate", "Saved Online Application", "SavedOnlineApplication", 87, 1);
	}
	
	public static void Step2_Complete_CustomerInformation() {	
		
		//Enter Values in Customer Information
		enterTextboxValue("Saved_Online_Application", "Customer_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 90, 1);
		//enterTextboxValue("Saved_Online_Application", "Customer_Information_Email", "Saved Online Application", "SavedOnlineApplication", 91, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Customer_Information_AlternateServiceProvider", "Saved Online Application", "SavedOnlineApplication", 92, 1);
		enterTextboxValue("Saved_Online_Application", "Customer_Information_AlternateAccountNumber", "Saved Online Application", "SavedOnlineApplication", 93, 1);
		
		//Enter Values in Account Holder Tax Information
		selectDropdownByVisibleText("Saved_Online_Application", "Tax_Information_AccountHolderTaxStatus", "Saved Online Application", "SavedOnlineApplication", 95, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Tax_Information_AccountHolderTaxIDType", "Saved Online Application", "SavedOnlineApplication", 96, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("Saved_Online_Application", "Tax_Information_AccountHolderTaxID_SSN", "Saved Online Application", "SavedOnlineApplication", 97, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Tax_Information_62yearsOrGreater", "Saved Online Application", "SavedOnlineApplication", 98, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Tax_Information_Disabled", "Saved Online Application", "SavedOnlineApplication", 99, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Tax_Information_DisabilityIdentification", "Saved Online Application", "SavedOnlineApplication", 100, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Tax_Information_Ethnicity", "Saved Online Application", "SavedOnlineApplication", 101, 1);
		
		//Enter Values in Applicant Information
		enterTextboxValue("Saved_Online_Application", "Applicant_Information_Fax", "Saved Online Application", "SavedOnlineApplication", 103, 1);
		//enterTextboxValue("Saved_Online_Application", "Applicant_Information_Email", "Saved Online Application", "SavedOnlineApplication", 104, 1);
		
		//Enter Values in Property Information
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_AccesstoAllRooms", "Saved Online Application", "SavedOnlineApplication", 106, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_AirConditioned", "Saved Online Application", "SavedOnlineApplication", 107, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_AirConditionedSquareFootage", "Saved Online Application", "SavedOnlineApplication", 108, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_AnticipatedDateforClosing", "Saved Online Application", "SavedOnlineApplication", 109, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_AuditPerformed", "Saved Online Application", "SavedOnlineApplication", 110, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_AvailableDateforInspection", "Saved Online Application", "SavedOnlineApplication", 111, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_BenchmarkCompleted", "Saved Online Application", "SavedOnlineApplication", 112, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_BenchmarkScore", "Saved Online Application", "SavedOnlineApplication", 113, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_BuildingPermitNumber", "Saved Online Application", "SavedOnlineApplication", 114, 1);
		clickWebelement("Saved_Online_Application", "Property_Information_Checkbox");
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_ConstructionType", "Saved Online Application", "SavedOnlineApplication", 115, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_Date", "Saved Online Application", "SavedOnlineApplication", 116, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_DropDownList", "Saved Online Application", "SavedOnlineApplication", 117, 1);
		
		VarifyElementForExistingValueWithText("Saved_Online_Application", "Property_Information_Formula", "Saved Online Application", "SavedOnlineApplication", 118, 1);
		
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_FoundationType", "Saved Online Application", "SavedOnlineApplication", 119, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_HERSCertificationDate", "Saved Online Application", "SavedOnlineApplication", 120, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_HERSIndex", "Saved Online Application", "SavedOnlineApplication", 121, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_IsEnergyStar", "Saved Online Application", "SavedOnlineApplication", 122, 1);
		
		clickWebelement("Saved_Online_Application", "Property_Information_MultiSelect");
		enterValueByActionClass("Saved_Online_Application", "Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 123, 1);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("Saved_Online_Application", "Property_Information_MultiSelect");
		enterValueByActionClass("Saved_Online_Application", "Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 123, 2);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("Saved_Online_Application", "Property_Information_MultiSelect");
		enterValueByActionClass("Saved_Online_Application", "Property_Information_MultiSelect", "Saved Online Application", "SavedOnlineApplication", 123, 3);
		Enter(KeyEvent.VK_ENTER);
		
		enterTextboxValue("Saved_Online_Application", "Property_Information_NumberofBedrooms", "Saved Online Application", "SavedOnlineApplication", 124, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_NumberofEmployees", "Saved Online Application", "SavedOnlineApplication", 125, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_NumberofOccupants", "Saved Online Application", "SavedOnlineApplication", 126, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_NumericValue", "Saved Online Application", "SavedOnlineApplication", 127, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_ParkName", "Saved Online Application", "SavedOnlineApplication", 128, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_PremiseSquareFootage", "Saved Online Application", "SavedOnlineApplication", 129, 1);
		
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_ServiceDistrict", "Saved Online Application", "SavedOnlineApplication", 130, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_SiteBlockNumber", "Saved Online Application", "SavedOnlineApplication", 131, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_SiteLotNumber", "Saved Online Application", "SavedOnlineApplication", 132, 1);		
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_SpaceHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 133, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_SpaceHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 134, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_SubdivisionName", "Saved Online Application", "SavedOnlineApplication", 135, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_TextBox", "Saved Online Application", "SavedOnlineApplication", 136, 1);		
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_WaterHeatingServiceProvider", "Saved Online Application", "SavedOnlineApplication", 137, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "Property_Information_WaterHeatingFuelType", "Saved Online Application", "SavedOnlineApplication", 138, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_WeeklyHoursofOperation", "Saved Online Application", "SavedOnlineApplication", 139, 1);
		enterTextboxValue("Saved_Online_Application", "Property_Information_YearBuilt", "Saved Online Application", "SavedOnlineApplication", 140, 1);
		
		//Enter Values in General Application Information
		enterTextboxValue("Saved_Online_Application", "General_Application_Information_Organization", "Saved Online Application", "SavedOnlineApplication", 142, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "General_Application_Information_ProjectType", "Saved Online Application", "SavedOnlineApplication", 143, 1);
		enterTextboxValue("Saved_Online_Application", "General_Application_Information_TerminationDate", "Saved Online Application", "SavedOnlineApplication", 144, 1);
		
		clickWebelement("Saved_Online_Application", "NEXT_Button");
		threadWait(2000);
		defineLogs("Installer Information", "Installer Information", "Installer Information", "Navigate to Installer Information Successfully", "Unable to Navigate to Installer Information", "Saved_Online_Application", "VerifyInstallerInformation");

	}
	
public static void Step3_Complete_InstallerInformation() {
		
		clickWebelement("Saved_Online_Application", "Installer_Information_WorkPerformedBy_Installer");
		clickWebelement("Saved_Online_Application", "Installer_Information_Company");
		enterValueByActionClass("Saved_Online_Application", "Installer_Information_Company", "Saved Online Application", "SavedOnlineApplication", 149, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("Saved_Online_Application", "Installer_Information_ContactName", "Saved Online Application", "SavedOnlineApplication", 150, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_ENTER);
		threadWait(5000);
		//Verify Installer Information
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactPhone", "Saved Online Application", "SavedOnlineApplication", 155, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactEmail", "Saved Online Application", "SavedOnlineApplication", 156, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ContactFax", "Saved Online Application", "SavedOnlineApplication", 157, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Website", "Saved Online Application", "SavedOnlineApplication", 158, 1);
		
		validationWithelementVisibility("Saved_Online_Application", "Installer_Information_Isthis_A_POBox", "PO box selected checkbox is: Yes", "PO box selected checkbox is: No");
		
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_InCareof_or_Recipient", "Saved Online Application", "SavedOnlineApplication", 159, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Street", "Saved Online Application", "SavedOnlineApplication", 160, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_Unit", "Saved Online Application", "SavedOnlineApplication", 161, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_ZIP_or_PostalCode", "Saved Online Application", "SavedOnlineApplication", 162, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_City", "Saved Online Application", "SavedOnlineApplication", 163, 1);
		VarifyElementForExistingValueWithAttribute("Saved_Online_Application", "Installer_Information_State", "Saved Online Application", "SavedOnlineApplication", 164, 1);
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "NEXT_Button");
		threadWait(2000);
		defineLogs("Payee Information", "Payee Information", "Payee Information", "Navigate to Payee Information Successfully", "Unable to Navigate to Payee Information", "Saved_Online_Application", "VerifyPayeeInformation");	
	}
	
public static void Step4_Complete_PayeeInformation() {
	clickWebelement("Saved_Online_Application", "SelectAccountHolder");
	threadWait(3000);
	selectDropdownByVisibleText("Saved_Online_Application", "TaxStatus", "Saved Online Application", "SavedOnlineApplication", 21, 1);
	clickWebelement("Saved_Online_Application", "NextButton");
	defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information", "Saved_Online_Application", "VerifyEquipmentInformation");	
}
	
	
	
	
	
		/*VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		VarifyElementForExistingValueWithText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		
		
		
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		ValidateWithElementForExistingValue("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		
		
		
		clickWebelement("Saved_Online_Application", "FirstName");
		enterValueByActionClass("Saved_Online_Application", "FirstName", "Saved Online Application", "SavedOnlineApplication", 6, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("Saved_Online_Application", "LastName", "Saved Online Application", "SavedOnlineApplication", 7, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("Saved_Online_Application", "PrimaryPhone", "Saved Online Application", "SavedOnlineApplication", 8, 1);
		scrollToElement("Saved_Online_Application", "BuildingType");
		selectDropdownByVisibleText("Saved_Online_Application", "BuildingType", "Saved Online Application", "SavedOnlineApplication", 9, 1);
		selectDropdownByVisibleText("Saved_Online_Application", "OccupancyStatus", "Saved Online Application", "SavedOnlineApplication", 10, 1);
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "NextButton");
		threadWait(2000);
		defineLogs("Installer Information", "Installer Information", "Installer Information", "Navigate to Installer Information Successfully", "Unable to Navigate to Installer Information", "Saved_Online_Application", "VerifyInstallerInformation");*/	

	

	public static void Step5_EquipmentInformation() {
		explicitWait(30, "Saved_Online_Application", "AddEquipment");
		ClickWebelementByActionClass("Saved_Online_Application", "AddEquipment");
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "SelectLighting");
		clickWebelement("Saved_Online_Application", "OkButton");
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "LightingQuantity");
		enterTextboxValue("Saved_Online_Application", "LightingQuantity", "Saved Online Application", "SavedOnlineApplication", 25, 1);
		clickWebelement("Saved_Online_Application", "LightingAnticipatedDateImage");
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingInstalledFixtureDescription", "Saved Online Application", "SavedOnlineApplication", 26, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingInstalledWattagePerFixture", "Saved Online Application", "SavedOnlineApplication", 27, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingExistingQuantity", "Saved Online Application", "SavedOnlineApplication", 28, 1);
		Enter(KeyEvent.VK_TAB);
		selectDropdownByVisibleText("Saved_Online_Application", "LightingExistingFixture", "Saved Online Application", "SavedOnlineApplication", 29, 1);
		Enter(KeyEvent.VK_TAB);
		selectDropdownByVisibleText("Saved_Online_Application", "LightingExistingFixtureDescription", "Saved Online Application", "SavedOnlineApplication", 30, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingFixturesNotWorking", "Saved Online Application", "SavedOnlineApplication", 31, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingExistingWattagePerFixture", "Saved Online Application", "SavedOnlineApplication", 32, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingAnnualOperatingHours", "Saved Online Application", "SavedOnlineApplication", 33, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingLocation", "Saved Online Application", "SavedOnlineApplication", 34, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingCost", "Saved Online Application", "SavedOnlineApplication", 35, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Saved_Online_Application", "LightingNotes", "Saved Online Application", "SavedOnlineApplication", 36, 1);
		Enter(KeyEvent.VK_TAB);
	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'Installed total watts' Validated Successfully", "Failed to Validate 'Installed total watts'", "Saved_Online_Application", "VerifyLightingInstalledTotalWatts");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'Existing total watts' Validated Successfully", "Failed to Validate 'Existing total watts'", "Saved_Online_Application", "VerifyLightingExistingTotalWatts");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'Total wattage reduction' Validated Successfully", "Failed to Validate 'Total wattage reduction'", "Saved_Online_Application", "VerifyLightingTotalWattageReduction");
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "NextButton");
		threadWait(5000);
		if (Xpath("Saved_Online_Application", "Warning").isDisplayed()) {
			clickWebelement("Saved_Online_Application", "AcceptWarning");
		} else {
			test.log(LogStatus.INFO, "Warning message was not displayed");
		}
		defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "Navigate to Incentive Summary Successfully", "Unable to Navigate to Incentive Summary", "Saved_Online_Application", "VerifyIncentiveSummary");	
	}
	public static void Step6_IncentiveSummary() {
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "NextButton");
		threadWait(2000);
		defineLogs("Documentation", "Documentation", "Documentation", "Navigate to Documentation Successfully", "Unable to Navigate to Documentation", "Saved_Online_Application", "VerifyDocumentation");	
	}
	public static void Step7_Documentation() {
		defineLogs("Documentation", "Documentation", "Documentation", "'Add Document' Validated Successfully", "Failed to Validate 'Add Document'", "Saved_Online_Application", "VerifyAddDocument");
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "NextButton");
		threadWait(2000);
		defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions", "Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions", "Saved_Online_Application", "VerifyTermsandCondition");	
	}
	public static void Step8_TermsandCondition() {
		clickWebelement("Saved_Online_Application", "AcceptTermsandCondition");
		threadWait(2000);
		clickWebelement("Saved_Online_Application", "NextButton");
		threadWait(2000);
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "Saved_Online_Application", "VerifyReviewAndSubmit");	
	}
	
	public static  void TrackEnrollmentNumber(String FileName, String Webelement) {
		String input= Xpath(FileName, Webelement).getText();
		     String EnrollmentNo=input.replaceAll("[^0-9]", "");
		      System.out.println("\nEnrollment Numbers is: " + EnrollmentNo);
		      threadWait(5000);
		      ReadExcel.UpdateData("Saved Online Application", "SavedOnlineApplication", 2, 3,EnrollmentNo);
	}
	public static void Step9_ReviewandSubmit() {
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Customer Information' Validated Successfully", "Failed to Validate 'Customer Information'", "Saved_Online_Application", "CustomerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Applicant Information' Validated Successfully", "Failed to Validate 'Applicant Information'", "Saved_Online_Application", "ApplicantInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Installer Information' Validated Successfully", "Failed to Validate 'Installer Information'", "Saved_Online_Application", "InstallerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Payee Information' Validated Successfully", "Failed to Validate 'Payee Information'", "Saved_Online_Application", "PayeeInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Equipment Information 'Lighting - Other' Validated Successfully", "Failed to Validate Equipment Information 'Lighting - Other'", "Saved_Online_Application", "EquipmentInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Equipment Information 'Lighting - Other Quantity' Validated Successfully", "Failed to Validate Equipment Information 'Lighting - Other Quantity'", "Saved_Online_Application", "EquipmentInformationQuantity");
		clickWebelement("Saved_Online_Application", "SubmitButton");
		threadWait(7000);
		TrackEnrollmentNumber("Saved_Online_Application", "EnrollmentNumber");
		threadWait(2000);
	}

}
