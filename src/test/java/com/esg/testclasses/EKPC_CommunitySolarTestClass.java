package com.esg.testclasses;

import java.awt.event.KeyEvent;
import java.io.IOException;

import com.esg.utilities.HelperClass;
import com.esg.utilities.ReadExcel;
import com.esg.utilities.WriteExcel;
import com.relevantcodes.extentreports.LogStatus;

public class EKPC_CommunitySolarTestClass extends HelperClass {

	public static void login() {
		login("Helper", "BaseURL", 1, 0, 1, 1);
	}
	
	public static void NavigateToInventoryPage() {
		linkText("Main Menu").click();
		linkText("Inventory").click();
	}
	
	public static void SearchInventory_by_SerialNo() {
		NavigateToInventoryPage();
		defineLogs("Inventory Tracking", "Inventory Tracking", "Inventory Tracking",
				"Navigate to Inventory Tracking Page", "Unable to navigate Inventory Tracking Page",
				"EKPC_CommunitySolar", "VerifyInventoryTracking");
		enterTextboxValue("EKPC_CommunitySolar", "EnterSerialNumber", "ESG Values", "EKPC_Community_Solar", 24, 1);
		threadWait(2000);
		clickWebelement("EKPC_CommunitySolar", "SearchButton");
		threadWait(2000);
		defineLogs("Inventory Tracking", "Inventory Tracking", "Inventory Tracking",
				"Verify Created enrollment associated with serial Number", "Unable to Verify Created enrollment associated with serial Number",
				"EKPC_CommunitySolar", "VerifyEnrollment_Associated");
	}
	

	public static void InventoryCheck() {
		NavigateToInventoryPage();
		defineLogs("Inventory Tracking", "Inventory Tracking", "Inventory Tracking",
				"Navigate to Inventory Tracking Page", "Unable to navigate Inventory Tracking Page",
				"EKPC_CommunitySolar", "VerifyInventoryTracking");
		selectDropdownByVisibleText("EKPC_CommunitySolar", "SelectProgram", "ESG Values", "EKPC_Community_Solar", 1, 1);
		threadWait(2000);
		selectDropdownByVisibleText("EKPC_CommunitySolar", "SelectMeasureStatus", "ESG Values", "EKPC_Community_Solar",
				2, 1);
		clickWebelement("EKPC_CommunitySolar", "SearchButton");
		if (driver.getPageSource().contains("No records to display.")) {
			AddInventory();
		} else {
			test.log(LogStatus.INFO, "Inventory  Available");
		}
	}

	public static void AddInventory() {
		clickWebelement("EKPC_CommunitySolar", "AddInventory");
		selectDropdownByVisibleText("EKPC_CommunitySolar", "SelectProgram", "ESG Values", "EKPC_Community_Solar", 1, 1);
		threadWait(3000);
		selectDropdownByVisibleText("EKPC_CommunitySolar", "Warehouse", "ESG Values", "EKPC_Community_Solar", 6, 1);
		selectDropdownByVisibleText("EKPC_CommunitySolar", "Measure", "ESG Values", "EKPC_Community_Solar", 7, 1);
		enterTextboxValue("EKPC_CommunitySolar", "WarrantyPeriod", "ESG Values", "EKPC_Community_Solar", 10, 1);
		enterTextboxValue("EKPC_CommunitySolar", "SerialNumber", "ESG Values", "EKPC_Community_Solar", 11, 1);
		threadWait(2000);
		clickonSave();
		if (driver.switchTo().alert() != null) {
			handlePopup();
			threadWait(2000);
			clearWebelement("EKPC_CommunitySolar", "SerialNumber");
			enterTextboxValue("EKPC_CommunitySolar", "SerialNumber", "ESG Values", "EKPC_Community_Solar", 12, 1);
			clickonSave();
			defineLogs("Inventory Tracking", "Inventory Tracking", "Inventory Tracking",
					"New Inventory added successfully", "Unable to add new Inventory", "EKPC_CommunitySolar",
					"VerifyInventoryTracking");
		} else {
			defineLogs("Inventory Tracking", "Inventory Tracking", "Inventory Tracking",
					"New Inventory added successfully", "Unable to add new Inventory", "EKPC_CommunitySolar",
					"VerifyInventoryTracking");
		}
	}

	public static void OnlineApplication() throws IOException {
		// Getting Started
		openURL("EKPC_CommunitySolar", "OnlineApplicationURL");
		threadWait(5000);
		clickWebelement("EKPC_CommunitySolar", "AccountHolder");
		enterTextboxValue("EKPC_CommunitySolar", "AccountNumber", "ESG Values", "EKPC_Community_Solar", 15, 1);
		clickWebelement("EKPC_CommunitySolar", "Nextbutton");
		threadWait(3000);

		// Customer Information
		defineLogs("Customer Information", "Customer Information", "Customer Information",
				"Navigate to Customer Information Section", "Unable to navigate to Customer Information Section",
				"EKPC_CommunitySolar", "CustomerInformation_AccountNumber");
		defineLogs("Customer Information", "Customer Information", "Customer Information",
				"Navigate to Customer Information Section", "Unable to navigate to Customer Information Section",
				"EKPC_CommunitySolar", "CustomerInformation_NameOfAccount");
		clickWebelement("EKPC_CommunitySolar", "Nextbutton");
		threadWait(3000);

		// Installer Information
		enterTextboxValue("EKPC_CommunitySolar", "InstallerInformation_Company", "ESG Values", "EKPC_Community_Solar",
				17, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		threadWait(2000);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickWebelement("EKPC_CommunitySolar", "Nextbutton");
		threadWait(3000);

		// Equipment Information
		enterTextboxValue("EKPC_CommunitySolar", "EquipmentInformation_Quantity", "ESG Values", "EKPC_Community_Solar",
				18, 1);
		clickWebelement("EKPC_CommunitySolar", "Nextbutton");
		threadWait(3000);
		// Payment Information
		selectDropdownByVisibleText("EKPC_CommunitySolar", "PaymentInformation_ChoosePaymentMethod", "ESG Values", "EKPC_Community_Solar", 19, 1);
		defineLogs("Choose a Payment Method", "Choose a Payment Method", "Choose a Payment Method",
				"Navigate to Payment Information Section", "Unable to navigate to Payment Information Section",
				"EKPC_CommunitySolar", "EquipmentInformation_ChoosePaymentMethod");
		// Terms and Condition
		clickWebelement("EKPC_CommunitySolar", "Nextbutton");
		threadWait(3000);
		defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions", "Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions", "EKPC_CommunitySolar", "VerifyTermsandCondition");	
		//Review and Submit
		clickWebelement("EKPC_CommunitySolar", "Nextbutton");
		threadWait(3000);
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "EKPC_CommunitySolar", "VerifyReviewAndSubmit");	
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Customer Information' Validated Successfully", "Failed to Validate 'Customer Information'", "EKPC_CommunitySolar", "CustomerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Applicant Information' Validated Successfully", "Failed to Validate 'Applicant Information'", "EKPC_CommunitySolar", "ApplicantInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Installer Information' Validated Successfully", "Failed to Validate 'Installer Information'", "EKPC_CommunitySolar", "InstallerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Equipment Information 'Lighting - Other' Validated Successfully", "Failed to Validate Equipment Information 'Lighting - Other'", "EKPC_CommunitySolar", "EquipmentInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Payee Information' Validated Successfully", "Failed to Validate 'Payee Information'", "EKPC_CommunitySolar", "PaymentInformation");
		clickWebelement("EKPC_CommunitySolar", "SubmitButton");
		threadWait(7000);
		TrackEnrollmentNumber("EKPC_CommunitySolar", "EnrollmentNumber");
		threadWait(2000);
	}
	
	public static  void TrackEnrollmentNumber(String FileName, String Webelement) throws IOException {
		String input= Xpath(FileName, Webelement).getText();
		     String EnrollmentNo=input.replaceAll("[^0-9]", "");
		      System.out.println("\nEnrollment Numbers is: " + EnrollmentNo);
		      threadWait(5000);
		      WriteExcel.WriteData("ESG Values", "EKPC_Community_Solar", EnrollmentNo, 20, 1);
		    //  WriteExcel.WriteData("ESG Values", "EKPC_Community_Solar", EnrollmentNo, 20, 1);
		     // ReadExcel.UpdateData("ESG Values", "EKPC_Community_Solar", 20, 1,EnrollmentNo);
	}
	
	public static  void TrackSerialNumber(String FileName, String Webelement) throws IOException {
		String SerialNo= Xpath(FileName, Webelement).getText();
		      System.out.println("\nSerial Numbers is: " + SerialNo);
		      threadWait(5000);
		      WriteExcel.WriteData("ESG Values", "EKPC_Community_Solar", SerialNo, 24, 1);
		     // ReadExcel.UpdateData("ESG Values", "EKPC_Community_Solar", 24, 1,SerialNo);
	}
	public static void Search_Inventory_by_EnrollmentNo_and_NavigateToApplication(){
		ClickByActionClass("EKPC_CommunitySolar", "MainMenu", "ESG Values", "EKPC_Community_Solar", 23, 1);
		threadWait(2000);
		enterTextboxValue("EKPC_CommunitySolar", "EnterEnrollmentNo", "ESG Values", "EKPC_Community_Solar", 20, 1);
		threadWait(3000);
		scrollToElement("EKPC_CommunitySolar", "SearchButton");
		clickWebelement("EKPC_CommunitySolar", "SearchButton");
		threadWait(5000);
		clickWebelement("EKPC_CommunitySolar", "EnrollmentLink");
		clickWebelement("EKPC_CommunitySolar", "ApplicationWorkflowStep");
		threadWait(3000);
	}
	
	public static void Verify_Enrollment_Application_Info() throws IOException{
		login2( 2, 0, 2, 1);
		Search_Inventory_by_EnrollmentNo_and_NavigateToApplication();
		/*scrollToElement("EKPC_CommunitySolar", "Application_PaymentInformation");
		threadWait(2000);
		defineLogs("Workflow Step Summary", "Workflow Step Summary", "Workflow Step Summary", "'Payment Information Amount' Validated Successfully", "Failed to Validate 'Payment Information Amount'", "EKPC_CommunitySolar", "VerifyApplication_Amount");
		defineLogs("Workflow Step Summary", "Workflow Step Summary", "Workflow Step Summary", "'Payment Information Amount' Validated Successfully", "Failed to Validate 'Payment Information Amount'", "EKPC_CommunitySolar", "VerifyApplication_TotalAmount");
		defineLogs("Workflow Step Summary", "Workflow Step Summary", "Workflow Step Summary", "'Payment Information Amount' Validated Successfully", "Failed to Validate 'Payment Information Amount'", "EKPC_CommunitySolar", "VerifyApplication_PaymentMethod");
		*/scrollToElement("EKPC_CommunitySolar", "Application_Measure");
		clickWebelement("EKPC_CommunitySolar", "Application_Measure");
		threadWait(5000);
		defineLogs("Workflow Step Summary", "Workflow Step Summary", "Workflow Step Summary", "'Measure Amount' Validated Successfully", "Failed to Validate 'Measure Amount'", "EKPC_CommunitySolar", "VerifyMeasure_Amount");
		defineLogs("Workflow Step Summary", "Workflow Step Summary", "Workflow Step Summary", "'Measure Serial Number' Validated Successfully", "Failed to Validate 'Measure Serial Number'", "EKPC_CommunitySolar", "Measure_SerialNo");
		TrackSerialNumber("EKPC_CommunitySolar", "Measure_SerialNo");
		clickonProcess();
		clickWebelement("EKPC_CommunitySolar", "CloseBtn");
		threadWait(5000);
		//defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary", "'Application Status' Validated Successfully", "Failed to Validate 'Application Status'", "EKPC_CommunitySolar", "VerifyMeasure_EnrollmentStatus");
	}
	public static void Terminate_Enrollment(){
		Search_Inventory_by_EnrollmentNo_and_NavigateToApplication();
		clickWebelement("EKPC_CommunitySolar", "Re_OpenApplication");
		clickWebelement("EKPC_CommunitySolar", "ClickOnOk");
		threadWait(5000);
		//enterTextboxValue("EKPC_CommunitySolar", "Termination_Date", "ESG Values", "EKPC_Community_Solar", 25, 1);
		clickonProcess();
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary", "'Application Status' Validated Successfully", "Failed to Validate 'Application Status'", "EKPC_CommunitySolar", "VerifyMeasure_EnrollmentStatus");
	}

}
