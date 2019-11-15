package com.esg.testclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import com.esg.utilities.HelperClass;
import com.esg.utilities.WriteExcel;

public class SPGInsulationUpgradeTestClass extends HelperClass{

	public static void OpenOnlineApplication() {
		setProperty("helper", "chrome", "Chrome_Path");
		openChrome();
		openURL("SPGInsulationUpgrade", "OnlineApplication");
		maximizeWindow();
		threadWait(2500);
	}
	// Attic Insulation Module
	public static void AtticInsulation() throws IOException {
		
		//Step 1 - Getting Started
		clickWebelement("SPGInsulationUpgrade", "AccountHolder");
		enterTextboxValue("SPGInsulationUpgrade", "AccountNumber", "ESG Values", "SPGInsulationUpgrade", 1, 1);
		clickWebelement("SPGInsulationUpgrade", "StreetNumber");
		enterTextboxValue("SPGInsulationUpgrade", "StreetNumber", "ESG Values", "SPGInsulationUpgrade", 2, 1);
		clickWebelement("SPGInsulationUpgrade", "PostalCode");
		enterTextboxValue("SPGInsulationUpgrade", "PostalCode", "ESG Values", "SPGInsulationUpgrade", 3, 1);
		clickWebelement("SPGInsulationUpgrade", "Next");
		threadWait(2500);
		
		//Step 2 - Customer Information
		selectDropdownByVisibleText("SPGInsulationUpgrade", "RebatePaymentMethod", "ESG Values", "SPGInsulationUpgrade", 6, 1);
		//enterTextboxValue("SPGInsulationUpgrade", "FirstName", "ESG Values", "SPGInsulationUpgrade", 4, 1);
		//enterTextboxValue("SPGInsulationUpgrade", "LastName", "ESG Values", "SPGInsulationUpgrade", 5, 1);
		enterTextboxValue("SPGInsulationUpgrade", "EmailID", "ESG Values", "SPGInsulationUpgrade", 7, 1);
		scrollToElement("SPGInsulationUpgrade", "BuildingType");
		threadWait(2500);
		selectDropdownByVisibleText("SPGInsulationUpgrade", "BuildingType", "ESG Values", "SPGInsulationUpgrade", 8, 1);
		selectDropdownByVisibleText("SPGInsulationUpgrade", "OccupancyType", "ESG Values", "SPGInsulationUpgrade", 9, 1);
		selectDropdownByVisibleText("SPGInsulationUpgrade", "ConstructionType", "ESG Values", "SPGInsulationUpgrade", 10, 1);
		clickWebelement("SPGInsulationUpgrade", "Next");
		threadWait(2500);
		
		//Step 3 - Installation Information
		clickWebelement("SPGInsulationUpgrade", "SelfInstallation");
		clickWebelement("SPGInsulationUpgrade", "Next");
		threadWait(5000);
		
		//Step 4 - Equipment Installation
		InstallationDate();
		clickWebelement("SPGInsulationUpgrade", "AddButton");
		threadWait(2500);
		clickWebelement("SPGInsulationUpgrade", "CheckBox");
		clickWebelement("SPGInsulationUpgrade", "Ok");
		threadWait(3000);
		clickWebelement("SPGInsulationUpgrade", "SquareFoot");
		enterTextboxValue("SPGInsulationUpgrade", "SquareFoot", "ESG Values", "SPGInsulationUpgrade", 11, 1);
		enterTextboxValue("SPGInsulationUpgrade", "TotalCost", "ESG Values", "SPGInsulationUpgrade", 13, 1);
		selectDropdownByVisibleText("SPGInsulationUpgrade", "TypeofExisitingInsulation", "ESG Values", "SPGInsulationUpgrade", 16, 1);
		enterTextboxValue("SPGInsulationUpgrade", "InchesExisitingInsulation", "ESG Values", "SPGInsulationUpgrade", 14, 1);
		enterTextboxValue("SPGInsulationUpgrade", "InsulationBagsRolls", "ESG Values", "SPGInsulationUpgrade", 12, 1);
		selectDropdownByVisibleText("SPGInsulationUpgrade", "TypeofNewInsulation", "ESG Values", "SPGInsulationUpgrade", 17, 1);
		enterTextboxValue("SPGInsulationUpgrade", "InchesofInstallationInsulation", "ESG Values", "SPGInsulationUpgrade", 15, 1);
		clickWebelement("SPGInsulationUpgrade", "Next");
		threadWait(10000);
		//Step 5 - Incentive Summary Verification
		defineLogs("$100.00", "$100.00", "$100.00. ", "The Message has been Verified Successfully", "Failed to Verify the Message", "SPGInsulationUpgrade", "IncentiveVerification");
		threadWait(2500);
		
		//Step 6 Documentation
		clickWebelement("SPGInsulationUpgrade", "Next");
		threadWait(2500);
		//Step 7 Guidelines 
		clickWebelement("SPGInsulationUpgrade", "Next");
		clickWebelement("SPGInsulationUpgrade", "AgreementCheckbox");
		clickWebelement("SPGInsulationUpgrade", "Next");
		threadWait(6000);
		
		//Step 7 Review and Submit
		//InstallationDate();
		
		CustomerSignDate();
		scrollToElement("SPGInsulationUpgrade", "Submit");
		clickWebelement("SPGInsulationUpgrade", "Submit");
		threadWait(50000);
		//Verify the Application submission Confirmation Message
		defineLogs("Thank you for submitting your application online with City Utilities", "Thank you for submitting your application online with City Utilities", "Thank you for submitting your application online with City Utilities", "The message is verified Successfully", "The message is not verified", "SPGInsulationUpgrade", "ConfirmationMessage");
		String Copy = driver.findElement(By.xpath("//div[@data-bind='html: ConfirmationMessage']")).getText();
		String  lastFourDigits = "";
		if (Copy.length() > 4)
		{
		    lastFourDigits = Copy.substring(Copy.length() - 7);
		}
		else
		{
		    lastFourDigits = Copy;
		}
		 
		System.out.println(lastFourDigits);
		
		//Login to ESG site
		login2(1, 0, 1, 1);
		ClickByActionClass("SPGInsulationUpgrade", "MainMenu", "ESG Values", "SPGInsulationUpgrade", 18, 1);
		WriteExcel.WriteData("ESG Values", "SPGInsulationUpgrade", lastFourDigits, 28, 3);
		enterTextboxValue("SPGInsulationUpgrade", "EnrollmentNumber", "ESG Values", "SPGInsulationUpgrade", 28, 3);
		threadWait(5000);
		clickWebelement("SPGInsulationUpgrade", "Search");
		threadWait(5000);
		clickWebelement("SPGInsulationUpgrade", "EnrollmentLink");
		threadWait(2500);
		clickWebelement("SPGInsulationUpgrade", "ApplicationLink");
		if (driver.getPageSource().contains("Application - Applicant Information - Work Completed")) {
			System.out.println("Application status is Closed-Work Completed");
			clickWebelement("SPGInsulationUpgrade", "Close");
		} else {
			ApplicationInstallationDate();
			clickonProcess();
			threadWait(3500);
		}
		if (driver.getPageSource().contains("Closed - Work Completed")) {
			System.out.println("Application meter is disabled");
		} else {
			handlePopup();
			clickWebelement("SPGInsulationUpgrade", "Application_Meter");
			enterTextboxValue("SPGInsulationUpgrade", "Application_Meter", "ESG Values", "SPGInsulationUpgrade", 27, 1);
			clickonProcess();
		}
		threadWait(5000);
		defineLogs("Closed - Work Completed", "Closed - Work Completed", "Closed - Work Completed", "Application Status is verified Successfully", "Failed to Verify the Application status", "SPGInsulationUpgrade", "WorkflowVerification");
	}
	public static void NaturalGas() throws IOException {
		//Step 1 - Getting Started
				openURL("SPGInsulationUpgrade", "OnlineApplication");
				threadWait(5000);
				clickWebelement("SPGInsulationUpgrade", "AccountHolder");
				enterTextboxValue("SPGInsulationUpgrade", "AccountNumber", "ESG Values", "SPGInsulationUpgrade", 1, 1);
				clickWebelement("SPGInsulationUpgrade", "StreetNumber");
				enterTextboxValue("SPGInsulationUpgrade", "StreetNumber", "ESG Values", "SPGInsulationUpgrade", 2, 1);
				clickWebelement("SPGInsulationUpgrade", "PostalCode");
				enterTextboxValue("SPGInsulationUpgrade", "PostalCode", "ESG Values", "SPGInsulationUpgrade", 3, 1);
				clickWebelement("SPGInsulationUpgrade", "Next");
				threadWait(2500);
				
				//Step 2 - Customer Information
				selectDropdownByVisibleText("SPGInsulationUpgrade", "RebatePaymentMethod", "ESG Values", "SPGInsulationUpgrade", 6, 1);
				//enterTextboxValue("SPGInsulationUpgrade", "FirstName", "ESG Values", "SPGInsulationUpgrade", 4, 1);
				//enterTextboxValue("SPGInsulationUpgrade", "LastName", "ESG Values", "SPGInsulationUpgrade", 5, 1);
				enterTextboxValue("SPGInsulationUpgrade", "EmailID", "ESG Values", "SPGInsulationUpgrade", 7, 1);
				scrollToElement("SPGInsulationUpgrade", "BuildingType");
				threadWait(2500);
				selectDropdownByVisibleText("SPGInsulationUpgrade", "BuildingType", "ESG Values", "SPGInsulationUpgrade", 8, 1);
				selectDropdownByVisibleText("SPGInsulationUpgrade", "OccupancyType", "ESG Values", "SPGInsulationUpgrade", 9, 1);
				selectDropdownByVisibleText("SPGInsulationUpgrade", "ConstructionType", "ESG Values", "SPGInsulationUpgrade", 10, 1);
				clickWebelement("SPGInsulationUpgrade", "Next");
				threadWait(2500);
				
				//Step 3 - Installation Information
				clickWebelement("SPGInsulationUpgrade", "SelfInstallation");
				clickWebelement("SPGInsulationUpgrade", "Next");
				threadWait(5000);
				
				//Step 4 - Equipment Installation
				InstallationDate();
				clickWebelement("SPGInsulationUpgrade", "AddButton");
				threadWait(2500);
				clickWebelement("SPGInsulationUpgrade", "CheckBox2");
				clickWebelement("SPGInsulationUpgrade", "Ok");
				threadWait(3000);
				clickWebelement("SPGInsulationUpgrade", "Quantity");
				enterTextboxValue("SPGInsulationUpgrade", "Quantity", "ESG Values", "SPGInsulationUpgrade", 21, 1);
				enterTextboxValue("SPGInsulationUpgrade", "NewSystemManufacturer", "ESG Values", "SPGInsulationUpgrade", 22, 1);
				enterTextboxValue("SPGInsulationUpgrade", "NewSystemSize", "ESG Values", "SPGInsulationUpgrade", 23, 1);
				enterTextboxValue("SPGInsulationUpgrade", "NewSystemAFUE", "ESG Values", "SPGInsulationUpgrade", 24, 1);
				enterTextboxValue("SPGInsulationUpgrade", "NewSystemModel", "ESG Values", "SPGInsulationUpgrade", 25, 1);
				clickWebelement("SPGInsulationUpgrade", "TwoStage");
				clickWebelement("SPGInsulationUpgrade", "Next");
				threadWait(3500);
				//Step 5 - Incentive Summary Verification
				defineLogs("$48,000.00", "$48,000.00", "$48,000.00", "The Message has been Verified Successfully", "Failed to Verify the Message", "SPGInsulationUpgrade", "IncentiveVerification");
				threadWait(2500);
				
				//Step 6 Documentation
				clickWebelement("SPGInsulationUpgrade", "Next");
				threadWait(2500);
				//Step 7 Guidelines 
				clickWebelement("SPGInsulationUpgrade", "Next");
				clickWebelement("SPGInsulationUpgrade", "AgreementCheckbox");
				clickWebelement("SPGInsulationUpgrade", "Next");
				threadWait(5000);
				
				//Step 7 Review and Submit
				CustomerSignDate();
				scrollToElement("SPGInsulationUpgrade", "Submit");
				clickWebelement("SPGInsulationUpgrade", "Submit");
				threadWait(30000);
				//Verify the Application submission Confirmation Message
				defineLogs("Thank you for submitting your application online with City Utilities", "Thank you for submitting your application online with City Utilities", "Thank you for submitting your application online with City Utilities", "The message is verified Successfully", "The message is not verified", "SPGInsulationUpgrade", "ConfirmationMessage");
				String Copy = driver.findElement(By.xpath("//div[@data-bind='html: ConfirmationMessage']")).getText();
				String  lastFourDigits = "";
				if (Copy.length() > 4)
				{
				    lastFourDigits = Copy.substring(Copy.length() - 7);
				}
				else
				{
				    lastFourDigits = Copy;
				}
				 
				System.out.println(lastFourDigits);
				
				//Login to ESG site
				login2(1, 0, 1, 1);
				ClickByActionClass("SPGInsulationUpgrade", "MainMenu", "ESG Values", "SPGInsulationUpgrade", 18, 1);
				WriteExcel.WriteData("ESG Values", "SPGInsulationUpgrade", lastFourDigits, 29, 3);
				enterTextboxValue("SPGInsulationUpgrade", "EnrollmentNumber", "ESG Values", "SPGInsulationUpgrade", 29, 3);
				threadWait(10000);
				clickWebelement("SPGInsulationUpgrade", "Search");
				threadWait(5000);
				clickWebelement("SPGInsulationUpgrade", "EnrollmentLink");
				threadWait(2500);
				clickWebelement("SPGInsulationUpgrade", "ApplicationLink");
				ApplicationInstallationDate();
				clickonProcess();
				threadWait(5000);
				defineLogs("Closed - Work Completed", "Closed - Work Completed", "Closed - Work Completed", "Application Status is verified Successfully", "Failed to Verify the Application status", "SPGInsulationUpgrade", "WorkflowVerification");
				clickWebelement("SPGInsulationUpgrade", "ApplicationLink");
				scrollToElement("SPGInsulationUpgrade", "Measures");
				clickWebelement("SPGInsulationUpgrade", "Measures");
				threadWait(2500);
				defineLogs("Workflow Step Summary", "Workflow Step Summary", "Workflow Step Summary", "Measure name is Verified Successfully", "Failed to verify Measure Name", "SPGInsulationUpgrade", "MeasureName");
				defineLogs("1", "1", "1", "Measure Quantity is verified Successfully", "Failed to verify Measure Quantity", "SPGInsulationUpgrade", "MeasureQTY");
				defineLogs("$48,000.00", "$48,000.00", "$48,000.00", "Incentive Amount is verified Successfully", "Failed to verify Incentive Amount(Expected result is $400.00 )", "SPGInsulationUpgrade", "IncentiveAmount");
				defineLogs("0.0000", "0.0000", "0.0000", "Savings KWh value is verified Successfully", "Failed to verify Savings KWh Value(Expected Value is 100.0000 )", "SPGInsulationUpgrade", "SavingsKWh");
				defineLogs("test", "test", "test", "New System Manufacturer Name is verified Successfully", "Failed to verify New System Manufacturer Name", "SPGInsulationUpgrade", "NewSystemManufacturerVerification");
				defineLogs("80000", "80000", "80000", "New System Size value is verified Successfully", "Failed to verify New System Size value", "SPGInsulationUpgrade", "NewSystemSizeVerification");
				defineLogs("96.7%", "96.7%", "96.7%", "New System AFUE value is verified Successfully", "Failed to verify New System AFUE Value", "SPGInsulationUpgrade", "NewSystemAFUEVerification");
				defineLogs("Test", "Test", "Test", "New System Model Name is verified Successfully", "Failed to verify New System Model Name", "SPGInsulationUpgrade", "NewSystemModelVerification");
				defineLogs("Two Stage", "Two Stage", "Two Stage", "Type is verified Successfully", "Failed to verify Type", "SPGInsulationUpgrade", "TypeVerification");
				defineLogs("$48,000.00", "$48,000.00", "$48,000.00", "Total Incentive Amount is verified Successfully", "Failed to verify Total Incentive Amount(Expected result is $400.00 )", "SPGInsulationUpgrade", "TotalIncentive");
				defineLogs("12,000.0000", "12,000.0000", "12,000.0000", "Total Therms value is verified Successfully", "Failed to verify Total Therms Value(Expected Value is 100.0000 )", "SPGInsulationUpgrade", "TotalTherms");
				clickWebelement("SPGInsulationUpgrade", "Close");
				threadWait(5000);
				defineLogs("Closed - Work Completed", "Closed - Work Completed", "Closed - Work Completed", "Application Status is verified Successfully", "Failed to Verify the Application status", "SPGInsulationUpgrade", "WorkflowVerification");			
	}
	
}
