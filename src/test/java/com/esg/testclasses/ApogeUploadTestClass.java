package com.esg.testclasses;

import java.awt.AWTException;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class ApogeUploadTestClass extends HelperClass {
public static void Login() {
		
		login("Helper","BaseURL", 1, 0, 1, 1);
	}
public static void UploadFile() throws AWTException {
	
	ClickByActionClass("ApogeUpload", "MainMenu", "ESG Values", "Apoge Upload", 1, 1);
	selectDropdownByVisibleText("ApogeUpload", "UploadType", "ESG Values", "Apoge Upload", 2, 1);
	threadWait(2500);
	clickWebelement("ApogeUpload", "SelectUpload1");
	threadWait(5000);
	UploadFile("ApogeUpload", "Filepath1");
	threadWait(5000);
	clickWebelement("ApogeUpload", "SelectUpload2");
	threadWait(5000);
	UploadFile("ApogeUpload", "Filepath2");
	threadWait(2500);
	clickWebelement("ApogeUpload", "UploadButton");
	explicitWait(300, "ApogeUpload", "CompletedStatus");
	test.log(LogStatus.PASS, "Files are uploaded Successfully");
}
public static void Enrollment() {
	ClickByActionClass("ApogeUpload", "MainMenu", "ESG Values", "Apoge Upload", 3, 1);
	enterTextboxValue("ApogeUpload", "ReferenceNumber", "ESG Values", "Apoge Upload", 4, 1);
	scrollToElement("ApogeUpload", "SearchButton");
	clickWebelement("ApogeUpload", "SearchButton");
	clickWebelement("ApogeUpload", "EnrollmentList");
	defineLogs("Application", "Closed - Work Completed", "Closed - Work Completed", "Workflow step is displayed", "Workflow step is not displayed", "ApogeUpload", "ValidateApplicationstep");
}
public static void VerifyApogeeWithModifiedFiles() {
	defineLogs("Application", "Owen Electric", "Owen Electric", "Trade Ally Name is Verified", "Trade Ally Name is not Verified", "ApogeUpload", "ApplicationTradeAlly");
	defineLogs("Application", "Closed - Work Completed", "Closed - Work Completed", "Status of the Application is Validated", "Status of the Application is not Validated", "ApogeUpload", "ApplicationStatus");
	defineLogs("Enrollment Savings", "1173.0000", "1173.0000", "The Enrollment Savings Value is Verified", "The Enrollment Savings Value is not Verified", "ApogeUpload", "VerifyEnrollmentSavingsKwh");
	clickWebelement("ApogeUpload", "ApplicationLink");
	threadWait(5000);
	scrollToElement("ApogeUpload", "Measure");
	clickWebelement("ApogeUpload", "Measure");
	threadWait(5000);
	//Verifying the values of Measure Name "Energy Audit - Billing Insights Audit (AuditRec - AuditBi)"
	defineLogs("Application - Measures - Work Completed", "1", "1", "Measure I QTY Value is Validated", "Measure I QTY Value is not Validated", "ApogeUpload", "MeasureQTY1");
	defineLogs("Application - Measures - Work Completed", "$0.00", "$0.00", "Incentive Amount Value is Validated", "Incentive Amount Value is not Validated", "ApogeUpload", "IncentiveAmount1");
	defineLogs("Application - Measures - Work Completed", "523.0000", "523.0000", "Savings KWh Value is Validated", "Savings KWh Value is not Validated", "ApogeUpload", "SavingsKWh1");
	
	defineLogs("Application - Measures - Work Completed", "1", "1", "Measure I QTY Value is Validated", "Measure I QTY Value is not Validated", "ApogeUpload", "MeasureQTY2");
	defineLogs("Application - Measures - Work Completed", "$0.00", "$0.00", "Incentive Amount Value is Validated", "Incentive Amount Value is not Validated", "ApogeUpload", "IncentiveAmount2");
	defineLogs("Application - Measures - Work Completed", "0.0000", "0.0000", "Savings KWh Value is Validated", "Savings KWh Value is not Validated", "ApogeUpload", "SavingsKWh2");
	
	defineLogs("Application - Measures - Work Completed", "1", "1", "Measure I QTY Value is Validated", "Measure I QTY Value is not Validated", "ApogeUpload", "MeasureQTY3");
	defineLogs("Application - Measures - Work Completed", "$0.00", "$0.00", "Incentive Amount Value is Validated", "Incentive Amount Value is not Validated", "ApogeUpload", "IncentiveAmount3");
	defineLogs("Application - Measures - Work Completed", "650.0000", "650.0000", "Savings KWh Value is Validated", "Savings KWh Value is not Validated", "ApogeUpload", "SavingsKWh3");
	scrollToElement("ApogeUpload", "GrandTotalIncentives");
	defineLogs("Grand Total", "$0.00", "$0.00", "Grand Total of Incentive Value is Validated", "Grand Total of Incentive Value is not Validated", "ApogeUpload", "GrandTotalIncentives");
	defineLogs("Grand Total", "1,173.0000", "1,173.0000", "Grand Total of KWh Value is Validated", "Grand Total KWh Value is not Validated", "ApogeUpload", "GrandTotalKWh");
}
public static void UploadFile2() throws AWTException {
	
	ClickByActionClass("ApogeUpload", "MainMenu", "ESG Values", "Apoge Upload", 1, 1);
	selectDropdownByVisibleText("ApogeUpload", "UploadType", "ESG Values", "Apoge Upload", 2, 1);
	threadWait(2500);
	clickWebelement("ApogeUpload", "SelectUpload1");
	threadWait(5000);
	UploadFile("ApogeUpload", "Filepath3");
	threadWait(2500);
	clickWebelement("ApogeUpload", "SelectUpload2");
	threadWait(5000);
	UploadFile("ApogeUpload", "Filepath4");
	threadWait(2500);
	clickWebelement("ApogeUpload", "UploadButton");
	explicitWait(300, "ApogeUpload", "CompletedStatus");
	test.log(LogStatus.PASS, "Files are uploaded Successfully");
}
public static void Enrollment2() {
	ClickByActionClass("ApogeUpload", "MainMenu", "ESG Values", "Apoge Upload", 3, 1);
	enterTextboxValue("ApogeUpload", "ReferenceNumber", "ESG Values", "Apoge Upload", 5, 1);
	threadWait(2500);
	scrollToElement("ApogeUpload", "SearchButton");
	clickWebelement("ApogeUpload", "SearchButton");
	threadWait(5000);
	clickWebelement("ApogeUpload", "EnrollmentList");
	defineLogs("Application", "Closed - Work Completed", "Closed - Work Completed", "Workflow step is displayed", "Workflow step is not displayed", "ApogeUpload", "ValidateApplicationstep");
}
public static void VerifyApogeeWithoutModifiedFiles() {
	defineLogs("Application", "Owen Electric", "Owen Electric", "Trade Ally Name is Verified", "Trade Ally Name is not Verified", "ApogeUpload", "ApplicationTradeAlly");
	defineLogs("Application", "Closed - Work Completed", "Closed - Work Completed", "Status of the Application is Validated", "Status of the Application is not Validated", "ApogeUpload", "ApplicationStatus");
	defineLogs("Enrollment Savings", "1173.0000", "1173.0000", "The Enrollment Savings Value is Verified", "The Enrollment Savings Value is not Verified", "ApogeUpload", "VerifyEnrollmentSavingsKwh");
	clickWebelement("ApogeUpload", "InstallationLink");
	threadWait(5000);
	//Verifying the values of Measure Name "Energy Audit - Billing Insights Audit (AuditRec - AuditBi)"
	defineLogs("1", "1", "1", "Measure I QTY Value is Validated", "Measure I QTY Value is not Validated", "ApogeUpload", "MeasureQTYWitout1");
	defineLogs("$0.00", "$0.00", "$0.00", "Incentive Amount Value is Validated", "Incentive Amount Value is not Validated", "ApogeUpload", "IncentiveAmountWithout1");
	defineLogs("0.0000", "0.0000", "0.0000", "Savings KWh Value is Validated", "Savings KWh Value is not Validated", "ApogeUpload", "SavingsKWhWithout1");
	
	defineLogs("1", "1", "1", "Measure I QTY Value is Validated", "Measure I QTY Value is not Validated", "ApogeUpload", "MeasureQTYWitout2");
	defineLogs("$0.00", "$0.00", "$0.00", "Incentive Amount Value is Validated", "Incentive Amount Value is not Validated", "ApogeUpload", "IncentiveAmountWithout2");
	defineLogs("0.0000", "0.0000", "0.0000", "Savings KWh Value is Validated", "Savings KWh Value is not Validated", "ApogeUpload", "SavingsKWhWithout2");
	scrollToElement("ApogeUpload", "MeasureQTYWitout3");
	defineLogs("1", "1", "1", "Measure I QTY Value is Validated", "Measure I QTY Value is not Validated", "ApogeUpload", "MeasureQTYWitout3");
	defineLogs("$0.00", "$0.00", "$0.00", "Incentive Amount Value is Validated", "Incentive Amount Value is not Validated", "ApogeUpload", "IncentiveAmountWithout3");
	defineLogs("0.0000", "0.0000", "0.0000", "Savings KWh Value is Validated", "Savings KWh Value is not Validated", "ApogeUpload", "SavingsKWhWithout3");
	scrollToElement("ApogeUpload", "GrandTotalIncentives");
	defineLogs("Grand Total", "$0.00", "$0.00", "Grand Total of Incentive Value is Validated", "Grand Total of Incentive Value is not Validated", "ApogeUpload", "GrandTotalIncentives");
	defineLogs("Grand Total", "0.0000", "0.0000", "Grand Total of KWh Value is Validated", "Grand Total KWh Value is not Validated", "ApogeUpload", "GrandTotalKWh");
	Close();
}

}
