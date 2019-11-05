package com.esg.testclasses;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class ProgramLevelEligibilityTestClass extends HelperClass {

public static void OpenOnlineApplication() {
		setProperty("helper", "chrome", "Chrome_Path");
		openChrome();
		openURL("helper", "OnlineApplication");
		maximizeWindow();
	}
	
public static void login(int UsernameRow,int UsernameColumn,int PasswordRow,int PasswordColumn) 
{
	  openURL("helper","BaseURL");
	  enterLogs("Url was Entered Successfully");			
	  enterTextboxValue("helper", "Username_Xpath", "LoginData", "Login", UsernameRow, UsernameColumn);
	  enterTextboxValue("helper", "Password_Xpath", "LoginData", "Login", PasswordRow, PasswordColumn);
	  clickWebelement("helper","Login_Xpath");
	  enterLogs("User was Loggedin Successfully");
	  if (driver.getPageSource().contains("Logout")) {
		
		  test.log(LogStatus.PASS, "Login is successful");
	} else {

		test.log(LogStatus.FAIL, "Login is Failed");
		Assert.assertEquals("Logout", "Logout");
	}
	  
	}   	

public static void Enrollment() {
	ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Program Level", 9, 1);
	clickWebelement("Configuration", "NewEnrollment");
	enterTextboxValue("ProgramLevel", "SelectProgram", "ESG Values", "Program Level", 10, 1);
	threadWait(5000);
	clickWebelement("ProgramLevel", "NextButton");
}


	
	public static void EsgLoginCustomer() {
		OpenBrowser("helper","BaseURL");
		login(1, 0, 1, 1);
		ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Program Level", 9, 1);
		clickWebelement("Configuration", "NewEnrollment");
		enterTextboxValue("ProgramLevel", "SelectProgram", "Esg Values", "Program Level", 21, 1);
		threadWait(2000);
		clickWebelement("ProgramLevel", "NextButton");
	}
	
		public static void Online() {
			
		OpenOnlineApplication();
		threadWait(5000);
		clickWebelement("ProgramLevel", "AccountHolder");
		enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 2, 1);
		enterLogs("Account number: 90000710001 is entered successfully");
		clickWebelement("ProgramLevel", "Next");
		defineLogs("Warning", "Account Class (Commercial) is not eligible for this program", "Account Class (Commercial) is not eligible for this program", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
		clickWebelement("ProgramLevel", "Alert");
		clearWebelement("ProgramLevel", "AccountNumber");
		
		//Account Number = 2
		clickWebelement("ProgramLevel", "AccountHolder");
		enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 3, 1);
		enterLogs("Account number: 90000720001 is entered successfully");
		clickWebelement("ProgramLevel", "Next");
		defineLogs("Warning", "Account Status (INACTIVE) is not eligible for this program", "Account Status (INACTIVE) is not eligible for this program", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
		clickWebelement("ProgramLevel", "Alert");
		clearWebelement("ProgramLevel", "AccountNumber");
		
		//Account Number = 3
		clickWebelement("ProgramLevel", "AccountHolder");
		enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 4, 1);
		enterLogs("Account number: 90000730001 is entered successfully");
		clickWebelement("ProgramLevel", "Next");
		Validation("MultiFamily");
		clickWebelement("ProgramLevel", "BackButton");
		clearWebelement("ProgramLevel", "AccountNumber");

		//Account Number = 4
		clickWebelement("ProgramLevel", "AccountHolder");
		enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 5, 1);
		enterLogs("Account number: 90000740001 is entered successfully");
		clickWebelement("ProgramLevel", "Next");
		defineLogs("Warning", "This account is not eligible for this program, as it does not have any Active Electric services", "This account is not eligible for this program, as it does not have any Active Electric services", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
		clickWebelement("ProgramLevel", "Alert");
		clearWebelement("ProgramLevel", "AccountNumber");
		
		//Account Number = 5
		clickWebelement("ProgramLevel", "AccountHolder");
		enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 6, 1);
		enterLogs("Account number: 90000750001 is entered successfully");
		clickWebelement("ProgramLevel", "Next");
		defineLogs("Warning", "The account was not on an eligible rate", "The account was not on an eligible rate", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
		clickWebelement("ProgramLevel", "Alert");
		clearWebelement("ProgramLevel", "AccountNumber");
	}
		
		public static void BackendOnlineApplication() {
		
	//Application Number = 1
		login(1, 0, 1, 1);
		Enrollment();
		threadWait(5000);
		SwitchToFrame("ProgramLevel", "SwitchTo");
		
		threadWait(5000);
		clickWebelement("ProgramLevel", "AccountHolder");
		threadWait(2500);
		enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 11, 1);
		enterLogs("Account number: 90000710001 is entered successfully");
		clickWebelement("ProgramLevel", "Next");
		defineLogs("Warning", "Account Class (Commercial) is not eligible for this program", "Account Class (Commercial) is not eligible for this program", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
		clickWebelement("ProgramLevel", "Alert");
		clearWebelement("ProgramLevel", "AccountNumber");
		
	//Application Number = 2
		clickWebelement("ProgramLevel", "AccountHolder");
		enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 12, 1);
		enterLogs("Account number: 90000720001 is entered successfully");
		clickWebelement("ProgramLevel", "Next");
		defineLogs("Warning", "Account Status (INACTIVE) is not eligible for this program", "Account Status (INACTIVE) is not eligible for this program", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
		clickWebelement("ProgramLevel", "Alert");
		clearWebelement("ProgramLevel", "AccountNumber");
		
		//Application Number = 3
			clickWebelement("ProgramLevel", "AccountHolder");
			enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 13, 1);
			enterLogs("Account number: 90000730001 is entered successfully");
			clickWebelement("ProgramLevel", "Next");
			clickWebelement("ProgramLevel", "BackButton");
			clearWebelement("ProgramLevel", "AccountNumber");
				
				//Application Number = 4	
				clickWebelement("ProgramLevel", "AccountHolder");
				enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 14, 1);
				enterLogs("Account number: 90000740001 is entered successfully");
				clickWebelement("ProgramLevel", "Next");
				defineLogs("Warning", "This account is not eligible for this program, as it does not have any Active Electric services", "This account is not eligible for this program, as it does not have any Active Electric services", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
				clickWebelement("ProgramLevel", "Alert");
				clearWebelement("ProgramLevel", "AccountNumber");
			
				//Application Number = 5	
				clickWebelement("ProgramLevel", "AccountHolder");
				enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 15, 1);
				enterLogs("Account number: 90000750001 is entered successfully");
				clickWebelement("ProgramLevel", "Next");
				defineLogs("Warning", "The account was not on an eligible rate", "The account was not on an eligible rate", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
				clickWebelement("ProgramLevel", "Alert");
				clearWebelement("ProgramLevel", "AccountNumber");
				
				//Application Number = 6	
				clickWebelement("ProgramLevel", "AccountHolder");
				enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 16, 1);
				enterLogs("Account number: 90000880001 is entered successfully");
				clickWebelement("ProgramLevel", "Next");
				defineLogs("Warning", "Account Class (Commercial & Industrial) is not eligible for this program.", "Account Class (Commercial & Industrial) is not eligible for this program.", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
				captureScreen(driver, "Backend Online Application 6");
				clickWebelement("ProgramLevel", "Alert");
				clearWebelement("ProgramLevel", "AccountNumber");
				
				//Application Number = 7	
				clickWebelement("ProgramLevel", "AccountHolder");
				enterTextboxValue("ProgramLevel", "AccountNumber", "Esg Values", "Program Level", 17, 1);
				enterLogs("Account number: 90000890001 is entered successfully");
				clickWebelement("ProgramLevel", "Next");
				defineLogs("Warning", "Account Class (Commercial & Industrial) is not eligible for this program.", "Account Class (Commercial & Industrial) is not eligible for this program.", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame");
				threadWait(2500);
				clickWebelement("ProgramLevel", "Alert");
				clearWebelement("ProgramLevel", "AccountNumber");
				Close();
	}
	public static void BackendWithCustomer() throws AWTException{
		//Account Number = 1 
		EsgLoginCustomer();
		enterTextboxValue("ProgramLevel", "AccountSearch", "Esg Values", "Program Level", 22, 1);
		clickWebelement("ProgramLevel", "Go");
		//threadWait(3500);
		explicitWaitForClickable(30, "ProgramLevel", "CustomerName");
		doubleClickWebelement("ProgramLevel", "CustomerName");
		threadWait(2500);
		ReadPopUp();
		threadWait(2500);
		clearWebelement("ProgramLevel", "AccountSearch");
		
		//Account Number = 2
		enterTextboxValue("ProgramLevel", "AccountSearch", "Esg Values", "Program Level", 23, 1);
		clickWebelement("ProgramLevel", "Go");
		//threadWait(3500);
		explicitWaitForClickable(30, "ProgramLevel", "CustomerName");
		doubleClickWebelement("ProgramLevel", "CustomerName");
		captureScreen(driver, "BackendWithCustomer2");
		threadWait(2500);
		ReadPopUp();
		clearWebelement("ProgramLevel", "AccountSearch");

		//Account Number = 3
		enterTextboxValue("ProgramLevel", "AccountSearch", "Esg Values", "Program Level", 24, 1);
		clickWebelement("ProgramLevel", "Go");
		//threadWait(3500);
		explicitWaitForClickable(30, "ProgramLevel", "CustomerName");
		doubleClickWebelement("ProgramLevel", "CustomerName");
		captureScreen(driver,"BackendWithCustomer3");
		threadWait(2500);
		ReadPopUp();
		clearWebelement("ProgramLevel", "AccountSearch");
		
		//Account Number = 4
		enterTextboxValue("ProgramLevel", "AccountSearch", "Esg Values", "Program Level", 25, 1);
		clickWebelement("ProgramLevel", "Go");
		//threadWait(3500);
		explicitWaitForClickable(30, "ProgramLevel", "CustomerName");
		doubleClickWebelement("ProgramLevel", "CustomerName");
		captureScreen(driver,"BackendWithCustomer4");
		threadWait(2500);
		ReadPopUp();
		clearWebelement("ProgramLevel", "AccountSearch");
		
		//Account Number = 5
				enterTextboxValue("ProgramLevel", "AccountSearch", "Esg Values", "Program Level", 26, 1);
				clickWebelement("ProgramLevel", "Go");
				//threadWait(3500);
				explicitWaitForClickable(30, "ProgramLevel", "CustomerName");
				doubleClickWebelement("ProgramLevel", "CustomerName");
				captureScreen(driver,"BackendWithCustomer5");
				threadWait(2500);
				ReadPopUp();
				clearWebelement("ProgramLevel", "AccountSearch");
		
				//Account Number = 6
				enterTextboxValue("ProgramLevel", "AccountSearch", "Esg Values", "Program Level", 27, 1);
				clickWebelement("ProgramLevel", "Go");
				explicitWaitForClickable(30, "ProgramLevel", "CustomerName");
				doubleClickWebelement("ProgramLevel", "CustomerName");
				captureScreen(driver,"BackendWithCustomer6");
				threadWait(2500);
				ReadPopUp();
				clearWebelement("ProgramLevel", "AccountSearch");
				
				//Account Number = 7
				enterTextboxValue("ProgramLevel", "AccountSearch", "Esg Values", "Program Level", 28, 1);
				clickWebelement("ProgramLevel", "Go");
				//threadWait(5000);
				explicitWaitForClickable(30, "ProgramLevel", "CustomerName");
				doubleClickWebelement("ProgramLevel", "CustomerName");
				threadWait(2500);
				ReadPopUp();
				Close();
				driver.quit();
	}
	public static void BackendWithoutCustomer() throws InterruptedException, AWTException {
	EsgLoginCustomer();
		threadWait(2500);
		clickWebelement("ProgramLevel", "Skip");
		enterTextboxValue("ProgramLevel", "AccountNmr", "Esg Values", "Program Level", 22, 1);
		clickWebelement("ProgramLevel", "Search");
		Validation("Would you like to overwrite the Customer Information with the selected Account?");
		ValidateWithElement("ProgramLevel", "WarningFrame2", "Overwrite Customer", "Would you like to overwrite the Customer Information with the selected Account?", "Would you like to overwrite the Customer Information with the selected Account?", "Warning message is Validated", "Failed to validate the Warning message");
		//defineLogs("Overwrite Customer", "Would you like to overwrite the Customer Information with the selected Account?", "Would you like to overwrite the Customer Information with the selected Account?", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame2");
		clickWebelement("ProgramLevel", "Yes");
		Validation("Would you like to update the address information with the information from the premise record?");
		threadWait(2500);
		clickWebelement("ProgramLevel", "Yes1");
		clickWebelement("ProgramLevel", "Cancel");
		clickWebelement("ProgramLevel", "Save1");
		threadWait(2500);
		Clear("ProgramLevel", "AccountNmr");
		
		/*//Account Number = 2 
		
		threadWait(2500);
		enterTextboxValue("ProgramLevel", "AccountNmr", "Esg Values", "Program Level", 23, 1);
		clickWebelement("ProgramLevel", "Search");
		Validation("Would you like to overwrite the Customer Information with the selected Account?");
		defineLogs("Overwrite Customer", "Would you like to overwrite the Customer Information with the selected Account?", "Would you like to overwrite the Customer Information with the selected Account?", "Warning message is Validated", "Failed to validate the Warning message", "ProgramLevel", "WarningFrame1");
		//captureScreen(driver, "BackendWithOutCustomer2");
		clickWebelement("ProgramLevel", "Yes");
		Validation("Would you like to update the address information with the information from the premise record?");
		//captureScreen(driver, "BackendWithOutCustomer_2");
		threadWait(2500);
		clickWebelement("ProgramLevel", "Yes1");
		clickWebelement("ProgramLevel", "Cancel");
		clickWebelement("ProgramLevel", "Save1");
		threadWait(2500);
		Clear("ProgramLevel", "AccountNmr");
		
		//Account Number = 3
		
		threadWait(2500);
		enterTextboxValue("ProgramLevel", "AccountNmr", "Esg Values", "Program Level", 24, 1);
		clickWebelement("ProgramLevel", "Search");
		Validation("Would you like to overwrite the Customer Information with the selected Account?");
		clickWebelement("ProgramLevel", "Yes");
		Validation("Would you like to update the address information with the information from the premise record?");
		threadWait(2500);
		clickWebelement("ProgramLevel", "Yes1");
		clickWebelement("ProgramLevel", "Cancel");
		clickWebelement("ProgramLevel", "Save1");
		Enter(KeyEvent.VK_ESCAPE);
		threadWait(2500);;
		Clear("ProgramLevel", "AccountNmr");
		
		//Account Number = 4
		threadWait(2500);
		enterTextboxValue("ProgramLevel", "AccountNmr", "Esg Values", "Program Level", 25, 1);
		clickWebelement("ProgramLevel", "Search");
		Validation("Would you like to overwrite the Customer Information with the selected Account?");
		clickWebelement("ProgramLevel", "Yes");
		Validation("Would you like to update the address information with the information from the premise record?");
		threadWait(2500);
		clickWebelement("ProgramLevel", "Yes1");
		clickWebelement("ProgramLevel", "Cancel");
		clickWebelement("ProgramLevel", "Save1");
		threadWait(2500);
		Clear("ProgramLevel", "AccountNmr");
		
		//Account Number = 5
		threadWait(2500);
		enterTextboxValue("ProgramLevel", "AccountNmr", "Esg Values", "Program Level", 26, 1);
		clickWebelement("ProgramLevel", "Search");
		Validation("Would you like to overwrite the Customer Information with the selected Account?");
		clickWebelement("ProgramLevel", "Yes");
		Validation("Would you like to update the address information with the information from the premise record?");
		threadWait(2500);
		clickWebelement("ProgramLevel", "Yes1");
		clickWebelement("ProgramLevel", "Cancel");
		clickWebelement("ProgramLevel", "Save1");
		threadWait(2500);
		Clear("ProgramLevel", "AccountNmr");

		//Account Number = 6
		threadWait(2500);
		enterTextboxValue("ProgramLevel", "AccountNmr", "Esg Values", "Program Level", 27, 1);
		clickWebelement("ProgramLevel", "Search");
		Validation("Would you like to overwrite the Customer Information with the selected Account?");
		clickWebelement("ProgramLevel", "Yes");
		Validation("Would you like to update the address information with the information from the premise record?");
		threadWait(2500);
		clickWebelement("ProgramLevel", "Yes1");
		clickWebelement("ProgramLevel", "Cancel");
		clickWebelement("ProgramLevel", "Save1");
		threadWait(2500);
		Clear("ProgramLevel", "AccountNmr");
		
		//Account Number = 7
		threadWait(2500);
		enterTextboxValue("ProgramLevel", "AccountNmr", "Esg Values", "Program Level", 28, 1);
		clickWebelement("ProgramLevel", "Search");
		Validation("Would you like to overwrite the Customer Information with the selected Account?");
		clickWebelement("ProgramLevel", "Yes");
		Validation("Would you like to update the address information with the information from the premise record?");
		threadWait(2500);
		clickWebelement("ProgramLevel", "Yes1");
		clickWebelement("ProgramLevel", "Cancel");
		clickWebelement("ProgramLevel", "Save1");
		threadWait(2500);
		Clear("ProgramLevel", "AccountNmr");
		Close();*/
		
	}

}



