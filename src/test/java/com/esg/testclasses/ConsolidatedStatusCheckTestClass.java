package com.esg.testclasses;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class ConsolidatedStatusCheckTestClass extends HelperClass {
	
	public static void Login() {
		login("helper","BaseURL", 1, 0, 1, 1);
		ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
	}
	public static void AccountModule() {
		//Edit Module
		clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
		threadWait(2500);
		validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
		validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
		validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
		validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
		validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
		selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
		threadWait(2500);
		clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
		threadWait(2500);
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parentWindowHandle"+parentWindowHandle);
		SwitchToChild();
		threadWait(5000);
		enterTextboxValue("ConsolidatedStatusCheck", "AccountNumber", "ESG Values", "Consolidated Status Check", 3, 1);
		threadWait(2500);
		clickWebelement("ConsolidatedStatusCheck", "Search");
		threadWait(2500);
		defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
		threadWait(5000);
		if (driver.getPageSource().contains("Edit")) {
			test.log(LogStatus.PASS, "Edit option is Available");
			
		} else {
			test.log(LogStatus.FAIL, "Edit option is not Available under the Available Action tab");

		}
		driver.switchTo().window(parentWindowHandle);
		clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");
		
	//Record Module
		ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
	clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
	threadWait(2500);
	validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
	selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
	threadWait(2500);
	clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
	threadWait(2500);
	SwitchToChild();
	threadWait(5000);
	enterTextboxValue("ConsolidatedStatusCheck", "AccountNumber", "ESG Values", "Consolidated Status Check", 3, 1);
	threadWait(2500);
	clickWebelement("ConsolidatedStatusCheck", "Search");
	threadWait(2500);
	defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
	threadWait(5000);
	if (driver.getPageSource().contains("Record Installation Results")) {
		test.log(LogStatus.PASS, "Record Installation Results option is Available");
		clickWebelement("ConsolidatedStatusCheck", "Record");
		threadWait(5000);
		
	} else {
		test.log(LogStatus.FAIL, "Record Installation Results option is not Available under the Available Action tab");

	}
	driver.switchTo().window(parentWindowHandle);
	clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");
	
	//Cancel Module
	ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "AccountNumber", "ESG Values", "Consolidated Status Check", 3, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("Cancel Application")) {
	test.log(LogStatus.PASS, "Cancel Application option is Available");
	threadWait(5000);
	clickWebelement("ConsolidatedStatusCheck", "Cancel");
	threadWait(5000);
	
} else {
	test.log(LogStatus.FAIL, "Cancel Application option is not Available under the Available Action tab");

}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");

//Invalid Module
	ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "AccountNumber", "ESG Values", "Consolidated Status Check", 4, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
//defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("We could not find any enrollments that matched your search criteria")) {
	ValidateWithElement("ConsolidatedStatusCheck", "StatusMsg", "We could not find any enrollments that matched your search criteria", "We could not find any enrollments that matched your search criteria", "We could not find any enrollments that matched your search criteria", "Error Message is dislayed", "Error message is not displayed");
	
} else {
	test.log(LogStatus.FAIL, "Navigates to Online Application");
}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");
}
	

public static void EmailModule() {
	//Edit Module
	clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
	threadWait(2500);
	validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
	selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
	threadWait(2500);
	clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
	threadWait(2500);
	String parentWindowHandle = driver.getWindowHandle();
	System.out.println("parentWindowHandle"+parentWindowHandle);
	SwitchToChild();
	threadWait(5000);
	enterTextboxValue("ConsolidatedStatusCheck", "EmailAddress", "ESG Values", "Consolidated Status Check", 5, 1);
	threadWait(2500);
	clickWebelement("ConsolidatedStatusCheck", "Search");
	threadWait(2500);
	defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
	threadWait(5000);
	if (driver.getPageSource().contains("Edit")) {
		test.log(LogStatus.PASS, "Edit option is Available");
		
	} else {
		test.log(LogStatus.FAIL, "Edit option is not Available under the Available Action tab");

	}
	driver.switchTo().window(parentWindowHandle);
	clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");
//Record Module
	ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "EmailAddress", "ESG Values", "Consolidated Status Check", 5, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("Record Installation Results")) {
	test.log(LogStatus.PASS, "Record Installation Results option is Available");
	clickWebelement("ConsolidatedStatusCheck", "Record");
	threadWait(5000);
	
} else {
	test.log(LogStatus.FAIL, "Record Installation Results option is not Available under the Available Action tab");

}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");

//Cancel Module
ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "EmailAddress", "ESG Values", "Consolidated Status Check", 5, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contentEquals("Cancel Application")) {
test.log(LogStatus.PASS, "Cancel Application option is Available");
threadWait(5000);
clickWebelement("ConsolidatedStatusCheck", "Cancel");
threadWait(5000);

} else {
test.log(LogStatus.PASS, "Cancel Application option is not Available under the Available Action tab");

}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");

//Invalid Module
ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "EmailAddress", "ESG Values", "Consolidated Status Check", 5, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
//defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("We could not find any enrollments that matched your search criteria")) {
ValidateWithElement("ConsolidatedStatusCheck", "StatusMsg", "We could not find any enrollments that matched your search criteria", "We could not find any enrollments that matched your search criteria", "We could not find any enrollments that matched your search criteria", "Error Message is dislayed", "Error message is not displayed");

} else {
test.log(LogStatus.PASS, "Navigates to Search Results page");
}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");
}
public static void PhoneModule() {
	//Edit Module
	clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
	threadWait(2500);
	validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
	selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
	threadWait(2500);
	clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
	threadWait(2500);
	String parentWindowHandle = driver.getWindowHandle();
	System.out.println("parentWindowHandle"+parentWindowHandle);
	SwitchToChild();
	threadWait(5000);
	enterTextboxValue("ConsolidatedStatusCheck", "PhoneNumber", "ESG Values", "Consolidated Status Check", 6, 1);
	threadWait(2500);
	clickWebelement("ConsolidatedStatusCheck", "Search");
	threadWait(2500);
	defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
	threadWait(5000);
	if (driver.getPageSource().contains("Edit")) {
		test.log(LogStatus.PASS, "Edit option is Available");
		
	} else {
		test.log(LogStatus.FAIL, "Edit option is not Available under the Available Action tab");

	}
	driver.switchTo().window(parentWindowHandle);
	clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");
//Record Module
	ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "PhoneNumber", "ESG Values", "Consolidated Status Check", 6, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("Record Installation Results")) {
	test.log(LogStatus.PASS, "Record Installation Results option is Available");
	clickWebelement("ConsolidatedStatusCheck", "Record");
	threadWait(5000);
	
} else {
	test.log(LogStatus.FAIL, "Record Installation Results option is not Available under the Available Action tab");

}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");

//Cancel Module
ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "PhoneNumber", "ESG Values", "Consolidated Status Check", 6, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("Cancel Application")) {
test.log(LogStatus.PASS, "Cancel Application option is Available");
threadWait(5000);
clickWebelement("ConsolidatedStatusCheck", "Cancel");
threadWait(5000);

} else {
test.log(LogStatus.FAIL, "Cancel Application option is not Available under the Available Action tab");

}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");

//Invalid Module
ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "PhoneNumber", "ESG Values", "Consolidated Status Check", 6, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
//defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("We could not find any enrollments that matched your search criteria")) {
	test.log(LogStatus.PASS, "Does not display any error message");
} else {
test.log(LogStatus.FAIL, "Navigates to Search results Page");
}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");
}
public static void EnrollmentModule() {
	//Edit Module
	clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
	threadWait(2500);
	validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
	validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
	selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
	threadWait(2500);
	clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
	threadWait(2500);
	String parentWindowHandle = driver.getWindowHandle();
	System.out.println("parentWindowHandle"+parentWindowHandle);
	SwitchToChild();
	threadWait(5000);
	enterTextboxValue("ConsolidatedStatusCheck", "EnrollmentNumber", "ESG Values", "Consolidated Status Check", 7, 1);
	threadWait(2500);
	clickWebelement("ConsolidatedStatusCheck", "Search");
	threadWait(2500);
	defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
	threadWait(5000);
	if (driver.getPageSource().contains("Edit")) {
		test.log(LogStatus.PASS, "Edit option is Available");
		clickWebelement("ConsolidatedStatusCheck", "EditApplication");
		
	} else {
		test.log(LogStatus.FAIL, "Edit option is not Available under the Available Action tab");

	}
	driver.switchTo().window(parentWindowHandle);
	clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");
//Record Module
	ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "EnrollmentNumber", "ESG Values", "Consolidated Status Check", 7, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("Record Installation Results")) {
	test.log(LogStatus.PASS, "Record Installation Results option is Available");
	clickWebelement("ConsolidatedStatusCheck", "Record2");
	threadWait(5000);
	
} else {
	test.log(LogStatus.FAIL, "Record Installation Results option is not Available under the Available Action tab");

}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");

//Cancel Module
ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "EnrollmentNumber", "ESG Values", "Consolidated Status Check", 7, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("Cancel Application")) {
test.log(LogStatus.PASS, "Cancel Application option is Available");
threadWait(5000);
clickWebelement("ConsolidatedStatusCheck", "Cancel2");
threadWait(5000);

} else {
test.log(LogStatus.FAIL, "Cancel Application option is not Available under the Available Action tab");

}
driver.switchTo().window(parentWindowHandle);
clickWebelement("ConsolidatedStatusCheck", "ConsolidationStatusOk");

//Invalid Module
ClickByActionClass("ConsolidatedStatusCheck", "MainMenu", "ESG Values", "Consolidated Status Check", 1, 1);
clickWebelement("ConsolidatedStatusCheck", "StatusCheckURL");
threadWait(2500);
validationWithelementVisibility("ConsolidatedStatusCheck", "AccountNumberCheckBoxEnabled", "The Account Number Check box is Disabled", "The Account NumberCheckbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EmailAddressCheckBoxEnabled", "The Email Address Check box is Disabled", "The Email Address Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "PhoneNumberCheckBoxEnabled", "The Phone Number Check box is Disabled", "The Phone Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "EnrollmentNumberCheckBoxEnabled", "The Enrollment Number Check box is Disabled", "The Enrollment Number Checkbox is Enabled");
validationWithelementVisibility("ConsolidatedStatusCheck", "UrlEnabled", "The Url Enabled Check box is Disabled", "The Url Enabled Checkbox is Enabled");
selectDropdownByVisibleText("ConsolidatedStatusCheck", "ServiceProvider", "ESG Values", "Consolidated Status Check", 2, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "OnlineApplication");
threadWait(2500);
SwitchToChild();
threadWait(5000);
enterTextboxValue("ConsolidatedStatusCheck", "EnrollmentNumber", "ESG Values", "Consolidated Status Check", 7, 1);
threadWait(2500);
clickWebelement("ConsolidatedStatusCheck", "Search");
threadWait(2500);
//defineLogs("Consolidated Status Check", "Consolidated Status Check", "Consolidated Status Check", "The Search results are successfully Displayed", "Search Results are not displayed", "ConsolidatedStatusCheck", "AccountResultsValidation");
threadWait(5000);
if (driver.getPageSource().contains("We could not find any enrollments that matched your search criteria")) {
test.log(LogStatus.PASS, "Does not display any error message");
} else {
test.log(LogStatus.FAIL, "Navigates to Online Application");
}
threadWait(5000);
driver.quit();
}
}

