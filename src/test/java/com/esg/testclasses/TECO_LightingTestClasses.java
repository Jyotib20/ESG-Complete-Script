package com.esg.testclasses;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;
import com.esg.utilities.ReadExcel;

public class TECO_LightingTestClasses extends HelperClass {

	public static void OpenOnlineApplication() {
		setProperty("helper", "chrome", "Chrome_Path");
		openChrome();
		openURL("TECOLighting", "OnlineApplication");
		maximizeWindow();
		implicitlywait(220);
	}

	public static void Step1_Complete_GettingStarted() {
		// Complete Getting Started - Step-1
		Pass_Message("Complete Getting Started - Step-1");

		clickWebelement("TECOLighting", "AccountHolder");
		clickWebelement("TECOLighting", "GettingStarted_AccountNumber");
		enterTextboxValue("TECOLighting", "GettingStarted_AccountNumber", "ESG Values", "TECO_Lighting", 2, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "GettingStarted_ZIP_or_PostalCode", "ESG Values", "TECO_Lighting", 3,
				1);
		clickWebelement("TECOLighting", "GettingStarted_Haveyoupurchased_or_installedanyequipment_No");
		clickWebelement("TECOLighting", "GettingStarted_IslightingsystemONLYoperateduringnighttimehours_No");
		clickWebelement("TECOLighting", "GettingStarted_Islightingsystemreplacingexistinglightingsystem_Yes");

		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Customer Information", "Customer Information", "Customer Information",
				"Navigate to Customer Information Successfully", "Unable to Navigate to Customer Information",
				"TECOLighting", "VerifyCustomerInformation");
	}

	public static void Step2_Complete_CustomerInformation() {
		// Complete Customer Information - Step-2
		Pass_Message("Complete Customer Information - Step-2");

		clickWebelement("TECOLighting", "CustomerInformation_PrimaryPhone");
		enterTextboxValue("TECOLighting", "CustomerInformation_PrimaryPhone", "ESG Values", "TECO_Lighting", 8,
				1);
		clickWebelement("TECOLighting", "CustomerInformation_ApplicantInformation_FirstName");
		enterTextboxValue("TECOLighting", "CustomerInformation_ApplicantInformation_FirstName", "ESG Values",
				"TECO_Lighting", 6, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "CustomerInformation_ApplicantInformation_LastName", "ESG Values",
				"TECO_Lighting", 7, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "CustomerInformation_ApplicantInformation_PrimaryPhone", "ESG Values",
				"TECO_Lighting", 8, 1);
		clickWebelement("TECOLighting", "CustomerInformation_ApplicantInformation_Email");
		enterTextboxValue("TECOLighting", "CustomerInformation_ApplicantInformation_Email", "ESG Values",
				"TECO_Lighting", 9, 1);
		// scrollToElement("TECOLighting", "BuildingType");
		selectDropdown("TECOLighting", "CustomerInformation_PropertyInformation_BuildingType","CustomerInformation_PropertyInformation_BuildingType",
				"ESG Values", "TECO_Lighting", 10, 1);
		selectDropdown("TECOLighting", "CustomerInformation_PropertyInformation_OccupancyStatus","CustomerInformation_PropertyInformation_OccupancyStatus",
				"ESG Values", "TECO_Lighting", 11, 1);

		// Verify Customer Information - Step-2
		Pass_Message("Verify Customer Information - Step-2");

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Customer_Information_AccountNumber", "ESG Values",
				"TECO_Lighting", 14, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Customer_Information_NameOnAccount", "ESG Values",
				"TECO_Lighting", 15, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Customer_Information_InstallationAddress_Street",
				"ESG Values", "TECO_Lighting", 18, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Customer_Information_InstallationAddress_Unit",
				"ESG Values", "TECO_Lighting", 19, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Customer_Information_InstallationAddress_Zip",
				"ESG Values", "TECO_Lighting", 20, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Customer_Information_InstallationAddress_City",
				"ESG Values", "TECO_Lighting", 21, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Customer_Information_InstallationAddress_State",
				"ESG Values", "TECO_Lighting", 22, 1);

		validationWithelementVisibility("TECOLighting",
				"Verify_Customer_Information_Is_the_mailing_address_the_same_as_the_InstallationAddress_Yes",
				"Is the mailing address the same as the Installation Address? selected radio button is-No",
				"Is the mailing address the same as the Installation Address? selected radio button is-Yes");

		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Installer Information", "Installer Information", "Installer Information",
				"Navigate to Installer Information Successfully", "Unable to Navigate to Installer Information",
				"TECOLighting", "VerifyInstallerInformation");
	}

	public static void Step3_InstallerInformation() {
		clickWebelement("TECOLighting", "Company");
		enterTextboxValue("TECOLighting", "Company", "ESG Values", "TECO_Lighting", 26, 1);
		threadWait(3000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "ContactName", "ESG Values", "TECO_Lighting", 27, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "ContactPhone", "ESG Values", "TECO_Lighting", 28, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "ContactEmail", "ESG Values", "TECO_Lighting", 29, 1);
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Payee Information", "Payee Information", "Payee Information",
				"Navigate to Payee Information Successfully", "Unable to Navigate to Payee Information", "TECOLighting",
				"VerifyPayeeInformation");
	}

	public static void Step4_PayeeInformation() {
		clickWebelement("TECOLighting", "SelectAccountHolder");
		threadWait(3000);
		selectDropdown("TECOLighting", "TaxStatus", "TaxStatus", "ESG Values", "TECO_Lighting", 34, 1);
		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information",
				"Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information",
				"TECOLighting", "VerifyEquipmentInformation");
	}

	public static void Step5_EquipmentInformation() {
		WaitForElement(30, "TECOLighting", "AddEquipment");
		clickWebelement("TECOLighting", "AddEquipment");

		clickWebelement("TECOLighting", "SelectLight_EmittingDiode_LED");
		clickWebelement("TECOLighting", "Add_Quantity_for_LED");
		Clear("TECOLighting", "Add_Quantity_for_LED");
		enterTextboxValue("TECOLighting", "Add_Quantity_for_LED", "ESG Values", "TECO_Lighting", 41, 1);
		clickWebelement("TECOLighting", "OkButton");

		// Enter Value Cost Summary
		enterTextboxValue("TECOLighting", "LaborCost", "ESG Values", "TECO_Lighting", 39, 1);
		enterTextboxValue("TECOLighting", "TotalProjectCost", "ESG Values", "TECO_Lighting", 40, 1);

		// Enter value in Light-Emitting Diode (LED)-1
		clickWebelement("TECOLighting", "Light_EmittingDiode_LED1_Quantity");
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_Quantity", "ESG Values", "TECO_Lighting", 44, 1);
		clickWebelement("TECOLighting", "Light_EmittingDiode_LED1_AnticipatedDateOfInstallation");
		Enter(KeyEvent.VK_ENTER);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_InstalledFixtureDescription", "ESG Values",
				"TECO_Lighting", 45, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_InstalledWattagePerFixture", "ESG Values",
				"TECO_Lighting", 46, 1);

		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_ExistingQuantity", "ESG Values", "TECO_Lighting",
				48, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_ExistingFixture", "ESG Values", "TECO_Lighting", 49,
				1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_ExistingFixtureDescription", "ESG Values",
				"TECO_Lighting", 50, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_ExistingFixturesNotWorking", "ESG Values",
				"TECO_Lighting", 51, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_ExistingWattagePerFixture", "ESG Values",
				"TECO_Lighting", 52, 1);

		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_AnnualOperatingHours", "ESG Values",
				"TECO_Lighting", 55, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_Location", "ESG Values", "TECO_Lighting", 56, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_LightingCost", "ESG Values", "TECO_Lighting", 57,
				1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED1_Notes", "ESG Values", "TECO_Lighting", 58, 1);

		// Enter value in Light-Emitting Diode (LED)-2
		clickWebelement("TECOLighting", "Light_EmittingDiode_LED2_Quantity");
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_Quantity", "ESG Values", "TECO_Lighting", 61, 1);
		clickWebelement("TECOLighting", "Light_EmittingDiode_LED2_AnticipatedDateOfInstallation");
		Enter(KeyEvent.VK_ENTER);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_InstalledFixtureDescription", "ESG Values",
				"TECO_Lighting", 62, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_InstalledWattagePerFixture", "ESG Values",
				"TECO_Lighting", 63, 1);

		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_ExistingQuantity", "ESG Values", "TECO_Lighting",
				65, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_ExistingFixture", "ESG Values", "TECO_Lighting", 66,
				1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_ExistingFixtureDescription", "ESG Values",
				"TECO_Lighting", 67, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_ExistingFixturesNotWorking", "ESG Values",
				"TECO_Lighting", 68, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_ExistingWattagePerFixture", "ESG Values",
				"TECO_Lighting", 69, 1);

		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_AnnualOperatingHours", "ESG Values",
				"TECO_Lighting", 72, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_Location", "ESG Values", "TECO_Lighting", 73, 1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_LightingCost", "ESG Values", "TECO_Lighting", 74,
				1);
		enterTextboxValue("TECOLighting", "Light_EmittingDiode_LED2_Notes", "ESG Values", "TECO_Lighting", 75, 1);

		threadWait(3000);

		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED1_InstalledTotalWatts",
				"ESG Values", "TECO_Lighting", 47, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED1_ExistingTotalWatts",
				"ESG Values", "TECO_Lighting", 53, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED1_TotalWattageReduction",
				"ESG Values", "TECO_Lighting", 54, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED2_InstalledTotalWatts",
				"ESG Values", "TECO_Lighting", 64, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED2_ExistingTotalWatts",
				"ESG Values", "TECO_Lighting", 70, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED2_TotalWattageReduction",
				"ESG Values", "TECO_Lighting", 71, 1);

		/*
		 * clickWebelement("TECOLighting", "SelectLighting");
		 * clickWebelement("TECOLighting", "OkButton"); threadWait(2000);
		 * clickWebelement("TECOLighting", "LightingQuantity");
		 * enterTextboxValue("TECOLighting", "LightingQuantity", "ESG Values",
		 * "TECO_Lighting", 38, 1); clickWebelement("TECOLighting",
		 * "LightingAnticipatedDateImage"); Enter(KeyEvent.VK_ENTER); threadWait(2000);
		 * Enter(KeyEvent.VK_TAB); enterTextboxValue("TECOLighting",
		 * "LightingInstalledFixtureDescription", "ESG Values", "TECO_Lighting", 39, 1);
		 * Enter(KeyEvent.VK_TAB); enterTextboxValue("TECOLighting",
		 * "LightingInstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 40, 1);
		 * Enter(KeyEvent.VK_TAB); enterTextboxValue("TECOLighting",
		 * "LightingExistingQuantity", "ESG Values", "TECO_Lighting", 41, 1);
		 * Enter(KeyEvent.VK_TAB); selectDropdown("TECOLighting",
		 * "LightingExistingFixture", "ESG Values", "TECO_Lighting", 42, 1);
		 * Enter(KeyEvent.VK_TAB); selectDropdown("TECOLighting",
		 * "LightingExistingFixtureDescription", "ESG Values", "TECO_Lighting", 43, 1);
		 * Enter(KeyEvent.VK_TAB); enterTextboxValue("TECOLighting",
		 * "LightingFixturesNotWorking", "ESG Values", "TECO_Lighting", 44, 1);
		 * Enter(KeyEvent.VK_TAB); enterTextboxValue("TECOLighting",
		 * "LightingExistingWattagePerFixture", "ESG Values", "TECO_Lighting", 45, 1);
		 * Enter(KeyEvent.VK_TAB); enterTextboxValue("TECOLighting",
		 * "LightingAnnualOperatingHours", "ESG Values", "TECO_Lighting", 46, 1);
		 * Enter(KeyEvent.VK_TAB); enterTextboxValue("TECOLighting", "LightingLocation",
		 * "ESG Values", "TECO_Lighting", 47, 1); Enter(KeyEvent.VK_TAB);
		 * enterTextboxValue("TECOLighting", "LightingCost", "ESG Values",
		 * "TECO_Lighting", 48, 1); Enter(KeyEvent.VK_TAB);
		 * enterTextboxValue("TECOLighting", "LightingNotes", "ESG Values",
		 * "TECO_Lighting", 49, 1); Enter(KeyEvent.VK_TAB);
		 * 
		 * defineLogs("Equipment Information", "Equipment Information",
		 * "Equipment Information", "'Installed total watts' Validated Successfully",
		 * "Failed to Validate 'Installed total watts'", "TECOLighting",
		 * "VerifyLightingInstalledTotalWatts"); defineLogs("Equipment Information",
		 * "Equipment Information", "Equipment Information",
		 * "'Existing total watts' Validated Successfully",
		 * "Failed to Validate 'Existing total watts'", "TECOLighting",
		 * "VerifyLightingExistingTotalWatts"); defineLogs("Equipment Information",
		 * "Equipment Information", "Equipment Information",
		 * "'Total wattage reduction' Validated Successfully",
		 * "Failed to Validate 'Total wattage reduction'", "TECOLighting",
		 * "VerifyLightingTotalWattageReduction");
		 * 
		 * clickWebelement("TECOLighting", "NextButton"); if (Xpath("TECOLighting",
		 * "Warning").isDisplayed()) { clickWebelement("TECOLighting", "AcceptWarning");
		 * } else { test.log(LogStatus.INFO, "Warning message was not displayed"); }
		 */
		
		clickWebelement("TECOLighting", "NextButton");
		threadWait(5000);
		//scrollToElement("TECOLighting", "NextButton");
		if (Xpath("TECOLighting", "Add_Equipment_Dialog").isDisplayed()) {
			clickWebelement("TECOLighting", "Close_DIalog");
			clickWebelement("TECOLighting", "NextButton");
		} else {
			System.out.println("Next Button clicked successfully");
		}
		threadWait(2000);
		//clickWebelement("TECOLighting", "NextButton");
		defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary",
				"Navigate to Incentive Summary Successfully", "Unable to Navigate to Incentive Summary", "TECOLighting",
				"VerifyIncentiveSummary");
	}

	public static void Step6_IncentiveSummary() {

		WaitForElement(300, "TECOLighting", "NextButton");
		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Documentation", "Documentation", "Documentation", "Navigate to Documentation Successfully",
				"Unable to Navigate to Documentation", "TECOLighting", "VerifyDocumentation");
	}

	public static void Step7_Documentation() {
		// defineLogs("Documentation", "Documentation", "Documentation", "'Add Document'
		// Validated Successfully", "Failed to Validate 'Add Document'", "TECOLighting",
		// "VerifyAddDocument");

		clickWebelement("TECOLighting", "AddDocument");
		selectDropdown("TECOLighting", "Select_DocumentType","Select_DocumentType", "ESG Values", "TECO_Lighting", 92, 1);
		clickWebelement("TECOLighting", "Upload_File");
		try {
			UploadFile("TECOLighting", "FilePath_Upload_Contractor_Document");
		} catch (AWTException e) {
			System.out.println("Unable to Upload file");
		}
		clickWebelement("TECOLighting", "Comments_On_File");
		enterTextboxValue("TECOLighting", "Comments_On_File", "ESG Values", "TECO_Lighting", 95, 1);
		clickWebelement("TECOLighting", "Upload_Button");

		threadWait(5000);
		// WaitForElementForAccessible(60, "TECOLighting", "AddDocument");
		clickWebelement("TECOLighting", "AddDocument");
		selectDropdown("TECOLighting", "Select_DocumentType","Select_DocumentType", "ESG Values", "TECO_Lighting", 93, 1);
		clickWebelement("TECOLighting", "Upload_File");
		try {
			UploadFile("TECOLighting", "FilePath_Upload_Worksheet_Document");
		} catch (AWTException e) {
			System.out.println("Unable to Upload file");
		}
		clickWebelement("TECOLighting", "Comments_On_File");
		enterTextboxValue("TECOLighting", "Comments_On_File", "ESG Values", "TECO_Lighting", 96, 1);
		clickWebelement("TECOLighting", "Upload_Button");
		
		threadWait(5000);
		// WaitForElementForAccessible(60, "TECOLighting", "AddDocument");
		clickWebelement("TECOLighting", "AddDocument");
		selectDropdown("TECOLighting", "Select_DocumentType","Select_DocumentType", "ESG Values", "TECO_Lighting", 94, 1);
		clickWebelement("TECOLighting", "Upload_File");
		try {
			UploadFile("TECOLighting", "FilePath_Upload_TechnicalSpecification_Document");
		} catch (AWTException e) {
			System.out.println("Unable to Upload file");
		}
		clickWebelement("TECOLighting", "Comments_On_File");
		enterTextboxValue("TECOLighting", "Comments_On_File", "ESG Values", "TECO_Lighting", 97, 1);
		clickWebelement("TECOLighting", "Upload_Button");

		// WaitForElementForClickable(60, "TECOLighting", "NextButton");
		threadWait(5000);
		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions",
				"Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions",
				"TECOLighting", "VerifyTermsandCondition");
	}

	public static void Step8_TermsandCondition() {
		clickWebelement("TECOLighting", "AcceptTermsandCondition");
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "TECOLighting",
				"VerifyReviewAndSubmit");
	}

	public static void TrackEnrollmentNumber(String FileName, String Webelement) {
		String input = Xpath(FileName, Webelement).getText();
		String EnrollmentNo = input.replaceAll("[^0-9]", "");
		System.out.println("\nEnrollment Numbers is: " + EnrollmentNo);
		threadWait(5000);
		ReadExcel.UpdateData("ESG Values", "TECO_Lighting", 2, 3, EnrollmentNo);
	}

	public static void Step9_ReviewandSubmit() {
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"'Customer Information' Validated Successfully", "Failed to Validate 'Customer Information'",
				"TECOLighting", "CustomerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"'Applicant Information' Validated Successfully", "Failed to Validate 'Applicant Information'",
				"TECOLighting", "ApplicantInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"'Installer Information' Validated Successfully", "Failed to Validate 'Installer Information'",
				"TECOLighting", "InstallerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"'Payee Information' Validated Successfully", "Failed to Validate 'Payee Information'", "TECOLighting",
				"PayeeInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Equipment Information 'Light-Emitting Diode (LED)--1' Validated Successfully",
				"Failed to Validate Equipment Information 'Light-Emitting Diode (LED)--1'", "TECOLighting",
				"EquipmentInformation_1st_Equipment");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Equipment Information 'Light-Emitting Diode (LED)--1 Quantity' Validated Successfully",
				"Failed to Validate Equipment Information 'Light-Emitting Diode (LED)--1 Quantity'", "TECOLighting",
				"EquipmentInformationQuantity_1st_Equipment");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Equipment Information 'Light-Emitting Diode (LED)--2' Validated Successfully",
				"Failed to Validate Equipment Information 'Light-Emitting Diode (LED)--2'", "TECOLighting",
				"EquipmentInformation_2nd_Equipment");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Equipment Information 'Light-Emitting Diode (LED)--2 Quantity' Validated Successfully",
				"Failed to Validate Equipment Information 'Light-Emitting Diode (LED)--2 Quantity'", "TECOLighting",
				"EquipmentInformationQuantity_2nd_Equipment");

		clickWebelement("TECOLighting", "SubmitButton");
		threadWait(7000);
		TrackEnrollmentNumber("TECOLighting", "EnrollmentNumber");
		threadWait(2000);
	}

	public static void VerifyEnrollment() {
		login("Helper", "BaseURL", 2, 0, 2, 1);
		//ClickByActionClass("TECOLighting", "MainMenu", "ESG Values", "TECO_Lighting", 4, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		threadWait(2000);
		enterTextboxValue("TECOLighting", "EnterEnrollmentNo", "ESG Values", "TECO_Lighting", 2, 3);
		threadWait(3000);
		scrollToElement("TECOLighting", "SearchButton");
		clickWebelement("TECOLighting", "SearchButton");
		threadWait(7000);
		clickWebelement("TECOLighting", "EnrollmentLink");
		clickWebelement("TECOLighting", "ApplicationWorkflowStep");

		selectDropdown("TECOLighting", "Select_Outcome","Select_Outcome", "ESG Values","TECO_Lighting", 100, 1);
		/*clickWebelement("TECOLighting", "Select_Outcome");
		clickWebelement("TECOLighting", "Select_Outcome_Onhold");*/

		scrollToElement("TECOLighting", "VerifyEnrollmentSummaryIncentiveAmount");
		threadWait(3000);
		defineLogs("Workflow Step Summary", "Workflow Step Summary", "Workflow Step Summary",
				"'Enrollment Summary Incentive Amount' Validated Successfully",
				"Failed to Validate 'Enrollment Summary Incentive Amount'", "TECOLighting",
				"VerifyEnrollmentSummaryIncentiveAmount");

		clickonSave();
	}

	public static void EditOnlineApplication() {
		//Status Check for Edit
		OpenBrowser("TECOLighting", "StatusCheckURL");
		threadWait(3000);
		enterTextboxValue("TECOLighting", "EditbyEnrollmentNo", "ESG Values", "TECO_Lighting", 2, 3);
		enterTextboxValue("TECOLighting", "EditbyAccountNo", "ESG Values", "TECO_Lighting", 2, 1);
		clickWebelement("TECOLighting", "SearchButton");
		threadWait(3000);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_StatusMessage", "ESG Values", "TECO_Lighting",
				103, 1);
		threadWait(5000);
		clickWebelement("TECOLighting", "Edit_Application_Button");
	}

	public static void Verify_Customer_Information_EditOnlineApplication() {

		// Verify Customer Information - Step-2
		Pass_Message("Verify Customer Information - Step-2");

		VerifyElementForExistingValueWithAttribute("TECOLighting", "CustomerInformation_PrimaryPhone", "ESG Values",
				"TECO_Lighting", 8, 1);

		VerifyElementForExistingValueWithAttribute("TECOLighting", "CustomerInformation_ApplicantInformation_FirstName",
				"ESG Values", "TECO_Lighting", 6, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "CustomerInformation_ApplicantInformation_LastName",
				"ESG Values", "TECO_Lighting", 7, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting",
				"CustomerInformation_ApplicantInformation_PrimaryPhone", "ESG Values", "TECO_Lighting", 8, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "CustomerInformation_ApplicantInformation_Email",
				"ESG Values", "TECO_Lighting", 9, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "CustomerInformation_PropertyInformation_BuildingType",
				"ESG Values", "TECO_Lighting", 10, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "CustomerInformation_PropertyInformation_OccupancyStatus",
				"ESG Values", "TECO_Lighting", 11, 1);

		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Installer Information", "Installer Information", "Installer Information",
				"Navigate to Installer Information Successfully", "Unable to Navigate to Installer Information",
				"TECOLighting", "VerifyInstallerInformation");
	}

	public static void Verify_Installer_Information_EditOnlineApplication() {

		// Verify Installer Information - Step-3
		Pass_Message("Verify Installer Information - Step-3");

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Company", "ESG Values", "TECO_Lighting", 26, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "ContactName", "ESG Values", "TECO_Lighting", 27, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "ContactPhone", "ESG Values", "TECO_Lighting", 28,
				1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "ContactEmail", "ESG Values", "TECO_Lighting", 29,
				1);

		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Payee Information", "Payee Information", "Payee Information",
				"Navigate to Payee Information Successfully", "Unable to Navigate to Payee Information", "TECOLighting",
				"VerifyPayeeInformation");
	}

	public static void Verify_Payee_Information_EditOnlineApplication() {

		// Verify Payee Information - Step-4
		Pass_Message("Verify Payee Information - Step-4");

		VerifyElementForExistingValueWithText("TECOLighting", "TaxStatus", "ESG Values", "TECO_Lighting", 34, 1);

		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information",
				"Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information",
				"TECOLighting", "VerifyEquipmentInformation");
	}

	public static void Verify_Equipment_Information_EditOnlineApplication() {

		// Verify Equipment Information - Step-5
		Pass_Message("Verify Equipment Information - Step-5");

		VerifyElementForExistingValueWithAttribute("TECOLighting", "LaborCost", "ESG Values", "TECO_Lighting", 39, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "TotalProjectCost", "ESG Values", "TECO_Lighting",
				40, 1);

		// Verify Light-Emitting Diode (LED)-1 - Equipment Information - Step-5
		Pass_Message("Verify Light-Emitting Diode (LED)-1 - Equipment Information - Step-5");

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED1_Quantity", "ESG Values",
				"TECO_Lighting", 44, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED1_InstalledFixtureDescription",
				"ESG Values", "TECO_Lighting", 45, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting",
				"Light_EmittingDiode_LED1_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 46, 1);

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED1_ExistingQuantity",
				"ESG Values", "TECO_Lighting", 48, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED1_ExistingFixture", "ESG Values",
				"TECO_Lighting", 49, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED1_ExistingFixtureDescription",
				"ESG Values", "TECO_Lighting", 50, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting",
				"Light_EmittingDiode_LED1_ExistingFixturesNotWorking", "ESG Values", "TECO_Lighting", 51, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED1_ExistingWattagePerFixture",
				"ESG Values", "TECO_Lighting", 52, 1);

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED1_AnnualOperatingHours",
				"ESG Values", "TECO_Lighting", 55, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED1_Location", "ESG Values",
				"TECO_Lighting", 56, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED1_LightingCost",
				"ESG Values", "TECO_Lighting", 57, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED1_Notes", "ESG Values",
				"TECO_Lighting", 58, 1);

		// Verify Light-Emitting Diode (LED)-2 - Equipment Information - Step-5
		Pass_Message("Verify Light-Emitting Diode (LED)-2 - Equipment Information - Step-5");

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED2_Quantity", "ESG Values",
				"TECO_Lighting", 61, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED2_InstalledFixtureDescription",
				"ESG Values", "TECO_Lighting", 62, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting",
				"Light_EmittingDiode_LED2_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 63, 1);

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED2_ExistingQuantity",
				"ESG Values", "TECO_Lighting", 65, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED2_ExistingFixture", "ESG Values",
				"TECO_Lighting", 66, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Light_EmittingDiode_LED2_ExistingFixtureDescription",
				"ESG Values", "TECO_Lighting", 67, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting",
				"Light_EmittingDiode_LED2_ExistingFixturesNotWorking", "ESG Values", "TECO_Lighting", 68, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED2_ExistingWattagePerFixture",
				"ESG Values", "TECO_Lighting", 69, 1);

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED2_AnnualOperatingHours",
				"ESG Values", "TECO_Lighting", 72, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED2_Location", "ESG Values",
				"TECO_Lighting", 73, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED2_LightingCost",
				"ESG Values", "TECO_Lighting", 74, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Light_EmittingDiode_LED2_Notes", "ESG Values",
				"TECO_Lighting", 75, 1);

		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary",
				"Navigate to Incentive Summary Successfully", "Unable to Navigate to Incentive Summary", "TECOLighting",
				"VerifyIncentiveSummary");
	}

	public static void Verify_Incentive_Summary_EditOnlineApplication() {

		//WaitForElement(60, "TECOLighting", "NextButton");
		threadWait(5000);
		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Documentation", "Documentation", "Documentation", "Navigate to Documentation Successfully",
				"Unable to Navigate to Documentation", "TECOLighting", "VerifyDocumentation");
	}

	public static void Verify_Documentation_EditOnlineApplication() {

		// Verify Documentation - Step-6
		Pass_Message("Verify Documentation - Step-6");

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Contractor_Document_Type", "ESG Values",
				"TECO_Lighting", 92, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Worksheet_Document_Type", "ESG Values",
				"TECO_Lighting", 93, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_TechnicalSpecification_Document_Type",
				"ESG Values", "TECO_Lighting", 94, 1);

		clickWebelement("TECOLighting", "AddDocument");
		selectDropdown("TECOLighting", "Select_DocumentType","Select_DocumentType", "ESG Values", "TECO_Lighting", 106, 1);
		clickWebelement("TECOLighting", "Upload_File");
		try {
			UploadFile("TECOLighting", "FilePath_Upload_Enrollment_Document");
		} catch (AWTException e) {
			System.out.println("Unable to Upload file");
		}
		clickWebelement("TECOLighting", "Comments_On_File");
		enterTextboxValue("TECOLighting", "Comments_On_File", "ESG Values", "TECO_Lighting", 107, 1);
		clickWebelement("TECOLighting", "Upload_Button");

		threadWait(3000);
		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions",
				"Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions",
				"TECOLighting", "VerifyTermsandCondition");
	}

	public static void Verify_TermsandCondition_EditOnlineApplication() {
		clickWebelement("TECOLighting", "AcceptTermsandCondition");
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "TECOLighting",
				"VerifyReviewAndSubmit");
	}

	public static void Verify_ReviewandSubmit_EditOnlineApplication() {
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"'Customer Information' Validated Successfully", "Failed to Validate 'Customer Information'",
				"TECOLighting", "CustomerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"'Applicant Information' Validated Successfully", "Failed to Validate 'Applicant Information'",
				"TECOLighting", "ApplicantInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"'Installer Information' Validated Successfully", "Failed to Validate 'Installer Information'",
				"TECOLighting", "InstallerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"'Payee Information' Validated Successfully", "Failed to Validate 'Payee Information'", "TECOLighting",
				"PayeeInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Equipment Information 'Light-Emitting Diode (LED)--1' Validated Successfully",
				"Failed to Validate Equipment Information 'Light-Emitting Diode (LED)--1'", "TECOLighting",
				"EquipmentInformation_1st_Equipment");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Equipment Information 'Light-Emitting Diode (LED)--1 Quantity' Validated Successfully",
				"Failed to Validate Equipment Information 'Light-Emitting Diode (LED)--1 Quantity'", "TECOLighting",
				"EquipmentInformationQuantity_1st_Equipment");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Equipment Information 'Light-Emitting Diode (LED)--2' Validated Successfully",
				"Failed to Validate Equipment Information 'Light-Emitting Diode (LED)--2'", "TECOLighting",
				"EquipmentInformation_2nd_Equipment");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
				"Equipment Information 'Light-Emitting Diode (LED)--2 Quantity' Validated Successfully",
				"Failed to Validate Equipment Information 'Light-Emitting Diode (LED)--2 Quantity'", "TECOLighting",
				"EquipmentInformationQuantity_2nd_Equipment");

		clickWebelement("TECOLighting", "SubmitButton");
		threadWait(7000);
		TrackEnrollmentNumber("TECOLighting", "EnrollmentNumber");
		threadWait(2000);
	}

	public static void Verify_ApplicationWorkflowStep_ApplicantInformation_After_EditOnlineApplication() {
		login("Helper", "BaseURL", 2, 0, 2, 1);
		//ClickByActionClass("TECOLighting", "MainMenu", "ESG Values", "TECO_Lighting", 4, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		threadWait(2000);
		enterTextboxValue("TECOLighting", "EnterEnrollmentNo", "ESG Values", "TECO_Lighting", 2, 3);
		threadWait(3000);
		scrollToElement("TECOLighting", "SearchButton");
		clickWebelement("TECOLighting", "SearchButton");
		threadWait(3000);
		clickWebelement("TECOLighting", "EnrollmentLink");
		VerifyElementForExistingValueWithText("TECOLighting", "Status_Of_Application_Workflow_Step", "ESG Values",
				"TECO_Lighting", 110, 1);

		clickWebelement("TECOLighting", "ApplicationWorkflowStep");

		// Verify Applicant Information-Application Workflow Step
		Pass_Message("Verify Applicant Information-Application Workflow Step");
		
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_ApplicantInformation_ApplicationWorkflowStep_FirstName",
				"ESG Values", "TECO_Lighting", 6, 1);
		
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_ApplicantInformation_ApplicationWorkflowStep_LastName","ESG Values", "TECO_Lighting", 7, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_ApplicantInformation_ApplicationWorkflowStep_Email","ESG Values", "TECO_Lighting", 9, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_ApplicantInformation_ApplicationWorkflowStep_PrimaryPhone", "ESG Values",
				"TECO_Lighting", 8, 1);		
		
		// Verify Property Information-Application Workflow Step
		Pass_Message("Verify Property Information-Application Workflow Step");
				
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_PropertyInformation_ApplicationWorkflowStep_BuildingType",
				"ESG Values", "TECO_Lighting", 10, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_PropertyInformation_ApplicationWorkflowStep_OccupancyStatus",
				"ESG Values", "TECO_Lighting", 11, 1);

		// Verify Installer Information-Application Workflow Step
		Pass_Message("Verify Installer Information-Application Workflow Step");

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallerInformation_ApplicationWorkflowStep_CompanyName", "ESG Values", "TECO_Lighting", 26, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallerInformation_ApplicationWorkflowStep_ContactName", "ESG Values", "TECO_Lighting", 27, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallerInformation_ApplicationWorkflowStep_ContactPhone", "ESG Values", "TECO_Lighting", 28, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallerInformation_ApplicationWorkflowStep_ContactEmail", "ESG Values", "TECO_Lighting", 29, 1);

	}
	
	public static void Verify_ApplicationWorkflowStep_Documentation_After_EditOnlineApplication() {
		
		scrollToElement("TECOLighting", "Navigate_To_Documents_Tab");
		clickWebelement("TECOLighting", "Navigate_To_Documents_Tab");
		
	       // Verify Documentation-Application Workflow Step
			Pass_Message("Verify Documentation-Application Workflow Step");

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_UploadedDocuments_ApplicationWorkflowStep_Contractor", "ESG Values",
					"TECO_Lighting", 92, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_UploadedDocuments_ApplicationWorkflowStep_Worksheet", "ESG Values",
					"TECO_Lighting", 93, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_UploadedDocuments_ApplicationWorkflowStep_TechnicalSpecification",
					"ESG Values", "TECO_Lighting", 94, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_UploadedDocuments_ApplicationWorkflowStep_EnrollmentSupportingDocumentation",
					"ESG Values", "TECO_Lighting", 106, 1);
			
	}
	
	public static void Verify_ApplicationWorkflowStep_Measures_After_EditOnlineApplication() {

		scrollToElement("TECOLighting", "Navigate_To_Measure_Tab");
		clickWebelement("TECOLighting", "Navigate_To_Measure_Tab");
		
		// Verify Equipment Information-Application Workflow Step
		Pass_Message("Verify Equipment Information-Application Workflow Step");

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_LaborCost", "ESG Values", "TECO_Lighting", 115, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_TotalProjectCost", "ESG Values", "TECO_Lighting",
				116, 1);

		// Verify Light-Emitting Diode (LED)-1-Application Workflow Step
		Pass_Message("Verify Light-Emitting Diode (LED)-1-Application Workflow Step");

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_Quantity", "ESG Values",
				"TECO_Lighting", 119, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_InstalledFixtureDescription",
				"ESG Values", "TECO_Lighting", 120, 1);
		VerifyElementForExistingValueWithText("TECOLighting",
				"Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 121, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_InstalledTotalWatts",
				"ESG Values", "TECO_Lighting", 122, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_ExistingQuantity", "ESG Values",
				"TECO_Lighting", 123, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_ExistingFixture",
				"ESG Values", "TECO_Lighting", 124, 1);
		VerifyElementForExistingValueWithText("TECOLighting","Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 125, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_ExistingFixturesNotWorking",
				"ESG Values", "TECO_Lighting", 126, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_ExistingWattagePerFixture",
				"ESG Values", "TECO_Lighting", 127, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_ExistingTotalWatts", "ESG Values",
				"TECO_Lighting", 128, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_TotalWattageReduction",
				"ESG Values", "TECO_Lighting", 129, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_AnnualOperatingHours", "ESG Values",
				"TECO_Lighting", 130, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_Location",
				"ESG Values", "TECO_Lighting", 131, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_LightingCost",
				"ESG Values", "TECO_Lighting", 132, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED1_Notes",
				"ESG Values", "TECO_Lighting", 133, 1);

		// Verify Light-Emitting Diode (LED)-2-Application Workflow Step
		Pass_Message("Verify Light-Emitting Diode (LED)-2-Application Workflow Step");

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_Quantity", "ESG Values",
				"TECO_Lighting", 136, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_InstalledFixtureDescription",
				"ESG Values", "TECO_Lighting", 137, 1);
		VerifyElementForExistingValueWithText("TECOLighting",
				"Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 138, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_InstalledTotalWatts",
				"ESG Values", "TECO_Lighting", 139, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_ExistingQuantity", "ESG Values",
				"TECO_Lighting", 140, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_ExistingFixture",
				"ESG Values", "TECO_Lighting", 141, 1);
		VerifyElementForExistingValueWithText("TECOLighting",
				"Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 142, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_ExistingFixturesNotWorking",
				"ESG Values", "TECO_Lighting", 143, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_ExistingWattagePerFixture",
				"ESG Values", "TECO_Lighting", 144, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_ExistingTotalWatts", "ESG Values",
				"TECO_Lighting", 145, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_TotalWattageReduction",
				"ESG Values", "TECO_Lighting", 146, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_AnnualOperatingHours", "ESG Values",
				"TECO_Lighting", 147, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_Location",
				"ESG Values", "TECO_Lighting", 148, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_LightingCost",
				"ESG Values", "TECO_Lighting", 149, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_Light_EmittingDiode_LED2_Notes",
				"ESG Values", "TECO_Lighting", 150, 1);

		// Verify Measure Grid Grand Total - Application Workflow Step
		Pass_Message("Verify Measure Grid Grand Total - Application Workflow Step");
				
		scrollToElement("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_IncentiveAmount");
		WaitForElement(40, "TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_IncentiveAmount");
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_IncentiveAmount","ESG Values", "TECO_Lighting", 153, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_kWh","ESG Values", "TECO_Lighting", 154, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_kW","ESG Values", "TECO_Lighting", 155, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_WinterkW","ESG Values", "TECO_Lighting", 156, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_SummerkW","ESG Values", "TECO_Lighting", 157, 1);
		threadWait(5000);
		clickonProcess();
	}
	
	public static void Access_and_Verify_PreVerification_Workflow_Step_After_EditOnlineApplication() {
		
		clickWebelement("TECOLighting", "Access_PreVerification_Step");
		threadWait(3000);
		selectActualVisitDate();
		
		      // Verify Equipment Information-Pre-Verification Workflow Step
				Pass_Message("Verify Equipment Information-Pre-Verification Workflow Step");

				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_LaborCost", "ESG Values", "TECO_Lighting", 115, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_TotalProjectCost", "ESG Values", "TECO_Lighting",
						116, 1);

				// Verify Light-Emitting Diode (LED)-1-Pre-Verification Workflow Step
				Pass_Message("Verify Light-Emitting Diode (LED)-1-Pre-Verification Workflow Step");

				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_Quantity", "ESG Values",
						"TECO_Lighting", 119, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_InstalledFixtureDescription",
						"ESG Values", "TECO_Lighting", 120, 1);
				VerifyElementForExistingValueWithText("TECOLighting",
						"Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 121, 1);

				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_InstalledTotalWatts",
						"ESG Values", "TECO_Lighting", 122, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_ExistingQuantity", "ESG Values",
						"TECO_Lighting", 123, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_ExistingFixture",
						"ESG Values", "TECO_Lighting", 124, 1);
				VerifyElementForExistingValueWithText("TECOLighting","Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 125, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_ExistingFixturesNotWorking",
						"ESG Values", "TECO_Lighting", 126, 1);

				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_ExistingWattagePerFixture",
						"ESG Values", "TECO_Lighting", 127, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_ExistingTotalWatts", "ESG Values",
						"TECO_Lighting", 128, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_TotalWattageReduction",
						"ESG Values", "TECO_Lighting", 129, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_AnnualOperatingHours", "ESG Values",
						"TECO_Lighting", 130, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_Location",
						"ESG Values", "TECO_Lighting", 131, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_LightingCost",
						"ESG Values", "TECO_Lighting", 132, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED1_Notes",
						"ESG Values", "TECO_Lighting", 133, 1);

				// Verify Light-Emitting Diode (LED)-2-Pre-Verification Workflow Step
				Pass_Message("Verify Light-Emitting Diode (LED)-2-Pre-Verification Workflow Step");

				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_Quantity", "ESG Values",
						"TECO_Lighting", 136, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_InstalledFixtureDescription",
						"ESG Values", "TECO_Lighting", 137, 1);
				VerifyElementForExistingValueWithText("TECOLighting",
						"Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 138, 1);

				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_InstalledTotalWatts",
						"ESG Values", "TECO_Lighting", 139, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_ExistingQuantity", "ESG Values",
						"TECO_Lighting", 140, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_ExistingFixture",
						"ESG Values", "TECO_Lighting", 141, 1);
				VerifyElementForExistingValueWithText("TECOLighting",
						"Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 142, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_ExistingFixturesNotWorking",
						"ESG Values", "TECO_Lighting", 143, 1);

				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_ExistingWattagePerFixture",
						"ESG Values", "TECO_Lighting", 144, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_ExistingTotalWatts", "ESG Values",
						"TECO_Lighting", 145, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_TotalWattageReduction",
						"ESG Values", "TECO_Lighting", 146, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_AnnualOperatingHours", "ESG Values",
						"TECO_Lighting", 147, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_Location",
						"ESG Values", "TECO_Lighting", 148, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_LightingCost",
						"ESG Values", "TECO_Lighting", 149, 1);
				VerifyElementForExistingValueWithText("TECOLighting", "Verify_PreVerification_WorkflowStep_Light_EmittingDiode_LED2_Notes",
						"ESG Values", "TECO_Lighting", 150, 1);

				
		clickonProcess();
						
	}

	public static void RecordInstallationResult() {
		//Status Check for Installation
		OpenBrowser("TECOLighting", "StatusCheckURL");
		threadWait(3000);
		enterTextboxValue("TECOLighting", "EditbyEnrollmentNo", "ESG Values", "TECO_Lighting", 2, 3);
		enterTextboxValue("TECOLighting", "EditbyAccountNo", "ESG Values", "TECO_Lighting", 2, 1);
		clickWebelement("TECOLighting", "SearchButton");
		threadWait(3000);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_Record_Installation_Status_Message", "ESG Values", "TECO_Lighting",
				104, 1);
		clickWebelement("TECOLighting", "Record_Installation_Results_Button");
	}
	
	public static void Verify_RecordInstallationResult_OnlineApplication() {
		
	InstallationDate();
	

        // Verify Equipment Information-Record Installation Result Online Application
		Pass_Message("Verify Equipment Information-Record Installation Result Online Application");

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_LaborCost", "ESG Values", "TECO_Lighting", 39, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_TotalProjectCost", "ESG Values", "TECO_Lighting",
				40, 1);

		// Verify Light-Emitting Diode (LED)-1-Record Installation Result Online Application
		Pass_Message("Verify Light-Emitting Diode (LED)-1-Record Installation Result Online Application");

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_Quantity", "ESG Values",
				"TECO_Lighting", 119, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_InstalledFixtureDescription",
				"ESG Values", "TECO_Lighting", 120, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting",
				"Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 121, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_InstalledTotalWatts",
				"ESG Values", "TECO_Lighting", 122, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingQuantity", "ESG Values",
				"TECO_Lighting", 123, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingFixture",
				"ESG Values", "TECO_Lighting", 124, 1);
		VerifyElementForExistingValueWithText("TECOLighting","Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 125, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingFixturesNotWorking",
				"ESG Values", "TECO_Lighting", 126, 1);

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingWattagePerFixture",
				"ESG Values", "TECO_Lighting", 127, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingTotalWatts", "ESG Values",
				"TECO_Lighting", 128, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_TotalWattageReduction",
				"ESG Values", "TECO_Lighting", 129, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_AnnualOperatingHours", "ESG Values",
				"TECO_Lighting", 130, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_Location",
				"ESG Values", "TECO_Lighting", 131, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_LightingCost",
				"ESG Values", "TECO_Lighting", 57, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_Notes",
				"ESG Values", "TECO_Lighting", 133, 1);

		// Verify Light-Emitting Diode (LED)-2-Record Installation Result Online Application
		Pass_Message("Verify Light-Emitting Diode (LED)-2-Record Installation Result Online Application");

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_Quantity", "ESG Values",
				"TECO_Lighting", 136, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_InstalledFixtureDescription",
				"ESG Values", "TECO_Lighting", 137, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting",
				"Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 138, 1);

		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_InstalledTotalWatts",
				"ESG Values", "TECO_Lighting", 139, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingQuantity", "ESG Values",
				"TECO_Lighting", 140, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingFixture",
				"ESG Values", "TECO_Lighting", 141, 1);
		VerifyElementForExistingValueWithText("TECOLighting",
				"Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 142, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingFixturesNotWorking",
				"ESG Values", "TECO_Lighting", 143, 1);

		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingWattagePerFixture",
				"ESG Values", "TECO_Lighting", 144, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingTotalWatts", "ESG Values",
				"TECO_Lighting", 145, 1);
		VerifyElementForExistingValueWithText("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_TotalWattageReduction",
				"ESG Values", "TECO_Lighting", 146, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_AnnualOperatingHours", "ESG Values",
				"TECO_Lighting", 147, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_Location",
				"ESG Values", "TECO_Lighting", 148, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_LightingCost",
				"ESG Values", "TECO_Lighting", 74, 1);
		VerifyElementForExistingValueWithAttribute("TECOLighting", "Verify_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_Notes",
				"ESG Values", "TECO_Lighting", 150, 1);
		
		threadWait(3000);
		clickWebelement("TECOLighting", "NextButton");
		
	}
	
	public static void Complete_Documentation_RecordInstallationResult_OnlineApplication() {

		// Complete Documentation Record Installation Result Online Application
		Pass_Message("Complete Documentation Record Installation Result Online Application");

		clickWebelement("TECOLighting", "Record_Installation_Results_Online_Application_Add_Document");
		selectDropdown("TECOLighting", "Select_DocumentType","Select_DocumentType", "ESG Values", "TECO_Lighting", 160, 1);
		clickWebelement("TECOLighting", "Upload_File");
		try {
			UploadFile("TECOLighting", "FilePath_Upload_Invoice_Document");
		} catch (AWTException e) {
			System.out.println("Unable to Upload file");
		}
		clickWebelement("TECOLighting", "Comments_On_File");
		enterTextboxValue("TECOLighting", "Comments_On_File", "ESG Values", "TECO_Lighting", 161, 1);
		clickWebelement("TECOLighting", "Upload_Button");

		threadWait(3000);
		clickWebelement("TECOLighting", "NextButton");
		
	}
	
	public static void Verify_ReviewandSubmit_RecordInstallationResult_OnlineApplication() {
		
	        // Verify Equipment Information-Review and Submit Record Installation Result Online Application
			Pass_Message("Verify Equipment Information-Review and Submit Record Installation Result Online Application");

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_LaborCost", "ESG Values", "TECO_Lighting", 39, 2);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_TotalProjectCost", "ESG Values", "TECO_Lighting",
					40, 2);

			// Verify Light-Emitting Diode (LED)-1-Review and Submit Record Installation Result Online Application
			Pass_Message("Verify Light-Emitting Diode (LED)-1-Review and Submit Record Installation Result Online Application");

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_Quantity", "ESG Values",
					"TECO_Lighting", 119, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_InstalledFixtureDescription",
					"ESG Values", "TECO_Lighting", 120, 1);
			VerifyElementForExistingValueWithText("TECOLighting",
					"Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 121, 1);

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_InstalledTotalWatts",
					"ESG Values", "TECO_Lighting", 122, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingQuantity", "ESG Values",
					"TECO_Lighting", 123, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingFixture",
					"ESG Values", "TECO_Lighting", 124, 1);
			VerifyElementForExistingValueWithText("TECOLighting","Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 125, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingFixturesNotWorking",
					"ESG Values", "TECO_Lighting", 126, 1);

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingWattagePerFixture",
					"ESG Values", "TECO_Lighting", 127, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_ExistingTotalWatts", "ESG Values",
					"TECO_Lighting", 128, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_TotalWattageReduction",
					"ESG Values", "TECO_Lighting", 129, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_AnnualOperatingHours", "ESG Values",
					"TECO_Lighting", 130, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_Location",
					"ESG Values", "TECO_Lighting", 131, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_LightingCost",
					"ESG Values", "TECO_Lighting", 57, 2);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED1_Notes",
					"ESG Values", "TECO_Lighting", 133, 1);

			// Verify Light-Emitting Diode (LED)-2-Review and Submit Record Installation Result Online Application
			Pass_Message("Verify Light-Emitting Diode (LED)-2-Review and Submit Record Installation Result Online Application");

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_Quantity", "ESG Values",
					"TECO_Lighting", 136, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_InstalledFixtureDescription",
					"ESG Values", "TECO_Lighting", 137, 1);
			VerifyElementForExistingValueWithText("TECOLighting",
					"Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 138, 1);

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_InstalledTotalWatts",
					"ESG Values", "TECO_Lighting", 139, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingQuantity", "ESG Values",
					"TECO_Lighting", 140, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingFixture",
					"ESG Values", "TECO_Lighting", 141, 1);
			VerifyElementForExistingValueWithText("TECOLighting",
					"Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 142, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingFixturesNotWorking",
					"ESG Values", "TECO_Lighting", 143, 1);

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingWattagePerFixture",
					"ESG Values", "TECO_Lighting", 144, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_ExistingTotalWatts", "ESG Values",
					"TECO_Lighting", 145, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_TotalWattageReduction",
					"ESG Values", "TECO_Lighting", 146, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_AnnualOperatingHours", "ESG Values",
					"TECO_Lighting", 147, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_Location",
					"ESG Values", "TECO_Lighting", 148, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_LightingCost",
					"ESG Values", "TECO_Lighting", 74, 2);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_Light_EmittingDiode_LED2_Notes",
					"ESG Values", "TECO_Lighting", 150, 1);
			
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_ReviewandSubmit_RecordInstallationResults_OnlineApplication_InstallationDocument_Invoice",
					"ESG Values", "TECO_Lighting", 162, 1);
			
			scrollToElement("TECOLighting", "SubmitButton");
			WaitForElement(40, "TECOLighting", "SubmitButton");
			clickWebelement("TECOLighting", "SubmitButton");
			threadWait(5000);
			
		}
	
	public static void Verify_InstallationWorkflowStep_After_RecordInstallationResults() {
		login("Helper", "BaseURL", 2, 0, 2, 1);
		//clickWebelement("TECOLighting", "MainMenu", "ESG Values", "TECO_Lighting", 4, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		threadWait(2000);
		enterTextboxValue("TECOLighting", "EnterEnrollmentNo", "ESG Values", "TECO_Lighting", 2, 3);
		threadWait(3000);
		scrollToElement("TECOLighting", "SearchButton");
		clickWebelement("TECOLighting", "SearchButton");
		threadWait(5000);
		clickWebelement("TECOLighting", "EnrollmentLink");
		
		clickWebelement("TECOLighting", "Access_Installation_Workflow_Step");
		
			
	        // Verify Installation Workflow Step Measure Information - Cost Summary
			Pass_Message("Verify Installation Workflow Step Measure Information - Cost Summary");
			
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_PQty","ESG Values", "TECO_Lighting", 168, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_IQty","ESG Values", "TECO_Lighting", 169, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_IncentiveAmount","ESG Values", "TECO_Lighting", 170, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_kWh","ESG Values", "TECO_Lighting", 171, 1);
			/*VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_kW","ESG Values", "TECO_Lighting", 155, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_WinterkW","ESG Values", "TECO_Lighting", 156, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_Measure_ApplicationWorkflowStep_GrandTotal_Measure_SummerkW","ESG Values", "TECO_Lighting", 157, 1);*/
			
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_LaborCost", "ESG Values", "TECO_Lighting", 115, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_TotalProjectCost", "ESG Values", "TECO_Lighting",
					116, 1);

			// Verify Installation Workflow Step Measure Information Light-Emitting Diode (LED)-1
			Pass_Message("Verify Installation Workflow Step Measure Information Light-Emitting Diode (LED)-1");
			
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_PQty","ESG Values", "TECO_Lighting", 177, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_IQty","ESG Values", "TECO_Lighting", 178, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_IncentiveAmount","ESG Values", "TECO_Lighting", 179, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_kWh","ESG Values", "TECO_Lighting", 180, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_kW","ESG Values", "TECO_Lighting", 181, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_WinterkW","ESG Values", "TECO_Lighting", 182, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_SummerkW","ESG Values", "TECO_Lighting", 183, 1);
			
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_InstalledFixtureDescription",
					"ESG Values", "TECO_Lighting", 120, 1);
			VerifyElementForExistingValueWithText("TECOLighting",
					"Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 121, 1);

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_InstalledTotalWatts",
					"ESG Values", "TECO_Lighting", 122, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_ExistingQuantity", "ESG Values",
					"TECO_Lighting", 123, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_ExistingFixture",
					"ESG Values", "TECO_Lighting", 124, 1);
			VerifyElementForExistingValueWithText("TECOLighting","Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 125, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_ExistingFixturesNotWorking",
					"ESG Values", "TECO_Lighting", 126, 1);

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_ExistingWattagePerFixture",
					"ESG Values", "TECO_Lighting", 127, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_ExistingTotalWatts", "ESG Values",
					"TECO_Lighting", 128, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_TotalWattageReduction",
					"ESG Values", "TECO_Lighting", 129, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_AnnualOperatingHours", "ESG Values",
					"TECO_Lighting", 130, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_Location",
					"ESG Values", "TECO_Lighting", 131, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_LightingCost",
					"ESG Values", "TECO_Lighting", 132, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED1_Notes",
					"ESG Values", "TECO_Lighting", 133, 1);

			// Verify Installation Workflow Step Measure Information Light-Emitting Diode (LED)-2
			Pass_Message("Verify Installation Workflow Step Measure Information Light-Emitting Diode (LED)-2");
			
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_PQty","ESG Values", "TECO_Lighting", 186, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_IQty","ESG Values", "TECO_Lighting", 187, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_IncentiveAmount","ESG Values", "TECO_Lighting", 188, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_kWh","ESG Values", "TECO_Lighting", 189, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_kW","ESG Values", "TECO_Lighting", 190, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_WinterkW","ESG Values", "TECO_Lighting", 191, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_SummerkW","ESG Values", "TECO_Lighting", 192, 1);
			
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_InstalledFixtureDescription",
					"ESG Values", "TECO_Lighting", 137, 1);
			VerifyElementForExistingValueWithText("TECOLighting",
					"Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_InstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 138, 1);

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_InstalledTotalWatts",
					"ESG Values", "TECO_Lighting", 139, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_ExistingQuantity", "ESG Values",
					"TECO_Lighting", 140, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_ExistingFixture",
					"ESG Values", "TECO_Lighting", 141, 1);
			VerifyElementForExistingValueWithText("TECOLighting",
					"Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_ExistingFixtureDescription", "ESG Values", "TECO_Lighting", 142, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_ExistingFixturesNotWorking",
					"ESG Values", "TECO_Lighting", 143, 1);

			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_ExistingWattagePerFixture",
					"ESG Values", "TECO_Lighting", 144, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_ExistingTotalWatts", "ESG Values",
					"TECO_Lighting", 145, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_TotalWattageReduction",
					"ESG Values", "TECO_Lighting", 146, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_AnnualOperatingHours", "ESG Values",
					"TECO_Lighting", 147, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_Location",
					"ESG Values", "TECO_Lighting", 148, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_LightingCost",
					"ESG Values", "TECO_Lighting", 149, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_Light_EmittingDiode_LED2_Notes",
					"ESG Values", "TECO_Lighting", 150, 1);
			
						
			scrollToElement("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_GrandTotal_Incentive");
			WaitForElement(40, "TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_GrandTotal_Incentive");
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_GrandTotal_Incentive","ESG Values", "TECO_Lighting", 153, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_GrandTotal_kWh","ESG Values", "TECO_Lighting", 154, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_GrandTotal_kW","ESG Values", "TECO_Lighting", 155, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_GrandTotal_WinterkW","ESG Values", "TECO_Lighting", 156, 1);
			VerifyElementForExistingValueWithText("TECOLighting", "Verify_InstallationWorkflowStep_MeasureInformation_GrandTotal_SummerkW","ESG Values", "TECO_Lighting", 157, 1);
			
			clickWebelement("TECOLighting", "InstallationWorkflowStep_Employee");
			enterTextboxValue("TECOLighting", "SearchEmployee_Textbox", "ESG Values", "TECO_Lighting", 165, 1);
			threadWait(2000);
			Enter(KeyEvent.VK_ENTER);
			
			threadWait(3000);
			clickonProcess();
					
	}
	

	

}
