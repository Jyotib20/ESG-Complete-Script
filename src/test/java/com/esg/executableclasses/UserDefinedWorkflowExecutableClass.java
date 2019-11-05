package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.UserDefinedWorkflowTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class UserDefinedWorkflowExecutableClass extends UserDefinedWorkflowTestClass {

	@BeforeTest()
	public static void Initialization() {
		initialization();
	}
	//----- Automated Workflow Inspection-----

	
	@Test(priority = 1)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Inspection_Login() {
		login();
	}

	@Test(priority = 2)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Inspection_EnrollmentStep_1() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Inspection_EnrollmentStep_1");
		NavigateToEnrollment(3, 1, 4, 1);
		Complete_ApplicationWorkflowStep_AutomatedWorkflow_Inspection();
	}

	@Test(priority = 3)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Inspection_InspectionStep_1() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Inspection_InspectionStep_1");
		Complete_InspectionWorkflowStep_AutomatedWorkflow_Inspection(13, 1, 14, 1);
		InitiatePaymentWorkflowStep_AutomatedWorkflow_Inspection();
	}

	@Test(priority = 4)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Inspection_EnrollmentStep_2() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Inspection_EnrollmentStep_2");
		NavigateToEnrollment(3, 1, 4, 1);
		Complete_ApplicationWorkflowStep_AutomatedWorkflow_Inspection();
	}

	@Test(priority = 5)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Inspection_InspectionStep_2() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Inspection_InspectionStep_2");
		Complete_InspectionWorkflowStep_AutomatedWorkflow_Inspection(15, 1, 16, 1);
		Complete_CorrectionWorkflowStep_AutomatedWorkflow_Inspection();
		Complete_ReinspectionWorkflowStep_AutomatedWorkflow_Inspection();
		InitiatePaymentWorkflowStep_AutomatedWorkflow_Inspection();
		Close();
	}

	//----- Automated Workflow OPAL -----
	@Test(priority = 6)
	public static void UserDefinedWorkflow_AutomatedWorkflow_OPAL_Login() {
		login();
	}

	@Test(priority = 7)
	public static void UserDefinedWorkflow_AutomatedWorkflow_OPAL_EnrollmentStep_1() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_OPAL_EnrollmentStep_1");
		NavigateToEnrollment(3, 2, 4, 1);
		Complete_ApplicationWorkflowStep_AutomatedWorkflow_OPAL();
	}

	@Test(priority = 8)
	public static void UserDefinedWorkflow_AutomatedWorkflow_OPAL_InspectionStep_1() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_OPAL_InspectionStep_1");
		Complete_InspectionWorkflowStep_AutomatedWorkflow_OPAL();
	}

	@Test(priority = 9)
	public static void UserDefinedWorkflow_AutomatedWorkflow_OPAL_EnrollmentStep_2() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_OPAL_EnrollmentStep_2");
		Complete_Month_1_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_2_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_3_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_4_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_5_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_6_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_7_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_8_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_9_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_10_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_11_WorkflowStep_AutomatedWorkflow_OPAL();
		Complete_Month_12_WorkflowStep_AutomatedWorkflow_OPAL();
		Close();
	}

	//----- Automated WOrkflow Custom Commercial -----

	@Test(priority = 10)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_Login() {
		login();
	}

	@Test(priority = 11)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_EnrollmentStep_1() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_EnrollmentStep_1");
		NavigateToEnrollment(3, 3, 4, 1);
		Complete_Pre_ApplicationWorkflowStep_AutomatedWorkflow_Custom_Commercial();
	}

	@Test(priority = 12)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_Pre_EngineeringStep() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_Pre_EngineeringStep");
		Complete_Pre_EngineeringWorkflowStep_AutomatedWorkflow_Custom_Commercial();
	}

	@Test(priority = 13)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_EnrollmentStep_2() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_EnrollmentStep_2");
		Complete_CMPA_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
		Complete_Reserved_or_Committed_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
		Complete_Installation_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
	}

	@Test(priority = 14)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_Post_EngineeringStep() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_Post_EngineeringStep");
		Complete_Post_Engineering_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
	}

	@Test(priority = 15)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_EnrollmentStep_3() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_EnrollmentStep_3");
		Complete_Management_Review_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
	}

	@Test(priority = 16)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_InspectionStep() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_InspectionStep");
		Complete_Inspection_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
	}

	@Test(priority = 17)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_QualityAssurance() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Custom_Commercial_QualityAssurance");
		Complete_QAReview1_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
		Complete_QAReview2_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
		Complete_QAReview3_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
		Complete_InitiatePayment_WorkflowStep_AutomatedWorkflow_Custom_Commercial();
		Close();
	}

	//-----Automated Workflow Installation and Inspection -----

	@Test(priority = 18)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_Login() {
		login();
	}

	@Test(priority = 19)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_EnrollmentStep_1() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_EnrollmentStep_1");
		NavigateToEnrollment(3, 4, 4, 1);
		Complete_ApplicationWorkflowStep_AutomatedWorkflow_Installation_and_Inspection();
	}

	@Test(priority = 20)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_Pre_InspectionStep() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_Pre_InspectionStep");
		Complete_Pre_Inspection_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection();
	}

	@Test(priority = 21)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_EnrollmentStep_2() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_EnrollmentStep_2");
		Complete_Installation_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection();
	}

	@Test(priority = 22)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_InspectionStep() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_InspectionStep");
		Complete_Inspection_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection();
	}

	@Test(priority = 23)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_QualityAssurance() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Installation_and_Inspection_QualityAssurance");
		Complete_QAReview_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection();
		Complete_InitiatePayment_WorkflowStep_AutomatedWorkflow_Installation_and_Inspection();
		GenaratePayment_AutomatedWorkflow_Installation_and_Inspection();
		Close();
	}

	// -----Automated Interconnect Workflow -----

	@Test(priority = 24)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_Login() {
		login();
	}

	@Test(priority = 25)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_EnrollmentStep_1() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_EnrollmentStep_1");
		NavigateToEnrollment(3, 5, 4, 1);
		Complete_ApplicationWorkflowStep_AutomatedWorkflow_Interconnect_Workflow();
	}

	@Test(priority = 26)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_Pre_InspectionStep() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_Pre_InspectionStep");
		Complete_Pre_Inspection_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow();
	}

	@Test(priority = 27)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_EnrollmentStep_2() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_EnrollmentStep_2");
		Complete_Interconnect_UD_1_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow();
		Complete_Interconnect_UD_2_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow();
		Complete_Interconnect_UD_3_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow();
	}

	@Test(priority = 28)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_Pre_Engineering() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_EnrollmentStep_1");
		Complete_Pre_Engineering_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow();
	}

	@Test(priority = 29)
	public static void UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_EnrollmentStep_3() {
		test = Report.startTest("UserDefinedWorkflow_AutomatedWorkflow_Interconnect_Workflow_EnrollmentStep_1");
		Complete_Installation_WorkflowStep_AutomatedWorkflow_Interconnect_Workflow();
		Close();
	}

	@AfterMethod()
	public static void getStatusWithScreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = GetScreenShot.capture(driver);
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		}
		Report.endTest(test);
	}

	@AfterTest()
	public static void Report() {
		generateReport();
	}
}
