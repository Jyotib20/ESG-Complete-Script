
package com.esg.testclasses;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class Enrollment_Propert_Check_TestClass extends HelperClass {
	
	public static void CreateNewEnrollment() {
		ClickByActionClass("EnrollmentPropertyCheck", "MainMenu", "ESG Values", "Enrollment_Property_Check", 1, 1);
		clickWebelement("EnrollmentPropertyCheck", "NewButton");
		selectDropdownByVisibleText("EnrollmentPropertyCheck", "SelectProgram", "ESG Values", "Enrollment_Property_Check", 2, 1);
		clickWebelement("EnrollmentPropertyCheck", "NextButton");
		enterTextboxValue("EnrollmentPropertyCheck", "AccountNumber", "ESG Values", "Enrollment_Property_Check", 3, 1);
		clickWebelement("EnrollmentPropertyCheck", "SearchGo");
		doubleClickWebelement("EnrollmentPropertyCheck", "Customer");
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "NewApplicationValidation", "ESG Values", "Enrollment_Property_Check", 4, 1);
	}
	public static void AddMeasure() {
		scrollToElement("EnrollmentPropertyCheck", "MeasureTab");
		clickWebelement("EnrollmentPropertyCheck", "MeasureTab");
		threadWait(5000);
		clickWebelement("EnrollmentPropertyCheck", "AddNewMeasure");
		threadWait(3000);
		//explicitWaitForClickable(3000, "EnrollmentPropertyCheck", "AddMeasureCheckBox");
		clickWebelement("EnrollmentPropertyCheck", "AddMeasureCheckBox");
		clickWebelement("EnrollmentPropertyCheck", "AddMeasureSave");
		threadWait(3000);
		clickWebelement("EnrollmentPropertyCheck", "AddMeasureName");
		enterValueByActionClass("EnrollmentPropertyCheck", "MeasureQty", "ESG Values", "Enrollment_Property_Check", 5, 1);
		clickonSave();
		test.log(LogStatus.INFO, "New Measure is successfully Added");
		scrollToElement("EnrollmentPropertyCheck", "ApplicationInfoTab");
		clickWebelement("EnrollmentPropertyCheck", "ApplicationInfoTab");
	}
	public static void EnrollmentPropertyFieldsValidation() {
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AccessToAllRooms", "ESG Values", "Enrollment_Property_Check", 7, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AccountClass", "ESG Values", "Enrollment_Property_Check", 8, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AccountClassCode", "ESG Values", "Enrollment_Property_Check", 9, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ApplicationSubmissionDate", "ESG Values", "Enrollment_Property_Check", 10, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingType", "ESG Values", "Enrollment_Property_Check", 11, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingTypeCode", "ESG Values", "Enrollment_Property_Check",12, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingTypeId", "ESG Values", "Enrollment_Property_Check", 13, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ClimateZone", "ESG Values", "Enrollment_Property_Check", 14, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ClimateZoneCode", "ESG Values", "Enrollment_Property_Check", 15, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ClimateZoneId", "ESG Values", "Enrollment_Property_Check", 16, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "EnrollmentId", "ESG Values", "Enrollment_Property_Check", 17, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "EnrollmentStatus", "ESG Values", "Enrollment_Property_Check", 18, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "InstallationCounty", "ESG Values", "Enrollment_Property_Check", 19, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatus", "ESG Values", "Enrollment_Property_Check", 20, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatusCode", "ESG Values", "Enrollment_Property_Check", 21, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatusId", "ESG Values", "Enrollment_Property_Check", 22, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "PremiseCounty", "ESG Values", "Enrollment_Property_Check", 23, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ProgramCode", "ESG Values", "Enrollment_Property_Check", 24, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ProgramId", "ESG Values", "Enrollment_Property_Check", 25, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ProjectCost", "ESG Values", "Enrollment_Property_Check", 26, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "QualifiedReservedAmount", "ESG Values", "Enrollment_Property_Check", 27, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ReservedAmount", "ESG Values", "Enrollment_Property_Check", 28, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceAccountNo", "ESG Values", "Enrollment_Property_Check", 29, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceProviderAssociatedTradeAllyId", "ESG Values", "Enrollment_Property_Check", 30, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceProviderCode", "ESG Values", "Enrollment_Property_Check", 31, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceProviderName", "ESG Values", "Enrollment_Property_Check", 32, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TotalIncementalMeasureCostAmount", "ESG Values", "Enrollment_Property_Check", 33, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TotalIncentiveAmount", "ESG Values", "Enrollment_Property_Check", 34, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TotalMeasureCostAmount", "ESG Values", "Enrollment_Property_Check", 35, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TradeAllyName", "ESG Values", "Enrollment_Property_Check", 36, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TradeAllyVendorNumber", "ESG Values", "Enrollment_Property_Check", 37, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "VendorPremiseId", "ESG Values", "Enrollment_Property_Check", 38, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Zip", "ESG Values", "Enrollment_Property_Check", 39, 1);
	}
	public static void SetPropertyFieldsValidation() {
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ActualVisitDate", "ESG Values", "Enrollment_Property_Check", 42, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AssignedContractorId", "ESG Values", "Enrollment_Property_Check", 43, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "EnrollmentWorkflowStepId", "ESG Values", "Enrollment_Property_Check", 44, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Incentive", "ESG Values", "Enrollment_Property_Check", 45, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Kerosene", "ESG Values", "Enrollment_Property_Check", 46, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "kW", "ESG Values", "Enrollment_Property_Check", 47, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "kWh", "ESG Values", "Enrollment_Property_Check", 48, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "NaturalGas", "ESG Values", "Enrollment_Property_Check", 49, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Oil", "ESG Values", "Enrollment_Property_Check", 50, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "PricingDate", "ESG Values", "Enrollment_Property_Check", 51, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Propane", "ESG Values", "Enrollment_Property_Check", 52, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ScheduledVisitDate", "ESG Values", "Enrollment_Property_Check", 53, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceCode", "ESG Values", "Enrollment_Property_Check", 54, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceId", "ESG Values", "Enrollment_Property_Check", 55, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "SummerkW", "ESG Values", "Enrollment_Property_Check", 56, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Therms", "ESG Values", "Enrollment_Property_Check", 57, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Water", "ESG Values", "Enrollment_Property_Check", 58, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WinterkW", "ESG Values", "Enrollment_Property_Check", 59, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Wood", "ESG Values", "Enrollment_Property_Check", 60, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowCompletionDate", "ESG Values", "Enrollment_Property_Check", 61, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowCreateDate", "ESG Values", "Enrollment_Property_Check", 62, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStep", "ESG Values", "Enrollment_Property_Check", 63, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStepId", "ESG Values", "Enrollment_Property_Check", 64, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStepOutcomeCode", "ESG Values", "Enrollment_Property_Check", 65, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStepOutcomeId", "ESG Values", "Enrollment_Property_Check", 66, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStepStatus", "ESG Values", "Enrollment_Property_Check", 67, 1);
	}
	public static void ApplicationFillUp() {
		scrollToElement("EnrollmentPropertyCheck", "ProcessTradeAlly");
		selectDropdownByVisibleText("EnrollmentPropertyCheck", "ProcessTradeAlly", "ESG Values", "Enrollment_Property_Check", 70, 1);
		selectDropdownByVisibleText("EnrollmentPropertyCheck", "ProcessEmployee", "ESG Values", "Enrollment_Property_Check", 71, 1);
		scrollToElement("EnrollmentPropertyCheck", "BuildingType");
		selectDropdownByVisibleText("EnrollmentPropertyCheck", "BuildingType1", "ESG Values", "Enrollment_Property_Check", 72, 1);
		selectDropdownByVisibleText("EnrollmentPropertyCheck", "OccupancyStatus1", "ESG Values", "Enrollment_Property_Check", 73, 1);
		selectDropdownByVisibleText("EnrollmentPropertyCheck", "AccessToRooms", "ESG Values", "Enrollment_Property_Check", 74, 1);
		scrollToElement("EnrollmentPropertyCheck", "TaxStatus");
		selectDropdownByVisibleText("EnrollmentPropertyCheck", "TaxStatus", "ESG Values", "Enrollment_Property_Check", 75, 1);
		selectDropdownByVisibleText("EnrollmentPropertyCheck", "TaxIDType", "ESG Values", "Enrollment_Property_Check", 76, 1);
		clickonSave();
		test.log(LogStatus.INFO, "Application Details are added successfully");
	}
	public static void ApplicationDetailsValidationAfterSave() {
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AccessToAllRooms", "ESG Values", "Enrollment_Property_Check", 79, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingType", "ESG Values", "Enrollment_Property_Check", 80, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingTypeCode", "ESG Values", "Enrollment_Property_Check",81, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingTypeId", "ESG Values", "Enrollment_Property_Check", 82, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatus1", "ESG Values", "Enrollment_Property_Check", 83, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatusCode", "ESG Values", "Enrollment_Property_Check", 84, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatusId", "ESG Values", "Enrollment_Property_Check", 85, 1);
		clickonProcess();
	}
	public static void EnrollmentPropertyFieldsValidationAfterProcess() {
		explicitWaitForClickable(3000, "EnrollmentPropertyCheck", "ApplicationLink");
		clickWebelement("EnrollmentPropertyCheck", "ApplicationLink");
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AccessToAllRooms", "ESG Values", "Enrollment_Property_Check", 88, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AccountClass", "ESG Values", "Enrollment_Property_Check", 89, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AccountClassCode", "ESG Values", "Enrollment_Property_Check", 90, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ApplicationSubmissionDate", "ESG Values", "Enrollment_Property_Check", 91, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingType", "ESG Values", "Enrollment_Property_Check", 92, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingTypeCode", "ESG Values", "Enrollment_Property_Check",93, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "BuildingTypeId", "ESG Values", "Enrollment_Property_Check", 94, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ClimateZone", "ESG Values", "Enrollment_Property_Check", 95, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ClimateZoneCode", "ESG Values", "Enrollment_Property_Check", 96, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ClimateZoneId", "ESG Values", "Enrollment_Property_Check", 97, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "EnrollmentId", "ESG Values", "Enrollment_Property_Check", 98, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "EnrollmentStatus", "ESG Values", "Enrollment_Property_Check", 99, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "InstallationCounty", "ESG Values", "Enrollment_Property_Check",100, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatus", "ESG Values", "Enrollment_Property_Check", 101, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatusCode", "ESG Values", "Enrollment_Property_Check", 102, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "OccupancyStatusId", "ESG Values", "Enrollment_Property_Check", 103, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "PremiseCounty", "ESG Values", "Enrollment_Property_Check", 104, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ProgramCode", "ESG Values", "Enrollment_Property_Check", 105, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ProgramId", "ESG Values", "Enrollment_Property_Check", 106, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ProjectCost", "ESG Values", "Enrollment_Property_Check", 107, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "QualifiedReservedAmount", "ESG Values", "Enrollment_Property_Check", 108, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ReservedAmount", "ESG Values", "Enrollment_Property_Check", 109, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceAccountNo", "ESG Values", "Enrollment_Property_Check", 110, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceProviderAssociatedTradeAllyId", "ESG Values", "Enrollment_Property_Check", 111, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceProviderCode", "ESG Values", "Enrollment_Property_Check", 112, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceProviderName", "ESG Values", "Enrollment_Property_Check", 113, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TotalIncementalMeasureCostAmount", "ESG Values", "Enrollment_Property_Check", 114, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TotalIncentiveAmount", "ESG Values", "Enrollment_Property_Check", 115, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TotalMeasureCostAmount", "ESG Values", "Enrollment_Property_Check", 116, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TradeAllyName", "ESG Values", "Enrollment_Property_Check", 117, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "TradeAllyVendorNumber", "ESG Values", "Enrollment_Property_Check", 118, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "VendorPremiseId", "ESG Values", "Enrollment_Property_Check", 119, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Zip", "ESG Values", "Enrollment_Property_Check", 120, 1);
	}
	public static void SetPropertyFieldsValidationAfterProcess() {
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ActualVisitDate", "ESG Values", "Enrollment_Property_Check", 123, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "AssignedContractorId", "ESG Values", "Enrollment_Property_Check", 124, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "EnrollmentWorkflowStepId", "ESG Values", "Enrollment_Property_Check", 125, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Incentive", "ESG Values", "Enrollment_Property_Check", 126, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Kerosene", "ESG Values", "Enrollment_Property_Check", 127, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "kW", "ESG Values", "Enrollment_Property_Check", 128, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "kWh", "ESG Values", "Enrollment_Property_Check", 129, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "NaturalGas", "ESG Values", "Enrollment_Property_Check", 130, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Oil", "ESG Values", "Enrollment_Property_Check", 131, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "PricingDate", "ESG Values", "Enrollment_Property_Check", 132, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Propane", "ESG Values", "Enrollment_Property_Check", 133, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ScheduledVisitDate", "ESG Values", "Enrollment_Property_Check", 134, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceCode", "ESG Values", "Enrollment_Property_Check", 135, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "ServiceId", "ESG Values", "Enrollment_Property_Check", 136, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "SummerkW", "ESG Values", "Enrollment_Property_Check", 137, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Therms", "ESG Values", "Enrollment_Property_Check", 138, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Water", "ESG Values", "Enrollment_Property_Check", 139, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WinterkW", "ESG Values", "Enrollment_Property_Check", 140, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "Wood", "ESG Values", "Enrollment_Property_Check", 141, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowCompletionDate", "ESG Values", "Enrollment_Property_Check", 142, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowCreateDate", "ESG Values", "Enrollment_Property_Check", 143, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStep", "ESG Values", "Enrollment_Property_Check", 144, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStepId", "ESG Values", "Enrollment_Property_Check", 145, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStepOutcomeCode", "ESG Values", "Enrollment_Property_Check", 146, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStepOutcomeId", "ESG Values", "Enrollment_Property_Check", 147, 1);
		VarifyElementForExistingValueWithText("EnrollmentPropertyCheck", "WorkflowStepStatus", "ESG Values", "Enrollment_Property_Check", 148, 1);
	}
	
}
