package com.esg.testclasses;

import java.awt.AWTException;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class Compressed_FileUpload_With_Installation_TestClass extends HelperClass {
	
		public static void UploadFile() throws AWTException {
			ClickByActionClass("CompressedFileUploadWithInstallation", "MainMenu", "ESG Values", "CompressedFileUploadInstall", 1, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "SelectUpload");
			threadWait(5000);
			UploadFile("CompressedFileUploadWithInstallation", "Filepath");
			threadWait(2500);
			selectDropdownByVisibleText("CompressedFileUploadWithInstallation", "UploadType", "ESG Values", "CompressedFileUploadInstall", 2, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "UploadButton");
			explicitWait(3000, "CompressedFileUploadWithInstallation", "StatusWait");
			test.log(LogStatus.INFO, "File is uploaded successfully");
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "TotalRecords", "ESG Values", "CompressedFileUploadInstall", 59, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SuccessfullEnrollments", "ESG Values", "CompressedFileUploadInstall", 60, 1);
		}
		public static void Enrollment() {
			ClickByActionClass("CompressedFileUploadWithInstallation", "MainMenu", "ESG Values", "CompressedFileUploadInstall", 3, 1);
			enterTextboxValue("CompressedFileUploadWithInstallation", "ReferenceNumber", "ESG Values", "CompressedFileUploadInstall", 4, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "SearchButton");
			threadWait(5000);
			clickWebelement("CompressedFileUploadWithInstallation", "EnrollmentList");
			explicitWait(3000, "CompressedFileUploadWithInstallation", "ApplicationTradeAlly");
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "ApplicationTradeAlly", "ESG Values", "CompressedFileUploadInstall", 6, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "ApplicationStatus", "ESG Values", "CompressedFileUploadInstall", 7, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "InstallationTradeAlly", "ESG Values", "CompressedFileUploadInstall", 8, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "InstallationStatus", "ESG Values", "CompressedFileUploadInstall", 9, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "InspectionTradeAlly", "ESG Values", "CompressedFileUploadInstall", 10, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "InspectionStatus", "ESG Values", "CompressedFileUploadInstall",11, 1);
		}
		public static void ApplicationValidation() {
			clickWebelement("CompressedFileUploadWithInstallation", "ApplicationLink");
			scrollToElement("CompressedFileUploadWithInstallation", "MeasureTab");
			clickWebelement("CompressedFileUploadWithInstallation", "MeasureTab");
			/*explicitWait(3000, "CompressedFileUploadWithInstallation", "MeasurePQty");*/
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "MeasurePQty", "ESG Values", "CompressedFileUploadInstall", 14, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "IncentiveUnitPrice", "ESG Values", "CompressedFileUploadInstall", 15, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "IncentiveAmount", "ESG Values", "CompressedFileUploadInstall", 16, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsKWH", "ESG Values", "CompressedFileUploadInstall",17, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsKW", "ESG Values", "CompressedFileUploadInstall",18, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsWinterKW", "ESG Values", "CompressedFileUploadInstall",19, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsSummerKW", "ESG Values", "CompressedFileUploadInstall",20, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsTherms", "ESG Values", "CompressedFileUploadInstall",21, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "CloseButton");

		}
		public static void InstallationValidation() {
			explicitWaitForClickable(3000, "CompressedFileUploadWithInstallation", "InstallationLink");
			clickWebelement("CompressedFileUploadWithInstallation", "InstallationLink");
			explicitWait(3000, "CompressedFileUploadWithInstallation", "MeasurePQty");
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "MeasurePQty", "ESG Values", "CompressedFileUploadInstall", 24, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "MeasureIQty", "ESG Values", "CompressedFileUploadInstall", 25, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "IncentiveUnitPrice", "ESG Values", "CompressedFileUploadInstall", 26, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "IncentiveAmount", "ESG Values", "CompressedFileUploadInstall", 27, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsKWH", "ESG Values", "CompressedFileUploadInstall",28, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsKW", "ESG Values", "CompressedFileUploadInstall",29, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsWinterKW", "ESG Values", "CompressedFileUploadInstall",30, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsSummerKW", "ESG Values", "CompressedFileUploadInstall",31, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "SavingsTherms", "ESG Values", "CompressedFileUploadInstall",32, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "CloseButton");
		}
		public static void JobCostSummaryValidation() {
			scrollToElement("CompressedFileUploadWithInstallation", "JobCostSummaryTab");
			clickWebelement("CompressedFileUploadWithInstallation", "JobCostSummaryTab");
			explicitWait(3000, "CompressedFileUploadWithInstallation", "Payee");
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "Payee", "ESG Values", "CompressedFileUploadInstall", 35, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "MeasureName", "ESG Values", "CompressedFileUploadInstall", 36, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "MeasureQty", "ESG Values", "CompressedFileUploadInstall", 37, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "Amount", "ESG Values", "CompressedFileUploadInstall", 38, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "CloseButton");
		}
		public static void Invoicing() {
			ClickByActionClass("CompressedFileUploadWithInstallation", "MainMenu", "ESG Values", "CompressedFileUploadInstall", 42, 1);
			explicitWaitForClickable(3000, "CompressedFileUploadWithInstallation", "NewButton");
			clickWebelement("CompressedFileUploadWithInstallation", "NewButton");
			clickWebelement("CompressedFileUploadWithInstallation", "NextButton");
			clickWebelement("CompressedFileUploadWithInstallation", "ProgramDropDown");
			enterTextboxValue("CompressedFileUploadWithInstallation", "ProgramInput", "ESG Values", "CompressedFileUploadInstall", 43, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "ProgramSelect");
			clickWebelement("CompressedFileUploadWithInstallation", "ProgramYearDropDown");
			enterTextboxValue("CompressedFileUploadWithInstallation", "ProgramYearInput", "ESG Values", "CompressedFileUploadInstall", 44, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "ProgramYearSelect");
			clickWebelement("CompressedFileUploadWithInstallation", "PayeeDropDown");
			enterTextboxValue("CompressedFileUploadWithInstallation", "PayeeInput", "ESG Values", "CompressedFileUploadInstall", 45, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "PayeeSelect");
			if (driver.getPageSource().contains("A draft Invoice(s) already exists, would you like to proceed and over-write the existing draft Invoice(s)?")) {
			
				clickWebelement("CompressedFileUploadWithInstallation", "InvoicePopOkButton");
			} else {
					
				System.out.println("Pop Up not displayed");
			}
			clickWebelement("CompressedFileUploadWithInstallation", "CreateButton");
			test.log(LogStatus.PASS, "Invoice is successfully Created");
		}
		public static void GenerateInvoice() {
			explicitWaitForClickable(3000, "CompressedFileUploadWithInstallation", "InvoiceTotal");
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "InvoiceTotal", "ESG Values", "CompressedFileUploadInstall",46, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "NumberOfEnrollments", "ESG Values", "CompressedFileUploadInstall",47, 1);
			
			//Enrollment tab Validations
			clickWebelement("CompressedFileUploadWithInstallation", "EnrollmentTab");
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "EnrollmentInvoicingAmount", "ESG Values", "CompressedFileUploadInstall",50, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "EnrollmentSavingKWh", "ESG Values", "CompressedFileUploadInstall",51, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "EnrollmentSavingKW", "ESG Values", "CompressedFileUploadInstall",52, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "EnrollmentSavingWinterKW", "ESG Values", "CompressedFileUploadInstall",53, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "EnrollmentSavingSummerKW", "ESG Values", "CompressedFileUploadInstall",54, 1);
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "EnrollmentSavingTherms", "ESG Values", "CompressedFileUploadInstall",55, 1);
			clickWebelement("CompressedFileUploadWithInstallation", "InvoicingDetailsTab");
			explicitWaitForClickable(3000, "CompressedFileUploadWithInstallation", "GenerateButton");
			clickWebelement("CompressedFileUploadWithInstallation", "GenerateButton");
			handlePopup();
			explicitWaitForClickable(3000, "CompressedFileUploadWithInstallation", "ApproveButton");
			clickWebelement("CompressedFileUploadWithInstallation", "ApproveButton");
			VarifyElementForExistingValueWithText("CompressedFileUploadWithInstallation", "StatusOftheInvoice", "ESG Values", "CompressedFileUploadInstall",56, 1);
		}
		
		
	}


