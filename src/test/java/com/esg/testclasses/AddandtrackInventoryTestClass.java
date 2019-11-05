package com.esg.testclasses;


import com.esg.utilities.HelperClass;

public class AddandtrackInventoryTestClass extends HelperClass {
	
	public static void Login() {
		login("Helper","BaseURL", 1, 0, 1, 1);
	}
	public static void AddInventoryStep() {
		ClickByActionClass("AddandTrackInventory", "MainMenu", "ESG Values", "Add and Track Inventory", 1, 1);
		explicitWaitForClickable(3000, "AddandTrackInventory", "AddInventory");
		clickWebelement("AddandTrackInventory", "AddInventory");
		//threadWait(2500);
		//explicitWait(3000, "AddandTrackInventory", "ProgramName");
		selectDropdownByVisibleText("AddandTrackInventory", "ProgramName", "ESG Values", "Add and Track Inventory", 2, 1);
		threadWait(2500);
		selectDropdownByVisibleText("AddandTrackInventory", "WareHouse", "ESG Values", "Add and Track Inventory", 3, 1);
		threadWait(2500);
		selectDropdownByVisibleText("AddandTrackInventory", "Measure", "ESG Values", "Add and Track Inventory", 4, 1);
	//	explicitWait(3000, "AddandTrackInventory", "WarrentyPeriod");
		enterTextboxValue("AddandTrackInventory", "WarrentyPeriod", "ESG Values", "Add and Track Inventory", 5, 1);
		//explicitWait(3000, "AddandTrackInventory", "SerialNumber");
		enterTextboxValue("AddandTrackInventory", "SerialNumber", "ESG Values", "Add and Track Inventory", 6, 1);
		explicitWaitForClickable(3000, "AddandTrackInventory", "Save");
		clickWebelement("AddandTrackInventory", "Save");
		explicitWait(3000, "AddandTrackInventory", "AddInventoryValidation");
		defineLogs("Inventory Tracking", "Inventory Tracking", "Inventory Tracking", "Inventory is Successfully Created", "Inventory is not Created", "AddandTrackInventory", "AddInventoryValidation");
	}
	public static void Inventorytracking() {
		//Tracking with the program name 
		//explicitWait(3000, "AddandTrackInventory", "ProgramName");
		selectDropdownByVisibleText("AddandTrackInventory", "ProgramName", "ESG Values", "Add and Track Inventory", 2, 1);
		threadWait(2500);
	//	explicitWaitForClickable(3000, "AddandTrackInventory", "SearchButton");
		clickWebelement("AddandTrackInventory", "SearchButton");
		explicitWait(3000, "AddandTrackInventory", "ResultsValidation");
		defineLogs("Inventory Tracking", "Community Solar Panel", "Community Solar Panel", "Search Results are Updated with the Program Name", "Search Results are not Updated with the Program Name", "AddandTrackInventory", "ResultsValidation");
		clickWebelement("AddandTrackInventory", "ClearButton");
		//explicitWait(3000, "AddandTrackInventory", "ProgramName");
		
		//Tracking with the Measure Name tracking
		selectDropdownByVisibleText("AddandTrackInventory", "ProgramName", "ESG Values", "Add and Track Inventory", 2, 1);
		//explicitWait(3000, "AddandTrackInventory", "MeasureTracking");
		selectDropdownByVisibleText("AddandTrackInventory", "MeasureTracking", "ESG Values", "Add and Track Inventory", 4, 1);
		clickWebelement("AddandTrackInventory", "SearchButton");
		explicitWait(3000, "AddandTrackInventory", "ResultsValidation");
		defineLogs("Inventory Tracking", "Community Solar Panel", "Community Solar Panel", "Search Results are Updated with the Measure Name", "Search Results are not Updated with the Measure Name", "AddandTrackInventory", "ResultsValidation");
		clickWebelement("AddandTrackInventory", "ClearButton");
	//	explicitWait(3000, "AddandTrackInventory", "WareHouse");
		
		//Tracking with the Warehouse name
	//	selectDropdownByVisibleText("AddandTrackInventory", "WareHouse", "ESG Values", "Add and Track Inventory", 3, 1);
		clickWebelement("AddandTrackInventory", "SearchButton");
		explicitWait(3000, "AddandTrackInventory", "UtilityWareHouse");
		defineLogs("Inventory Tracking", "Community Solar Panel", "Community Solar Panel", "Search Results are Updated with the Warehouse Name", "Search Results are not Updated with the Warehouse Name", "AddandTrackInventory", "UtilityWareHouse");
		clickWebelement("AddandTrackInventory", "ClearButton");
	//	explicitWait(3000, "AddandTrackInventory", "MeasureStatus");
		
		//Tracking with the Measure Status
		selectDropdownByVisibleText("AddandTrackInventory", "MeasureStatus", "ESG Values", "Add and Track Inventory", 7, 1);
		clickWebelement("AddandTrackInventory", "SearchButton");
		explicitWait(3000, "AddandTrackInventory", "MeasureStatusValidation");
		defineLogs("Inventory Tracking", "Community Solar Panel", "Community Solar Panel", "Search Results are Updated with the Measure Status", "Search Results are not Updated with the Measure Status", "AddandTrackInventory", "MeasureStatusValidation");
		clickWebelement("AddandTrackInventory", "ClearButton");
		//explicitWait(3000, "AddandTrackInventory", "SerialNumbertracking");
		
		//Tracking with the Serial Number
		enterTextboxValue("AddandTrackInventory", "SerialNumbertracking", "ESG Values", "Add and Track Inventory", 8, 1);
		clickWebelement("AddandTrackInventory", "SearchButton");
		explicitWait(3000, "AddandTrackInventory", "SerialNumberValidation");
		defineLogs("Inventory Tracking", "Community Solar Panel", "Community Solar Panel", "Search Results are Updated with the Serial Number", "Search Results are not Updated with the Serial Number", "AddandTrackInventory", "SerialNumberValidation");
		clickWebelement("AddandTrackInventory", "ClearButton");
		//explicitWait(3000, "AddandTrackInventory", "AccountNumber");
		
		//Tracking with the Account Number
		enterTextboxValue("AddandTrackInventory", "AccountNumber", "ESG Values", "Add and Track Inventory", 9, 1);
		clickWebelement("AddandTrackInventory", "SearchButton");
		explicitWait(3000, "AddandTrackInventory", "AccountNumberValidation");
		defineLogs("Inventory Tracking", "Community Solar Panel", "Community Solar Panel", "Search Results are Updated with the Account Number", "Search Results are not Updated with the Account Number", "AddandTrackInventory", "AccountNumberValidation");
		clickWebelement("AddandTrackInventory", "ClearButton");
		//explicitWait(3000, "AddandTrackInventory", "EnrollmentNumber");
		
		//Tracking with the Enrollment Number
		enterTextboxValue("AddandTrackInventory", "EnrollmentNumber", "ESG Values", "Add and Track Inventory", 10, 1);
		clickWebelement("AddandTrackInventory", "SearchButton");
		explicitWait(3000, "AddandTrackInventory", "EnrollmentNumberValidation");
		defineLogs("Inventory Tracking", "Community Solar Panel", "Community Solar Panel", "Search Results are Updated with the Enrollment Number", "Search Results are not Updated with the Enrollment Number", "AddandTrackInventory", "EnrollmentNumberValidation");
		clickWebelement("AddandTrackInventory", "ClearButton");
		//explicitWait(3000, "AddandTrackInventory", "PremiseID");
		
		//Tracking with the Premise ID
		enterTextboxValue("AddandTrackInventory", "PremiseID", "ESG Values", "Add and Track Inventory", 11, 1);
		clickWebelement("AddandTrackInventory", "SearchButton");
		explicitWait(3000, "AddandTrackInventory", "AccountNumberValidation");
		defineLogs("Inventory Tracking", "Community Solar Panel", "Community Solar Panel", "Search Results are Updated with the Premise ID", "Search Results are not Updated with the Premise ID", "AddandTrackInventory", "AccountNumberValidation");
		clickWebelement("AddandTrackInventory", "ClearButton");
		threadWait(2500);
		Close();
	}
}
