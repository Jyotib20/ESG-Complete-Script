package com.esg.testclasses;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

import com.esg.utilities.HelperClass;
import com.esg.utilities.ReadExcel;
import com.relevantcodes.extentreports.LogStatus;

public class Create_Program_TestClass  extends HelperClass {

	public static void Delete_Existing_Program() {
		ClickByActionClass("End_To_End_Program_Configuration", "Configuration", "End_To_End_Configuration", "Create_New_Program", 1, 1);
		WaitForElement(30, "End_To_End_Program_Configuration", "Program_Name");
		enterTextboxValue("End_To_End_Program_Configuration", "Program_Name", "End_To_End_Configuration", "Create_New_Program", 2, 1);
		clickWebelement("End_To_End_Program_Configuration", "Submit_Button");
		
		String text = Xpath("End_To_End_Program_Configuration", "ProgramUrl_Link").getText();
		if (text.contentEquals(ReadExcel.readData("End_To_End_Configuration", "Create_New_Program", 2, 1))) {
			clickWebelement("End_To_End_Program_Configuration", "ProgramUrl_Link");
			WaitForElement(30, "End_To_End_Program_Configuration", "Delete_Button");
			clickWebelement("End_To_End_Program_Configuration", "Delete_Button");
			handlePopup();
		} else {

		}
	}
	public static void Navigate_To_Program_Page() {
		ClickByActionClass("End_To_End_Program_Configuration", "Configuration", "End_To_End_Configuration", "Create_New_Program", 1, 1);
	}
	
	public static void New_Program() {
		
		WaitForElement(30, "End_To_End_Program_Configuration", "New_Button");
		clickWebelement("End_To_End_Program_Configuration", "New_Button");
		WaitForElement(30, "End_To_End_Program_Configuration", "Program_Name");
		enterTextboxValue("End_To_End_Program_Configuration", "Program_Name", "End_To_End_Configuration", "Create_New_Program", 2, 1);
		enterTextboxValue("End_To_End_Program_Configuration", "Program_Code", "End_To_End_Configuration", "Create_New_Program", 3, 1);
		scrollToElement("End_To_End_Program_Configuration", "Program_Classification");
		selectDropdown("End_To_End_Program_Configuration", "Program_Classification","", "End_To_End_Configuration", "Create_New_Program", 4, 1);
		clickWebelement("End_To_End_Program_Configuration", "Participation_Tracking");
		clickWebelement("End_To_End_Program_Configuration", "Program_Designation");
		clickWebelement("End_To_End_Program_Configuration", "New_Enrollment_Wizard");
		scrollToElement("End_To_End_Program_Configuration", "Program_Type");
		selectDropdown("End_To_End_Program_Configuration", "Program_Type","", "End_To_End_Configuration", "Create_New_Program", 8, 1);
		scrollToElement("End_To_End_Program_Configuration", "Online_Application_Accept_CheckBox");
		clickWebelement("End_To_End_Program_Configuration", "Online_Application_Accept_CheckBox");
		clickWebelement("End_To_End_Program_Configuration", "Data_Enabled_CheckBox");
		handleMultipleWindow("helper", "SaveButton");
	}
		public static void Qualified_Trade_Ally() {
		scrollToElement("End_To_End_Program_Configuration", "QualifiedTradeAlly");
		clickWebelement("End_To_End_Program_Configuration", "QualifiedTradeAlly");
		WaitForElement(30, "End_To_End_Program_Configuration", "AddTradeAlly_Button");
		clickWebelement("End_To_End_Program_Configuration", "AddTradeAlly_Button");
		WaitForElement(30, "End_To_End_Program_Configuration", "QualifyTradeAlly_DropDown");
		selectDropdown("End_To_End_Program_Configuration", "QualifyTradeAlly_DropDown", "QualifyTradeAlly_Search", "End_To_End_Configuration", "Create_New_Program", 10, 1);	
		clickWebelement("End_To_End_Program_Configuration", "QaulifyTradeAlly_Save_Button");
		HandleErrorCodeOnSave("End_To_End_Program_Configuration", "QaulifyTradeAlly_Save_Button", "");
		
		WaitForElement(30, "End_To_End_Program_Configuration", "AddTradeAlly_Button");
		clickWebelement("End_To_End_Program_Configuration", "AddTradeAlly_Button");
		WaitForElement(30, "End_To_End_Program_Configuration", "QualifyTradeAlly_DropDown");
		selectDropdown("End_To_End_Program_Configuration", "QualifyTradeAlly_DropDown", "QualifyTradeAlly_Search", "End_To_End_Configuration", "Create_New_Program", 11, 1);	
		clickWebelement("End_To_End_Program_Configuration", "QaulifyTradeAlly_Save_Button");
		HandleErrorCodeOnSave("End_To_End_Program_Configuration", "QaulifyTradeAlly_Save_Button", "");
		
		}
		
		public static void WorkFlow_Tab() {
			scrollToElement("End_To_End_Program_Configuration", "WorkflowTab");
			clickWebelement("End_To_End_Program_Configuration", "WorkflowTab");
			WaitForElement(30, "End_To_End_Program_Configuration", "ApplicationLink");
			clickWebelement("End_To_End_Program_Configuration", "ApplicationLink");
			scrollToElement("End_To_End_Program_Configuration", "Processing_Rules_New_Button");
			clickWebelement("End_To_End_Program_Configuration", "Processing_Rules_New_Button");
			selectDropdown("End_To_End_Program_Configuration", "Process_Dropdown", "Process_Search", "End_To_End_Configuration", "Create_New_Program", 14, 1);
			clickWebelement("End_To_End_Program_Configuration", "Assign_Group");
			clickWebelement("End_To_End_Program_Configuration", "Assing_Button");
			scrollToElement("End_To_End_Program_Configuration", "Accepts_Online_Edits_CheckBox");
			clickWebelement("End_To_End_Program_Configuration", "Accepts_Online_Edits_CheckBox");
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			WaitForElement(30, "End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			scrollToElement("End_To_End_Program_Configuration", "Send_Confirmation_email_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Send_Confirmation_email_Check_Box");
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			scrollToElement("End_To_End_Program_Configuration", "Documents_New");
			clickWebelement("End_To_End_Program_Configuration", "Documents_New");
			threadWait(3000);
			//WaitForElement(30, "End_To_End_Program_Configuration", "Document_Type_Dropdown");
			clickWebelement("End_To_End_Program_Configuration", "Document_Type_Dropdown");
			threadWait(2500);
			enterTextboxValue("End_To_End_Program_Configuration", "Document_Type_Search", "End_To_End_Configuration", "Create_New_Program", 15, 1);
			threadWait(1000);
			Enter(KeyEvent.VK_ENTER);
			//selectDropdown("End_To_End_Program_Configuration", "Document_Type_Dropdown", "Document_Type_Search", "End_To_End_Configuration", "Create_New_Program", 15, 1);
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			WaitForElement(30, "End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			
			//Work Assignment Section
			scrollToElement("End_To_End_Program_Configuration", "WorkAssignment_Dropdown");
			selectDropdown("End_To_End_Program_Configuration", "WorkAssignment_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 16, 1);
			clickWebelement("End_To_End_Program_Configuration", "Auto_Assignment_Check_Box");
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			scrollToElement("End_To_End_Program_Configuration", "WorkAssignment_Dropdown");
			clickWebelement("End_To_End_Program_Configuration", "Configure_Button");
			WaitForElement(30, "End_To_End_Program_Configuration", "New_Button");
			clickWebelement("End_To_End_Program_Configuration", "New_Button");
			
			//Application Processor Assignments
			WaitForElement(30, "End_To_End_Program_Configuration", "Assignment_Percent");
			enterTextboxValue("End_To_End_Program_Configuration", "Assignment_Percent", "End_To_End_Configuration", "Create_New_Program", 19, 1);
			selectDropdown("End_To_End_Program_Configuration", "Trade_Ally_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 20, 1);
			selectDropdown("End_To_End_Program_Configuration", "Employee_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 21, 1);
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
		}
		public static void Field_Option() {
			WaitForElement(30, "End_To_End_Program_Configuration", "FieldOption");
			clickWebelement("End_To_End_Program_Configuration", "FieldOption");
			WaitForElement(30, "End_To_End_Program_Configuration", "CustomerSignDate_Enabled_CheckBox");
			clickWebelement("End_To_End_Program_Configuration", "CustomerSignDate_Enabled_CheckBox");
			clickWebelement("End_To_End_Program_Configuration", "CustomerSignDate_Required_CheckBox");
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			
			WebElement Enabled = Xpath("End_To_End_Program_Configuration", "CustomerSignDate_Enabled_CheckBox");
			WebElement Enabled1 = Xpath("End_To_End_Program_Configuration", "CustomerSignDate_Required_CheckBox");
			if (Enabled.isEnabled()) {
				
				test.log(LogStatus.PASS, "Check Box is Checked");
				
			} else {
				test.log(LogStatus.FAIL, "Check Box is not Checked");
			}
			
			if (Enabled1.isEnabled()) {
				
				test.log(LogStatus.PASS, "Check Box is Checked");
				
			} else {
				test.log(LogStatus.FAIL, "Check Box is not Checked");
			}
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
		}
		
		public static void Add_Inspection_WorkFlow() {
			
			//Inspection Workflow Step
			WaitForElement(30, "End_To_End_Program_Configuration", "AddWorkFlow_Button");
			clickWebelement("End_To_End_Program_Configuration", "AddWorkFlow_Button");
			WaitForElement(30, "End_To_End_Program_Configuration", "AddWorkFlow_Type");
			selectDropdown("End_To_End_Program_Configuration", "AddWorkFlow_Type", "", "End_To_End_Configuration", "Create_New_Program", 24, 1);
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			WaitForElement(30, "End_To_End_Program_Configuration", "Correction_Inspcetion_CheckBox");
			clickWebelement("End_To_End_Program_Configuration", "Correction_Inspcetion_CheckBox");
			scrollToElement("End_To_End_Program_Configuration", "WorkAssignment_Dropdown");
			selectDropdown("End_To_End_Program_Configuration", "WorkAssignment_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 16, 1);
			clickWebelement("End_To_End_Program_Configuration", "Auto_Assignment_Check_Box");
			
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			scrollToElement("End_To_End_Program_Configuration", "WorkAssignment_Dropdown");
			clickWebelement("End_To_End_Program_Configuration", "Configure_Button");
			WaitForElement(30, "End_To_End_Program_Configuration", "New_Button");
			clickWebelement("End_To_End_Program_Configuration", "New_Button");
			
			//Application Processor Assignments
			WaitForElement(30, "End_To_End_Program_Configuration", "Assignment_Percent");
			enterTextboxValue("End_To_End_Program_Configuration", "Assignment_Percent", "End_To_End_Configuration", "Create_New_Program", 19, 1);
			selectDropdown("End_To_End_Program_Configuration", "Trade_Ally_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 25, 1);
			selectDropdown("End_To_End_Program_Configuration", "Employee_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 26, 1);
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
		}
		
		public static void QA_Review_WorkFlow() {
			//QA Review Step
			WaitForElement(30, "End_To_End_Program_Configuration", "AddWorkFlow_Button");
			clickWebelement("End_To_End_Program_Configuration", "AddWorkFlow_Button");
			WaitForElement(30, "End_To_End_Program_Configuration", "AddWorkFlow_Type");
			selectDropdown("End_To_End_Program_Configuration", "AddWorkFlow_Type", "", "End_To_End_Configuration", "Create_New_Program", 28, 1);
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			WaitForElement(30, "End_To_End_Program_Configuration", "QA_Correction_CheckBox");
			clickWebelement("End_To_End_Program_Configuration", "QA_Correction_CheckBox");
			scrollToElement("End_To_End_Program_Configuration", "WorkAssignment_Dropdown");
			selectDropdown("End_To_End_Program_Configuration", "WorkAssignment_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 16, 1);
			clickWebelement("End_To_End_Program_Configuration", "Auto_Assignment_Check_Box");
			
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			scrollToElement("End_To_End_Program_Configuration", "WorkAssignment_Dropdown");
			clickWebelement("End_To_End_Program_Configuration", "Configure_Button");
			WaitForElement(30, "End_To_End_Program_Configuration", "New_Button");
			clickWebelement("End_To_End_Program_Configuration", "New_Button");
			
			//Application Processor Assignments
			WaitForElement(30, "End_To_End_Program_Configuration", "Assignment_Percent");
			enterTextboxValue("End_To_End_Program_Configuration", "Assignment_Percent", "End_To_End_Configuration", "Create_New_Program", 19, 1);
			selectDropdown("End_To_End_Program_Configuration", "Trade_Ally_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 29, 1);
			selectDropdown("End_To_End_Program_Configuration", "Employee_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 30, 1);
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
		}
		public static void Initiate_Payment_WorkFlow() {
			//Initiate WorkFlow Step
			WaitForElement(30, "End_To_End_Program_Configuration", "AddWorkFlow_Button");
			clickWebelement("End_To_End_Program_Configuration", "AddWorkFlow_Button");
			WaitForElement(30, "End_To_End_Program_Configuration", "AddWorkFlow_Type");
			selectDropdown("End_To_End_Program_Configuration", "AddWorkFlow_Type", "", "End_To_End_Configuration", "Create_New_Program", 32, 1);
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			scrollToElement("End_To_End_Program_Configuration", "WorkAssignment_Dropdown");
			selectDropdown("End_To_End_Program_Configuration", "WorkAssignment_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 16, 1);
			clickWebelement("End_To_End_Program_Configuration", "Auto_Assignment_Check_Box");
			
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			scrollToElement("End_To_End_Program_Configuration", "WorkAssignment_Dropdown");
			clickWebelement("End_To_End_Program_Configuration", "Configure_Button");
			WaitForElement(30, "End_To_End_Program_Configuration", "New_Button");
			clickWebelement("End_To_End_Program_Configuration", "New_Button");
			
			//Application Processor Assignments
			WaitForElement(30, "End_To_End_Program_Configuration", "Assignment_Percent");
			enterTextboxValue("End_To_End_Program_Configuration", "Assignment_Percent", "End_To_End_Configuration", "Create_New_Program", 19, 1);
			selectDropdown("End_To_End_Program_Configuration", "Trade_Ally_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 33, 1);
			selectDropdown("End_To_End_Program_Configuration", "Employee_Dropdown", "", "End_To_End_Configuration", "Create_New_Program", 34, 1);
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			clickWebelement("End_To_End_Program_Configuration", "CloseButton");
			
		}
		public static void Eligibility_Tab() {
			scrollToElement("End_To_End_Program_Configuration", "Eligibility_Tab");
			clickWebelement("End_To_End_Program_Configuration", "Eligibility_Tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Account_Classification_Edit");
			clickWebelement("End_To_End_Program_Configuration", "Account_Classification_Edit");
			WaitForElement(30, "End_To_End_Program_Configuration", "Account_Classification_Residential_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Account_Classification_Residential_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Ok_Button");
			
			WaitForElement(30, "End_To_End_Program_Configuration", "Account_Status_Edit");
			clickWebelement("End_To_End_Program_Configuration", "Account_Status_Edit");
			WaitForElement(30, "End_To_End_Program_Configuration", "Account_Status_Active_CheckBox");
			clickWebelement("End_To_End_Program_Configuration", "Account_Status_Active_CheckBox");
			WaitForElement(30, "End_To_End_Program_Configuration", "Ok_Button");
			clickWebelement("End_To_End_Program_Configuration", "Ok_Button");
			
			WaitForElement(30, "End_To_End_Program_Configuration", "Building_Type_Edit");
			clickWebelement("End_To_End_Program_Configuration", "Building_Type_Edit");
			WaitForElement(30, "End_To_End_Program_Configuration", "Building_Type_Residential");
			clickWebelement("End_To_End_Program_Configuration", "Building_Type_Residential");
			clickWebelement("End_To_End_Program_Configuration", "Ok_Button");	
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
		}
		public static void Online_Application() {
			
			scrollToElement("End_To_End_Program_Configuration", "Online_Application_Tab");
			clickWebelement("End_To_End_Program_Configuration", "Online_Application_Tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Account_Holder_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Account_Holder_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Contractor_CheckBox");
			scrollToElement("End_To_End_Program_Configuration", "Validation_Zipcode_CheckBox");
			clickWebelement("End_To_End_Program_Configuration", "Validation_Zipcode_CheckBox");
			
			
			//Customer Information
			scrollToElement("End_To_End_Program_Configuration", "Customer_Information_tab");
			clickWebelement("End_To_End_Program_Configuration", "Customer_Information_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "First_Name_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "First_Name_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Last_Name_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Phone_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Email_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Installation_Address_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Mailing_Address_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Facility_Information_Check_Box");
			
			//Installer Information
			scrollToElement("End_To_End_Program_Configuration", "Installer_Information_Tab");
			clickWebelement("End_To_End_Program_Configuration", "Installer_Information_Tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Collect_Trade_Ally_Check_Box");
			clickWebelement("End_To_End_Program_Configuration", "Existing_Trade_Ally");
			clickWebelement("End_To_End_Program_Configuration", "Qualified_For_The_Program");
			
			//Payee Tab
			scrollToElement("End_To_End_Program_Configuration", "Payee_tab");
			clickWebelement("End_To_End_Program_Configuration", "Payee_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Payee_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Payee_Step_Is_Enabled");
			
			//Equipment_tab
			scrollToElement("End_To_End_Program_Configuration", "Equipment_tab");
			clickWebelement("End_To_End_Program_Configuration", "Equipment_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Equipment_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Equipment_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Show_Measure_Incentive");
			
			//Payment tab
			scrollToElement("End_To_End_Program_Configuration", "Payment_tab");
			clickWebelement("End_To_End_Program_Configuration", "Payment_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Payment_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Payment_Step_Is_Enabled");
			
			//Incentive  Summary Tab
			scrollToElement("End_To_End_Program_Configuration", "Incentive_Summary_tab");
			clickWebelement("End_To_End_Program_Configuration", "Incentive_Summary_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Incentive_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Incentive_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Display_Equipment_Summary");
			clickWebelement("End_To_End_Program_Configuration", "Display_Incentive_Amount");
			
			//Survey Tab
			scrollToElement("End_To_End_Program_Configuration", "Survey_tab");
			clickWebelement("End_To_End_Program_Configuration", "Survey_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Survey_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Survey_Step_Is_Enabled");
			
			//Documents Tab
			scrollToElement("End_To_End_Program_Configuration", "Documents_tab");
			clickWebelement("End_To_End_Program_Configuration", "Documents_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Documents_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Documents_Step_Is_Enabled");
			
			//Terms and Conditions
			scrollToElement("End_To_End_Program_Configuration", "Terms_Condition_tab");
			clickWebelement("End_To_End_Program_Configuration", "Terms_Condition_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Terms_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Terms_Step_Is_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Require_Acknowledgement");
			
			//Confirmation tab
			scrollToElement("End_To_End_Program_Configuration", "Confiramtion_tab");
			clickWebelement("End_To_End_Program_Configuration", "Confiramtion_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Send_Email_Confirmation_Online_Application");
			clickWebelement("End_To_End_Program_Configuration", "Send_Email_Confirmation_Online_Application");
			
			//Insufficient Funds Tab
			scrollToElement("End_To_End_Program_Configuration", "Insufficient_Funfs_tab");
			clickWebelement("End_To_End_Program_Configuration", "Insufficient_Funfs_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Enable_Funding_Check");
			clickWebelement("End_To_End_Program_Configuration", "Enable_Funding_Check");

			//Footer Tab
			scrollToElement("End_To_End_Program_Configuration", "Footer_tab");
			clickWebelement("End_To_End_Program_Configuration", "Footer_tab");
			WaitForElement(30, "End_To_End_Program_Configuration", "Footer_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Footer_Enabled");
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
			
			//Existing Enrollment
			scrollToElement("End_To_End_Program_Configuration", "Existing_Enrollment");
			clickWebelement("End_To_End_Program_Configuration", "Existing_Enrollment");
			WaitForElement(30, "End_To_End_Program_Configuration", "Consolidated_Status_Check_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Consolidated_Status_Check_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Program_Status_Check_Enabled");
			
			//Edit Application
			scrollToElement("End_To_End_Program_Configuration", "Edit_Application");
			clickWebelement("End_To_End_Program_Configuration", "Edit_Application");
			WaitForElement(30, "End_To_End_Program_Configuration", "Edit_Application_Enabled");
			clickWebelement("End_To_End_Program_Configuration", "Edit_Application_Enabled");
			HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");


		}
	}