package com.esg.testclasses;

import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class UserDefinedWorkflowTestClass extends HelperClass {

	public static void login() {

		login("Helper","BaseURL", 1, 0, 1, 1);
	}

	public static void NavigateToEnrollment(int Progrow, int progcolumn, int Accountnorow, int Accountnocolumn) {
		ClickByActionClass("UserDefinedWorkflow", "MainMenu", "ESG Values", "User_Defined_Workflow", 2, 1);
		clickWebelement("UserDefinedWorkflow", "NewEnrollment");
		selectDropdownByVisibleText("UserDefinedWorkflow", "SelectProgram", "ESG Values", "User_Defined_Workflow",
				Progrow, progcolumn);
		clickWebelement("UserDefinedWorkflow", "NextButton");
		enterTextboxValue("UserDefinedWorkflow", "AccountNumber", "ESG Values", "User_Defined_Workflow", Accountnorow,
				Accountnocolumn);
		clickWebelement("UserDefinedWorkflow", "Go");
		doubleClickWebelement("UserDefinedWorkflow", "Customer");
		threadWait(5000);
	}
	// -----------------Automated Workflow
	// Inspection-----------------------------------------

	public static void Complete_ApplicationWorkflowStep_AutomatedWorkflow_Inspection() {
		defineLogs("Application - Applicant Information - New", "Application - Applicant Information - New",
				"Application - Applicant Information - New",
				"Enrollment was Created and Navigate to Application Workflow Step Successfully",
				"Failed to navigate to Application Workflow Step", "UserDefinedWorkflow",
				"VerifyApplication_WorkflowStep");
		scrollToElement("UserDefinedWorkflow", "Measure1");
		clickWebelement("UserDefinedWorkflow", "Measure1");
		threadWait(3000);
		defineLogs("Application - Measures - New", "Application - Measures - New", "Application - Measures - New",
				"Navigate to Application - Measure page Successfully",
				"Failed to navigate to Application - Measure page", "UserDefinedWorkflow", "VerifyMeasurepage");
		clickWebelement("UserDefinedWorkflow", "EnableMeasure");
		enterValueByActionClass("UserDefinedWorkflow", "MeasureQty", "ESG Values", "User_Defined_Workflow", 7, 1);
		clickonSave();
		clickonProcess();
		threadWait(5000);
	}

	public static void Complete_InspectionWorkflowStep_AutomatedWorkflow_Inspection(int PassedQtyROW,
			int PassedQtyCOLUMN, int FailedQtyROW, int FailedQtyCOLUMN) {
		clickWebelement("UserDefinedWorkflow", "Inspection_WorkflowStep");
		threadWait(3000);
		defineLogs("Inspection - Unscheduled / Awaiting Results", "Inspection - Unscheduled / Awaiting Results",
				"Inspection - Unscheduled / Awaiting Results", "Navigate to Inspection Workflow Step Successfully",
				"Failed to navigate to Inspection Workflow Step", "UserDefinedWorkflow",
				"VerifyInspection_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 1);
		Enter(KeyEvent.VK_ENTER);
		selectActualVisitDate();
		clickWebelement("UserDefinedWorkflow", "EnableMeasure");
		threadWait(2000);
		enterValueByActionClass("UserDefinedWorkflow", "PassedQty", "ESG Values", "User_Defined_Workflow", PassedQtyROW,
				PassedQtyCOLUMN);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("UserDefinedWorkflow", "FailedQty", "ESG Values", "User_Defined_Workflow", FailedQtyROW,
				FailedQtyCOLUMN);
		clickonSave();
		try {
			if (Xpath("UserDefinedWorkflow", "FailedMeasure").isDisplayed()) {
				clickWebelement("UserDefinedWorkflow", "FailedMeasure");
				enterValueByActionClass("UserDefinedWorkflow", "RequiredFailCode", "ESG Values",
						"User_Defined_Workflow", 17, 1);
				threadWait(1000);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2000);
				test.log(LogStatus.WARNING,
						"Inspection Workflow Step was Failed and Correction Workflow Step will generate");

			}
		} catch (Exception e) {
			System.out.println("Inspection Workflow Step was Passed");
			test.log(LogStatus.SKIP, "Inspection Workflow Step was Passed");
		}
		clickonProcess();
	}

	public static void Complete_CorrectionWorkflowStep_AutomatedWorkflow_Inspection() {
		clickWebelement("UserDefinedWorkflow", "Correction_WorkflowStep");
		threadWait(5000);
		defineLogs("Correction - Unscheduled / Awaiting Results", "Correction - Unscheduled / Awaiting Results",
				"Correction - Unscheduled / Awaiting Results", "Navigate to Correction Workflow Step Successfully",
				"Failed to navigate to Correction Workflow Step", "UserDefinedWorkflow",
				"VerifyCorrection_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 1);
		Enter(KeyEvent.VK_ENTER);
		selectActualVisitDate();
		clickWebelement("UserDefinedWorkflow", "EnableMeasure");
		threadWait(2000);
		clickWebelement("UserDefinedWorkflow", "CorrectionInfo");
		enterValueByActionClass("UserDefinedWorkflow", "CorrectionInfo", "ESG Values", "User_Defined_Workflow", 18, 1);
		Enter(KeyEvent.VK_DOWN);
		threadWait(2000);
		clickonProcess();
	}

	public static void Complete_ReinspectionWorkflowStep_AutomatedWorkflow_Inspection() {
		clickWebelement("UserDefinedWorkflow", "Reinspection_WorkflowStep");
		threadWait(3000);
		defineLogs("Reinspection - Unscheduled / Awaiting Results", "Reinspection - Unscheduled / Awaiting Results",
				"Reinspection - Unscheduled / Awaiting Results", "Navigate to Inspection Workflow Step Successfully",
				"Failed to navigate to Inspection Workflow Step", "UserDefinedWorkflow",
				"VerifyReinspection_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 1);
		Enter(KeyEvent.VK_ENTER);
		selectActualVisitDate();
		clickWebelement("UserDefinedWorkflow", "EnableMeasure");
		threadWait(2000);
		enterValueByActionClass("UserDefinedWorkflow", "PassedQty", "ESG Values", "User_Defined_Workflow", 13, 1);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("UserDefinedWorkflow", "FailedQty", "ESG Values", "User_Defined_Workflow", 14, 1);
		clickonSave();
		clickonProcess();
	}

	public static void InitiatePaymentWorkflowStep_AutomatedWorkflow_Inspection() {
		scrollToElement("UserDefinedWorkflow", "PaymentRequest");
		clickWebelement("UserDefinedWorkflow", "PaymentRequest");
		threadWait(2000);
		clickWebelement("UserDefinedWorkflow", "NewPaymentRequestImage");
		clickWebelement("UserDefinedWorkflow", "CreatePaymentRequest");
		threadWait(5000);
		defineLogs("Payment Request Summary", "Payment Request Summary", "Payment Request Summary",
				"Payment Request created Successfully", "Failed to create Payment Request", "UserDefinedWorkflow",
				"VerifyPaymentRequest");
		defineLogs("Payment Request Summary", "Payment Request Summary", "Payment Request Summary",
				"Payment Request Payee validated Successfully", "Failed to Validate Payment Request Payee",
				"UserDefinedWorkflow", "PaymentRequestVarifyPayee");
		defineLogs("Payment Request Summary", "Payment Request Summary", "Payment Request Summary",
				"Payment Request Invoice Amount validated Successfully",
				"Failed to validate Payment Request Invoice Amount", "UserDefinedWorkflow",
				"PaymentRequestVarifyInvoiceTotal");
		clickWebelement("UserDefinedWorkflow", "GeneratePaymentRequest");
		handlePopup();
		threadWait(2000);
		defineLogs("Payment Request Summary", "Payment Request Summary", "Payment Request Summary",
				"Payment Request Original Amount validated Successfully",
				"Failed to validate Payment Request Original Amount", "UserDefinedWorkflow",
				"PaymentRequestOriginalAMount");
		clickWebelement("UserDefinedWorkflow", "ApprovePaymentRequest");
		clickWebelement("UserDefinedWorkflow", "closeButton");
		threadWait(2000);
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary",
				"Payment Request Date validated Successfully", "Failed to validate Payment Request Date",
				"UserDefinedWorkflow", "VarifyPaymentRequestDate");
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary",
				"Payment Request Approved Payee validated Successfully",
				"Failed to validate Payment Request Approved Payee", "UserDefinedWorkflow",
				"VarifyPaymentRequestPayee");
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary",
				"Payment Request Approved Amount validated Successfully",
				"Failed to validate Payment Request Approved Amount", "UserDefinedWorkflow",
				"VarifyPaymentRequestAmount");
	}

	// ---------------Automated Workflow
	// OPAL-----------------------------------------------------

	public static void Complete_ApplicationWorkflowStep_AutomatedWorkflow_OPAL() {
		defineLogs("Application - Applicant Information - New", "Application - Applicant Information - New",
				"Application - Applicant Information - New",
				"Enrollment was Created and Navigate to Application Workflow Step Successfully",
				"Failed to navigate to Application Workflow Step", "UserDefinedWorkflow",
				"VerifyApplication_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "ProcessorTradeAlly");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 2);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "ProcessorEmployee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 2);
		Enter(KeyEvent.VK_ENTER);
		scrollToElement("UserDefinedWorkflow", "Measure");
		clickWebelement("UserDefinedWorkflow", "Measure");
		threadWait(3000);
		defineLogs("Application - Measures - New", "Application - Measures - New", "Application - Measures - New",
				"Navigate to Application - Measure page Successfully",
				"Failed to navigate to Application - Measure page", "UserDefinedWorkflow", "VerifyMeasurepage");
		clickWebelement("UserDefinedWorkflow", "AddMeasureImage");
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "SelectMeasure");
		ClickWebelementByActionClass("UserDefinedWorkflow", "SaveButton");
		threadWait(3000);
		clickWebelement("UserDefinedWorkflow", "EnableMeasure");
		enterValueByActionClass("UserDefinedWorkflow", "MeasureQty", "ESG Values", "User_Defined_Workflow", 7, 2);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("UserDefinedWorkflow", "MeasureQty", "ESG Values", "User_Defined_Workflow", 8, 2);
		clickonSave();
		clickonProcess();
		threadWait(5000);
	}

	public static void Complete_InspectionWorkflowStep_AutomatedWorkflow_OPAL() {
		clickWebelement("UserDefinedWorkflow", "Inspection_WorkflowStep");
		threadWait(3000);
		defineLogs("Inspection - Unscheduled / Awaiting Results", "Inspection - Unscheduled / Awaiting Results",
				"Inspection - Unscheduled / Awaiting Results", "Navigate to Inspection Workflow Step Successfully",
				"Failed to navigate to Inspection Workflow Step", "UserDefinedWorkflow",
				"VerifyInspection_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 11, 2);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 12, 2);
		Enter(KeyEvent.VK_ENTER);
		selectActualVisitDate();
		clickWebelement("UserDefinedWorkflow", "EnableMeasure");
		threadWait(2000);
		enterValueByActionClass("UserDefinedWorkflow", "PassedQty", "ESG Values", "User_Defined_Workflow", 13, 2);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("UserDefinedWorkflow", "FailedQty", "ESG Values", "User_Defined_Workflow", 14, 2);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Month_1_WorkflowStep_AutomatedWorkflow_OPAL() {
		clickWebelement("UserDefinedWorkflow", "OPAL_Month1_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 1 - Unscheduled / Awaiting Results", "Month - 1 - Unscheduled / Awaiting Results",
				"Month - 1 - Unscheduled / Awaiting Results", "Navigate to Month-1 Workflow Step Successfully",
				"Failed to navigate to Month-1 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month1");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_2_WorkflowStep_AutomatedWorkflow_OPAL() {
		clickWebelement("UserDefinedWorkflow", "OPAL_Month2_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 2 - Unscheduled / Awaiting Results", "Month - 2 - Unscheduled / Awaiting Results",
				"Month - 2 - Unscheduled / Awaiting Results", "Navigate to Month-2 Workflow Step Successfully",
				"Failed to navigate to Month-2 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month2");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_3_WorkflowStep_AutomatedWorkflow_OPAL() {
		clickWebelement("UserDefinedWorkflow", "OPAL_Month3_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 3 - Unscheduled / Awaiting Results", "Month - 3 - Unscheduled / Awaiting Results",
				"Month - 3 - Unscheduled / Awaiting Results", "Navigate to Month-3 Workflow Step Successfully",
				"Failed to navigate to Month-3 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month3");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_4_WorkflowStep_AutomatedWorkflow_OPAL() {
		clickWebelement("UserDefinedWorkflow", "OPAL_Month4_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 4 - Unscheduled / Awaiting Results", "Month - 4 - Unscheduled / Awaiting Results",
				"Month - 4 - Unscheduled / Awaiting Results", "Navigate to Month-4 Workflow Step Successfully",
				"Failed to navigate to Month-4 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month4");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_5_WorkflowStep_AutomatedWorkflow_OPAL() {
		clickWebelement("UserDefinedWorkflow", "OPAL_Month5_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 5 - Unscheduled / Awaiting Results", "Month - 5 - Unscheduled / Awaiting Results",
				"Month - 5 - Unscheduled / Awaiting Results", "Navigate to Month-5 Workflow Step Successfully",
				"Failed to navigate to Month-5 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month5");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_6_WorkflowStep_AutomatedWorkflow_OPAL() {
		clickWebelement("UserDefinedWorkflow", "OPAL_Month6_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 6 - Unscheduled / Awaiting Results", "Month - 6 - Unscheduled / Awaiting Results",
				"Month - 6 - Unscheduled / Awaiting Results", "Navigate to Month-6 Workflow Step Successfully",
				"Failed to navigate to Month-6 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month6");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_7_WorkflowStep_AutomatedWorkflow_OPAL() {
		scrollToElement("UserDefinedWorkflow", "OPAL_Month7_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "OPAL_Month7_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 7 - Unscheduled / Awaiting Results", "Month - 7 - Unscheduled / Awaiting Results",
				"Month - 7 - Unscheduled / Awaiting Results", "Navigate to Month-7 Workflow Step Successfully",
				"Failed to navigate to Month-7 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month7");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_8_WorkflowStep_AutomatedWorkflow_OPAL() {
		scrollToElement("UserDefinedWorkflow", "OPAL_Month8_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "OPAL_Month8_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 8 - Unscheduled / Awaiting Results", "Month - 8 - Unscheduled / Awaiting Results",
				"Month - 8 - Unscheduled / Awaiting Results", "Navigate to Month-8 Workflow Step Successfully",
				"Failed to navigate to Month-8 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month8");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_9_WorkflowStep_AutomatedWorkflow_OPAL() {
		scrollToElement("UserDefinedWorkflow", "OPAL_Month9_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "OPAL_Month9_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 9 - Unscheduled / Awaiting Results", "Month - 9 - Unscheduled / Awaiting Results",
				"Month - 9 - Unscheduled / Awaiting Results", "Navigate to Month-9 Workflow Step Successfully",
				"Failed to navigate to Month-9 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month9");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_10_WorkflowStep_AutomatedWorkflow_OPAL() {
		scrollToElement("UserDefinedWorkflow", "OPAL_Month10_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "OPAL_Month10_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 10 - Unscheduled / Awaiting Results", "Month - 10 - Unscheduled / Awaiting Results",
				"Month - 10 - Unscheduled / Awaiting Results", "Navigate to Month-10 Workflow Step Successfully",
				"Failed to navigate to Month-10 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month10");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_11_WorkflowStep_AutomatedWorkflow_OPAL() {
		scrollToElement("UserDefinedWorkflow", "OPAL_Month11_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "OPAL_Month11_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 11 - Unscheduled / Awaiting Results", "Month - 11 - Unscheduled / Awaiting Results",
				"Month - 11 - Unscheduled / Awaiting Results", "Navigate to Month-11 Workflow Step Successfully",
				"Failed to navigate to Month-11 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month11");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Month_12_WorkflowStep_AutomatedWorkflow_OPAL() {
		scrollToElement("UserDefinedWorkflow", "OPAL_Month12_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "OPAL_Month12_WorkflowStep");
		threadWait(3000);
		defineLogs("Month - 12 - Unscheduled / Awaiting Results", "Month - 12 - Unscheduled / Awaiting Results",
				"Month - 12 - Unscheduled / Awaiting Results", "Navigate to Month-12 Workflow Step Successfully",
				"Failed to navigate to Month-12 Workflow Step", "UserDefinedWorkflow", "VerifyOPAL_Month12");
		selectActualVisitDate();
		clickonProcess();
	}

	// ----------------Automated Workflow Custom
	// Commercial----------------------------------------

	public static void Complete_Pre_ApplicationWorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		defineLogs("Pre-application - Applicant Information - New", "Pre-application - Applicant Information - New",
				"Pre-application - Applicant Information - New",
				"Enrollment was Created and Navigate to Pre-Application Workflow Step Successfully",
				"Failed to navigate to Pre-Application Workflow Step", "UserDefinedWorkflow",
				"VerifyPre_Application_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "ProcessorTradeAlly");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 3);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "ProcessorEmployee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 3);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
		threadWait(5000);
	}

	public static void Complete_Pre_EngineeringWorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		clickWebelement("UserDefinedWorkflow", "Pre_Engineering_WorkflowStep");
		threadWait(3000);
		defineLogs("Pre-Engineering - Unscheduled / Awaiting Results",
				"Pre-Engineering - Unscheduled / Awaiting Results", "Pre-Engineering - Unscheduled / Awaiting Results",
				"Navigate to Pre-Engineering Workflow Step Successfully",
				"Failed to navigate to Pre-Engineering Workflow Step", "UserDefinedWorkflow",
				"VerifyPre_Engineering_WorkflowStep");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_CMPA_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		clickWebelement("UserDefinedWorkflow", "CMPA_WorkflowStep");
		threadWait(3000);
		defineLogs("CMPA - Unscheduled / Awaiting Results", "CMPA - Unscheduled / Awaiting Results",
				"CMPA - Unscheduled / Awaiting Results", "Navigate to CMPA-Workflow Step Successfully",
				"Failed to navigate to CMPA-Workflow Step", "UserDefinedWorkflow", "VerifyCMPA_WorkflowStep");
		selectActualVisitDate();
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 3);
		Enter(KeyEvent.VK_ENTER);
		threadWait(4000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 3);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Reserved_or_Committed_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		clickWebelement("UserDefinedWorkflow", "Reserved_or_Committed_WorkflowStep");
		threadWait(3000);
		defineLogs("Reserved/Committed - Unscheduled / Awaiting Results",
				"Reserved/Committed - Unscheduled / Awaiting Results",
				"Reserved/Committed - Unscheduled / Awaiting Results",
				"Navigate to Reserved/Committed-Workflow Step Successfully",
				"Failed to navigate to 	Reserved/Committed-Workflow Step", "UserDefinedWorkflow",
				"VerifyReserved_or_Committed_WorkflowStep");
		selectActualVisitDate();
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 3);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 3);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Installation_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		clickWebelement("UserDefinedWorkflow", "Installation_WorkflowStep");
		threadWait(3000);
		defineLogs("Installation - Unscheduled / Awaiting Results", "Installation - Unscheduled / Awaiting Results",
				"Installation - Unscheduled / Awaiting Results", "Navigate to Installation Workflow Step Successfully",
				"Failed to navigate to 	Installation Workflow Step", "UserDefinedWorkflow",
				"VerifyInstallation_WorkflowStep");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Post_Engineering_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		clickWebelement("UserDefinedWorkflow", "Post_Engineering_WorkflowStep");
		threadWait(3000);
		defineLogs("Post-Engineering - Unscheduled / Awaiting Results",
				"Post-Engineering - Unscheduled / Awaiting Results",
				"Post-Engineering - Unscheduled / Awaiting Results",
				"Navigate to Post-Engineering Workflow Step Successfully",
				"Failed to navigate to 	Post-Engineering Workflow Step", "UserDefinedWorkflow",
				"VerifyPost_Engineering_WorkflowStep");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Management_Review_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		clickWebelement("UserDefinedWorkflow", "Management_Review_WorkflowStep");
		threadWait(3000);
		defineLogs("Management Review - Unscheduled / Awaiting Results",
				"Management Review - Unscheduled / Awaiting Results",
				"Management Review - Unscheduled / Awaiting Results",
				"Navigate to Management Review Workflow Step Successfully",
				"Failed to navigate to 	Management Review Workflow Step", "UserDefinedWorkflow",
				"VerifyManagement_Review_WorkflowStep");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Inspection_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		scrollToElement("UserDefinedWorkflow", "Inspection_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "Inspection_WorkflowStep");
		threadWait(3000);
		defineLogs("Inspection - Unscheduled / Awaiting Results", "Inspection - Unscheduled / Awaiting Results",
				"Inspection - Unscheduled / Awaiting Results", "Navigate to Inspection Workflow Step Successfully",
				"Failed to navigate to 	Inspection Workflow Step", "UserDefinedWorkflow",
				"VerifyInspection_WorkflowStep");
		selectActualVisitDate();
		clickWebelement("UserDefinedWorkflow", "EnableMeasure");
		threadWait(2000);
		enterValueByActionClass("UserDefinedWorkflow", "PassedQty", "ESG Values", "User_Defined_Workflow", 13, 3);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("UserDefinedWorkflow", "FailedQty", "ESG Values", "User_Defined_Workflow", 14, 3);
		clickonProcess();
	}

	public static void Complete_QAReview1_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		scrollToElement("UserDefinedWorkflow", "QAReview1_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "QAReview1_WorkflowStep");
		threadWait(3000);
		defineLogs("QA Review - 1 - Unscheduled / Awaiting Results", "QA Review - 1 - Unscheduled / Awaiting Results",
				"QA Review - 1 - Unscheduled / Awaiting Results",
				"Navigate to QA Review - 1 Workflow Step Successfully",
				"Failed to navigate to 	QA Review - 1 Workflow Step", "UserDefinedWorkflow",
				"VerifyQAReview1_WorkflowStep");
		selectActualVisitDate();
		selectReadyForPayment();
		clickonProcess();
	}

	public static void Complete_QAReview2_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		scrollToElement("UserDefinedWorkflow", "QAReview2_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "QAReview2_WorkflowStep");
		threadWait(3000);
		defineLogs("QA Review - 2 - Unscheduled / Awaiting Results", "QA Review - 2 - Unscheduled / Awaiting Results",
				"QA Review - 2 - Unscheduled / Awaiting Results",
				"Navigate to QA Review - 2 Workflow Step Successfully",
				"Failed to navigate to 	QA Review - 2 Workflow Step", "UserDefinedWorkflow",
				"VerifyQAReview2_WorkflowStep");
		selectActualVisitDate();
		selectReadyForPayment();
		clickonProcess();
	}

	public static void Complete_QAReview3_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		scrollToElement("UserDefinedWorkflow", "QAReview3_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "QAReview3_WorkflowStep");
		threadWait(3000);
		defineLogs("QA Review - 3 - Unscheduled / Awaiting Results", "QA Review - 3 - Unscheduled / Awaiting Results",
				"QA Review - 3 - Unscheduled / Awaiting Results",
				"Navigate to QA Review - 3 Workflow Step Successfully",
				"Failed to navigate to 	QA Review - 3 Workflow Step", "UserDefinedWorkflow",
				"VerifyQAReview3_WorkflowStep");
		selectActualVisitDate();
		selectReadyForPayment();
		clickonProcess();
	}

	public static void Complete_InitiatePayment_WorkflowStep_AutomatedWorkflow_Custom_Commercial() {
		scrollToElement("UserDefinedWorkflow", "InitiatePayment_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "InitiatePayment_WorkflowStep");
		threadWait(3000);
		defineLogs("Initiate Payment - Unscheduled / Awaiting Results",
				"Initiate Payment - Unscheduled / Awaiting Results",
				"Initiate Payment - Unscheduled / Awaiting Results",
				"Navigate to Initiate Payment Workflow Step Successfully",
				"Failed to navigate to 	Initiate Payment Workflow Step", "UserDefinedWorkflow",
				"VerifyInitiatePayment_WorkflowStep");
		selectActualVisitDate();
		selectReadyForPayment();
		clickonProcess();
	}

	// ---------------------Automated Workflow Installation and
	// Inspection-------------------------------

	public static void Complete_ApplicationWorkflowStep_AutomatedWorkflow_Installation_and_Inspection() {
		defineLogs("Application - Applicant Information - New", "Application - Applicant Information - New",
				"Application - Applicant Information - New",
				"Enrollment was Created and Navigate to Application Workflow Step Successfully",
				"Failed to navigate to Application Workflow Step", "UserDefinedWorkflow",
				"VerifyApplication_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "ProcessorTradeAlly");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "ProcessorEmployee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
		threadWait(5000);
	}

	public static void Complete_Pre_Inspection_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection() {
		clickWebelement("UserDefinedWorkflow", "Pre_Inspection_WorkflowStep");
		defineLogs("Pre-Inspection - Unscheduled / Awaiting Results", "Pre-Inspection - Unscheduled / Awaiting Results",
				"Pre-Inspection - Unscheduled / Awaiting Results",
				"Navigate to Pre-Inspection Workflow Step Successfully",
				"Failed to navigate to Pre-Inspection Workflow Step", "UserDefinedWorkflow",
				"VerifyPre_Inspection_WorkflowStep");
		selectActualVisitDate();
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(4000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Installation_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection() {
		clickWebelement("UserDefinedWorkflow", "Installation_WorkflowStep");
		threadWait(3000);
		defineLogs("Installation - Unscheduled / Awaiting Results", "Installation - Unscheduled / Awaiting Results",
				"Installation - Unscheduled / Awaiting Results", "Navigate to Installation Workflow Step Successfully",
				"Failed to navigate to 	Installation Workflow Step", "UserDefinedWorkflow",
				"VerifyInstallation_WorkflowStep");
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Complete_Inspection_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection() {
		scrollToElement("UserDefinedWorkflow", "Inspection_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "Inspection_WorkflowStep");
		threadWait(3000);
		defineLogs("Inspection - Unscheduled / Awaiting Results", "Inspection - Unscheduled / Awaiting Results",
				"Inspection - Unscheduled / Awaiting Results", "Navigate to Inspection Workflow Step Successfully",
				"Failed to navigate to 	Inspection Workflow Step", "UserDefinedWorkflow",
				"VerifyInspection_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		selectActualVisitDate();
		clickWebelement("UserDefinedWorkflow", "EnableMeasure");
		threadWait(2000);
		enterValueByActionClass("UserDefinedWorkflow", "PassedQty", "ESG Values", "User_Defined_Workflow", 13, 4);
		Enter(KeyEvent.VK_TAB);
		enterValueByActionClass("UserDefinedWorkflow", "FailedQty", "ESG Values", "User_Defined_Workflow", 14, 4);
		clickonProcess();
	}

	public static void Complete_QAReview_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection() {
		clickWebelement("UserDefinedWorkflow", "QAReview_WorkflowStep");
		threadWait(3000);
		defineLogs("QA Review - Unscheduled / Awaiting Results", "QA Review - Unscheduled / Awaiting Results",
				"QA Review - Unscheduled / Awaiting Results", "Navigate to QA Review Workflow Step Successfully",
				"Failed to navigate to 	QA Review Workflow Step", "UserDefinedWorkflow", "VerifyQAReview_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(6000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		selectActualVisitDate();
		selectReadyForPayment();
		clickonProcess();
	}

	public static void Complete_InitiatePayment_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection() {
		scrollToElement("UserDefinedWorkflow", "InitiatePayment_WorkflowStep");
		clickWebelement("UserDefinedWorkflow", "InitiatePayment_WorkflowStep");
		threadWait(3000);
		defineLogs("Initiate Payment - Unscheduled / Awaiting Results",
				"Initiate Payment - Unscheduled / Awaiting Results",
				"Initiate Payment - Unscheduled / Awaiting Results",
				"Navigate to Initiate Payment Workflow Step Successfully",
				"Failed to navigate to 	Initiate Payment Workflow Step", "UserDefinedWorkflow",
				"VerifyInitiatePayment_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		selectActualVisitDate();
		selectReadyForPayment();
		clickonProcess();
	}

	public static void GenaratePayment_AutomatedWorkflow_Installation_and_Inspection() {
		clickWebelement("UserDefinedWorkflow", "VarifyPaymentRequestDate");
		threadWait(2000);
		defineLogs("Payment Request Summary", "Payment Request Summary", "Payment Request Summary",
				"Payment Request created Successfully", "Failed to create Payment Request", "UserDefinedWorkflow",
				"VerifyPaymentRequest");
		defineLogs("Payment Request Summary", "Payment Request Summary", "Payment Request Summary",
				"Payment Request Payee validated Successfully", "Failed to Validate Payment Request Payee",
				"UserDefinedWorkflow", "PaymentRequestVarifyPayee");
		defineLogs("Payment Request Summary", "Payment Request Summary", "Payment Request Summary",
				"Payment Request Invoice Amount validated Successfully",
				"Failed to validate Payment Request Invoice Amount", "UserDefinedWorkflow",
				"PaymentRequestVarifyInvoiceTotal");
		defineLogs("Payment Request Summary", "Payment Request Summary", "Payment Request Summary",
				"Payment Request Original Amount validated Successfully",
				"Failed to validate Payment Request Original Amount", "UserDefinedWorkflow",
				"PaymentRequestOriginalAMount");
		clickWebelement("UserDefinedWorkflow", "ApprovePaymentRequest");
		threadWait(2000);
		clickWebelement("UserDefinedWorkflow", "closeButton");
		threadWait(2000);
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary",
				"Payment Request Date validated Successfully", "Failed to validate Payment Request Date",
				"UserDefinedWorkflow", "VarifyPaymentRequestDate");
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary",
				"Payment Request Approved Payee validated Successfully",
				"Failed to validate Payment Request Approved Payee", "UserDefinedWorkflow",
				"VarifyPaymentRequestPayee");
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary",
				"Payment Request Approved Amount validated Successfully",
				"Failed to validate Payment Request Approved Amount", "UserDefinedWorkflow",
				"VarifyPaymentRequestAmount");
	}

	// ---------------Automated Interconnect Workflow------------------------------

	public static void Complete_ApplicationWorkflowStep_AutomatedWorkflow_Interconnect_Workflow() {
		defineLogs("Application - Applicant Information - New", "Application - Applicant Information - New",
				"Application - Applicant Information - New",
				"Enrollment was Created and Navigate to Application Workflow Step Successfully",
				"Failed to navigate to Application Workflow Step", "UserDefinedWorkflow",
				"VerifyApplication_WorkflowStep");
		ClickWebelementByActionClass("UserDefinedWorkflow", "ProcessorTradeAlly");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "ProcessorEmployee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
		threadWait(5000);
	}

	public static void Complete_Pre_Inspection_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow() {
		clickWebelement("UserDefinedWorkflow", "Pre_Inspection_WorkflowStep");
		defineLogs("Pre-Inspection - Unscheduled / Awaiting Results", "Pre-Inspection - Unscheduled / Awaiting Results",
				"Pre-Inspection - Unscheduled / Awaiting Results",
				"Navigate to Pre-Inspection Workflow Step Successfully",
				"Failed to navigate to Pre-Inspection Workflow Step", "UserDefinedWorkflow",
				"VerifyPre_Inspection_WorkflowStep");
		selectActualVisitDate();
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(4000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Interconnect_UD_1_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow() {
		clickWebelement("UserDefinedWorkflow", "Interconnect_UD_1_WorkflowStep");
		defineLogs("UD - 1 - Unscheduled / Awaiting Results", "UD - 1 - Unscheduled / Awaiting Results",
				"UD - 1 - Unscheduled / Awaiting Results", "Navigate to UD - 1 Workflow Step Successfully",
				"Failed to navigate to UD - 1 Workflow Step", "UserDefinedWorkflow",
				"VerifyInterconnect_UD_1_WorkflowStep");
		selectActualVisitDate();
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(4000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Interconnect_UD_2_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow() {
		clickWebelement("UserDefinedWorkflow", "Interconnect_UD_2_WorkflowStep");
		defineLogs("UD - 2 - Unscheduled / Awaiting Results", "UD - 2 - Unscheduled / Awaiting Results",
				"UD - 2 - Unscheduled / Awaiting Results", "Navigate to UD - 2 Workflow Step Successfully",
				"Failed to navigate to UD - 2 Workflow Step", "UserDefinedWorkflow",
				"VerifyInterconnect_UD_2_WorkflowStep");
		selectActualVisitDate();
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(4000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Interconnect_UD_3_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow() {
		clickWebelement("UserDefinedWorkflow", "Interconnect_UD_3_WorkflowStep");
		defineLogs("UD - 3 - Unscheduled / Awaiting Results", "UD - 3 - Unscheduled / Awaiting Results",
				"UD - 3 - Unscheduled / Awaiting Results", "Navigate to UD - 3 Workflow Step Successfully",
				"Failed to navigate to UD - 3 Workflow Step", "UserDefinedWorkflow",
				"VerifyInterconnect_UD_3_WorkflowStep");
		selectActualVisitDate();
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(4000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Pre_Engineering_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow() {
		clickWebelement("UserDefinedWorkflow", "Pre_Engineering_WorkflowStep");
		threadWait(3000);
		defineLogs("Pre-Engineering - Unscheduled / Awaiting Results",
				"Pre-Engineering - Unscheduled / Awaiting Results", "Pre-Engineering - Unscheduled / Awaiting Results",
				"Navigate to Pre-Engineering Workflow Step Successfully",
				"Failed to navigate to Pre-Engineering Workflow Step", "UserDefinedWorkflow",
				"VerifyPre_Engineering_WorkflowStep");
		selectActualVisitDate();
		ClickWebelementByActionClass("UserDefinedWorkflow", "AssignTo");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 9, 4);
		Enter(KeyEvent.VK_ENTER);
		threadWait(4000);
		ClickWebelementByActionClass("UserDefinedWorkflow", "Employee");
		enterValueByActionClass("UserDefinedWorkflow", "SearchFromList", "ESG Values", "User_Defined_Workflow", 10, 4);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Installation_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow() {
		clickWebelement("UserDefinedWorkflow", "Installation_WorkflowStep");
		threadWait(3000);
		defineLogs("Installation - Unscheduled / Awaiting Results", "Installation - Unscheduled / Awaiting Results",
				"Installation - Unscheduled / Awaiting Results", "Navigate to Installation Workflow Step Successfully",
				"Failed to navigate to 	Installation Workflow Step", "UserDefinedWorkflow",
				"VerifyInstallation_WorkflowStep");
		selectActualVisitDate();
		clickonProcess();
	}
}
