package com.esg.testclasses;

import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;

public class AusSolarPvTestClass extends HelperClass {
	
	public static void login() {
		
		login("Helper","BaseURL", 1, 0, 1, 1);
		defineLogs("Logout", "Logout", "Logout", "User was Loggedin Successfully", "User is not able to Login","helper", "Logout_Xpath");
	}
	public static void NavigateToEnrollment() {
		ClickByActionClass("AusSolarPV", "MainMenu", "ESG Values", "Aus_Solar_PV", 1, 1);
		clickWebelement("AusSolarPV", "NewEnrollment");
		selectDropdownByVisibleText("AusSolarPV", "SelectProgram", "ESG Values", "Aus_Solar_PV", 2, 1);
		clickWebelement("AusSolarPV", "NextButton");
		enterTextboxValue("AusSolarPV", "AccountNumber", "ESG Values", "Aus_Solar_PV", 3, 1);
		clickWebelement("AusSolarPV", "Go");
		doubleClickWebelement("AusSolarPV", "Customer");
		threadWait(5000);
		defineLogs("Application - Applicant Information - New", "Application - Applicant Information - New", "Application - Applicant Information - New", "Enrollment was Created Successfully", "Enrollment was not Created", "helper", "Varify_Enrollment");	
	}
	public static void CompleteApplicationWorkflowStep() {
		selectDropdownByVisibleText("AusSolarPV", "BatteryStorage", "ESG Values", "Aus_Solar_PV", 4, 1);
		selectDropdownByVisibleText("AusSolarPV", "ExistingSystem", "ESG Values", "Aus_Solar_PV", 5, 1);
		enterTextboxValue("AusSolarPV", "kWhcapacity", "ESG Values", "Aus_Solar_PV", 6, 1);
		scrollToElement("AusSolarPV", "ConstructionType");
		selectDropdownByVisibleText("AusSolarPV", "ConstructionType", "ESG Values", "Aus_Solar_PV", 7, 1);
		enterTextboxValue("AusSolarPV", "TaxAssessorPropertyID", "ESG Values", "Aus_Solar_PV", 8, 1);
		scrollToElement("AusSolarPV", "Save");
		clickonSave();
		scrollToElement("AusSolarPV", "YearHomeBuild");
		defineLogs("Year Home Built", "Year Home Built","Year Home Built", "YearHomeBuild field was varified", "YearHomeBuild field was not varified","AusSolarPV", "YearHomeBuild");
		defineLogs("Address Reported from TCAD/WCAD", "Address Reported from TCAD/WCAD","Address Reported from TCAD/WCAD", "AddressReported field was varified", "AddressReported field was not varified","AusSolarPV", "AddressReported");
		clickWebelement("AusSolarPV", "TradeAlleyAdd");
		clickWebelement("AusSolarPV", "Primary");
		threadWait(5000);
		selectDropdownByVisibleText("AusSolarPV", "TradeAllyType", "ESG Values", "Aus_Solar_PV", 16, 1);
		threadWait(2500);
		selectDropdownByVisibleText("AusSolarPV", "TradeAlly_Employee", "ESG Values", "Aus_Solar_PV", 17, 1);
		clickWebelement("AusSolarPV", "TradeAllySave");
		threadWait(2500);
		clickWebelement("AusSolarPV", "TradeAllyCheckBox");
		threadWait(2500);
		clickWebelement("AusSolarPV", "TradeAllyRemove");
		clickWebelement("AusSolarPV", "YesOption");
		clickWebelement("AusSolarPV", "PayeeIntsaller");
		enterTextboxValue("AusSolarPV", "BatteryStorage", "ESG Values", "Aus_Solar_PV", 18, 1);
		threadWait(2500);
		clickonSave();
	}
	public static void CompleteMeasure() {
		scrollToElement("AusSolarPV", "MeasureSub");
		threadWait(2500);
		clickWebelement("AusSolarPV", "MeasureSub");
		clickWebelement("AusSolarPV", "Measurecost");
		threadWait(2500);
		enterValueByActionClass("AusSolarPV", "MeasurecostInput", "ESG Values", "Aus_Solar_PV", 21, 1);
		clickWebelement("AusSolarPV", "InverterType1Manufacturing");
		enterValueByActionClass("AusSolarPV", "InverterType1Manufacturing", "ESG Values", "Aus_Solar_PV", 22, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "InverterType1Model", "ESG Values", "Aus_Solar_PV", 23, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "InverterType1InverterNumber", "ESG Values", "Aus_Solar_PV", 24, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Isthereanadditionalinvertertype", "ESG Values", "Aus_Solar_PV", 25, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation1ArrayAzimuth", "ESG Values", "Aus_Solar_PV", 26, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation1ArrayTilt", "ESG Values", "Aus_Solar_PV", 27, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation1PVModuleManufacturer", "ESG Values", "Aus_Solar_PV", 28, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation1PVModuleModel", "ESG Values", "Aus_Solar_PV", 29, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation1PVModules", "ESG Values", "Aus_Solar_PV", 30, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Isthereanadditionalorientation2", "ESG Values", "Aus_Solar_PV", 31, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		clickWebelement("AusSolarPV", "Isthereanadditionalorientation1");
		scrollToElement("AusSolarPV", "Orientation2ArrayAzimuth");
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation2ArrayAzimuth", "ESG Values", "Aus_Solar_PV", 32, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation2ArrayTilt", "ESG Values", "Aus_Solar_PV", 33, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation2PVModuleManufacturer", "ESG Values", "Aus_Solar_PV", 34, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation2PVModuleModel", "ESG Values", "Aus_Solar_PV", 35, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation2PVModules", "ESG Values", "Aus_Solar_PV", 36, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "IsThereA3rdOrientation1", "ESG Values", "Aus_Solar_PV", 37, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(4000);
		clickWebelement("AusSolarPV", "IsThereA3rdOrientation");
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation3ArrayAzimuth", "ESG Values", "Aus_Solar_PV", 38, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation3ArrayTilt", "ESG Values", "Aus_Solar_PV", 39, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation3PVModuleManufacturer", "ESG Values", "Aus_Solar_PV", 40, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation3PVModuleModel", "ESG Values", "Aus_Solar_PV", 41, 1);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation3PVModules", "ESG Values", "Aus_Solar_PV", 42, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("AusSolarPV", "Orientation3PVModules", "ESG Values", "Aus_Solar_PV", 43, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
	}
	public static void VerifyAndProcessApplicationWorkflowStep() {
		defineLogs("Inverter Type 1 - PV Inverter Power Rating:", "Inverter Type 1 - PV Inverter Power Rating:", "Inverter Type 1 - PV Inverter Power Rating:", "Inverter Type-1 field was Validated", "Inverter Type-1 field was not Validated","AusSolarPV", "InverterType1PVInverterPowerRating");
		defineLogs("Orientation 1 - STC Rating per Module (Watts):", "Orientation 1 - STC Rating per Module (Watts):", "Orientation 1 - STC Rating per Module (Watts):", "Orientation-1 STC Rating field was Validated", "Orientation-1 STC Rating field was not Validated","AusSolarPV", "Orientation1STCRatingperModule");
		defineLogs("Orientation 1 - Array Annual Generation kWh:", "Orientation 1 - Array Annual Generation kWh:", "Orientation 1 - Array Annual Generation kWh:", "Orientation-1 Array Annual field was Validated", "Orientation-1 Array Annual field was not Validated","AusSolarPV", "Orientation1ArrayAnnualGenerationkWh");
		defineLogs("Orientation 2 - STC Rating per Module (Watts):", "Orientation 2 - STC Rating per Module (Watts):", "Orientation 2 - STC Rating per Module (Watts):", "Orientation-2 STC Rating field was Validated", "Orientation-2 STC Rating field was not Validated","AusSolarPV", "Orientation2STCRatingperModule");
		defineLogs("Orientation 2 - Array Annual Generation kWh:", "Orientation 2 - Array Annual Generation kWh:", "Orientation 2 - Array Annual Generation kWh:", "Orientation-2 Array Annual field was Validated", "Orientation-2 Array Annual field was not Validated","AusSolarPV", "Orientation2ArrayAnnualGenerationkWh");
		defineLogs("Orientation 3 - STC Rating per Module (Watts):", "Orientation 3 - STC Rating per Module (Watts):", "Orientation 3 - STC Rating per Module (Watts):", "Orientation-3 STC Rating field was Validated", "Orientation-3 STC Rating field was not Validated","AusSolarPV", "Orientation3STCRatingperModule");
		defineLogs("Orientation 3 - Array Annual Generation kWh:", "Orientation 3 - Array Annual Generation kWh:", "Orientation 3 - Array Annual Generation kWh:", "Orientation-3 Array Annual field was Validated", "Orientation-3 Array Annual field was not Validated","AusSolarPV", "MeasureName");
		defineLogs("System Inverter Rating:", "System Inverter Rating:", "System Inverter Rating:", "SystemInverterRating field was Validated", "SystemInverterRating field was not Validated","AusSolarPV", "SystemInverterRating");
		defineLogs("Array Capacity kW (DC):", "Array Capacity kW (DC):", "Array Capacity kW (DC):", "ArrayCapacitykW(DC) field was Validated", "ArrayCapacitykW(DC) field was not Validated","AusSolarPV", "ArrayCapacitykW_DC");
		defineLogs("Array Capacity kW (AC):", "Array Capacity kW (AC):", "Array Capacity kW (AC):", "ArrayCapacitykW(AC) field was Validated", "ArrayCapacitykW(AC) field was not Validated","AusSolarPV", "MeasureName");
		defineLogs("Array Annual Generation kWh:", "Array Annual Generation kWh:", "Array Annual Generation kWh:", "ArrayAnnualGenerationkWh field was Validated", "ArrayAnnualGenerationkWh field was not Validated","AusSolarPV", "ArrayAnnualGenerationkWh");
		defineLogs("Total Requested Incentive Amount:", "Total Requested Incentive Amount:", "Total Requested Incentive Amount:", "TotalRequestedIncentiveAmount field was Validated", "TotalRequestedIncentiveAmount field was not Validated","AusSolarPV", "TotalRequestedIncentiveAmount");
		defineLogs("Measure Cost", "Measure Cost", "Measure Cost", "TotalMeasureCost field was Validated", "TotalMeasureCost field was not Validated","AusSolarPV", "TotalMeasureCost");
		defineLogs("Incentive", "Incentive", "Incentive", "TotalIncentive field was Validated", "TotalIncentive field was not Validated","AusSolarPV", "TotalIncentive");
		defineLogs("kWh", "kWh", "kWh", "TotalkWh field was Validated", "TotalkWh field was not Validated","AusSolarPV", "TotalkWh");
		defineLogs("kW", "kW", "kW", "TotalkW field was Validated", "TotalkW field was not Validated","AusSolarPV", "TotalkW");
		clickonSave();
		clickonProcess();
		threadWait(5000);
	}
	public static void ReviewAndProcess_ApplicationWorkflowStep() {
		defineLogs("Open - In Review", "Open - In Review", "Open - In Review", "Application Review Status was Validated", "Application Review Status was not Validated","AusSolarPV", "ApplicationReviewStatus");
		clickWebelement("AusSolarPV", "ApplicationWorkflowStep");
		threadWait(2000);
		clickWebelement("AusSolarPV", "ApplicationOutcome");
		enterValueByActionClass("AusSolarPV", "ApplicationOutcome", "ESG Values", "Aus_Solar_PV", 61, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
		defineLogs("Open - Pending Acceptance", "Open - Pending Acceptance", "Open - Pending Acceptance", "Application Acceptance Status was Validated", "Application Acceptance Status was not Validated","AusSolarPV", "ApplicationAcceptedStatus");
		clickWebelement("AusSolarPV", "ApplicationWorkflowStep");
		threadWait(2000);
		clickWebelement("AusSolarPV", "ApplicationOutcome");
		enterValueByActionClass("AusSolarPV", "ApplicationOutcome", "ESG Values", "Aus_Solar_PV", 62, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonProcess();
		defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Application Workflow Step was Validated", "Application Workflow Step was not Validated", "AusSolarPV", "OpenStatus");
	}
	public static void Process_Pre_InspectionWorkflowStep() {
		clickWebelement("AusSolarPV", "Pre_InspectionWorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		selectLOIApprovedDate();
		clickWebelement("AusSolarPV", "AssignTo");
		enterValueByActionClass("AusSolarPV", "AssignTo", "ESG Values", "Aus_Solar_PV", 65, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		threadWait(3000);
		clickWebelement("AusSolarPV", "Employee");
		enterValueByActionClass("AusSolarPV", "Employee", "ESG Values", "Aus_Solar_PV", 66, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
		defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Pre_Inspection Workflow Step was Validated", "Pre_Inspection Workflow Step was not Validated", "AusSolarPV", "OpenStatus");
	}
	public static void Process_InstallationWorkflowStep() {
		clickWebelement("AusSolarPV", "InstallationWorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickonSave();
		clickonProcess();
		defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Installation Workflow Step was Validated", "Installation Workflow Step was not Validated", "AusSolarPV", "OpenStatus");
	}
	public static void Process_DocumentReviewWorkflowStep() {
		clickWebelement("AusSolarPV", "DocumentReviewWorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickWebelement("AusSolarPV", "AssignTo");
		enterValueByActionClass("AusSolarPV", "AssignTo", "ESG Values", "Aus_Solar_PV", 65, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		threadWait(3000);
		clickWebelement("AusSolarPV", "Employee");
		enterValueByActionClass("AusSolarPV", "Employee", "ESG Values", "Aus_Solar_PV", 66, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
		defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Document Review Workflow Step was Validated", "Document Review Workflow Step was not Validated", "AusSolarPV", "OpenStatus");
	}
	public static void Process_InspectionWorkflowStep() {
		clickWebelement("AusSolarPV", "InspectionWorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickWebelement("AusSolarPV", "AssignTo");
		enterValueByActionClass("AusSolarPV", "AssignTo", "ESG Values", "Aus_Solar_PV", 65, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		threadWait(3000);
		clickWebelement("AusSolarPV", "Employee");
		enterValueByActionClass("AusSolarPV", "Employee", "ESG Values", "Aus_Solar_PV", 66, 1);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("AusSolarPV", "FailedQtySection");
		threadWait(3000);
		//clickWebelement("AusSolarPV", "EnterFailedQty");
		enterValueByActionClass("AusSolarPV", "EnterFailedQty", "ESG Values", "Aus_Solar_PV", 69, 1);
		clickonSave();
		clickonProcess();
		defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Inspection Workflow Step was Validated", "Inspection Workflow Step was not Validated", "AusSolarPV", "OpenStatus");
	}
	public static void Process_QA_ReviewWorkflowStep() {
		clickWebelement("AusSolarPV", "QAReviewWorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickWebelement("AusSolarPV", "AssignTo");
		enterValueByActionClass("AusSolarPV", "AssignTo", "ESG Values", "Aus_Solar_PV", 65, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		threadWait(3000);
		clickWebelement("AusSolarPV", "Employee");
		enterValueByActionClass("AusSolarPV", "Employee", "ESG Values", "Aus_Solar_PV", 66, 1);
		Enter(KeyEvent.VK_ENTER);
		selectReadyForPayment();
		clickonSave();
		clickonProcess();
		defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "QA-Review Workflow Step was Validated", "QA-Review Workflow Step was not Validated", "AusSolarPV", "OpenStatus");
	}
	public static void Process_InitiatePaymentWorkflowStep() {
		clickWebelement("AusSolarPV", "InitiatePaymentWorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickWebelement("AusSolarPV", "AssignTo");
		enterValueByActionClass("AusSolarPV", "AssignTo", "ESG Values", "Aus_Solar_PV", 65, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		threadWait(3000);
		clickWebelement("AusSolarPV", "Employee");
		enterValueByActionClass("AusSolarPV", "Employee", "ESG Values", "Aus_Solar_PV", 66, 1);
		Enter(KeyEvent.VK_ENTER);
		selectReadyForPayment();
		clickonSave();
		clickonProcess();
		defineLogs("Payment Request Date", "Payment Request Date", "Payment Request Date", "Initiate Payment Workflow Step was Validated", "Initiate Payment Workflow Step was not Validated", "AusSolarPV", "PaymentRequestDate");
	}
	public static void Generate_PaymentRequest() {
		defineLogs("Payment Request Date", "Payment Request Date", "Payment Request Date", "Payment Request Date was Validated", "Payment Request Date was not Validated", "AusSolarPV", "PaymentRequest_Datelink");
		defineLogs("Payee", "Payee", "Payee", "Payment Request Payee was Validated", "Payment Request Payee was not Validated", "AusSolarPV", "PaymentRequest_Payee");
		defineLogs("Amount", "Amount", "Amount", "Payment Request Amount was Validated", "Payment Request Amount was not Validated", "AusSolarPV", "PaymentRequest_Amount");
		clickWebelement("AusSolarPV", "PaymentRequest_Datelink");
		threadWait(2000);
		//Enter Address Sequence
		/*clickWebelement("AusSolarPV", "AddressSequenceNumber");
		enterValueByActionClass("AusSolarPV", "AddressSequenceNumber", "ESG Values", "Aus_Solar_PV", 71, 1);
		Enter(KeyEvent.VK_ENTER);*/
		defineLogs("Invoice Total", "Invoice Total", "Invoice Total", "Invoice Total was Validated", "Invoice Total was not Validated", "AusSolarPV", "InvoiceTotal");
		clickWebelement("AusSolarPV", "ApproveButton");
		//handlePopup();
		threadWait(2000);
		clickWebelement("AusSolarPV", "CloseButton");
	}
}
