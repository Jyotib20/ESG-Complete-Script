package com.esg.testclasses;

import org.openqa.selenium.Keys;

import com.esg.utilities.HelperClass;

public class PayeeRegressionTestClass extends HelperClass {
	
	public static void payee_Applicant_NoInstall_Standard()
	{
		selectPayeeApplicant();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		enterLogs("Application workflow step was created successfully");
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		verifyPayeeApplicant("validation", "VerifyPayee_AccountAutomated", 1);
	}
	public static void payee_AccountHolder_NoInstall_Standard()
	{
		selectPayeeAccountHolder();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeAccountHolder("validation", "VerifyPayee_AutomatedAccount", 1);
	}
	public static void payee_Installer_NoInstall_Standard()
	{
		selectPayeeInstaller();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeInstaller("validation", "VerifyPayee_AutoM8", 1);
	}
	public static void payee_AlternatePayee_NoInstall_Standard()
	{
		selectPayeeAlternatePayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyAlternatePayee("validation", "VerifyAlternatePayee", 1);
		
	}
	public static void payee_SecondaryTradeAlly_NoInstall_Standard()
	{
		createAndSelectSecondaryTradeAllyAsPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifySecondaryTradeAlly("validation", "VerifyPayee_EEC", 1);
	}
	public static void payee_Applicant_Override_To_Installer_NoInstall_MeasureOverride()
	{
		selectPayeeApplicant();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		applicantPayeeOverride(3, 1);
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeApplicant("validation", "VerifyPayee_AutoM8", 1);
	}
	public static void payee_AccountHolder_Override_To_Installer_NoInstall_MeasureOverride()
	{
		selectPayeeAccountHolder();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		applicantPayeeOverride(3, 1);
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeAccountHolder("validation", "VerifyPayee_AutoM8", 1);
	}
	public static void payee_Installer_Override_To_SecondaryInstaller_NoInstall_MeasureOverride()
	{
		selectPayeeInstaller();
		createSecondaryTradeAllyNotPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		applicantPayeeOverride(1, 1);
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeInstaller("validation", "VerifyPayee_EEC", 1);
	}
	public static void payee_AlternatePayee_Override_To_Installer_NoInstall_MeasureOverride()
	{
		selectPayeeAlternatePayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		applicantPayeeOverride(3, 1);
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyAlternatePayee("validation", "VerifyPayee_AutoM8", 1);
		
	}
	public static void payee_SecondaryTradeAlly_Override_To_PrimaryInstaller_NoInstall_MeasureOverride()
	{
		createAndSelectSecondaryTradeAllyAsPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		applicantPayeeOverride(3, 1);
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifySecondaryTradeAlly("validation", "VerifyPayee_AutoM8", 1);
		
	}
	public static void payee_Applicant_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee()
	{
		selectPayeeApplicant();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyPayee_AccountAutomated");
		reopenApplicationAndChangePayee();
		reopenInitiatePaymentAndChangePayee();
		verifyPayeeApplicant("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_AccountHolder_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee()
	{
		selectPayeeAccountHolder();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyPayee_AutomatedAccount");
		reopenApplicationAndChangePayee();
		reopenInitiatePaymentAndChangePayee();
		verifyPayeeAccountHolder("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_Installer_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee()
	{
		selectPayeeInstaller();
		createSecondaryTradeAllyNotPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyPayee_AutoM8");
		reopenApplicationAndChangePayee();
		reopenInitiatePaymentAndChangePayee();
		verifyPayeeInstaller("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_AlternatePayee_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee()
	{
		selectPayeeAlternatePayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyAlternatePayee");
		reopenApplicationAndChangePayee();
		reopenInitiatePaymentAndChangePayee();
		verifyAlternatePayee("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_SecondaryTradeAlly_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee()
	{
		createAndSelectSecondaryTradeAllyAsPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		//defineLogs("QA Review", "QA Review", "QA Review", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep", "QA Review WorkFlow is successfully Validated - ->");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyPayee_EEC");
		reopenApplicationAndChangePayee();
		reopenInitiatePaymentAndChangePayee();
		verifySecondaryTradeAlly("validation", "VerifyReopenedPayee", 1);
	}
	
	//----------------------------------------Payee-Regression-Install-----------------------------

	public static void payee_Applicant_Install_Standard()
	{
		selectPayeeApplicant();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeApplicant("validation", "VerifyPayee_AccountAutomated", 1);
	}
	public static void payee_AccountHolder_Install_Standard()
	{
		selectPayeeAccountHolder();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeAccountHolder("validation", "VerifyPayee_AutomatedAccount", 1);
	}
	public static void payee_Installer_Install_Standard()
	{
		selectPayeeInstaller();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeInstaller("validation", "VerifyPayee_AutoM8", 1);
	}
	public static void payee_AlternatePayee_Install_Standard()
	{
		selectPayeeAlternatePayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyAlternatePayee("validation", "VerifyAlternatePayee", 1);
	}
	public static void payee_SecondaryTradeAlly_Install_Standard()
	{
		createAndSelectSecondaryTradeAllyAsPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();	
		enterLogs("Initiate Payment workflow step was created successfully");
		verifySecondaryTradeAlly("validation", "VerifyPayee_EEC", 1);
	}
	public static void payee_Applicant_Override_To_Installer_MeasureOverride()
	{
		selectPayeeApplicant();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		processInstallationStepMeasureOverride(3, 1);
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeApplicant("validation", "VerifyPayee_AutoM8", 1);
	}
	public static void payee_AccountHolder_Override_To_Installer_MeasureOverride()
	{
		selectPayeeAccountHolder();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		processInstallationStepMeasureOverride(3, 1);
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Instaiiation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeAccountHolder("validation", "VerifyPayee_AutoM8", 1);
	}
	public static void payee_Installer_Override_To_SecondaryInstaller_MeasureOverride()
	{
		selectPayeeInstaller();
		createSecondaryTradeAllyNotPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		processInstallationStepMeasureOverride(1, 1);
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeInstaller("validation", "VerifyPayee_EEC", 1);
	}
	public static void payee_AlternatePayee_Override_To_Installer_MeasureOverride()
	{
		selectPayeeAlternatePayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		processInstallationStepMeasureOverride(3, 1);
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyAlternatePayee("validation", "VerifyPayee_AutoM8", 1);
		
	}
	public static void payee_SecondaryTradeAlly_Override_To_PrimaryInstaller_MeasureOverride()
	{
		createAndSelectSecondaryTradeAllyAsPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		processInstallationStepMeasureOverride(3, 1);
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifySecondaryTradeAlly("validation", "VerifyPayee_AutoM8", 1);
	}
	public static void payee_Applicant_InstallStep_Override_To_Installer_Open_ReOpenApplicationAndChangePayee()
	{
		selectPayeeApplicant();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		reopenApplicationAndChangePayee();
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeApplicant("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_AccountHolder_InstallStep_Override_To_Installer_Open_ReOpenApplicationAndChangePayee()
	{
		selectPayeeAccountHolder();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		reopenApplicationAndChangePayee();
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeAccountHolder("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_Installer_InstallStep_Override_To_SecondaryInstaller_Open_ReOpenApplicationAndChangePayee()
	{
		selectPayeeInstaller();
		createSecondaryTradeAllyNotPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		reopenApplicationAndChangePayee();
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeInstaller("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_AlternatePayee_InstallStep_Override_To_Installer_Open_ReOpenApplicationAndChangePayee()
	{
		selectPayeeAlternatePayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		reopenApplicationAndChangePayee();
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyAlternatePayee("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_SecondaryTradeAlly_InstallStep_Override_To_PrimaryInstaller_Open_ReOpenApplicationAndChangePayee()
	{
		createAndSelectSecondaryTradeAllyAsPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		reopenApplicationAndChangePayee();
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifySecondaryTradeAlly("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_Applicant_InstallStep_ReopenedPayee_Closed_ReOpenApplicationAndChangePayee()
	{
		selectPayeeApplicant();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyPayee_AccountAutomated");
		reopenApplicationAndChangePayee();
		reopenInstallationAndChangePayee();
		processManagementReview();
		reopenInitiatePaymentAndChangePayee();
		verifyPayeeApplicant("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_AccountHolder_InstallStep_ReopenedPayee_Closed_ReOpenApplicationAndChangePayee()
	{
		selectPayeeAccountHolder();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyPayee_AutomatedAccount");
		reopenApplicationAndChangePayee();
		reopenInstallationAndChangePayee();
		processManagementReview();
		reopenInitiatePaymentAndChangePayee();
		verifyPayeeAccountHolder("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_Installer_InstallStep_ReopenedPayee_Closed_ReOpenApplicationAndChangePayee()
	{
		selectPayeeInstaller();
		createSecondaryTradeAllyNotPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation workflow step is Validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyPayee_AutoM8");
		reopenApplicationAndChangePayee();
		reopenInstallationAndChangePayee();
		processManagementReview();
		reopenInitiatePaymentAndChangePayee();
		verifyPayeeInstaller("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_AlternatePayee_InstallStep_ReopenedPayee_Closed_ReOpenApplicationAndChangePayee()
	{
		selectPayeeAlternatePayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		clickonProcess();
		//defineLogs("Installation", "Installation", "Installation", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep", "Installation Workflow step is validated Successfully - ->");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyAlternatePayee");
		reopenApplicationAndChangePayee();
		reopenInstallationAndChangePayee();
		processManagementReview();
		reopenInitiatePaymentAndChangePayee();
		verifyAlternatePayee("validation", "VerifyReopenedPayee", 1);
	}
	public static void payee_SecondaryTradeAlly_InstallStep_Override_To_PrimaryInstaller_Closed_ReOpenApplicationAndChangePayee()
	{
		createAndSelectSecondaryTradeAllyAsPayee();
		selectMeasures();
		completeMeasure();
		selectApplicantInformation();
		clickonProcess();
		defineLogs("Application", "Application", "Application", "Application Workflow step is validated Successfully", "Failed to create Application workflow step", "payeeregression", "Application_WorkflowStep");
		enterLogs("Application workflow step was created successfully");
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		selectActualReviewDate();
		clickonProcess();
		defineLogs("Installation", "Installation", "Installation", "Installation Workflow step is validated Successfully", "Failed to create Installation workflow step", "payeeregression", "Installation_WorkflowStep");
		enterLogs("Installation workflow step was created successfully");
		clickWebelement("payeeregression", "QA_Review_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		defineLogs("QA Review", "QA Review", "QA Review", "QA Review WorkFlow is successfully Validated", "Failed to Create QA Review workflow step", "payeeregression", "QA_Review_WorkflowStep");
		enterLogs("QA Review workflow step was created successfully");
		defineLogs("Initiate Payment", "Initiate Payment", "Initiate Payment", "Intitiate Payment Workflow step is successfully Validated", "Failed to Create Initiate Payment workflow step", "payeeregression", "InitiatePayment_WorkflowStep");
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		selectActualReviewDate();
		threadWait(2500);
		selectReadyForPayment();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was created successfully");
		verifyPayeeBeforeReopen("validation", "VerifyPayee_EEC");
		reopenApplicationAndChangePayee();
		reopenInstallationAndChangePayee();
		processManagementReview();
		reopenInitiatePaymentAndChangePayee();
		verifySecondaryTradeAlly("validation", "VerifyReopenedPayee", 1);
	}
	//---------------------Sub-Methods-for-Payee-Regression---------------------------------------------------
	
	public static void completeMeasure() 
	{
		clickWebelement("payeeregression", "PayeeTestMeasure");
		enterValueByActionClass("payeeregression", "MeasureQty", "PayeeregressionData", "Payeeregression", 1, 2);
		enterTextboxValue("payeeregression", "MeasureTestQty", "PayeeregressionData", "Payeeregression", 2, 2);
		clickonSave();
		validationWithWebelement("validation", "VerifyMeasureQty","completeMeasure");
	}
	public static void selectPayeeApplicant()
	{
		scrollToElement("payeeregression", "SelectApplicant");
		clickWebelement("payeeregression", "SelectApplicant");
		clickonSave();
	}
	public static void selectPayeeAccountHolder()
	{
		scrollToElement("payeeregression", "SelectAccountHolder");
		clickWebelement("payeeregression", "SelectAccountHolder");
		clickonSave();
	}
	public static void selectPayeeInstaller()
	{
		scrollToElement("payeeregression", "SelectInstaller");
		clickWebelement("payeeregression", "SelectInstaller");
		clickWebelement("payeeregression", "PayeeInstallerName");
		enterTextboxValue("payeeregression","PayeeInstallerName", "PayeeregressionData", "Payeeregression", 3, 2);	
		clickKeyboardValue("payeeregression", "PayeeInstallerName", Keys.ENTER);
		clickonSave();
	}
	public static void selectPayeeAlternatePayee()
	{
		scrollToElement("payeeregression", "SelectAlternate_Payee");
		clickWebelement("payeeregression", "SelectAlternate_Payee");
		enterTextboxValue("payeeregression","EnterAlternate_PayeeName", "PayeeregressionData", "Payeeregression", 4, 2);
		enterTextboxValue("payeeregression","EnterAlternate_PayeePhone", "PayeeregressionData", "Payeeregression", 5, 2);
		enterTextboxValue("payeeregression","EnterAlternate_PayeeStreet", "PayeeregressionData", "Payeeregression", 6, 2);
		enterTextboxValue("payeeregression","EnterAlternate_PayeeCity", "PayeeregressionData", "Payeeregression", 7, 2);
		enterTextboxValue("payeeregression","EnterAlternate_PayeeState", "PayeeregressionData", "Payeeregression", 8, 2);
		enterTextboxValue("payeeregression","EnterAlternate_PayeeZip", "PayeeregressionData", "Payeeregression", 9, 2);
		clickonSave();
	}
	public static void createAndSelectSecondaryTradeAllyAsPayee()
	{
		scrollToElement("payeeregression", "AddButton");
		clickWebelement("payeeregression", "AddButton");
		clickWebelement("payeeregression", "SelectTradeAlly");
		enterTextboxValue("payeeregression","SelectTradeAlly", "PayeeregressionData", "Payeeregression", 1, 1);
		clickKeyboardValue("payeeregression","SelectTradeAlly", Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		clickWebelement("payeeregression", "SelectTradeAllyEmployee");
		enterTextboxValue("payeeregression","SelectTradeAllyEmployee", "PayeeregressionData", "Payeeregression", 2, 1);
		clickKeyboardValue("payeeregression","SelectTradeAllyEmployee", Keys.ENTER);
		clickWebelement("payeeregression", "SaveTradeAlly");
		clickWebelement("payeeregression", "SelectInstaller");
		clickWebelement("payeeregression", "PayeeInstallerName");
		enterTextboxValue("payeeregression","PayeeInstallerName", "PayeeregressionData", "Payeeregression", 10, 2);	
		clickKeyboardValue("payeeregression", "PayeeInstallerName", Keys.ENTER);	
		clickWebelement("payeeregression", "ClickOn_ElementToSaveValue");
		clickonSave();
	}
	public static void createSecondaryTradeAllyNotPayee()
	{
		scrollToElement("payeeregression", "AddButton");
		clickWebelement("payeeregression", "AddButton");
		clickWebelement("payeeregression", "SelectTradeAlly");
		enterTextboxValue("payeeregression","SelectTradeAlly", "PayeeregressionData", "Payeeregression", 1, 1);
		clickKeyboardValue("payeeregression","SelectTradeAlly", Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		clickWebelement("payeeregression", "SelectTradeAllyEmployee");
		enterTextboxValue("payeeregression","SelectTradeAllyEmployee", "PayeeregressionData", "Payeeregression", 2, 1);
		clickKeyboardValue("payeeregression","SelectTradeAllyEmployee", Keys.ENTER);
		clickWebelement("payeeregression", "SaveTradeAlly");
		clickWebelement("payeeregression", "SelectInstaller");
		clickonSave();
	}
	public static void reopenApplicationAndChangePayee()
	{
		clickWebelement("payeeregression", "Application_WorkflowStep");
		scrollToElement("payeeregression", "ReopenApplicationButton");
		clickWebelement("payeeregression", "ReopenApplicationButton");
		handleMultipleWindow("payeeregression", "OkButton");
		scrollToElement("payeeregression", "SelectAlternate_Payee");
		clickWebelement("payeeregression", "SelectAlternate_Payee");
		clearWebelement("payeeregression","EnterAlternate_PayeeName");
		enterTextboxValue("payeeregression","EnterAlternate_PayeeName", "PayeeregressionData", "Payeeregression", 12, 2);
		clearWebelement("payeeregression","EnterAlternate_PayeePhone");
		enterTextboxValue("payeeregression","EnterAlternate_PayeePhone", "PayeeregressionData", "Payeeregression", 5, 2);
		clearWebelement("payeeregression","EnterAlternate_PayeeStreet");
		enterTextboxValue("payeeregression","EnterAlternate_PayeeStreet", "PayeeregressionData", "Payeeregression", 6, 2);
		clearWebelement("payeeregression","EnterAlternate_PayeeCity");
		enterTextboxValue("payeeregression","EnterAlternate_PayeeCity", "PayeeregressionData", "Payeeregression", 7, 2);
		clearWebelement("payeeregression","EnterAlternate_PayeeState");
		enterTextboxValue("payeeregression","EnterAlternate_PayeeState", "PayeeregressionData", "Payeeregression", 8, 2);
		clearWebelement("payeeregression","EnterAlternate_PayeeZip");
		enterTextboxValue("payeeregression","EnterAlternate_PayeeZip", "PayeeregressionData", "Payeeregression", 9, 2);
		clickonSave();
		clickonProcess();
		enterLogs("Application workflow step was Re-opened and Changed Payee");
	}
	public static void reopenInstallationAndChangePayee()
	{
		clickWebelement("payeeregression", "Installation_WorkflowStep");
		scrollToElement("payeeregression", "ReopenApplicationButton");
		clickWebelement("payeeregression", "ReopenApplicationButton");
		handleMultipleWindow("payeeregression", "OkButton");
		clickonSave();
		clickonProcess();
		enterLogs("Installation workflow step was Re-opened Successfully");
		
	}
	public static void reopenInitiatePaymentAndChangePayee()
	{
		clickWebelement("payeeregression", "InitiatePayment_WorkflowStep");
		scrollToElement("payeeregression", "ReopenApplicationButton");
		clickWebelement("payeeregression", "ReopenApplicationButton");
		handleMultipleWindow("payeeregression", "OkButton");
		clickonSave();
		clickonProcess();
		enterLogs("Initiate Payment workflow step was Re-opened Successfully");
	}
	public static void processManagementReview()
	{
		clickWebelement("payeeregression", "ManagementReview_WorkflowStep");
		selectDueDate();
		clickWebelement("payeeregression", "AssignedTo");
		enterTextboxValue("payeeregression", "AssignedToSearch", "PayeeregressionData", "Payeeregression", 7, 1);
		clickKeyboardValue("payeeregression", "AssignedToSearch", Keys.ENTER);
		clickonSave();
		clickonProcess();
		enterLogs("ManagementReview workflow step was created Successfully");
	}
	public static void processInstallationStepMeasureOverride(int selectoverrideRow,int selectoverrideColumn)
	{	
		scrollToElement("payeeregression", "ClickOn_OverrideSub_Section");
		clickWebelement("payeeregression", "ClickOn_OverrideSub_Section");
		scrollToElement("payeeregression", "SelectOverridePayee");
		selectDropdownByVisibleText("payeeregression", "SelectOverridePayee", "PayeeregressionData", "Payeeregression", selectoverrideRow, selectoverrideColumn);
		clickonSave();
		scrollToElement("payeeregression", "ClickOn_WorkflowDetailsSub_Section");
		clickWebelement("payeeregression", "ClickOn_WorkflowDetailsSub_Section");
		clickonProcess();
	}
	public static void applicantPayeeOverride(int selectoverrideRow,int selectoverrideColumn)
	{	
		scrollToElement("payeeregression", "ClickOn_OverrideSub_Section");
		clickWebelement("payeeregression", "ClickOn_OverrideSub_Section");
		scrollToElement("payeeregression", "SelectOverridePayee");
		selectDropdownByVisibleText("payeeregression", "SelectOverridePayee", "PayeeregressionData", "Payeeregression", selectoverrideRow, selectoverrideColumn);
		clickonSave();
		scrollToElement("payeeregression", "ApplicantInformationSub_Section");
		clickWebelement("payeeregression", "ApplicantInformationSub_Section");
		clickonProcess();
	}
	//-----------------------------Validation-Methods-for-Payee-Regression------------------------------------
	
	public static void verifyPayeeApplicant(String FilenameForPayeeCheck,String PayeeCheck,int IndexNo)
	{	
		defineLogs("Payment Request Date", "Payment Request Date", "Payment Request Date", "Payment Request Date is validated", "Payment Request Date is not validated", "validation", "VerifyPayeeDate");
		validationWithWebelement("validation", "VerifyPayeeDate", "verifyPayeeInstaller");
		threadWait(2500);
		defineLogs("Amount", "Amount", "Amount", "Amount is verified", "Amount is not Verified", "validation", "VarifyAmount");
		validationWithWebelement("validation", "VarifyAmount", "verifyPayeeInstaller");
		defineLogs("Payee", "Payee", "Payee", "Payee Name is Verified Successfully", "Payee Name is not Validated", "validation", PayeeCheck);
		clickWebelement("payeeregression", "PaymentRequestDateLink");
		if (driver.getPageSource().contains("Address Sequence Number")) {
			selectDropdownByIndex("payeeregression", "SelectAddressSequence", IndexNo);
		} else {
			System.out.println("Address Sequence field was not displayed");
		}
		while (Xpath("payeeregression", "ApproveButton").isDisplayed()) {
			clickWebelement("payeeregression", "ApproveButton");
			//handlePopup();
			if (driver.getPageSource().contains("Create Credit Memo")) {
				break;
			}else if (driver.getPageSource().contains("Override Posting Date")) {
				defineLogs("Override Posting Date", "Override Posting Date", "Override Posting Date", "Payment Request is Validated successfully", "Payment Request is validation is failed", "validation", "VerifyOverridePostingDate");
				break;
			}else {
				continue;
			} 	
		}
		clickWebelement("payeeregression", "CloseButton");
	}	
		
	public static void verifyPayeeAccountHolder(String FilenameForPayeeCheck,String PayeeCheck,int IndexNo)
	{
		defineLogs("Payment Request Date", "Payment Request Date", "Payment Request Date", "Payment Request Date is validated", "Payment Request Date is not validated", "validation", "VerifyPayeeDate");
		validationWithWebelement("validation", "VerifyPayeeDate", "verifyPayeeInstaller");
		threadWait(2500);
		defineLogs("Amount", "Amount", "Amount", "Amount is verified", "Amount is not Verified", "validation", "VarifyAmount");
		defineLogs("Payee", "Payee", "Payee", "Payee Name is Verified Successfully", "Payee Name is not Validated", "validation", PayeeCheck);
		clickWebelement("payeeregression", "PaymentRequestDateLink");
		if (driver.getPageSource().contains("Address Sequence Number")) {
			selectDropdownByIndex("payeeregression", "SelectAddressSequence", IndexNo);
			} else {
			System.out.println("Address Sequence field was not displayed");
		}
		while (Xpath("payeeregression", "ApproveButton").isDisplayed()) {
			clickWebelement("payeeregression", "ApproveButton");
			//handlePopup();
			if (driver.getPageSource().contains("Create Credit Memo")) {
				break;
			}else if (driver.getPageSource().contains("Override Posting Date")) {
				defineLogs("Override Posting Date", "Override Posting Date", "Override Posting Date", "Payment Request is Validated successfully", "Payment Request is validation is failed", "validation", "VerifyOverridePostingDate");
				break;
			}else {
				continue;
			} 	
		}
		clickWebelement("payeeregression", "CloseButton");
	}	
	public static void verifyPayeeInstaller(String FilenameForPayeeCheck,String PayeeCheck,int IndexNo)
	{
		defineLogs("Payment Request Date", "Payment Request Date", "Payment Request Date", "Payment Request Date is validated", "Payment Request Date is not validated", "validation", "VerifyPayeeDate");
		validationWithWebelement("validation", "VerifyPayeeDate", "verifyPayeeInstaller");
		threadWait(2500);
		defineLogs("Amount", "Amount", "Amount", "Amount is verified", "Amount is not Verified", "validation", "VarifyAmount");
		defineLogs("Payee", "Payee", "Payee", "Payee Name is Verified Successfully", "Payee Name is not Validated", "validation", PayeeCheck);
		clickWebelement("payeeregression", "PaymentRequestDateLink");
		if (driver.getPageSource().contains("Address Sequence Number")) {
			selectDropdownByIndex("payeeregression", "SelectAddressSequence", IndexNo);
		} else {
			System.out.println("Address Sequence field was not displayed");
		}
		while (Xpath("payeeregression", "ApproveButton").isDisplayed()) {
			clickWebelement("payeeregression", "ApproveButton");
		//	handlePopup();
			if (driver.getPageSource().contains("Create Credit Memo")) {
				break;
			}else if (driver.getPageSource().contains("Override Posting Date")) {
				defineLogs("Override Posting Date", "Override Posting Date", "Override Posting Date", "Payment Request is Validated successfully", "Payment Request is validation is failed", "validation", "VerifyOverridePostingDate");
				break;
			}else {
				continue;
			} 	
		}
		clickWebelement("payeeregression", "CloseButton");
	}	
	public static void verifyAlternatePayee(String FilenameForPayeeCheck,String PayeeCheck,int IndexNo)
	{
		defineLogs("Payment Request Date", "Payment Request Date", "Payment Request Date", "Payment Request Date is validated", "Payment Request Date is not validated", "validation", "VerifyPayeeDate");
		validationWithWebelement("validation", "VerifyPayeeDate", "verifyPayeeInstaller");
		threadWait(2500);
		defineLogs("Amount", "Amount", "Amount", "Amount is verified", "Amount is not Verified", "validation", "VarifyAmount");
		defineLogs("Payee", "Payee", "Payee", "Payee Name is Verified Successfully", "Payee Name is not Validated", "validation", PayeeCheck);
		clickWebelement("payeeregression", "PaymentRequestDateLink");
		if (driver.getPageSource().contains("Address Sequence Number")) {
			selectDropdownByIndex("payeeregression", "SelectAddressSequence", IndexNo);
		} else {
			System.out.println("Address Sequence field was not displayed");
		}
		while (Xpath("payeeregression", "ApproveButton").isDisplayed()) {
			clickWebelement("payeeregression", "ApproveButton");
		//	handlePopup();
			if (driver.getPageSource().contains("Create Credit Memo")) {
				break;
			}else if (driver.getPageSource().contains("Override Posting Date")) {
				defineLogs("Override Posting Date", "Override Posting Date", "Override Posting Date", "Payment Request is Validated successfully", "Payment Request is validation is failed", "validation", "VerifyOverridePostingDate");
				break;
			}else {
				continue;
			} 	
		}
		clickWebelement("payeeregression", "CloseButton");
	}	
	public static void verifySecondaryTradeAlly(String FilenameForPayeeCheck,String PayeeCheck,int IndexNo)
	{
		defineLogs("Payment Request Date", "Payment Request Date", "Payment Request Date", "Payment Request Date is validated", "Payment Request Date is not validated", "validation", "VerifyPayeeDate");
		validationWithWebelement("validation", "VerifyPayeeDate", "verifyPayeeInstaller");
		threadWait(2500);
		defineLogs("Amount", "Amount", "Amount", "Amount is verified", "Amount is not Verified", "validation", "VarifyAmount");
		defineLogs("Payee", "Payee", "Payee", "Payee Name is Verified Successfully", "Payee Name is not Validated", "validation", PayeeCheck);
		clickWebelement("payeeregression", "PaymentRequestDateLink");
		if (driver.getPageSource().contains("Address Sequence Number")) {
			selectDropdownByIndex("payeeregression", "SelectAddressSequence", IndexNo);
		} else {
			System.out.println("Address Sequence field was not displayed");
		}
		while (Xpath("payeeregression", "ApproveButton").isDisplayed()) {
			clickWebelement("payeeregression", "ApproveButton");
		//	handlePopup();
			if (driver.getPageSource().contains("Create Credit Memo")) {
				break;
			}else if (driver.getPageSource().contains("Override Posting Date")) {
				defineLogs("Override Posting Date", "Override Posting Date", "Override Posting Date", "Payment Request is Validated successfully", "Payment Request is validation is failed", "validation", "VerifyOverridePostingDate");
				break;
			}else {
				continue;
			} 	
		}
		clickWebelement("payeeregression", "CloseButton");
	}	
	public static void verifyPayeeBeforeReopen(String FilenameForPayeeCheck,String PayeeCheck)
	{
		defineLogs("Payment Request Date", "Payment Request Date", "Payment Request Date", "Payment Request Date is validated", "Payment Request Date is not validated", "validation", "VerifyPayeeDate");
		validationWithWebelement("validation", "VerifyPayeeDate", "verifySecondaryTradeAlly");
		defineLogs("Amount", "Amount", "Amount", "Amount is verified", "Amount is not Verified", "validation", "VarifyAmount");
		validationWithWebelement("validation", "VarifyAmount", "verifySecondaryTradeAlly");
		defineLogs("Payee", "Payee", "Payee", "Payee Name is Verified Successfully", "Payee Name is not Validated", "validation", PayeeCheck);
		clickWebelement("payeeregression", "PaymentRequestDateLink");
		clickWebelement("payeeregression", "DeleteButton");
		handlePopup();
		validationWithWebelement("validation", "VerifyNoRecordsToDisplay", "verifySecondaryTradeAlly");
		clickWebelement("payeeregression", "CloseButton");
		
	}
}
