package com.esg.testclasses;

import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;

public class SDGE_EEBI_TestClasses extends HelperClass {
	
public static void login() {
		
		login("helper","BaseURL44.0", 1, 0, 1, 1);
	}
public static void NavigateToEnrollment() {
		ClickByActionClass("SDGEEEBI", "MainMenu", "ESG Values", "SDGE_EEBI", 1, 1);
		clickWebelement("SDGEEEBI", "NewEnrollment");
		selectDropdownByVisibleText("SDGEEEBI", "SelectProgram", "ESG Values", "SDGE_EEBI", 2, 1);
		clickWebelement("SDGEEEBI", "NextButton");
		enterTextboxValue("SDGEEEBI", "AccountNumber", "ESG Values", "SDGE_EEBI", 3, 1);
		clickWebelement("SDGEEEBI", "Go");
		doubleClickWebelement("SDGEEEBI", "Customer");
		threadWait(2000);
		ReadPopUp();
		threadWait(5000);
		defineLogs("Application - Applicant Information - New", "Application - Applicant Information - New", "Application - Applicant Information - New", "Enrollment was Created Successfully", "Enrollment was not Created", "helper", "Varify_Enrollment");	
	}
public static void CompleteApplicationWorkflowStep() {
	clickWebelement("SDGEEEBI", "Calculation_Tool");
	enterValueByActionClass("SDGEEEBI", "Calculation_Tool", "ESG Values", "SDGE_EEBI", 6, 1);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("SDGEEEBI", "Qualified_for_PartnerIncentiveRate");
	enterValueByActionClass("SDGEEEBI", "Qualified_for_PartnerIncentiveRate", "ESG Values", "SDGE_EEBI", 7, 1);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("SDGEEEBI", "Financing");
	enterValueByActionClass("SDGEEEBI", "Financing", "ESG Values", "SDGE_EEBI", 8, 1);
	Enter(KeyEvent.VK_ENTER);
	scrollToElement("SDGEEEBI", "School_ID");
	clickWebelement("SDGEEEBI", "Prop_39_Funding");
	enterValueByActionClass("SDGEEEBI", "Prop_39_Funding", "ESG Values", "SDGE_EEBI", 9, 1);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("SDGEEEBI", "Public_K12_School");
	enterValueByActionClass("SDGEEEBI", "Public_K12_School", "ESG Values", "SDGE_EEBI", 10, 1);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("SDGEEEBI", "Engineer_Assisted_Application");
	clickWebelement("SDGEEEBI", "Expedite_Review");
	enterTextboxValue("SDGEEEBI", "Project_Sponsor", "ESG Values", "SDGE_EEBI", 11, 1);
	enterTextboxValue("SDGEEEBI", "School_ID", "ESG Values", "SDGE_EEBI", 12, 1);
	SelectIncentiveAgreementTargetDate();
	scrollToElement("SDGEEEBI", "Building_Type");
	clickWebelement("SDGEEEBI", "Building_Type");
	enterValueByActionClass("SDGEEEBI", "Building_Type", "ESG Values", "SDGE_EEBI", 13, 1);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("SDGEEEBI", "Occupancy_Status");
	enterValueByActionClass("SDGEEEBI", "Occupancy_Status", "ESG Values", "SDGE_EEBI", 14, 1);
	Enter(KeyEvent.VK_ENTER);
	enterTextboxValue("SDGEEEBI", "Total_Sq_Ft_of_Facility", "ESG Values", "SDGE_EEBI", 15, 1);
	enterTextboxValue("SDGEEEBI", "Years_Since_Built_or_Last_Renovation", "ESG Values", "SDGE_EEBI", 16, 1);
	enterTextboxValue("SDGEEEBI", "Number_of_Floors", "ESG Values", "SDGE_EEBI", 17, 1);
	SelectEstimatedInstallationCompletionDate();
	scrollToElement("SDGEEEBI", "Tax_Status");
	clickWebelement("SDGEEEBI", "Account_Executive");
	enterValueByActionClass("SDGEEEBI", "Account_Executive", "ESG Values", "SDGE_EEBI", 18, 1);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("SDGEEEBI", "Tax_Status");
	enterValueByActionClass("SDGEEEBI", "Tax_Status", "ESG Values", "SDGE_EEBI", 19, 1);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("SDGEEEBI", "Tax_Id_Type");
	enterValueByActionClass("SDGEEEBI", "Tax_Id_Type", "ESG Values", "SDGE_EEBI", 20, 1);
	Enter(KeyEvent.VK_ENTER);
	threadWait(2000);
	enterTextboxValue("SDGEEEBI", "Tax_Id_or_SSN", "ESG Values", "SDGE_EEBI", 21, 1);
	clickWebelement("SDGEEEBI", "Address_Section");
	clickonSave();
}
public static void CompleteMeasureAndProcessApplication() {
	scrollToElement("SDGEEEBI", "MeasureSection");
	clickWebelement("SDGEEEBI", "MeasureSection");
	threadWait(3000);
	clickWebelement("SDGEEEBI", "AddMeasureImage");
	threadWait(2000);
	clickWebelement("SDGEEEBI", "AddMeasurePopup");
	clickWebelement("SDGEEEBI", "SelectMeasure");
	clickWebelement("SDGEEEBI", "SaveMeasure");
	threadWait(6000);
	clickWebelement("SDGEEEBI", "MeasurePropertyGrid");
	threadWait(2000);
	scrollToElement("SDGEEEBI", "EnterMeasureQTY");
	enterTextboxValue("SDGEEEBI", "EnterMeasureQTY", "ESG Values", "SDGE_EEBI", 24, 1);
	enterTextboxValue("SDGEEEBI", "MeasureDescrption", "ESG Values", "SDGE_EEBI", 25, 1);
	enterTextboxValue("SDGEEEBI", "ExistingEquipmentDescription", "ESG Values", "SDGE_EEBI", 26, 1);
	enterTextboxValue("SDGEEEBI", "CodeEquipmentDescription", "ESG Values", "SDGE_EEBI", 27, 1);
	
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "TechnologyType", "ESG Values", "SDGE_EEBI", 28, 1);
	Enter(KeyEvent.VK_ENTER);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "MeasureCostTextbox", "ESG Values", "SDGE_EEBI", 29, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "BaseEquipmentCost", "ESG Values", "SDGE_EEBI", 30, 1);
	
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "DefaultEUL", "ESG Values", "SDGE_EEBI", 31, 1);
	Enter(KeyEvent.VK_ENTER);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "RevisedEUL", "ESG Values", "SDGE_EEBI", 32, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "BlendedEUL", "ESG Values", "SDGE_EEBI", 33, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "ExistingEquipmentRUL", "ESG Values", "SDGE_EEBI", 34, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "ExistingEquipmentVintage", "ESG Values", "SDGE_EEBI", 35, 1);
	
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "InteractiveEffects", "ESG Values", "SDGE_EEBI", 36, 1);
	Enter(KeyEvent.VK_ENTER);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "GRR_kWh", "ESG Values", "SDGE_EEBI", 37, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "GRR_kW", "ESG Values", "SDGE_EEBI", 38, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "GRR_Therm", "ESG Values", "SDGE_EEBI", 39, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "ExistingBaselinekWhSavings", "ESG Values", "SDGE_EEBI", 40, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "ExistingBaselinekWSavings", "ESG Values", "SDGE_EEBI", 41, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "ExistingBaselineThermSavings", "ESG Values", "SDGE_EEBI", 42, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "ExistingBaselineThermSavings1", "ESG Values", "SDGE_EEBI", 43, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "Code_ISPBaselinekWhSavings", "ESG Values", "SDGE_EEBI", 44, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "Code_ISPkWSavings", "ESG Values", "SDGE_EEBI", 45, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "Code_ISPThermSavings", "ESG Values", "SDGE_EEBI", 46, 1);
	Enter(KeyEvent.VK_TAB);
	defineLogs("Incremental Cost:", "Incremental Cost:", "Incremental Cost:", "Incremental Cost updated successfully", "Incremental Cost was not updated","SDGEEEBI", "IncrementalCost");
	clickonSave();
	scrollToElement("SDGEEEBI", "ExistingBaselineThermSavings");
	defineLogs("Measure Cost", "Measure Cost", "Measure Cost", "Measure Cost updated successfully", "Measure Cost was not updated","SDGEEEBI", "TotalMeasureCost");
	defineLogs("Inc. Measure Cost", "Inc. Measure Cost", "Inc. Measure Cost", "Inc. Measure Cost updated successfully", "Inc. Measure Cost was not updated","SDGEEEBI", "TotalInc_MeasureCost");
	defineLogs("Incentive", "Incentive", "Incentive", "Incentive Cost updated successfully", "Incentive Cost was not updated","SDGEEEBI", "TotalIncentive");
	defineLogs("kWh", "kWh", "kWh", "kWh updated successfully", "kWh not updated","SDGEEEBI", "TotalkWh");
	defineLogs("kW", "kW", "kW", "kW updated successfully", "kW not updated","SDGEEEBI", "TotalkW");
	defineLogs("Therms", "Therms", "Therms", "Therms updated successfully", "Therms not updated","SDGEEEBI", "TotalTherms");
	defineLogs("Total Cost:", "Total Cost:", "Total Cost:", "Total Summary Cost updated successfully", "Total Summary Cost not updated","SDGEEEBI", "WorkflowSummaryTotalCost");
	clickonProcess();
	ReadPopUp();
	defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Application Workflow Step was Validated", "Application Workflow Step was not Validated", "SDGEEEBI", "OpenStatus");
}
public static void Process_Pre_InspectionWorkflowStep() {
	clickWebelement("SDGEEEBI", "Pre_InspectionWorkflowStep");
	threadWait(3000);
	selectActualVisitDate();
	clickonProcess();
	if (driver.getPageSource().contains("Workflow Step Warnings")) {
		handleMultipleWindow("SDGEEEBI", "HandleWarning");
	}
	defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Pre_Inspection Workflow Step was Validated", "Pre_Inspection Workflow Step was not Validated", "SDGEEEBI", "OpenStatus");
}
public static void Process_Pre_EngineeringWorkflowStep() {
	clickWebelement("SDGEEEBI", "Pre_EngineeringWorkflowStep");
	threadWait(3000);
	selectActualVisitDate();
	clickonProcess();
	if (driver.getPageSource().contains("Workflow Step Warnings")) {
		handleMultipleWindow("SDGEEEBI", "HandleWarning");
	}
	defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Pre-Engineering Workflow Step was Validated", "Pre-Engineering Workflow Step was not Validated", "SDGEEEBI", "OpenStatus");
}
public static void Process_InstallationWorkflowStep() {
	clickWebelement("SDGEEEBI", "InstallationWorkflowStep");
	threadWait(3000);
	
	clickWebelement("SDGEEEBI", "UpdateMeasure");
	threadWait(1500);
	enterValueByActionClass("SDGEEEBI", "InstalledQTY", "ESG Values", "SDGE_EEBI", 49, 1);
	clickWebelement("SDGEEEBI", "EnterIncentiveAmount");
	enterValueByActionClass("SDGEEEBI", "EnterIncentiveAmount", "ESG Values", "SDGE_EEBI", 50, 1);
	selectActualVisitDate();
	clickonProcess();
	if (driver.getPageSource().contains("Workflow Step Warnings")) {
		handleMultipleWindow("SDGEEEBI", "HandleWarning");
	}
	defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Installation Workflow Step was Validated", "Installation Workflow Step was not Validated", "SDGEEEBI", "OpenStatus");
}
public static void Process_InspectionWorkflowStep() {
	clickWebelement("SDGEEEBI", "InspectionWorkflowStep");
	threadWait(3000);
	clickWebelement("SDGEEEBI", "AssignedTradeAlly");
	enterValueByActionClass("SDGEEEBI", "AssignedTradeAlly", "ESG Values", "SDGE_EEBI", 55, 1);
	Enter(KeyEvent.VK_ENTER);
	threadWait(6000);
	clickWebelement("SDGEEEBI", "AssignedEmployee");
	enterValueByActionClass("SDGEEEBI", "AssignedEmployee", "ESG Values", "SDGE_EEBI", 56, 1);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("SDGEEEBI", "UpdateMeasure");
	enterValueByActionClass("SDGEEEBI", "PassQty", "ESG Values", "SDGE_EEBI", 53, 1);
	Enter(KeyEvent.VK_TAB);
	enterValueByActionClass("SDGEEEBI", "FailedQty", "ESG Values", "SDGE_EEBI", 54, 1);
	selectActualVisitDate();
	clickonProcess();
	if (driver.getPageSource().contains("Workflow Step Warnings")) {
		handleMultipleWindow("SDGEEEBI", "HandleWarning");
	}
	defineLogs("Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Open - Unscheduled / Awaiting Results", "Inspection Workflow Step was Validated", "Inspection Workflow Step was not Validated", "SDGEEEBI", "OpenStatus");
}
public static void Process_Post_EngineeringWorkflowStep() {
	clickWebelement("SDGEEEBI", "Post_EngineeringWorkflowStep");
	threadWait(3000);
	
	clickWebelement("SDGEEEBI", "UpdateMeasure");
	threadWait(1500);
	enterValueByActionClass("SDGEEEBI", "InstalledQTY", "ESG Values", "SDGE_EEBI", 59, 1);
	clickWebelement("SDGEEEBI", "EnterIncentiveAmount");
	enterValueByActionClass("SDGEEEBI", "EnterIncentiveAmount", "ESG Values", "SDGE_EEBI", 60, 1);
	selectActualVisitDate();
	clickonProcess();
	if (driver.getPageSource().contains("Workflow Step Warnings")) {
		handleMultipleWindow("SDGEEEBI", "HandleWarning");
	}
	defineLogs("Open - Awaiting Results", "Open - Awaiting Results", "Open - Awaiting Results", "Post-Engineering Workflow Step was Validated", "Post-Engineering Workflow Step was not Validated", "SDGEEEBI", "OpenStatusManagementReviewOpenStatus");
}
public static void Process_Management_ReviewWorkflowStep() {
	scrollToElement("SDGEEEBI", "Management_ReviewWorkflowStep");
	clickWebelement("SDGEEEBI", "Management_ReviewWorkflowStep");
	threadWait(3000);
	clickWebelement("SDGEEEBI", "ManagementReviewAssignedTradeAlly");
	enterValueByActionClass("SDGEEEBI", "ManagementReviewAssignedTradeAlly", "ESG Values", "SDGE_EEBI", 63, 1);
	Enter(KeyEvent.VK_ENTER);
	selectDueDate();
	clickonProcess();
	if (driver.getPageSource().contains("Workflow Step Warnings")) {
		handleMultipleWindow("SDGEEEBI", "HandleWarning");
	}
}
public static void VerifyEnrollment() {
	scrollToElement("SDGEEEBI", "EnrollmentMeasure");
	clickWebelement("SDGEEEBI", "EnrollmentMeasure");
	threadWait(3000);
	defineLogs("Enrollment Profile - Measures", "Enrollment Profile - Measures", "Enrollment Profile - Measures", "Incentive Amount verified successfully", "Incentive Amount was not Varified", "SDGEEEBI", "EnrollmentMeasureTotalIncentiveAmount");
	defineLogs("Enrollment Profile - Measures", "Enrollment Profile - Measures", "Enrollment Profile - Measures", "kWh verified successfully", "kWh was not Varified", "SDGEEEBI", "EnrollmentMeasureTotalkWh");
	defineLogs("Enrollment Profile - Measures", "Enrollment Profile - Measures", "Enrollment Profile - Measures", "kW verified successfully", "kW was not Varified", "SDGEEEBI", "EnrollmentMeasureTotalkW");
	scrollToElement("SDGEEEBI", "EnrollmentMeasure");
	clickWebelement("SDGEEEBI", "JobCostSummary");
	threadWait(3000);
	defineLogs("Enrollment Profile - Job Cost Summary", "Enrollment Profile - Job Cost Summary", "Enrollment Profile - Job Cost Summary", "Incentive Amount verified successfully", "Incentive Amount was not Varified", "SDGEEEBI", "JobCostSummaryTotalAmount");
	defineLogs("Enrollment Profile - Job Cost Summary", "Enrollment Profile - Job Cost Summary", "Enrollment Profile - Job Cost Summary", "Measure Amount verified successfully", "Measure Amount was not Varified", "SDGEEEBI", "JobCostSummaryMeasureAmount");
	clickWebelement("SDGEEEBI", "ExpandButton");
	threadWait(3000);
	defineLogs("Enrollment Profile - Job Cost Summary", "Enrollment Profile - Job Cost Summary", "Enrollment Profile - Job Cost Summary", "Original Incentive Amount verified successfully", "Original Incentive Amount was not Varified", "SDGEEEBI", "JobCostSummaryOriginalAmount");
	defineLogs("Enrollment Profile - Job Cost Summary", "Enrollment Profile - Job Cost Summary", "Enrollment Profile - Job Cost Summary", "Difference Incentive Amount verified successfully", "Difference Incentive Amount was not Varified", "SDGEEEBI", "JobCostSummaryDifferenceAmount");
	clickWebelement("SDGEEEBI", "CloseButton");
}
}
