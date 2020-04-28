package com.esg.testclasses;

import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;

public class End_To_End_ConfigurationTestClass extends HelperClass {

public static void Login() {
		
		login("helper", "BaseURL", 2, 0, 2, 1);
	}

public static void Create_New_Measure() {
	
	linkText("Configuration").click();
	linkText("Measures").click();
	clickWebelement("End_To_End_Configuration", "New_Button");
	enterTextboxValue("End_To_End_Configuration", "Measure_Name", "End_To_End_Configuration_Data", "Create Measure", 1, 1);
	enterTextboxValue("End_To_End_Configuration", "Measure_Code", "End_To_End_Configuration_Data", "Create Measure", 2, 1);
	enterTextboxValue("End_To_End_Configuration", "Friendly_Application_Measure_Name", "End_To_End_Configuration_Data", "Create Measure", 3, 1);
	enterTextboxValue("End_To_End_Configuration", "Friendly_Application_Measure_Description", "End_To_End_Configuration_Data", "Create Measure", 4, 1);
	
	selectDropdown("End_To_End_Configuration", "Measure_Unit","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 5, 1);
	selectDropdown("End_To_End_Configuration", "Measure_Class","Measure_Class", "End_To_End_Configuration_Data", "Create Measure", 6, 1);
	selectDropdown("End_To_End_Configuration", "Measure_Ownership","Measure_Ownership", "End_To_End_Configuration_Data", "Create Measure", 7, 1);
	clickonSave();
}
public static void Create_New_Measure_Property() {
	
	clickWebelement("End_To_End_Configuration", "Measure_Properties_Tab");
	//Text Box
	clickWebelement("End_To_End_Configuration", "Create_New_Property");
	clickWebelement("End_To_End_Configuration", "Enter_Property_Name");
	enterTextboxValue("End_To_End_Configuration", "Enter_Property_Name", "End_To_End_Configuration_Data", "Create Measure", 10, 1);
	threadWait(2000);
	Enter(KeyEvent.VK_ENTER);
	
	selectDropdown("End_To_End_Configuration", "Select_Control_Type","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 11, 1);
	selectDropdown("End_To_End_Configuration", "Required_Option","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 12, 1);
	clickonSave();
	clickonclose();
	
	//Drop Down
	clickWebelement("End_To_End_Configuration", "Create_New_Property");
	clickWebelement("End_To_End_Configuration", "Enter_Property_Name");
	enterTextboxValue("End_To_End_Configuration", "Enter_Property_Name", "End_To_End_Configuration_Data", "Create Measure", 15, 1);
	threadWait(2000);
	Enter(KeyEvent.VK_ENTER);
	
	selectDropdown("End_To_End_Configuration", "Select_Control_Type","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 16, 1);
	clickWebelement("End_To_End_Configuration", "Required_Values");
	enterTextboxValue("End_To_End_Configuration", "Required_Values", "End_To_End_Configuration_Data", "Create Measure", 17, 1);
	selectDropdown("End_To_End_Configuration", "Required_Option","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 18, 1);
	clickonSave();
	clickonclose();
	
	//Date
	clickWebelement("End_To_End_Configuration", "Create_New_Property");
	clickWebelement("End_To_End_Configuration", "Enter_Property_Name");
	enterTextboxValue("End_To_End_Configuration", "Enter_Property_Name", "End_To_End_Configuration_Data", "Create Measure", 21, 1);
	threadWait(2000);
	Enter(KeyEvent.VK_ENTER);
	
	selectDropdown("End_To_End_Configuration", "Select_Control_Type","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 22, 1);
	selectDropdown("End_To_End_Configuration", "Required_Option","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 23, 1);
	clickonSave();
	clickonclose();
	
	//Checkbox
	clickWebelement("End_To_End_Configuration", "Create_New_Property");
	clickWebelement("End_To_End_Configuration", "Enter_Property_Name");
	enterTextboxValue("End_To_End_Configuration", "Enter_Property_Name", "End_To_End_Configuration_Data", "Create Measure", 26, 1);
	threadWait(2000);
	Enter(KeyEvent.VK_ENTER);
	
	selectDropdown("End_To_End_Configuration", "Select_Control_Type","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 27, 1);
	selectDropdown("End_To_End_Configuration", "Required_Option","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 28, 1);
	clickonSave();
	clickonclose();
	
	//Checkbox Group
	clickWebelement("End_To_End_Configuration", "Create_New_Property");
	clickWebelement("End_To_End_Configuration", "Enter_Property_Name");
	
	enterTextboxValue("End_To_End_Configuration", "Enter_Property_Name", "End_To_End_Configuration_Data", "Create Measure", 31, 1);
	threadWait(2000);
	Enter(KeyEvent.VK_ENTER);
	
	selectDropdown("End_To_End_Configuration", "Select_Control_Type","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 32, 1);
	clickWebelement("End_To_End_Configuration", "Required_Values");
	enterTextboxValue("End_To_End_Configuration", "Required_Values", "End_To_End_Configuration_Data", "Create Measure", 33, 1);
	clickonSave();
	clickonclose();
	
	//Radio Button Group
	clickWebelement("End_To_End_Configuration", "Create_New_Property");
	
	clickWebelement("End_To_End_Configuration", "Enter_Property_Name");
	enterTextboxValue("End_To_End_Configuration", "Enter_Property_Name", "End_To_End_Configuration_Data", "Create Measure", 36, 1);
	threadWait(2000);
	Enter(KeyEvent.VK_ENTER);
	
	selectDropdown("End_To_End_Configuration", "Select_Control_Type","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 37, 1);
	clickWebelement("End_To_End_Configuration", "Required_Values");
	enterTextboxValue("End_To_End_Configuration", "Required_Values", "End_To_End_Configuration_Data", "Create Measure", 38, 1);
	selectDropdown("End_To_End_Configuration", "Required_Option","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 39, 1);
	clickonSave();
	clickonclose();
	
	//Numeric
	clickWebelement("End_To_End_Configuration", "Create_New_Property");
	clickWebelement("End_To_End_Configuration", "Enter_Property_Name");
	enterTextboxValue("End_To_End_Configuration", "Enter_Property_Name", "End_To_End_Configuration_Data", "Create Measure", 42, 1);
	threadWait(2000);
	Enter(KeyEvent.VK_ENTER);
	
	selectDropdown("End_To_End_Configuration", "Select_Control_Type","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 43, 1);
	selectDropdown("End_To_End_Configuration", "Required_Option","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 44, 1);
	clickonSave();
	clickonclose();
	
	//Formula
	clickWebelement("End_To_End_Configuration", "Create_New_Property");
	clickWebelement("End_To_End_Configuration", "Enter_Property_Name");
	enterTextboxValue("End_To_End_Configuration", "Enter_Property_Name", "End_To_End_Configuration_Data", "Create Measure", 47, 1);
	threadWait(2000);
	Enter(KeyEvent.VK_ENTER);
	
	selectDropdown("End_To_End_Configuration", "Select_Control_Type","Measure_Unit", "End_To_End_Configuration_Data", "Create Measure", 48, 1);
	clickWebelement("End_To_End_Configuration", "Select_Enter_Formula");
	enterTextboxValue("End_To_End_Configuration", "Enter_Formula", "End_To_End_Configuration_Data", "Create Measure", 49, 1);
	clickWebelement("End_To_End_Configuration", "Click_On_OK_Button");
	threadWait(2000);
	clearWebelement("End_To_End_Configuration", "Sort_Order");
	enterTextboxValue("End_To_End_Configuration", "Sort_Order", "End_To_End_Configuration_Data", "Create Measure", 50, 1);
	clickonSave();

}

public static void Create_New_Measure_FailCodes_and_NonFeasibleCodes() {
	clickWebelement("End_To_End_Configuration", "Measure_FailCodes_Tab");
	clickWebelement("End_To_End_Configuration", "AddInspection_FailCode_Button");
	SwitchToFrame("End_To_End_Configuration", "EnterInto_AddInspectionFailCode_Frame");
	clickWebelement("End_To_End_Configuration", "Measure_FailCode_CorrectionRequired");
	clickWebelement("End_To_End_Configuration", "Measure_FailCode_CorrectionNOTRequired");
	
	clickonSave();
	
	clickWebelement("End_To_End_Configuration", "Measure_NonFeasibleCodes_Tab");
}

public static void Create_New_TradeAlly() {
	
	linkText("Configuration").click();
	linkText("Trade Ally").click();
	clickWebelement("End_To_End_Configuration", "New_Button");
	enterTextboxValue("End_To_End_Configuration", "TradeAlly_Name", "End_To_End_Configuration_Data", "Create TradeAlly", 1, 1);
	enterTextboxValue("End_To_End_Configuration", "TradeAlly_Abbreviation", "End_To_End_Configuration_Data", "Create TradeAlly", 2, 1);
	selectDropdown("End_To_End_Configuration", "TradeAlly_Type", "TradeAlly_Type", "End_To_End_Configuration_Data", "Create TradeAlly", 3, 1);
	enterTextboxValue("End_To_End_Configuration", "TradeAlly_Vendor_Number", "End_To_End_Configuration_Data", "Create TradeAlly", 4, 1);
	selectDropdown("End_To_End_Configuration", "TradeAlly_TaxStatus", "TradeAlly_TaxStatus", "End_To_End_Configuration_Data", "Create TradeAlly", 5, 1);
	
	//Add Technologies
	clickWebelement("End_To_End_Configuration", "Add_Technology");
	selectDropdown("End_To_End_Configuration", "Technology_Type","Technology_Type", "End_To_End_Configuration_Data", "Create TradeAlly", 8, 1);
	enterTextboxValue("End_To_End_Configuration", "Technologies_Installed_By", "End_To_End_Configuration_Data", "Create TradeAlly", 9, 1);
	enterTextboxValue("End_To_End_Configuration", "Technologies_Years_Of_Experience", "End_To_End_Configuration_Data", "Create TradeAlly", 10, 1);
	enterTextboxValue("End_To_End_Configuration", "Technologies_Description_of_Training", "End_To_End_Configuration_Data", "Create TradeAlly", 11, 1);
	clickWebelement("End_To_End_Configuration", "Technologies_Ok_Button");
	if (Xpath("End_To_End_Configuration", "Technologies_Ok_Button").isDisplayed()) {
		clickWebelement("End_To_End_Configuration", "Technologies_Ok_Button");
	}
	//Add 1st Insurance Information
	clickWebelement("End_To_End_Configuration", "Add_Insurance");
	selectDropdown("End_To_End_Configuration", "InsuranceInformation_Policy_Type","InsuranceInformation_Policy_Type", "End_To_End_Configuration_Data", "Create TradeAlly", 14, 1);
	enterTextboxValue("End_To_End_Configuration", "InsuranceInformation_Policy_Number", "End_To_End_Configuration_Data", "Create TradeAlly", 15, 1);
	enterTextboxValue("End_To_End_Configuration", "InsuranceInformation_ExpirationDate", "End_To_End_Configuration_Data", "Create TradeAlly", 16, 1);
	clickWebelement("End_To_End_Configuration", "InsuranceInformation_Ok_Button");
	if (Xpath("End_To_End_Configuration", "InsuranceInformation_Ok_Button").isDisplayed()) {
		clickWebelement("End_To_End_Configuration", "InsuranceInformation_Ok_Button");
	}
	
	//Add 2nd Insurance Information
	clickWebelement("End_To_End_Configuration", "Add_Insurance");
	selectDropdown("End_To_End_Configuration", "InsuranceInformation_Policy_Type","InsuranceInformation_Policy_Type", "End_To_End_Configuration_Data", "Create TradeAlly", 17, 1);
	enterTextboxValue("End_To_End_Configuration", "InsuranceInformation_Policy_Number", "End_To_End_Configuration_Data", "Create TradeAlly", 18, 1);
	enterTextboxValue("End_To_End_Configuration", "InsuranceInformation_ExpirationDate", "End_To_End_Configuration_Data", "Create TradeAlly", 19, 1);
	clickWebelement("End_To_End_Configuration", "InsuranceInformation_Ok_Button");
	if (Xpath("End_To_End_Configuration", "InsuranceInformation_Ok_Button").isDisplayed()) {
		clickWebelement("End_To_End_Configuration", "InsuranceInformation_Ok_Button");
	}	
	
	//Add Licenses
	clickWebelement("End_To_End_Configuration", "Add_License");
	selectDropdown("End_To_End_Configuration", "License_Type","License_Type", "End_To_End_Configuration_Data", "Create TradeAlly", 22, 1);
	enterTextboxValue("End_To_End_Configuration", "License_Number", "End_To_End_Configuration_Data", "Create TradeAlly", 23, 1);
	enterTextboxValue("End_To_End_Configuration", "Licensing_Agency", "End_To_End_Configuration_Data", "Create TradeAlly", 24, 1);
	enterTextboxValue("End_To_End_Configuration", "Licenses_ExpirationDate", "End_To_End_Configuration_Data", "Create TradeAlly", 25, 1);
	clickWebelement("End_To_End_Configuration", "Licenses_Ok_Button");
	if (Xpath("End_To_End_Configuration", "Licenses_Ok_Button").isDisplayed()) {
		clickWebelement("End_To_End_Configuration", "Licenses_Ok_Button");
	}
	
	//Add Certifications
	clickWebelement("End_To_End_Configuration", "Add_Certification");
	enterTextboxValue("End_To_End_Configuration", "Certification_Name", "End_To_End_Configuration_Data", "Create TradeAlly", 28, 1);
	enterTextboxValue("End_To_End_Configuration", "Certifying_AgencyName", "End_To_End_Configuration_Data", "Create TradeAlly", 29, 1);
	enterTextboxValue("End_To_End_Configuration", "Certifications_ExpirationDate", "End_To_End_Configuration_Data", "Create TradeAlly", 30, 1);
	clickWebelement("End_To_End_Configuration", "Certifications_Ok_Button");
	if (Xpath("End_To_End_Configuration", "Certifications_Ok_Button").isDisplayed()) {
		clickWebelement("End_To_End_Configuration", "Certifications_Ok_Button");
	}
	
	//Address
	enterTextboxValue("End_To_End_Configuration", "OfficeAddress1", "End_To_End_Configuration_Data", "Create TradeAlly", 33, 1);
	enterTextboxValue("End_To_End_Configuration", "OfficeAddress_City", "End_To_End_Configuration_Data", "Create TradeAlly", 34, 1);
	selectDropdown("End_To_End_Configuration", "OfficeAddress_State","OfficeAddress_State", "End_To_End_Configuration_Data", "Create TradeAlly", 35, 1);
	enterTextboxValue("End_To_End_Configuration", "OfficeAddress_Zip", "End_To_End_Configuration_Data", "Create TradeAlly", 36, 1);
	selectDropdown("End_To_End_Configuration", "MailingAddress","MailingAddress", "End_To_End_Configuration_Data", "Create TradeAlly", 37, 1);
	selectDropdown("End_To_End_Configuration", "BilingAddress","BilingAddress", "End_To_End_Configuration_Data", "Create TradeAlly", 38, 1);
	enterTextboxValue("End_To_End_Configuration", "Billing_Contact", "End_To_End_Configuration_Data", "Create TradeAlly", 39, 1);
	enterTextboxValue("End_To_End_Configuration", "OfficeAddress_Phone", "End_To_End_Configuration_Data", "Create TradeAlly", 40, 1);
	enterTextboxValue("End_To_End_Configuration", "OfficeAddress_Fax", "End_To_End_Configuration_Data", "Create TradeAlly", 41, 1);
	enterTextboxValue("End_To_End_Configuration", "OfficeAddress_Email", "End_To_End_Configuration_Data", "Create TradeAlly", 42, 1);

	clickonSave();
	clickWebelement("End_To_End_Configuration", "Save_TradeAlly_Ok_Button");
	if (Xpath("End_To_End_Configuration", "Save_TradeAlly_Ok_Button").isDisplayed()) {
		clickWebelement("End_To_End_Configuration", "Save_TradeAlly_Ok_Button");
	}
	
}
public static void Create_New_TradeAlly_Add_Contract_Employee_TrainingClasses_And_NavigateToProgram() {
	
	
}


}
