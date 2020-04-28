package com.esg.testclasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.esg.utilities.HelperClass;
import com.esg.utilities.WriteExcel;
import com.relevantcodes.extentreports.LogStatus;

public class Canvassing_TestClass extends HelperClass{
	
public static void Login() {
		
		login("helper", "BaseURL", 4, 0, 4, 1);
	}

public static void Create_New_Canvassing_List() {
	ClickByActionClass("Canvassing", "MainMenu", "ESG Values", "Canvassing_Data", 1, 1);
	WaitForElement(300, "Canvassing", "NewCanvassingList");
	//explicitWaitForClickable(3000, "Canvassing", "NewCanvassingList");
	clickWebelement("Canvassing", "NewCanvassingList");
	WaitForElement(300, "Canvassing", "CustomerName");
	//explicitWait(3000, "Canvassing", "CustomerName");
	enterTextboxValue("Canvassing", "CustomerName", "ESG Values", "Canvassing_Data", 2, 1);
	
	selectDropdown("Canvassing", "ProgramName","", "ESG Values", "Canvassing_Data", 3, 1);
	selectDropdown("Canvassing", "LeadSource","", "ESG Values", "Canvassing_Data", 4, 1);
	selectDropdown("Canvassing", "TradeAlly","", "ESG Values", "Canvassing_Data", 5, 1);
	selectDropdown("Canvassing", "EmployeeName","", "ESG Values", "Canvassing_Data", 6, 1);
	ActiveDate();
	enterTextboxValue("Canvassing", "ExpirationDate", "ESG Values", "Canvassing_Data", 8, 1);
	selectDropdown("Canvassing", "AccountClass","", "ESG Values", "Canvassing_Data", 9, 1);
	HandleErrorCodeOnSave("helper", "SaveButton", "");
	
	//clickonSave();
	test.log(LogStatus.INFO, "New Cutsomer Canvassing List is Created");

}
public static void Adding_Customers_To_Canvassing_List() throws IOException {
	clickWebelement("Canvassing", "CustomerSearch");
	VerifyElementForExistingValueWithText("Canvassing", "CustomerSearchPageValidation", "ESG Values", "Canvassing_Data", 22, 1);
	enterTextboxValue("Canvassing", "Street", "ESG Values", "Canvassing_Data", 12, 1);
	enterTextboxValue("Canvassing", "StreetNumberFrom", "ESG Values", "Canvassing_Data", 13, 1);
	enterTextboxValue("Canvassing", "ZipCode", "ESG Values", "Canvassing_Data", 16, 1);
	clickWebelement("Canvassing", "SearchButton");
	threadWait(4000);
	clickWebelement("Canvassing", "SelectPremise1");
	
	//Verify the First Row Data
	test.log(LogStatus.INFO, "Validating the First Row Data");
	VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseID1", "ESG Values", "Canvassing_Data", 24, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumber1", "ESG Values", "Canvassing_Data", 25, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetName1", "ESG Values", "Canvassing_Data", 26, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyUnit1", "ESG Values", "Canvassing_Data", 27, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyCity1", "ESG Values", "Canvassing_Data", 28, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCode1", "ESG Values", "Canvassing_Data", 29, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_Code1", "ESG Values", "Canvassing_Data", 30, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Page1", "ESG Values", "Canvassing_Data", 31, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Grid1", "ESG Values", "Canvassing_Data", 32, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyAccount1", "ESG Values", "Canvassing_Data", 34, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatus1", "ESG Values", "Canvassing_Data", 35, 1);
	clickWebelement("Canvassing", "AddSelectButton");	
	//Need to verify that permises is removed from the search list
	clickonclose();
	
	test.log(LogStatus.INFO, "Validating the First Row Data added to the Customer Canvassing List");
	WaitForElement(300, "Canvassing", "VerifyPremiseID1");
	//explicitWait(3000, "Canvassing", "VerifyPremiseID1");
	VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID1", "ESG Values", "Canvassing_Data", 24, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage1", "ESG Values", "Canvassing_Data", 25, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage1", "ESG Values", "Canvassing_Data", 26, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage1", "ESG Values", "Canvassing_Data", 27, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage1", "ESG Values", "Canvassing_Data", 28, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage1", "ESG Values", "Canvassing_Data", 29, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage1", "ESG Values", "Canvassing_Data", 30, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage1", "ESG Values", "Canvassing_Data", 31, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage1", "ESG Values", "Canvassing_Data", 32, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage1", "ESG Values", "Canvassing_Data", 33, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage1", "ESG Values", "Canvassing_Data", 34, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage1", "ESG Values", "Canvassing_Data", 35, 1);
	
	//Verify First Row Data
		test.log(LogStatus.INFO, "Validating the First Row Data from the Canvassing List");
		clickWebelement("Canvassing", "CustomerSearch");
		VerifyElementForExistingValueWithText("Canvassing", "CustomerSearchPageValidation", "ESG Values", "Canvassing_Data", 22, 1);
		enterTextboxValue("Canvassing", "Street", "ESG Values", "Canvassing_Data", 12, 1);
		enterTextboxValue("Canvassing", "StreetNumberFrom", "ESG Values", "Canvassing_Data", 13, 1);
		enterTextboxValue("Canvassing", "ZipCode", "ESG Values", "Canvassing_Data", 16, 1);
		clickWebelement("Canvassing", "SearchButton");
		WaitForElement(300, "Canvassing", "SelectPremise1");
		threadWait(2500);
		clickWebelement("Canvassing", "SelectPremise1");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseID1", "ESG Values", "Canvassing_Data", 54, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumber1", "ESG Values", "Canvassing_Data", 55, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetName1", "ESG Values", "Canvassing_Data", 56, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnit1", "ESG Values", "Canvassing_Data", 57, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCity1", "ESG Values", "Canvassing_Data", 58, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCode1", "ESG Values", "Canvassing_Data", 59, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_Code1", "ESG Values", "Canvassing_Data", 60, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Page1", "ESG Values", "Canvassing_Data", 61, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Grid1", "ESG Values", "Canvassing_Data", 62, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccount1", "ESG Values", "Canvassing_Data", 64, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatus1", "ESG Values", "Canvassing_Data", 65, 1);
		
		test.log(LogStatus.INFO, "Validating the Second Row Data from the Canvassing List");
		clickWebelement("Canvassing", "SelectPremise2");
		
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseID2", "ESG Values", "Canvassing_Data", 69, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumber2", "ESG Values", "Canvassing_Data", 70, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetName2", "ESG Values", "Canvassing_Data", 71, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnit2", "ESG Values", "Canvassing_Data", 72, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCity2", "ESG Values", "Canvassing_Data", 73, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCode2", "ESG Values", "Canvassing_Data", 74, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_Code2", "ESG Values", "Canvassing_Data", 75, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Page2", "ESG Values", "Canvassing_Data", 76, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Grid2", "ESG Values", "Canvassing_Data", 77, 1);
		WaitForElement(300, "Canvassing", "VerifyAccount2");
		threadWait(2500);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccount2", "ESG Values", "Canvassing_Data", 79, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatus2", "ESG Values", "Canvassing_Data", 80, 1);
		
		test.log(LogStatus.INFO, "Validating the Third Row Data from the Canvassing List");
		clickWebelement("Canvassing", "SelectPremise3");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseID3", "ESG Values", "Canvassing_Data", 85, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumber3", "ESG Values", "Canvassing_Data", 86, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetName3", "ESG Values", "Canvassing_Data", 87, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnit3", "ESG Values", "Canvassing_Data", 88, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCity3", "ESG Values", "Canvassing_Data", 89, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCode3", "ESG Values", "Canvassing_Data", 90, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_Code3", "ESG Values", "Canvassing_Data", 91, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Page3", "ESG Values", "Canvassing_Data", 92, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Grid3", "ESG Values", "Canvassing_Data", 93, 1);
		//VerifyElementForExistingValueWithText("Canvassing", "VerifyName1", "ESG Values", "Canvassing_Data", 33, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccount3", "ESG Values", "Canvassing_Data", 95, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatus3", "ESG Values", "Canvassing_Data", 96, 1);
		clickWebelement("Canvassing", "AddSelectButton");	
		//Need to verify that permises is removed from the search list
		clickonclose();
		//Verify the Permises is Added to Customer Canvassing List
		//Verify Second Row Data
		test.log(LogStatus.INFO, "Validating the Second Row Data is added to the Customer Canvassing List");
		WaitForElement(300, "Canvassing", "VerifyPremiseID1");
		//explicitWait(3000, "Canvassing", "VerifyPremiseID1");
		
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID2", "ESG Values", "Canvassing_Data", 54, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage2", "ESG Values", "Canvassing_Data", 55, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage2", "ESG Values", "Canvassing_Data", 56, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage2", "ESG Values", "Canvassing_Data", 57, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage2", "ESG Values", "Canvassing_Data", 58, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage2", "ESG Values", "Canvassing_Data", 59, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage2", "ESG Values", "Canvassing_Data", 60, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage2", "ESG Values", "Canvassing_Data", 61, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage2", "ESG Values", "Canvassing_Data", 62, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage2", "ESG Values", "Canvassing_Data", 67, 1);
		threadWait(2500);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage2", "ESG Values", "Canvassing_Data", 64, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage2", "ESG Values", "Canvassing_Data", 65, 1);
		
		test.log(LogStatus.INFO, "Validating the Third Row Data is added to the Customer Canvassing List");
		WaitForElement(300, "Canvassing", "VerifyPremiseCustomerPageID3");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID3", "ESG Values", "Canvassing_Data", 69, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage3", "ESG Values", "Canvassing_Data", 70, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage3", "ESG Values", "Canvassing_Data", 71, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage3", "ESG Values", "Canvassing_Data", 72, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage3", "ESG Values", "Canvassing_Data", 73, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage3", "ESG Values", "Canvassing_Data", 74, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage3", "ESG Values", "Canvassing_Data", 75, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage3", "ESG Values", "Canvassing_Data", 76, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage3", "ESG Values", "Canvassing_Data", 77, 1);
		//VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage3", "ESG Values", "Canvassing_Data", 82, 1);
		threadWait(2500);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage3", "ESG Values", "Canvassing_Data", 79, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage3", "ESG Values", "Canvassing_Data", 80, 1);
		
		test.log(LogStatus.INFO, "Validating the Fourth Row Data is added to the Customer Canvassing List");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID4", "ESG Values", "Canvassing_Data", 85, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage4", "ESG Values", "Canvassing_Data", 86, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage4", "ESG Values", "Canvassing_Data", 87, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage4", "ESG Values", "Canvassing_Data", 88, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage4", "ESG Values", "Canvassing_Data", 89, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage4", "ESG Values", "Canvassing_Data", 90, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage4", "ESG Values", "Canvassing_Data", 91, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage4", "ESG Values", "Canvassing_Data", 92, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage4", "ESG Values", "Canvassing_Data", 93, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage4", "ESG Values", "Canvassing_Data", 98, 1);
		threadWait(2500);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage4", "ESG Values", "Canvassing_Data", 95, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage4", "ESG Values", "Canvassing_Data", 96, 1);
}
public static void Remove_Customers_From_Canvassing_List() {
	clickWebelement("Canvassing", "SelectCheckBox1");
	clickWebelement("Canvassing", "Remove_Selected_Customer");
	ReadPopUp();
	WaitForElement(300, "Canvassing", "SelectCheckBox1");
	threadWait(3000);
	clickWebelement("Canvassing", "SelectCheckBox1");
	clickWebelement("Canvassing", "SelectCheckBox2");
	clickWebelement("Canvassing", "SelectCheckBox3");
	clickWebelement("Canvassing", "Remove_All_Customers");
	ReadPopUp();
	test.log(LogStatus.INFO, "All customers are removed from the Customer Canvassing List");
	threadWait(3000);
}
public static void Create_Open_Lead() throws IOException {
	ClickByActionClass("Canvassing", "MainMenu", "ESG Values", "Canvassing_Data", 1, 1);
	selectDropdown("Canvassing", "TradeAllyName","", "ESG Values", "Canvassing_Data", 102, 1);
	WaitForElement(300, "Canvassing", "ProgramName1");
	//threadWait(3000);
	selectDropdown("Canvassing", "ProgramName1","", "ESG Values", "Canvassing_Data", 101, 1);	
	
	
	/*selectDropdownByVisibleText("Canvassing", "TradeAllyName", "ESG Values", "Canvassing_Data", 102, 1);
	threadWait(3000);
	selectDropdownByVisibleText("Canvassing", "ProgramName1", "ESG Values", "Canvassing_Data", 101, 1);	*/
	threadWait(3000);
	clickWebelement("Canvassing", "SearchButton");
	threadWait(3000);
	clickWebelement("Canvassing", "SelectProgramName");
	threadWait(2000);
	clickWebelement("Canvassing", "SelectPermises");
	test.log(LogStatus.INFO, "Validating the First Row Data");
	VerifyElementForExistingValueWithText("Canvassing", "CreatePermisesNumberVerify", "ESG Values", "Canvassing_Data", 103, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateStreetNumberVerify", "ESG Values", "Canvassing_Data", 104, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateStreetNameVerify", "ESG Values", "Canvassing_Data", 105, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateUnitVerify", "ESG Values", "Canvassing_Data", 106, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateCityVerify", "ESG Values", "Canvassing_Data", 107, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateZIPVerify", "ESG Values", "Canvassing_Data", 108, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateAreaPrizmCodeVerify", "ESG Values", "Canvassing_Data", 109, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateThomasGuidePageVerify", "ESG Values", "Canvassing_Data", 110, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateThomasGuideGridVerify", "ESG Values", "Canvassing_Data", 111, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateAccountVerify", "ESG Values", "Canvassing_Data", 113, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateNameVerify", "ESG Values", "Canvassing_Data", 116, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CreateAccountStatusVerify", "ESG Values", "Canvassing_Data", 114, 1);
	clickWebelement("Canvassing", "CreateOpenLeadButton");
	WaitForElement(300, "Canvassing", "AccountNumberValidadtion");
	
	test.log(LogStatus.INFO, "Validating the Data in the Create Open Lead Window");
	VerifyElementForExistingValueWithText("Canvassing", "AccountNumberValidadtion", "ESG Values", "Canvassing_Data", 119, 1);
	VerifyElementForExistingValueWithText("Canvassing", "StreetNameValidation", "ESG Values", "Canvassing_Data", 120, 1);
	VerifyElementForExistingValueWithText("Canvassing", "CityNameValidation", "ESG Values", "Canvassing_Data", 121, 1);
	VerifyElementForExistingValueWithText("Canvassing", "ZipCodeValidation", "ESG Values", "Canvassing_Data", 122, 1);
	clickWebelement("Canvassing", "CreateNewLead");
	WaitForElement(300, "Canvassing", "VerifyLeadStatusCreating");
	VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusCreating", "ESG Values", "Canvassing_Data", 123, 1);
	WaitForElement(300, "Canvassing", "VerifyLeadStatusUnscheduled");
	WriteExcel.WriteCopiedData("Canvassing", "VerifyLeadStatusUnscheduled", "ESG Values", "Canvassing_Data", 124, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusUnscheduled", "ESG Values", "Canvassing_Data", 124, 1);
	WriteExcel.WriteCopiedData("Canvassing", "LeadNumberCreated", "ESG Values", "Canvassing_Data", 125, 1);
	
	WebElement CheckBox = Xpath("Canvassing", "SelectPermises");
	if (CheckBox.isDisplayed()) {
		test.log(LogStatus.PASS, "Check box is Unchecked");
		
	} else {
		test.log(LogStatus.FAIL, "Check box is checked");
	}
	clickWebelement("Canvassing", "LeadNumberCreated");
	
	test.log(LogStatus.INFO, "Validating the Data Lead Summary");
	WaitForElement(300, "Canvassing", "LeadSummaryProgram");
	//explicitWait(3000, "Canvassing", "LeadSummaryProgram");
	SubStringData("Canvassing", "LeadSummaryProgram", 7, 21, "ESG Values", "Canvassing_Data", 128, 1);
	SubStringData("Canvassing", "LeadSummaryProgram", 35, 46, "ESG Values", "Canvassing_Data", 124, 1);
	SubStringData("Canvassing", "LeadSummaryProgram", 55, 59, "ESG Values", "Canvassing_Data", 125, 1);
	SubStringData("Canvassing", "LeadSummaryProgram", 71, 80, "ESG Values", "Canvassing_Data", 130, 1);
	SubStringData("Canvassing", "LeadSummaryProgram", 101, 122, "ESG Values", "Canvassing_Data", 131, 1);
	SubStringData("Canvassing", "LeadSummaryProgram", 128, 132, "ESG Values", "Canvassing_Data", 136, 1);
	SubStringData("Canvassing", "LeadSummaryProgram", 133, 157, "ESG Values", "Canvassing_Data", 133, 1);
	SubStringData("Canvassing", "LeadSummaryProgram", 170, 180, "ESG Values", "Canvassing_Data", 119, 1);
	SubStringData("Canvassing", "LeadSummaryProgram", 196, 202, "ESG Values", "Canvassing_Data", 134, 1);
	
	SubStringData("Canvassing", "LeadSummaryProgram", 215, 218, "ESG Values", "Canvassing_Data", 135, 1);
	
	//Verifying the Lead Details page Data
	test.log(LogStatus.INFO, "Validating the Data In the Lead List");
	VerifyElementForExistingValueWithText("Canvassing", "VerifyProgram", "ESG Values", "Canvassing_Data", 138, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyAccountNumber", "ESG Values", "Canvassing_Data", 139, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyFirstName", "ESG Values", "Canvassing_Data", 140, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyLastName", "ESG Values", "Canvassing_Data", 141, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyPrimaryPhoneNumber", "ESG Values", "Canvassing_Data", 142, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyOccupancyStatus", "ESG Values", "Canvassing_Data", 143, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyStreetAddress", "ESG Values", "Canvassing_Data", 145, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyCityName", "ESG Values", "Canvassing_Data", 147, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyState", "ESG Values", "Canvassing_Data", 148, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyUnits", "ESG Values", "Canvassing_Data", 146, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyZipCode", "ESG Values", "Canvassing_Data", 149, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyCountry", "ESG Values", "Canvassing_Data", 150, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyPremisesID", "ESG Values", "Canvassing_Data", 153, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyStreetName", "ESG Values", "Canvassing_Data", 154, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyUnitNumber", "ESG Values", "Canvassing_Data", 155, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyCity", "ESG Values", "Canvassing_Data", 156, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyStateName", "ESG Values", "Canvassing_Data", 157, 1);
	VerifyElementForExistingValueWithAttribute("Canvassing", "VerifyZip", "ESG Values", "Canvassing_Data", 158, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyTradeAllyName", "ESG Values", "Canvassing_Data", 161, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyEmployeeName", "ESG Values", "Canvassing_Data", 162, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadDateTime", "ESG Values", "Canvassing_Data", 165, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifydateAssinged", "ESG Values", "Canvassing_Data", 166, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadSourceCategory", "ESG Values", "Canvassing_Data", 169, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadSource", "ESG Values", "Canvassing_Data", 170, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyOutreachSourceTradeAlly", "ESG Values", "Canvassing_Data", 173, 1);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyOutreachSourceEmployee", "ESG Values", "Canvassing_Data", 174, 1);

	//Scheduling Assignment 
	test.log(LogStatus.INFO, "Scheduling the Appointment");
	scrollToElement("Canvassing", "Appointment_Time");
	AppointmentDate();
	clickWebelement("Canvassing", "Appointment_Time");
	clickWebelement("Canvassing", "SelectAppointmentTime");
	//enterTextboxValue("Canvassing", "Appointment_Time", "ESG Values", "Canvassing_Data", 177, 1);
	threadWait(2500);
	selectDropdown("Canvassing", "Appointment_Duration","", "ESG Values", "Canvassing_Data", 178, 1);
	//selectDropdownByVisibleText("Canvassing", "Appointment_Duration", "ESG Values", "Canvassing_Data", 178, 1);
	HandleErrorCodeOnSave("helper", "SaveButton", "");
	
	//clickonSave();
	ClickByActionClass("Canvassing", "MainMenu", "ESG Values", "Canvassing_Data", 1, 1);
	selectDropdown("Canvassing", "TradeAllyName","", "ESG Values", "Canvassing_Data", 102, 1);
	//selectDropdownByVisibleText("Canvassing", "TradeAllyName", "ESG Values", "Canvassing_Data", 102, 1);
	threadWait(3000);
	selectDropdown("Canvassing", "ProgramName1","", "ESG Values", "Canvassing_Data", 101, 1);
	//selectDropdownByVisibleText("Canvassing", "ProgramName1", "ESG Values", "Canvassing_Data", 101, 1);	
	threadWait(3000);
	clickWebelement("Canvassing", "SearchButton");
	threadWait(3000);
	clickWebelement("Canvassing", "SelectProgramName");
	threadWait(2000);
	VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusscheduled", "ESG Values", "Canvassing_Data", 179, 1);
	
}

	public static void Create_Cancel_Lead() throws IOException {
		
		ClickByActionClass("Canvassing", "MainMenu", "ESG Values", "Canvassing_Data", 1, 1);
		selectDropdown("Canvassing", "TradeAllyName", "ESG Values","", "Canvassing_Data", 102, 1);
		
		//selectDropdownByVisibleText("Canvassing", "TradeAllyName", "ESG Values", "Canvassing_Data", 102, 1);
		threadWait(3000);
		selectDropdown("Canvassing", "ProgramName1","", "ESG Values", "Canvassing_Data", 101, 1);	
		
		//selectDropdownByVisibleText("Canvassing", "ProgramName1", "ESG Values", "Canvassing_Data", 101, 1);	
		threadWait(3000);
		clickWebelement("Canvassing", "SearchButton");
		threadWait(4000);
		clickWebelement("Canvassing", "SelectProgramName");
		threadWait(2000);
		
		//Customer Canvassing List Validation for Create Cancelled Lead Module
		test.log(LogStatus.INFO, "Validating the Second row data");
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_PremiseID", "ESG Values", "Canvassing_Data", 182, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Street_Number", "ESG Values", "Canvassing_Data", 183, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Street_Name", "ESG Values", "Canvassing_Data", 184, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Unit", "ESG Values", "Canvassing_Data", 185, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_City", "ESG Values", "Canvassing_Data", 186, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Zip", "ESG Values", "Canvassing_Data", 187, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Area_Prizm_Code", "ESG Values", "Canvassing_Data", 188, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Thomas_Guide_Page", "ESG Values", "Canvassing_Data", 189, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead__Thomas_Guide_Grid", "ESG Values", "Canvassing_Data", 190, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Account", "ESG Values", "Canvassing_Data", 192, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Name", "ESG Values", "Canvassing_Data", 195, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Create_Cancel_Lead_Account_Status", "ESG Values", "Canvassing_Data", 193, 1);
		WaitForElement(300, "Canvassing", "SelectCancelLead");
		//threadWait(2500);
		clickWebelement("Canvassing", "SelectCancelLead");
		clickWebelement("Canvassing", "CreateCancelLeadButton");
		WaitForElement(300, "Canvassing", "Verify_Cancel_Account_Number");
		//explicitWait(3000, "Canvassing", "Verify_Cancel_Account_Number");
		test.log(LogStatus.INFO, "Validating the Data in the create Cancelled Lead Window");
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Cancel_Account_Number", "ESG Values", "Canvassing_Data", 198, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Cancel_Street_Number", "ESG Values", "Canvassing_Data", 199, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Cancel_City_Number", "ESG Values", "Canvassing_Data", 200, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Cancel_Zip_Number", "ESG Values", "Canvassing_Data", 201, 1);
		clickWebelement("Canvassing", "CreateNewCancelLead");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusCreating", "ESG Values", "Canvassing_Data", 204, 1);
		WaitForElement(300, "Canvassing", "VerifyLeadStatusCancelled");
		//explicitWait(3000, "Canvassing", "VerifyLeadStatusCancelled");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusCancelled", "ESG Values", "Canvassing_Data", 205, 1);
		WriteExcel.WriteCopiedData("Canvassing", "Verify_Lead_Number", "ESG Values", "Canvassing_Data", 206, 1);

		WebElement CheckBox = Xpath("Canvassing", "SelectPermises1");
		if (CheckBox.isDisplayed()) {
			test.log(LogStatus.PASS, "Check box is Unchecked");
			
		} else {
			test.log(LogStatus.FAIL, "Check box is checked");
		}

		clickWebelement("Canvassing", "Verify_Lead_Number");
		
		//Lead Summary Field Validation
		test.log(LogStatus.INFO, "Validating the Data in Lead summary for the create Cancelled Lead");
		WaitForElement(300, "Canvassing", "LeadSummaryProgram");
		//explicitWait(3000, "Canvassing", "LeadSummaryProgram");
		SubStringData("Canvassing", "LeadSummaryProgram", 7, 21, "ESG Values", "Canvassing_Data", 128, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 35, 44, "ESG Values", "Canvassing_Data", 210, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 53, 57, "ESG Values", "Canvassing_Data", 206, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 69, 78, "ESG Values", "Canvassing_Data", 212, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 99, 119, "ESG Values", "Canvassing_Data", 213, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 126, 130, "ESG Values", "Canvassing_Data", 214, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 131, 155, "ESG Values", "Canvassing_Data", 215, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 168, 178, "ESG Values", "Canvassing_Data", 216, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 186, 200, "ESG Values", "Canvassing_Data", 217, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 209, 215, "ESG Values", "Canvassing_Data", 218, 1);
		SubStringData("Canvassing", "LeadSummaryProgram", 228, 231, "ESG Values", "Canvassing_Data", 219, 1);
		
		//Verify the Lead Detail Page
		test.log(LogStatus.INFO, "Validating the Data in Lead List for the create Cancelled Lead");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledProgram", "ESG Values", "Canvassing_Data", 222, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledAccountNumber", "ESG Values", "Canvassing_Data", 223, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledFirstName", "ESG Values", "Canvassing_Data", 224, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledLastName", "ESG Values", "Canvassing_Data", 225, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledPrimaryPhoneNumber", "ESG Values", "Canvassing_Data", 226, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledOccupancyStatus", "ESG Values", "Canvassing_Data", 227, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledStreetAddress", "ESG Values", "Canvassing_Data", 229, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledCityName", "ESG Values", "Canvassing_Data", 230, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledState", "ESG Values", "Canvassing_Data", 231, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledZipCode", "ESG Values", "Canvassing_Data", 232, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledCountry", "ESG Values", "Canvassing_Data", 233, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledPremisesID", "ESG Values", "Canvassing_Data", 236, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledStreetName", "ESG Values", "Canvassing_Data", 237, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledUnitNumber", "ESG Values", "Canvassing_Data", 238, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledCity", "ESG Values", "Canvassing_Data", 239, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledStateName", "ESG Values", "Canvassing_Data", 240, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledZip", "ESG Values", "Canvassing_Data", 241, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledTradeAllyName", "ESG Values", "Canvassing_Data", 244, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledEmployeeName", "ESG Values", "Canvassing_Data", 245, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledLeadDateTime", "ESG Values", "Canvassing_Data", 248, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelleddateAssinged", "ESG Values", "Canvassing_Data", 249, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledLeadSourceCategory", "ESG Values", "Canvassing_Data", 252, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledLeadSource", "ESG Values", "Canvassing_Data", 253, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledOutreachSourceTradeAlly", "ESG Values", "Canvassing_Data", 256, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCancelledOutreachSourceEmployee", "ESG Values", "Canvassing_Data", 257, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadOutCome", "ESG Values", "Canvassing_Data", 258, 1);
	}

	public static void Export_Customer_Canvassing_List() {
		ClickByActionClass("Canvassing", "MainMenu", "ESG Values", "Canvassing_Data", 1, 1);
		selectDropdown("Canvassing", "TradeAllyName","", "ESG Values", "Canvassing_Data", 102, 1);
		
		//selectDropdownByVisibleText("Canvassing", "TradeAllyName", "ESG Values", "Canvassing_Data", 102, 1);
		threadWait(3000);
		selectDropdown("Canvassing", "ProgramName1","", "ESG Values", "Canvassing_Data", 101, 1);
		//selectDropdownByVisibleText("Canvassing", "ProgramName1", "ESG Values", "Canvassing_Data", 101, 1);	
		threadWait(3000);
		clickWebelement("Canvassing", "SearchButton");
		threadWait(4000);
		clickWebelement("Canvassing", "SelectProgramName");
		threadWait(2000);
		test.log(LogStatus.INFO, "Validating the Data in on the Customer Canvassing List page");
		VerifyElementForExistingValueWithAttribute("Canvassing", "Name_Export_Module", "ESG Values", "Canvassing_Data", 262, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Program_Export_Module", "ESG Values", "Canvassing_Data", 263, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Lead_Source_Export_Module", "ESG Values", "Canvassing_Data", 264, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Trade_Ally_Export_Module", "ESG Values", "Canvassing_Data", 265, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Employee_Export_Module", "ESG Values", "Canvassing_Data", 266, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Exclude_result_if_Export_Module", "ESG Values", "Canvassing_Data", 267, 1);
		VerifyElementForExistingValueWithAttribute("Canvassing", "Active_Date_Export_Module", "ESG Values", "Canvassing_Data", 268, 1);
		VerifyElementForExistingValueWithAttribute("Canvassing", "Expiration_Date_Export_Module", "ESG Values", "Canvassing_Data", 269, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Account_Class_Export_Module", "ESG Values", "Canvassing_Data", 270, 1);
		
		
		//First Premises
		test.log(LogStatus.INFO, "Validating the Data in the First Row of Customer Canvassing List page");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID1", "ESG Values", "Canvassing_Data", 273, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage1", "ESG Values", "Canvassing_Data", 274, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage1", "ESG Values", "Canvassing_Data", 275, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage1", "ESG Values", "Canvassing_Data", 276, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage1", "ESG Values", "Canvassing_Data", 277, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage1", "ESG Values", "Canvassing_Data", 278, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage1", "ESG Values", "Canvassing_Data", 279, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage1", "ESG Values", "Canvassing_Data", 280, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage1", "ESG Values", "Canvassing_Data", 281, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage1", "ESG Values", "Canvassing_Data", 283, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage1", "ESG Values", "Canvassing_Data", 286, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage1", "ESG Values", "Canvassing_Data", 284, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusscheduled", "ESG Values", "Canvassing_Data", 179, 1);
		VerifyElementForExistingValueWithText("Canvassing", "LeadNumberCreated", "ESG Values", "Canvassing_Data", 125, 1);
		
		//Second Premises
		test.log(LogStatus.INFO, "Validating the Data in the Second Row of Customer Canvassing List page");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID2", "ESG Values", "Canvassing_Data", 182, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage2", "ESG Values", "Canvassing_Data", 183, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage2", "ESG Values", "Canvassing_Data", 184, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage2", "ESG Values", "Canvassing_Data", 185, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage2", "ESG Values", "Canvassing_Data", 186, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage2", "ESG Values", "Canvassing_Data", 187, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage2", "ESG Values", "Canvassing_Data", 188, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage2", "ESG Values", "Canvassing_Data", 189, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage2", "ESG Values", "Canvassing_Data", 190, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage2", "ESG Values", "Canvassing_Data", 192, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage2", "ESG Values", "Canvassing_Data", 195, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage2", "ESG Values", "Canvassing_Data", 193, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusCancelled", "ESG Values", "Canvassing_Data", 205, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Lead_Number", "ESG Values", "Canvassing_Data", 206, 1);
		//Third Premises
		test.log(LogStatus.INFO, "Validating the Data in the Third Row of Customer Canvassing List page");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremise3CustomerPageID3", "ESG Values", "Canvassing_Data", 289, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumber3CustomerPage3", "ESG Values", "Canvassing_Data", 290, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetName3CustomerPage3", "ESG Values", "Canvassing_Data", 291, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnit3CustomerPage3", "ESG Values", "Canvassing_Data", 292, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCity3CustomerPage3", "ESG Values", "Canvassing_Data", 293, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCode3CustomerPage3", "ESG Values", "Canvassing_Data", 294, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_Code3CustomerPage3", "ESG Values", "Canvassing_Data", 295, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Page3CustomerPage3", "ESG Values", "Canvassing_Data", 296, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Grid3CustomerPage3", "ESG Values", "Canvassing_Data", 297, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyName3CustomerPage3", "ESG Values", "Canvassing_Data", 302, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccount3CustomerPage3", "ESG Values", "Canvassing_Data", 299, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatus3CustomerPage3", "ESG Values", "Canvassing_Data", 300, 1);
		clickWebelement("Canvassing", "ExportToExcelButton");
		threadWait(5000);
		VerifyElementForExistingValueWithAttribute("Canvassing", "Name_Export_Module", "Canvassing List", "Canvassing List Details", 1, 0);
		VerifyElementForExistingValueWithText("Canvassing", "Program_Export_Module", "Canvassing List", "Canvassing List Details", 1, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Lead_Source_Export_Module", "Canvassing List", "Canvassing List Details", 1, 2);
		VerifyElementForExistingValueWithText("Canvassing", "Trade_Ally_Export_Module", "Canvassing List", "Canvassing List Details", 1, 3);
		VerifyElementForExistingValueWithText("Canvassing", "Employee_Export_Module", "Canvassing List", "Canvassing List Details", 1, 4);
		VerifyElementForExistingValueWithText("Canvassing", "Exclude_result_if_Export_Module", "Canvassing List", "Canvassing List Details", 1, 8);
		VerifyElementForExistingValueWithAttribute("Canvassing", "Active_Date_Export_Module", "Canvassing List", "Canvassing List Details", 1, 5);
		VerifyElementForExistingValueWithAttribute("Canvassing", "Expiration_Date_Export_Module", "Canvassing List", "Canvassing List Details", 1, 6);
		VerifyElementForExistingValueWithText("Canvassing", "Account_Class_Export_Module", "Canvassing List", "Canvassing List Details", 1, 7);
		//First Premises
		test.log(LogStatus.INFO, "Validating the Data in the First Row of Customer Canvassing List page");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID1", "Canvassing List", "Canvassing List Premises", 2, 0);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 2);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 3);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 4);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 5);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 6);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 7);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 8);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 10);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 11);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage1", "Canvassing List", "Canvassing List Premises", 2, 12);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusscheduled", "Canvassing List", "Canvassing List Premises", 2, 14);
		VerifyElementForExistingValueWithText("Canvassing", "LeadNumberCreated", "Canvassing List", "Canvassing List Premises", 2, 15);
				
		//Second Premises
		test.log(LogStatus.INFO, "Validating the Data in the Second Row of Customer Canvassing List page");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID2", "Canvassing List", "Canvassing List Premises", 3, 0);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage2","Canvassing List", "Canvassing List Premises", 3, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 2);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 3);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 4);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 5);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 6);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 7);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 8);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 10);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 11);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage2", "Canvassing List", "Canvassing List Premises", 3, 12);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusCancelled", "Canvassing List", "Canvassing List Premises", 3, 14);
		VerifyElementForExistingValueWithText("Canvassing", "Verify_Lead_Number", "Canvassing List", "Canvassing List Premises", 3, 15);
		//Third Premises
		test.log(LogStatus.INFO, "Validating the Data in the Third Row of Customer Canvassing List page");
		VerifyElementForExistingValueWithText("Canvassing", "VerifyPremise3CustomerPageID3", "Canvassing List", "Canvassing List Premises", 1, 0);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumber3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 1);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetName3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 2);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyUnit3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 3);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyCity3CustomerPage3","Canvassing List", "Canvassing List Premises", 1, 4);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCode3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 5);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_Code3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 6);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Page3CustomerPage3","Canvassing List", "Canvassing List Premises", 1, 7);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Grid3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 8);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyName3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 11);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccount3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 10);
		VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatus3CustomerPage3", "Canvassing List", "Canvassing List Premises", 1, 12);	
		threadWait(2500);
		DeleteFile();
	}
	public static void Copy_Customer_Canvasing_List() throws IOException {
		ClickByActionClass("Canvassing", "MainMenu", "ESG Values", "Canvassing_Data", 1, 1);
		selectDropdown("Canvassing", "TradeAllyName","", "ESG Values", "Canvassing_Data", 102, 1);
		
		//selectDropdownByVisibleText("Canvassing", "TradeAllyName", "ESG Values", "Canvassing_Data", 102, 1);
		threadWait(3000);
		selectDropdown("Canvassing", "ProgramName1","", "ESG Values", "Canvassing_Data", 101, 1);
		//selectDropdownByVisibleText("Canvassing", "ProgramName1", "ESG Values", "Canvassing_Data", 101, 1);	
		threadWait(3000);
		clickWebelement("Canvassing", "SearchButton");
		threadWait(4000);
		clickWebelement("Canvassing", "SelectProgramName");
		threadWait(2000);
		test.log(LogStatus.INFO, "Validating the Data on the Customer Canvassing List page");
		VerifyElementForExistingValueWithAttribute("Canvassing", "Name_Export_Module", "ESG Values", "Canvassing_Data", 262, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Program_Export_Module", "ESG Values", "Canvassing_Data", 263, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Lead_Source_Export_Module", "ESG Values", "Canvassing_Data", 264, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Trade_Ally_Export_Module", "ESG Values", "Canvassing_Data", 265, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Employee_Export_Module", "ESG Values", "Canvassing_Data", 266, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Exclude_result_if_Export_Module", "ESG Values", "Canvassing_Data", 267, 1);
		VerifyElementForExistingValueWithAttribute("Canvassing", "Active_Date_Export_Module", "ESG Values", "Canvassing_Data", 268, 1);
		VerifyElementForExistingValueWithAttribute("Canvassing", "Expiration_Date_Export_Module", "ESG Values", "Canvassing_Data", 269, 1);
		VerifyElementForExistingValueWithText("Canvassing", "Account_Class_Export_Module", "ESG Values", "Canvassing_Data", 270, 1);
		
		//First Premises
		test.log(LogStatus.INFO, "Validating the Data in the First Row of Customer Canvassing List page");
				VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID1", "ESG Values", "Canvassing_Data", 273, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage1", "ESG Values", "Canvassing_Data", 274, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage1", "ESG Values", "Canvassing_Data", 275, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage1", "ESG Values", "Canvassing_Data", 276, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage1", "ESG Values", "Canvassing_Data", 277, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage1", "ESG Values", "Canvassing_Data", 278, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage1", "ESG Values", "Canvassing_Data", 279, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage1", "ESG Values", "Canvassing_Data", 280, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage1", "ESG Values", "Canvassing_Data", 281, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage1", "ESG Values", "Canvassing_Data", 283, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage1", "ESG Values", "Canvassing_Data", 286, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage1", "ESG Values", "Canvassing_Data", 284, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusscheduled", "ESG Values", "Canvassing_Data", 179, 1);
				VerifyElementForExistingValueWithText("Canvassing", "LeadNumberCreated", "ESG Values", "Canvassing_Data", 125, 1);
				
				//Second Premises
				test.log(LogStatus.INFO, "Validating the Data in the Second Row of Customer Canvassing List page");
				VerifyElementForExistingValueWithText("Canvassing", "VerifyPremiseCustomerPageID2", "ESG Values", "Canvassing_Data", 182, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumberCustomerPage2", "ESG Values", "Canvassing_Data", 183, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNameCustomerPage2", "ESG Values", "Canvassing_Data", 184, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyUnitCustomerPage2", "ESG Values", "Canvassing_Data", 185, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyCityCustomerPage2", "ESG Values", "Canvassing_Data", 186, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCodeCustomerPage2", "ESG Values", "Canvassing_Data", 187, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_CodeCustomerPage2", "ESG Values", "Canvassing_Data", 188, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_PageCustomerPage2", "ESG Values", "Canvassing_Data", 189, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_GridCustomerPage2", "ESG Values", "Canvassing_Data", 190, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountCustomerPage2", "ESG Values", "Canvassing_Data", 192, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNameCustomerPage2", "ESG Values", "Canvassing_Data", 195, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatusCustomerPage2", "ESG Values", "Canvassing_Data", 193, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyLeadStatusCancelled", "ESG Values", "Canvassing_Data", 205, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Verify_Lead_Number", "ESG Values", "Canvassing_Data", 206, 1);
				//Third Premises
				test.log(LogStatus.INFO, "Validating the Data in the Third Row of Customer Canvassing List page");
				VerifyElementForExistingValueWithText("Canvassing", "VerifyPremise3CustomerPageID3", "ESG Values", "Canvassing_Data", 289, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetNumber3CustomerPage3", "ESG Values", "Canvassing_Data", 290, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyStreetName3CustomerPage3", "ESG Values", "Canvassing_Data", 291, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyUnit3CustomerPage3", "ESG Values", "Canvassing_Data", 292, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyCity3CustomerPage3", "ESG Values", "Canvassing_Data", 293, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyZipCode3CustomerPage3", "ESG Values", "Canvassing_Data", 294, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyArea_Prizm_Code3CustomerPage3", "ESG Values", "Canvassing_Data", 295, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Page3CustomerPage3", "ESG Values", "Canvassing_Data", 296, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyThomas_Guide_Grid3CustomerPage3", "ESG Values", "Canvassing_Data", 297, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyName3CustomerPage3", "ESG Values", "Canvassing_Data", 302, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyAccount3CustomerPage3", "ESG Values", "Canvassing_Data", 299, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyAccountStatus3CustomerPage3", "ESG Values", "Canvassing_Data", 300, 1);
				clickWebelement("Canvassing", "CopyButton");
				WaitForElement(300, "Canvassing", "Name_Export_Module");
				//explicitWait(3000, "Canvassing", "Name_Export_Module");
				VerifyElementForExistingValueWithAttribute("Canvassing", "Name_Export_Module", "ESG Values", "Canvassing_Data", 262, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Program_Export_Module", "ESG Values", "Canvassing_Data", 263, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Lead_Source_Export_Module", "ESG Values", "Canvassing_Data", 264, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Trade_Ally_Export_Module", "ESG Values", "Canvassing_Data", 265, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Employee_Export_Module", "ESG Values", "Canvassing_Data", 266, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Exclude_result_if_Export_Module", "ESG Values", "Canvassing_Data", 267, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Active_Date_Export_Module", "ESG Values", "Canvassing_Data", 310, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Expiration_Date_Export_Module", "ESG Values", "Canvassing_Data", 313, 1);
				VerifyElementForExistingValueWithText("Canvassing", "Account_Class_Export_Module", "ESG Values", "Canvassing_Data", 270, 1);
				
				Verify_Button_Enabled("Canvassing", "SaveButton", "Save Button is Enabled", "Save Button is Disabled");
				Verify_Button_Enabled("Canvassing", "CloseButton", "Close Button is Enabled", "Close Button is Disabled");
				Verify_Button_Disabled("Canvassing", "DeleteButton", "Delete Button is Disabled", "Delete Button is Enabled");
				Verify_Button_Disabled("Canvassing", "ExportToExcelButton", "Export Button is Disabled", "Export Button is Enabled");
				Verify_Button_Disabled("Canvassing", "CustomerSearchButtonValidadtion", "Customer Search Button is Disabled", "Customer Search Button is Enabled");
				Verify_Button_Disabled("Canvassing", "CopyButton", "Copy Button is Disabled", "Copy Button is Enabled");
				ActiveDate();
				enterTextboxValue("Canvassing", "ExpirationDate", "ESG Values", "Canvassing_Data", 269, 1);
				
				HandleErrorCodeOnSave("helper", "SaveButton", "");
				//clickonSave();
				WaitForElement(300, "Canvassing", "DeleteButton");
				//explicitWait(3000, "Canvassing", "DeleteButton");
				Verify_Button_Enabled("Canvassing", "DeleteButton", "Delete Button is Enabled", "Delete Button is Disabled");
				Verify_Button_Enabled("Canvassing", "ExportToExcelButton", "Export Button is Enabled", "Export Button is Disabled");
				Verify_Button_Enabled("Canvassing", "CustomerSearchButtonValidadtion", "Customer Search Button is Enabled", "Customer Search Button is Disabled");
				Verify_Button_Enabled("Canvassing", "CopyButton", "Copy Button is Enabled", "Copy Button is Disabled");
				clickonclose();
				selectDropdown("Canvassing", "TradeAllyName","", "ESG Values", "Canvassing_Data", 102, 1);
				
				//selectDropdownByVisibleText("Canvassing", "TradeAllyName", "ESG Values", "Canvassing_Data", 102, 1);
				threadWait(3000);
				selectDropdown("Canvassing", "ProgramName1","", "ESG Values", "Canvassing_Data", 101, 1);	
				
				//selectDropdownByVisibleText("Canvassing", "ProgramName1", "ESG Values", "Canvassing_Data", 101, 1);	
				threadWait(3000);
				CanvassingListFromDate();
				clickWebelement("Canvassing", "SearchButton");
				threadWait(4000);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNewCanvassingListName", "ESG Values", "Canvassing_Data", 305, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNewCanvassingListProgramName", "ESG Values", "Canvassing_Data", 306, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNewCanvassingListTradeAlly", "ESG Values", "Canvassing_Data", 307, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNewCanvassingListEmployee", "ESG Values", "Canvassing_Data", 308, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNewCanvassingListTotalCustomers", "ESG Values", "Canvassing_Data", 309, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNewCanvassingListCustomersWithNoLeads", "ESG Values", "Canvassing_Data", 310, 1);
				WriteExcel.WriteCopiedData("Canvassing", "VerifyNewCanvassingListActiveDate", "ESG Values", "Canvassing_Data", 311, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNewCanvassingListActiveDate", "ESG Values", "Canvassing_Data", 311, 1);
				VerifyElementForExistingValueWithText("Canvassing", "VerifyNewCanvassingListExpirationDate", "ESG Values", "Canvassing_Data", 313, 1);	
	}
	
	}
