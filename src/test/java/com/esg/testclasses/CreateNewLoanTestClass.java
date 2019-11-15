package com.esg.testclasses;

import java.awt.Event;
import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;

public class CreateNewLoanTestClass extends HelperClass {
	
	public static void Login() {
		login("helper","BaseURL", 1, 0, 1, 1);
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		defineLogs("Loan List", "Loan List", "Loan List", "The Loan List page is Successfully Opened", "The Loan List page is failed to open", "CreateNewLoan", "LoanListValidation");
	}
	public static void CreateLoan() {
		threadWait(2500);
		enterTextboxValue("CreateNewLoan", "LoanNumber", "ESG Values", "Create New Loan", 2, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		clickWebelement("CreateNewLoan", "NewButton");
		threadWait(2500);
		enterTextboxValue("CreateNewLoan", "LoanAccount", "ESG Values", "Create New Loan", 2, 1);
		selectDropdownByVisibleText("CreateNewLoan", "LoanType", "ESG Values", "Create New Loan", 3, 1);
		selectDropdownByVisibleText("CreateNewLoan", "EndUse", "ESG Values", "Create New Loan", 4, 1);
		selectDropdownByVisibleText("CreateNewLoan", "BundledLoan", "ESG Values", "Create New Loan", 5, 1);
		enterTextboxValue("CreateNewLoan", "OriginalLoanAmount", "ESG Values", "Create New Loan", 7, 1);
		threadWait(2500);
	
		String Ajax = driver.switchTo().alert().getText();
	
		if (Ajax.equalsIgnoreCase("AJAXLoadData failed for url: ../Loan/GetLoanTypeById")) {
			System.out.println("Moved to alert Window");
			threadWait(2500);
			handlePopup();
			
		} else {
				System.out.println("No Alert PopUp");
		}
		enterTextboxValue("CreateNewLoan", "FinalLoanAmount", "ESG Values", "Create New Loan", 7, 2);
		threadWait(2500);
		enterTextboxValue("CreateNewLoan", "OriginalPayBack", "ESG Values", "Create New Loan", 8, 1);
		enterTextboxValue("CreateNewLoan", "FinalPayBack", "ESG Values", "Create New Loan", 8, 2);
		enterTextboxValue("CreateNewLoan", "OriginalTerm", "ESG Values", "Create New Loan", 9, 1);
		enterTextboxValue("CreateNewLoan", "FinalTerm", "ESG Values", "Create New Loan", 9, 2);
		enterTextboxValue("CreateNewLoan", "originalCustomer", "ESG Values", "Create New Loan", 10, 1);
		enterTextboxValue("CreateNewLoan", "FinalCustomer", "ESG Values", "Create New Loan", 10, 2);
		clickWebelement("CreateNewLoan", "AddButton");
		threadWait(2500);
		clickWebelement("CreateNewLoan", "AccountSearch");
		threadWait(2500);
		selectDropdownByVisibleText("CreateNewLoan", "SearchType", "ESG Values", "Create New Loan", 11, 1);
		threadWait(2500);
		enterTextboxValue("CreateNewLoan", "SearchBox", "ESG Values", "Create New Loan", 12, 1);
		clickWebelement("CreateNewLoan", "Go");
		threadWait(2500);
		clickWebelement("CreateNewLoan", "CustomerLink");
		clickWebelement("CreateNewLoan", "Ok");
		threadWait(2500);
		enterTextboxValue("CreateNewLoan", "PrimaryPhoneNumber", "ESG Values", "Create New Loan", 27, 1);
		clickWebelement("CreateNewLoan", "Saveoption");
		threadWait(2500);
		defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "Loan Details are Generated Successfully", "Loan Details are not Generated", "CreateNewLoan", "CreateLoanValidation");
		clickWebelement("CreateNewLoan", "CloseButton");
	}
	public static void LoanSearchMoudle() {
		//Account Search Validation
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		enterTextboxValue("CreateNewLoan", "AccountSearch1", "ESG Values", "Create New Loan", 15, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "Account Number Search is Validated Successfully", "Account Number Search is not Validated", "CreateNewLoan", "AccountValidation");
		//Project File Number validation
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		enterTextboxValue("CreateNewLoan", "ProjectNumber", "ESG Values", "Create New Loan", 21, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "Project File Number Search is Validated Successfully", "Project File Number Search is not Validated", "CreateNewLoan", "AccountValidation");
		//Loan Number Search
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		enterTextboxValue("CreateNewLoan", "LoanNumberSearch", "ESG Values", "Create New Loan", 22, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("Loan List", "Loan List", "Loan List", "The Loan Number page is Successfully Validated", "The Loan Number page is failed to Validate", "CreateNewLoan", "LoanListValidation");
		//Loan Status validation
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		selectDropdownByVisibleText("CreateNewLoan", "LoanStatusSearch", "ESG Values", "Create New Loan", 24, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("Loan List", "Loan List", "Loan List", "The Loan Status page is Successfully Validated", "The Loan Status page is failed to open", "CreateNewLoan", "LoanListValidation");
		//Loan Type Search
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		enterTextboxValue("CreateNewLoan", "LoanTypeSearch", "ESG Values", "Create New Loan", 23, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("Loan List", "Loan List", "Loan List", "The Loan Type is Successfully Validated", "The Loan Type page is failed to Validate", "CreateNewLoan", "LoanListValidation");
		//Enrollment Search Validation
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		enterTextboxValue("CreateNewLoan", "EnrollmentSearch", "ESG Values", "Create New Loan", 25, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("Loan List", "Loan List", "Loan List", "Enrollment Search page is Successfully Opened", "Enrollment Search page is failed to open", "CreateNewLoan", "LoanListValidation");
		//Customer Name Seach Validation
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		enterTextboxValue("CreateNewLoan", "CustomerSearch", "ESG Values", "Create New Loan", 16, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "Customer Name is Validated Successfully", "Customer Name is not Validated", "CreateNewLoan", "AccountValidation");
		//Trade Ally Search Validation
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		selectDropdownByVisibleText("CreateNewLoan", "TradeAllySearch", "ESG Values", "Create New Loan", 26, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("Loan List", "Loan List", "Loan List", "Trade Ally page is Successfully Opened", "Trade Ally page is failed to open", "CreateNewLoan", "LoanListValidation");
		//Street Search Validation
		ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
		enterTextboxValue("CreateNewLoan", "StreetSearch", "ESG Values", "Create New Loan", 17, 1);
		clickWebelement("CreateNewLoan", "SearchButton");
		threadWait(2500);
		defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "Street Search is Validated Successfully", "Street Search is not Validated", "CreateNewLoan", "AccountValidation");
		//City Search Validation
				ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
				enterTextboxValue("CreateNewLoan", "CitySearch", "ESG Values", "Create New Loan", 20, 1);
				clickWebelement("CreateNewLoan", "SearchButton");
				threadWait(2500);
				defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "City name Search is Validated Successfully", "Account Number Search is not Validated", "CreateNewLoan", "AccountValidation");
				//Zip Search Validation
				ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
				enterTextboxValue("CreateNewLoan", "ZipSearch", "ESG Values", "Create New Loan", 19, 1);
				clickWebelement("CreateNewLoan", "SearchButton");
				threadWait(2500);
				defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "Zip Code Search is Validated Successfully", "Zip Number Search is not Validated", "CreateNewLoan", "AccountValidation");
				//Unit Search Validation
				ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
				enterTextboxValue("CreateNewLoan", "UnitSearch", "ESG Values", "Create New Loan", 18, 1);
				clickWebelement("CreateNewLoan", "SearchButton");
				threadWait(2500);
				defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "Unit Number Search is Validated Successfully", "Unit Number Search is not Validated", "CreateNewLoan", "AccountValidation");
				//Phone Number Search Validation
				ClickByActionClass("CreateNewLoan", "MainMenu", "ESG Values", "Create New Loan", 1, 1);
				clickWebelement("CreateNewLoan", "PhoneSearch");
				threadWait(2500);
				enterTextboxValue("CreateNewLoan", "PhoneSearch", "ESG Values", "Create New Loan", 27, 1);
				clickWebelement("CreateNewLoan", "SearchButton");
				threadWait(2500);
				defineLogs("BRITTANY SMITH", "BRITTANY SMITH", "BRITTANY SMITH", "Phone Number Search is Validated Successfully", "Phone Number Search is not Validated", "CreateNewLoan", "AccountValidation");
	}

}
