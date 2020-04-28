package com.esg.testclasses;



import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;



public class Benchmarking_TestClass extends HelperClass {
	
	public static void Login() {
		OpenBrowser("BenchMarking", "PortfolioManagerUrl");
		enterTextboxValue("BenchMarking", "Username", "ESG Values", "BenchMarking", 1, 1);
		enterTextboxValue("BenchMarking", "Password", "ESG Values", "BenchMarking", 2, 1);
		clickWebelement("BenchMarking", "SignInButton");
		String Value = Xpath("BenchMarking", "LoginValidation").getText();
		test.log(LogStatus.INFO, "Login is Successfully Validated with Login Name =" + Value);
	}
	
	public static void Property1_Commercial() {
		
		//Navigating to the property commercial Page
		clickWebelement("BenchMarking", "Property1");
		WaitForElement(300, "BenchMarking", "EnergyTab");
		//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
		clickWebelement("BenchMarking", "EnergyTab");
		
		//Adding the properties
		clickWebelement("BenchMarking", "AddMeterButton");
		WaitForElement(300, "BenchMarking", "DieselCheckOption");
		//explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
		clickWebelement("BenchMarking", "DieselCheckOption");
		scrollToElement("BenchMarking", "GetStarted");
		clickWebelement("BenchMarking", "GetStarted");
		
		//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
		//explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
		WaitForElement(300, "BenchMarking", "SelectCheckBox");
		clickWebelement("BenchMarking", "SelectCheckBox");
		selectDropdown("BenchMarking", "Units","", "ESG Values", "BenchMarking", 3, 1);
		
		//selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
		clickWebelement("BenchMarking", "DateMeterBecameActive");
		clickWebelement("BenchMarking", "ActiveDate");
		clickWebelement("BenchMarking", "CreateMeter");
		explicitWait(3000, "BenchMarking", "NotifyMessage");
		
		//Meters have been created!
		validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
		scrollToElement("BenchMarking", "ContinueButton");
		clickWebelement("BenchMarking", "ContinueButton");
		
		//Meter entries have been added to your meters!
		WaitForElement(300, "BenchMarking", "MyPortfolio");
		//explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
		clickWebelement("BenchMarking", "MyPortfolio");
		clickWebelement("BenchMarking", "Property1");
		WaitForElement(300, "BenchMarking", "EnergyTab");
		//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
		clickWebelement("BenchMarking", "EnergyTab");
		scrollToElement("BenchMarking", "DeleteDieselLink");
		clickWebelement("BenchMarking", "DeleteDieselLink");
		
		//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
		threadWait(3000);
		clickWebelement("BenchMarking", "BasicMeasureInfo");
		WaitForElement(300, "BenchMarking", "DeleteMeter");
		//explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
		clickWebelement("BenchMarking", "DeleteMeter");
		clickWebelement("BenchMarking", "DeleteConfirmation");
		validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
		clickWebelement("BenchMarking", "HomePage");
	}
		public static void Property2_ComRes1() {
		
		//Navigating to the property commercial Page
		clickWebelement("BenchMarking", "Property2");
		WaitForElement(300, "BenchMarking", "EnergyTab");
		
		//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
		clickWebelement("BenchMarking", "EnergyTab");
		
		//Adding the properties
		clickWebelement("BenchMarking", "AddMeterButton");
		
		WaitForElement(300, "BenchMarking", "DieselCheckOption");
		//explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
		clickWebelement("BenchMarking", "DieselCheckOption");
		scrollToElement("BenchMarking", "GetStarted");
		clickWebelement("BenchMarking", "GetStarted");
		
		//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
		WaitForElement(300, "BenchMarking", "SelectCheckBox");
		//explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
		clickWebelement("BenchMarking", "SelectCheckBox");
		selectDropdown("BenchMarking", "Units","", "ESG Values", "BenchMarking", 3, 1);
		
		//selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
		clickWebelement("BenchMarking", "DateMeterBecameActive");
		clickWebelement("BenchMarking", "ActiveDate");
		clickWebelement("BenchMarking", "CreateMeter");
		WaitForElement(300, "BenchMarking", "NotifyMessage");
	//	explicitWait(3000, "BenchMarking", "NotifyMessage");
		
		//Meters have been created!
		validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
		scrollToElement("BenchMarking", "ContinueButton");
		clickWebelement("BenchMarking", "ContinueButton");
		
		//Meter entries have been added to your meters!
		WaitForElement(300, "BenchMarking", "MyPortfolio");
		//explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
		clickWebelement("BenchMarking", "MyPortfolio");
		clickWebelement("BenchMarking", "Property2");
		WaitForElement(300, "BenchMarking", "EnergyTab");
		//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
		clickWebelement("BenchMarking", "EnergyTab");
		scrollToElement("BenchMarking", "DeleteDieselLink");
		clickWebelement("BenchMarking", "DeleteDieselLink");
		
		//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
		threadWait(3000);
		clickWebelement("BenchMarking", "BasicMeasureInfo");
		WaitForElement(300, "BenchMarking", "DeleteMeter");
		//explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
		clickWebelement("BenchMarking", "DeleteMeter");
		clickWebelement("BenchMarking", "DeleteConfirmation");
		validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
		clickWebelement("BenchMarking", "HomePage");
	}
		public static void Property3_ComRes2() {
			
			//Navigating to the property commercial Page
			clickWebelement("BenchMarking", "Property3");
			WaitForElement(300, "BenchMarking", "EnergyTab");
			//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
			clickWebelement("BenchMarking", "EnergyTab");
			
			//Adding the properties
			clickWebelement("BenchMarking", "AddMeterButton");
			WaitForElement(300, "BenchMarking", "DieselCheckOption");
			//explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
			clickWebelement("BenchMarking", "DieselCheckOption");
			scrollToElement("BenchMarking", "GetStarted");
			clickWebelement("BenchMarking", "GetStarted");
			
			//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
			WaitForElement(300, "BenchMarking", "SelectCheckBox");
			//explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
			clickWebelement("BenchMarking", "SelectCheckBox");
			selectDropdown("BenchMarking", "Units","", "ESG Values", "BenchMarking", 3, 1);
			
			//selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
			clickWebelement("BenchMarking", "DateMeterBecameActive");
			clickWebelement("BenchMarking", "ActiveDate");
			clickWebelement("BenchMarking", "CreateMeter");
			WaitForElement(300, "BenchMarking", "NotifyMessage");
			//explicitWait(3000, "BenchMarking", "NotifyMessage");
			
			//Meters have been created!
			validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
			scrollToElement("BenchMarking", "ContinueButton");
			clickWebelement("BenchMarking", "ContinueButton");
			
			//Meter entries have been added to your meters!
			WaitForElement(300, "BenchMarking", "MyPortfolio");
			//explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
			clickWebelement("BenchMarking", "MyPortfolio");
			clickWebelement("BenchMarking", "Property3");
			WaitForElement(300, "BenchMarking", "EnergyTab");
			//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
			clickWebelement("BenchMarking", "EnergyTab");
			scrollToElement("BenchMarking", "DeleteDieselLink");
			clickWebelement("BenchMarking", "DeleteDieselLink");
			
			//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
			threadWait(3000);
			clickWebelement("BenchMarking", "BasicMeasureInfo");
			WaitForElement(300, "BenchMarking", "DeleteMeter");
			//explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
			clickWebelement("BenchMarking", "DeleteMeter");
			clickWebelement("BenchMarking", "DeleteConfirmation");
			validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
			clickWebelement("BenchMarking", "HomePage");
		}
		
			public static void Property4_UnverifiedAddress() {
			
			//Navigating to the property commercial Page
			scrollToElement("BenchMarking", "Property4");
			clickWebelement("BenchMarking", "Property4");
			WaitForElement(300, "BenchMarking", "EnergyTab");
			//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
			clickWebelement("BenchMarking", "EnergyTab");
			
			//Adding the properties
			clickWebelement("BenchMarking", "AddMeterButton");
			WaitForElement(300, "BenchMarking", "DieselCheckOption");
			//explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
			clickWebelement("BenchMarking", "DieselCheckOption");
			scrollToElement("BenchMarking", "GetStarted");
			clickWebelement("BenchMarking", "GetStarted");
			
			//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
			WaitForElement(300, "BenchMarking", "SelectCheckBox");
			//explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
			clickWebelement("BenchMarking", "SelectCheckBox");
			selectDropdown("BenchMarking", "Units","", "ESG Values", "BenchMarking", 3, 1);
			
			//selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
			clickWebelement("BenchMarking", "DateMeterBecameActive");
			clickWebelement("BenchMarking", "ActiveDate");
			clickWebelement("BenchMarking", "CreateMeter");
			WaitForElement(300, "BenchMarking", "NotifyMessage");
			//explicitWait(3000, "BenchMarking", "NotifyMessage");
			
			//Meters have been created!
			validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
			scrollToElement("BenchMarking", "ContinueButton");
			clickWebelement("BenchMarking", "ContinueButton");
			
			//Meter entries have been added to your meters!
			WaitForElement(300, "BenchMarking", "MyPortfolio");
			//explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
			clickWebelement("BenchMarking", "MyPortfolio");
			clickWebelement("BenchMarking", "Property4");
			WaitForElement(300, "BenchMarking", "EnergyTab");
			//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
			clickWebelement("BenchMarking", "EnergyTab");
			scrollToElement("BenchMarking", "DeleteDieselLink");
			clickWebelement("BenchMarking", "DeleteDieselLink");
			
			//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
			threadWait(3000);
			clickWebelement("BenchMarking", "BasicMeasureInfo");
			WaitForElement(300, "BenchMarking", "DeleteMeter");
		//	explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
			clickWebelement("BenchMarking", "DeleteMeter");
			clickWebelement("BenchMarking", "DeleteConfirmation");
			validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
			clickWebelement("BenchMarking", "HomePage");
		}
			
			public static void Property5_Appartmentcampus() {
				
				//Navigating to the property commercial Page
				scrollToElement("BenchMarking", "Property5");
				clickWebelement("BenchMarking", "Property5");
				WaitForElement(300, "BenchMarking", "EnergyTab");
				//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
				clickWebelement("BenchMarking", "EnergyTab");
				
				//Adding the properties
				clickWebelement("BenchMarking", "AddMeterButton");
				WaitForElement(300, "BenchMarking", "DieselCheckOption");
				//explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
				clickWebelement("BenchMarking", "DieselCheckOption");
				scrollToElement("BenchMarking", "GetStarted");
				clickWebelement("BenchMarking", "GetStarted");
				
				//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
				WaitForElement(300, "BenchMarking", "SelectCheckBox");
				//explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
				clickWebelement("BenchMarking", "SelectCheckBox");
				selectDropdown("BenchMarking", "Units","", "ESG Values", "BenchMarking", 3, 1);
				
				//selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
				clickWebelement("BenchMarking", "DateMeterBecameActive");
				clickWebelement("BenchMarking", "ActiveDate");
				clickWebelement("BenchMarking", "CreateMeter");
				WaitForElement(300, "BenchMarking", "NotifyMessage");
				//explicitWait(3000, "BenchMarking", "NotifyMessage");
				
				//Meters have been created!
				validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
				scrollToElement("BenchMarking", "ContinueButton");
				clickWebelement("BenchMarking", "ContinueButton");
				
				//Meter entries have been added to your meters!
				WaitForElement(300, "BenchMarking", "MyPortfolio");
				//explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
				clickWebelement("BenchMarking", "MyPortfolio");
				clickWebelement("BenchMarking", "Property5");
				WaitForElement(300, "BenchMarking", "EnergyTab");
				//explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
				clickWebelement("BenchMarking", "EnergyTab");
				scrollToElement("BenchMarking", "DeleteDieselLink");
				clickWebelement("BenchMarking", "DeleteDieselLink");
				
				//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
				threadWait(3000);
				clickWebelement("BenchMarking", "BasicMeasureInfo");
				WaitForElement(300, "BenchMarking", "DeleteMeter");
			//	explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
				clickWebelement("BenchMarking", "DeleteMeter");
				clickWebelement("BenchMarking", "DeleteConfirmation");
				validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
				clickWebelement("BenchMarking", "HomePage");
				driver.close();
			}
			public static void EECP_PortfolioConfig() {
				login("helper", "BaseURL", 1, 0, 1, 1);
				ClickByActionClass("BenchMarking", "Configuration", "ESG Values", "BenchMarking", 8, 1);
				validationWithWebelement("BenchMarking", "SystemConfigurationValidation", "Successfully navigated to System Configuration Page", "Failed to navigated to System Configuration Page");
				scrollToElement("BenchMarking", "PortfolioManagerConfig");
				clickWebelement("BenchMarking", "PortfolioManagerConfig");
				clearWebelement("BenchMarking", "PortUsername");
				threadWait(2500);
				enterTextboxValue("BenchMarking", "PortUsername", "ESG Values", "BenchMarking", 9, 1);
				clearWebelement("BenchMarking", "PortPassword");
				threadWait(2500);
				enterTextboxValue("BenchMarking", "PortPassword", "ESG Values", "BenchMarking", 10, 1);
				HandleErrorCodeOnSave("helper", "SaveButton", "");
				
			//	clickonSave();
			}
			public static void Verify_Last_Bill_Amount() {
				login("helper", "BaseURL", 1, 0, 1, 1);
				openURL("BenchMarking", "BiilingServiceUrl");
				clearWebelement("BenchMarking", "ServiceAccountNumber");
				enterTextboxValue("BenchMarking", "ServiceAccountNumber", "ESG Values", "BenchMarking", 12, 1);
				clickWebelement("BenchMarking", "GetLastBillAmountButton");
				VerifyElementForExistingValueWithAttribute("BenchMarking", "LastBillAmount", "ESG Values", "BenchMarking", 13, 1);
			}
			/*public static void BenchMarkingOnline1() {
				openURL("BenchMarking", "BenchmarkingOnline1Url");
				clearWebelement("BenchMarking", "ServiceAccountNumber");
				enterTextboxValue("BenchMarking", "ServiceAccountNumber", "ESG Values", "BenchMarking", 12, 1);
				clickWebelement("BenchMarking", "GetLastBillAmountButton");
				VerifyElementForExistingValueWithText("BenchMarking", "LastBillAmount", "ESG Values", "BenchMarking", 13, 1);
			}*/
			public static void BenchmarkingDataRequestPortal() {
				
				openURL("BenchMarking", "BecnhmarkingOnlineUrl2");
				//Getting Started Tab
				clickWebelement("BenchMarking", "BuildingOwner");
				clickWebelement("BenchMarking", "NextButton");
				
				//Customer Information tab
				WaitForElement(300, "BenchMarking", "FirstName");
				//explicitWait(300, "BenchMarking", "FirstName");
				enterTextboxValue("BenchMarking", "FirstName", "ESG Values", "BenchMarking", 16, 1);
				enterTextboxValue("BenchMarking", "LastName", "ESG Values", "BenchMarking", 17, 1);
				enterTextboxValue("BenchMarking", "PrimaryPhone", "ESG Values", "BenchMarking", 18, 1);
				enterTextboxValue("BenchMarking", "EmailAddress", "ESG Values", "BenchMarking", 19, 1);
				enterTextboxValue("BenchMarking", "Street", "ESG Values", "BenchMarking", 20, 1);
				enterTextboxValue("BenchMarking", "ZipCode", "ESG Values", "BenchMarking", 22, 1);
				enterTextboxValue("BenchMarking", "City", "ESG Values", "BenchMarking", 23, 1);
				enterTextboxValue("BenchMarking", "State", "ESG Values", "BenchMarking", 24, 1);
				enterTextboxValue("BenchMarking", "Organization", "ESG Values", "BenchMarking", 21, 1);
				scrollToElement("BenchMarking", "NextButton");
				clickWebelement("BenchMarking", "NextButton");
				
				//Building Information Tab
				WaitForElement(300, "BenchMarking", "PortfolioManagerUsername");
				//explicitWait(3000, "BenchMarking", "PortfolioManagerUsername");
				enterTextboxValue("BenchMarking", "PortfolioManagerUsername", "ESG Values", "BenchMarking", 27, 1);
				
				selectDropdown("BenchMarking", "RequestType","", "ESG Values", "BenchMarking", 28, 1);
				selectDropdown("BenchMarking", "RequestFrequency","", "ESG Values", "BenchMarking", 29, 1);
				selectDropdown("BenchMarking", "DeliveryMethod","", "ESG Values", "BenchMarking", 30, 1);
				
				
				/*selectDropdownByVisibleText("BenchMarking", "RequestType", "ESG Values", "BenchMarking", 28, 1);
				selectDropdownByVisibleText("BenchMarking", "RequestFrequency", "ESG Values", "BenchMarking", 29, 1);
				selectDropdownByVisibleText("BenchMarking", "DeliveryMethod", "ESG Values", "BenchMarking", 30, 1);*/
				clickWebelement("BenchMarking", "TermsAndCondition");
				clickWebelement("BenchMarking", "TCOk");
				clickWebelement("BenchMarking", "TCCheckBox");
				clickWebelement("BenchMarking", "RetriveSharedPropertiesButton");
				WaitForElement(300, "BenchMarking", "RequestFrequencyValidation");
				//explicitWait(3000, "BenchMarking", "RequestFrequencyValidation");
				VerifyElementForExistingValueWithText("BenchMarking", "RequestFrequencyValidation", "ESG Values", "BenchMarking", 29, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "DeliveryMethodValidation", "ESG Values", "BenchMarking", 30, 1);
				WaitForElement(300, "BenchMarking", "Property1Validation");
				//explicitWait(3000, "BenchMarking", "Property1Validation");
				threadWait(20000);
			/*	VerifyElementForExistingValueWithText("BenchMarking", "PropertyColumnNameValidation", "ESG Values", "BenchMarking", 31, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioManagerPropertyIDValidation", "ESG Values", "BenchMarking", 32, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressColumnNameValidation", "ESG Values", "BenchMarking", 33, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeColumnNameValidation", "ESG Values", "BenchMarking", 34, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "VerifiyAddressnameValidation", "ESG Values", "BenchMarking", 35, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "MetersColumnNameValidation", "ESG Values", "BenchMarking", 36, 1);*/
				VerifyElementForExistingValueWithText("BenchMarking", "Property1Validation", "ESG Values", "BenchMarking", 37, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "Property2Validation", "ESG Values", "BenchMarking", 38, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "Property3Validation", "ESG Values", "BenchMarking", 39, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "Property4Validation", "ESG Values", "BenchMarking", 40, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "Property5Validation", "ESG Values", "BenchMarking", 41, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "1stSecondaryBuildingValidation", "ESG Values", "BenchMarking", 42, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "2stSecondaryBuildingValidation", "ESG Values", "BenchMarking", 43, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID1", "ESG Values", "BenchMarking", 44, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID2", "ESG Values", "BenchMarking", 45, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID3", "ESG Values", "BenchMarking", 46, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID4", "ESG Values", "BenchMarking", 47, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID5", "ESG Values", "BenchMarking", 48, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID6", "ESG Values", "BenchMarking", 49, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID7", "ESG Values", "BenchMarking", 50, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation1", "ESG Values", "BenchMarking", 51, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation2", "ESG Values", "BenchMarking", 52, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation3", "ESG Values", "BenchMarking", 53, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation4", "ESG Values", "BenchMarking", 54, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation5", "ESG Values", "BenchMarking", 55, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation6", "ESG Values", "BenchMarking", 56, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation7", "ESG Values", "BenchMarking", 57, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation1", "ESG Values", "BenchMarking", 58, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation2", "ESG Values", "BenchMarking", 58, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation3", "ESG Values", "BenchMarking", 58, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation4", "ESG Values", "BenchMarking", 58, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation5", "ESG Values", "BenchMarking", 58, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation1", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation2", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation3", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation4", "ESG Values", "BenchMarking", 67, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation5", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation6", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation7", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation1", "ESG Values", "BenchMarking", 60, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation2", "ESG Values", "BenchMarking", 61, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation3", "ESG Values", "BenchMarking", 62, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation4", "ESG Values", "BenchMarking", 63, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation5", "ESG Values", "BenchMarking", 64, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation6", "ESG Values", "BenchMarking", 65, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation7", "ESG Values", "BenchMarking", 66, 1);
				scrollToElement("BenchMarking", "NextButton");
				clickWebelement("BenchMarking", "NextButton");
				
				//Authorization Tab
				WaitForElement(300, "BenchMarking", "PropertyValidation");
				//explicitWait(300, "BenchMarking", "PropertyValidation");
				VerifyElementForExistingValueWithText("BenchMarking", "PropertyValidation", "ESG Values", "BenchMarking", 69, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "PortfolioValidation", "ESG Values", "BenchMarking", 70, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AddressStep2Validaiton", "ESG Values", "BenchMarking", 71, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeSte4Validation", "ESG Values", "BenchMarking", 72, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "NumberOfAccountsValidation", "ESG Values", "BenchMarking", 73, 1);
				scrollToElement("BenchMarking", "NextButton");
				clickWebelement("BenchMarking", "NextButton");
				
				//Review and Submit Tab
			//	VerifyElementForExistingValueWithText("BenchMarking", "RequestorApplicationName", "ESG Values", "BenchMarking", 77, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestorPhoneNumber", "ESG Values", "BenchMarking", 78, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestorEmailId", "ESG Values", "BenchMarking", 79, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestorBusinessAddress", "ESG Values", "BenchMarking", 82, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestorBusinessCity", "ESG Values", "BenchMarking", 83, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RequestorState", "ESG Values", "BenchMarking", 84, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "AdditionalInformation", "ESG Values", "BenchMarking", 86, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "DeliveryMethodValidation1", "ESG Values", "BenchMarking", 87, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPropertNameValidation", "ESG Values", "BenchMarking", 31, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioManagerValidation", "ESG Values", "BenchMarking", 32, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSAddressValidation", "ESG Values", "BenchMarking", 33, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSRequestTypevalidation", "ESG Values", "BenchMarking", 34, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedAccessValidation", "ESG Values", "BenchMarking", 35, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSMetersValidation", "ESG Values", "BenchMarking", 36, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName1", "ESG Values", "BenchMarking", 37, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName2", "ESG Values", "BenchMarking", 38, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName3", "ESG Values", "BenchMarking", 41, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName4", "ESG Values", "BenchMarking", 42, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName5", "ESG Values", "BenchMarking", 43, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID1", "ESG Values", "BenchMarking", 44, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID2", "ESG Values", "BenchMarking", 45, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID3", "ESG Values", "BenchMarking", 48, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID4", "ESG Values", "BenchMarking", 49, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID5", "ESG Values", "BenchMarking", 50, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSAddress1", "ESG Values", "BenchMarking", 51, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSAddress2", "ESG Values", "BenchMarking", 52, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSAddress3", "ESG Values", "BenchMarking", 55, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSAddress4", "ESG Values", "BenchMarking", 56, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSAddress5", "ESG Values", "BenchMarking", 57, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSRequest1", "ESG Values", "BenchMarking", 58, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSRequest2", "ESG Values", "BenchMarking", 58, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSRequest3", "ESG Values", "BenchMarking", 58, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField1", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField2", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField3", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField4", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField5", "ESG Values", "BenchMarking", 59, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSMeters1", "ESG Values", "BenchMarking", 60, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSMeters2", "ESG Values", "BenchMarking", 61, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSMeters3", "ESG Values", "BenchMarking", 64, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSMeters4", "ESG Values", "BenchMarking", 65, 1);
				VerifyElementForExistingValueWithText("BenchMarking", "RSMeters5", "ESG Values", "BenchMarking", 66, 1);
				scrollToElement("BenchMarking", "SubmitButton");
				clickWebelement("BenchMarking", "SubmitButton");
				
				//New Enrollment Validation
				validationWithWebelement("BenchMarking", "NewEnrollmentNumber");
				driver.close();
				
			}
			public static void BenchmarkingNonaggreedated() {
					OpenBrowser("BenchMarking", "BecnhmarkingOnlineUrl2");
					openURL("BenchMarking", "BecnhmarkingOnlineUrl2");
					//Getting Started Tab
					clickWebelement("BenchMarking", "BuildingOwner");
					clickWebelement("BenchMarking", "NextButton");
					
					//Customer Information tab
					WaitForElement(300, "BenchMarking", "FirstName");
				//	explicitWait(300, "BenchMarking", "FirstName");
					enterTextboxValue("BenchMarking", "FirstName", "ESG Values", "BenchMarking", 16, 1);
					enterTextboxValue("BenchMarking", "LastName", "ESG Values", "BenchMarking", 17, 1);
					enterTextboxValue("BenchMarking", "PrimaryPhone", "ESG Values", "BenchMarking", 18, 1);
					enterTextboxValue("BenchMarking", "EmailAddress", "ESG Values", "BenchMarking", 19, 1);
					enterTextboxValue("BenchMarking", "Street", "ESG Values", "BenchMarking", 20, 1);
					enterTextboxValue("BenchMarking", "ZipCode", "ESG Values", "BenchMarking", 22, 1);
					enterTextboxValue("BenchMarking", "City", "ESG Values", "BenchMarking", 23, 1);
					enterTextboxValue("BenchMarking", "State", "ESG Values", "BenchMarking", 24, 1);
					enterTextboxValue("BenchMarking", "Organization", "ESG Values", "BenchMarking", 21, 1);
					scrollToElement("BenchMarking", "NextButton");
					clickWebelement("BenchMarking", "NextButton");
					
					//Building Information Tab
					WaitForElement(300, "BenchMarking", "PortfolioManagerUsername");
				//	explicitWait(3000, "BenchMarking", "PortfolioManagerUsername");
					enterTextboxValue("BenchMarking", "PortfolioManagerUsername", "ESG Values", "BenchMarking", 27, 1);
					
					selectDropdown("BenchMarking", "RequestType","", "ESG Values", "BenchMarking", 90, 1);
					selectDropdown("BenchMarking", "RequestFrequency","", "ESG Values", "BenchMarking", 29, 1);
					selectDropdown("BenchMarking", "DeliveryMethod","", "ESG Values", "BenchMarking", 30, 1);
					
					/*selectDropdownByVisibleText("BenchMarking", "RequestType", "ESG Values", "BenchMarking", 90, 1);
					selectDropdownByVisibleText("BenchMarking", "RequestFrequency", "ESG Values", "BenchMarking", 29, 1);
					selectDropdownByVisibleText("BenchMarking", "DeliveryMethod", "ESG Values", "BenchMarking", 30, 1);*/
					clickWebelement("BenchMarking", "TermsAndCondition");
					clickWebelement("BenchMarking", "TCOk");
					clickWebelement("BenchMarking", "TCCheckBox");
					clickWebelement("BenchMarking", "RetriveSharedPropertiesButton");
					WaitForElement(300, "BenchMarking", "RequestFrequencyValidation");
					//explicitWait(300, "BenchMarking", "RequestFrequencyValidation");
					VerifyElementForExistingValueWithText("BenchMarking", "RequestFrequencyValidation", "ESG Values", "BenchMarking", 29, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "DeliveryMethodValidation", "ESG Values", "BenchMarking", 30, 1);
					WaitForElement(300, "BenchMarking", "Property1Validation");
					//explicitWait(3000, "BenchMarking", "Property1Validation");
					threadWait(20000);
					/*VerifyElementForExistingValueWithText("BenchMarking", "PropertyColumnNameValidation", "ESG Values", "BenchMarking", 31, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "PortfolioManagerPropertyIDValidation", "ESG Values", "BenchMarking", 32, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AddressColumnNameValidation", "ESG Values", "BenchMarking", 33, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeColumnNameValidation", "ESG Values", "BenchMarking", 34, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "VerifiyAddressnameValidation", "ESG Values", "BenchMarking", 35, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "MetersColumnNameValidation", "ESG Values", "BenchMarking", 36, 1);*/
					VerifyElementForExistingValueWithText("BenchMarking", "Property1Validation", "ESG Values", "BenchMarking", 37, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "Property2Validation", "ESG Values", "BenchMarking", 38, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "Property3Validation", "ESG Values", "BenchMarking", 39, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "Property4Validation", "ESG Values", "BenchMarking", 40, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "Property5Validation", "ESG Values", "BenchMarking", 41, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "1stSecondaryBuildingValidation", "ESG Values", "BenchMarking", 42, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "2stSecondaryBuildingValidation", "ESG Values", "BenchMarking", 43, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID1", "ESG Values", "BenchMarking", 44, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID2", "ESG Values", "BenchMarking", 45, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID3", "ESG Values", "BenchMarking", 46, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID4", "ESG Values", "BenchMarking", 47, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID5", "ESG Values", "BenchMarking", 48, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID6", "ESG Values", "BenchMarking", 49, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID7", "ESG Values", "BenchMarking", 50, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation1", "ESG Values", "BenchMarking", 51, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation2", "ESG Values", "BenchMarking", 52, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation3", "ESG Values", "BenchMarking", 53, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation4", "ESG Values", "BenchMarking", 54, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation5", "ESG Values", "BenchMarking", 55, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation6", "ESG Values", "BenchMarking", 56, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AddressValidation7", "ESG Values", "BenchMarking", 57, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation1", "ESG Values", "BenchMarking", 90, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation2", "ESG Values", "BenchMarking", 90, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation3", "ESG Values", "BenchMarking", 90, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation4", "ESG Values", "BenchMarking", 90, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation5", "ESG Values", "BenchMarking", 90, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation1", "ESG Values", "BenchMarking", 59, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation2", "ESG Values", "BenchMarking", 59, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation3", "ESG Values", "BenchMarking", 59, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation4", "ESG Values", "BenchMarking", 67, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation5", "ESG Values", "BenchMarking", 59, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation6", "ESG Values", "BenchMarking", 59, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation7", "ESG Values", "BenchMarking", 59, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation1", "ESG Values", "BenchMarking", 91, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation2", "ESG Values", "BenchMarking", 92, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation3", "ESG Values", "BenchMarking", 93, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation4", "ESG Values", "BenchMarking", 94, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation5", "ESG Values", "BenchMarking", 95, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation6", "ESG Values", "BenchMarking", 96, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "MetersValidation7", "ESG Values", "BenchMarking", 97, 1);
					scrollToElement("BenchMarking", "NextButton");
					clickWebelement("BenchMarking", "NextButton");
					
					//Authorization Tab
					explicitWait(300, "BenchMarking", "PropertyValidation");
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyNameValidation1", "ESG Values", "BenchMarking", 100, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyNameValidation2", "ESG Values", "BenchMarking", 101, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyNameValidation3", "ESG Values", "BenchMarking", 102, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyNameValidation4", "ESG Values", "BenchMarking", 103, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyIDValidation1", "ESG Values", "BenchMarking", 104, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyIDValidation2", "ESG Values", "BenchMarking", 105, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyIDValidation3", "ESG Values", "BenchMarking", 106, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyIDValidation4", "ESG Values", "BenchMarking", 107, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyAddressValidation1", "ESG Values", "BenchMarking", 108, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyAddressValidation2", "ESG Values", "BenchMarking", 109, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyAddressValidation3", "ESG Values", "BenchMarking", 110, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyAddressValidation4", "ESG Values", "BenchMarking", 111, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyRequestTypeValidation1", "ESG Values", "BenchMarking", 112, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyRequestTypeAddressValidation2", "ESG Values", "BenchMarking", 112, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyRequestTypeAddressValidation3", "ESG Values", "BenchMarking", 112, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyRequestTypeAddressValidation4", "ESG Values", "BenchMarking", 112, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyNoAccountValidation1", "ESG Values", "BenchMarking", 113, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyNoAccountValidation2", "ESG Values", "BenchMarking", 114, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyNoAccountValidation3", "ESG Values", "BenchMarking", 115, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "NAPropertyNoAccountValidation4", "ESG Values", "BenchMarking", 116, 1);
					scrollToElement("BenchMarking", "NextButton");
					clickWebelement("BenchMarking", "NextButton");
					
					//Review and Submit Tab
				//	VerifyElementForExistingValueWithText("BenchMarking", "RequestorApplicationName", "ESG Values", "BenchMarking", 77, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestorPhoneNumber", "ESG Values", "BenchMarking", 78, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestorEmailId", "ESG Values", "BenchMarking", 79, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestorBusinessAddress", "ESG Values", "BenchMarking", 82, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestorBusinessCity", "ESG Values", "BenchMarking", 83, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RequestorState", "ESG Values", "BenchMarking", 84, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "AdditionalInformation", "ESG Values", "BenchMarking", 86, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "DeliveryMethodValidation1", "ESG Values", "BenchMarking", 87, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPropertNameValidation", "ESG Values", "BenchMarking", 31, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioManagerValidation", "ESG Values", "BenchMarking", 32, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSAddressValidation", "ESG Values", "BenchMarking", 33, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSRequestTypevalidation", "ESG Values", "BenchMarking", 34, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedAccessValidation", "ESG Values", "BenchMarking", 35, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSMetersValidation", "ESG Values", "BenchMarking", 36, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName1", "ESG Values", "BenchMarking", 119, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName2", "ESG Values", "BenchMarking", 120, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName3", "ESG Values", "BenchMarking", 121, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName4", "ESG Values", "BenchMarking", 122, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPropertyName5", "ESG Values", "BenchMarking", 123, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID1", "ESG Values", "BenchMarking", 124, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID2", "ESG Values", "BenchMarking", 125, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID3", "ESG Values", "BenchMarking", 126, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID4", "ESG Values", "BenchMarking", 127, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID5", "ESG Values", "BenchMarking", 128, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSAddress1", "ESG Values", "BenchMarking", 129, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSAddress2", "ESG Values", "BenchMarking", 130, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSAddress3", "ESG Values", "BenchMarking", 131, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSAddress4", "ESG Values", "BenchMarking", 132, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSAddress5", "ESG Values", "BenchMarking", 133, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSRequest1", "ESG Values", "BenchMarking", 134, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSRequest2", "ESG Values", "BenchMarking", 134, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSRequest3", "ESG Values", "BenchMarking", 134, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField1", "ESG Values", "BenchMarking", 135, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField2", "ESG Values", "BenchMarking", 135, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField3", "ESG Values", "BenchMarking", 135, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField4", "ESG Values", "BenchMarking", 135, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField5", "ESG Values", "BenchMarking", 135, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSMeters1", "ESG Values", "BenchMarking", 136, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSMeters2", "ESG Values", "BenchMarking", 137, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSMeters3", "ESG Values", "BenchMarking", 138, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSMeters4", "ESG Values", "BenchMarking", 139, 1);
					VerifyElementForExistingValueWithText("BenchMarking", "RSMeters5", "ESG Values", "BenchMarking", 140, 1);
					scrollToElement("BenchMarking", "SubmitButton");
					clickWebelement("BenchMarking", "SubmitButton");
					WaitForElement(300, "BenchMarking", "NewEnrollmentNumber");
					//explicitWait(3000, "BenchMarking", "NewEnrollmentNumber");
					//New Enrollment Validation
					validationWithWebelement("BenchMarking", "NewEnrollmentNumber");
					
			}
			
			
			

}