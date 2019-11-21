package com.esg.testclasses;

import java.awt.AWTException;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class SingleFileUploadTestClass extends HelperClass {

public static void Login() {
		
		login("Helper","BaseURL", 1, 0, 1, 1);
	}
public static void UploadFile() throws AWTException {
	
	ClickByActionClass("SingleFileUpload", "MainMenu", "ESG Values", "SingleFileUpload", 1, 1);
	selectDropdownByVisibleText("SingleFileUpload", "UploadType", "ESG Values", "SingleFileUpload", 2, 1);
	selectDropdownByVisibleText("SingleFileUpload", "TradeAlly", "ESG Values", "SingleFileUpload", 3, 1);
	explicitWaitForClickable(3000, "SingleFileUpload", "SelectUpload");
	clickWebelement("SingleFileUpload", "SelectUpload");
	UploadFile("SingleFileUpload", "Filepath");
	explicitWaitForClickable(3000, "SingleFileUpload", "UploadButton");
	clickWebelement("SingleFileUpload", "UploadButton");
	explicitWait(300, "SingleFileUpload", "CompletedStatus");
	VarifyElementForExistingValueWithText("SingleFileUpload", "TotalRecords", "ESG Values", "SingleFileUpload", 4, 1);
	VarifyElementForExistingValueWithText("SingleFileUpload", "SuccessfullEnrollments", "ESG Values", "SingleFileUpload", 5, 1);
}
	public static void Enrollment() {
		ClickByActionClass("SingleFileUpload", "MainMenu", "ESG Values", "SingleFileUpload", 6, 1);
		enterTextboxValue("SingleFileUpload", "ReferenceNumber", "ESG Values", "SingleFileUpload", 7, 1);
		scrollToElement("SingleFileUpload", "SearchButton");
		clickWebelement("SingleFileUpload", "SearchButton");
		/*explicitWaitForClickable(3000, "SingleFileUpload", "EnrollmentLink");*/
		threadWait(3000);
		//clickWebelement("SingleFileUpload", "EnrollmentLink");
		clickWebelement("ApogeUpload", "EnrollmentList");
		explicitWait(3000, "SingleFileUpload", "ApplicationTradeAlly");
		VarifyElementForExistingValueWithText("SingleFileUpload", "ApplicationTradeAlly", "ESG Values", "SingleFileUpload", 8, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "ApplicationStatus", "ESG Values", "SingleFileUpload", 9, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "InstallationTradeAlly", "ESG Values", "SingleFileUpload", 10, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "InstallationStatus", "ESG Values", "SingleFileUpload", 11, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "InspectionTradeAlly", "ESG Values", "SingleFileUpload", 12, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "InspectionStatus", "ESG Values", "SingleFileUpload",13, 1);
	}
	public static void ApplicationValidation() {
		clickWebelement("SingleFileUpload", "ApplicationLink");
		scrollToElement("SingleFileUpload", "MeasureTab");
		clickWebelement("SingleFileUpload", "MeasureTab");
		/*explicitWait(3000, "SingleFileUpload", "MeasurePQty");*/
		VarifyElementForExistingValueWithText("SingleFileUpload", "MeasurePQty", "ESG Values", "SingleFileUpload", 44, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "IncentiveUnitPrice", "ESG Values", "SingleFileUpload", 45, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "IncentiveAmount", "ESG Values", "SingleFileUpload", 46, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsKWH", "ESG Values", "SingleFileUpload",47, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsKW", "ESG Values", "SingleFileUpload",48, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsWinterKW", "ESG Values", "SingleFileUpload",49, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsSummerKW", "ESG Values", "SingleFileUpload",50, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsTherms", "ESG Values", "SingleFileUpload",51, 1);
		clickWebelement("SingleFileUpload", "CloseButton");
	}
	public static void InstallationValidation() {
		explicitWaitForClickable(3000, "SingleFileUpload", "InstallationLink");
		clickWebelement("SingleFileUpload", "InstallationLink");
		explicitWait(3000, "SingleFileUpload", "MeasurePQty");
		VarifyElementForExistingValueWithText("SingleFileUpload", "MeasurePQty", "ESG Values", "SingleFileUpload", 16, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "MeasureIQty", "ESG Values", "SingleFileUpload", 17, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "IncentiveUnitPrice", "ESG Values", "SingleFileUpload", 18, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "IncentiveAmount", "ESG Values", "SingleFileUpload", 19, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsKWH", "ESG Values", "SingleFileUpload",20, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsKW", "ESG Values", "SingleFileUpload",21, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsWinterKW", "ESG Values", "SingleFileUpload",22, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsSummerKW", "ESG Values", "SingleFileUpload",23, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "SavingsTherms", "ESG Values", "SingleFileUpload",24, 1);
		clickWebelement("SingleFileUpload", "CloseButton");
	}
	
	public static void Invoicing() {
		ClickByActionClass("SingleFileUpload", "MainMenu", "ESG Values", "SingleFileUpload", 27, 1);
		explicitWaitForClickable(3000, "SingleFileUpload", "NewButton");
		clickWebelement("SingleFileUpload", "NewButton");
		clickWebelement("SingleFileUpload", "NextButton");
		clickWebelement("SingleFileUpload", "ProgramDropDown");
		enterTextboxValue("SingleFileUpload", "ProgramInput", "ESG Values", "SingleFileUpload", 28, 1);
		clickWebelement("SingleFileUpload", "ProgramSelect");
		clickWebelement("SingleFileUpload", "ProgramYearDropDown");
		enterTextboxValue("SingleFileUpload", "ProgramYearInput", "ESG Values", "SingleFileUpload", 29, 1);
		clickWebelement("SingleFileUpload", "ProgramYearSelect");
		clickWebelement("SingleFileUpload", "PayeeDropDown");
		enterTextboxValue("SingleFileUpload", "PayeeInput", "ESG Values", "SingleFileUpload", 30, 1);
		clickWebelement("SingleFileUpload", "PayeeSelect");
		if (driver.getPageSource().contains("A draft Invoice(s) already exists, would you like to proceed and over-write the existing draft Invoice(s)?")) {
		
			clickWebelement("SingleFileUpload", "InvoicePopOkButton");
		} else {
				
			System.out.println("Pop Up not displayed");
		}
		clickWebelement("SingleFileUpload", "CreateButton");
		test.log(LogStatus.PASS, "Invoice is successfully Created");
	}
	public static void GenerateInvoice() {
		explicitWaitForClickable(3000, "SingleFileUpload", "InvoiceTotal");
		VarifyElementForExistingValueWithText("SingleFileUpload", "InvoiceTotal", "ESG Values", "SingleFileUpload",31, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "NumberOfEnrollments", "ESG Values", "SingleFileUpload",32, 1);
		
		//Enrollment tab Validations
		clickWebelement("SingleFileUpload", "EnrollmentTab");
		VarifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentInvoicingAmount", "ESG Values", "SingleFileUpload",35, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingKWh", "ESG Values", "SingleFileUpload",36, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingKW", "ESG Values", "SingleFileUpload",37, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingWinterKW", "ESG Values", "SingleFileUpload",38, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingSummerKW", "ESG Values", "SingleFileUpload",39, 1);
		VarifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingTherms", "ESG Values", "SingleFileUpload",40, 1);
		clickWebelement("SingleFileUpload", "InvoicingDetailsTab");
		explicitWaitForClickable(3000, "SingleFileUpload", "GenerateButton");
		clickWebelement("SingleFileUpload", "GenerateButton");
		handlePopup();
		explicitWaitForClickable(3000, "SingleFileUpload", "ApproveButton");
		clickWebelement("SingleFileUpload", "ApproveButton");
		VarifyElementForExistingValueWithText("SingleFileUpload", "StatusOftheInvoice", "ESG Values", "SingleFileUpload",41, 1);
	}
}

