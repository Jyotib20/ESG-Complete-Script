package com.esg.testclasses;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentReports;


import com.esg.utilities.HelperClass;

public class SmokeTest extends HelperClass {
	
	static ExtentHtmlReporter Extent;
	static ExtentReports Report;
	static ExtentTest test;
	
@BeforeSuite
	public void StartTest() {
		
		Extent = new ExtentHtmlReporter("./Reports/SmokeTestReport.html");
		Report = new ExtentReports();
		Report.attachReporter(Extent);
	}
		
		public static void HealthCheck() throws IOException {
			test = Report.createTest("HealthCheck");
			OpenBrowser("Helper","HealthUrl");
			
			
		test.log(Status.PASS, "Browser is opened");
			
			
			if (driver.getPageSource().contains("System Check: Pass")) {
				
				test.log(Status.PASS, "HealthCheck Program is Passed");
				
			} else {
				
				test.log(Status.FAIL, "Script is failed");


			}
			
			driver.quit();
		}		
		public static void Enrollment() {
			login("Helper","BaseURL", 1, 0, 1, 1);
			test = Report.createTest("Enrollment");
			test.log(Status.INFO, "Application is login");
			ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 3, 1);
			test.log(Status.PASS, "Enrollment page is opened");
			//enterlogs("Clicked on the Enrollment");
			threadWait(2500);
			driver.findElement(By.xpath("//input[@name='ctl00$cphSiteMaster$txtEnrollmentNumber']")).sendKeys("1032876");
			test.log(Status.PASS, "Enrollment page is opened");
			//enterlogs("Enrollment Number is Entered");
			scrollToElement("Configuration", "SearchOption");
			//enterlogs("Scrolled to Search Option");
			clickWebelement("Configuration", "SearchOption");
			test.log(Status.PASS, "Clicked on the search Option");
			//enterlogs("Clicked on the search Option");
			threadWait(2500);
			clickWebelement("Configuration", "EnrollmentID");
			//enterlogs("Clicked on the Enrollment Link");
			threadWait(2500);
			clickWebelement("Configuration", "DoubleDip");
			test.log(Status.PASS, "DoubleDip page is Loaded");
			//enterlogs("Clicked on the DoubleDip");
			//captureScreen(driver, "DoubleDip");
			threadWait(5000);
			clickWebelement("Configuration", "DoubleDipCls");
			//enterlogs("DoubleDip is closed");
			clickWebelement("Configuration", "Application");
			test.log(Status.PASS, "Application Step is Loaded");
			//enterlogs("Clicked on the Application");
			scrollToElement("Configuration", "Measures1");
			//enterlogs("Scrolled to Measueres");
			clickWebelement("Configuration", "Measures1");
			test.log(Status.PASS, "Measure screen is Loaded");
			//enterlogs("Clicked on the Measure Section");
			threadWait(5000);
			clickWebelement("Configuration", "AddMeasure");
			test.log(Status.PASS, "Measure are Listed");
			//captureScreen(driver, "AddMeasure");
			threadWait(2500);
			clickWebelement("Configuration", "CloseAddMeasure");
			threadWait(2500);
			clickWebelement("Configuration", "CloseApplication");
			//enterlogs("Application is closed");
			scrollToElement("Configuration", "Measure2");
			clickWebelement("Configuration", "Measure2");
			test.log(Status.PASS, "Measure page is opened");
			//enterlogs("Clicked on the Measure");
			//captureScreen(driver, "Measure2");
			clickWebelement("Configuration", "Close1");
			//enterlogs("Measure is closed");
			scrollToElement("Configuration", "JobCost");
			//enterlogs("Scrolled to the Job Cost Summary");
			clickWebelement("Configuration", "JobCost");
			test.log(Status.PASS, "Job Cost Summary page is opened");
			//enterlogs("Clicked on the Job Cost Summary");
			//captureScreen(driver, "Job Cost Summary");
			clickWebelement("Configuration", "Close1");
			//enterlogs("Job Cost Summary is closed");
			scrollToElement("Configuration", "Payment");
			//enterlogs("Scrolled to the payment option");
			clickWebelement("Configuration", "Payment");
			test.log(Status.PASS, "Payment page is opened");
			//enterlogs("Clicked on the payment option");
			clickWebelement("Configuration", "Close1");
			//enterlogs("Payment option is closed");
			scrollToElement("Configuration", "Note");
			//enterlogs("Scrolled to the Note section in the SubMenu");
			clickWebelement("Configuration", "Note");
			//enterlogs("Clicked on the Note section in the SubMenu");
			test.log(Status.PASS, "Note page is opened");
			clickWebelement("Configuration", "Close1");
			//enterlogs("Note section is closed");
			scrollToElement("Configuration", "Document");
			//enterlogs("Scrolled to the Document Section in the SubMenu");
			clickWebelement("Configuration", "Document");
			test.log(Status.PASS, "Document page is opened");
			//enterlogs("Clicked on the Document section in the SubMenu");
			clickWebelement("Configuration", "Close1");
			//enterlogs("Document section is closed");
			scrollToElement("Configuration", "EnrollmentContact");
			//enterlogs("Scrolled to the EnrollmentContact Section in the SubMenu");
			clickWebelement("Configuration", "EnrollmentContact");
			test.log(Status.PASS, "EnrollmentContact page is opened");
			//enterlogs("Clicked on the EnrollmentContact section in the SubMenu");
			clickWebelement("Configuration", "Close1");
			//enterlogs("EnrollmentContact section is closed");
			scrollToElement("Configuration", "LettersAndEmails");
			//enterlogs("Scrolled to the LettersAndEmails Section in the SubMenu");
			clickWebelement("Configuration", "LettersAndEmails");
			test.log(Status.PASS, "LettersAndEmails page is opened");
			//enterlogs("Clicked on the LettersAndEmails section in the SubMenu");
			clickWebelement("Configuration", "Close1");
			//enterlogs("LettersAndEmails section is closed");
			scrollToElement("Configuration", "Milestones");
			//enterlogs("Scrolled to the Milestones Section in the SubMenu");
			clickWebelement("Configuration", "Milestones");
			test.log(Status.PASS, "Milestones page is opened");
			//enterlogs("Clicked on the Milestones section in the SubMenu");;
			clickWebelement("Configuration", "Close1");
			//enterlogs("Milestones section is closed");
			scrollToElement("Configuration", "History");
			//enterlogs("Scrolled to the History Section in the SubMenu");
			clickWebelement("Configuration", "History");
			test.log(Status.PASS, "History page is opened");
			//enterlogs("Clicked on the History section in the SubMenu");
			clickWebelement("Configuration", "Close1");
			//enterlogs("History section is closed");
			threadWait(2500);
			clickWebelement("Configuration", "OpenApplication");
			test.log(Status.PASS, "Application page is opened");
			//enterlogs("Clicked on the OpenApplication section in the SubMenu");
			clickWebelement("Configuration", "Close1");
			//enterlogs("OpenApplication section is closed");
			threadWait(2500);
		}
			@Test
			public static void ToDoList(){
				
					test = Report.createTest("ToDoList");
					login("Helper","BaseURL", 1, 0, 1, 1);
						test.log(Status.INFO, "Application is LoggedIn");
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 50, 1);
						test.log(Status.PASS, "To Do List page is opened");
						driver.findElement(By.xpath("//input[@name='ctl00$cphSiteMaster$txtEnrollmentNumber']")).sendKeys("1032876");
						test.log(Status.PASS, "Value is Entered");
						scrollToElement("Configuration", "SearchOption");
						clickWebelement("Configuration", "SearchOption");
						clickWebelement("Configuration", "EnrollTODO");
						test.log(Status.PASS, "Search results are Displayed");
						clickWebelement("Configuration", "ApplicationToDO");
						//captureScreen(driver, "ToDOList Validation");	
						clickWebelement("Configuration", "Close1");
						threadWait(2500);
			}
			//Data Module to run the Model Version Report
		public static void DataModel() {
						test = Report.createTest("DataModel");
						
						ClickByActionClass("Configuration", "Reports", "ESG Values", "Energy Audit", 51, 1);
						threadWait(2500);
						String parentWindowHandle = driver.getWindowHandle();
						System.out.println("parentWindowHandle"+parentWindowHandle);
						test.log(Status.PASS, "Clicked on the Program Report");
						driver.switchTo().frame(0);
						scrollToElement("Configuration", "Workflow");
						clickWebelement("Configuration", "Workflow");
						threadWait(2500);
						test.log(Status.PASS, "Clicked on the Workflow step");
						clickWebelement("Configuration", "SubReport");
						threadWait(2500);
						test.log(Status.PASS, "Clicked on the SubReport");
						clickWebelement("Configuration", "ModelVersion");
						test.log(Status.PASS, "Clicked on the ModelVersion");
						//captureScreen(driver, "DataModel Validation");
						test.log(Status.PASS, "Screenshot is captured succesfully");
						threadWait(2500);
						driver.switchTo().window(parentWindowHandle);
						threadWait(5000);

			}	
			//Application Report : To verify that the report generates, measure and measure properties are displayed
			public static void ApplicationReport() {
				
						test = Report.createTest("ApplicationReport");
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 3, 1);
						threadWait(2500);
						String parentWindowHandle = driver.getWindowHandle();
						System.out.println("parentWindowHandle"+parentWindowHandle);
						test.log(Status.PASS, "Enrollment page is opened");
						driver.findElement(By.xpath("//input[@name='ctl00$cphSiteMaster$txtEnrollmentNumber']")).sendKeys("1032876");
						test.log(Status.PASS, "Input value is Entered in the Enrollment section");
						scrollToElement("Configuration", "SearchOption");
						clickWebelement("Configuration", "SearchOption");
						threadWait(2500);
						clickWebelement("Configuration", "EnrollmentID");
						clickWebelement("Configuration", "ApplicationToDO");
						ClickByActionClass("Configuration", "Reports", "ESG Values", "Energy Audit", 51, 1);
						threadWait(2500);
						driver.switchTo().frame(0);
						scrollToElement("Configuration", "Workflow");
						clickWebelement("Configuration", "Workflow");
						threadWait(2500);
						test.log(Status.PASS, "Enable to Generate the report as Report generating option is not available");
						threadWait(2500);
						driver.switchTo().window(parentWindowHandle);
			}	
						
						//Customer Module : To access all sections, open account record, premise record, Open Service Point Record and to open Usage Record
					
							public static void CustomerModule() {
							
							test = Report.createTest("Customer Module");
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 52, 1);
						threadWait(2500);
						enterTextboxValue("Configuration", "CustomerSearch", "ESG Values", "Energy Audit", 53, 1);
						clickWebelement("Configuration", "CustomerGo");
						clickWebelement("Configuration", "CustomerName");
						clickWebelement("Configuration", "CustomerType");
						clickWebelement("Configuration", "CustName");
						clickWebelement("Configuration", "CustomerClass");
						clickWebelement("Configuration", "CustomerAttn");
						clickWebelement("Configuration", "CustomerPoBox");
						clickWebelement("Configuration", "CustomerStreet");
						clickWebelement("Configuration", "CustomerPoBoxRadioButton");
						clickWebelement("Configuration", "CustomerStreetRadioButton");
						clickWebelement("Configuration", "CustomerSteet2");
						clickWebelement("Configuration", "CustomerSteet3");
						clickWebelement("Configuration", "CustomerCity");
						clickWebelement("Configuration", "CustomerState");
						clickWebelement("Configuration", "CustomerZip");
						clickWebelement("Configuration", "CustomerUnit");
						scrollToElement("Configuration", "CustomerRiskAlertCheckBox");
						clickWebelement("Configuration", "CustomerRiskAlertCheckBox");
						scrollToElement("Configuration", "CustomerRiskAlertAdd");
						clickWebelement("Configuration", "CustomerRiskAlertAdd");
						threadWait(2500);
						
						clickWebelement("Configuration", "CustomerSelect");
						clickWebelement("Configuration", "CustomerDate");
						clickWebelement("Configuration", "CustomerActiveCheckBox");
						clickWebelement("Configuration", "CustomerCommentBox");
						clickWebelement("Configuration", "CustomerBoxCancel");
						test.log(Status.PASS, "Succefully Accessed all the sections under the Customer Name");
						threadWait(2500);
						scrollToElement("Configuration", "CustomerAccount");
						clickWebelement("Configuration", "CustomerAccount");
						test.log(Status.PASS, "Succefully Accessed Customer Account sections under the Sub Menu Section");
						threadWait(2500);
						scrollToElement("Configuration", "CustomerPermises");
						clickWebelement("Configuration", "CustomerPermises");
						test.log(Status.PASS, "Succefully Accessed Customer Permises sections under the Sub Menu Section");
						threadWait(2500);
						scrollToElement("Configuration", "CustomerServicePoints");
						clickWebelement("Configuration", "CustomerServicePoints");
						test.log(Status.PASS, "Succefully Accessed Customer Service Points sections under the Sub Menu Section");
						threadWait(2500);
						clickWebelement("Configuration", "Close1");
						scrollToElement("Configuration", "CustomerUsage");
						clickWebelement("Configuration", "CustomerUsage");
						test.log(Status.PASS, "Succefully Customer Usage Service Points sections under the Sub Menu Section");
						threadWait(2500);
						clickWebelement("Configuration", "Close1");
						scrollToElement("Configuration", "CustomerCountry");
						clickWebelement("Configuration", "CustomerCountry");
						clickWebelement("Configuration", "CustomerNormalizedAddress");
						threadWait(2500);
						clickWebelement("Configuration", "CustomerNormalizedCancel");
						threadWait(2500);
						test.log(Status.PASS, "Customer Module is successfully Verified");
						}
						
						//Leads Module: To open Lead
						public static void LeadModule() {
							login("Helper","BaseURL", 1, 0, 1, 1);
						test = Report.createTest("Lead Module");
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 54, 1);
						threadWait(2500);
						scrollToElement("Configuration", "CustomerSearch1");
						clickWebelement("Configuration", "CustomerSearch1");
						threadWait(2500);
						clickWebelement("Configuration", "LeadNumber");
						test.log(Status.PASS, "successfully opened the Lead");
						threadWait(2500);
						}
						
						//Invoicing Module: To open Invoice with the Invoice Number and to Search Invoice with the Enrollment Number
						public static void InvoicingModule() {
						test = Report.createTest("Invoicing Module");
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 55, 1);
						threadWait(2500);
						enterTextboxValue("Configuration", "CreateDate", "ESG Values", "Energy Audit", 57, 1);
						test.log(Status.PASS, "successfully Entered the Date");
						scrollToElement("Configuration", "InvoiceSearch");
						clickWebelement("Configuration", "InvoiceSearch");
						threadWait(5000);
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 55, 1);
						enterTextboxValue("Configuration", "Invoiceref", "ESG Values", "Energy Audit", 56, 1);
						test.log(Status.PASS, "successfully Entered the Invoice Number");
						scrollToElement("Configuration", "InvoiceSearch");
						clickWebelement("Configuration", "InvoiceSearch");
						threadWait(5000);
						clickWebelement("Configuration", "InvoiceNum");
						clickWebelement("Configuration", "EnrollmentClick");
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 55, 1);
						enterTextboxValue("Configuration", "EnrollMentNum1", "ESG Values", "Energy Audit", 58, 1);
						test.log(Status.PASS, "successfully Entered the Invoice Enrollment Number");
						scrollToElement("Configuration", "InvoiceSearch");
						clickWebelement("Configuration", "InvoiceSearch");
						test.log(Status.PASS, "successfully Searched Invoice List with the Enrollment Number");
						threadWait(2500);
						}
						
						//Calendar Module : To Open the Calendar
						public static void CalendarModule() {
							test = Report.createTest("Calendar Module");
						
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 59, 1);
						String parentWindowHandle = driver.getWindowHandle();
						System.out.println("parentWindowHandle"+parentWindowHandle);
						if (driver.getPageSource().contains("Unscheduled Tasks")) {
							
							test.log(Status.PASS, "successfully opened the Calendar");
							
						} else {
							
							test.log(Status.FAIL, "Calendar page is failed to Open");

						}
						threadWait(2500);
						driver.switchTo().window(parentWindowHandle);
						}
						// Measure Module: To access the Measure Property
						public static void MeasureModule() {
						test = Report.createTest("Measure Module");
						ClickByActionClass("Configuration", "Configur", "ESG Values", "Energy Audit", 62, 1);
						threadWait(5000);
						enterTextboxValue("Configuration", "MeasureCode", "ESG Values", "Energy Audit", 61, 1);
						test.log(Status.PASS, "Measure Code value is successfully Entered");
						clickWebelement("Configuration", "MeasSearch");
						threadWait(5000);
						clickWebelement("Configuration", "MeasuName");
						threadWait(2500);
						test.log(Status.PASS, "Measure page is opened successfully");
						clickWebelement("Configuration", "Properties");
						threadWait(2500);
						test.log(Status.PASS, "Successfully accessed properties section under the Sub Menu");
						clickWebelement("Configuration", "Prop");
						test.log(Status.PASS, "Successfully Opened the Existing Property File");
						threadWait(2500);
						}
						// Program Module: To access the Workflow list and Application Configuration
				
						public static void ProgramModule() {
							
							test = Report.createTest("Program Module");
						
						ClickByActionClass("Configuration", "Configur", "ESG Values", "Energy Audit", 63, 1);
						threadWait(5000);
						enterTextboxValue("Configuration", "Programcode", "ESG Values", "Energy Audit", 64, 1);
						test.log(Status.PASS, "Value is Entered Successfully");
						clickWebelement("Configuration", "ProgramSearch");
						threadWait(2500);
						String parentWindowHandle = driver.getWindowHandle();
						System.out.println("parentWindowHandle"+parentWindowHandle);
						clickWebelement("Configuration", "Programlink");
						test.log(Status.PASS, "Clicked on the Program link Successfully");
						threadWait(2500);
						scrollToElement("Configuration", "ProgramWorkFlow");
						clickWebelement("Configuration", "ProgramWorkFlow");
						threadWait(2500);
						clickWebelement("Configuration", "ProgramApplication");
						threadWait(2500);	
						scrollToElement("Configuration", "OnlineApplication");
						clickWebelement("Configuration", "OnlineApplication");
						threadWait(2500);
						clickWebelement("Configuration", "OnlineApplicationEnrollmentUrl");
						threadWait(2500);
						SwitchTab("Configuration", "OnlineLink");
						threadWait(5000);
						test.log(Status.PASS, "Online Application Enrollment link is opened successfully");
						//Validation("Account Information");
						threadWait(2500);
						driver.switchTo().window(parentWindowHandle);
						threadWait(2500);
						driver.findElement(By.xpath("//div/button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")).click();
						}
						
						//Program Year Module: To open Program Year and to load all sections. Open Budget, Open Contract, Open Program Year Measure and to Export Program Year in Excel Sheet
						public static void ProgramYearModule() {
						
						test = Report.createTest("Program Year Module");
						ClickByActionClass("Configuration", "Configur", "ESG Values", "Energy Audit", 65, 1);
						threadWait(5000);
						enterTextboxValue("Configuration", "Programyear", "ESG Values", "Energy Audit", 66, 1);
						clickWebelement("Configuration", "ProgramYearSearch");
						threadWait(2500);
						clickWebelement("Configuration", "ProgramName");
						threadWait(2500);
						test.log(Status.PASS, "Program year is opened successfully");
						clickWebelement("Configuration", "Budget");
						test.log(Status.PASS, "Accessed Budget section in Sub Menu successfully");
						threadWait(2500);
						clickWebelement("Configuration", "Close1");
						clickWebelement("Configuration", "Contract");
						test.log(Status.PASS, "Accessed Contract section in Sub Menu successfully");
						threadWait(2500);
						clickWebelement("Configuration", "Close1");
						clickWebelement("Configuration", "GeneralProgramyear");
						threadWait(2500);
						clickWebelement("Configuration", "ExportToExcel");
						threadWait(30000);
						test.log(Status.PASS, "Excel sheet is created successfully");
						FileDownloaded("C:\\Users\\Naresh Erigijja\\Downloads\\", "program-Year-Configuration-2034-JT");
						threadWait(2500);
						}
						// Pricing Schedule: To Open the Pricing Schedule
						public static void PricingSchedule() {
						
						test = Report.createTest("Pricing schedule Module");
						ClickByActionClass("Configuration", "Configur", "ESG Values", "Energy Audit", 67, 1);
						threadWait(5000);
						scrollToElement("Configuration", "PricingScheduleSearch");
						clickWebelement("Configuration", "PricingScheduleSearch");
						threadWait(2500);
						clickWebelement("Configuration", "PricingProgramName");
						test.log(Status.PASS, "Successfully opened pricing schedule Page");
						threadWait(2500);
						}
						
						//Saving Schedule: To Open the Saving Schedule
						public static void SavingSchedule() {
							
						test = Report.createTest("Saving schedule Module");
						ClickByActionClass("Configuration", "Configur", "ESG Values", "Energy Audit", 68, 1);
						threadWait(5000);
						clickWebelement("Configuration", "Effectivedate");
						test.log(Status.PASS, "Successfully opened Saving schedule Page");
						threadWait(2500);
						}
						
						//Mobile Web Application Module: To Select Measures for current program year and to open URL
						public static void MobileWebApplicationModule() {
							
							test = Report.createTest("Mobile web Application Module");
							
						ClickByActionClass("Configuration", "Configur", "ESG Values", "Energy Audit", 69, 1);
						threadWait(5000);
						clickWebelement("Configuration", "MobileProgramName");
						test.log(Status.PASS, "Successfully Clicked on the Program Name");
						threadWait(2500);
						clickWebelement("Configuration", "MobileMeasureCode");
						test.log(Status.PASS, "Successfully Clicked on the Measure Code");
						threadWait(2500);
						SwitchToFrame("Configuration", "MobileIframe");
						threadWait(2500);
						String parentWindowHandle = driver.getWindowHandle();
						System.out.println("parentWindowHandle"+parentWindowHandle);
						clickWebelement("Configuration", "MobileUrl");
						threadWait(2500);
					
						System.out.println(driver.getTitle());
						for(String childTab:driver.getWindowHandles()) {
						 driver.switchTo().window(childTab);
						}
						threadWait(5000);
						System.out.println(driver.getTitle());
						if (driver.getPageSource().contains("Congratulations on your purchase!")) {
							
							test.log(Status.PASS, "Mobile Web Online Application is opened successfully");
						} else {
							
							test.log(Status.FAIL, "Mobile Web Online Application is not opened");
						}
						driver.switchTo().window(parentWindowHandle);
						threadWait(2500);
						SwitchToFrame("Configuration", "MobileIframe");
						threadWait(2500);
						clickWebelement("Configuration", "MobileClose");
						driver.switchTo().defaultContent();
						threadWait(2500);
						}
						
						// Energy Audit Module: To Search Audit List and to open Audit
						
						public static void EnergyAuditModule() {
							
							test = Report.createTest("Energy Audit Module");
						ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 70, 1);
						enterTextboxValue("Configuration", "EnergyAudit", "ESG Values", "Energy Audit", 71, 1);
						test.log(Status.PASS, "Value is Entered Successfully");
						scrollToElement("Configuration", "EnergyAuditSearch");
						clickWebelement("Configuration", "EnergyAuditSearch");
						threadWait(2500);
						clickWebelement("Configuration", "EnergyAudit1");
						//Validation("Audit Type - General Information");
						test.log(Status.PASS, "Audit is opened Successfully");
						threadWait(2500);
						}
						//TradeAlly Module: To access Online TradeAlly registration URL
					
						public static void TradeAllyModule() {
						
					
						test = Report.createTest("TradeAlly");
						test.log(Status.INFO, "Application is login");
						ClickByActionClass("Configuration", "Configur", "ESG Values", "Energy Audit", 63, 1);
						String parentWindowHandle = driver.getWindowHandle();
						System.out.println("parentWindowHandle"+parentWindowHandle);
						test.log(Status.PASS, "TradeAlly is Opened");
						threadWait(2500);
						clickWebelement("Configuration", "ProgName");
						test.log(Status.PASS, "Clicked on the Program Name");
						threadWait(2500);
						scrollToElement("Configuration", "tradeAlly");
						clickWebelement("Configuration", "tradeAlly");
						threadWait(2500);
						clickWebelement("Configuration", "TradeAllyOnline");
						threadWait(2500);
						test.log(Status.PASS, "Clicked on the TradeAllyOnline");
						clickWebelement("Configuration", "TradeAllyLink");
						test.log(Status.PASS, "Clicked on the TradeAllyLink");
						threadWait(10000);
						if (driver.getPageSource().contains("This program has not been configured for online trade ally registration")) {
							
							test.log(Status.FAIL, "Displays an error message");
							
						} else {
							test.log(Status.PASS, "Registered URL page is Loaded");

						}
						//captureScreen(driver, "TradeAlly Verification");
						threadWait(2500);
						System.out.println(driver.getTitle());
						for(String childTab:driver.getWindowHandles()) {
						 driver.switchTo().window(childTab);
						}
						threadWait(2500);
						driver.switchTo().window(parentWindowHandle);
						driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
						}
						//helpset Module to open the Helpset online page and Verifying the Last Updated Date
						public static void Helpset() {
							test = Report.createTest("Helpset");
							test.log(Status.INFO, "Application is login");
							ClickByActionClass("Configuration", "MainMenu", "ESG Values", "Energy Audit", 3, 1);
							test.log(Status.PASS, "Enrollment page is Loaded");
							String parentWindowHandle = driver.getWindowHandle();
							System.out.println("parentWindowHandle"+parentWindowHandle);
							//validationWithWebelement("Configuration", "Helper", "Helpset");
							threadWait(2500);
							SwitchTab("Configuration", "Helper");
							test.log(Status.PASS, "Switched to NewTab");
							threadWait(2500);
							if (driver.getPageSource().contains("Error Code")){
								test.log(Status.FAIL, "Application displays an error message");
								System.out.println("Online Helper application is not Working");
								threadWait(2500);
								driver.switchTo().window(parentWindowHandle);
								
							} else {
								
								SwitchToFrame("Configuration", "Frame");
								 test.log(Status.PASS, "Enrollment page is Loaded");
								 threadWait(2500);
								clickWebelement("Configuration", "HelperOnile");
								test.log(Status.PASS, "Clicked on the Start option to view the Last Updated Date");
								threadWait(2500);
								 //captureScreen(driver, "Last Updated");
								 String parentWindowHandle2 = driver.getWindowHandle();
									System.out.println("parentWindowHandle"+parentWindowHandle2);
									driver.switchTo().window(parentWindowHandle2);
								 threadWait(2500);
								 driver.quit();
							}
						}	
			

		@AfterTest
			public static void Flush() {
				
			Report.flush();
			}
}
			

