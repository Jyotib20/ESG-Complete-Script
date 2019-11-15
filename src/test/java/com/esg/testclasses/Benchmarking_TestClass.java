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
		explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
		clickWebelement("BenchMarking", "EnergyTab");
		
		//Adding the properties
		clickWebelement("BenchMarking", "AddMeterButton");
		explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
		clickWebelement("BenchMarking", "DieselCheckOption");
		scrollToElement("BenchMarking", "GetStarted");
		clickWebelement("BenchMarking", "GetStarted");
		
		//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
		explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
		clickWebelement("BenchMarking", "SelectCheckBox");
		selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
		clickWebelement("BenchMarking", "DateMeterBecameActive");
		clickWebelement("BenchMarking", "ActiveDate");
		clickWebelement("BenchMarking", "CreateMeter");
		explicitWait(3000, "BenchMarking", "NotifyMessage");
		
		//Meters have been created!
		validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
		scrollToElement("BenchMarking", "ContinueButton");
		clickWebelement("BenchMarking", "ContinueButton");
		
		//Meter entries have been added to your meters!
		explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
		clickWebelement("BenchMarking", "MyPortfolio");
		clickWebelement("BenchMarking", "Property1");
		explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
		clickWebelement("BenchMarking", "EnergyTab");
		scrollToElement("BenchMarking", "DeleteDieselLink");
		clickWebelement("BenchMarking", "DeleteDieselLink");
		
		//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
		threadWait(3000);
		clickWebelement("BenchMarking", "BasicMeasureInfo");
		explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
		clickWebelement("BenchMarking", "DeleteMeter");
		clickWebelement("BenchMarking", "DeleteConfirmation");
		validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
		clickWebelement("BenchMarking", "HomePage");
	}
		public static void Property2_ComRes1() {
		
		//Navigating to the property commercial Page
		clickWebelement("BenchMarking", "Property2");
		explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
		clickWebelement("BenchMarking", "EnergyTab");
		
		//Adding the properties
		clickWebelement("BenchMarking", "AddMeterButton");
		explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
		clickWebelement("BenchMarking", "DieselCheckOption");
		scrollToElement("BenchMarking", "GetStarted");
		clickWebelement("BenchMarking", "GetStarted");
		
		//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
		explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
		clickWebelement("BenchMarking", "SelectCheckBox");
		selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
		clickWebelement("BenchMarking", "DateMeterBecameActive");
		clickWebelement("BenchMarking", "ActiveDate");
		clickWebelement("BenchMarking", "CreateMeter");
		explicitWait(3000, "BenchMarking", "NotifyMessage");
		
		//Meters have been created!
		validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
		scrollToElement("BenchMarking", "ContinueButton");
		clickWebelement("BenchMarking", "ContinueButton");
		
		//Meter entries have been added to your meters!
		explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
		clickWebelement("BenchMarking", "MyPortfolio");
		clickWebelement("BenchMarking", "Property2");
		explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
		clickWebelement("BenchMarking", "EnergyTab");
		scrollToElement("BenchMarking", "DeleteDieselLink");
		clickWebelement("BenchMarking", "DeleteDieselLink");
		
		//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
		threadWait(3000);
		clickWebelement("BenchMarking", "BasicMeasureInfo");
		explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
		clickWebelement("BenchMarking", "DeleteMeter");
		clickWebelement("BenchMarking", "DeleteConfirmation");
		validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
		clickWebelement("BenchMarking", "HomePage");
	}
		public static void Property3_ComRes2() {
			
			//Navigating to the property commercial Page
			clickWebelement("BenchMarking", "Property3");
			explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
			clickWebelement("BenchMarking", "EnergyTab");
			
			//Adding the properties
			clickWebelement("BenchMarking", "AddMeterButton");
			explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
			clickWebelement("BenchMarking", "DieselCheckOption");
			scrollToElement("BenchMarking", "GetStarted");
			clickWebelement("BenchMarking", "GetStarted");
			
			//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
			explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
			clickWebelement("BenchMarking", "SelectCheckBox");
			selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
			clickWebelement("BenchMarking", "DateMeterBecameActive");
			clickWebelement("BenchMarking", "ActiveDate");
			clickWebelement("BenchMarking", "CreateMeter");
			explicitWait(3000, "BenchMarking", "NotifyMessage");
			
			//Meters have been created!
			validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
			scrollToElement("BenchMarking", "ContinueButton");
			clickWebelement("BenchMarking", "ContinueButton");
			
			//Meter entries have been added to your meters!
			explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
			clickWebelement("BenchMarking", "MyPortfolio");
			clickWebelement("BenchMarking", "Property3");
			explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
			clickWebelement("BenchMarking", "EnergyTab");
			scrollToElement("BenchMarking", "DeleteDieselLink");
			clickWebelement("BenchMarking", "DeleteDieselLink");
			
			//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
			threadWait(3000);
			clickWebelement("BenchMarking", "BasicMeasureInfo");
			explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
			clickWebelement("BenchMarking", "DeleteMeter");
			clickWebelement("BenchMarking", "DeleteConfirmation");
			validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
			clickWebelement("BenchMarking", "HomePage");
		}
		
			public static void Property4_UnverifiedAddress() {
			
			//Navigating to the property commercial Page
			scrollToElement("BenchMarking", "Property4");
			clickWebelement("BenchMarking", "Property4");
			explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
			clickWebelement("BenchMarking", "EnergyTab");
			
			//Adding the properties
			clickWebelement("BenchMarking", "AddMeterButton");
			explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
			clickWebelement("BenchMarking", "DieselCheckOption");
			scrollToElement("BenchMarking", "GetStarted");
			clickWebelement("BenchMarking", "GetStarted");
			
			//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
			explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
			clickWebelement("BenchMarking", "SelectCheckBox");
			selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
			clickWebelement("BenchMarking", "DateMeterBecameActive");
			clickWebelement("BenchMarking", "ActiveDate");
			clickWebelement("BenchMarking", "CreateMeter");
			explicitWait(3000, "BenchMarking", "NotifyMessage");
			
			//Meters have been created!
			validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
			scrollToElement("BenchMarking", "ContinueButton");
			clickWebelement("BenchMarking", "ContinueButton");
			
			//Meter entries have been added to your meters!
			explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
			clickWebelement("BenchMarking", "MyPortfolio");
			clickWebelement("BenchMarking", "Property4");
			explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
			clickWebelement("BenchMarking", "EnergyTab");
			scrollToElement("BenchMarking", "DeleteDieselLink");
			clickWebelement("BenchMarking", "DeleteDieselLink");
			
			//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
			threadWait(3000);
			clickWebelement("BenchMarking", "BasicMeasureInfo");
			explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
			clickWebelement("BenchMarking", "DeleteMeter");
			clickWebelement("BenchMarking", "DeleteConfirmation");
			validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
			clickWebelement("BenchMarking", "HomePage");
		}
			
			public static void Property5_Appartmentcampus() {
				
				//Navigating to the property commercial Page
				scrollToElement("BenchMarking", "Property5");
				clickWebelement("BenchMarking", "Property5");
				explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
				clickWebelement("BenchMarking", "EnergyTab");
				
				//Adding the properties
				clickWebelement("BenchMarking", "AddMeterButton");
				explicitWaitForClickable(3000, "BenchMarking", "DieselCheckOption");
				clickWebelement("BenchMarking", "DieselCheckOption");
				scrollToElement("BenchMarking", "GetStarted");
				clickWebelement("BenchMarking", "GetStarted");
				
				//Navigating to the Energy Meter for Property 1 - Commercial (click table to edit)
				explicitWaitForClickable(3000, "BenchMarking", "SelectCheckBox");
				clickWebelement("BenchMarking", "SelectCheckBox");
				selectDropdownByVisibleText("BenchMarking", "Units", "ESG Values", "BenchMarking", 3, 1);
				clickWebelement("BenchMarking", "DateMeterBecameActive");
				clickWebelement("BenchMarking", "ActiveDate");
				clickWebelement("BenchMarking", "CreateMeter");
				explicitWait(3000, "BenchMarking", "NotifyMessage");
				
				//Meters have been created!
				validationWithWebelement("BenchMarking", "NotifyMessage", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
				scrollToElement("BenchMarking", "ContinueButton");
				clickWebelement("BenchMarking", "ContinueButton");
				
				//Meter entries have been added to your meters!
				explicitWaitForClickable(3000, "BenchMarking", "MyPortfolio");
				clickWebelement("BenchMarking", "MyPortfolio");
				clickWebelement("BenchMarking", "Property5");
				explicitWaitForClickable(3000, "BenchMarking", "EnergyTab");
				clickWebelement("BenchMarking", "EnergyTab");
				scrollToElement("BenchMarking", "DeleteDieselLink");
				clickWebelement("BenchMarking", "DeleteDieselLink");
				
				//Navigated to Manage Bills (Meter Entries) for Property 1 - Commercial page
				threadWait(3000);
				clickWebelement("BenchMarking", "BasicMeasureInfo");
				explicitWaitForClickable(3000, "BenchMarking", "DeleteMeter");
				clickWebelement("BenchMarking", "DeleteMeter");
				clickWebelement("BenchMarking", "DeleteConfirmation");
				validationWithWebelement("BenchMarking", "DeleteNotify", "Notification Message is validated Successfully", "Failed to Validate the Notification Message");
				clickWebelement("BenchMarking", "HomePage");
			}
			public static void EECP_PortfolioConfig() {
				login("helper", "BaseURL", 1, 0, 1, 1);
				ClickByActionClass("BenchMarking", "Configuration", "ESG Values", "BenchMarking", 8, 1);
				validationWithWebelement("BenchMarking", "SystemConfigurationValidation", "Successfully navigated to System Configuration Page", "Failed to navigated to System Configuration Page");
				scrollToElement("BenchMarking", "PortfolioManagerConfig");
				clickWebelement("BenchMarking", "PortfolioManagerConfig");
				clearWebelement("BenchMarking", "PortUsername");
				enterTextboxValue("BenchMarking", "PortUsername", "ESG Values", "BenchMarking", 9, 1);
				clearWebelement("BenchMarking", "PortPassword");
				enterTextboxValue("BenchMarking", "PortPassword", "ESG Values", "BenchMarking", 10, 1);
				clickonSave();
			}
			public static void Verify_Last_Bill_Amount() {
				openURL("BenchMarking", "BiilingServiceUrl");
				clearWebelement("BenchMarking", "ServiceAccountNumber");
				enterTextboxValue("BenchMarking", "ServiceAccountNumber", "ESG Values", "BenchMarking", 12, 1);
				clickWebelement("BenchMarking", "GetLastBillAmountButton");
				VarifyElementForExistingValueWithAttribute("BenchMarking", "LastBillAmount", "ESG Values", "BenchMarking", 13, 1);
			}
			/*public static void BenchMarkingOnline1() {
				openURL("BenchMarking", "BenchmarkingOnline1Url");
				clearWebelement("BenchMarking", "ServiceAccountNumber");
				enterTextboxValue("BenchMarking", "ServiceAccountNumber", "ESG Values", "BenchMarking", 12, 1);
				clickWebelement("BenchMarking", "GetLastBillAmountButton");
				VarifyElementForExistingValueWithText("BenchMarking", "LastBillAmount", "ESG Values", "BenchMarking", 13, 1);
			}*/
			public static void BenchmarkingDataRequestPortal() {
				
				openURL("BenchMarking", "BecnhmarkingOnlineUrl2");
				//Getting Started Tab
				clickWebelement("BenchMarking", "BuildingOwner");
				clickWebelement("BenchMarking", "NextButton");
				
				//Customer Information tab
				explicitWait(300, "BenchMarking", "FirstName");
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
				explicitWait(3000, "BenchMarking", "PortfolioManagerUsername");
				enterTextboxValue("BenchMarking", "PortfolioManagerUsername", "ESG Values", "BenchMarking", 27, 1);
				selectDropdownByVisibleText("BenchMarking", "RequestType", "ESG Values", "BenchMarking", 28, 1);
				selectDropdownByVisibleText("BenchMarking", "RequestFrequency", "ESG Values", "BenchMarking", 29, 1);
				selectDropdownByVisibleText("BenchMarking", "DeliveryMethod", "ESG Values", "BenchMarking", 30, 1);
				clickWebelement("BenchMarking", "TermsAndCondition");
				clickWebelement("BenchMarking", "TCOk");
				clickWebelement("BenchMarking", "TCCheckBox");
				clickWebelement("BenchMarking", "RetriveSharedPropertiesButton");
				explicitWait(300, "BenchMarking", "RequestFrequencyValidation");
				VarifyElementForExistingValueWithText("BenchMarking", "RequestFrequencyValidation", "ESG Values", "BenchMarking", 29, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "DeliveryMethodValidation", "ESG Values", "BenchMarking", 30, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PropertyColumnNameValidation", "ESG Values", "BenchMarking", 31, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioManagerPropertyIDValidation", "ESG Values", "BenchMarking", 32, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressColumnNameValidation", "ESG Values", "BenchMarking", 33, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestTypeColumnNameValidation", "ESG Values", "BenchMarking", 34, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "VerifiyAddressnameValidation", "ESG Values", "BenchMarking", 35, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "MetersColumnNameValidation", "ESG Values", "BenchMarking", 36, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "Property1Validation", "ESG Values", "BenchMarking", 37, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "Property2Validation", "ESG Values", "BenchMarking", 38, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "Property3Validation", "ESG Values", "BenchMarking", 39, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "Property4Validation", "ESG Values", "BenchMarking", 40, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "Property5Validation", "ESG Values", "BenchMarking", 41, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "1stSecondaryBuildingValidation", "ESG Values", "BenchMarking", 42, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "2stSecondaryBuildingValidation", "ESG Values", "BenchMarking", 43, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID1", "ESG Values", "BenchMarking", 44, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID2", "ESG Values", "BenchMarking", 45, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID3", "ESG Values", "BenchMarking", 46, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID4", "ESG Values", "BenchMarking", 47, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID5", "ESG Values", "BenchMarking", 48, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID6", "ESG Values", "BenchMarking", 49, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioPropertyID7", "ESG Values", "BenchMarking", 50, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressValidation1", "ESG Values", "BenchMarking", 51, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressValidation2", "ESG Values", "BenchMarking", 52, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressValidation3", "ESG Values", "BenchMarking", 53, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressValidation4", "ESG Values", "BenchMarking", 54, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressValidation5", "ESG Values", "BenchMarking", 55, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressValidation6", "ESG Values", "BenchMarking", 56, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressValidation7", "ESG Values", "BenchMarking", 57, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation1", "ESG Values", "BenchMarking", 58, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation2", "ESG Values", "BenchMarking", 58, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation3", "ESG Values", "BenchMarking", 58, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation4", "ESG Values", "BenchMarking", 58, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestTypeValidation5", "ESG Values", "BenchMarking", 58, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation1", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation2", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation3", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation4", "ESG Values", "BenchMarking", 67, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation5", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation6", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "VerifyAddressValidation7", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "MetersValidation1", "ESG Values", "BenchMarking", 60, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "MetersValidation2", "ESG Values", "BenchMarking", 61, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "MetersValidation3", "ESG Values", "BenchMarking", 62, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "MetersValidation4", "ESG Values", "BenchMarking", 63, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "MetersValidation5", "ESG Values", "BenchMarking", 64, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "MetersValidation6", "ESG Values", "BenchMarking", 65, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "MetersValidation7", "ESG Values", "BenchMarking", 66, 1);
				scrollToElement("BenchMarking", "NextButton");
				clickWebelement("BenchMarking", "NextButton");
				
				//Authorization Tab
				explicitWait(300, "BenchMarking", "PropertyValidation");
				VarifyElementForExistingValueWithText("BenchMarking", "PropertyValidation", "ESG Values", "BenchMarking", 69, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "PortfolioValidation", "ESG Values", "BenchMarking", 70, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AddressStep2Validaiton", "ESG Values", "BenchMarking", 71, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestTypeSte4Validation", "ESG Values", "BenchMarking", 72, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "NumberOfAccountsValidation", "ESG Values", "BenchMarking", 73, 1);
				scrollToElement("BenchMarking", "NextButton");
				clickWebelement("BenchMarking", "NextButton");
				
				//Review and Submit Tab
			//	VarifyElementForExistingValueWithText("BenchMarking", "RequestorApplicationName", "ESG Values", "BenchMarking", 77, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestorPhoneNumber", "ESG Values", "BenchMarking", 78, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestorEmailId", "ESG Values", "BenchMarking", 79, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestorBusinessAddress", "ESG Values", "BenchMarking", 82, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestorBusinessCity", "ESG Values", "BenchMarking", 83, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RequestorState", "ESG Values", "BenchMarking", 84, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "AdditionalInformation", "ESG Values", "BenchMarking", 86, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "DeliveryMethodValidation1", "ESG Values", "BenchMarking", 87, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPropertNameValidation", "ESG Values", "BenchMarking", 31, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPortfolioManagerValidation", "ESG Values", "BenchMarking", 32, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSAddressValidation", "ESG Values", "BenchMarking", 33, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSRequestTypevalidation", "ESG Values", "BenchMarking", 34, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSVerifiedAccessValidation", "ESG Values", "BenchMarking", 35, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSMetersValidation", "ESG Values", "BenchMarking", 36, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPropertyName1", "ESG Values", "BenchMarking", 37, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPropertyName2", "ESG Values", "BenchMarking", 38, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPropertyName3", "ESG Values", "BenchMarking", 41, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPropertyName4", "ESG Values", "BenchMarking", 42, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPropertyName5", "ESG Values", "BenchMarking", 43, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID1", "ESG Values", "BenchMarking", 44, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID2", "ESG Values", "BenchMarking", 45, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID3", "ESG Values", "BenchMarking", 48, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID4", "ESG Values", "BenchMarking", 49, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSPortfolioID5", "ESG Values", "BenchMarking", 50, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSAddress1", "ESG Values", "BenchMarking", 51, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSAddress2", "ESG Values", "BenchMarking", 52, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSAddress3", "ESG Values", "BenchMarking", 55, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSAddress4", "ESG Values", "BenchMarking", 56, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSAddress5", "ESG Values", "BenchMarking", 57, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSRequest1", "ESG Values", "BenchMarking", 58, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSRequest2", "ESG Values", "BenchMarking", 58, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSRequest3", "ESG Values", "BenchMarking", 58, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField1", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField2", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField3", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField4", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSVerifiedField5", "ESG Values", "BenchMarking", 59, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSMeters1", "ESG Values", "BenchMarking", 60, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSMeters2", "ESG Values", "BenchMarking", 61, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSMeters3", "ESG Values", "BenchMarking", 64, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSMeters4", "ESG Values", "BenchMarking", 65, 1);
				VarifyElementForExistingValueWithText("BenchMarking", "RSMeters5", "ESG Values", "BenchMarking", 66, 1);
				scrollToElement("BenchMarking", "SubmitButton");
				clickWebelement("BenchMarking", "SubmitButton");
				
				//New Enrollment Validation
				validationWithWebelement("BenchMarking", "NewEnrollmentNumber");
				
			}
			
			
			

}
