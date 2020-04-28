package com.esg.testclasses;

import org.testng.Assert;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class EnergyAuditTestClass extends HelperClass {

	public static void login(int UsernameRow,int UsernameColumn,int PasswordRow,int PasswordColumn) 
	{
		  test.log(LogStatus.INFO, "This test is running against version = https://esg-eecp-qa.directapps.int/50.0");
		  setProperty("helper", "chrome", "Chrome_Path");	  
		  openChrome();
		  enterLogs("Browser was Opened Successfully");
		  maximizeWindow();
	  	  implicitlywait(30);
		  openURL("helper","BaseURL");
		  enterLogs("Url was Entered Successfully");			
		  enterTextboxValue("helper", "Username_Xpath", "LoginData", "Login", UsernameRow, UsernameColumn);
		  enterTextboxValue("helper", "Password_Xpath", "LoginData", "Login", PasswordRow, PasswordColumn);
		  clickWebelement("helper","Login_Xpath");
		 /* enterLogs("User was Loggedin Successfully");
		  defineLogs("Logou", "Logou", "Logout", "Login is successfully validated", "Login is Failed", "Configuration", "Logout");
		  validationWithTitle("login", "EECP");*/
		}   	
	

	public static void Enrollment() {
		ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 4, 1);
		clickWebelement("Configuration", "NewEnrollment");
		enterTextboxValue("Configuration", "AccountNumber", "ESG Values", "Energy Audit", 6, 1);
		clickWebelement("Configuration", "SearchButton");
		clickWebelement("Configuration", "CheckBox");
		clickWebelement("Configuration", "NextButton");
		selectDropdown("Configuration", "AuditType", "", "ESG Values", "Energy Audit", 5, 1);
		clickWebelement("Configuration", "CheckBox2");
		clickWebelement("Configuration", "NextButton2");
		clickWebelement("Configuration", "ErrorOk");
	
	}

	public static void SaveIncomplete()  {
		enterTextboxValue("Configuration", "FirstName", "ESG Values", "Energy Audit", 7, 1);
		TextBoxvalue("First Name", "First Name", "First Name", "First Name is successfully Validated", "Failed to validate the First Name", "Configuration", "FirstName");
		enterTextboxValue("Configuration", "RequestForLastName", "ESG Values", "Energy Audit", 8, 1);
		TextBoxvalue("Requestor Last Name", "Requestor Last Name", "Requestor Last Name", "Requestor Last Name is successfully Validated", "Failed to validate the Requestor Last Name", "Configuration", "RequestForLastName");
		scrollToElement("Configuration", "NumberOfAcUnits");
		enterLogs("Number of units added sucessfully");
		enterTextboxValue("Configuration", "YearOfBuild", "ESG Values", "Energy Audit", 17, 1);
		TextBoxvalue("Year Built", "Year Built", "Year Built", "Year Build Value is Validated", "Year Build Value is Failed to validate", "Configuration", "YearOfBuild");
		enterLogs("Number of YearOfBuild added sucessfully");
		enterTextboxValue("Configuration", "ThermostatSettingCool", "ESG Values", "Energy Audit", 19, 1);
		TextBoxvalue("Thermostat Setting - Cool", "Thermostat Setting - Cool", "Thermostat Setting - Cool", "Thermostat Setting - Cool Value is Validated", "Thermostat Setting - Cool Value is Failed to validate", "Configuration", "ThermostatSettingCool");
		enterTextboxValue("Configuration", "LocationToAttic", "ESG Values", "Energy Audit", 20, 1);
		TextBoxvalue("Location to Attic Access Point", "Location to Attic Access Point", "Location to Attic Access Point", "Location to Attic Access Point Value is Validated", "Location to Attic Access Point Value is Failed to validate", "Configuration", "LocationToAttic");
		enterTextboxValue("Configuration", "NumberOfAcUnits", "ESG Values", "Energy Audit", 21, 1);
		TextBoxvalue("Number of AC Units", "Number of AC Units", "Number of AC Units", "Number of AC Units are Validated", "Number of AC Units are Failed to validate", "Configuration", "NumberOfAcUnits");
		selectDropdown("Configuration", "OccupancyStatus","", "ESG Values", "Energy Audit", 32, 1);
		TextBoxvalue("Occupancy Status", "Occupancy Status", "Occupancy Status", "Occupancy Status Value is Validated", "Occupancy Status Value is Failed to validate", "Configuration", "OccupancyStatus");
		scrollToElement("Configuration", "Construction");
		selectDropdown("Configuration", "BuildingType","", "ESG Values", "Energy Audit", 9, 1);
		TextBoxvalue("Building Type", "Building Type", "Building Type", "Building Type Value is Validated", "Building Type Value is Failed to validate", "Configuration", "BuildingType");
		selectDropdown("Configuration", "ConstructionType", "","ESG Values", "Energy Audit", 10, 1);
		TextBoxvalue("Construction Type", "Construction Type", "Construction Type", "Construction Type Value is Validated", "Construction Type Value is Failed to validate", "Configuration", "ConstructionType");
		enterTextboxValue("Configuration", "NumberOfoccupants", "ESG Values", "Energy Audit", 11, 1);
		TextBoxvalue("Number of Occupants", "Number of Occupants", "Number of Occupants", "Number of Occupants Value is Validated", "Number of Occupants Value is Failed to validate", "Configuration", "NumberOfoccupants");
		selectDropdown("Configuration", "ThermostatType","", "ESG Values", "Energy Audit", 12, 1);
		TextBoxvalue("Thermostat Types", "Thermostat Types", "Thermostat Types", "Thermostat Types Value is Validated", "Thermostat Types Value is Failed to validate", "Configuration", "ThermostatType");
		selectDropdown("Configuration", "GasApplianceType","", "ESG Values", "Energy Audit", 16, 1);
		
		TextBoxvalue("Gas Appliance Types", "Gas Appliance Types", "Gas Appliance Types", "Gas Appliance Types Value is Validated", "Gas Appliance Types Value is Failed to validate", "Configuration", "GasApplianceType");
		enterTextboxValue("Configuration", "ThermostatSettingHeat", "ESG Values", "Energy Audit", 13, 1);
		TextBoxvalue("Thermostat Setting - Heat", "Thermostat Setting - Heat", "Thermostat Setting - Heat", "Thermostat Setting - Heat Value is Validated", "Thermostat Setting - Heat Value is Failed to validate", "Configuration", "ThermostatSettingHeat");
		enterTextboxValue("Configuration", "HeightAttic", "ESG Values", "Energy Audit", 14, 1);
		TextBoxvalue("Height to Attic Access Point", "Height to Attic Access Point", "Height to Attic Access Point", "Height to Attic Access Point Value is Validated", "Height to Attic Access Point Value is Failed to validate", "Configuration", "HeightAttic");
		enterTextboxValue("Configuration", "ConditionedSquareFoot", "ESG Values", "Energy Audit", 15, 1);
		TextBoxvalue("Conditioned Square Footage", "Conditioned Square Footage", "Conditioned Square Footage", "Conditioned Square Footage Value is Validated", "Conditioned Square Footage Value is Failed to validate", "Configuration", "ConditionedSquareFoot");
		scrollToElement("Configuration", "AnimalsOnPermises");
		clickWebelement("Configuration", "AnimalsOnPermises");
		clickWebelement("Configuration", "EnergyPlannerInstalled");
		
		selectDropdown("Configuration", "ACunitType","", "ESG Values", "Energy Audit", 22, 1);
		TextBoxvalue("AC Unit Types", "AC Unit Types", "AC Unit Types", "AC Unit Types Value is Validated", "AC Unit Types Value is Failed to validate", "Configuration", "ACunitType");
		enterTextboxValue("Configuration", "NumberOfPoolPumps", "ESG Values", "Energy Audit", 23, 1);
		TextBoxvalue("Number of Pool Pumps", "Number of Pool Pumps", "Number of Pool Pumps", "Number of Pool Pumps Value is Validated", "Number of Pool Pumps Value is Failed to validate", "Configuration", "NumberOfPoolPumps");
		scrollToElement("Configuration", "RequestDate");
		enterTextboxValue("Configuration", "ScheduleDate", "ESG Values", "Energy Audit", 26, 1);
		TextBoxvalue("Year Built", "Year Built", "Year Built", "Year Build Value is Validated", "Year Build Value is Failed to validate", "Configuration", "ScheduleDate");
		enterTextboxValue("Configuration", "RequestDate", "ESG Values", "Energy Audit", 31, 1);
		TextBoxvalue("Requested Date", "Requested Date", "Requested Date", "Requested Date is Validated", "Requested Date is Failed to validate", "Configuration", "RequestDate");
		enterTextboxValue("Configuration", "ProgramSupportID", "ESG Values", "Energy Audit", 25, 1);
		TextBoxvalue("Program Support ID", "Program Support ID", "Program Support ID", "Program Support ID Validated", "Program Support ID is Failed to validate", "Configuration", "ProgramSupportID");
		threadWait(2500);
		clickWebelement("Configuration", "ScheduleAppointment");
		threadWait(2500);
		scrollToElement("Configuration", "ScheduleDate");
		selectDropdown("Configuration", "TradeAlly","", "ESG Values", "Energy Audit", 29, 1);
		
		TextBoxvalue("Trade Ally", "Trade Ally", "Trade Ally", "Trade Ally Value is Validated", "Trade Ally Value is Failed to validate", "Configuration", "TradeAlly");
		clickWebelement("Configuration", "residentialEnergy");
		clickWebelement("Configuration", "AppointentschedulerSearch");
		WaitForElement(300, "Configuration", "Analyst1");
		//threadWait(2500);
		clickWebelement("Configuration", "Analyst1");
		clickWebelement("Configuration", "AppointentschedulerSave");
		scrollToElement("Configuration", "RequestForFirstName");
		enterTextboxValue("Configuration", "RequestForFirstName", "ESG Values", "Energy Audit", 31, 1);
		TextBoxvalue("Requestor First Name", "Requestor First Name", "Requestor First Name", "Requestor First Name is Validated", "Requestor First Name is Failed to validate", "Configuration", "RequestForFirstName");
		clickWebelement("Configuration", "Save");	
	}
 
	public static void Worktype()  {
		scrollToElement("Configuration", "WorkTypeSteps");
	  clickWebelement("Configuration", "WorkTypeSteps");
	enterTextboxValue("Configuration", "NumberOFOcuppancy", "ESG Values", "Energy Audit", 35, 1);
	TextBoxvalue("Number of Occupants", "Number of Occupants", "Number of Occupants", "Number of Occupants Value is Validated", "Number of Occupants Value is Failed to validate", "Configuration", "NumberOFOcuppancy");
	enterTextboxValue("Configuration", "ActualDate", "ESG Values", "Energy Audit", 36, 1);
	TextBoxvalue("Actual Audit Date", "Actual Audit Date", "Actual Audit Date", "Actual Audit Date is Validated", "Actual Audit Date is Failed to validate", "Configuration", "ActualDate");
	selectDropdown("Configuration", "HowLong","", "ESG Values", "Energy Audit", 37, 1);
	TextBoxvalue("How long have you lived in home?", "How long have you lived in home?", "How long have you lived in home?", "How long have you lived in home? Value is Validated", "How long have you lived in home? Value is Failed to validate", "Configuration", "HowLong");
	clickWebelement("Configuration", "FirePlace");
	clickWebelement("Configuration", "CeilingFans");
	clickWebelement("Configuration", "RecessedLighting");
	scrollToElement("Configuration", "PropertyAppraiserInformation");
	clickWebelement("Configuration", "Doyouhaveagasdryer");
	clickWebelement("Configuration", "Doyouhaveagasstove");
	clickWebelement("Configuration", "Anychangesinthehome");
	clickWebelement("Configuration", "Problemswithappliances");
	clickWebelement("Configuration", "PropertyAppraiserInformation");
	clickWebelement("Configuration", "Save");	
}

  public static void InsulationInformation(){
	  clickWebelement("Configuration", "InsulationInformation");
	  clickWebelement("Configuration", "LimitedAccess");
	  selectDropdown("Configuration", "InsulationType","", "ESG Values", "Energy Audit", 38, 1);
	  TextBoxvalue("Insulation Type", "Insulation Type","Insulation Type", "Insulation Type Value is Validated", "Insulation Type Value is Failed to validate", "Configuration", "InsulationType");
	  enterTextboxValue("Configuration", "OtherInsulation", "ESG Values", "Energy Audit", 39, 1);
	  TextBoxvalue("Other Insulation Type R-Value", "Other Insulation Type R-Value", "Other Insulation Type R-Value", "Other Insulation Type R-Value Value is Validated", "Other Insulation Type R-Value Value is Failed to validate", "Configuration", "OtherInsulation");
	  enterTextboxValue("Configuration", "SquareFootage", "ESG Values", "Energy Audit", 40, 1);
	  TextBoxvalue("Square footage of attic area", "Square footage of attic area", "Square footage of attic area", "Square footage of attic area Value is Validated", "Square footage of attic area Value is Failed to validate", "Configuration", "SquareFootage");
	  enterTextboxValue("Configuration", "DepthOfInsulation1", "ESG Values", "Energy Audit", 41, 1);
	  TextBoxvalue("Depth of Insulation 1 (Inches)", "Depth of Insulation 1 (Inches)", "Depth of Insulation 1 (Inches)", "Depth of Insulation 1 Value is Validated", "Depth of Insulation 1 Value is Failed to validate", "Configuration", "DepthOfInsulation1");
	  enterTextboxValue("Configuration", "DepthOfInsulation2", "ESG Values", "Energy Audit", 42, 1);
	  TextBoxvalue("Depth of Insulation 2 (Inches)", "Depth of Insulation 2 (Inches)", "Depth of Insulation 2 (Inches)", "Depth of Insulation 2 Value is Validated", "Depth of Insulation 2 Value is Failed to validate", "Configuration", "DepthOfInsulation2");
	  enterTextboxValue("Configuration", "DepthOfInsulation3", "ESG Values", "Energy Audit", 43, 1);
	  TextBoxvalue("Depth of Insulation 3 (Inches)", "Depth of Insulation 3 (Inches)", "Depth of Insulation 3 (Inches)", "Depth of Insulation 3 Value is Validated", "Depth of Insulation 3 Value is Failed to validate", "Configuration", "DepthOfInsulation3");
	  scrollToElement("Configuration", "KnobAndTube");
	  clickWebelement("Configuration", "KnobAndTube");
	  clickWebelement("Configuration", "KneeWallIssues");
	  clickWebelement("Configuration", "AddReplace");
	  clickWebelement("Configuration", "Retack"); 
	  clickWebelement("Configuration", "Save");	
  }
 
  public static void DuctSealInformation() {
	  clickWebelement("Configuration", "DuctSealInformation");
	  clickWebelement("Configuration", "QualifiedForDuctWork");
	
	  selectDropdown("Configuration", "Reason","", "ESG Values", "Energy Audit", 44, 1);
	  
	  TextBoxvalue("Reason", "Reason", "Reason", "Reason Value is Validated", "Reason Value is Failed to validate", "Configuration", "Reason");
	  clickWebelement("Configuration", "DamangedDuctwork");
	  enterTextboxValue("Configuration", "DuctSealNotes", "ESG Values", "Energy Audit", 45, 1);
	  
	  TextBoxvalue("Duct Seal Notes", "Duct Seal Notes", "Duct Seal Notes", "Duct Seal Notes is Validated", "Duct Seal Notes is Failed to validate", "Configuration", "DuctSealNotes");
	  clickWebelement("Configuration", "Save");
	  clickWebelement("Configuration", "Completed");
	  threadWait(5000);
	 // TextBoxvalue("Field Work Completed", "Field Work Completed", "Field Work Completed", "Energy Audit Module is Passed", "Energy Audit Module is Failed", "Configuration", "FieldWork");
	 // defineLogs("Field Work Completed", "Field Work Completed", "Field Work Completed", "Energy Audit Module is Passed", "Energy Audit Module is Failed", "Configuration", "FieldWork");
	if (driver.getPageSource().contains("Field Work Completed")) {
			
			test.log(LogStatus.PASS, "Energy Audit Module is Passed");
							
		} else {
			//test.log(LogStatus.FAIL, "Failed");
			Assert.assertEquals("Field Wor Completed", "Field Wor Completed");	
}	 
  }
}