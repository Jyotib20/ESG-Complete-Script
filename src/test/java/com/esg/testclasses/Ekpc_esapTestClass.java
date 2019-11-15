package com.esg.testclasses;

import com.esg.utilities.HelperClass;

public class Ekpc_esapTestClass extends HelperClass{
	
	public static void createenrollment() {
		
		ClickByActionClass("Ekpc_Esap", "MainMenu", "ESG Values", "Ekpc_Esap", 1, 1);
		clickWebelement("Ekpc_Esap", "NewEnrollment");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "NewEnrollmentWizard", "ESG Values", "Ekpc_Esap", 5, 2);
		
		selectDropdownByVisibleText("Ekpc_Esap", "SelectProgram", "ESG Values", "Ekpc_Esap", 2, 1);
		explicitWaitForClickable(3000, "Ekpc_Esap", "NextButton");
		clickWebelement("Ekpc_Esap", "NextButton");
		enterTextboxValue("Ekpc_Esap", "AccountNumber", "ESG Values", "Ekpc_Esap", 3, 1);
		explicitWaitForClickable(3000, "Ekpc_Esap", "Go");
		clickWebelement("Ekpc_Esap", "Go");
		validationWithWebelement("Ekpc_Esap", "SearchTypeValidation");
		explicitWaitForClickable(3000, "Ekpc_Esap", "Customer");
		clickWebelement("Ekpc_Esap", "Customer");
		explicitWaitForClickable(2000, "Ekpc_Esap", "NextButton");
		clickWebelement("Ekpc_Esap", "NextButton");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "EnrollemtApplication", "ESG Values", "Ekpc_Esap", 5, 5);
		
		}
	public static void enrollmentapplication() {
		
		InstallationDate2();
		PurchaseDate();
		scrollToElement("Ekpc_Esap", "TradeAllies");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "Owenelectric", "ESG Values", "Ekpc_Esap", 6, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "Arca", "ESG Values", "Ekpc_Esap", 7, 5);
		clickonSave();
		selectMeasures();
		VarifyElementForExistingValueWithText("Ekpc_Esap", "Measuresubtab", "ESG Values", "Ekpc_Esap", 8, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "lostrevenue", "ESG Values", "Ekpc_Esap", 9, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "Totalfee", "ESG Values", "Ekpc_Esap", 10, 5);
	}
	public static void measure() {
		
		clickWebelement("Ekpc_Esap", "AddMeasure");
		explicitWait(3000, "Ekpc_Esap", "AddMeasuredialoguebox");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "AddMeasuredialoguebox", "ESG Values", "Ekpc_Esap", 11, 5);
		explicitWaitForClickable(2000, "Ekpc_Esap", "Ekpcclotheswasher");
		clickWebelement("Ekpc_Esap", "Ekpcclotheswasher");
		clickWebelement("Ekpc_Esap", "Ekpcdishwasher");
		explicitWaitForClickable(2000, "Ekpc_Esap", "Savebutton");
		clickWebelement("Ekpc_Esap", "Savebutton");
		threadWait(3000);
		clickWebelement("Ekpc_Esap", "MeasureName");
		enterValueByActionClass("Ekpc_Esap", "EkpcclothwasherQtyclick", "ESG Values", "Ekpc_Esap", 4, 1);
		clickWebelement("Ekpc_Esap", "EkpcclothwasherManufacture");
		enterValueByActionClass("Ekpc_Esap", "EkpcclothwasherManufacture", "ESG Values", "Ekpc_Esap", 5, 1);
		//clickWebelement("Ekpc_Esap", "EkpcclothwasherModel");
		enterTextboxValue("Ekpc_Esap", "EkpcclothwasherModel", "ESG Values", "Ekpc_Esap", 6, 1);
		//clickWebelement("Ekpc_Esap", "EkpcclothwasherNumber");
		enterTextboxValue("Ekpc_Esap", "EkpcclothwasherNumber", "ESG Values", "Ekpc_Esap", 7, 1);
		//EKPC - ENERGY STAR Dishwasher
		clickWebelement("Ekpc_Esap", "MeasureName2");
		enterValueByActionClass("Ekpc_Esap", "EkpcdishwasherQty", "ESG Values", "Ekpc_Esap", 8, 1);
		clickWebelement("Ekpc_Esap", "EkpcdishwasherManufacture");
		enterTextboxValue("Ekpc_Esap", "EkpcdishwasherManufacture", "ESG Values", "Ekpc_Esap", 9, 1);
		enterTextboxValue("Ekpc_Esap", "EkpcdishwasherModel", "ESG Values", "Ekpc_Esap", 10, 1);
		enterTextboxValue("Ekpc_Esap", "EkpcdishwasherNumber", "ESG Values", "Ekpc_Esap", 11, 1);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "GrandTotal", "ESG Values", "Ekpc_Esap", 14, 5);
		clickonSave();
		
		//Validation Points
		VarifyElementForExistingValueWithText("Ekpc_Esap", "IncentiveValidationClothesWasher", "ESG Values", "Ekpc_Esap", 17, 5);
		//VarifyElementForExistingValueWithText("Ekpc_Esap", "PayeeOverrideValidationClothesWasher", "ESG Values", "Ekpc_Esap", 18, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "IncentiveValidationDishWasher", "ESG Values", "Ekpc_Esap", 19, 5);
		//VarifyElementForExistingValueWithText("Ekpc_Esap", "PayeeOverrideValidationDishWasher", "ESG Values", "Ekpc_Esap", 18, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "LostRevenueValidation", "ESG Values", "Ekpc_Esap", 21, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "TouchFeeValidation", "ESG Values", "Ekpc_Esap", 22, 5);	
	}
	
	public static void overrides() {
		scrollToElement("Ekpc_Esap", "OverrideTab");
		clickWebelement("Ekpc_Esap", "OverrideTab");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "MeasurePayeeOverideClothes", "ESG Values", "Ekpc_Esap", 16, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "MeasurePayeeOverideDishes", "ESG Values", "Ekpc_Esap", 16, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "EnrollmentFeePayeeLostRevenue", "ESG Values", "Ekpc_Esap", 6, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "EnrollmentFeePayeeTouchFee", "ESG Values", "Ekpc_Esap", 7, 5);
		clickonclose();
		clickonProcess();
	}
	public static void ApplicationStatus() {
		explicitWait(300, "Ekpc_Esap", "ApplicationStatus");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "ApplicationStatus", "ESG Values", "Ekpc_Esap", 23, 5);
		explicitWaitForClickable(300, "Ekpc_Esap", "ApplicationLink");
		clickWebelement("Ekpc_Esap", "ApplicationLink");
		clickonProcess();
		explicitWait(300, "Ekpc_Esap", "ApplicationStatus");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "ApplicationStatus", "ESG Values", "Ekpc_Esap", 24, 5);
		clickWebelement("Ekpc_Esap", "ApplicationLink");
		scrollToElement("Ekpc_Esap", "OverrideTab");
		clickWebelement("Ekpc_Esap", "OverrideTab");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "MeasurePayeeOverideClothes1", "ESG Values", "Ekpc_Esap", 16, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "MeasurePayeeOverideDishes1", "ESG Values", "Ekpc_Esap", 16, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "EnrollmentFeePayeeLostRevenue1", "ESG Values", "Ekpc_Esap", 7, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "EnrollmentFeePayeeTouchFee1", "ESG Values", "Ekpc_Esap", 6, 5);
		clickonclose();
		clickonclose();
		
	}
	public static void JobCostSummaryValidation() {
		clickWebelement("Ekpc_Esap", "JobCostSummaryTab");
		explicitWait(300, "Ekpc_Esap", "ARCATotalValidation");
		VarifyElementForExistingValueWithText("Ekpc_Esap", "ARCATotalValidation", "ESG Values", "Ekpc_Esap", 25, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "EKPCClothesWasherFinalValidation", "ESG Values", "Ekpc_Esap", 26, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "EKPCDishwasherFinalValidation", "ESG Values", "Ekpc_Esap", 27, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "TouchFeeFinalValidation", "ESG Values", "Ekpc_Esap", 28, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "OwenElectricFinalValidation", "ESG Values", "Ekpc_Esap", 29, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "LostRevenueFinalValidaiton", "ESG Values", "Ekpc_Esap", 30, 5);
		VarifyElementForExistingValueWithText("Ekpc_Esap", "MeasureTotal", "ESG Values", "Ekpc_Esap", 31, 5);
	}
	
}
