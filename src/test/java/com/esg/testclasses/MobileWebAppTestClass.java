package com.esg.testclasses;

import java.awt.AWTException;
import org.openqa.selenium.By;
import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class MobileWebAppTestClass extends HelperClass {
	
	public static void OpenWebURL() {
		setProperty("MobileWebApp", "chrome", "Chrome_Path");
		openChrome();
		maximizeWindow();
		openURL("MobileWebApp", "WebURL");
		test.log(LogStatus.INFO, "This Script is running against the version - https://esg-eecp-qa2.directapps.int/47.0//m/rebates/AMWA/AMWAM1");
		threadWait(5000);
		defineLogs("Congratulations on your purchase!", "Automation Mobil Web App Measure 1", "Automation Mobil Web App Measure 1", "Mobile Web Application is open successfully", "Mobile Web Application is failed to open", "MobileWebApp", "WebUrlValidation");
		threadWait(5000);
	}
	public static void ProgramEligibiltyError(){
		enterTextboxValue("MobileWebApp", "Make", "ESG Values", "MobileWebApp", 3, 1);
		enterTextboxValue("MobileWebApp", "Model", "ESG Values", "MobileWebApp", 4, 1);
		enterTextboxValue("MobileWebApp", "SerialNumber", "ESG Values", "MobileWebApp", 5, 1);
		clickWebelement("MobileWebApp", "NextButton");
		clickWebelement("MobileWebApp", "Upload");
		try {
			UploadFile("MobileWebApp", "FilePath");
		} catch (AWTException e) {
			e.printStackTrace();
		}
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "AcceptButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		enterTextboxValue("MobileWebApp", "AccountName", "ESG Values", "MobileWebApp", 6, 1);
		enterTextboxValue("MobileWebApp", "AccountNumber", "ESG Values", "MobileWebApp", 7, 1);
		enterTextboxValue("MobileWebApp", "EmailID", "ESG Values", "MobileWebApp", 8, 1);
		enterTextboxValue("MobileWebApp", "PhoneNumber", "ESG Values", "MobileWebApp", 9, 1);
		clickWebelement("MobileWebApp", "Submit");
		explicitWait(3000, "MobileWebApp", "RebateNumber");
		String Copy = driver.findElement(By.xpath("//div[@class='confirmation-wrapper']/child::div/child::p[2]")).getText();
		defineLogs("Your rebate has been submitted!", "Automation - Mobile Web App", "Automation - Mobile Web App", "The new enrollment Number is generated", "Enrollment number is not generated", "MobileWebApp", "RebateNumber");
		login2(1, 0, 1, 1);
		ClickByActionClass("MobileWebApp", "MainMenu", "ESG Values", "MobileWebApp", 10, 1);
		threadWait(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_cphSiteMaster_txtEnrollmentNumber']")).sendKeys(Copy);
		clickWebelement("MobileWebApp", "EnrollmentSearchButton");
		threadWait(5000);
		clickWebelement("MobileWebApp", "EnrollmentList");
		threadWait(2500);
		defineLogs("Application", "Open - In Review", "Open - In Review", "Application status is successfully Validated", "Application status is Failed to Validated", "MobileWebApp", "ApplicationStatus");
	}
	public static void MeasureEligibilityError() {
		openURL("MobileWebApp", "WebURL");
		threadWait(5000);
		enterTextboxValue("MobileWebApp", "Make", "ESG Values", "MobileWebApp", 13, 1);
		enterTextboxValue("MobileWebApp", "Model", "ESG Values", "MobileWebApp", 14, 1);
		enterTextboxValue("MobileWebApp", "SerialNumber", "ESG Values", "MobileWebApp", 15, 1);
		clickWebelement("MobileWebApp", "NextButton");
		clickWebelement("MobileWebApp", "Upload");
		try {
			UploadFile("MobileWebApp", "FilePath");
		} catch (AWTException e) {
			e.printStackTrace();
		}
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "AcceptButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		enterTextboxValue("MobileWebApp", "AccountName", "ESG Values", "MobileWebApp", 16, 1);
		enterTextboxValue("MobileWebApp", "AccountNumber", "ESG Values", "MobileWebApp", 17, 1);
		enterTextboxValue("MobileWebApp", "EmailID", "ESG Values", "MobileWebApp", 18, 1);
		enterTextboxValue("MobileWebApp", "PhoneNumber", "ESG Values", "MobileWebApp", 19, 1);
		clickWebelement("MobileWebApp", "Submit");
		explicitWait(3000, "MobileWebApp", "RebateNumber");
		defineLogs("Your rebate has been submitted!", "Automation - Mobile Web App", "Automation - Mobile Web App", "The new enrollment Number is generated", "Enrollment number is not generated", "MobileWebApp", "RebateNumber");
		String Copy = driver.findElement(By.xpath("//div[@class='confirmation-wrapper']/child::div/child::p[2]")).getText();
		login2(1, 0, 1, 1);
		ClickByActionClass("MobileWebApp", "MainMenu", "ESG Values", "MobileWebApp", 10, 1);
		threadWait(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_cphSiteMaster_txtEnrollmentNumber']")).sendKeys(Copy);
		clickWebelement("MobileWebApp", "EnrollmentSearchButton");
		threadWait(5000);
		clickWebelement("MobileWebApp", "EnrollmentList");
		threadWait(2500);
		defineLogs("Application", "Open - In Review", "Open - In Review", "Application status is successfully Validated", "Application status is Failed to Validated", "MobileWebApp", "ApplicationStatus");
	}
	public static void MeasurePropertyValidationError() {
		openURL("MobileWebApp", "WebURL");
		threadWait(5000);
		enterTextboxValue("MobileWebApp", "Make", "ESG Values", "MobileWebApp", 22, 1);
		enterTextboxValue("MobileWebApp", "Model", "ESG Values", "MobileWebApp", 23, 1);
		enterTextboxValue("MobileWebApp", "SerialNumber", "ESG Values", "MobileWebApp", 24, 1);
		clickWebelement("MobileWebApp", "NextButton");
		clickWebelement("MobileWebApp", "Upload");
		try {
			UploadFile("MobileWebApp", "FilePath");
		} catch (AWTException e) {
			e.printStackTrace();
		}
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "AcceptButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		enterTextboxValue("MobileWebApp", "AccountName", "ESG Values", "MobileWebApp", 25, 1);
		enterTextboxValue("MobileWebApp", "AccountNumber", "ESG Values", "MobileWebApp", 26, 1);
		enterTextboxValue("MobileWebApp", "EmailID", "ESG Values", "MobileWebApp", 27, 1);
		enterTextboxValue("MobileWebApp", "PhoneNumber", "ESG Values", "MobileWebApp", 28, 1);
		clickWebelement("MobileWebApp", "Submit");
		explicitWait(3000, "MobileWebApp", "RebateNumber");
		defineLogs("Your rebate has been submitted!", "Automation - Mobile Web App", "Automation - Mobile Web App", "The new enrollment Number is generated", "Enrollment number is not generated", "MobileWebApp", "RebateNumber");
		String Copy = driver.findElement(By.xpath("//div[@class='confirmation-wrapper']/child::div/child::p[2]")).getText();
		
		login2(1, 0, 1, 1);
		ClickByActionClass("MobileWebApp", "MainMenu", "ESG Values", "MobileWebApp", 10, 1);
		threadWait(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_cphSiteMaster_txtEnrollmentNumber']")).sendKeys(Copy);
		clickWebelement("MobileWebApp", "EnrollmentSearchButton");
		threadWait(5000);
		clickWebelement("MobileWebApp", "EnrollmentList");
		threadWait(2500);
		defineLogs("Application", "Closed - Work Completed", "Closed - Work Completed", "Application status is successfully Validated", "Application status is Failed to Validated", "MobileWebApp", "ApplicationStatus");
	}
	public static void AccountValidationError() {
		openURL("MobileWebApp", "WebURL");
		threadWait(5000);
		enterTextboxValue("MobileWebApp", "Make", "ESG Values", "MobileWebApp", 31, 1);
		enterTextboxValue("MobileWebApp", "Model", "ESG Values", "MobileWebApp", 32, 1);
		enterTextboxValue("MobileWebApp", "SerialNumber", "ESG Values", "MobileWebApp", 33, 1);
		clickWebelement("MobileWebApp", "NextButton");
		clickWebelement("MobileWebApp", "Upload");
		try {
			UploadFile("MobileWebApp", "FilePath");
		} catch (AWTException e) {
			e.printStackTrace();
		}
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "AcceptButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "LookUp");
		threadWait(2500);
		enterTextboxValue("MobileWebApp", "AccountName", "ESG Values", "MobileWebApp", 33, 1);
		enterTextboxValue("MobileWebApp", "EmailID", "ESG Values", "MobileWebApp", 34, 1);
		enterTextboxValue("MobileWebApp", "PhoneNumber", "ESG Values", "MobileWebApp", 35, 1);
		enterTextboxValue("MobileWebApp", "LookStreetAddress", "ESG Values", "MobileWebApp", 36, 1);
		enterTextboxValue("MobileWebApp", "LookCity", "ESG Values", "MobileWebApp", 37, 1);
		enterTextboxValue("MobileWebApp", "LookState", "ESG Values", "MobileWebApp", 38, 1);
		enterTextboxValue("MobileWebApp", "LookZipCode", "ESG Values", "MobileWebApp", 39, 1);
		clickWebelement("MobileWebApp", "Submit");
		explicitWait(3000, "MobileWebApp", "RebateNumber");
		defineLogs("Your rebate has been submitted!", "Automation - Mobile Web App", "Automation - Mobile Web App", "The new enrollment Number is generated", "Enrollment number is not generated", "MobileWebApp", "RebateNumber");
		String Copy = driver.findElement(By.xpath("//div[@class='confirmation-wrapper']/child::div/child::p[2]")).getText();
		login2(1, 0, 1, 1);
		ClickByActionClass("MobileWebApp", "MainMenu", "ESG Values", "MobileWebApp", 10, 1);
		threadWait(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_cphSiteMaster_txtEnrollmentNumber']")).sendKeys(Copy);
		clickWebelement("MobileWebApp", "EnrollmentSearchButton");
		threadWait(5000);
		clickWebelement("MobileWebApp", "EnrollmentList");
		threadWait(2500);
		defineLogs("Application", "Open - In Review", "Open - In Review", "Application status is successfully Validated", "Application status is Failed to Validated", "MobileWebApp", "ApplicationStatus");
	}
	public static void ThresholdExceed() {
		openURL("MobileWebApp", "WebURL");
		threadWait(5000);
		enterTextboxValue("MobileWebApp", "Make", "ESG Values", "MobileWebApp", 41, 1);
		enterTextboxValue("MobileWebApp", "Model", "ESG Values", "MobileWebApp", 42, 1);
		enterTextboxValue("MobileWebApp", "SerialNumber", "ESG Values", "MobileWebApp", 43, 1);
		clickWebelement("MobileWebApp", "NextButton");
		clickWebelement("MobileWebApp", "Upload");
		try {
			UploadFile("MobileWebApp", "FilePath");
		} catch (AWTException e) {
			e.printStackTrace();
		}
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "AcceptButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		enterTextboxValue("MobileWebApp", "AccountName", "ESG Values", "MobileWebApp", 44, 1);
		enterTextboxValue("MobileWebApp", "AccountNumber", "ESG Values", "MobileWebApp", 45, 1);
		enterTextboxValue("MobileWebApp", "EmailID", "ESG Values", "MobileWebApp", 46, 1);
		enterTextboxValue("MobileWebApp", "PhoneNumber", "ESG Values", "MobileWebApp", 47, 1);
		clickWebelement("MobileWebApp", "Submit");
		explicitWait(3000, "MobileWebApp", "RebateNumber");
		defineLogs("Your rebate has been submitted!", "Automation - Mobile Web App", "Automation - Mobile Web App", "The new enrollment Number is generated", "Enrollment number is not generated", "MobileWebApp", "RebateNumber");
		String Copy = driver.findElement(By.xpath("//div[@class='confirmation-wrapper']/child::div/child::p[2]")).getText();
		login2(1, 0, 1, 1);
		ClickByActionClass("MobileWebApp", "MainMenu", "ESG Values", "MobileWebApp", 10, 1);
		threadWait(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_cphSiteMaster_txtEnrollmentNumber']")).sendKeys(Copy);
		clickWebelement("MobileWebApp", "EnrollmentSearchButton");
		threadWait(5000);
		clickWebelement("MobileWebApp", "EnrollmentList");
		threadWait(2500);
		defineLogs("Application", "Closed - Work Completed", "Closed - Work Completed", "Application status is successfully Validated", "Application status is Failed to Validated", "MobileWebApp", "ApplicationStatus");
	}
	public static void PositiveWorkflow() {
		openURL("MobileWebApp", "WebURL");
		threadWait(5000);
		enterTextboxValue("MobileWebApp", "Make", "ESG Values", "MobileWebApp", 49, 1);
		enterTextboxValue("MobileWebApp", "Model", "ESG Values", "MobileWebApp", 50, 1);
		enterTextboxValue("MobileWebApp", "SerialNumber", "ESG Values", "MobileWebApp", 51, 1);
		clickWebelement("MobileWebApp", "NextButton");
		clickWebelement("MobileWebApp", "Upload");
		try {
			UploadFile("MobileWebApp", "FilePath");
		} catch (AWTException e) {
			e.printStackTrace();
		}
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "AcceptButton");
		threadWait(2500);
		clickWebelement("MobileWebApp", "NextButton");
		threadWait(2500);
		enterTextboxValue("MobileWebApp", "AccountName", "ESG Values", "MobileWebApp", 52, 1);
		enterTextboxValue("MobileWebApp", "AccountNumber", "ESG Values", "MobileWebApp", 53, 1);
		enterTextboxValue("MobileWebApp", "EmailID", "ESG Values", "MobileWebApp", 54, 1);
		enterTextboxValue("MobileWebApp", "PhoneNumber", "ESG Values", "MobileWebApp", 55, 1);
		clickWebelement("MobileWebApp", "Submit");
		explicitWait(3000, "MobileWebApp", "RebateNumber");
		defineLogs("Your rebate has been submitted!", "Automation - Mobile Web App", "Automation - Mobile Web App", "The new enrollment Number is generated", "Enrollment number is not generated", "MobileWebApp", "RebateNumber");
		String Copy = driver.findElement(By.xpath("//div[@class='confirmation-wrapper']/child::div/child::p[2]")).getText();
		login2(1, 0, 1, 1);
		ClickByActionClass("MobileWebApp", "MainMenu", "ESG Values", "MobileWebApp", 10, 1);
		threadWait(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_cphSiteMaster_txtEnrollmentNumber']")).sendKeys(Copy);
		clickWebelement("MobileWebApp", "EnrollmentSearchButton");
		threadWait(5000);
		clickWebelement("MobileWebApp", "EnrollmentList");
		threadWait(2500);
		defineLogs("Application", "Closed - Work Completed", "Closed - Work Completed", "Application status is successfully Validated", "Application status is Failed to Validated", "MobileWebApp", "ApplicationStatus");
		Close();
	}

}
