package com.esg.testclasses;

import com.esg.utilities.HelperClass;

public class MonitorTestClass extends HelperClass{
	
	public static void LoginAndOpenApplication() {
		
		login("Helper","BaseURL", 1, 0, 1, 1);
		enterTextboxValue("Monitor", "MainMenu", "ESG Values", "Monitor", 1, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		clickWebelement("Monitor", "NewButton");
		selectDropdown("Monitor", "SelectProgram","Next Button", "ESG Values", "Monitor", 2, 1);
		clickWebelement("Monitor", "NextButton");
		enterTextboxValue("Monitor", "SearchType", "ESG Values", "Monitor", 3, 1);
		clickWebelement("Monitor", "SearchGo");
		clickWebelement("Monitor", "Customer");
		clickWebelement("Monitor", "NextGo");
	}
	public static void Monitor1() {
		scrollToElement("Monitor", "Measure");
		clickWebelement("Monitor", "Measure");
		threadWait(2500);
		clickWebelement("Monitor", "MeasureName");
		threadWait(2500);
		enterTextboxValue("Monitor", "MeasurePQty", "ESG Values", "Monitor", 4, 1);
		threadWait(2500);
		clickWebelement("Monitor", "Save");
		scrollToElement("Monitor", "Application");
		clickWebelement("Monitor", "Application");
		threadWait(2500);
		scrollToElement("Monitor", "TradeAllyEmployee");
		clickWebelement("Monitor", "TradeAllyEmployee");
		selectDropdown("Monitor", "SelectTradeAllyEmployee","TradeAllyEmployee", "ESG Values", "Monitor", 5, 1);
		clickWebelement("Monitor", "TradeAllySave");
		scrollToElement("Monitor", "ApplicationSave");
		clickWebelement("Monitor", "ApplicationSave");
		clickWebelement("Monitor", "EnrollmentProfile");
		scrollToElement("Monitor", "Monitors");
		clickWebelement("Monitor", "Monitors");
		threadWait(5000);
		defineLogs("Enrollment Profile - Monitors", "Monitor 1 Recipient Test: Applicant", "Monitor 1 Recipient Test: Applicant", "Workflow step of Monitor 1 is validated", "Workflow step of Monitor 1 is not verified", "Monitor", "VerifyMonitor1");
		defineLogs("Enrollment Profile - Monitors", "Monitor 2 Recipient Test: Trade Ally", "Monitor 2 Recipient Test: Trade Ally", "Workflow step of Monitor 2 is validated", "Workflow step of Monitor 2 is not verified", "Monitor", "VerifyMonitor2");
		defineLogs("Enrollment Profile - Monitors", "Monitor 3 Recipient Test: Other Email", "Monitor 3 Recipient Test: Other Email", "Workflow step of Monitor 3 is validated", "Workflow step of Monitor 3 is not verified", "Monitor", "VerifyMonitor3");
		defineLogs("Enrollment Profile - Monitors", "Monitor 4 Recipient Test: Application Processor", "Monitor 4 Recipient Test: Application Processor", "Workflow step of Monitor 4 is validated", "Workflow step of Monitor 4 is not verified", "Monitor", "VerifyMonitor4");
		defineLogs("Enrollment Profile - Monitors", "Monitor 5 Recipient Test: Group", "Monitor 5 Recipient Test: Group", "Workflow step of Monitor 5 is validated", "Workflow step of Monitor 5 is not verified", "Monitor", "VerifyMonitor5");
	}
	public static void Monitor2() {
		//enterTextboxValue("Monitor", "MainMenu", "ESG Values", "Monitor", 1, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		clickWebelement("Monitor", "NewButton");
		selectDropdown("Monitor", "SelectProgram","SelectProgram", "ESG Values", "Monitor", 2, 1);
		clickWebelement("Monitor", "NextButton");
		enterTextboxValue("Monitor", "SearchType", "ESG Values", "Monitor", 3, 1);
		clickWebelement("Monitor", "SearchGo");
		clickWebelement("Monitor", "Customer");
		clickWebelement("Monitor", "NextGo");
		scrollToElement("Monitor", "Measure");
		clickWebelement("Monitor", "Measure");
		threadWait(2500);
		clickWebelement("Monitor", "MeasureName");
		threadWait(2500);
		enterTextboxValue("Monitor", "MeasurePQty", "ESG Values", "Monitor", 4, 1);
		threadWait(2500);
		clickWebelement("Monitor", "Save");
		scrollToElement("Monitor", "Application");
		clickWebelement("Monitor", "Application");
		threadWait(2500);
		enterTextboxValue("Monitor", "EmailID", "ESG Values", "Monitor", 7, 1);
		scrollToElement("Monitor", "TradeAllyEmployee");
		clickWebelement("Monitor", "TradeAllyEmployee");
		handlePopup();
		selectDropdown("Monitor", "SelectTradeAllyEmployee","SelectTradeAllyEmployee", "ESG Values", "Monitor", 6, 1);
		clickWebelement("Monitor", "TradeAllySave");
		scrollToElement("Monitor", "ApplicationSave");
		clickWebelement("Monitor", "ApplicationSave");
		clickWebelement("Monitor", "Process");
		defineLogs("Pre-Inspection", "Pre-Inspection", "Pre-Inspection", "PreInspection Workflow step has been generated", "PreInspection workflow step is not generated", "Monitor", "preinspectionStep");
		clickWebelement("Monitor", "preinspectionStep");
		selectActualReviewDate();
		selectDropdown("Monitor", "AssignTo","AssignTo", "ESG Values", "Monitor", 8, 1);
		threadWait(5000);
		selectDropdown("Monitor", "Employee","Employee", "ESG Values", "Monitor", 9, 1);
		clickWebelement("Monitor", "PreSave");
		threadWait(2500);
		clickWebelement("Monitor", "OutcomeOnHold");
		threadWait(5000);
		clickWebelement("Monitor", "PreSave");
		threadWait(5000);
		clickWebelement("Monitor", "EnrollmentProfile2");
		scrollToElement("Monitor", "Monitors2");
		clickWebelement("Monitor", "Monitors2");
		defineLogs("Pre-Inspection", "Monitor 6 Recipient Test: Installer (pre-inspectio", "Monitor 6 Recipient Test: Installer (pre-inspectio", "Status of the Monitor 6 Recipient Test: Installer (pre-inspection) is Validated ", "Status of the Monitor 6 Recipient Test: Installer (pre-inspection) is not Validated", "Monitor", "StatusOfMonitor6");
		defineLogs("Pre-Inspection", "Monitor 7 Recipient Test: Installer Primary Contac", "Monitor 7 Recipient Test: Installer Primary Contac", "Status of the Monitor 7 Recipient Test: Installer Primary Contact is Validated ", "Status of the Monitor 6 Recipient Test: Installer (pre-inspection) is not Validated", "Monitor", "StatusOfMonitor7");
	}
	public static void Monitor3() {
		//enterTextboxValue("Monitor", "MainMenu", "ESG Values", "Monitor", 1, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		clickWebelement("Monitor", "NewButton");
		selectDropdown("Monitor", "SelectProgram","SelectProgram", "ESG Values", "Monitor", 2, 1);
		clickWebelement("Monitor", "NextButton");
		enterTextboxValue("Monitor", "SearchType", "ESG Values", "Monitor", 3, 1);
		clickWebelement("Monitor", "SearchGo");
		clickWebelement("Monitor", "Customer");
		clickWebelement("Monitor", "NextGo");
		scrollToElement("Monitor", "Measure");
		clickWebelement("Monitor", "Measure");
		threadWait(2500);
		clickWebelement("Monitor", "MeasureName");
		threadWait(2500);
		enterTextboxValue("Monitor", "MeasurePQty", "ESG Values", "Monitor", 4, 1);
		threadWait(2500);
		clickWebelement("Monitor", "Save");
		scrollToElement("Monitor", "Application");
		clickWebelement("Monitor", "Application");
		threadWait(2500);
		enterTextboxValue("Monitor", "EmailID", "ESG Values", "Monitor", 7, 1);
		scrollToElement("Monitor", "TradeAllyEmployee");
		clickWebelement("Monitor", "TradeAllyEmployee");
		handlePopup();
		selectDropdown("Monitor", "SelectTradeAllyEmployee","SelectTradeAllyEmployee", "ESG Values", "Monitor", 6, 1);
		clickWebelement("Monitor", "TradeAllySave");
		scrollToElement("Monitor", "ApplicationSave");
		clickWebelement("Monitor", "ApplicationSave");
		clickWebelement("Monitor", "Process");
		defineLogs("Pre-Inspection", "Pre-Inspection", "Pre-Inspection", "PreInspection Workflow step has been generated", "PreInspection workflow step is not generated", "Monitor", "preinspectionStep");
		clickWebelement("Monitor", "preinspectionStep");
		selectActualReviewDate();
		selectDropdown("Monitor", "AssignTo","AssignTo", "ESG Values", "Monitor", 8, 1);
		threadWait(5000);
		selectDropdown("Monitor", "Employee","Employee", "ESG Values", "Monitor", 9, 1);
		clickWebelement("Monitor", "PreSave");
		clickWebelement("Monitor", "PreInspectionProcess");
		defineLogs("Installation", "Installation", "Installation", "Installation Workflow step has been generated", "Installation workflow step is not generated", "Monitor", "Installation");
		clickWebelement("Monitor", "Installation");
		selectActualReviewDate();
		selectDropdown("Monitor", "AssignTo","AssignTo", "ESG Values", "Monitor", 10, 1);
		threadWait(5000);
		selectDropdown("Monitor", "Employee","Employee", "ESG Values", "Monitor", 11, 1);
		clickWebelement("Monitor", "PreSave");
		threadWait(2500);
		clickWebelement("Monitor", "InstallationProcess");
		defineLogs("Installation", "Installation", "Installation", "Installation Workflow step has been generated", "Installation workflow step is not generated", "Monitor", "Installation");
		clickWebelement("Monitor", "Inspection");
		selectActualReviewDate();
		selectDropdown("Monitor", "AssignTo","AssignTo", "ESG Values", "Monitor", 10, 1);
		threadWait(5000);
		selectDropdown("Monitor", "Employee","Employee", "ESG Values", "Monitor", 11, 1);
		clickWebelement("Monitor", "PreSave");
		threadWait(2500);
		clickWebelement("Monitor", "OutcomeOnHold");
		threadWait(5000);
		clickWebelement("Monitor", "PreSave");
		threadWait(2500);
		clickWebelement("Monitor", "EnrollmentProfile2");
		threadWait(2500);
		scrollToElement("Monitor", "Monitors2");
		clickWebelement("Monitor", "Monitors2");
		defineLogs("Inspection", "Monitor 8 Recipient Test: Installer (post-inspecti", "Monitor 8 Recipient Test: Installer (post-inspecti", "Status of the Monitor 8 Recipient Test: Installer (post-inspection) is Validated ", "Status of the Monitor 8 Recipient Test: Installer (post-inspection) is not Validated", "Monitor", "StatusOfMonitor6");
		defineLogs("Inspection", "Monitor 9 Recipient Test: Installer Primary Contac", "Monitor 9 Recipient Test: Installer Primary Contac", "Status of the Monitor 9 Recipient Test: Installer Primary Contact is Validated ", "Status of the Monitor 9 Recipient Test: Installer (pre-inspection) is not Validated", "Monitor", "StatusOfMonitor7");
Close();
	}
	
	public static void Enrollment_Cancelled_When_Monitor_Triggered_to_Cancel() {
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		clickWebelement("Monitor", "NewButton");
		selectDropdown("Monitor", "SelectProgram", "SelectProgram","ESG Values", "Monitor", 2, 1);
		clickWebelement("Monitor", "NextButton");
		enterTextboxValue("Monitor", "SearchType", "ESG Values", "Monitor", 3, 1);
		clickWebelement("Monitor", "SearchGo");
		clickWebelement("Monitor", "Customer");
		clickWebelement("Monitor", "NextGo");
		threadWait(2500);
		clickWebelement("Monitor", "OutcomeOnHold");
		threadWait(5000);
		clickonSave();
		//clickWebelement("Monitor", "PreSave");
	}

}
