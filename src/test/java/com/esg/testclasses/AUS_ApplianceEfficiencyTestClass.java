package com.esg.testclasses;

import java.awt.event.KeyEvent;
import com.esg.utilities.HelperClass;
import com.esg.utilities.ReadExcel;

public class AUS_ApplianceEfficiencyTestClass extends HelperClass {
	
	public static void login() {
		
		login("Helper","BaseURL", 1, 0, 1, 1);
	}
	public static void NavigateToEnrollment() {
		//enterTextboxValue("AUSApplianceEfficiency", "MainMenu", "ESG Values", "AUS_ApplianceEfficiency", 1, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		clickWebelement("AUSApplianceEfficiency", "NewEnrollment");
		selectDropdown("AUSApplianceEfficiency", "SelectProgram","SelectProgram", "ESG Values", "AUS_ApplianceEfficiency", 2, 1);
		threadWait(2000);
		clickWebelement("AUSApplianceEfficiency", "NextButton");
		threadWait(7000);
		SwitchToFrame("AUSApplianceEfficiency", "EnterFrame");
		threadWait(2000);
		defineLogs("Austin Energy - Appliance Efficiency Program", "Austin Energy - Appliance Efficiency Program", "Austin Energy - Appliance Efficiency Program", "Navigate to Online Application Successfully", "Unable to Navigate to Online Application", "AUSApplianceEfficiency", "VerifyGettingStarted");	
	}
	public static void Step1_GettingStarted() {
		clickWebelement("AUSApplianceEfficiency", "SelectApplicant");
		threadWait(2000);
		scrollToElement("AUSApplianceEfficiency", "State");
		clickWebelement("AUSApplianceEfficiency", "AccountNumber");
		enterTextboxValue("AUSApplianceEfficiency", "AccountNumber", "ESG Values", "AUS_ApplianceEfficiency", 5, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "StreetNumber", "ESG Values", "AUS_ApplianceEfficiency", 6, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "PostalCode", "ESG Values", "AUS_ApplianceEfficiency", 7, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "State", "ESG Values", "AUS_ApplianceEfficiency", 8, 1);
		threadWait(3000);
		clickWebelement("AUSApplianceEfficiency", "Next_Button");
		threadWait(2000);
		defineLogs("Customer Information", "Customer Information", "Customer Information", "Navigate to Customer Information Successfully", "Unable to Navigate to Customer Information", "AUSApplianceEfficiency", "VerifyCustomerInformation");	
	}
	public static void Step2_CustomerInformation() {
		clickWebelement("AUSApplianceEfficiency", "FirstName");
		enterTextboxValue("AUSApplianceEfficiency", "FirstName", "ESG Values", "AUS_ApplianceEfficiency", 12, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "LastName", "ESG Values", "AUS_ApplianceEfficiency", 13, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "PrimaryPhone", "ESG Values", "AUS_ApplianceEfficiency", 14, 1);
		clickWebelement("AUSApplianceEfficiency", "Email");
		enterTextboxValue("AUSApplianceEfficiency", "Email", "ESG Values", "AUS_ApplianceEfficiency", 15, 1);
		scrollToElement("AUSApplianceEfficiency", "BuildingType");
		selectDropdown("AUSApplianceEfficiency", "BuildingType","BuildingType", "ESG Values", "AUS_ApplianceEfficiency", 16, 1);
		selectDropdown("AUSApplianceEfficiency", "OccupancyStatus","OccupancyStatus", "ESG Values", "AUS_ApplianceEfficiency", 17, 1);
		selectDropdown("AUSApplianceEfficiency", "ConstructionType","ConstructionType", "ESG Values", "AUS_ApplianceEfficiency", 18, 1);
		selectDropdown("AUSApplianceEfficiency", "IsAPermitRequired","IsAPermitRequired", "ESG Values", "AUS_ApplianceEfficiency", 19, 1);
		threadWait(2000);
		clickWebelement("AUSApplianceEfficiency", "Next_Button");
		threadWait(2000);
		defineLogs("Installer Information", "Installer Information", "Installer Information", "Navigate to Installer Information Successfully", "Unable to Navigate to Installer Information", "AUSApplianceEfficiency", "VerifyInstallerInformation");	
	}
	public static void Step3_InstallerInformation() {
		clickWebelement("AUSApplianceEfficiency", "Company");
		enterTextboxValue("AUSApplianceEfficiency", "Company", "ESG Values", "AUS_ApplianceEfficiency", 22, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "ContactName", "ESG Values", "AUS_ApplianceEfficiency", 23, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		clickWebelement("AUSApplianceEfficiency", "Next_Button");
		threadWait(2000);
		defineLogs("Payee Information", "Payee Information", "Payee Information", "Navigate to Payee Information Successfully", "Unable to Navigate to Payee Information", "AUSApplianceEfficiency", "VerifyPayeeInformation");	
	}
	public static void Step4_PayeeInformation() {
		clickWebelement("AUSApplianceEfficiency", "SelectReceiver");
		threadWait(2000);
		clickWebelement("AUSApplianceEfficiency", "Next_Button");
		threadWait(2000);
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information", "AUSApplianceEfficiency", "VerifyEquipmentInformation");	
	}
	public static void Step5_EquipmentInformation() {
		clickWebelement("AUSApplianceEfficiency", "InstallationDateImage");
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("AUSApplianceEfficiency", "AddEquipment");
		WaitForElement(30, "AUSApplianceEfficiency", "SelectEquipment");
		clickWebelement("AUSApplianceEfficiency", "SelectEquipment");
		WaitForElement(30, "AUSApplianceEfficiency", "SelectAirConditioning");
		clickWebelement("AUSApplianceEfficiency", "SelectAirConditioning");
		clickWebelement("AUSApplianceEfficiency", "AddEquipmentButton");
		clickWebelement("AUSApplianceEfficiency", "OkButton");
		threadWait(2000);
		clickWebelement("AUSApplianceEfficiency", "TaxAssessorPropertyID");
		enterTextboxValue("AUSApplianceEfficiency", "TaxAssessorPropertyID", "ESG Values", "AUS_ApplianceEfficiency", 26, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "YearBuilt", "ESG Values", "AUS_ApplianceEfficiency", 27, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "PremiseSquareFootage", "ESG Values", "AUS_ApplianceEfficiency", 28, 1);
		Enter(KeyEvent.VK_TAB);
		
		clickWebelement("AUSApplianceEfficiency", "AirConditioningQuantity");
		enterTextboxValue("AUSApplianceEfficiency", "AirConditioningQuantity", "ESG Values", "AUS_ApplianceEfficiency", 29, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "AHRIReference", "ESG Values", "AUS_ApplianceEfficiency", 30, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "Numberoflevels_stories", "ESG Values", "AUS_ApplianceEfficiency", 31, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "TotalHVACUnitsattheAddress", "ESG Values", "AUS_ApplianceEfficiency", 32, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "NewUnitVariableCapacity", "ESG Values", "AUS_ApplianceEfficiency", 33, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		enterTextboxValue("AUSApplianceEfficiency", "SqFtConditionedZone", "ESG Values", "AUS_ApplianceEfficiency", 34, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "OldUnitAge", "ESG Values", "AUS_ApplianceEfficiency", 35, 1);
		Enter(KeyEvent.VK_TAB);
		threadWait(3000);
		enterTextboxValue("AUSApplianceEfficiency", "OldUnitSize", "ESG Values", "AUS_ApplianceEfficiency", 36, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "NewUnitType", "ESG Values", "AUS_ApplianceEfficiency", 37, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "ExistingHeatType", "ESG Values", "AUS_ApplianceEfficiency", 38, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "NewCondensingUnitSerial", "ESG Values", "AUS_ApplianceEfficiency", 39, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "NewCondensingUnitTIER", "ESG Values", "AUS_ApplianceEfficiency", 40, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "NewEvaporatorUnitSerial", "ESG Values", "AUS_ApplianceEfficiency", 41, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("AUSApplianceEfficiency", "HVACCost", "ESG Values", "AUS_ApplianceEfficiency", 42, 1);
		Enter(KeyEvent.VK_TAB);
		
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'Old Unit SEER' Validated Successfully", "Failed to Validate 'Old Unit SEER'", "AUSApplianceEfficiency", "VerifyOldUnitSEER");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'Old Unit EER' Validated Successfully", "Failed to Validate 'Old Unit EER'", "AUSApplianceEfficiency", "VerifyOldUnitEER");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Unit Size (Tons)' Validated Successfully", "Failed to Validate 'New Unit Size (Tons)'", "AUSApplianceEfficiency", "VerifyNewUnitSize");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Condensing Unit Manufacturer' Validated Successfully", "Failed to Validate 'New Condensing Unit Manufacturer'", "AUSApplianceEfficiency", "VerifyNewCondensingUnitManufacturer");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Condensing Unit Model' Validated Successfully", "Failed to Validate 'New Condensing Unit Model'", "AUSApplianceEfficiency", "VerifyNewCondensingUnitModel");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Condensing Unit SEER' Validated Successfully", "Failed to Validate 'New Condensing Unit SEER'", "AUSApplianceEfficiency", "VerifyNewCondensingUnitSEER");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Condensing Unit EER' Validated Successfully", "Failed to Validate 'New Condensing Unit EER'", "AUSApplianceEfficiency", "VerifyNewCondensingUnitEER");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Furnance Model' Validated Successfully", "Failed to Validate 'New Furnance Model'", "AUSApplianceEfficiency", "VerifyNewFurnanceModel");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Evaporator Unit Manufacturer' Validated Successfully", "Failed to Validate 'New Evaporator Unit Manufacturer'", "AUSApplianceEfficiency", "VerifyNewEvaporatoUnitManufacturer");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Evaporator Unit Model' Validated Successfully", "Failed to Validate 'New Evaporator Unit Model'", "AUSApplianceEfficiency", "VerifyNewEvaporatorUnitModel");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'New Evaporator Unit BTU' Validated Successfully", "Failed to Validate 'New Evaporator Unit BTU'", "AUSApplianceEfficiency", "VerifyNewEvaporatorUnitBTU");	
		
		threadWait(2000);
		clickWebelement("AUSApplianceEfficiency", "Next_Button");
		threadWait(5000);
		defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "Navigate to Incentive Summary Successfully", "Unable to Navigate to Incentive Summary", "AUSApplianceEfficiency", "VerifyIncentiveSummary");	
	}
	public static void Step6_IncentiveSummary() {
		defineLogs("You have applied for $350.00.", "You have applied for $350.00.", "You have applied for $350.00.", "'Incentive applied amount' Validated Successfully", "Failed to Validate 'Incentive applied amount'", "AUSApplianceEfficiency", "VerifyAppliedfor");
		threadWait(2000);
		clickWebelement("AUSApplianceEfficiency", "Next_Button");
		threadWait(2000);
		defineLogs("Documentation", "Documentation", "Documentation", "Navigate to Documentation Successfully", "Unable to Navigate to Documentation", "AUSApplianceEfficiency", "VerifyDocumentation");	
	}
	public static void Step7_Documentation() {
		defineLogs("Documentation", "Documentation", "Documentation", "'Add Document' Validated Successfully", "Failed to Validate 'Add Document'", "AUSApplianceEfficiency", "VerifyAddDocument");
		threadWait(2000);
		clickWebelement("AUSApplianceEfficiency", "Next_Button");
		threadWait(2000);
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "AUSApplianceEfficiency", "VerifyReviewAndSubmit");	
	}
	public static  void TrackEnrollmentNumber(String FileName, String Webelement) {
		String input= Xpath(FileName, Webelement).getText();
		     String EnrollmentNo=input.replaceAll("[^0-9]", "");
		      System.out.println("\nEnrollment Numbers is: " + EnrollmentNo);
		      threadWait(5000);
		      ReadExcel.UpdateData("ESG Values", "AUS_ApplianceEfficiency", 1, 3,EnrollmentNo);
	}
	public static void Step8_ReviewandSubmit() {
		clickWebelement("AUSApplianceEfficiency", "CustomerSignDateImage");
		Enter(KeyEvent.VK_ENTER);
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Customer Information' Validated Successfully", "Failed to Validate 'Customer Information'", "AUSApplianceEfficiency", "CustomerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Applicant Information' Validated Successfully", "Failed to Validate 'Applicant Information'", "AUSApplianceEfficiency", "ApplicantInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Installer Information' Validated Successfully", "Failed to Validate 'Installer Information'", "AUSApplianceEfficiency", "InstallerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Payee Information' Validated Successfully", "Failed to Validate 'Payee Information'", "AUSApplianceEfficiency", "PayeeInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Equipment Information (Austin Regression)' Validated Successfully", "Failed to Validate 'Equipment Information (Austin Regression)'", "AUSApplianceEfficiency", "EquipmentInformationItem1");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Equipment Information (Air Conditioning)' Validated Successfully", "Failed to Validate 'Equipment Information (Air Conditioning)'", "AUSApplianceEfficiency", "EquipmentInformationItem2");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Equipment Information Incentive Amount' Validated Successfully", "Failed to Validate 'Equipment Information Incentive Amount'", "AUSApplianceEfficiency", "EquipmentInformationIncentiveAmount");
		clickWebelement("AUSApplianceEfficiency", "SubmitButton");
		TrackEnrollmentNumber("AUSApplianceEfficiency", "EnrollmentNumber");
		driver.switchTo().defaultContent();
		WaitForElement(3000, "AUSApplianceEfficiency", "CloseOnlineApplication");
		clickWebelement("AUSApplianceEfficiency", "CloseOnlineApplication");
		threadWait(10000);
	}
	public static void VerifyEnrollment(){
		enterTextboxValue("AUSApplianceEfficiency", "EnterEnrollmentNo", "ESG Values", "AUS_ApplianceEfficiency", 1, 3);
		threadWait(3000);
		scrollToElement("AUSApplianceEfficiency", "SearchButton");
		clickWebelement("AUSApplianceEfficiency", "SearchButton");
		threadWait(5000);
		clickWebelement("AUSApplianceEfficiency", "EnrollmentLink");
		clickWebelement("AUSApplianceEfficiency", "ApplicationWorkflowStep");
		
		scrollToElement("AUSApplianceEfficiency", "PaymentReleaseDateImage");
		clickWebelement("AUSApplianceEfficiency", "PaymentReleaseDateImage");
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		threadWait(3000);
		scrollToElement("AUSApplianceEfficiency", "VerifyEnrollmentSummaryIncentiveAmount");
		defineLogs("Application - Applicant Information - Pending Acceptance", "Application - Applicant Information - Pending Acceptance", "Application - Applicant Information - Pending Acceptance", "'Enrollment Summary Incentive Amount' Validated Successfully", "Failed to Validate 'Enrollment Summary Incentive Amount'", "AUSApplianceEfficiency", "VerifyEnrollmentSummaryIncentiveAmount");
		defineLogs("Application - Applicant Information - Pending Acceptance", "Application - Applicant Information - Pending Acceptance", "Application - Applicant Information - Pending Acceptance", "'Enrollment Summary kWh' Validated Successfully", "Failed to Validate 'Enrollment Summary kWh'", "AUSApplianceEfficiency", "VerifyEnrollmentSummarykWh");
		defineLogs("Application - Applicant Information - Pending Acceptance", "Application - Applicant Information - Pending Acceptance", "Application - Applicant Information - Pending Acceptance", "'Enrollment Summary kW' Validated Successfully", "Failed to Validate 'Enrollment Summary kW'", "AUSApplianceEfficiency", "VerifyEnrollmentSummarykW");
	}
	public static void VerifyMeasure(){
		clickWebelement("AUSApplianceEfficiency", "MeasureSubSection");
		threadWait(3000);
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure'", "AUSApplianceEfficiency", "VerifyMeasureAirConditioning");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Incentive Amount' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Incentive Amount'", "AUSApplianceEfficiency", "VerifyMeasureAC_IncentiveAmount");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure kWh' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure kWh'", "AUSApplianceEfficiency", "VerifyMeasureAC_kWh");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure kW' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure kW'", "AUSApplianceEfficiency", "VerifyMeasureAC_kW");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure AHRI Reference' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure AHRI Reference'", "AUSApplianceEfficiency", "VerifyMeasureAHRIReference");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Number of levels/stories' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Number of levels/stories'", "AUSApplianceEfficiency", "VerifyMeasureNumberoflevels_stories");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Total No of HVAC Units at the Address' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Total No of HVAC Units at the Address:'", "AUSApplianceEfficiency", "VerifyMeasureTotalNumberOfHVACUnitsAtTheAddress");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Unit Variable Capacity' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Unit Variable Capacity'", "AUSApplianceEfficiency", "VerifyMeasureNewUnitVariableCapacity");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Sq Ft Conditioned Zone' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Sq Ft Conditioned Zone'", "AUSApplianceEfficiency", "VerifyMeasureSqFtConditionedZone");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Old Unit Age' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Old Unit Age'", "AUSApplianceEfficiency", "VerifyMeasureOldUnitAge");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Old Unit SEER' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Old Unit SEER'", "AUSApplianceEfficiency", "VerifyMeasureOldUnitSEER");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Old Unit EER' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Old Unit EER'", "AUSApplianceEfficiency", "VerifyMeasureOldUnitEER");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Old Unit Size (Tons)' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Old Unit Size (Tons)'", "AUSApplianceEfficiency", "VerifyMeasureOldUnitSize_Tons");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Unit Size (Tons)' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Unit Size (Tons)'", "AUSApplianceEfficiency", "VerifyMeasureNewUnitSize_Tons");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Unit Type' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Unit Type'", "AUSApplianceEfficiency", "VerifyMeasureNewUnitType");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure Existing Heat Type' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure Existing Heat Type'", "AUSApplianceEfficiency", "VerifyMeasureExistingHeatType");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Condensing Unit Manufacturer' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Condensing Unit Manufacturer'", "AUSApplianceEfficiency", "VerifyMeasureNewCondensingUnitManufacturer");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Condensing Unit Model' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Condensing Unit Model'", "AUSApplianceEfficiency", "VerifyMeasureNewCondensingUnitModel");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Condensing Unit Serial' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Condensing Unit Serial'", "AUSApplianceEfficiency", "VerifyMeasureNewCondensingUnitSerial");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Condensing Unit SEER' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Condensing Unit SEER'", "AUSApplianceEfficiency", "VerifyMeasureNewCondensingUnitSEER");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Condensing Unit EER' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Condensing Unit EER'", "AUSApplianceEfficiency", "VerifyMeasureNewCondensingUnitEER");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Condensing Unit TIER' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Condensing Unit TIER'", "AUSApplianceEfficiency", "VerifyMeasureNewCondensingUnitTIER");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Furnance Model' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Furnance Model'", "AUSApplianceEfficiency", "VerifyMeasureNewFurnanceModel");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Evaporator Unit Manufacturer' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Evaporator Unit Manufacturer'", "AUSApplianceEfficiency", "VerifyMeasureNewEvaporatorUnitManufacturer");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Evaporator Unit Model' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Evaporator Unit Model'", "AUSApplianceEfficiency", "VerifyMeasureNewEvaporatorUnitModel");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Evaporator Unit Serial' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Evaporator Unit Serial'", "AUSApplianceEfficiency", "VerifyMeasureNewEvaporatorUnitSerial");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure New Evaporator Unit BTU' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure New Evaporator Unit BTU'", "AUSApplianceEfficiency", "VerifyMeasureNewEvaporatorUnitBTU");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Air Conditioning(AC) Measure HVAC Cost' Validated Successfully", "Failed to Validate 'Air Conditioning(AC) Measure HVAC Cost'", "AUSApplianceEfficiency", "VerifyMeasureHVACCost");
		
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'(Austin Regression) Measure' Validated Successfully", "Failed to Validate '(Austin Regression) Measure'", "AUSApplianceEfficiency", "VerifyMeasureTaxAustinRegression");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'(Austin Regression)Measure Tax Assessor Property ID' Validated Successfully", "Failed to Validate '(Austin Regression)Measure Tax Assessor Property ID'", "AUSApplianceEfficiency", "VerifyMeasureTaxAssessorPropertyID");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'(Austin Regression)Measure Year Built' Validated Successfully", "Failed to Validate '(Austin Regression)Measure Year Built'", "AUSApplianceEfficiency", "VerifyMeasureYearBuilt");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'(Austin Regression)Measure Premise Square Footage' Validated Successfully", "Failed to Validate '(Austin Regression)Measure Premise Square Footage'", "AUSApplianceEfficiency", "VerifyMeasurePremiseSquareFootage");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "' Measure Total Incentive Amount' Validated Successfully", "Failed to Validate ' Measure Total Incentive Amount'", "AUSApplianceEfficiency", "VerifyMeasureTotalIncentiveAmount");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Measure Total kWh' Validated Successfully", "Failed to Validate 'Measure Total kWh'", "AUSApplianceEfficiency", "VerifyMeasureTotalkWh");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Measure Total kW' Validated Successfully", "Failed to Validate 'Measure Total kW'", "AUSApplianceEfficiency", "VerifyMeasureTotalkW");
		defineLogs("Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "Application - Measures - Pending Acceptance", "'Measure workflow summary Total Cost' Validated Successfully", "Failed to Validate 'Measure workflow summary Total Cost'", "AUSApplianceEfficiency", "VerifyMeasureTotalSummaryCost");
		threadWait(3000);
		clickonProcess();
	}
}
