package com.esg.testclasses;

import com.esg.utilities.HelperClass;

public class Ekpc_esapTestClass extends HelperClass{
	
	public static void createenrollment() {
		
		ClickByActionClass("Ekpc_Esap", "MainMenu", "ESG Values", "Ekpc_Esap", 1, 1);
		clickWebelement("Ekpc_Esap", "NewEnrollment");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "NewEnrollmentWizard", "ESG Values", "Ekpc_Esap", 5, 2);
		selectDropdown("Ekpc_Esap", "SelectProgram","", "ESG Values", "Ekpc_Esap", 2, 1);
		WaitForElement(3000, "Ekpc_Esap", "NextButton");
		clickWebelement("Ekpc_Esap", "NextButton");
		enterTextboxValue("Ekpc_Esap", "AccountNumber", "ESG Values", "Ekpc_Esap", 3, 1);
		WaitForElement(3000, "Ekpc_Esap", "Go");
		clickWebelement("Ekpc_Esap", "Go");
		validationWithWebelement("Ekpc_Esap", "SearchTypeValidation");
		WaitForElement(3000, "Ekpc_Esap", "Customer");
		clickWebelement("Ekpc_Esap", "Customer");
		WaitForElement(2000, "Ekpc_Esap", "NextButton");
		clickWebelement("Ekpc_Esap", "NextButton");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "EnrollemtApplication", "ESG Values", "Ekpc_Esap", 5, 5);
		
		}
	public static void enrollmentapplication() {
		
		InstallationDate2();
		PurchaseDate();
		scrollToElement("Ekpc_Esap", "TradeAllies");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "Owenelectric", "ESG Values", "Ekpc_Esap", 6, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "Arca", "ESG Values", "Ekpc_Esap", 7, 5);
		
		HandleErrorCodeOnSave("helper", "SaveButton", "");
	//	clickonSave();
		selectMeasures();
		VerifyElementForExistingValueWithText("Ekpc_Esap", "Measuresubtab", "ESG Values", "Ekpc_Esap", 8, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "lostrevenue", "ESG Values", "Ekpc_Esap", 9, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "Totalfee", "ESG Values", "Ekpc_Esap", 10, 5);
	}
	public static void measure() {
		
		clickWebelement("Ekpc_Esap", "AddMeasure");
		explicitWait(3000, "Ekpc_Esap", "AddMeasuredialoguebox");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "AddMeasuredialoguebox", "ESG Values", "Ekpc_Esap", 11, 5);
		WaitForElement(2000, "Ekpc_Esap", "Ekpcclotheswasher");
		clickWebelement("Ekpc_Esap", "Ekpcclotheswasher");
		clickWebelement("Ekpc_Esap", "Ekpcdishwasher");
		WaitForElement(2000, "Ekpc_Esap", "Savebutton");
		clickWebelement("Ekpc_Esap", "Savebutton");
		threadWait(3000);
		clickWebelement("Ekpc_Esap", "MeasureName");
		enterTextboxValue("Ekpc_Esap", "EkpcclothwasherQtyclick", "ESG Values", "Ekpc_Esap", 4, 1);
		clickWebelement("Ekpc_Esap", "EkpcclothwasherManufacture");
		enterTextboxValue("Ekpc_Esap", "EkpcclothwasherManufacture", "ESG Values", "Ekpc_Esap", 5, 1);
		//clickWebelement("Ekpc_Esap", "EkpcclothwasherModel");
		enterTextboxValue("Ekpc_Esap", "EkpcclothwasherModel", "ESG Values", "Ekpc_Esap", 6, 1);
		//clickWebelement("Ekpc_Esap", "EkpcclothwasherNumber");
		enterTextboxValue("Ekpc_Esap", "EkpcclothwasherNumber", "ESG Values", "Ekpc_Esap", 7, 1);
		//EKPC - ENERGY STAR Dishwasher
		clickWebelement("Ekpc_Esap", "MeasureName2");
		enterTextboxValue("Ekpc_Esap", "EkpcdishwasherQty", "ESG Values", "Ekpc_Esap", 8, 1);
		clickWebelement("Ekpc_Esap", "EkpcdishwasherManufacture");
		enterTextboxValue("Ekpc_Esap", "EkpcdishwasherManufacture", "ESG Values", "Ekpc_Esap", 9, 1);
		enterTextboxValue("Ekpc_Esap", "EkpcdishwasherModel", "ESG Values", "Ekpc_Esap", 10, 1);
		enterTextboxValue("Ekpc_Esap", "EkpcdishwasherNumber", "ESG Values", "Ekpc_Esap", 11, 1);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "GrandTotal", "ESG Values", "Ekpc_Esap", 14, 5);
		HandleErrorCodeOnSave("helper", "SaveButton", "");
	//	clickonSave();
		
		//Validation Points
		VerifyElementForExistingValueWithText("Ekpc_Esap", "IncentiveValidationClothesWasher", "ESG Values", "Ekpc_Esap", 17, 5);
		//VerifyElementForExistingValueWithText("Ekpc_Esap", "PayeeOverrideValidationClothesWasher", "ESG Values", "Ekpc_Esap", 18, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "IncentiveValidationDishWasher", "ESG Values", "Ekpc_Esap", 19, 5);
		//VerifyElementForExistingValueWithText("Ekpc_Esap", "PayeeOverrideValidationDishWasher", "ESG Values", "Ekpc_Esap", 18, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "LostRevenueValidation", "ESG Values", "Ekpc_Esap", 21, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "TouchFeeValidation", "ESG Values", "Ekpc_Esap", 22, 5);	
	}
	
	public static void overrides() {
		scrollToElement("Ekpc_Esap", "OverrideTab");
		clickWebelement("Ekpc_Esap", "OverrideTab");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "MeasurePayeeOverideClothes", "ESG Values", "Ekpc_Esap", 16, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "MeasurePayeeOverideDishes", "ESG Values", "Ekpc_Esap", 16, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "EnrollmentFeePayeeLostRevenue", "ESG Values", "Ekpc_Esap", 6, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "EnrollmentFeePayeeTouchFee", "ESG Values", "Ekpc_Esap", 7, 5);
		clickonclose();
		clickonProcess();
	}
	public static void ApplicationStatus() {
		explicitWait(300, "Ekpc_Esap", "ApplicationStatus");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "ApplicationStatus", "ESG Values", "Ekpc_Esap", 23, 5);
		WaitForElement(300, "Ekpc_Esap", "ApplicationLink");
		clickWebelement("Ekpc_Esap", "ApplicationLink");
		clickonProcess();
		explicitWait(300, "Ekpc_Esap", "ApplicationStatus");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "ApplicationStatus", "ESG Values", "Ekpc_Esap", 24, 5);
		clickWebelement("Ekpc_Esap", "ApplicationLink");
		scrollToElement("Ekpc_Esap", "OverrideTab");
		clickWebelement("Ekpc_Esap", "OverrideTab");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "MeasurePayeeOverideClothes1", "ESG Values", "Ekpc_Esap", 16, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "MeasurePayeeOverideDishes1", "ESG Values", "Ekpc_Esap", 16, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "EnrollmentFeePayeeLostRevenue1", "ESG Values", "Ekpc_Esap", 7, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "EnrollmentFeePayeeTouchFee1", "ESG Values", "Ekpc_Esap", 6, 5);
		clickonclose();
		clickonclose();
		
	}
	public static void JobCostSummaryValidation() {
		clickWebelement("Ekpc_Esap", "JobCostSummaryTab");
		explicitWait(300, "Ekpc_Esap", "ARCATotalValidation");
		VerifyElementForExistingValueWithText("Ekpc_Esap", "ARCATotalValidation", "ESG Values", "Ekpc_Esap", 25, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "EKPCClothesWasherFinalValidation", "ESG Values", "Ekpc_Esap", 26, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "EKPCDishwasherFinalValidation", "ESG Values", "Ekpc_Esap", 27, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "TouchFeeFinalValidation", "ESG Values", "Ekpc_Esap", 28, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "OwenElectricFinalValidation", "ESG Values", "Ekpc_Esap", 29, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "LostRevenueFinalValidaiton", "ESG Values", "Ekpc_Esap", 30, 5);
		VerifyElementForExistingValueWithText("Ekpc_Esap", "MeasureTotal", "ESG Values", "Ekpc_Esap", 31, 5);
	}
	
}