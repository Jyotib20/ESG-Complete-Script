package com.esg.testclasses;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import com.esg.utilities.HelperClass;
import com.esg.utilities.WriteExcel;
import com.relevantcodes.extentreports.LogStatus;

public class ESA_TestClass extends HelperClass{
	
	public static void Login() {
		
		login("helper", "BaseURL", 4, 0, 4, 1);
	}
	
	public static void Create_New_Lead() {
		//enterTextboxValue("ESA", "MainMenu", "ESG Values", "ESA_Data", 2, 1);
		linkText("Main Menu").click();
		linkText("Leads").click();
		WaitForElement(3000, "ESA", "NewLead");
		VerifyElementForExistingValueWithText("ESA", "LeadPageValidation",  "ESG Values", "ESA_Data", 6, 1);
		clickWebelement("ESA", "NewLead");
		selectDropdown("ESA", "SelectProgram","SelectProgram", "ESG Values", "ESA_Data", 3, 1);
		clickWebelement("ESA", "NextButton");
		WaitForElement(3000, "ESA", "SearchBox");
		selectDropdown("ESA", "SearchBox","SearchBox", "ESG Values", "ESA_Data", 4, 1);
		clickWebelement("ESA", "GOButton");
		WaitForElement(3000, "ESA", "CustomerLink");
		VerifyElementForExistingValueWithText("ESA", "CustomerLink",  "ESG Values", "ESA_Data", 5, 1);
		clickWebelement("ESA", "CustomerLink");
		scrollToElement("ESA", "NextButton");
		clickWebelement("ESA", "NextButton");
		threadWait(3000);
		try {
		    // Add a wait timeout before this statement to make 
		    // sure you are not checking for the alert too soon.
		    ESA_Alert_Window();
		    Create_New_Lead();
		} catch(NoAlertPresentException noe) {
		    // No alert found on page, proceed with test.
			WaitForElement(3000, "ESA", "NewLeadValidation");
			VerifyElementForExistingValueWithText("ESA", "NewLeadValidation",  "ESG Values", "ESA_Data", 7, 1);
		
		}
		
	}
	
	public static  void TrackLeadNumber(String FileName, String Webelement, String ExcelFileName, String ExcelSheetName, int Row, int Col  ){
		String input= Xpath(FileName, Webelement).getText();
		     String LeadSummary=input.replaceAll("[^0-9]", "");
		      System.out.println("\nLead Summary is: " + LeadSummary);
		      String LeadNo=(String) LeadSummary.subSequence(0, 4);
		      System.out.println("\nLead Numbers is: " + LeadNo);
		      threadWait(5000);
		      try {
				WriteExcel.WriteData(ExcelFileName, ExcelSheetName, LeadNo, Row, Col);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Lead Number is not updated");
			}
		      
	}
		
	public static void UpdateLeadData() {
		
		//Contact Information
		Clear("ESA", "FirstName");
		enterTextboxValue("ESA", "FirstName",  "ESG Values", "ESA_Data", 11, 1);
		Clear("ESA", "LastName");
		enterTextboxValue("ESA", "LastName",  "ESG Values", "ESA_Data", 12, 1);
		clickWebelement("ESA", "Check_Email_NA");
		//selectDropdown("ESA", "EmailID",  "ESG Values", "ESA_Data", 13, 1);
		enterTextboxValue("ESA", "PrimaryPhoneNumber",  "ESG Values", "ESA_Data", 14, 1);
		enterTextboxValue("ESA", "Occupancy_Status",  "ESG Values", "ESA_Data", 15, 1);
		enterTextboxValue("ESA", "Building_Type",  "ESG Values", "ESA_Data", 16, 1);
		enterTextboxValue("ESA", "Total_Occupants",  "ESG Values", "ESA_Data", 17, 1);
		enterTextboxValue("ESA", "Total_Household_Income",  "ESG Values", "ESA_Data", 18, 1);
		TrackLeadNumber("ESA", "LeadSummary",  "ESG Values", "ESA_Data", 21, 1);
		//Mailing Address
		enterTextboxValue("ESA", "MailingAddressUnit",  "ESG Values", "ESA_Data", 21, 1);
		//Installation Address
		scrollToElement("ESA", "InstallationAddressUnit");
		enterTextboxValue("ESA", "InstallationAddressUnit",  "ESG Values", "ESA_Data", 21, 1);
		
		//Assignment
		scrollToElement("ESA", "TradeAlly");
		selectDropdown("ESA", "TradeAlly", "TradeAlly", "ESG Values", "ESA_Data", 26, 1);
		threadWait(3000);
		selectDropdown("ESA", "Employee","Employee",  "ESG Values", "ESA_Data", 27, 1);
		AppointmentDate();
		threadWait(3000);
		clickWebelement("ESA", "Appointment_Time");
		clickWebelement("ESA", "Select_3.00PM");
		
		
		//Marketing Information
		scrollToElement("ESA", "Lead_Source_Category");
		selectDropdown("ESA", "Lead_Source_Category","Lead_Source_Category",  "ESG Values", "ESA_Data", 31, 1);
		threadWait(5000);
		selectDropdown("ESA", "Lead_Source","Lead_Source",  "ESG Values", "ESA_Data", 32, 1);
		clickonSave();
		
		//Resolve Lead
		WaitForElement(3000, "ESA", "ResolveLead");
		clickWebelement("ESA", "ResolveLead");
		WaitForElement(3000, "ESA", "Status");
		clickWebelement("ESA", "Status");
		clickWebelement("ESA", "OKButton");
		WaitForElement(3000, "ESA", "ApplicationWait");
		
		//primary TradeAlly Name Change
		scrollToElement("ESA", "PrimaryTradeAlly");
		clickWebelement("ESA", "PrimaryTradeAlly");
		clickWebelement("ESA", "PrimaryTradeAllyName");
		threadWait(2500);
		clickWebelement("ESA", "PrimaryTradeAllyEmployee");
		clickWebelement("ESA", "PrimaryTradeAllySave");
		clickonSave();
	}
	
	public static void Verify_Application_Fields() {
		//Customer Information:
		threadWait(5000);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyAccountNumber",  "ESG Values", "ESA_Data", 36, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyAccountName",  "ESG Values", "ESA_Data", 37, 1);
		
		//Installation Address
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyPremiseID",  "ESG Values", "ESA_Data", 40, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyStreetName",  "ESG Values", "ESA_Data", 41, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyInstallationAddressUnit",  "ESG Values", "ESA_Data", 23, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyCity",  "ESG Values", "ESA_Data", 42, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyState",  "ESG Values", "ESA_Data", 43, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyZipCode",  "ESG Values", "ESA_Data", 44, 1);

		//Applicatiom Information
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyLastName",  "ESG Values", "ESA_Data", 46, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyFirstName",  "ESG Values", "ESA_Data", 47, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyPrimaryPhone",  "ESG Values", "ESA_Data", 48, 1);
		
		//Property Information
		VerifyElementForExistingValueWithText("ESA", "VerifyBuildingType",  "ESG Values", "ESA_Data", 51, 1);
		VerifyElementForExistingValueWithText("ESA", "VerifyOccupancy",  "ESG Values", "ESA_Data", 52, 1);
		
		//Marketing Information
		VerifyElementForExistingValueWithText("ESA", "VerifyLeadSourceCategory",  "ESG Values", "ESA_Data", 55, 1);
		VerifyElementForExistingValueWithText("ESA", "VerifyLeadSource",  "ESG Values", "ESA_Data", 56, 1);
	}
	public static void Update_Fields_After_Resolve_Lead_Completed() {
		
		//General Information Field Update
		//selectDropdown("ESA", "EnrolledInMyAccount",  "ESG Values", "ESA_Data", 59, 1);
		//selectDropdown("ESA", "ReasonForEnrolled",  "ESG Values", "ESA_Data", 60, 1);
		//selectDropdown("ESA", "ESACAM",  "ESG Values", "ESA_Data", 61, 1);
		scrollToElement("ESA", "EnrolledInMyAccount");
		//clickWebelement("ESA", "EnrolledInMyAccount");
		selectDropdown("ESA", "EnrolledInMyAccount","EnrolledInMyAccountSearch",  "ESG Values", "ESA_Data", 59, 1);
		threadWait(2500);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		//clickWebelement("ESA", "ReasonForEnrolled");
		selectDropdown("ESA", "ReasonForEnrolled","ReasonForEnrolledSearch",  "ESG Values", "ESA_Data", 60, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		//clickWebelement("ESA", "ESACAM");
		selectDropdown("ESA", "ESACAM", "ESACAMSearch", "ESG Values", "ESA_Data", 61, 1);
		//clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		
		//Customer Information Field Update
		//selectDropdown("ESA", "62yearsORgreater",  "ESG Values", "ESA_Data", 64, 1);
		//selectDropdown("ESA", "Disabled",  "ESG Values", "ESA_Data", 65, 1);
		//selectDropdown("ESA", "Ethnicity",  "ESG Values", "ESA_Data", 66, 1);
		//selectDropdown("ESA", "CareProgram",  "ESG Values", "ESA_Data", 67, 1);
		scrollToElement("ESA", "62yearsORgreater");
		//clickWebelement("ESA", "62yearsORgreater");
		selectDropdown("ESA", "62yearsORgreater","62yearsORgreaterSearch",  "ESG Values", "ESA_Data", 64, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		//clickWebelement("ESA", "Disabled");
		selectDropdown("ESA", "Disabled","DisabledSearch",  "ESG Values", "ESA_Data", 65, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		//clickWebelement("ESA", "Ethnicity");
		selectDropdown("ESA", "Ethnicity","EthnicitySearch",  "ESG Values", "ESA_Data", 66, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		scrollToElement("ESA", "CareProgram");
		//clickWebelement("ESA", "CareProgram");
		selectDropdown("ESA", "CareProgram","CareProgramSearch",  "ESG Values", "ESA_Data", 67, 1);
		//clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		
		
		
		
		
		//Property Information Field Update
		scrollToElement("ESA", "HOA_Approval_Required");
		//selectDropdown("ESA", "HOA_Approval_Required",  "ESG Values", "ESA_Data", 70, 1);
		//clickWebelement("ESA", "HOA_Approval_Required");
		selectDropdown("ESA", "HOA_Approval_Required","HOA_Approval_RequiredSearch",  "ESG Values", "ESA_Data", 70, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		
		//selectDropdown("ESA", "HOA_Documents_Uploaded",  "ESG Values", "ESA_Data", 71, 1);
		scrollToElement("ESA", "HOA_Documents_Uploaded");
		//clickWebelement("ESA", "HOA_Documents_Uploaded");
		selectDropdown("ESA", "HOA_Documents_Uploaded","HOA_Documents_UploadedSearch",  "ESG Values", "ESA_Data", 71, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdown("ESA", "Working_AC_in_home",  "ESG Values", "ESA_Data", 72, 1);
		scrollToElement("ESA", "Working_AC_in_home");
		//clickWebelement("ESA", "Working_AC_in_home");
		selectDropdown("ESA", "Working_AC_in_home", "Working_AC_in_homeSearch", "ESG Values", "ESA_Data", 72, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdown("ESA", "Access_to_All_Rooms",  "ESG Values", "ESA_Data", 73, 1);
		scrollToElement("ESA", "Access_to_All_Rooms");
		//clickWebelement("ESA", "Access_to_All_Rooms");
		selectDropdown("ESA", "Access_to_All_Rooms", "Access_to_All_RoomsSearch", "ESG Values", "ESA_Data", 73, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdown("ESA", "Cooking_Fuel_Type",  "ESG Values", "ESA_Data", 74, 1);
		scrollToElement("ESA", "Cooking_Fuel_Type");
		//clickWebelement("ESA", "Cooking_Fuel_Type");
		selectDropdown("ESA", "Cooking_Fuel_Type","Cooking_Fuel_TypeSearch",  "ESG Values", "ESA_Data", 74, 1);
		////clickWebelement("ESA", "EnrolledInMyAccountSelect");
		scrollToElement("ESA", "Premise_Square_Footage");
		selectDropdown("ESA", "Premise_Square_Footage", "Premise_Square_Footage",  "ESG Values", "ESA_Data", 75, 1);
		enterTextboxValue("ESA", "Year_Built",  "ESG Values", "ESA_Data", 76, 1);
		//selectDropdown("ESA", "Common_Water_Heater",  "ESG Values", "ESA_Data", 77, 1);
		scrollToElement("ESA", "Common_Water_Heater");
		//clickWebelement("ESA", "Common_Water_Heater");
		selectDropdown("ESA", "Common_Water_Heater","Common_Water_HeaterSearch",  "ESG Values", "ESA_Data", 77, 1);
		//clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdown("ESA", "Common_Space_Heater",  "ESG Values", "ESA_Data", 78, 1);
		scrollToElement("ESA", "Common_Space_Heater");
		//clickWebelement("ESA", "Common_Space_Heater");
		selectDropdown("ESA", "Common_Space_Heater","Common_Space_HeaterSearch",  "ESG Values", "ESA_Data", 78, 1);
		//clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//Space heating Field Update
		//selectDropdown("ESA", "Service_Provider",  "ESG Values", "ESA_Data", 81, 1);
		scrollToElement("ESA", "Service_Provider");
		//clickWebelement("ESA", "Service_Provider");
		selectDropdown("ESA", "Service_Provider","Service_ProviderSearch",  "ESG Values", "ESA_Data", 81, 1);
		//clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdown("ESA", "Fuel_Type",  "ESG Values", "ESA_Data", 82, 1);
		scrollToElement("ESA", "Fuel_Type");
		//clickWebelement("ESA", "Fuel_Type");
		selectDropdown("ESA", "Fuel_Type","Fuel_TypeSearch",  "ESG Values", "ESA_Data", 82, 1);
		//clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//Water heating Field Update
		//selectDropdown("ESA", "ServiceProvider",  "ESG Values", "ESA_Data", 85, 1);
		scrollToElement("ESA", "ServiceProvider");
		//clickWebelement("ESA", "ServiceProvider");
		selectDropdown("ESA", "ServiceProvider","ServiceProviderSearch",  "ESG Values", "ESA_Data", 85, 1);
		//clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdown("ESA", "FuelType",  "ESG Values", "ESA_Data", 86, 1);
		scrollToElement("ESA", "FuelType");
		//clickWebelement("ESA", "FuelType");
		selectDropdown("ESA", "FuelType","FuelTypeSearch",  "ESG Values", "ESA_Data", 86, 1);
		//clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		clickonSave();
	}
	public static void IncomeEligibilityTab() {
		scrollToElement("ESA", "IncomeEligibilty");
		clickWebelement("ESA", "IncomeEligibilty");
		WaitForElement(3000, "ESA", "CategoryRadioButton");
		clickWebelement("ESA", "CategoryRadioButton");
		clearWebelement("ESA", "TotalOccupantsNumber");
		enterTextboxValue("ESA", "TotalOccupantsNumber",  "ESG Values", "ESA_Data", 90, 1);
		clearWebelement("ESA", "AnnualHouseHold");
		enterTextboxValue("ESA",  "AnnualHouseHold", "ESG Values", "ESA_Data", 91, 1);
		clickWebelement("ESA", "CategoryEligibility");
		clickWebelement("ESA", "CategoryEligibilitySelect");
		clickWebelement("ESA", "CategoryEligibilitySelectApplicationRadioButton");
		clickonSave();
	}
	public static void Existing_Equipment_Tab() {
		scrollToElement("ESA", "Existing_Equipment_tab");
		clickWebelement("ESA", "Existing_Equipment_tab");
		WaitForElement(3000, "ESA", "Existing_Equipment_Page_Load");
		
		
		//Central Ac Option
		threadWait(2500);
		if (driver.getPageSource().contains("Central AC")) {
			clickWebelement("ESA", "CentralACLink");
			SwitchToFrame("ESA", "Frame");
			
			
			//clickWebelement("ESA", "OperationalStatus");
			selectDropdown("ESA", "OperationalStatus","OperationalStatus",  "ESG Values", "ESA_Data", 99, 1);
	
			//clickWebelement("ESA", "EnrolledInMyAccountSelect");
			threadWait(2500);
			clickWebelement("ESA", "EquipmentSave");
		//	driver.switchTo().defaultContent();
			
		} else {
			clickWebelement("ESA", "AddEquipmentButton");
			WaitForElement(3000, "ESA", "AddEquipmentPageLoad");
			SwitchToFrame("ESA", "Frame");
			threadWait(2500);
			//clickWebelement("ESA", "EquipmentType");
			selectDropdown("ESA", "EquipmentType","EquipmentTypeSearch",  "ESG Values", "ESA_Data", 97, 1);
			//clickWebelement("ESA", "EnrolledInMyAccountSelect");
			threadWait(2500);
			//selectDropdown("ESA", "OperationalStatus",  "ESG Values", "ESA_Data", 99, 1);
			//clickWebelement("ESA", "OperationalStatus");
			selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 99, 1);
			//clickWebelement("ESA", "EnrolledInMyAccountSelect");
			threadWait(2500);
			clickWebelement("ESA", "EquipmentSave");
		//	driver.switchTo().defaultContent();

		}
		
		//Electric Heater Option
		threadWait(2500);
				if (driver.getPageSource().contains("Electric Heater")) {
					
					clickWebelement("ESA", "ElectricHeaterLink");
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus","OperationalStatusSearch",  "ESG Values", "ESA_Data", 145, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentType");
					selectDropdown("ESA", "EquipmentType","EquipmentTypeSearch",  "ESG Values", "ESA_Data", 143, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					//threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 145, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					//driver.switchTo().defaultContent();
				}
				
				//Clothes Dryer
				threadWait(2500);
				if (driver.getPageSource().contains("Clothes Dryer")) {
					
					clickWebelement("ESA", "ClothesDryerLink");
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName","EquipmentNameSearch",  "ESG Values", "ESA_Data", 108, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus","OperationalStatusSearch",  "ESG Values", "ESA_Data", 109, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus","OwnershipStatusSearch",  "ESG Values", "ESA_Data", 110, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType","EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 111, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider","EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 112, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					enterTextboxValue("ESA","Yearmanufactured",  "ESG Values", "ESA_Data", 113, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentType");
					selectDropdown("ESA", "EquipmentType", "EquipmentTypeSearch", "ESG Values", "ESA_Data", 107, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName","EquipmentNameSearch",  "ESG Values", "ESA_Data", 108, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 109, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus","OwnershipStatusSearch",  "ESG Values", "ESA_Data", 110, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType","EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 111, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider","EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 112, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					enterTextboxValue("ESA", "Yearmanufactured", "ESG Values", "ESA_Data", 113, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();

				}
				
				//Clothes Washer
				threadWait(2500);
				if (driver.getPageSource().contains("Clothes Washer")) {
					clickWebelement("ESA", "ClothesWasherLink");
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName", "EquipmentNameSearch", "ESG Values", "ESA_Data", 118, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus","OperationalStatusSearch",  "ESG Values", "ESA_Data", 119, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus","OwnershipStatusSearch",  "ESG Values", "ESA_Data", 120, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType","EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 121, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider","EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 122, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					enterTextboxValue("ESA",  "Yearmanufactured", "ESG Values", "ESA_Data", 123, 1);
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 124, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EligibilityIssues");
					selectDropdown("ESA", "EligibilityIssues", "EligibilityIssuesSearch",  "ESG Values", "ESA_Data", 126, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					clickWebelement("ESA", "IsGrounded");
					Clear("ESA", "Make");
					selectDropdown("ESA", "Make",  "Make",  "ESG Values", "ESA_Data", 128, 1);
					Clear("ESA", "ModelNumber");
					selectDropdown("ESA", "ModelNumber","ModelNumber",  "ESG Values", "ESA_Data", 129, 1);
					Clear("ESA", "SerialNumber");
					selectDropdown("ESA", "SerialNumber","SerialNumber",  "ESG Values", "ESA_Data", 130, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentType");
					selectDropdown("ESA", "EquipmentType","EquipmentTypeSearch",  "ESG Values", "ESA_Data", 117, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA","EquipmentName", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 118, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus","OperationalStatusSearch",  "ESG Values", "ESA_Data", 119, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA","OwnershipStatus", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 120, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA",  "EquipmentFuelType","EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 121, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 122, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 123, 1);
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA","EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 124, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EligibilityIssues");
					selectDropdown("ESA", "EligibilityIssues", "EligibilityIssuesSearch",  "ESG Values", "ESA_Data", 126, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					clickWebelement("ESA", "IsGrounded");
					//Enter(KeyEvent.VK_TAB);
					//clickWebelement("ESA", "Make");
					Clear("ESA", "Make");
					enterTextboxValue("ESA", "Make",  "ESG Values", "ESA_Data", 128, 1);
					//Enter(KeyEvent.VK_TAB);
					Clear("ESA", "ModelNumber");
					enterTextboxValue("ESA", "ModelNumber",  "ESG Values", "ESA_Data", 129, 1);
					//Enter(KeyEvent.VK_TAB);
					Clear("ESA", "SerialNumber");
					enterTextboxValue("ESA", "SerialNumber",  "ESG Values", "ESA_Data", 130, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					//driver.switchTo().defaultContent();
				}
				//Cooking Appliance
				threadWait(2500);
				if (driver.getPageSource().contains("Cooking Appliance")) {
					clickWebelement("ESA", "CookingApplianceLink");
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 134, 1);
					////clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					////clickWebelement("ESA", "EnrolledInMyAccountSelect");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 135, 1);
					////clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 136, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 137, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 138, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 140, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentType");
					selectDropdown("ESA", "EquipmentType", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 133, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 134, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 135, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 136, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 137, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 138, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 140, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					//driver.switchTo().defaultContent();
				}
				
				//Furnace
				threadWait(2500);
				if (driver.getPageSource().contains("Furnace")) {
					clickWebelement("ESA", "FurnaceLink");
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 153, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 154, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 155, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 156, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 157, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 159, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "FurnaceType");
					selectDropdown("ESA", "FurnaceType", "FurnaceTypeSearch",  "ESG Values", "ESA_Data", 161, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentType");
					selectDropdown("ESA", "EquipmentType", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 152, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 153, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 154, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 155, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 156, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 157, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(3500);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 159, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "FurnaceType");
					selectDropdown("ESA", "FurnaceType", "FurnaceTypeSearch",  "ESG Values", "ESA_Data", 161, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");

				}
				
				//Refrigerator
				threadWait(2500);
				if (driver.getPageSource().contains("Refrigerator")) {
					clickWebelement("ESA", "RefrigeratorLink");
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 164, 1);
					threadWait(3500);
					//Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_DOWN);
					threadWait(2000);
					Enter(KeyEvent.VK_ENTER);
					////clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 166, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 167, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 168, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 169, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					Clear("ESA", "Yearmanufactured");
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 170, 1);
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 171, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "CubicFt");
					selectDropdown("ESA", "CubicFt", "CubicFtSearch",  "ESG Values", "ESA_Data", 173, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "Hinge");
					selectDropdown("ESA", "Hinge", "HingeSearch",  "ESG Values", "ESA_Data", 174, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					clickWebelement("ESA", "IsGrounded");
					Clear("ESA", "RefrigeratorMake");
					enterTextboxValue("ESA", "RefrigeratorMake",  "ESG Values", "ESA_Data", 176, 1);
					Clear("ESA", "RefrigeratorModelNumber");
					enterTextboxValue("ESA", "RefrigeratorModelNumber",  "ESG Values", "ESA_Data", 177, 1);
					threadWait(2500);
					//clickWebelement("ESA", "PrimaryOrSecondary");
					selectDropdown("ESA", "PrimaryOrSecondary", "PrimaryOrSecondarySearch",  "ESG Values", "ESA_Data", 178, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "RefusedReason");
					selectDropdown("ESA", "RefusedReason", "RefusedReasonSearch",  "ESG Values", "ESA_Data", 179, 1);
					////clickWebelement("ESA", "EnrolledInMyAccountSelect");
					enterTextboxValue("ESA", "RefrigeratorSerialNumber",  "ESG Values", "ESA_Data", 180, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");					
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					//clickWebelement("ESA", "EquipmentType");
					selectDropdown("ESA", "EquipmentType", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 164, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 165, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 166, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 167, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 168, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 169, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 170, 1);
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 171, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "CubicFt");
					selectDropdown("ESA", "CubicFt", "CubicFtSearch",  "ESG Values", "ESA_Data", 173, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "Hinge");
					selectDropdown("ESA", "Hinge", "HingeSearch",  "ESG Values", "ESA_Data", 174, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					clickWebelement("ESA", "IsGrounded");
					Clear("ESA", "RefrigeratorMake");
					enterTextboxValue("ESA", "RefrigeratorMake",  "ESG Values", "ESA_Data", 176, 1);
					Clear("ESA", "RefrigeratorModelNumber");
					enterTextboxValue("ESA", "RefrigeratorModelNumber",  "ESG Values", "ESA_Data", 177, 1);
					threadWait(2500);
					//clickWebelement("ESA", "PrimaryOrSecondary");
					selectDropdown("ESA", "PrimaryOrSecondary", "PrimaryOrSecondarySearch",  "ESG Values", "ESA_Data", 178, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "RefusedReason");
					selectDropdown("ESA", "RefusedReason", "RefusedReasonSearch",  "ESG Values", "ESA_Data", 179, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					Clear("ESA", "SerialNumber");
					enterTextboxValue("ESA", "SerialNumber",  "ESG Values", "ESA_Data", 180, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				}
				
				//Water Heater
				threadWait(2500);
				if (driver.getPageSource().contains("Water Heater")) {
					
					clickWebelement("ESA", "WaterHeater");
					SwitchToFrame("ESA", "Frame");
					
					threadWait(3500);
					/*selectDropdown("ESA", "EquipmentName", "EquipmentName",  "ESG Values", "ESA_Data", 183, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);*/
					selectDropdown("ESA", "OperationalStatus", "OperationalStatus",  "ESG Values", "ESA_Data", 185, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					selectDropdown("ESA", "EquipmentName", "EquipmentName",  "ESG Values", "ESA_Data", 183, 1);
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus", "OwnershipStatus",  "ESG Values", "ESA_Data", 186, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType", "EquipmentFuelType",  "ESG Values", "ESA_Data", 187, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProvider",  "ESG Values", "ESA_Data", 188, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//selectDropdown("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 189, 1);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 190, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					selectDropdown("ESA", "WaterHeater_Size", "WaterHeater_Search_Size", "ESG Values", "ESA_Data", 194, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					threadWait(3500);
					clickWebelement("ESA", "EquipmentType");
					
					selectDropdown("ESA", "EquipmentType", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 183, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentName");
					selectDropdown("ESA", "EquipmentName", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 184, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OperationalStatus");
					selectDropdown("ESA", "OperationalStatus", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 185, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "OwnershipStatus");
					selectDropdown("ESA", "OwnershipStatus", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 186, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentFuelType");
					selectDropdown("ESA", "EquipmentFuelType", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 187, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//clickWebelement("ESA", "EquipmentServiceProvider");
					selectDropdown("ESA", "EquipmentServiceProvider", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 188, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//selectDropdown("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 189, 1);
					//clickWebelement("ESA", "EquipmentLocation");
					selectDropdown("ESA", "EquipmentLocation", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 190, 1);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					selectDropdown("ESA", "WaterHeater_Size", "WaterHeater_Search_Size", "ESG Values", "ESA_Data", 194, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");

				}
	}
				public static void Verify_And_Delete_Measures() {
					
					scrollToElement("ESA", "ExistinEquipmentMeasureTab");
					clickWebelement("ESA", "ExistinEquipmentMeasureTab");
					WaitForElement(3000, "ESA", "VerifyESA_HomeEnergyEducation");
					VerifyElementForExistingValueWithText("ESA", "VerifyESA_HomeEnergyEducation", "ESG Values", "ESA_Data", 197, 1);
					VerifyElementForExistingValueWithText("ESA", "VerifyESA_Outreach", "ESG Values", "ESA_Data", 198, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Faucet_Aerator", "ESG Values", "ESA_Data", 199, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_LED_Diffuse_Bulb", "ESG Values", "ESA_Data", 200, 1);
					//VerifyElementForExistingValueWithText("ESA", "Verify_LED_Night_Light", "ESG Values", "ESA_Data", 201, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_LED_Reflector_Bulb", "ESG Values", "ESA_Data", 202, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Smart_Strip1", "ESG Values", "ESA_Data", 203, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Torchiere_Lamp", "ESG Values", "ESA_Data", 204, 1);
					
					clickWebelement("ESA", "Delete_LED_Diffuse_Bulb");
					handlePopup();
					//WaitForElement("ESA", "Delete_LED_Night_Light");
					//clickWebelement("ESA", "Delete_LED_Night_Light");
				//	handlePopup();
					threadWait(5000);
				//	WaitForElement(3000,"ESA", "Delete_LED_Reflector_Bulb");
					clickWebelement("ESA", "Delete_LED_Reflector_Bulb");
					handlePopup();
					threadWait(5000);
				//	WaitForElement(3000,"ESA", "Delete_Torchiere_Lamp");
					clickWebelement("ESA", "Delete_Torchiere_Lamp");
					handlePopup();
					clickonSave();
					
					TrackEnrollmentNumber("ESA", "Enrollment_No", "ESG Values", "ESA_Data", 308, 1);
			}
				
				public static void Add_Measure_Information() {
					/*Search_Enrollment_And_Navigate();
					clickWebelement("ESA", "ApplicationLink");
					scrollToElement("ESA", "ExistinEquipmentMeasureTab");
					clickWebelement("ESA", "ExistinEquipmentMeasureTab");*/
					
					WaitForElement(3000, "ESA", "VerifyESA_HomeEnergyEducation");	
					clickWebelement("ESA", "VerifyESA_HomeEnergyEducation");
					//clearWebelement("ESA", "VerifyESA_HomeEnergyEducation");
					threadWait(2000);
					enterTextboxValue("ESA", "ESA_HomeEnergyEducation", "ESG Values", "ESA_Data", 207, 1);
					clickWebelement("ESA", "AddPart_ESA_HomeEnergyEducation");
					threadWait(5000);
					clickWebelement("ESA", "Water_Education_CheckBox");
					threadWait(2500);
					clickWebelement("ESA", "ESA_Save_Button");
					threadWait(5000);
					clickWebelement("ESA", "MeasureClick");
					//WaitForElement(3000, "ESA", "Water_Education_Click");
					threadWait(2500);
					clickWebelement("ESA", "Water_Education_Click");
					threadWait(2500);
					//clickWebelement("ESA", "Water_Education_Qty");
					enterTextboxValue("ESA", "Water_Education_Qty", "ESG Values", "ESA_Data", 207, 1);
					
					//ESA Outreach & Assessment (EOA)
					
					threadWait(5000);
					clickWebelement("ESA", "ESA_OutreachClick");
					threadWait(2500);
					//clearWebelement("ESA", "ESA_Outreach");
					enterTextboxValue("ESA", "ESA_Outreach", "ESG Values", "ESA_Data", 207, 1);
					threadWait(2500);
					clickWebelement("ESA", "MeasureClick");
					threadWait(2500);
					clickWebelement("ESA", "AddPart_ESA_Outreach");
					threadWait(5000);
					clickWebelement("ESA", "CategoryInpersonCheckBox");
					clickWebelement("ESA", "HomeAssesmentCheckBox");
					clickWebelement("ESA", "ESA_Save_Button");
					threadWait(5000);
					clickWebelement("ESA", "MeasureClick");
					clickWebelement("ESA", "CategoryInPerson_Click");
					threadWait(5000);
					enterTextboxValue("ESA", "CategoryInPerson_Qty", "ESG Values", "ESA_Data", 207, 1);
					threadWait(2500);
					clickWebelement("ESA", "HomeAssesment_Click");
					threadWait(5000);
					enterTextboxValue("ESA", "HomeAssesment_Qty", "ESG Values", "ESA_Data", 207, 1);
					threadWait(2500);
					clickWebelement("ESA", "MeasureClick");
					clickonSave();
					
					//Add Measures 
					clickWebelement("ESA", "AddMeasureButton");
					threadWait(5000);
					clickWebelement("ESA", "AddRefrigerator");
					clickWebelement("ESA", "AddAirSealing");
					clickWebelement("ESA", "AddCaulking");
					clickWebelement("ESA", "AddWeatherstripping");
					clickWebelement("ESA", "AddLowFlowShowerhead");
					clickWebelement("ESA", "AddThermostaticShowerValve");
					clickWebelement("ESA", "AddWaterHeaterBlanket");
					clickWebelement("ESA", "AddWaterHeaterPipeInsulation");
					clickWebelement("ESA", "ESA_Save_Button");
					
					//Update Measure Data in the Grids
					threadWait(10000);
					//WaitForElement(3000, "ESA", "Refrigerator_Click");
					clickWebelement("ESA", "Refrigerator_Click");
					threadWait(3000);
					clickWebelement("ESA", "Refrigerator_Qty");
					enterTextboxValue("ESA", "Refrigerator_Qty", "ESG Values", "ESA_Data", 212, 1);
					threadWait(3000);
					clickWebelement("ESA", "Refrigerator_Hinge");
					enterTextboxValue("ESA", "Refrigerator_Hinge", "ESG Values", "ESA_Data", 213, 1);
					//threadWait(5000);
					//Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "Refrigeator_Planned_Size");
					selectDropdown("ESA", "Refrigeator_Planned_Size", "Refrigeator_Planned_Size", "ESG Values", "ESA_Data", 214, 1);
					//threadWait(3000);
					//Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					
					clickWebelement("ESA", "Air_Sealing_Click");
					threadWait(3000);
					clickWebelement("ESA", "Air_Sealing_Qty");
					enterTextboxValue("ESA", "Air_Sealing_Qty", "ESG Values", "ESA_Data", 216, 1);
					threadWait(3000);
					clickWebelement("ESA", "Air_Sealing_Caulking_Click");
					threadWait(3000);
					//clickWebelement("ESA", "Air_Sealing_Caulking_Qty");
					enterTextboxValue("ESA", "Air_Sealing_Caulking_Qty", "ESG Values", "ESA_Data", 218, 1);
					threadWait(3000);
					clickWebelement("ESA", "Air_Sealing_Caulking_HOA_Status");
					enterTextboxValue("ESA", "Air_Sealing_Caulking_HOA_Status", "ESG Values", "ESA_Data", 219, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					
					//Found a Bug on 48.1 sprint
					/*clickWebelement("ESA", "Air_Sealing_Caulking_Housing_Type");
					enterTextboxValue("ESA", "Air_Sealing_Caulking_Housing_Type", "ESG Values", "ESA_Data", 220, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);*/
					
					scrollToElement("ESA", "WeatherStripping_Click");
					clickWebelement("ESA", "WeatherStripping_Click");
					threadWait(3000);
					clickWebelement("ESA", "WeatherStripping_Qty");
					enterTextboxValue("ESA", "WeatherStripping_Qty", "ESG Values", "ESA_Data", 223, 1);
					threadWait(3000);
					clickWebelement("ESA", "WeatherStripping_HOA_Status");
					enterTextboxValue("ESA", "WeatherStripping_HOA_Status", "ESG Values", "ESA_Data", 224, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "WeatherStripping_Type");
					enterTextboxValue("ESA", "WeatherStripping_Type", "ESG Values", "ESA_Data", 225, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					
					clickWebelement("ESA", "Low_Flow_Showerhead_Click");
					threadWait(3000);
					clickWebelement("ESA", "Low_Flow_Showerhead_Qty");
					enterTextboxValue("ESA", "Low_Flow_Showerhead_Qty", "ESG Values", "ESA_Data", 227, 1);
					threadWait(3000);
					clickWebelement("ESA", "Low_Flow_Showerhead_Type");
					enterTextboxValue("ESA", "Low_Flow_Showerhead_Type", "ESG Values", "ESA_Data", 228, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					scrollToElement("ESA", "Thermostatic_Shower_Valve_Click");
					clickWebelement("ESA", "Thermostatic_Shower_Valve_Click");
					threadWait(3000);
					clickWebelement("ESA", "Thermostatic_Shower_Valve_Qty");
					enterTextboxValue("ESA", "Thermostatic_Shower_Valve_Qty", "ESG Values", "ESA_Data", 230, 1);
					threadWait(3000);
					clickWebelement("ESA", "Water_Heater_Blanket_Click");
					threadWait(3000);
					clickWebelement("ESA", "Water_Heater_Blanket_Qty");
					enterTextboxValue("ESA", "Water_Heater_Blanket_Qty", "ESG Values", "ESA_Data", 232, 1);
					threadWait(3000);
					clickWebelement("ESA", "Water_Heater_Pipe_Insulation_Click");
					threadWait(3000);
					clickWebelement("ESA", "Water_Heater_Pipe_Insulation_Qty");
					enterTextboxValue("ESA", "Water_Heater_Pipe_Insulation_Qty", "ESG Values", "ESA_Data", 234, 1);
					threadWait(3000);
					scrollToElement("ESA", "Faucet_Aerator_Click");
					//Faucet Aerator (ESA10)
					clickWebelement("ESA", "Faucet_Aerator_Click");
					threadWait(5000);
					clickWebelement("ESA", "Faucet_Aerator");
					enterTextboxValue("ESA", "Faucet_Aerator", "ESG Values", "ESA_Data", 207, 1);
					threadWait(2500);
					scrollToElement("ESA", "MeasureClick");
					clickWebelement("ESA", "MeasureClick");
					//Torchiere Lamp (ESA27)
					threadWait(3000);
					scrollToElement("ESA", "Smart_Strip_Click");
					clickWebelement("ESA", "Smart_Strip_Click");
					threadWait(5000);
					clickWebelement("ESA", "Smart_Strip_Qty");
					enterTextboxValue("ESA", "Smart_Strip_Qty", "ESG Values", "ESA_Data", 209, 1);
					threadWait(5000);
					clickWebelement("ESA", "MeasureClick");
					scrollToElement("ESA", "GrantTotal");
					clickWebelement("ESA", "GrantTotal");
					threadWait(3000);
					clickonSave();
					
				}
				public static void Verify_Incentives_Of_Each_Measure() {
					VerifyElementForExistingValueWithText("ESA", "Verify_ESA_Home_Energy_Education_Incentive", "ESG Values", "ESA_Data", 237, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Education_Incentive", "ESG Values", "ESA_Data", 238, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_ESA_Outreach_Assessment_Incentive", "ESG Values", "ESA_Data", 239, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Categorical_Eligibility_Incentive", "ESG Values", "ESA_Data", 240, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Home_Assessment_Incentive", "ESG Values", "ESA_Data", 241, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Refrigerator_Incentive", "ESG Values", "ESA_Data", 242, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Air_Sealing_Education_Incentive", "ESG Values", "ESA_Data", 243, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Caulking_Incentive", "ESG Values", "ESA_Data", 244, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Weatherstripping_Incentive", "ESG Values", "ESA_Data", 245, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Faucet_Aerator_Incentive", "ESG Values", "ESA_Data", 246, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Low_Flow_Showerhead_Incentive", "ESG Values", "ESA_Data", 247, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Torchiere_Lamp_Incentive", "ESG Values", "ESA_Data", 248, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Thermostatic_Shower_Valve_Incentive", "ESG Values", "ESA_Data", 249, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Heater_lanket_Incentive", "ESG Values", "ESA_Data", 250, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Heater_Pipe_Insulation_Incentive", "ESG Values", "ESA_Data", 251, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Heater_lanket_Incentive", "ESG Values", "ESA_Data", 252, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Heater_Pipe_Insulation_Incentive", "ESG Values", "ESA_Data", 253, 1);
					clickonProcess();
					//handlePopup();
				}
				public static void Process_Application() {
					clickWebelement("ESA", "ApplicationLink");
					clickonProcess();
					//handlePopup();
					//Verify steps are created after processing the application
					VerifyElementForExistingValueWithText("ESA", "Verify_Installation_Electric_Appliance_Step", "ESG Values", "ESA_Data", 256, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Installation_Weatherization_Step", "ESG Values", "ESA_Data", 257, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_NGAT_Step", "ESG Values", "ESA_Data", 258, 1);
					
					//Verify TradeAlly Name
					VerifyElementForExistingValueWithText("ESA", "Verify_Installation_Electric_Appliance_TradeAlly", "ESG Values", "ESA_Data", 261, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Installation_Weatherization_TradeAlly", "ESG Values", "ESA_Data", 262, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_NGAT_TradeAlly", "ESG Values", "ESA_Data", 263, 1);
	
				}
				public static void Installation_Weatherization_Workflow_Step() {
					Search_Enrollment_And_Navigate();
					
					clickWebelement("ESA", "Installation_Weatherization_Step");
					threadWait(3000);
					scrollToElement("ESA", "Contact_Attempt_Tab");
					clickWebelement("ESA", "Contact_Attempt_Tab");
					implicitlywait(3000);
					clickWebelement("ESA", "Contact_Attmept_New_button");
					ContactDate();
					clickWebelement("ESA", "ContactTime");
					clickWebelement("ESA", "ContactTimeSelect");
					threadWait(2500);
					enterTextboxValue("ESA", "ContactType", "ESG Values", "ESA_Data", 267, 1);
					enterTextboxValue("ESA", "CommentBox", "ESG Values", "ESA_Data", 268, 1);
					clickWebelement("ESA", "ApplyButton");
					threadWait(2500);
					clickonclose();
					scrollToElement("ESA", "WorkflowstepTab");
					clickWebelement("ESA", "WorkflowstepTab");
					SchedulingDate();
					clickWebelement("ESA", "StartTime");
					clickWebelement("ESA", "StartTimeSelect");
					//clickWebelement("ESA", "DurationTimeClick");
					selectDropdown("ESA", "DurationTimeClick", "DUrationTimeSearch", "ESG Values", "ESA_Data", 272, 1);
					//Enter(KeyEvent.VK_DOWN);
					threadWait(2000);
					Enter(KeyEvent.VK_ENTER);
					clickonSave();
					
					//Enter Visitor Information
					selectDropdown("ESA", "AssignTo","AssignTo", "ESG Values", "ESA_Data", 275, 1);
					threadWait(7000);
					clickWebelement("ESA", "EmployeeName");
					selectDropdown("ESA", "Employee_SearchBox", "Employee_SearchBox","ESG Values", "ESA_Data", 276, 1);
					Enter(KeyEvent.VK_ENTER);
					threadWait(3000);
					selectActualVisitDate();
					
					//Buildidng Information
					//scrollToElement("ESA", "CommonWaterHeater");
					//selectDropdown("ESA", "CommonWaterHeater", "ESG Values", "ESA_Data", 279, 1);
					selectDropdown("ESA", "AccessToAllRooms","AccessToAllRooms", "ESG Values", "ESA_Data", 280, 1);
					VerifyElementForExistingValueWithText("ESA", "SpaceHeatingFuelValidation", "ESG Values", "ESA_Data", 281, 1);
					VerifyElementForExistingValueWithText("ESA", "Water_Heating_Fuel_Type_Validation", "ESG Values", "ESA_Data", 282, 1);
					clickonSave();
					
					//Update Measure in the Grid
					threadWait(5000);
					scrollToElement("ESA", "Weatherization_Update_Measures_grid_GrandTotal");
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Air_Sealing_ESA01");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Air_Sealing_Qty");
					enterTextboxValue("ESA", "Weatherization_Update_Measures_grid_Air_Sealing_Qty", "ESG Values", "ESA_Data", 285, 1);
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Caulking_N505");
					enterTextboxValue("ESA", "Weatherization_Update_Measures_grid_Caulking_Qty", "ESG Values", "ESA_Data", 286, 1);
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_AirSealing_HOA_Status");
					//Clear("ESA", "Weatherization_Update_Measures_grid_AirSealing_HOA_Status");
					/*enterTextboxValue("ESA", "Weatherization_Update_Measures_grid_AirSealing_HOA_Status", "ESG Values", "ESA_Data", 287, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_AirSealing_Housing_Type");
					//Clear("ESA", "Weatherization_Update_Measures_grid_AirSealing_Housing_Type");
					enterTextboxValue("ESA", "Weatherization_Update_Measures_grid_AirSealing_Housing_Type", "ESG Values", "ESA_Data", 288, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);*/
					
					scrollToElement("ESA", "Weatherization_Update_Measures_grid_GrandTotal");
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Weatherstripping");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Weatherstripping_select_NFC");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Select_SafetyHazard");
					//enterTextboxValue("ESA", "WeatherStripping_Qty", "ESG Values", "ESA_Data", 223, 1);
					threadWait(3000);
					/*clickWebelement("ESA", "Weatherization_Update_Measures_grid_WeatherStripping_HOA_Status");
					//Clear("ESA", "Weatherization_Update_Measures_grid_WeatherStripping_HOA_Status");
					enterTextboxValue("ESA", "Weatherization_Update_Measures_grid_WeatherStripping_HOA_Status", "ESG Values", "ESA_Data", 290, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_WeatherStripping_Type");
					//Clear("ESA", "Weatherization_Update_Measures_grid_WeatherStripping_Type");
					enterTextboxValue("ESA", "Weatherization_Update_Measures_grid_WeatherStripping_Type", "ESG Values", "ESA_Data", 291, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);*/
					
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Faucet_Aerator");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Faucet_Aerator_Select_NFC");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Select_SafetyHazard");
					//enterTextboxValue("ESA", "Low_Flow_Showerhead_Qty", "ESG Values", "ESA_Data", 227, 1);
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Low_Flow_Showerhead");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Low_Flow_Showerhead_Select_NFC");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Select_SafetyHazard");
					//enterTextboxValue("ESA", "Low_Flow_Showerhead_Qty", "ESG Values", "ESA_Data", 227, 1);
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Thermostatic_Shower_Valve");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Thermostatic_Shower_Valve_Select_NFC");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Select_SafetyHazard");
					//enterTextboxValue("ESA", "Low_Flow_Showerhead_Qty", "ESG Values", "ESA_Data", 227, 1);
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Water_Heater_Blanket");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Water_Heater_Blanket_Select_NFC");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Select_CustomerRefusedMeasure");
					//enterTextboxValue("ESA", "Low_Flow_Showerhead_Qty", "ESG Values", "ESA_Data", 227, 1);
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Water_Heater_Pipe_Insulation");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Water_Heater_Pipe_Insulation_Select_NFC");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Select_CustomerRefusedMeasure");
					//enterTextboxValue("ESA", "Low_Flow_Showerhead_Qty", "ESG Values", "ESA_Data", 227, 1);
					threadWait(3000);
					
					
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_AirSealing_Add_Part");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Add_Outlet_Gaskets_N516");
					threadWait(3000);
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Save_Part_AirSealing");
					threadWait(3000);
					
					
					scrollToElement("ESA", "Weatherization_Update_Measures_grid_Outlet_Gaskets");
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_Outlet_Gaskets");
					threadWait(3000);
					enterTextboxValue("ESA", "Weatherization_Update_Measures_grid_Outlet_Gaskets_IQty", "ESG Values", "ESA_Data", 297, 1);
					threadWait(3000);
					
					clickWebelement("ESA", "Weatherization_Update_Measures_grid_GrandTotal");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "Weatherization_Update_Measures_grid_GrandTotal", "ESG Values", "ESA_Data", 298, 1);
					VerifyElementForExistingValueWithText("ESA", "Weatherization_Workflow_Step_Summary_Incentive", "ESG Values", "ESA_Data", 299, 1);
					clickonSave();
					threadWait(5000);
					
					//Upload Required Document
					scrollToElement("ESA", "Navigate_Document_Tab");
					clickWebelement("ESA", "Navigate_Document_Tab");
					threadWait(3000);
					clickWebelement("ESA", "Required_Document_EditIcon");
					SwitchToFrame("ESA", "Upload_Document_Frame");
					WaitForElement(3000, "ESA", "Verify_Upload_a_New_Document");
					
					clickWebelement("ESA", "Click_On_UploadButton");
					
					try {
						UploadFile("ESA", "Upload_File_Path");
					} catch (AWTException e) {
						System.out.println("File was not uploaded");
					}
					threadWait(3000);
					driver.switchTo().defaultContent();
					threadWait(3000);
					clickWebelement("ESA", "Save_Document");
					threadWait(3000);
					SwitchToFrame("ESA", "Upload_Document_Frame");
					if (Xpath("ESA", "Select_Replace_Existing_File").isDisplayed()) {
						driver.switchTo().defaultContent();
						clickWebelement("ESA", "Click_On_CloseButton");
					} 
					
					scrollToElement("ESA", "WorkflowstepTab");
					clickWebelement("ESA", "WorkflowstepTab");
					
					clickonProcess();
					
				}
				
				public static void NGAT_Workflow_Step() {
					clickWebelement("ESA", "Access_NGAT_Step");
					
					//Visit Information
					clickWebelement("ESA", "EmployeeName");
					enterTextboxValue("ESA", "Employee_SearchBox", "ESG Values", "ESA_Data", 276, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_ENTER);
					threadWait(3000);
					selectActualVisitDate();
					
					//Ambient Test
					enterTextboxValue("ESA", "NGAT_InsideAmbientRead", "ESG Values", "ESA_Data", 302, 1);
					clickWebelement("ESA", "NGAT_AmbientOutcome");
					clickWebelement("ESA", "NGAT_AmbientOutcome_SelectPass");
					VerifyElementForExistingValueWithText("ESA", "Verify_OccupancyStatus", "ESG Values", "ESA_Data", 304, 1);
					clickonSave();
					
					//Equipment_ClothesDryer
					scrollToElement("ESA", "NGAT_Equipment_ClothesWasher");
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer", "ESG Values", "ESA_Data", 311, 1);
					clickWebelement("ESA", "NGAT_Verify_Equipment_ClothesDryer");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_OpStatus", "ESG Values", "ESA_Data", 312, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_FuelType", "ESG Values", "ESA_Data", 314, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_Ownership", "ESG Values", "ESA_Data", 313, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_ServiceProvider", "ESG Values", "ESA_Data", 315, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_YearManufactured", "ESG Values", "ESA_Data", 316, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_Location", "ESG Values", "ESA_Data", 317, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_ExistingEquipmentComments", "ESG Values", "ESA_Data", 318, 1);
					
					selectDropdown("ESA", "NGAT_Equipment_ClothesDryer_COTestResults", "ClothesDryer_COTestResults", "ESG Values", "ESA_Data", 319, 1);
					clickWebelement("ESA", "NGAT_Equipment_ClothesDryer_Disposition");
					threadWait(1000);
					clickWebelement("ESA", "NGAT_Equipment_Disposition_SelectPass");
					
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_Tagged", "ESG Values", "ESA_Data", 321, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_Capped", "ESG Values", "ESA_Data", 322, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_Equipment_ClothesDryer_ShutOff", "ESG Values", "ESA_Data", 323, 1);
					
					clickWebelement("ESA", "NGAT_Equipment_ClothesDryer_RecommendedWork");
					threadWait(1000);
					clickWebelement("ESA", "NGAT_Equipment_RecommendedWork_SelectNone");
					
					//Equipment ClothesWasher
					scrollToElement("ESA", "NGAT_Equipment_CookingAppliance");
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher", "ESG Values", "ESA_Data", 327, 1);
					clickWebelement("ESA", "NGAT_Equipment_ClothesWasher");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_OpStatus", "ESG Values", "ESA_Data", 328, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_FuelType", "ESG Values", "ESA_Data", 330, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_Ownership", "ESG Values", "ESA_Data", 329, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_ServiceProvider", "ESG Values", "ESA_Data", 331, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_YearManufactured", "ESG Values", "ESA_Data", 332, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_Location", "ESG Values", "ESA_Data", 333, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_ExistingEquipmentComments", "ESG Values", "ESA_Data", 334, 1);
					
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_EligibilityIssues", "ESG Values", "ESA_Data", 335, 1);
					//Need to Update checkbox velidation
					//VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_YearManufactured", "ESG Values", "ESA_Data", 241, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_Make", "ESG Values", "ESA_Data", 336, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_ModelNumber", "ESG Values", "ESA_Data", 337, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_SerialNumber", "ESG Values", "ESA_Data", 338, 1);
					
					selectDropdown("ESA", "NGAT_Equipment_ClothesWasher_COTestResults","ClothesWasher_COTestResults", "ESG Values", "ESA_Data", 339, 1);
					clickWebelement("ESA", "NGAT_Equipment_ClothesWasher_Disposition");
					threadWait(1000);
					clickWebelement("ESA", "NGAT_Equipment_Disposition_SelectPass");
					
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_Tagged", "ESG Values", "ESA_Data", 341, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_Capped", "ESG Values", "ESA_Data", 342, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_ClothesWasher_ShutOff", "ESG Values", "ESA_Data", 343, 1);
					
					clickWebelement("ESA", "NGAT_Equipment_ClothesWasher_RecommendedWork");
					threadWait(1000);
					clickWebelement("ESA", "NGAT_Equipment_RecommendedWork_SelectNone");
					
					//Equipment Cooking Appliance
					scrollToElement("ESA", "NGAT_Equipment_CookingAppliance");
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance", "ESG Values", "ESA_Data", 347, 1);
					clickWebelement("ESA", "NGAT_Equipment_CookingAppliance");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_OpStatus", "ESG Values", "ESA_Data", 348, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_FuelType", "ESG Values", "ESA_Data", 350, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_Ownership", "ESG Values", "ESA_Data", 349, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_ServiceProvider", "ESG Values", "ESA_Data", 351, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_YearManufactured", "ESG Values", "ESA_Data", 352, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_Location", "ESG Values", "ESA_Data", 353, 1);
					
					selectDropdown("ESA", "NGAT_Equipment_CookingAppliance_COTestResults","CookingAppliance_COTestResults", "ESG Values", "ESA_Data", 354, 1);
					clickWebelement("ESA", "NGAT_Equipment_CookingAppliance_Disposition");
					threadWait(1000);
					clickWebelement("ESA", "NGAT_Equipment_Disposition_SelectPass");
					
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_Tagged", "ESG Values", "ESA_Data", 356, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_Capped", "ESG Values", "ESA_Data", 357, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_CookingAppliance_ShutOff", "ESG Values", "ESA_Data", 358, 1);
					
					clickWebelement("ESA", "NGAT_Equipment_CookingAppliance_RecommendedWork");
					threadWait(1000);
					clickWebelement("ESA", "NGAT_Equipment_RecommendedWork_SelectNone");
					
					//Equipment Furnace
					scrollToElement("ESA", "NGAT_Equipment_Furnace");
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace", "ESG Values", "ESA_Data", 362, 1);
					clickWebelement("ESA", "NGAT_Equipment_Furnace");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_OpStatus", "ESG Values", "ESA_Data", 363, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_FuelType", "ESG Values", "ESA_Data", 365, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_Ownership", "ESG Values", "ESA_Data", 364, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_ServiceProvider", "ESG Values", "ESA_Data", 366, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_YearManufactured", "ESG Values", "ESA_Data", 367, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_Location", "ESG Values", "ESA_Data", 368, 1);
					
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_DualFurnace_ACSystem", "ESG Values", "ESA_Data", 369, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_Make", "ESG Values", "ESA_Data", 370, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_Model", "ESG Values", "ESA_Data", 371, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_Type", "ESG Values", "ESA_Data", 372, 1);
					
					WebElement Furnace_COTestResults = Xpath("ESA", "NGAT_Equipment_Furnace_COTestResults");
					WebElement Furnace_Disposition = Xpath("ESA", "NGAT_Equipment_Furnace_Disposition");
					
					if (Furnace_COTestResults.isDisplayed() && Furnace_COTestResults.isEnabled()) {
						System.out.println("Furnace CO Test Result field is Enable");
						test.log(LogStatus.FAIL, "Furnace CO Test Result field is Enable");
					} else {
						System.out.println("Furnace CO Test Result field is Disable");
						test.log(LogStatus.PASS, "Furnace CO Test Result field is Disable");
					}
					if (Furnace_Disposition.isDisplayed() && Furnace_Disposition.isSelected()) {
						System.out.println("Furnace Disposition field is Enable");
						test.log(LogStatus.FAIL, "Furnace Disposition field is Enable");
					} else {
						System.out.println("Furnace Disposition field is Disable");
						test.log(LogStatus.PASS, "Furnace Disposition field is Disable");
					}
					
					
					
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_Tagged", "ESG Values", "ESA_Data", 375, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_Capped", "ESG Values", "ESA_Data", 376, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_Furnace_ShutOff", "ESG Values", "ESA_Data", 377, 1);
					
					clickWebelement("ESA", "NGAT_Equipment_Furnace_RecommendedWork");
					threadWait(1000);
					clickWebelement("ESA", "Equipment_RecommendedWork_Select_NeedReplacement");
					clickWebelement("ESA", "NGAT_Equipment_Furnace_NGATComment");
					enterTextboxValue("ESA", "NGAT_Equipment_Furnace_NGATComment", "ESG Values", "ESA_Data", 379, 1);
					clickWebelement("ESA", "NGAT_Equipment_Furnace_AddMeasure");
					threadWait(2000);
					clickWebelement("ESA", "NGAT_Equipment_Furnace_SelectMeasure_ESA12a");
					clickWebelement("ESA", "NGAT_Equipment_SaveMeasure");
					
					
					
					threadWait(5000);
					clickWebelement("ESA", "NGAT_Equipment_Furnace_Click_On_FurnaceESA12a");
					threadWait(3000);
					/*clickWebelement("ESA", "NGAT_Equipment_Furnace_PQty_ESA12a");
					threadWait(2000);
					clearWebelement("ESA", "NGAT_Equipment_Furnace_PQty_ESA12a");
					enterTextboxValue("ESA", "NGAT_Equipment_Furnace_PQty_ESA12a", "ESG Values", "ESA_Data", 381, 1);*/
					clickWebelement("ESA", "NGAT_Equipment_Furnace_DuctLeakage_CFM_ESA12a");
					enterTextboxValue("ESA", "NGAT_Equipment_Furnace_DuctLeakage_CFM_ESA12a", "ESG Values", "ESA_Data", 382, 1);
					
					clickWebelement("ESA", "NGAT_Equipment_Furnace_FurnacePrice_ESA12a");
					enterTextboxValue("ESA", "NGAT_Equipment_Furnace_FurnacePrice_ESA12a", "ESG Values", "ESA_Data", 383, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "NGAT_Equipment_Furnace_Type_ESA12a");
					enterTextboxValue("ESA", "NGAT_Equipment_Furnace_Type_ESA12a", "ESG Values", "ESA_Data", 384, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					
					//Equipment Water Heater
					scrollToElement("ESA", "NGAT_Equipment_WaterHeater");
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater", "ESG Values", "ESA_Data", 387, 1);
					clickWebelement("ESA", "NGAT_Equipment_WaterHeater");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_OpStatus", "ESG Values", "ESA_Data", 388, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_FuelType", "ESG Values", "ESA_Data", 390, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_Ownership", "ESG Values", "ESA_Data", 389, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_ServiceProvider", "ESG Values", "ESA_Data", 391, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_YearManufactured", "ESG Values", "ESA_Data", 392, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_Location", "ESG Values", "ESA_Data", 393, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_ExistingEquipmentComments", "ESG Values", "ESA_Data", 394, 1);
					
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_Make", "ESG Values", "ESA_Data", 395, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_Model", "ESG Values", "ESA_Data", 396, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_Size", "ESG Values", "ESA_Data", 397, 1);
					
					WebElement WaterHeater_COTestResults = Xpath("ESA", "NGAT_Equipment_WaterHeater_COTestResults");
					WebElement WaterHeater_Disposition = Xpath("ESA", "NGAT_Equipment_WaterHeater_Disposition");
					if (WaterHeater_COTestResults.isDisplayed() && WaterHeater_COTestResults.isEnabled()) {
						System.out.println("WaterHeater CO Test Result field is Enable");
						test.log(LogStatus.FAIL, "WaterHeater CO Test Result field is Enable");
					} else {
						System.out.println("WaterHeater CO Test Result field is Disable");
						test.log(LogStatus.PASS, "WaterHeater CO Test Result field is Disable");
					}
					if (WaterHeater_Disposition.isDisplayed() && WaterHeater_Disposition.isSelected()) {
						System.out.println("WaterHeater Disposition field is Enable");
						test.log(LogStatus.FAIL, "WaterHeater Disposition field is Enable");
					} else {
						System.out.println("WaterHeater Disposition field is Disable");
						test.log(LogStatus.PASS, "WaterHeater Disposition field is Disable");
					}
					
					
					
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_Tagged", "ESG Values", "ESA_Data", 400, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_Capped", "ESG Values", "ESA_Data", 401, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Equipment_WaterHeater_ShutOff", "ESG Values", "ESA_Data", 402, 1);
					clickWebelement("ESA", "NGAT_Equipment_WaterHeater_RecommendedWork");
					threadWait(1000);
					clickWebelement("ESA", "Equipment_RecommendedWork_Select_NeedReplacement");
					clickWebelement("ESA", "NGAT_Equipment_WaterHeater_NGATComment");
					enterTextboxValue("ESA", "NGAT_Equipment_WaterHeater_NGATComment", "ESG Values", "ESA_Data", 404, 1);
					clickWebelement("ESA", "NGAT_Equipment_WaterHeater_AddMeasure");
					threadWait(2000);
					clickWebelement("ESA", "NGAT_Equipment_WaterHeater_SelectMeasure_ESA31a");
					clickWebelement("ESA", "NGAT_Equipment_SaveMeasure");
					threadWait(5000);
					scrollToElement("ESA", "NGAT_Equipment_WaterHeater_Click_On_ESA31a");
					
					clickWebelement("ESA", "NGAT_Equipment_WaterHeater_Click_On_ESA31a");
					threadWait(2000);
					/*clickWebelement("ESA", "NGAT_Equipment_WaterHeater_PQty_ESA31a");
					threadWait(2000);
					clearWebelement("ESA", "NGAT_Equipment_WaterHeater_PQty_ESA31a");
					enterTextboxValue("ESA", "NGAT_Equipment_WaterHeater_PQty_ESA31a", "ESG Values", "ESA_Data", 407, 1);
					clickWebelement("ESA", "NGAT_Equipment_WaterHeater_Amountof_NonStandard_ESA31a");
					enterTextboxValue("ESA", "NGAT_Equipment_WaterHeater_Amountof_NonStandard_ESA31a", "ESG Values", "ESA_Data", 408, 1);*/
					
					threadWait(3000);
					clickWebelement("ESA", "NGAT_Equipment_WaterHeater_Size_ESA31a");
					enterTextboxValue("ESA", "NGAT_Equipment_WaterHeater_Size_ESA31a", "ESG Values", "ESA_Data", 409, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					
					//Complete Fees
					scrollToElement("ESA", "NGAT_TotalAmount");
					clickWebelement("ESA", "NGAT_Click_On_Fees");
					clickWebelement("ESA", "NGAT_Fee_N0530");
					threadWait(2000);
					clickWebelement("ESA", "Enable_Charged_NGAT_Fee_N0530");
					clickWebelement("ESA", "NGAT_Click_On_Fees");
					
					clickonSave();
					
					//Verify Amount
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "NGAT_TotalAmount", "ESG Values", "ESA_Data", 243, 1);
					scrollToElement("ESA", "NGAT_Verify_WorkflowStepSummary_FeeCost");
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_WorkflowStepSummary_MinorRepairCosts", "ESG Values", "ESA_Data", 243, 1);
					VerifyElementForExistingValueWithText("ESA", "NGAT_Verify_WorkflowStepSummary_FeeCost", "ESG Values", "ESA_Data", 243, 1);
					
					TrackEnrollmentNumber("ESA", "Enrollment_No", "ESG Values", "ESA_Data", 308, 1);
					
					clickonProcess();
					
				}
				
				
				public static void Gas_Equipment_Work_Authorization_Workflow_Step() {
					//Visit Information
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Verify_TradeAlly", "ESG Values", "ESA_Data", 411, 1);
					clickWebelement("ESA", "Access_GasEquipmentWorkAuthorization_Step");
					
					clickWebelement("ESA", "EmployeeName");
					enterTextboxValue("ESA", "Employee_SearchBox", "ESG Values", "ESA_Data", 412, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_ENTER);
					threadWait(3000);
					selectActualVisitDate();
					
					//Ambient Test
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_InsideAmbientRead", "ESG Values", "ESA_Data", 302, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_AmbientOutcome", "ESG Values", "ESA_Data", 303, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_OccupancyStatus", "ESG Values", "ESA_Data", 304, 1);
					clickonSave();
					
					//Equipment Furnace
					scrollToElement("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace");
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace", "ESG Values", "ESA_Data", 362, 1);
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_OpStatus", "ESG Values", "ESA_Data", 363, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_FuelType", "ESG Values", "ESA_Data", 365, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Ownership", "ESG Values", "ESA_Data", 364, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_ServiceProvider", "ESG Values", "ESA_Data", 366, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_YearManufactured", "ESG Values", "ESA_Data", 367, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Location", "ESG Values", "ESA_Data", 368, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_COTestResults", "ESG Values", "ESA_Data", 373, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Disposition", "ESG Values", "ESA_Data", 374, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Tagged", "ESG Values", "ESA_Data", 375, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Capped", "ESG Values", "ESA_Data", 376, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_ShutOff", "ESG Values", "ESA_Data", 377, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Reason", "ESG Values", "ESA_Data", 380, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_RecommendedWork", "ESG Values", "ESA_Data", 378, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_ApprovedWork", "ESG Values", "ESA_Data", 378, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_NGATComment", "ESG Values", "ESA_Data", 379, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_PQty_ESA12a", "ESG Values", "ESA_Data", 381, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_ApprovedQty_ESA12a", "ESG Values", "ESA_Data", 381, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_DuctLeakage_ESA12a", "ESG Values", "ESA_Data", 382, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_FurnacePrice_ESA12a", "ESG Values", "ESA_Data", 383, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Type_ESA12a", "ESG Values", "ESA_Data", 384, 1);
			
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_ApprovedWork");
					threadWait(1000);
					clickWebelement("ESA", "Equipment_RecommendedWork_Select_NeedReplacement");
					
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_TradeAlly");
					threadWait(1000);
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_TradeAlly_Select_JerrysHeating_AirConditioning");
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Employee");
					threadWait(1000);
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_Employee_Select_NormBlair");
					
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_AuthorizationComments");
					enterTextboxValue("ESA", "GasEquipmentWorkAuthorization_Equipment_Furnace_AuthorizationComments", "ESG Values", "ESA_Data", 417, 1);
					
					
					//Equipment Water Heater
					scrollToElement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater");
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater", "ESG Values", "ESA_Data", 387, 1);
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_OpStatus", "ESG Values", "ESA_Data", 388, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_FuelType", "ESG Values", "ESA_Data", 390, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Ownership", "ESG Values", "ESA_Data", 389, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_ServiceProvider", "ESG Values", "ESA_Data", 391, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_YearManufactured", "ESG Values", "ESA_Data", 392, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Location", "ESG Values", "ESA_Data", 393, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_COTestResults", "ESG Values", "ESA_Data", 398, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Disposition", "ESG Values", "ESA_Data", 399, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Tagged", "ESG Values", "ESA_Data", 400, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Capped", "ESG Values", "ESA_Data", 401, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_ShutOff", "ESG Values", "ESA_Data", 402, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Reason", "ESG Values", "ESA_Data", 405, 1);
					
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_RecommendedWork", "ESG Values", "ESA_Data", 403, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_ApprovedWork", "ESG Values", "ESA_Data", 403, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_NGATComment", "ESG Values", "ESA_Data", 404, 1);
					
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_ApprovedWork");
					threadWait(1000);
					clickWebelement("ESA", "Equipment_RecommendedWork_Select_NeedReplacement");
					
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_TradeAlly");
					threadWait(1000);
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_TradeAlly_Select_JerrysHeating_AirConditioning");
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Employee");
					threadWait(1000);
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Employee_Select_NormBlair");
					
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_AuthorizationComments");
					enterTextboxValue("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_AuthorizationComments", "ESG Values", "ESA_Data", 423, 1);
					
					clickWebelement("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Click_On_ESA31a");
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_PQty_ESA31a", "ESG Values", "ESA_Data", 407, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_ApprovedQty_ESA31a", "ESG Values", "ESA_Data", 407, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Amountof_NonStandard_ESA31a", "ESG Values", "ESA_Data", 408, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkAuthorization_Equipment_WaterHeater_Size_ESA31a", "ESG Values", "ESA_Data", 409, 1);
						
					clickonSave();
					
					clickonProcess();
					
				}
				
				public static void Gas_Equipment_Work_Results_Workflow_Step() {
					//Visit Information
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_TradeAlly", "ESG Values", "ESA_Data", 426, 1);
					clickWebelement("ESA", "GasEquipmentWorkResults_Step");
					
						selectActualVisitDate();
					
					//Gas-Equipment Work Results Equipment Furnace
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace", "ESG Values", "ESA_Data", 362, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_OpStatus", "ESG Values", "ESA_Data", 363, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_FuelType", "ESG Values", "ESA_Data", 365, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_Ownership", "ESG Values", "ESA_Data", 364, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_ServiceProvider", "ESG Values", "ESA_Data", 366, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_YearManufactured", "ESG Values", "ESA_Data", 367, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_Location", "ESG Values", "ESA_Data", 368, 1);

					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_NGATComment", "ESG Values", "ESA_Data", 379, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_AuthorizationComments", "ESG Values", "ESA_Data", 417, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_PQty_ESA12a", "ESG Values", "ESA_Data", 381, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_IQty_ESA12a", "ESG Values", "ESA_Data", 381, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_DuctLeakage_ESA12a", "ESG Values", "ESA_Data", 382, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_FurnacePrice_ESA12a", "ESG Values", "ESA_Data", 383, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_Type_ESA12a", "ESG Values", "ESA_Data", 384, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_Furnace_IncentiveAmount", "ESG Values", "ESA_Data", 430, 1);
			
					scrollToElement("ESA", "GasEquipmentWorkResults_Equipment_Furnace");
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_Furnace");
					threadWait(3000);
					
					scrollToElement("ESA", "GasEquipmentWorkResults_Equipment_Furnace_ClickOnResults");
					threadWait(2000);
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_Furnace_ClickOnResults");
					clickWebelement("ESA", "ESA_Equipment_Results_Select_Replaced");
					
					scrollToElement("ESA", "GasEquipmentWorkResults_Equipment_Furnace_Click_On_AddImage_FurnaceESA12a");		
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_Furnace_Click_On_AddImage_FurnaceESA12a");
					
					//WaitForElement(3000, "ESA", "ESA_Equipment_Furnace_ESA12a_Select_CODetector_WX003");
					threadWait(5000);
					
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_Select_CODetector_WX003");
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_Select_FurnaceFilter_FRR11");
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_Select_MajorRepair_FRR30");
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_Select_PermitFee_P010a");
					
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_SaveButton");
					threadWait(5000);
					
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_ClickOn_CODetector_WX003");
					enterTextboxValue("ESA", "ESA_Equipment_Furnace_ESA12a_Select_CODetector_WX003_IQty", "ESG Values", "ESA_Data", 432, 1);
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_ClickOn_FurnaceFilter_FRR11");
					enterTextboxValue("ESA", "ESA_Equipment_Furnace_ESA12a_Select_FurnaceFilter_FRR11_IQty", "ESG Values", "ESA_Data", 433, 1);
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_ClickOn_MajorRepair_FRR30");
					enterTextboxValue("ESA", "ESA_Equipment_Furnace_ESA12a_Select_MajorRepair_FRR30_IQty", "ESG Values", "ESA_Data", 434, 1);
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_ClickOn_PermitFee_P010a");
					enterTextboxValue("ESA", "ESA_Equipment_Furnace_ESA12a_Select_PermitFee_P010a_IQty", "ESG Values", "ESA_Data", 435, 1);
					
					
					
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_ClickOn_MajorRepair_FRR30");
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_Select_MajorRepair_FRR30_IncentiveAmount");
					enterTextboxValue("ESA", "ESA_Equipment_Furnace_ESA12a_Select_MajorRepair_FRR30_IncentiveAmount", "ESG Values", "ESA_Data", 438, 1);
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_ClickOn_PermitFee_P010a");			
					clickWebelement("ESA", "ESA_Equipment_Furnace_ESA12a_Select_PermitFee_P010a_IncentiveAmount");
					enterTextboxValue("ESA", "ESA_Equipment_Furnace_ESA12a_Select_PermitFee_P010a_IncentiveAmount", "ESG Values", "ESA_Data", 439, 1);
					
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_Furnace_Click_Outside_of_Grid");
					threadWait(2000);
					
					VerifyElementForExistingValueWithText("ESA", "ESA_Equipment_Furnace_ESA12a_Select_CODetector_WX003_IncentiveAmount", "ESG Values", "ESA_Data", 436, 1);
					VerifyElementForExistingValueWithText("ESA", "ESA_Equipment_Furnace_ESA12a_Select_FurnaceFilter_FRR11_IncentiveAmount", "ESG Values", "ESA_Data", 437, 1);
					
					
					//Gas-Equipment Work Results Equipment WaterHeater
					
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater");
					threadWait(3000);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater", "ESG Values", "ESA_Data", 387, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_OpStatus", "ESG Values", "ESA_Data", 388, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_FuelType", "ESG Values", "ESA_Data", 390, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_Ownership", "ESG Values", "ESA_Data", 389, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_ServiceProvider", "ESG Values", "ESA_Data", 391, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_YearManufactured", "ESG Values", "ESA_Data", 392, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_Location", "ESG Values", "ESA_Data", 393, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_NGATComment", "ESG Values", "ESA_Data", 404, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_AuthorizationComments", "ESG Values", "ESA_Data", 423, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_PQty_ESA31a", "ESG Values", "ESA_Data", 407, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_IQty_ESA31a", "ESG Values", "ESA_Data", 407, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_Amountof_NonStandard_ESA31a", "ESG Values", "ESA_Data", 408, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_Size_ESA31a", "ESG Values", "ESA_Data", 409, 1);
				
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_IncentiveAmount_ESA31a", "ESG Values", "ESA_Data", 442, 1);
					
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater");
					threadWait(2000);
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_ClickOnResults");
					threadWait(2000);
					clickWebelement("ESA", "ESA_Equipment_Results_Select_Replaced");
					
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_Click_On_AddImage_ESA31a");
					threadWait(3000);
					
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_DripPan_N0742");
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_MiscMinor_Home_Repair_N0586");
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_VentPipe_WaterHeater_N0549");
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10");
					threadWait(2000);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_Qty");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_Qty", "ESG Values", "ESA_Data", 443, 1);
					threadWait(2000);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_SaveButton");
					threadWait(5000);
					
					scrollToElement("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_Click_On_GrandTotal");
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_ClickOn_DripPan_N0742");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_DripPan_N0742_IQty", "ESG Values", "ESA_Data", 444, 1);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_ClickOn_FlexConnector_FRR10_1st");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_1st_IQty", "ESG Values", "ESA_Data", 445, 1);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_1st_Type");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_1st_Type", "ESG Values", "ESA_Data", 446, 1);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_ClickOn_FlexConnector_FRR10_2nd");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_2nd_IQty", "ESG Values", "ESA_Data", 445, 2);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_2nd_Type");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_2nd_Type", "ESG Values", "ESA_Data", 446, 2);
					Enter(KeyEvent.VK_ENTER);
					
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_ClickOn_MiscMinor_Home_Repair_N0586");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_MiscMinor_Home_Repair_N0586_IQty", "ESG Values", "ESA_Data", 447, 1);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_ClickOn_VentPipe_WaterHeater_N0549");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_VentPipe_WaterHeater_N0549_IQty", "ESG Values", "ESA_Data", 448, 1);
					threadWait(2000);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_ClickOn_MiscMinor_Home_Repair_N0586");
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_MiscMinor_Home_Repair_N0586_IncentiveAmount");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_MiscMinor_Home_Repair_N0586_IncentiveAmount", "ESG Values", "ESA_Data", 449, 1);
					clickWebelement("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_MiscMinor_Home_Repair_N0586_RepairDescription");
					enterTextboxValue("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_MiscMinor_Home_Repair_N0586_RepairDescription", "ESG Values", "ESA_Data", 450, 1);
					clickWebelement("ESA", "GasEquipmentWorkResults_Equipment_WaterHeater_Click_On_GrandTotal");
					
					VerifyElementForExistingValueWithText("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_DripPan_N0742_IncentiveAmount", "ESG Values", "ESA_Data", 451, 1);
					VerifyElementForExistingValueWithText("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_1st_IncentiveAmount", "ESG Values", "ESA_Data", 452, 1);
					VerifyElementForExistingValueWithText("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_FlexConnector_FRR10_2nd_IncentiveAmount", "ESG Values", "ESA_Data", 453, 1);
					VerifyElementForExistingValueWithText("ESA", "ESA_Equipment_WaterHeater_ESA31a_Select_VentPipe_WaterHeater_N0549_IncentiveAmount", "ESG Values", "ESA_Data", 454, 1);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_ReplacementCost_StepSummary", "ESG Values", "ESA_Data", 455, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_Equipment_TotalCost_StepSummary", "ESG Values", "ESA_Data", 456, 1);
					
					clickonSave();
					
					scrollToElement("ESA", "Navigate_Document_Tab");
					clickWebelement("ESA", "Navigate_Document_Tab");
					threadWait(3000);
					clickWebelement("ESA", "Click_On_New_Button_UploadDocument");
					SwitchToFrame("ESA", "Upload_Document_Frame");
					WaitForElement(300, "ESA", "Click_On_UploadButton");
					//threadWait(5000);
					clickWebelement("ESA", "Click_On_UploadButton");
					
					try {
						UploadFile("ESA", "Upload_File_Path_for_GasEquipmentWorkResults");
						selectDropdown("ESA", "Select_Document_Type","Document_Type", "ESG Values", "ESA_Data", 458, 1);
					} catch (AWTException e) {
						System.out.println("File was not uploaded");
					}
					threadWait(3000);
					driver.switchTo().defaultContent();
					threadWait(3000);
					clickWebelement("ESA", "Save_Document");
					threadWait(3000);
					SwitchToFrame("ESA", "Upload_Document_Frame");
					if (Xpath("ESA", "Select_Replace_Existing_File").isDisplayed()) {
						driver.switchTo().defaultContent();
						clickWebelement("ESA", "Click_On_CloseButton");
					} 
					
					scrollToElement("ESA", "WorkflowstepTab");
					clickWebelement("ESA", "WorkflowstepTab");
					
					clickonProcess();
					
					//Change Request
					handlePopup();
					
					clickonSave();
					
					clickWebelement("ESA", "GasEquipmentWorkResults_ChangeRequest");
					
					SwitchToFrame("ESA", "GasEquipmentWorkResults_ChangeRequest_Frame");
					enterTextboxValue("ESA", "GasEquipmentWorkResults_ChangeRequest_SelectType", "ESG Values", "ESA_Data", 460, 1);
					clickWebelement("ESA", "GasEquipmentWorkResults_ChangeRequest_Enter_ChangeRequestDescription");
					enterTextboxValue("ESA", "GasEquipmentWorkResults_ChangeRequest_Enter_ChangeRequestDescription", "ESG Values", "ESA_Data", 461, 1);
					clickWebelement("ESA", "GasEquipmentWorkResults_ChangeRequest_ClickOnOK_Button");
					
					if (driver.getPageSource().contains("Gas Equipment Work Results - Unscheduled / Awaiting Results")) {
						clickWebelement("ESA", "GasEquipmentWorkResults_EnrollmentProfile");
						//threadWait(3000);
					} else {
						handlePopup();
						clickWebelement("ESA", "GasEquipmentWorkResults_EnrollmentProfile");
					}
					
					
					//clickWebelement("ESA", "GasEquipmentWorkResults_EnrollmentProfile");
					
					clickWebelement("ESA", "GasEquipmentWorkResults_ExpandIcon");
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_ChangeRequest_WorkflowStep", "ESG Values", "ESA_Data", 462, 1);
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_ChangeRequest_TradeAlly", "ESG Values", "ESA_Data", 463, 1);
					
					clickWebelement("ESA", "GasEquipmentWorkResults_ChangeRequest_WorkflowStep");
					threadWait(3000);
					clickWebelement("ESA", "GasEquipmentWorkResults_ChangeRequest_CompleteDate_Image");
					Enter(KeyEvent.VK_ENTER);
					threadWait(2000);
					clickWebelement("ESA", "EmployeeName");
					enterTextboxValue("ESA", "Employee_SearchBox", "ESG Values", "ESA_Data", 427, 1);
					Enter(KeyEvent.VK_ENTER);
					
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_ChangeRequest_Verify_Type", "ESG Values", "ESA_Data", 466, 1);
					defineLogs("In Regards To", "In Regards To", "In Regards To", "In Regards To Verified Successfully", "Unable to Verify In Regards To", "ESA", "GasEquipmentWorkResults_ChangeRequest_Verify_InRegardsTo");
					VerifyElementForExistingValueWithText("ESA", "GasEquipmentWorkResults_ChangeRequest_VerifyRequested", "ESG Values", "ESA_Data", 468, 1);
					clickWebelement("ESA", "GasEquipmentWorkResults_ChangeRequest_EnterComment");
					enterTextboxValue("ESA", "GasEquipmentWorkResults_ChangeRequest_EnterComment", "ESG Values", "ESA_Data", 469, 1);
					
					clickonProcess();
					
					
					clickWebelement("ESA", "GasEquipmentWorkResults_Step");
					
					scrollToElement("ESA", "Navigate_Document_Tab");
					clickWebelement("ESA", "GasEquipmentWorkResults_Navigate_Override_Tab");
					threadWait(3000);
					doubleClickWebelement("ESA", "GasEquipmentWorkResults_Override_Thresholds_NTEAmount");
					enterTextboxValue("ESA", "GasEquipmentWorkResults_Override_Thresholds_NTEAmount", "ESG Values", "ESA_Data", 470, 1);
					
					doubleClickWebelement("ESA", "GasEquipmentWorkResults_Override_FurnaceReplacement");
					enterTextboxValue("ESA", "GasEquipmentWorkResults_Override_FurnaceReplacement", "ESG Values", "ESA_Data", 471, 1);
					
					scrollToElement("ESA", "GasEquipmentWorkResults_Override_MiscMinorHomeRepair");
					doubleClickWebelement("ESA", "GasEquipmentWorkResults_Override_MiscMinorHomeRepair");
					enterTextboxValue("ESA", "GasEquipmentWorkResults_Override_MiscMinorHomeRepair", "ESG Values", "ESA_Data", 472, 1);
					
					clickonSave();
					
					scrollToElement("ESA", "WorkflowstepTab");
					clickWebelement("ESA", "WorkflowstepTab");
					
					clickonProcess();	
					
				}
				
				public static void Installation_Electric_Appliance_Workflow_Step() {
					clickWebelement("ESA", "InspectionGasAppliances_Step");
					threadWait(3000);
					
					//Visit Information
					selectActualVisitDate();
					threadWait(2000);
					clickWebelement("ESA", "EmployeeName");
					enterTextboxValue("ESA", "Employee_SearchBox", "ESG Values", "ESA_Data", 479, 1);
					Enter(KeyEvent.VK_ENTER);
					clickonSave();
					
					//Building Information
					clickWebelement("ESA", "InstallationlectricAppliance_CommonWaterHeater");
					clickWebelement("ESA", "InstallationlectricAppliance_CommonWaterHeater_Select_NO");
					clickWebelement("ESA", "InstallationlectricAppliance_AccessToAllRooms");
					clickWebelement("ESA", "InstallationlectricAppliance_AccessToAllRooms_Select_Yes");
					clickWebelement("ESA", "InstallationlectricAppliance_SpaceHeatingFuel");
					clickWebelement("ESA", "InstallationlectricAppliance_WaterHeatingFuelType");
					
					VerifyElementForExistingValueWithText("ESA", "InstallationlectricAppliance_MeasureName", "ESG Values", "ESA_Data", 481, 1);
					VerifyElementForExistingValueWithText("ESA", "InstallationlectricAppliance_PQty", "ESG Values", "ESA_Data", 482, 1);
					VerifyElementForExistingValueWithText("ESA", "InstallationlectricAppliance_IQty", "ESG Values", "ESA_Data", 483, 1);
					VerifyElementForExistingValueWithText("ESA", "InstallationlectricAppliance_IncentiveAmount", "ESG Values", "ESA_Data", 484, 1);
					
					clickWebelement("ESA", "InstallationlectricAppliance_MeasureName");
					
					clickWebelement("ESA", "InstallationlectricAppliance_Hinge");
					clearWebelement("ESA", "InstallationlectricAppliance_Hinge");
					enterTextboxValue("ESA", "InstallationlectricAppliance_Hinge", "ESG Values", "ESA_Data", 485, 1);
					Enter(KeyEvent.VK_ENTER);
					
					clickWebelement("ESA", "InstallationlectricAppliance_PlannedSize");
					clearWebelement("ESA", "InstallationlectricAppliance_PlannedSize");
					enterTextboxValue("ESA", "InstallationlectricAppliance_PlannedSize", "ESG Values", "ESA_Data", 486, 1);
					Enter(KeyEvent.VK_ENTER);
					
					clickWebelement("ESA", "InstallationlectricAppliance_NewRefrigerator");
					clearWebelement("ESA", "InstallationlectricAppliance_NewRefrigerator");
					enterTextboxValue("ESA", "InstallationlectricAppliance_NewRefrigerator", "ESG Values", "ESA_Data", 487, 1);
					Enter(KeyEvent.VK_ENTER);
					
					enterTextboxValue("ESA", "InstallationlectricAppliance_Make", "ESG Values", "ESA_Data", 488, 1);
					enterTextboxValue("ESA", "InstallationlectricAppliance_ModelNumber", "ESG Values", "ESA_Data", 489, 1);
					enterTextboxValue("ESA", "InstallationlectricAppliance_SerialNumber", "ESG Values", "ESA_Data", 490, 1);
					
					clickWebelement("ESA", "InstallationlectricAppliance_OutOfGrid");
					
					VerifyElementForExistingValueWithText("ESA", "InstallationElectricAppliance_IncentiveAmount", "ESG Values", "ESA_Data", 491, 1);
					VerifyElementForExistingValueWithText("ESA", "InstallationElectricAppliance_GrandTotalAmount", "ESG Values", "ESA_Data", 492, 1);
					VerifyElementForExistingValueWithText("ESA", "InstallationElectricAppliance_Incentive_StepSummary", "ESG Values", "ESA_Data", 493, 1);
					VerifyElementForExistingValueWithText("ESA", "InstallationElectricAppliance_TotalCost_StepSummary", "ESG Values", "ESA_Data", 494, 1);
					
					clickonSave();
					
					scrollToElement("ESA", "Navigate_Document_Tab");
					clickWebelement("ESA", "Navigate_Document_Tab");
					threadWait(3000);
					
					clickWebelement("ESA", "Click_On_New_Button_UploadDocument");
					SwitchToFrame("ESA", "Upload_Document_Frame");
					WaitForElement(300, "ESA", "Click_On_UploadButton");
					//threadWait(5000);
					clickWebelement("ESA", "Click_On_UploadButton");
					
					try {
						UploadFile("ESA", "Upload_File_Path_for_GasEquipmentWorkResults");
						selectDropdown("ESA", "Select_Document_Type", "Select_Document_Type", "ESG Values", "ESA_Data", 458, 1);
					} catch (AWTException e) {
						System.out.println("File was not uploaded");
					}
					threadWait(3000);
					driver.switchTo().defaultContent();
					threadWait(3000);
					clickWebelement("ESA", "Save_Document");
					threadWait(3000);
					SwitchToFrame("ESA", "Upload_Document_Frame");
					if (Xpath("ESA", "Select_Replace_Existing_File").isDisplayed()) {
						driver.switchTo().defaultContent();
						clickWebelement("ESA", "Click_On_CloseButton");
					} 
					
					scrollToElement("ESA", "WorkflowstepTab");
					clickWebelement("ESA", "WorkflowstepTab");
					
					clickonProcess();
					
				}
				
				
				
				
				
				public static void Inspection_Gas_Appliances_Workflow_Step() {
					
					VerifyElementForExistingValueWithText("ESA", "InspectionGasAppliances_Step", "ESG Values", "ESA_Data", 475, 1);
					VerifyElementForExistingValueWithText("ESA", "InspectionGasAppliances_TradeAlly", "ESG Values", "ESA_Data", 476, 1);
					
					clickWebelement("ESA", "InspectionGasAppliances_Step");
					threadWait(3000);
					
					//Visit Information
					selectActualVisitDate();
					threadWait(2000);
					clickWebelement("ESA", "EmployeeName");
					enterTextboxValue("ESA", "Employee_SearchBox", "ESG Values", "ESA_Data", 427, 1);
					Enter(KeyEvent.VK_ENTER);
					clickonSave();
					
					//Building Information
					
					
				}
				
				
				
				
				
				
				public static void Search_Enrollment_And_Navigate() {
					linkText("Main Menu").click();
					linkText("Enrollments").click();
					threadWait(3000);
					enterTextboxValue("ESA", "EnterEnrollmentNo", "ESG Values", "ESA_Data", 308, 1);
					threadWait(3000);
					scrollToElement("ESA", "SearchButton");
					clickWebelement("ESA", "SearchButton");
					threadWait(5000);
					clickWebelement("ESA", "EnrollmentLink");
					threadWait(3000);
					
					
				}
				
				
	}
