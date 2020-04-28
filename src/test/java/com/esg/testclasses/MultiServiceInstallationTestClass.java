package com.esg.testclasses;

import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;

public class MultiServiceInstallationTestClass extends HelperClass{
	
	public static void LogintoPage() {
		
		login("Helper","BaseURL", 2, 0, 2, 1);
	}

	public static void CreateEnrollment() {
		
		//enterTextboxValue("MultiServiceInstallations", "MainMenu", "ESG Values", "Multi Service Installations", 1, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		defineLogs("Enrollment List", "Enrollment List", "Enrollment List", "Enrollment Page is successfully opened", "Enrollment Page is failed to open", "MultiServiceInstallations", "VerifyEnrollmentPage");
		clickWebelement("MultiServiceInstallations", "NewEnrollment");
		enterTextboxValue("MultiServiceInstallations", "SelectProgram", "ESG Values", "Multi Service Installations", 2, 1);
		threadWait(5000);
		clickWebelement("MultiServiceInstallations", "NextButton");
		defineLogs("Enrollment List", "Enrollment List", "Enrollment List", "New Enrollment Wizard Page is successfully opened", "New Enrollment Wizard Page is failed to open", "MultiServiceInstallations", "VerifyEnrollmentWizardPage");
		enterTextboxValue("MultiServiceInstallations", "SearchType", "ESG Values", "Multi Service Installations", 3, 1);
		clickWebelement("MultiServiceInstallations", "SearchGo");
		threadWait(2500);
		clickWebelement("MultiServiceInstallations", "SearchGo");
		threadWait(2500);
		clickWebelement("MultiServiceInstallations", "Customer");
		clickWebelement("MultiServiceInstallations", "NextGo");
		threadWait(5000);
		defineLogs("Application - Applicant Information - New", "Application - Applicant Information - New", "Application - Applicant Information - New", "Application Page is successfully opened", "Application Page is failed to open", "MultiServiceInstallations", "VerifyApplicationPage");
	
		
	}
	public static void Application1() {
		scrollToElement("MultiServiceInstallations", "BuildingType");
		selectDropdown("MultiServiceInstallations", "BuildingType","BuildingType", "ESG Values", "Multi Service Installations", 4, 1);
		defineLogs("Workflow Step Costs", "$10.00", "$10.00", "Application Workflow Step Cost is validated", "Application Workflow Step Cost is failed to validated", "MultiServiceInstallations", "TotalCostSummary");
		clickWebelement("MultiServiceInstallations", "ApplicationSave");
		
	}
	public static void Measures3() {
		scrollToElement("MultiServiceInstallations", "Measure");
		clickWebelement("MultiServiceInstallations", "Measure");
		clickWebelement("MultiServiceInstallations", "Measurepqt1");
		enterTextboxValue("MultiServiceInstallations", "Measurepqt", "ESG Values", "Multi Service Installations", 5, 1);
		clickWebelement("MultiServiceInstallations", "Measureiqt1");
		enterTextboxValue("MultiServiceInstallations", "Measureiqt", "ESG Values", "Multi Service Installations", 6, 1);
		clickWebelement("MultiServiceInstallations", "Measurepqt21");
		enterTextboxValue("MultiServiceInstallations", "Measurepqt2", "ESG Values", "Multi Service Installations", 7, 1);
		clickWebelement("MultiServiceInstallations", "Save");
		threadWait(2500);
		scrollToElement("MultiServiceInstallations", "ApplicationInformation");
		clickWebelement("MultiServiceInstallations", "ApplicationInformation");
		threadWait(2500);
		defineLogs("$10.00", "$10.00", "$10.00", "Measure total Cost is validated", "Measure total Cost is failed to validated", "MultiServiceInstallations", "TotalCostSummary");
		clickWebelement("MultiServiceInstallations", "ApplicationProcess");
		threadWait(2500);
		defineLogs("Enrollment Profile - Workflow", "Closed - Work Completed", "Closed - Work Completed", "Application Workflow step is completed Successfully", "Application Workflow step is not completed", "MultiServiceInstallations", "ApplicationWorkflowStep");
		
	}
	public static void Installation() {
		//Installation Electric Appliance
		clickWebelement("MultiServiceInstallations", "ElectricApplianceInstallation");
		defineLogs("Workflow Step Costs", "$1,000.00", "$1,000.00", "Workflow Step Cost is validated", "Workflow Step Cost is failed to validated", "MultiServiceInstallations", "TotalCostSummary");
		clickWebelement("MultiServiceInstallations", "ActualReviewDateImage");
		clickWebelement("MultiServiceInstallations", "selectdate");
		clickWebelement("MultiServiceInstallations", "InstallationProcess");
		threadWait(5000);
		defineLogs("Regression - Electric Appliance", "Closed - Work Completed", "Closed - Work Completed", "Installation - Electric Appliance Workflow step is completed Successfully", "Installation - Electric Appliance Workflow step is not completed", "MultiServiceInstallations", "InstallationElectricAppliance");
		
		//Installation Weatherization
		clickWebelement("MultiServiceInstallations", "WeatherizationInstallation");
		defineLogs("Workflow Step Costs", "$100.00", "$100.00", "Workflow Step Cost is validated", "Workflow Step Cost is failed to validated", "MultiServiceInstallations", "TotalCostSummary");
		clickWebelement("MultiServiceInstallations", "ActualReviewDateImage");
		clickWebelement("MultiServiceInstallations", "selectdate");
		clickWebelement("MultiServiceInstallations", "InstallationProcess");
		threadWait(5000);
		defineLogs("Enrollment Profile - Workflow", "Closed - Work Completed", "Closed - Work Completed", "Installation - Weatherization Workflow step is completed Successfully", "Installation - Weatherization Workflow step is not completed", "MultiServiceInstallations", "InstallationWeatherization");
	}
	public static void JobCostSummaryStep() {
		
		scrollToElement("MultiServiceInstallations", "JobCostSummary");
		threadWait(2500);
		clickWebelement("MultiServiceInstallations", "JobCostSummary");
		defineLogs("AutoM8 Inc", "$10.00", "$10.00", "AutoM8 Inc Value is Verified Successfully", "AutoM8 Inc Value is not verified", "MultiServiceInstallations", "VerifyAutoM8Value");
		defineLogs("Regression - Electric Appliance", "$1,000.00", "$1,000.00", "Regression - Electric Appliance Value is Verified Successfully", "Value is not verified", "MultiServiceInstallations", "VerifyRegressionElectricApplianceValue");
		defineLogs("Regression - Weatherization Trade Ally", "$100.00", "$100.00", "Regression - Weatherization Trade Ally Value is Verified Successfully", "Value is not verified", "MultiServiceInstallations", "VerifyRegressionWeatherizationTradeAlly");
		defineLogs("Regression - Weatherization (RW)", "$1,110.00", "$1,110.00", "Regression - Weatherization (RW) Value is Verified Successfully", "Value is not verified", "MultiServiceInstallations", "VerifyRegressionWeatherization");
		scrollToElement("MultiServiceInstallations", "WorkFlowStep");
		clickWebelement("MultiServiceInstallations", "WorkFlowStep");
		threadWait(5000);
	}
	public static void Inspection() {
		clickWebelement("MultiServiceInstallations", "InspectionStep");
		threadWait(2500);
		clickWebelement("MultiServiceInstallations", "Measurepqt1");
		threadWait(2500);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasurePassQty1", "ESG Values", "Multi Service Installations", 8, 1);
		//threadWait(2500);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasureFailQty1", "ESG Values", "Multi Service Installations", 8, 2);
		//threadWait(5000);
		scrollToElement("MultiServiceInstallations", "Measurepqt21");
		clickWebelement("MultiServiceInstallations", "Measureiqt1");
		threadWait(2500);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasurePassQty2", "ESG Values", "Multi Service Installations", 9, 1);
		//threadWait(5000);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasureFailQty2", "ESG Values", "Multi Service Installations", 9, 2);
		//threadWait(5000);
		clickWebelement("MultiServiceInstallations", "Measurepqt21");
		threadWait(2500);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasurePassQty3", "ESG Values", "Multi Service Installations", 10, 1);
		//threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasureFailQty3", "ESG Values", "Multi Service Installations", 10, 2);
		threadWait(2500);
		defineLogs("Workflow Step Costs", "$0.00", "$0.00", "Workflow Step Cost is validated", "Workflow Step Cost is failed to validated", "MultiServiceInstallations", "TotalCostSummary");
		clickWebelement("MultiServiceInstallations", "ActualReviewDateImage");
		clickWebelement("MultiServiceInstallations", "selectdate");
		clickWebelement("MultiServiceInstallations", "InstallationProcess");
		threadWait(5000);
		defineLogs("Enrollment Profile - Workflow", "Closed - Work Completed", "Closed - Work Completed", "Inspection Workflow step is completed Successfully", "Inspection Workflow step is not completed", "MultiServiceInstallations", "InspectionTheUtility");
	}
	public static void Correction1() {
	
		clickWebelement("MultiServiceInstallations", "Correction1");
		threadWait(5000);
		doubleClickWebelement("MultiServiceInstallations", "MeasureCorrectionInfo");
		threadWait(2500);
		enterTextboxValue("MultiServiceInstallations", "CorrectDrop1","ESG Values", "Multi Service Installations", 12, 1);
		defineLogs("Workflow Step Costs", "$1,000.00", "$1,000.00", "Workflow Step Cost is validated", "Workflow Step Cost is failed to validated", "MultiServiceInstallations", "TotalCostSummary");
		selectDropdown("MultiServiceInstallations", "EmployeeDropDown","EmployeeDropDown", "ESG Values", "Multi Service Installations", 11, 1);
		clickWebelement("MultiServiceInstallations", "ActualReviewDateImage");
		Enter(KeyEvent.VK_ENTER);
		//clickWebelement("MultiServiceInstallations", "selectdate");
		clickWebelement("MultiServiceInstallations", "InstallationProcess");
		threadWait(5000);
		defineLogs("Enrollment Profile - Workflow", "Closed - Work Completed", "Closed - Work Completed", "Regression - Electric Appliance Workflow step is completed Successfully", "Regression - Electric Appliance Workflow step is not completed", "MultiServiceInstallations", "RegressionElectricAppliance");
	}
	public static void Correction2() {
		clickWebelement("MultiServiceInstallations", "Correction2");
		threadWait(5000);
		doubleClickWebelement("MultiServiceInstallations", "MeasureCorrectionInfo");
		threadWait(2500);
		enterTextboxValue("MultiServiceInstallations", "CorrectDrop1","ESG Values", "Multi Service Installations", 12, 1);
		selectDropdown("MultiServiceInstallations", "EmployeeDropDown","EmployeeDropDown", "ESG Values", "Multi Service Installations", 13, 1);
		defineLogs("Workflow Step Costs", "$10.00", "$10.00", "Workflow Step Cost is validated", "Workflow Step Cost is failed to validated", "MultiServiceInstallations", "TotalCostSummary");
		clickWebelement("MultiServiceInstallations", "ActualReviewDateImage");
		clickWebelement("MultiServiceInstallations", "selectdate");
		clickWebelement("MultiServiceInstallations", "InstallationProcess");
		threadWait(5000);
		defineLogs("Enrollment Profile - Workflow", "Closed - Work Completed", "Closed - Work Completed", "Regression - Weatherization Trade Ally Workflow step is completed Successfully", "Regression - Weatherization Trade Ally Workflow step is not completed", "MultiServiceInstallations", "RegressionWatherizationTradeAlly");
	}
	public static void Correction3() {
		clickWebelement("MultiServiceInstallations", "Correction3");
		threadWait(5000);
		doubleClickWebelement("MultiServiceInstallations", "MeasureCorrectionInfo");
		threadWait(2500);
		enterTextboxValue("MultiServiceInstallations", "CorrectDrop1","ESG Values", "Multi Service Installations", 12, 1);
		selectDropdown("MultiServiceInstallations", "EmployeeDropDown","EmployeeDropDown", "ESG Values", "Multi Service Installations", 14, 1);
		clickWebelement("MultiServiceInstallations", "ActualReviewDateImage");
		clickWebelement("MultiServiceInstallations", "selectdate");
		defineLogs("Workflow Step Costs", "$100.00", "$100.00", "Workflow Step Cost is validated", "Workflow Step Cost is failed to validated", "MultiServiceInstallations", "TotalCostSummary");
		clickWebelement("MultiServiceInstallations", "InstallationProcess");
		threadWait(5000);
		defineLogs("Enrollment Profile - Workflow", "Regression - Weatherization Trade Ally", "Regression - Weatherization Trade Ally", "Regression - Weatherization Trade Ally Workflow step is completed Successfully", "Regression - Weatherization Trade Ally Workflow step is not completed", "MultiServiceInstallations", "AutoM8Validation");
		defineLogs("Enrollment Profile - Workflow", "Reinspection", "Reinspection", "ReInspection Workflow step is created Successfully", "ReInspection Workflow step is failed to created", "MultiServiceInstallations", "Reinspection");
		
	}
	public static void Reinspection(){
		clickWebelement("MultiServiceInstallations", "Reinspection");
		threadWait(2500);
		clickWebelement("MultiServiceInstallations", "Measurepqt1");
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasurePassQty1", "ESG Values", "Multi Service Installations", 15, 1);
		threadWait(2500);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasureFailQty1", "ESG Values", "Multi Service Installations", 15, 2);
		threadWait(5000);
		clickWebelement("MultiServiceInstallations", "Measureiqt1");
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasurePassQty2", "ESG Values", "Multi Service Installations", 16, 1);
		threadWait(5000);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasureFailQty2", "ESG Values", "Multi Service Installations", 16, 2);
		threadWait(5000);
		clickWebelement("MultiServiceInstallations", "Measurepqt21");
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasurePassQty3", "ESG Values", "Multi Service Installations", 17, 1);
		threadWait(2000);
		enterTextboxValue("MultiServiceInstallations", "InspectionMeasureFailQty3", "ESG Values", "Multi Service Installations", 17, 2);
		threadWait(2500);
		selectDropdown("MultiServiceInstallations", "EmployeeDropDown","EmployeeDropDown", "ESG Values", "Multi Service Installations", 18, 1);
		clickWebelement("MultiServiceInstallations", "ActualReviewDateImage");
		clickWebelement("MultiServiceInstallations", "selectdate");
		clickWebelement("MultiServiceInstallations", "InstallationProcess");
		defineLogs("Reinspection", "Closed - Work Completed", "Closed - Work Completed", "Reinspection status is Verified", "Reinspection status is Verified", "MultiServiceInstallations", "ReinspectionVerification");
		defineLogs("Enrollment Incentives", "$1,110.00", "$1,110.00", "Enrollment Incentives Total Cost is Validated", "Enrollment Incentives Total Cost is not Correct", "MultiServiceInstallations", "EnrollmentIncentiveTotalCostValidation");
	}
	
}
