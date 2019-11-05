package com.esg.testclasses;

import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;
import com.esg.utilities.ReadExcel;
import com.relevantcodes.extentreports.LogStatus;

public class TECO_LightingTestClasses extends HelperClass {
	
	public static void OpenOnlineApplication() {
		setProperty("helper", "chrome", "Chrome_Path");
		openChrome();
		openURL("TECOLighting", "OnlineApplication");
		maximizeWindow();
		threadWait(2500);
	}
	public static void Step1_GettingStarted() {
		clickWebelement("TECOLighting", "AccountHolder");
		clickWebelement("TECOLighting", "AccountNumber");
		enterValueByActionClass("TECOLighting", "AccountNumber", "ESG Values", "TECO_Lighting", 2, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TECOLighting", "ZIP_or_PostalCode", "ESG Values", "TECO_Lighting", 3, 1);
		clickWebelement("TECOLighting", "Haveyoupurchased_or_installedanyequipment_No");
		clickWebelement("TECOLighting", "IslightingsystemONLYoperateduringnighttimehours_No");
		clickWebelement("TECOLighting", "Islightingsystemreplacingexistinglightingsystem_Yes");
		threadWait(3000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Customer Information", "Customer Information", "Customer Information", "Navigate to Customer Information Successfully", "Unable to Navigate to Customer Information", "TECOLighting", "VerifyCustomerInformation");	
	}
	
	public static void Step2_CustomerInformation() {
		clickWebelement("TECOLighting", "FirstName");
		enterValueByActionClass("TECOLighting", "FirstName", "ESG Values", "TECO_Lighting", 6, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TECOLighting", "LastName", "ESG Values", "TECO_Lighting", 7, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TECOLighting", "PrimaryPhone", "ESG Values", "TECO_Lighting", 8, 1);
		scrollToElement("TECOLighting", "BuildingType");
		selectDropdownByVisibleText("TECOLighting", "BuildingType", "ESG Values", "TECO_Lighting", 9, 1);
		selectDropdownByVisibleText("TECOLighting", "OccupancyStatus", "ESG Values", "TECO_Lighting", 10, 1);
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Installer Information", "Installer Information", "Installer Information", "Navigate to Installer Information Successfully", "Unable to Navigate to Installer Information", "TECOLighting", "VerifyInstallerInformation");	
	}
	public static void Step3_InstallerInformation() {
		clickWebelement("TECOLighting", "Company");
		enterValueByActionClass("TECOLighting", "Company", "ESG Values", "TECO_Lighting", 13, 1);
		threadWait(2000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("TECOLighting", "ContactName", "ESG Values", "TECO_Lighting", 14, 1);
		threadWait(1000);
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Payee Information", "Payee Information", "Payee Information", "Navigate to Payee Information Successfully", "Unable to Navigate to Payee Information", "TECOLighting", "VerifyPayeeInformation");	
	}
	public static void Step4_PayeeInformation() {
		clickWebelement("TECOLighting", "SelectAccountHolder");
		threadWait(3000);
		selectDropdownByVisibleText("TECOLighting", "TaxStatus", "ESG Values", "TECO_Lighting", 21, 1);
		clickWebelement("TECOLighting", "NextButton");
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information", "TECOLighting", "VerifyEquipmentInformation");	
	}
	public static void Step5_EquipmentInformation() {
		explicitWait(30, "TECOLighting", "AddEquipment");
		ClickWebelementByActionClass("TECOLighting", "AddEquipment");
		threadWait(2000);
		clickWebelement("TECOLighting", "SelectLighting");
		clickWebelement("TECOLighting", "OkButton");
		threadWait(2000);
		clickWebelement("TECOLighting", "LightingQuantity");
		enterTextboxValue("TECOLighting", "LightingQuantity", "ESG Values", "TECO_Lighting", 25, 1);
		clickWebelement("TECOLighting", "LightingAnticipatedDateImage");
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingInstalledFixtureDescription", "ESG Values", "TECO_Lighting", 26, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingInstalledWattagePerFixture", "ESG Values", "TECO_Lighting", 27, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingExistingQuantity", "ESG Values", "TECO_Lighting", 28, 1);
		Enter(KeyEvent.VK_TAB);
		selectDropdownByVisibleText("TECOLighting", "LightingExistingFixture", "ESG Values", "TECO_Lighting", 29, 1);
		Enter(KeyEvent.VK_TAB);
		selectDropdownByVisibleText("TECOLighting", "LightingExistingFixtureDescription", "ESG Values", "TECO_Lighting", 30, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingFixturesNotWorking", "ESG Values", "TECO_Lighting", 31, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingExistingWattagePerFixture", "ESG Values", "TECO_Lighting", 32, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingAnnualOperatingHours", "ESG Values", "TECO_Lighting", 33, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingLocation", "ESG Values", "TECO_Lighting", 34, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingCost", "ESG Values", "TECO_Lighting", 35, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("TECOLighting", "LightingNotes", "ESG Values", "TECO_Lighting", 36, 1);
		Enter(KeyEvent.VK_TAB);
	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'Installed total watts' Validated Successfully", "Failed to Validate 'Installed total watts'", "TECOLighting", "VerifyLightingInstalledTotalWatts");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'Existing total watts' Validated Successfully", "Failed to Validate 'Existing total watts'", "TECOLighting", "VerifyLightingExistingTotalWatts");	
		defineLogs("Equipment Information", "Equipment Information", "Equipment Information", "'Total wattage reduction' Validated Successfully", "Failed to Validate 'Total wattage reduction'", "TECOLighting", "VerifyLightingTotalWattageReduction");
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(5000);
		if (Xpath("TECOLighting", "Warning").isDisplayed()) {
			clickWebelement("TECOLighting", "AcceptWarning");
		} else {
			test.log(LogStatus.INFO, "Warning message was not displayed");
		}
		defineLogs("Incentive Summary", "Incentive Summary", "Incentive Summary", "Navigate to Incentive Summary Successfully", "Unable to Navigate to Incentive Summary", "TECOLighting", "VerifyIncentiveSummary");	
	}
	public static void Step6_IncentiveSummary() {
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Documentation", "Documentation", "Documentation", "Navigate to Documentation Successfully", "Unable to Navigate to Documentation", "TECOLighting", "VerifyDocumentation");	
	}
	public static void Step7_Documentation() {
		defineLogs("Documentation", "Documentation", "Documentation", "'Add Document' Validated Successfully", "Failed to Validate 'Add Document'", "TECOLighting", "VerifyAddDocument");
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions", "Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions", "TECOLighting", "VerifyTermsandCondition");	
	}
	public static void Step8_TermsandCondition() {
		clickWebelement("TECOLighting", "AcceptTermsandCondition");
		threadWait(2000);
		clickWebelement("TECOLighting", "NextButton");
		threadWait(2000);
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "TECOLighting", "VerifyReviewAndSubmit");	
	}
	
	public static  void TrackEnrollmentNumber(String FileName, String Webelement) {
		String input= Xpath(FileName, Webelement).getText();
		     String EnrollmentNo=input.replaceAll("[^0-9]", "");
		      System.out.println("\nEnrollment Numbers is: " + EnrollmentNo);
		      threadWait(5000);
		      ReadExcel.UpdateData("ESG Values", "TECO_Lighting", 2, 3,EnrollmentNo);
	}
	public static void Step9_ReviewandSubmit() {
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Customer Information' Validated Successfully", "Failed to Validate 'Customer Information'", "TECOLighting", "CustomerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Applicant Information' Validated Successfully", "Failed to Validate 'Applicant Information'", "TECOLighting", "ApplicantInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Installer Information' Validated Successfully", "Failed to Validate 'Installer Information'", "TECOLighting", "InstallerInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "'Payee Information' Validated Successfully", "Failed to Validate 'Payee Information'", "TECOLighting", "PayeeInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Equipment Information 'Lighting - Other' Validated Successfully", "Failed to Validate Equipment Information 'Lighting - Other'", "TECOLighting", "EquipmentInformation");
		defineLogs("Review and Submit", "Review and Submit", "Review and Submit", "Equipment Information 'Lighting - Other Quantity' Validated Successfully", "Failed to Validate Equipment Information 'Lighting - Other Quantity'", "TECOLighting", "EquipmentInformationQuantity");
		clickWebelement("TECOLighting", "SubmitButton");
		threadWait(7000);
		TrackEnrollmentNumber("TECOLighting", "EnrollmentNumber");
		threadWait(2000);
	}
	public static void VerifyEnrollment(){
		login("Helper","BaseURL44.0", 2, 0, 2, 1);
		ClickByActionClass("TECOLighting", "MainMenu", "ESG Values", "TECO_Lighting", 4, 1);
		threadWait(2000);
		enterTextboxValue("TECOLighting", "EnterEnrollmentNo", "ESG Values", "TECO_Lighting", 2, 3);
		threadWait(3000);
		scrollToElement("TECOLighting", "SearchButton");
		clickWebelement("TECOLighting", "SearchButton");
		threadWait(3000);
		clickWebelement("TECOLighting", "EnrollmentLink");
		clickWebelement("TECOLighting", "ApplicationWorkflowStep");
		
		scrollToElement("TECOLighting", "VerifyEnrollmentSummaryIncentiveAmount");
		threadWait(3000);
		defineLogs("Workflow Step Summary", "Workflow Step Summary", "Workflow Step Summary", "'Enrollment Summary Incentive Amount' Validated Successfully", "Failed to Validate 'Enrollment Summary Incentive Amount'", "TECOLighting", "VerifyEnrollmentSummaryIncentiveAmount");
	}
	public static void EditOnlineApplication(){
		OpenBrowser("TECOLighting", "EditApplicationURL");
		threadWait(3000);
		enterTextboxValue("TECOLighting", "EditbyEnrollmentNo", "ESG Values", "TECO_Lighting", 2, 3);
		enterTextboxValue("TECOLighting", "EditbyAccountNo", "ESG Values", "TECO_Lighting", 2, 1);
		clickWebelement("TECOLighting", "SearchButton");
		threadWait(3000);
	}

}
