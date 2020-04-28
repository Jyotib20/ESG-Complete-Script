package com.esg.testclasses;

import java.awt.event.KeyEvent;
import java.io.IOException;

import com.esg.utilities.HelperClass;
import com.esg.utilities.WriteExcel;

public class MultiUnitWaiverTestClasses extends HelperClass {
	
	public static boolean CreateObj;
	
	
	public static void Create_MultiUnitWaiver() {
		login("helper","BaseURL", 2, 0, 2, 1);
		implicitlywait(500);
		
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		
		clickWebelement("MultiUnitWaiver", "NewButton");
		//Program Information
		selectDropdown("MultiUnitWaiver", "ProgramInformation_SelectProgram","ProgramInformation_SelectProgram", "ESG Values", "Multi_Unit_Waiver", 4, 1);
		//threadWait(5000);
		WaitForElement(30, "MultiUnitWaiver", "ProgramInformation_SelectTradeAlly");
		selectDropdown("MultiUnitWaiver", "ProgramInformation_SelectTradeAlly","ProgramInformation_SelectTradeAlly", "ESG Values", "Multi_Unit_Waiver", 5, 1);
		threadWait(3000);
		//WaitForElement(30, "MultiUnitWaiver", "ProgramInformation_AdditionalTradeAlly");
		selectDropdown("MultiUnitWaiver", "ProgramInformation_AdditionalTradeAlly","ProgramInformation_AdditionalTradeAlly", "ESG Values", "Multi_Unit_Waiver", 6, 1);
		
		//Property Owner Information
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_FirstName", "ESG Values", "Multi_Unit_Waiver", 9, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_LastName", "ESG Values", "Multi_Unit_Waiver", 10, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_Email", "ESG Values", "Multi_Unit_Waiver", 11, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_PrimaryPhone", "ESG Values", "Multi_Unit_Waiver", 12, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_AltPhone", "ESG Values", "Multi_Unit_Waiver", 13, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_FaxNumber", "ESG Values", "Multi_Unit_Waiver", 14, 1);
		//Mailing Address
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_MailingAddress_Attn", "ESG Values", "Multi_Unit_Waiver", 15, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_MailingAddress_Street", "ESG Values", "Multi_Unit_Waiver", 16, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_MailingAddress_City", "ESG Values", "Multi_Unit_Waiver", 17, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_MailingAddress_State", "ESG Values", "Multi_Unit_Waiver", 18, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerInformation_MailingAddress_Zip", "ESG Values", "Multi_Unit_Waiver", 19, 1);
		
		//Property Owner Approval
		scrollToElement("MultiUnitWaiver", "PropertyOwnerApproval_BuildingAddress_Zip");
		clickWebelement("MultiUnitWaiver", "PropertyOwnerApproval_SignedBy_PropertyOwner");
		clickWebelement("MultiUnitWaiver", "PropertyOwnerApproval_OwnerSignDateImg");
		threadWait(2000);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		selectDropdown("MultiUnitWaiver", "PropertyOwnerApproval_BuildingType","PropertyOwnerApproval_BuildingType", "ESG Values", "Multi_Unit_Waiver", 22, 1);
		clickWebelement("MultiUnitWaiver", "PropertyOwnerApproval_CommonAreaMeasuresIncluded_Checkbox");
		//threadWait(5000);
		
		//Common Area Measure eligibility
		WaitForElement(30, "MultiUnitWaiver", "PropertyOwnerApproval_CommonAreaMeasureEligibility_DeedRestrictedType");
		selectDropdown("MultiUnitWaiver", "PropertyOwnerApproval_CommonAreaMeasureEligibility_DeedRestrictedType","PropertyOwnerApproval_CommonAreaMeasureEligibility_DeedRestrictedType", "ESG Values", "Multi_Unit_Waiver", 25, 1);
		clickWebelement("MultiUnitWaiver", "PropertyOwnerApproval_CommonAreaMeasureEligibility_Benchmarkingparticipation");
		//Building Address
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerApproval_BuildingAddress_Street", "ESG Values", "Multi_Unit_Waiver", 28, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerApproval_BuildingAddress_City", "ESG Values", "Multi_Unit_Waiver", 29, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerApproval_BuildingAddress_State", "ESG Values", "Multi_Unit_Waiver", 30, 1);
		enterTextboxValue("MultiUnitWaiver", "PropertyOwnerApproval_BuildingAddress_Zip", "ESG Values", "Multi_Unit_Waiver", 31, 1);
		
		clickonSave();
		
		String WaiverSummary=Xpath("MultiUnitWaiver", "Saved_Waiver").getText();
		System.out.println("Multi Unit Waiver Summary is"+WaiverSummary);
		String Waiver=WaiverSummary.substring(9,13);
		System.out.println("Waiver # "+Waiver);
		
		try {
			WriteExcel.WriteData("ESG Values", "Multi_Unit_Waiver", Waiver, 34, 1);
		} catch (IOException e) {
			System.out.println("Waiver # not Updated");
		}
		
	}
	
	public static void Add_BuildingAndUnits_MultiUnitWaiver() {
		login("Helper","BaseURL", 2, 0, 2, 1);
		implicitlywait(500);
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		//Access Created Multi Unit Waiver
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 34, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		//threadWait(3000);
		
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		//Add Building List
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_AddButton");
		
		enterTextboxValue("MultiUnitWaiver", "AddBuildingList_BuildingName", "ESG Values", "Multi_Unit_Waiver", 37, 1);
		enterTextboxValue("MultiUnitWaiver", "AddBuildingList_Numberofunits", "ESG Values", "Multi_Unit_Waiver", 38, 1);
		
		clickonSave();
		
		//Add Unit
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_StreetAddress");
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_StreetAddress", "ESG Values", "Multi_Unit_Waiver", 39, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_SearchButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_A_FromSearchResults");
		
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_A_FromSearchResults");
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_B_FromSearchResults");
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_C_FromSearchResults");
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_D_FromSearchResults");
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_E_FromSearchResults");
		
		scrollToElement("MultiUnitWaiver", "BuildingList_AddUnit_AddButton");
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_AddButton");
		
		clickonSave();
		
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_AddButton");
		
		enterTextboxValue("MultiUnitWaiver", "AddBuildingList_BuildingName", "ESG Values", "Multi_Unit_Waiver", 40, 1);
		enterTextboxValue("MultiUnitWaiver", "AddBuildingList_Numberofunits", "ESG Values", "Multi_Unit_Waiver", 41, 1);
		
		clickWebelement("MultiUnitWaiver", "BuildingList_Account_ForAllUnit_SearchButton");
		enterTextboxValue("MultiUnitWaiver", "BuildingList_CustomerSearch_AccountNumber", "ESG Values", "Multi_Unit_Waiver", 44, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_GoButton");
		//WaitForElement(30, "MultiUnitWaiver", "BuildingList_Select1stCustomer");
		threadWait(3000);
		doubleClickWebelement("MultiUnitWaiver", "BuildingList_Select1stCustomer");
		
		clickonSave();
		
		//Add Unit With Account Number 
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street");
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street", "ESG Values", "Multi_Unit_Waiver", 45, 1);
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 46, 1);
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_City", "ESG Values", "Multi_Unit_Waiver", 47, 1);
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_State", "ESG Values", "Multi_Unit_Waiver", 48, 1);
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Zip", "ESG Values", "Multi_Unit_Waiver", 49, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_AddButton");
		
		clickonSave();
		
		//Verify Added Unit - Unit field should be blank where Unit=1
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street");
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street", "ESG Values", "Multi_Unit_Waiver", 45, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_City", "ESG Values", "Multi_Unit_Waiver", 47, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_State", "ESG Values", "Multi_Unit_Waiver", 48, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Zip", "ESG Values", "Multi_Unit_Waiver", 49, 1);
		
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 52, 1);
		
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 53, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_AddButton");
		
		clickonSave();
		//Verify Added Unit - Unit field should be blank where Unit=2
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street");
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street", "ESG Values", "Multi_Unit_Waiver", 45, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_City", "ESG Values", "Multi_Unit_Waiver", 47, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_State", "ESG Values", "Multi_Unit_Waiver", 48, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Zip", "ESG Values", "Multi_Unit_Waiver", 49, 1);
		
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 52, 1);
		
		//Add new Unit and Remove the same From List where Unit=3
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 54, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_AddButton");
				
		clickonSave();
				
		clickWebelement("MultiUnitWaiver", "Select_Unit3_From_UnitList");
	    WaitForElement(30, "MultiUnitWaiver", "RemoveUnitButton");
		clickWebelement("MultiUnitWaiver", "RemoveUnitButton");
		clickWebelement("MultiUnitWaiver", "RemoveUnitConfirmation_OkButton");
		
		//Verify Added Unit - Unit field should be blank where Unit=3
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street");
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street", "ESG Values", "Multi_Unit_Waiver", 45, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_City", "ESG Values", "Multi_Unit_Waiver", 47, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_State", "ESG Values", "Multi_Unit_Waiver", 48, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Zip", "ESG Values", "Multi_Unit_Waiver", 49, 1);
			
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 52, 1);
							
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 54, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_AddButton");
					
		clickonSave();
		
		//Verify Added Unit - Unit field should be blank where Unit=4
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street");
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street", "ESG Values", "Multi_Unit_Waiver", 45, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_City", "ESG Values", "Multi_Unit_Waiver", 47, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_State", "ESG Values", "Multi_Unit_Waiver", 48, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Zip", "ESG Values", "Multi_Unit_Waiver", 49, 1);
			
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 52, 1);
							
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 55, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_AddButton");
					
		clickonSave();
		
		//Verify Added Unit - Unit field should be blank where Unit=5
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street");
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street", "ESG Values", "Multi_Unit_Waiver", 45, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_City", "ESG Values", "Multi_Unit_Waiver", 47, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_State", "ESG Values", "Multi_Unit_Waiver", 48, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Zip", "ESG Values", "Multi_Unit_Waiver", 49, 1);
			
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 52, 1);
							
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 56, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_AddButton");
					
		clickonSave();
		
		//Verify Added Unit - Unit field should be blank where Unit=6
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street");
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street", "ESG Values", "Multi_Unit_Waiver", 45, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_City", "ESG Values", "Multi_Unit_Waiver", 47, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_State", "ESG Values", "Multi_Unit_Waiver", 48, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Zip", "ESG Values", "Multi_Unit_Waiver", 49, 1);
			
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 52, 1);
							
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 57, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_AddButton");
		
		/*//Print Error pop-up Message
		String ErrorMessage=Xpath("MultiUnitWaiver", "Verify_Save_MultiUnitWaiver_BuildingUnit_Error").getText();
		System.out.println("Error message is --->"+ErrorMessage);
		
		//defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Error pop up verified successfully", "Error pop up is not verified", "MultiUnitWaiver", "Verify_Save_MultiUnitWaiver_BuildingUnit_Error");
*/		clickWebelement("MultiUnitWaiver", "Save_MultiUnitWaiver_BuildingUnit_Error_OkButton");
		
		//Verify Added Unit - Unit field should be blank where Unit=Pool
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnitButton");
		WaitForElement(30, "MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street");
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Street", "ESG Values", "Multi_Unit_Waiver", 45, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_City", "ESG Values", "Multi_Unit_Waiver", 47, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_State", "ESG Values", "Multi_Unit_Waiver", 48, 1);
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Zip", "ESG Values", "Multi_Unit_Waiver", 49, 1);
			
		VerifyElementForExistingValueWithAttribute("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 52, 1);
							
		enterTextboxValue("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_Unit", "ESG Values", "Multi_Unit_Waiver", 58, 1);
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_CommonArea_CheckBox");
		clickWebelement("MultiUnitWaiver", "BuildingList_AddUnit_WithAccountNumber_AddButton");
					
		clickonSave();
				
	}
	
	public static void Verify_Added_BuildingAndUnits_MultiUnitWaiver() {
		clickWebelement("MultiUnitWaiver", "Waiver_Tab");
		
		clickonProcess();
		
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		
		clickWebelement("MultiUnitWaiver", "ClickOn_BuildingA_IndividualAccounts");
		
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingA_IndividualAccounts_EnrollmentHyperLink_UnitA", "ESG Values", "Multi_Unit_Waiver", 59, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingA_IndividualAccounts_EnrollmentHyperLink_UnitB", "ESG Values", "Multi_Unit_Waiver", 59, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingA_IndividualAccounts_EnrollmentHyperLink_UnitC", "ESG Values", "Multi_Unit_Waiver", 59, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingA_IndividualAccounts_EnrollmentHyperLink_UnitD", "ESG Values", "Multi_Unit_Waiver", 59, 1);	
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingA_IndividualAccounts_EnrollmentHyperLink_UnitE", "ESG Values", "Multi_Unit_Waiver", 59, 1);
		
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
        clickWebelement("MultiUnitWaiver", "CLickOn_BuildingB_MasterAccount");
		
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingB_IndividualAccounts_EnrollmentHyperLink_Unit1", "ESG Values", "Multi_Unit_Waiver", 59, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingB_IndividualAccounts_EnrollmentHyperLink_Unit2", "ESG Values", "Multi_Unit_Waiver", 59, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingB_IndividualAccounts_EnrollmentHyperLink_Unit3", "ESG Values", "Multi_Unit_Waiver", 59, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingB_IndividualAccounts_EnrollmentHyperLink_Unit4", "ESG Values", "Multi_Unit_Waiver", 59, 1);	
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingB_IndividualAccounts_EnrollmentHyperLink_Unit5", "ESG Values", "Multi_Unit_Waiver", 59, 1);
		
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_BuildingB_IndividualAccounts_EnrollmentHyperLink_Unit_Pool", "ESG Values", "Multi_Unit_Waiver", 60, 1);
		
		//Verify that Unit Pool does not have a Create hyperlink in the Enrollment/Lead # column (Common areas do not qualify until 65% of Units are income qualified. Until then there won't be a link)
	}
	
	public static void Create_Lead_MultiUnitWaiver() {
		login("Helper","BaseURL", 2, 0, 2, 1);
		implicitlywait(500);
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		
		//Access Created Multi Unit Waiver
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(3000);
		//Verify Search Details
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_Program", "ESG Values", "Multi_Unit_Waiver", 64, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_TradeAlly", "ESG Values", "Multi_Unit_Waiver", 65, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_PropertyOwner", "ESG Values", "Multi_Unit_Waiver", 66, 1);	
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_Address", "ESG Values", "Multi_Unit_Waiver", 67, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_Phone", "ESG Values", "Multi_Unit_Waiver", 68, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_ExpirationDate", "ESG Values", "Multi_Unit_Waiver", 69, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_Status", "ESG Values", "Multi_Unit_Waiver", 70, 1);
		
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		
		//Create Lead From Created Building List
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		
		CreateObj = driver.getPageSource().contains("Create");
		if (Xpath("MultiUnitWaiver", "CreateLead_Select1stUnitCreateLink").isDisplayed()!=(CreateObj)) {
			clickWebelement("MultiUnitWaiver", "MultiUnitWaiver_Verify_Lead_Or_Enrollment_Number");
			clickWebelement("MultiUnitWaiver", "Unlink_MultiUnitWaiver_Button");
			handlePopup();
			//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
			linkText("Main Menu").click();
			linkText("Multi Unit Waiver").click();
			enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
			scrollToElement("MultiUnitWaiver", "SearchButton");
			clickWebelement("MultiUnitWaiver", "SearchButton");
			threadWait(3000);
			
			clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
			scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
			clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
			clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
			clickWebelement("MultiUnitWaiver", "CreateLead_Select1stUnitCreateLink");
		} else {
			clickWebelement("MultiUnitWaiver", "CreateLead_Select1stUnitCreateLink");

		}
		
		selectDropdown("MultiUnitWaiver", "Select_Lead_Or_Enrollment","Select_Lead_Or_Enrollment", "ESG Values", "Multi_Unit_Waiver", 73, 1);
		selectDropdown("MultiUnitWaiver", "CreateLead_Select_LeadSource","CreateLead_Select_LeadSource", "ESG Values", "Multi_Unit_Waiver", 74, 1);
		clickWebelement("MultiUnitWaiver", "CreateLead_CreateButton");
		defineLogs("Lead Summary", "Lead Summary", "Lead Summary", "Navigate to Lead - Lead Detail Page successfully", "Failed to navigate to Lead - Lead Detail Page", "MultiUnitWaiver", "CreateLead_Verify_LeadDetailPage");
		
		String Lead=Xpath("MultiUnitWaiver", "CreateLead_LeadDetail_Number").getText();
		System.out.println("Lead # is"+Lead);
		String LeadNumber=Lead.substring(7,11);
		System.out.println("Lead Number "+LeadNumber);
		
		try {
			WriteExcel.WriteData("ESG Values", "Multi_Unit_Waiver", LeadNumber, 75, 1);
		} catch (IOException e) {
			System.out.println("Lead Number not Updated");
		}
		
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_LeadDetail_LeadSourceCategory", "ESG Values", "Multi_Unit_Waiver", 76, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_LeadDetail_LeadSource", "ESG Values", "Multi_Unit_Waiver", 74, 1);
		
		clickWebelement("MultiUnitWaiver", "MUW_Link");
		SwitchToChild();
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MultiUnitWaiver_Verify_Lead_Or_Enrollment_Number", "ESG Values", "Multi_Unit_Waiver", 75, 1);
		
	}
	
	public static void Create_Enrollment_MultiUnitWaiver() {
		login("Helper","BaseURL", 2, 0, 2, 1);
		implicitlywait(500);
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		
		//Access Created Multi Unit Waiver
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(3000);
		//Verify Search Details
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_Program", "ESG Values", "Multi_Unit_Waiver", 64, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_TradeAlly", "ESG Values", "Multi_Unit_Waiver", 65, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_PropertyOwner", "ESG Values", "Multi_Unit_Waiver", 66, 1);	
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_Address", "ESG Values", "Multi_Unit_Waiver", 67, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_Phone", "ESG Values", "Multi_Unit_Waiver", 68, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_ExpirationDate", "ESG Values", "Multi_Unit_Waiver", 69, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "CreateLead_Verify_SearchDetails_Status", "ESG Values", "Multi_Unit_Waiver", 70, 1);
		
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		
		//Create ENrollment From Created Building List
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		
		   CreateObj = driver.getPageSource().contains("Create");
		if (Xpath("MultiUnitWaiver", "CreateLead_Select1stUnitCreateLink").isDisplayed()!=(CreateObj)) {
			clickWebelement("MultiUnitWaiver", "MultiUnitWaiver_Verify_Lead_Or_Enrollment_Number");
			clickWebelement("MultiUnitWaiver", "Unlink_MultiUnitWaiver_Button");
			handlePopup();
			//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
			linkText("Main Menu").click();
			linkText("Multi Unit Waiver").click();
			enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
			scrollToElement("MultiUnitWaiver", "SearchButton");
			clickWebelement("MultiUnitWaiver", "SearchButton");
			threadWait(3500);
			clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
			scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
			clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
			clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
			clickWebelement("MultiUnitWaiver", "CreateLead_Select1stUnitCreateLink");
		} else {
			clickWebelement("MultiUnitWaiver", "CreateLead_Select1stUnitCreateLink");

		}
		
		selectDropdown("MultiUnitWaiver", "Select_Lead_Or_Enrollment","Select_Lead_Or_Enrollment", "ESG Values", "Multi_Unit_Waiver", 77, 1);
		selectDropdown("MultiUnitWaiver", "CreateLead_Select_LeadSource","CreateLead_Select_LeadSource", "ESG Values", "Multi_Unit_Waiver", 74, 1);
		clickWebelement("MultiUnitWaiver", "CreateLead_CreateButton");
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary", "Navigate to Enrollment Profile - Workflow Page successfully", "Failed to navigate to Enrollment Profile - Workflow Page", "MultiUnitWaiver", "Create_Enrollment_Verify_EnrollmentPage");
		
		String EnrollmentNumber=Xpath("MultiUnitWaiver", "Create_Enrollment_Enrollment_Number").getText();
		
		try {
			WriteExcel.WriteData("ESG Values", "Multi_Unit_Waiver", EnrollmentNumber, 78, 1);
		} catch (IOException e) {
			System.out.println("Lead Number not Updated");
		}
		
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		
		clickWebelement("MultiUnitWaiver", "Create_Enrollment_ApplicationWorkflowStep");
		
		scrollToElement("MultiUnitWaiver", "Create_Enrollment_LeadSourceCategory");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Create_Enrollment_LeadSourceCategory", "ESG Values", "Multi_Unit_Waiver", 76, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Create_Enrollment_LeadSource", "ESG Values", "Multi_Unit_Waiver", 74, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Create_Enrollment_PrimaryTradeAlly", "ESG Values", "Multi_Unit_Waiver", 79, 1);
		clickWebelement("MultiUnitWaiver", "Create_Enrollment_ClickOnCLoseButton");
		
		clickWebelement("MultiUnitWaiver", "MUW_Link");
		SwitchToChild();
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MultiUnitWaiver_Verify_Lead_Or_Enrollment_Number", "ESG Values", "Multi_Unit_Waiver", 78, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Create_Enrollment_ApplicantName", "ESG Values", "Multi_Unit_Waiver", 80, 1);
		//VerifyElementForExistingValueWithText("MultiUnitWaiver", "Create_Enrollment_EnrollmentDate", "ESG Values", "Multi_Unit_Waiver", 81, 1);
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Create_Enrollment_ApplicationStatus", "ESG Values", "Multi_Unit_Waiver", 82, 1);
		
	}
	
	public static void Unlink_Link_Lead_MultiUnitWaiver() {
		login("Helper","BaseURL", 2, 0, 2, 1);
		implicitlywait(500);
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		
		//Unlink Lead Multi Unit Waiver
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		//threadWait(3000);
		
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		
		scrollToElement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:Y verified successfully", "Failed to verify Unit:Y", "MultiUnitWaiver", "Verify_Unlink_Link_Lead_MultiUnitWaiver_UnitY");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_Unlink_Link_Lead_MultiUnitWaiver_UnitY_Enrollment_Or_Lead_Number", "ESG Values", "Multi_Unit_Waiver", 86, 1);
		clickWebelement("MultiUnitWaiver", "Displayed_Unlink_Link_Lead_MultiUnitWaiver_UnitY_Enrollment_Or_Lead_Number");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		
		clickWebelement("MultiUnitWaiver", "Unlink_MultiUnitWaiver_Button");
		handlePopup();
		
		defineLogs("Lead Summary", "Lead Summary", "Lead Summary", "Multi Unit Waiver Link verified successfully", "Failed to verify Multi Unit Waiver Link", "MultiUnitWaiver", "Verify_MultiUnitWaiver_Lead_LinkAndUnlink");
		
		//Verify Unlink Lead Multi Unit Waiver
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		//threadWait(3000);
		
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		
		scrollToElement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:Y verified successfully", "Failed to verify Unit:Y", "MultiUnitWaiver", "Verify_Unlink_Link_Lead_MultiUnitWaiver_UnitY");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_Unlink_Link_Lead_MultiUnitWaiver_UnitY_Enrollment_Or_Lead_Create", "ESG Values", "Multi_Unit_Waiver", 59, 1);	
		
		
		//Link Lead with Multi Unit Waiver
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 87, 1);
		linkText("Main Menu").click();
		linkText("Leads").click();
		defineLogs("Lead List", "Lead List", "Lead List", "Navigate to Lead List Page successfully", "Failed to navigate to Lead List Page", "MultiUnitWaiver", "Verify_MultiUnitWaiver_LeadList_Page");
		enterTextboxValue("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_EnterLeadNumber", "ESG Values", "Multi_Unit_Waiver", 86, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(3000);
		clickWebelement("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_EditIcon");
		clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_Button");
		
		SwitchToFrame("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_Frame");
		
		threadWait(3000);
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		Enter(KeyEvent.VK_TAB);
		threadWait(2000);
		Enter(KeyEvent.VK_DELETE);
		enterTextboxValue("MultiUnitWaiver", "Link_Lead_MultiUnitWaiver_BuildingAddress_ZipCode", "ESG Values", "Multi_Unit_Waiver", 89, 1);
		clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_List");
		enterTextboxValue("MultiUnitWaiver", "Link_MultiUnitWaiver_Filter", "ESG Values", "Multi_Unit_Waiver", 90, 1);
		clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_List");
		clickWebelement("MultiUnitWaiver", "ClickOn_Filtered_MultiUnitWaiver_Link");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_InstallationAddressUnit", "ESG Values", "Multi_Unit_Waiver", 91, 1);
		clickWebelement("MultiUnitWaiver", "ClickOn_MultiUnitWaiver_Lead_UnitY_Link");
		threadWait(3000);
		defineLogs("Lead Summary", "Lead Summary", "Lead Summary", "Multi Unit Waiver UnLink verified successfully", "Failed to verify Multi Unit Waiver UnLink", "MultiUnitWaiver", "Verify_MultiUnitWaiver_Lead_LinkAndUnlink");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 90, 1);
		
		clickWebelement("MultiUnitWaiver", "MUW_Link");
		SwitchToChild();
		threadWait(3000);
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		scrollToElement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:Y verified successfully", "Failed to verify Unit:Y", "MultiUnitWaiver", "Verify_Unlink_Link_Lead_MultiUnitWaiver_UnitY");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_Unlink_Link_Lead_MultiUnitWaiver_UnitY_Enrollment_Or_Lead_Number", "ESG Values", "Multi_Unit_Waiver", 86, 1);
	
		driver.switchTo().defaultContent();
	}
	
	public static void Unlink_Link_Enrollment_MultiUnitWaiver() {
		login("Helper","BaseURL", 2, 0, 2, 1);
		implicitlywait(500);
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		
		//Unlink Enrollment Multi Unit Waiver
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(3000);
		
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		
		scrollToElement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:Z verified successfully", "Failed to verify Unit:Z", "MultiUnitWaiver", "Verify_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ_Enrollment_Or_Lead_Number", "ESG Values", "Multi_Unit_Waiver", 94, 1);
		
		CreateObj = driver.getPageSource().contains("Create");
		if (Xpath("MultiUnitWaiver", "Displayed_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ_Enrollment_Or_Lead_Create").isDisplayed()!=(CreateObj)) {
			clickWebelement("MultiUnitWaiver", "Displayed_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ_Enrollment_Or_Lead_Number");
			clickWebelement("MultiUnitWaiver", "Unlink_MultiUnitWaiver_Button");
			handlePopup();
			//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
			linkText("Main Menu").click();
			linkText("Multi Unit Waiver").click();
			enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
			scrollToElement("MultiUnitWaiver", "SearchButton");
			clickWebelement("MultiUnitWaiver", "SearchButton");
			threadWait(3500);
			clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
			scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
			clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
			clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
			
			scrollToElement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
			clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
			defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:Z verified successfully", "Failed to verify Unit:Z", "MultiUnitWaiver", "Verify_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ");
			VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ_Enrollment_Or_Lead_Create", "ESG Values", "Multi_Unit_Waiver", 59, 1);
			
		} else {
			clickWebelement("MultiUnitWaiver", "Displayed_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ_Enrollment_Or_Lead_Create");
			VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 63, 1);
			threadWait(3000);
			clickWebelement("MultiUnitWaiver", "Unlink_MultiUnitWaiver_Button");
			handlePopup();
			
			defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary", "Multi Unit Waiver Link verified successfully", "Failed to verify Multi Unit Waiver Link", "MultiUnitWaiver", "Verify_MultiUnitWaiver_Enrollment_LinkAndUnlink");

		}
		
		/*clickWebelement("MultiUnitWaiver", "Displayed_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ_Enrollment_Or_Lead_Create");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		threadWait(3000);
		clickWebelement("MultiUnitWaiver", "Unlink_MultiUnitWaiver_Button");
		handlePopup();
		
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary", "Multi Unit Waiver Link verified successfully", "Failed to verify Multi Unit Waiver Link", "MultiUnitWaiver", "Verify_MultiUnitWaiver_Enrollment_LinkAndUnlink");
		*/
		//Verify Unlink Enrollment Multi Unit Waiver
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(3000);
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		
		scrollToElement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:Z verified successfully", "Failed to verify Unit:Z", "MultiUnitWaiver", "Verify_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ_Enrollment_Or_Lead_Create", "ESG Values", "Multi_Unit_Waiver", 59, 1);	
		
		//Link Enrollment with Multi Unit Waiver 
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 95, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		defineLogs("Enrollment List", "Enrollment List", "Enrollment List", "Navigate to Enrollment List Page successfully", "Failed to navigate to Enrollment List Page", "MultiUnitWaiver", "Verify_MultiUnitWaiver_EnrollmentList_Page");
		enterTextboxValue("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_EnterEnrollmentNumber", "ESG Values", "Multi_Unit_Waiver", 94, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(3000);
		clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_EnrollmentLink");
		clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_Button");
		
		SwitchToFrame("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_Frame");
		
		enterTextboxValue("MultiUnitWaiver", "Link_MultiUnitWaiver_Filter", "ESG Values", "Multi_Unit_Waiver", 90, 1);
		clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_List");
		clickWebelement("MultiUnitWaiver", "ClickOn_Filtered_MultiUnitWaiver_Link");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Verify_MultiUnitWaiver_InstallationAddressUnit", "ESG Values", "Multi_Unit_Waiver", 96, 1);
		clickWebelement("MultiUnitWaiver", "ClickOn_MultiUnitWaiver_Enrollment_UnitZ_Link");
		threadWait(3000);
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary", "Multi Unit Waiver UnLink verified successfully", "Failed to verify Multi Unit Waiver UnLink", "MultiUnitWaiver", "Verify_MultiUnitWaiver_Enrollment_LinkAndUnlink");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 90, 1);
		
		clickWebelement("MultiUnitWaiver", "MUW_Link");
		SwitchToChild();
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "CreateLead_ClickOn_Building1");
		scrollToElement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_NextPagination_Button");
		defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:Z verified successfully", "Failed to verify Unit:Z", "MultiUnitWaiver", "Verify_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_Unlink_Link_Enrollment_MultiUnitWaiver_UnitZ_Enrollment_Or_Lead_Number", "ESG Values", "Multi_Unit_Waiver", 94, 1);
	
		driver.switchTo().defaultContent();
	}
	
	public static void Add_Unit_And_Link_from_LinkLead_Dialog_MultiUnitWaiver() {
		login("Helper","BaseURL", 2, 0, 2, 1);
		implicitlywait(500);
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		
		//Unlink Lead Multi Unit Waiver
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(3000);
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_Building2");
		
		defineLogswith_Negetive_Scenario("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:X is listed", "Unit:X is not listed", "MultiUnitWaiver", "Verify_AddUnit_And_Link_from_LinkLeadOr_Enrollment_Dialog_UnitData_Table");
		
		//Link Lead with Multi Unit Waiver
				//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 87, 1);
				linkText("Main Menu").click();
				linkText("Leads").click();
				defineLogs("Lead List", "Lead List", "Lead List", "Navigate to Lead List Page successfully", "Failed to navigate to Lead List Page", "MultiUnitWaiver", "Verify_MultiUnitWaiver_LeadList_Page");
				enterTextboxValue("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_EnterLeadNumber", "ESG Values", "Multi_Unit_Waiver", 99, 1);
				scrollToElement("MultiUnitWaiver", "SearchButton");
				clickWebelement("MultiUnitWaiver", "SearchButton");
				threadWait(3000);
				clickWebelement("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_EditIcon");
				clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_Button");
				
				SwitchToFrame("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_Frame");
				
				threadWait(3000);
				Enter(KeyEvent.VK_TAB);
				threadWait(2000);
				Enter(KeyEvent.VK_TAB);
				threadWait(2000);
				Enter(KeyEvent.VK_TAB);
				threadWait(2000);
				Enter(KeyEvent.VK_TAB);
				threadWait(2000);
				Enter(KeyEvent.VK_DELETE);
				enterTextboxValue("MultiUnitWaiver", "Link_Lead_MultiUnitWaiver_BuildingAddress_ZipCode", "ESG Values", "Multi_Unit_Waiver", 89, 1);
				clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_List");
				enterTextboxValue("MultiUnitWaiver", "Link_MultiUnitWaiver_Filter", "ESG Values", "Multi_Unit_Waiver", 90, 1);
				clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_List");
				clickWebelement("MultiUnitWaiver", "ClickOn_Filtered_MultiUnitWaiver_Link");
				threadWait(2000);
				
				driver.switchTo().defaultContent();
				clickWebelement("MultiUnitWaiver", "Link_from_LinkLead_Or_Enrollment_Dialog_AddUnit_Button");
				threadWait(2000);
				
				SwitchToFrame("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_Frame");
				selectDropdown("MultiUnitWaiver", "Link_from_LinkLead_Or_Enrollment_Dialog_AddUnit_SelectBuilding","Link_from_LinkLead_Or_Enrollment_Dialog_AddUnit_SelectBuilding", "ESG Values", "Multi_Unit_Waiver", 102, 1);
				clickWebelement("MultiUnitWaiver", "Link_from_LinkLead_Or_Enrollment_Dialog_AddAndLink_Button");
				threadWait(3000);
				defineLogs("Lead Summary", "Lead Summary", "Lead Summary", "Multi Unit Waiver UnLink verified successfully", "Failed to verify Multi Unit Waiver UnLink", "MultiUnitWaiver", "Verify_MultiUnitWaiver_Lead_LinkAndUnlink");
				VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 90, 1);
				
				clickWebelement("MultiUnitWaiver", "MUW_Link");
				SwitchToChild();
				scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
				clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
				clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_Building2");
				defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:X verified successfully", "Failed to verify Unit:X", "MultiUnitWaiver", "Verify_AddUnit_And_Link_from_LinkLead_Dialog_MultiUnitWaiver_UnitX");
				VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_AddUnit_And_Link_from_LinkLead_Dialog_MultiUnitWaiver_UnitX_Enrollment_Or_Lead_Number", "ESG Values", "Multi_Unit_Waiver", 99, 1);
			
				clickWebelement("MultiUnitWaiver", "Displayed_AddUnit_And_Link_from_LinkLead_Dialog_MultiUnitWaiver_UnitX_Enrollment_Or_Lead_Number");
				SwitchToChild();
				
				clickWebelement("MultiUnitWaiver", "Unlink_MultiUnitWaiver_Button");
				handlePopup();
				
				//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
				linkText("Main Menu").click();
				linkText("Multi Unit Waiver").click();
				enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
				scrollToElement("MultiUnitWaiver", "SearchButton");
				clickWebelement("MultiUnitWaiver", "SearchButton");
				//threadWait(3000);
				
				clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
				scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
				clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
				clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_Building2");
				clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Dialog_MultiUnitWaiver_Select_UnitX_Checkbox");
				clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_MultiUnitWaiver_RemoveUnit_Button");
				clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_MultiUnitWaiver_RemoveUnit_ConfirmOK_Button");
				
				defineLogswith_Negetive_Scenario("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:X is listed", "Unit:X is not listed", "MultiUnitWaiver", "Verify_AddUnit_And_Link_from_LinkLeadOr_Enrollment_Dialog_UnitData_Table");
				
	}
	
	public static void Add_Unit_And_Link_from_LinkEnrollment_Dialog_MultiUnitWaiver() {
		login("Helper","BaseURL", 2, 0, 2, 1);
		implicitlywait(500);
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		defineLogs("Multi Unit Waiver List", "Multi Unit Waiver List", "Multi Unit Waiver List", "Navigate to Multi Unit Waiver Page successfully", "Failed to navigate to Multi Unit Waiver Page", "MultiUnitWaiver", "Verify_MultiUnitWaiverList_Page");
		
		//Unlink Enrollment Multi Unit Waiver
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(5000);
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_Building2");
		
		defineLogswith_Negetive_Scenario("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:W is listed", "Unit:W is not listed", "MultiUnitWaiver", "Verify_AddUnit_And_Link_from_LinkLeadOr_Enrollment_Dialog_UnitData_Table");
		
		//Link Enrollment with Multi Unit Waiver 
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 95, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		defineLogs("Enrollment List", "Enrollment List", "Enrollment List", "Navigate to Enrollment List Page successfully", "Failed to navigate to Enrollment List Page", "MultiUnitWaiver", "Verify_MultiUnitWaiver_EnrollmentList_Page");
		enterTextboxValue("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_EnterEnrollmentNumber", "ESG Values", "Multi_Unit_Waiver", 105, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		threadWait(3000);
		clickWebelement("MultiUnitWaiver", "Unlink_Link_MultiUnitWaiver_EnrollmentLink");
		clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_Button");
		
		SwitchToFrame("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_Frame");
		
		enterTextboxValue("MultiUnitWaiver", "Link_MultiUnitWaiver_Filter", "ESG Values", "Multi_Unit_Waiver", 90, 1);
		clickWebelement("MultiUnitWaiver", "Link_MultiUnitWaiver_List");
		clickWebelement("MultiUnitWaiver", "ClickOn_Filtered_MultiUnitWaiver_Link");
		
		driver.switchTo().defaultContent();
		clickWebelement("MultiUnitWaiver", "Link_from_LinkLead_Or_Enrollment_Dialog_AddUnit_Button");
		threadWait(2000);
		
		SwitchToFrame("MultiUnitWaiver", "Unlink_Link_Lead_MultiUnitWaiver_Frame");
		selectDropdown("MultiUnitWaiver", "Link_from_LinkLead_Or_Enrollment_Dialog_AddUnit_SelectBuilding","Link_from_LinkLead_Or_Enrollment_Dialog_AddUnit_SelectBuilding", "ESG Values", "Multi_Unit_Waiver", 102, 1);
		clickWebelement("MultiUnitWaiver", "Link_from_LinkLead_Or_Enrollment_Dialog_AddAndLink_Button");
		threadWait(3000);
		defineLogs("Enrollment Summary", "Enrollment Summary", "Enrollment Summary", "Multi Unit Waiver UnLink verified successfully", "Failed to verify Multi Unit Waiver UnLink", "MultiUnitWaiver", "Verify_MultiUnitWaiver_Enrollment_LinkAndUnlink");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "MUW_Link", "ESG Values", "Multi_Unit_Waiver", 90, 1);
		
		clickWebelement("MultiUnitWaiver", "MUW_Link");
		SwitchToChild();
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_Building2");
		defineLogs("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:W verified successfully", "Failed to verify Unit:W", "MultiUnitWaiver", "Verify_AddUnit_And_Link_from_LinkEnrollment_Dialog_MultiUnitWaiver_UnitW");
		VerifyElementForExistingValueWithText("MultiUnitWaiver", "Displayed_AddUnit_And_Link_from_LinkEnrollment_Dialog_MultiUnitWaiver_UnitW_Enrollment_Or_Lead_Number", "ESG Values", "Multi_Unit_Waiver", 105, 1);
	    
		clickWebelement("MultiUnitWaiver", "Displayed_AddUnit_And_Link_from_LinkEnrollment_Dialog_MultiUnitWaiver_UnitW_Enrollment_Or_Lead_Number");
		SwitchToChild();
		
		clickWebelement("MultiUnitWaiver", "Unlink_MultiUnitWaiver_Button");
		handlePopup();
		
		//clickWebelement("MultiUnitWaiver", "Main Menu", "ESG Values", "Multi_Unit_Waiver", 1, 1);
		linkText("Main Menu").click();
		linkText("Multi Unit Waiver").click();
		enterTextboxValue("MultiUnitWaiver", "SearchWith_MultiUnitWaiverNumber", "ESG Values", "Multi_Unit_Waiver", 63, 1);
		scrollToElement("MultiUnitWaiver", "SearchButton");
		clickWebelement("MultiUnitWaiver", "SearchButton");
		//threadWait(3000);
		
		clickWebelement("MultiUnitWaiver", "Access_CreatedMultiUnitWaiver");
		scrollToElement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "BuildingList_Tab");
		clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_Building2");
		clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkEnrollment_Dialog_MultiUnitWaiver_Select_UnitW_Checkbox");
		clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_MultiUnitWaiver_RemoveUnit_Button");
		clickWebelement("MultiUnitWaiver", "AddUnit_And_Link_from_LinkLead_Or_Enrollment_Dialog_MultiUnitWaiver_RemoveUnit_ConfirmOK_Button");
		
		defineLogswith_Negetive_Scenario("Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Multi Unit Waiver Summary", "Unit:W is listed", "Unit:W is not listed", "MultiUnitWaiver", "Verify_AddUnit_And_Link_from_LinkLeadOr_Enrollment_Dialog_UnitData_Table");
		
	}
	
}
