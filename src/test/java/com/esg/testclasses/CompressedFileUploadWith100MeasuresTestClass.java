package com.esg.testclasses;

import java.awt.AWTException;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class CompressedFileUploadWith100MeasuresTestClass extends HelperClass {
	public static void Login() {
		
		login("Helper","BaseURL", 1, 0, 1, 1);
	}

	public static void UploadFile() throws AWTException {
		
		ClickByActionClass("CompressedFileUploadWith100Measures", "MainMenu", "ESG Values", "Compressed File Upload With 100", 1, 1);
		clickWebelement("CompressedFileUploadWith100Measures", "SelectUpload");
		threadWait(5000);
		UploadFile("CompressedFileUploadWith100Measures", "Filepath");
		threadWait(2500);
		selectDropdown("CompressedFileUploadWith100Measures", "UploadType","", "ESG Values", "Compressed File Upload With 100", 2, 1);
		clickWebelement("CompressedFileUploadWith100Measures", "UploadButton");
		WaitForElement(3000, "CompressedFileUploadWith100Measures", "StatusWait");
		test.log(LogStatus.INFO, "File is uploaded successfully");
	}
	public static void Enrollment() {
		ClickByActionClass("CompressedFileUploadWith100Measures", "MainMenu", "ESG Values", "Compressed File Upload With 100", 3, 1);
		enterTextboxValue("CompressedFileUploadWith100Measures", "ReferenceNumber", "ESG Values", "Compressed File Upload With 100", 4, 1);
		clickWebelement("CompressedFileUploadWith100Measures", "SearchButton");
		//threadWait(5000);
		WaitForElement(3000, "CompressedFileUploadWith100Measures", "EnrollmentList");
		clickWebelement("CompressedFileUploadWith100Measures", "EnrollmentList");
		defineLogs("Application", "Closed - Work Completed", "Closed - Work Completed", "Workflow step is displayed", "Workflow step is not displayed", "CompressedFileUploadWith100Measures", "ValidateApplicationstep");
	}
	public static void SubMenuSummaryValidaition() {
		scrollToElement("CompressedFileUploadWith100Measures", "TotalCost");
		threadWait(2500);
		defineLogs("Enrollment Incentives", "$4,000.00", "$4,000.00", "Incentive Total Cost is validated", "Incentive Total Cost is failed to validate", "CompressedFileUploadWith100Measures", "TotalCost");
		defineLogs("Enrollment Savings", "1256.0000", "1256.0000", "Savings KWH value is validated", "Savings KWH value is failed to validate", "CompressedFileUploadWith100Measures", "WorkFlowStepSavingKWH");
		defineLogs("Enrollment Savings", "0.6480", "0.6480", "Savings KW value is validated", "Savings KW value is failed to validate", "CompressedFileUploadWith100Measures", "WorkFlowStepSavingKW");
		defineLogs("Enrollment Savings", "0.0000", "0.0000", "Savings Winter KW value is validated", "Savings Winter KW value is failed to validate", "CompressedFileUploadWith100Measures", "WorkFlowStepSavingWinterKWH");
		defineLogs("Enrollment Savings", "0.0000", "0.0000", "Savings Summer KW value is validated", "Savings Summer KW value is failed to validate", "CompressedFileUploadWith100Measures", "WorkFlowStepSavingSummerKWH");
		defineLogs("Enrollment Savings", "343.2000", "343.2000", "Therms value is validated", "Therms is failed to validate", "CompressedFileUploadWith100Measures", "Therms2");
	}
	public static void ApplicationMeasuresValidation() {
		scrollToElement("CompressedFileUploadWith100Measures", "Measure");
		clickWebelement("CompressedFileUploadWith100Measures", "Measure");
		defineLogs("$4,000.00", "$4,000.00", "$4,000.00", "Incentive amount is validated", "Incentive amount is failed to validate", "CompressedFileUploadWith100Measures", "VerifyIncentiveAmount");
		defineLogs("1256.0000", "1256.0000", "1256.0000", "Savings KWH value is validated", "Savings KWH value is failed to validate", "CompressedFileUploadWith100Measures", "VerifySavingKwh");
		defineLogs("0.6480", "0.6480", "0.6480", "Savings KW value is validated", "Savings KW value is failed to validate", "CompressedFileUploadWith100Measures", "VerifySavingKW");
		defineLogs("0.0000", "0.0000", "0.0000", "Savings Winter KW value is validated", "Savings Winter KW value is failed to validate", "CompressedFileUploadWith100Measures", "VerifySavingWinterKW");
		defineLogs("0.0000", "0.0000", "0.0000", "Savings Summer KW value is validated", "Savings Summer KW value is failed to validate", "CompressedFileUploadWith100Measures", "VerifySavingSummerKW");
		defineLogs("343.2000", "343.2000", "343.2000", "Therms value is validated", "Therms is failed to validate", "CompressedFileUploadWith100Measures", "Therms");
	}
	public static void JobCostSummaryValidation() {
		scrollToElement("CompressedFileUploadWith100Measures", "JoBCostSummary");
		clickWebelement("CompressedFileUploadWith100Measures", "JoBCostSummary");
		threadWait(2500);
		scrollToElement("CompressedFileUploadWith100Measures", "CostSummaryQty");
		defineLogs("1", "1", "1", "Job Cost Summary Quantity value is validated", "Job Cost Summary Quantity value is failed to validate", "CompressedFileUploadWith100Measures", "CostSummaryQty");
		defineLogs("$4,000.00", "$4,000.00", "$4,000.00", "Job Cost Summary Total value is validated", "Job Cost Summary Total is failed to validate", "CompressedFileUploadWith100Measures", "JobCostTotal");
		clickWebelement("CompressedFileUploadWith100Measures", "JobCostClose");
	}
	public static void QAReviewProcess() {
		//threadWait(5000);
		WaitForElement(30, "CompressedFileUploadWith100Measures", "QAReview");
		clickWebelement("CompressedFileUploadWith100Measures", "QAReview");
		//threadWait(5000);
		WaitForElement(30, "CompressedFileUploadWith100Measures", "OutcomePass");
		clickWebelement("CompressedFileUploadWith100Measures", "OutcomePass");
		clickWebelement("CompressedFileUploadWith100Measures", "PaymentRequest");
		selectActualReviewDate();
		clickWebelement("CompressedFileUploadWith100Measures", "QAReviewSave");
		//threadWait(2500);
		WaitForElement(30, "CompressedFileUploadWith100Measures", "QAReviewProcess");
		clickWebelement("CompressedFileUploadWith100Measures", "QAReviewProcess");
		threadWait(5000);
		test.log(LogStatus.PASS, "QA review Step has been Processed Successfully");
	}
	public static void InitiatePaymentProcess() {
		clickWebelement("CompressedFileUploadWith100Measures", "Initiatepayment");
		threadWait(2500);
		WaitForElement(30, "CompressedFileUploadWith100Measures", "Payee");
	//	selectActualReviewDate();
		defineLogs("Howards - ALTN", "Howards - ALTN", "Howards - ALTN", "Payee Name is successfully validated", "Wrong Payee Name is selected", "CompressedFileUploadWith100Measures", "Payee");
		scrollToElement("CompressedFileUploadWith100Measures", "InitiatepaymentTotalCost");
		defineLogs("$4,000.00", "$4,000.00", "$4,000.00", "Job Cost Summary Total value is validated", "Job Cost Summary Total is failed to validate", "CompressedFileUploadWith100Measures", "InitiatepaymentTotalCost");
		scrollToElement("CompressedFileUploadWith100Measures", "InitiatepaymentRadioButton");
		clickWebelement("CompressedFileUploadWith100Measures", "InitiatepaymentRadioButton");
		scrollToElement("CompressedFileUploadWith100Measures", "QAReviewSave");
		clickWebelement("CompressedFileUploadWith100Measures", "QAReviewSave");
		//threadWait(5000);
		WaitForElement(30, "CompressedFileUploadWith100Measures", "Payee");
		defineLogs("Howards - ALTN", "Howards - ALTN", "Howards - ALTN", "Payee Name is successfully validated", "Wrong Payee Name is selected", "CompressedFileUploadWith100Measures", "Payee");
		scrollToElement("CompressedFileUploadWith100Measures", "InitiatepaymentTotalCost");
		defineLogs("$4,000.00", "$4,000.00", "$4,000.00", "Job Cost Summary Total value is validated", "Job Cost Summary Total is failed to validate", "CompressedFileUploadWith100Measures", "InitiatepaymentTotalCost");
		
		
	}
}