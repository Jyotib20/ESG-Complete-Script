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
	selectDropdown("SingleFileUpload", "UploadType","", "ESG Values", "SingleFileUpload", 2, 1);
	selectDropdown("SingleFileUpload", "TradeAlly","", "ESG Values", "SingleFileUpload", 3, 1);
	WaitForElement(300, "SingleFileUpload", "SelectUpload");
	clickWebelement("SingleFileUpload", "SelectUpload");
	UploadFile("SingleFileUpload", "Filepath");
	explicitWaitForClickable(3000, "SingleFileUpload", "UploadButton");
	clickWebelement("SingleFileUpload", "UploadButton");
	WaitForElement(300, "SingleFileUpload", "CompletedStatus");
	VerifyElementForExistingValueWithText("SingleFileUpload", "TotalRecords", "ESG Values", "SingleFileUpload", 4, 1);
	VerifyElementForExistingValueWithText("SingleFileUpload", "SuccessfullEnrollments", "ESG Values", "SingleFileUpload", 5, 1);
}
	public static void Enrollment() {
		ClickByActionClass("SingleFileUpload", "MainMenu", "ESG Values", "SingleFileUpload", 6, 1);
		enterTextboxValue("SingleFileUpload", "ReferenceNumber", "ESG Values", "SingleFileUpload", 7, 1);
		scrollToElement("SingleFileUpload", "SearchButton");
		clickWebelement("SingleFileUpload", "SearchButton");
		//WaitForElement(300, "SingleFileUpload", "EnrollmentList");
		threadWait(5000);
		clickWebelement("ApogeUpload", "EnrollmentList");
		WaitForElement(300, "SingleFileUpload", "ApplicationTradeAlly");
		VerifyElementForExistingValueWithText("SingleFileUpload", "ApplicationTradeAlly", "ESG Values", "SingleFileUpload", 8, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "ApplicationStatus", "ESG Values", "SingleFileUpload", 9, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "InstallationTradeAlly", "ESG Values", "SingleFileUpload", 10, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "InstallationStatus", "ESG Values", "SingleFileUpload", 11, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "InspectionTradeAlly", "ESG Values", "SingleFileUpload", 12, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "InspectionStatus", "ESG Values", "SingleFileUpload",13, 1);
	}
	public static void ApplicationValidation() {
		clickWebelement("SingleFileUpload", "ApplicationLink");
		scrollToElement("SingleFileUpload", "MeasureTab");
		clickWebelement("SingleFileUpload", "MeasureTab");
		VerifyElementForExistingValueWithText("SingleFileUpload", "MeasurePQty", "ESG Values", "SingleFileUpload", 44, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "IncentiveUnitPrice", "ESG Values", "SingleFileUpload", 45, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "IncentiveAmount", "ESG Values", "SingleFileUpload", 46, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsKWH", "ESG Values", "SingleFileUpload",47, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsKW", "ESG Values", "SingleFileUpload",48, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsWinterKW", "ESG Values", "SingleFileUpload",49, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsSummerKW", "ESG Values", "SingleFileUpload",50, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsTherms", "ESG Values", "SingleFileUpload",51, 1);
		clickWebelement("SingleFileUpload", "CloseButton");
	}
	public static void InstallationValidation() {
		WaitForElement(300, "SingleFileUpload", "InstallationLink");
		clickWebelement("SingleFileUpload", "InstallationLink");
		WaitForElement(300, "SingleFileUpload", "MeasurePQty");
		VerifyElementForExistingValueWithText("SingleFileUpload", "MeasurePQty", "ESG Values", "SingleFileUpload", 16, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "MeasureIQty", "ESG Values", "SingleFileUpload", 17, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "IncentiveUnitPrice", "ESG Values", "SingleFileUpload", 18, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "IncentiveAmount", "ESG Values", "SingleFileUpload", 19, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsKWH", "ESG Values", "SingleFileUpload",20, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsKW", "ESG Values", "SingleFileUpload",21, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsWinterKW", "ESG Values", "SingleFileUpload",22, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsSummerKW", "ESG Values", "SingleFileUpload",23, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "SavingsTherms", "ESG Values", "SingleFileUpload",24, 1);
		clickWebelement("SingleFileUpload", "CloseButton");
	}
	
	public static void Invoicing() {
		ClickByActionClass("SingleFileUpload", "MainMenu", "ESG Values", "SingleFileUpload", 27, 1);
		WaitForElement(300, "SingleFileUpload", "NewButton");
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
		WaitForElement(300, "SingleFileUpload", "InvoiceTotal");
		VerifyElementForExistingValueWithText("SingleFileUpload", "InvoiceTotal", "ESG Values", "SingleFileUpload",31, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "NumberOfEnrollments", "ESG Values", "SingleFileUpload",32, 1);
		
		//Enrollment tab Validations
		clickWebelement("SingleFileUpload", "EnrollmentTab");
		VerifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentInvoicingAmount", "ESG Values", "SingleFileUpload",35, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingKWh", "ESG Values", "SingleFileUpload",36, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingKW", "ESG Values", "SingleFileUpload",37, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingTherms", "ESG Values", "SingleFileUpload",38, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingWinterKW", "ESG Values", "SingleFileUpload",39, 1);
		VerifyElementForExistingValueWithText("SingleFileUpload", "EnrollmentSavingSummerKW", "ESG Values", "SingleFileUpload",40, 1);
		clickWebelement("SingleFileUpload", "InvoicingDetailsTab");
		WaitForElement(300, "SingleFileUpload", "GenerateButton");
		clickWebelement("SingleFileUpload", "GenerateButton");
		handlePopup();
		WaitForElement(300, "SingleFileUpload", "ApproveButton");
		clickWebelement("SingleFileUpload", "ApproveButton");
		VerifyElementForExistingValueWithText("SingleFileUpload", "StatusOftheInvoice", "ESG Values", "SingleFileUpload",41, 1);
	}
}