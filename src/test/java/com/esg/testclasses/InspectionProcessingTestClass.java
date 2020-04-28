package com.esg.testclasses;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.esg.utilities.HelperClass;

public class InspectionProcessingTestClass extends HelperClass {
	
		public static void LoginPage() {
			login("helper","BaseURL", 1, 0, 1, 1);
			//enterTextboxValue("InspectionProcess", "MainMenu", "ESG Values", "Inspection Process", 1, 1);
			//linkText("Main Menu").click();
			//linkText("Enrollments").click();
		}
		public static void Enrollment() {
			//enterTextboxValue("InspectionProcess", "MainMenu", "ESG Values", "Inspection Process", 1, 1);
			threadWait(3000);
			linkText("Main Menu").click();
			linkText("Enrollments").click();
			clickWebelement("InspectionProcess", "NewButton");
			selectDropdown("InspectionProcess", "SelectProgram","SelectProgram", "ESG Values", "Inspection Process", 2, 1);
			threadWait(2500);
			clickWebelement("InspectionProcess", "NextButton");
			enterTextboxValue("InspectionProcess", "SearchType", "ESG Values", "Monitor", 3, 1);
			clickWebelement("InspectionProcess", "SearchGo");
			clickWebelement("InspectionProcess", "Customer");
			clickWebelement("InspectionProcess", "NextGo");
		}
		public static void InspectionCGIModule() {
			//CGI Process
			scrollToElement("InspectionProcess", "BuldingType");
			selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
			selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
			scrollToElement("InspectionProcess", "Save");
			clickWebelement("InspectionProcess", "Save");
			threadWait(2500);
			scrollToElement("InspectionProcess", "Measures");
			clickWebelement("InspectionProcess", "Measures");
			threadWait(2500);
			clickWebelement("InspectionProcess", "AddMeasures");
			threadWait(2500);
			clickWebelement("InspectionProcess", "FailCodeTest");
			clickWebelement("InspectionProcess", "AddMeasureSave");
			threadWait(2500);
			clickWebelement("InspectionProcess", "FCT");
			enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
			clickWebelement("InspectionProcess", "Process");
			threadWait(2500);
			clickWebelement("InspectionProcess", "InstallationProcess");
			threadWait(2500);
			selectActualReviewDate();
			clickWebelement("InspectionProcess", "InstallationProc");
			threadWait(2500);
			clickWebelement("InspectionProcess", "PostInspectionProcess");
			threadWait(2500);
			clickWebelement("InspectionProcess", "FCT");
			WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
			WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
			if(Pass.isEnabled())
			{
				enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
			}
			else
			{
				System.out.println("Object is Disabled");
			}
			threadWait(2500);
			Enter(KeyEvent.VK_TAB);
			threadWait(2500);
			if(Fail.isEnabled())
			{
				enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
			}
			else
			{
				System.out.println("Object is Disabled");
			}
			clickWebelement("InspectionProcess", "FailCode");
			threadWait(2500);
			enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
			Enter(KeyEvent.VK_DOWN);
			Enter(KeyEvent.VK_ENTER);
			threadWait(2500);
			clickWebelement("InspectionProcess", "OutcomeCGI");
			selectActualReviewDate();
			clickWebelement("InspectionProcess", "InstallationProc");
			ValidateWithElement("InspectionProcess", "PostInspectionStatus","Cancelled - CGI","Cancelled - CGI","Cancelled - CGI", "Post Inspection status is validated", "Post Inspection Value is not as Expected");
			//Job Cost Summary Validation
			scrollToElement("InspectionProcess", "JobCostSummary");
			clickWebelement("InspectionProcess", "JobCostSummary");
			threadWait(2500);
			defineLogs("No records to display.", "No records to display.", "No records to display.", "Job cost Summary Values are validated", "Job cost Summary Values are validated", "InspectionProcess", "JobCostSummaryValidation");
			clickWebelement("InspectionProcess", "Close");
			threadWait(2500);
			scrollToElement("InspectionProcess", "Measure1");
			threadWait(2500);
			clickWebelement("InspectionProcess", "Measure1");
			threadWait(2500);
			ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
			ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
			ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
			ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
			ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
		}	
		public static void InspectionRefusedModule() {
				Enrollment();
				scrollToElement("InspectionProcess", "BuldingType");
				selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
				selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
				scrollToElement("InspectionProcess", "Save");
				clickWebelement("InspectionProcess", "Save");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measures");
				clickWebelement("InspectionProcess", "Measures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "AddMeasures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FailCodeTest");
				clickWebelement("InspectionProcess", "AddMeasureSave");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
				clickWebelement("InspectionProcess", "Process");
				threadWait(2500);
				clickWebelement("InspectionProcess", "InstallationProcess");
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "PostInspectionProcess");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				if(Pass.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				threadWait(2500);
				Enter(KeyEvent.VK_TAB);
				threadWait(2500);
				if(Fail.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				clickWebelement("InspectionProcess", "FailCode");
				threadWait(2500);
				enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
				Enter(KeyEvent.VK_DOWN);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2500);
				clickWebelement("InspectionProcess", "OutcomeRefused");
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				ValidateWithElement("InspectionProcess", "PostInspectionStatus","Cancelled - Refused","Cancelled - Refused","Cancelled - Refused", "Post Inspection status is validated", "Post Inspection Value is not as Expected");
				//Job Cost Summary Validation
				scrollToElement("InspectionProcess", "JobCostSummary");
				clickWebelement("InspectionProcess", "JobCostSummary");
				threadWait(2500);
				defineLogs("No records to display.", "No records to display.", "No records to display.", "Job cost Summary Values are validated", "Job cost Summary Values are validated", "InspectionProcess", "JobCostSummaryValidation");
				clickWebelement("InspectionProcess", "Close");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measure1");
				threadWait(2500);
				clickWebelement("InspectionProcess", "Measure1");
				threadWait(2500);
				ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
			}
			public static void InspectionCancelModule() {
				Enrollment();
				scrollToElement("InspectionProcess", "BuldingType");
				selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
				selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
				scrollToElement("InspectionProcess", "Save");
				clickWebelement("InspectionProcess", "Save");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measures");
				clickWebelement("InspectionProcess", "Measures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "AddMeasures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FailCodeTest");
				clickWebelement("InspectionProcess", "AddMeasureSave");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
				clickWebelement("InspectionProcess", "Process");
				threadWait(2500);
				clickWebelement("InspectionProcess", "InstallationProcess");
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "PostInspectionProcess");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				if(Pass.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				threadWait(2500);
				Enter(KeyEvent.VK_TAB);
				threadWait(2500);
				if(Fail.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				clickWebelement("InspectionProcess", "FailCode");
				threadWait(2500);
				enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
				Enter(KeyEvent.VK_DOWN);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2500);
				clickWebelement("InspectionProcess", "OutComeCancel");
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "PostInspectionStatus","Cancelled - Cancel","Cancelled - Cancel","Cancelled - Cancel", "Post Inspection status is validated", "Post Inspection Value is not as Expected");
				//Job Cost Summary Validation
				scrollToElement("InspectionProcess", "JobCostSummary");
				clickWebelement("InspectionProcess", "JobCostSummary");
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "JobCostSummaryPayee","Customer, Automated Workflow","Customer, Automated Workflow","Customer, Automated Workflow","Payee of Job Cost Summary is Verified", "Payee of Job Cost Summary is not as Expected");
				ValidateWithElement("InspectionProcess", "JobCostSummaryMeasure","Fail Code Test (FCT)","Fail Code Test (FCT)","Fail Code Test (FCT)","Measure Name of Job Cost Summary is Verified", "Measure Name of Job Cost Summary is not as Expected");
				ValidateWithElement("InspectionProcess", "JobCostSummaryQty","1","1","1","Quantity of Job Cost Summary is Verified", "Quantity of Job Cost Summary is not as Expected");
				ValidateWithElement("InspectionProcess", "JobCostSummaryAmount","$10.00","$10.00","$10.00","Amount of Job Cost Summary is Verified", "Amount of Job Cost Summary is not as Expected");
				clickWebelement("InspectionProcess", "Close");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measure1");
				threadWait(2500);
				clickWebelement("InspectionProcess", "Measure1");
				threadWait(2500);
				ValidateWithElement("InspectionProcess","MeasureQty","1","1","1","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","IncentiveAmount","$10.00","$10.00","$10.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKwh","10.0000","10.0000","10.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKW","1000.0000","1000.0000","1000.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","Therms","500.0000","500.0000","500.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
			}
			public static void CorrectionCGIModule() {
				//Enrollment();
				scrollToElement("InspectionProcess", "BuldingType");
				selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
				selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
				scrollToElement("InspectionProcess", "Save");
				clickWebelement("InspectionProcess", "Save");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measures");
				clickWebelement("InspectionProcess", "Measures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "AddMeasures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FailCodeTest");
				clickWebelement("InspectionProcess", "AddMeasureSave");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
				clickWebelement("InspectionProcess", "Process");
				threadWait(2500);
				clickWebelement("InspectionProcess", "InstallationProcess");
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "PostInspectionProcess");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				if(Pass.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				threadWait(2500);
				Enter(KeyEvent.VK_TAB);
				threadWait(2500);
				if(Fail.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				clickWebelement("InspectionProcess", "FailCode");
				threadWait(2500);
				enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
				Enter(KeyEvent.VK_DOWN);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "CorrectionLink");
				clickWebelement("InspectionProcess", "FailCode");
				enterTextboxValue("InspectionProcess", "CorrectionInfo", "ESG Values", "Inspection Process", 11, 1);
				threadWait(2500);
				selectDropdown("InspectionProcess", "EmployeeName","EmployeeName", "ESG Values", "Inspection Process", 10, 1);
				clickWebelement("InspectionProcess", "OutcomeCGI");
				selectActualReviewDate();
				clickonProcess();
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "CorrectionStatus","Cancelled - CGI","Cancelled - CGI","Cancelled - CGI", "Correction status is validated", "Correction Value is not as Expected");
				//Job Cost Summary Validation
				scrollToElement("InspectionProcess", "JobCostSummary");
				clickWebelement("InspectionProcess", "JobCostSummary");
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "JobCostSummaryValidation","No records to display.","No records to display.","No records to display.","Job cost Summary Values are validated", "Job cost Summary Value is not as Expected");
				clickWebelement("InspectionProcess", "Close");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measure1");
				threadWait(2500);
				clickWebelement("InspectionProcess", "Measure1");
				threadWait(2500);
				ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
			}
			public static void CorrectionRefusedModule() {
				Enrollment();
				scrollToElement("InspectionProcess", "BuldingType");
				selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
				selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
				scrollToElement("InspectionProcess", "Save");
				clickWebelement("InspectionProcess", "Save");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measures");
				clickWebelement("InspectionProcess", "Measures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "AddMeasures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FailCodeTest");
				clickWebelement("InspectionProcess", "AddMeasureSave");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
				clickWebelement("InspectionProcess", "Process");
				threadWait(2500);
				clickWebelement("InspectionProcess", "InstallationProcess");
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "PostInspectionProcess");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				if(Pass.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				threadWait(2500);
				Enter(KeyEvent.VK_TAB);
				threadWait(2500);
				if(Fail.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				clickWebelement("InspectionProcess", "FailCode");
				threadWait(2500);
				enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
				Enter(KeyEvent.VK_DOWN);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "CorrectionLink");
				clickWebelement("InspectionProcess", "FailCode");
				enterTextboxValue("InspectionProcess", "CorrectionInfo", "ESG Values", "Inspection Process", 11, 1);
				threadWait(2500);
				selectDropdown("InspectionProcess", "EmployeeName","EmployeeName", "ESG Values", "Inspection Process", 10, 1);
				clickWebelement("InspectionProcess", "OutcomeRefused");
				selectActualReviewDate();
				clickonProcess();
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "CorrectionStatus","Cancelled - Refused","Cancelled - Refused","Cancelled - Refused", "Correction status is validated", "Correction Value is not as Expected");
				//Job Cost Summary Validation
				scrollToElement("InspectionProcess", "JobCostSummary");
				clickWebelement("InspectionProcess", "JobCostSummary");
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "JobCostSummaryValidation","No records to display.","No records to display.","No records to display.","Job cost Summary Values are validated", "Job cost Summary Value is not as Expected");
				clickWebelement("InspectionProcess", "Close");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measure1");
				threadWait(2500);
				clickWebelement("InspectionProcess", "Measure1");
				threadWait(2500);
				ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
			}
			public static void CorrectionCancelModule() {
				Enrollment();
				scrollToElement("InspectionProcess", "BuldingType");
				selectDropdown("InspectionProcess", "BuldingType", "BuldingType", "ESG Values", "Inspection Process", 4, 1);
				selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
				scrollToElement("InspectionProcess", "Save");
				clickWebelement("InspectionProcess", "Save");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measures");
				clickWebelement("InspectionProcess", "Measures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "AddMeasures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FailCodeTest");
				clickWebelement("InspectionProcess", "AddMeasureSave");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
				clickWebelement("InspectionProcess", "Process");
				threadWait(2500);
				clickWebelement("InspectionProcess", "InstallationProcess");
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "PostInspectionProcess");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				if(Pass.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				threadWait(2500);
				Enter(KeyEvent.VK_TAB);
				threadWait(2500);
				if(Fail.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				clickWebelement("InspectionProcess", "FailCode");
				threadWait(2500);
				enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
				Enter(KeyEvent.VK_DOWN);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "CorrectionLink");
				clickWebelement("InspectionProcess", "FailCode");
				enterTextboxValue("InspectionProcess", "CorrectionInfo", "ESG Values", "Inspection Process", 11, 1);
				threadWait(2500);
				selectDropdown("InspectionProcess", "EmployeeName","EmployeeName", "ESG Values", "Inspection Process", 10, 1);
				clickWebelement("InspectionProcess", "OutComeCancel");
				selectActualReviewDate();
				clickonProcess();
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "CorrectionStatus","Cancelled - Cancelled","Cancelled - Cancelled","Cancelled - Cancelled", "Correction status is validated", "Correction Value is not as Expected");
				//Job Cost Summary Validation
				scrollToElement("InspectionProcess", "JobCostSummary");
				clickWebelement("InspectionProcess", "JobCostSummary");
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "JobCostSummaryValidation","No records to display.","No records to display.","No records to display.","Job cost Summary Values are validated", "Job cost Summary Value is not as Expected");
				clickWebelement("InspectionProcess", "Close");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measure1");
				threadWait(2500);
				clickWebelement("InspectionProcess", "Measure1");
				threadWait(2500);
				ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
			}
			public static void CorrectionNotCompletedModule() {
				Enrollment();
				scrollToElement("InspectionProcess", "BuldingType");
				selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
				selectDropdown("InspectionProcess", "OccupancyStatus", "OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
				scrollToElement("InspectionProcess", "Save");
				clickWebelement("InspectionProcess", "Save");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measures");
				clickWebelement("InspectionProcess", "Measures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "AddMeasures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FailCodeTest");
				clickWebelement("InspectionProcess", "AddMeasureSave");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
				clickWebelement("InspectionProcess", "Process");
				threadWait(2500);
				clickWebelement("InspectionProcess", "InstallationProcess");
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "PostInspectionProcess");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				if(Pass.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				threadWait(2500);
				Enter(KeyEvent.VK_TAB);
				threadWait(2500);
				if(Fail.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				clickWebelement("InspectionProcess", "FailCode");
				threadWait(2500);
				enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
				Enter(KeyEvent.VK_DOWN);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2500);
				//clickWebelement("InspectionProcess", "OutcomeRefused");
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "CorrectionLink");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FailCodeTest1");
				threadWait(2500);
				//clickWebelement("InspectionProcess", "CorrectionInfo");
				
				enterTextboxValue("InspectionProcess", "CorrectionInfo", "ESG Values", "Inspection Process", 13, 1);
				selectDropdown("InspectionProcess", "EmployeeName","EmployeeName", "ESG Values", "Inspection Process", 10, 1);
				selectActualReviewDate();
				clickonProcess();
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "CorrectionStatus","Closed - Work Completed","Closed - Work Completed","Closed - Work Completed", "Correction status is validated", "Correction Value is not as Expected");
				//Job Cost Summary Validation
				scrollToElement("InspectionProcess", "JobCostSummary");
				clickWebelement("InspectionProcess", "JobCostSummary");
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "JobCostSummaryPayee","Customer, Automated Workflow","Customer, Automated Workflow","Customer, Automated Workflow","Payee of Job Cost Summary is Verified", "Payee of Job Cost Summary is not as Expected");
				ValidateWithElement("InspectionProcess", "JobCostSummaryMeasure","Fail Code Test (FCT)","Fail Code Test (FCT)","Fail Code Test (FCT)","Measure Name of Job Cost Summary is Verified", "Measure Name of Job Cost Summary is not as Expected");
				ValidateWithElement("InspectionProcess", "JobCostSummaryQty","1","1","1","Quantity of Job Cost Summary is Verified", "Quantity of Job Cost Summary is not as Expected");
				ValidateWithElement("InspectionProcess", "JobCostSummaryAmount","$10.00","$10.00","$10.00","Amount of Job Cost Summary is Verified", "Amount of Job Cost Summary is not as Expected");
				clickWebelement("InspectionProcess", "Close");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measure1");
				threadWait(2500);
				clickWebelement("InspectionProcess", "Measure1");
				threadWait(2500);
				ValidateWithElement("InspectionProcess","MeasureQty","1","1","1","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","IncentiveAmount","$10.00","$10.00","$10.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKwh","10.0000","10.0000","10.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKW","1000.0000","1000.0000","1000.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","Therms","500.0000","500.0000","500.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
			}
			public static void ReInspectionCGIModule() {
				//Enrollment();
				scrollToElement("InspectionProcess", "BuldingType");
				selectDropdown("InspectionProcess", "BuldingType", "BuldingType", "ESG Values", "Inspection Process", 4, 1);
				selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
				scrollToElement("InspectionProcess", "Save");
				clickWebelement("InspectionProcess", "Save");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measures");
				clickWebelement("InspectionProcess", "Measures");
				threadWait(3500);
				clickWebelement("InspectionProcess", "AddMeasures");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FailCodeTest");
				clickWebelement("InspectionProcess", "AddMeasureSave");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
				clickWebelement("InspectionProcess", "Process");
				threadWait(2500);
				clickWebelement("InspectionProcess", "InstallationProcess");
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "PostInspectionProcess");
				threadWait(2500);
				clickWebelement("InspectionProcess", "FCT");
				WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				if(Pass.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				threadWait(2500);
				Enter(KeyEvent.VK_TAB);
				threadWait(2500);
				if(Fail.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				clickWebelement("InspectionProcess", "FailCode");
				threadWait(2500);
				enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
				Enter(KeyEvent.VK_DOWN);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2500);
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "InstallationProc");
				threadWait(2500);
				clickWebelement("InspectionProcess", "CorrectionLink");
				clickWebelement("InspectionProcess", "FailCode");
				enterTextboxValue("InspectionProcess", "CorrectionInfo", "ESG Values", "Inspection Process", 13, 1);
				threadWait(2500);
				selectDropdown("InspectionProcess", "EmployeeName","EmployeeName", "ESG Values", "Inspection Process", 10, 1);
				selectActualReviewDate();
				clickonProcess();
				threadWait(2500);
				clickWebelement("InspectionProcess", "ReInspectionLink");
				threadWait(2500);
				selectDropdown("InspectionProcess", "EmployeeName","EmployeeName", "ESG Values", "Inspection Process", 12, 1);
				clickWebelement("InspectionProcess", "FailCode");
				WebElement Pass1 = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				WebElement Fail1 = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
				if(Pass1.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 8, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				threadWait(2500);
				Enter(KeyEvent.VK_TAB);
				threadWait(2500);
				if(Fail1.isEnabled())
				{
					enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 7, 1);
				}
				else
				{
					System.out.println("Object is Disabled");
				}
				selectActualReviewDate();
				clickWebelement("InspectionProcess", "OutcomeCGI");
				threadWait(2000);
				clickonProcess();
				
				ValidateWithElement("InspectionProcess", "ReInspectionStatus","Cancelled - CGI","Cancelled - CGI","Cancelled - CGI", "Correction status is validated", "Correction Value is not as Expected");
				//Job Cost Summary Validation
				scrollToElement("InspectionProcess", "JobCostSummary");
				clickWebelement("InspectionProcess", "JobCostSummary");
				threadWait(2500);
				ValidateWithElement("InspectionProcess", "JobCostSummaryValidation","No records to display.","No records to display.","No records to display.","Job cost Summary Values are validated", "Job cost Summary Value is not as Expected");
				clickWebelement("InspectionProcess", "Close");
				threadWait(2500);
				scrollToElement("InspectionProcess", "Measure1");
				threadWait(2500);
				clickWebelement("InspectionProcess", "Measure1");
				threadWait(2500);
				ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
				ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
			}
			public static void ReInspectionRefusedModule() {
					Enrollment();
					scrollToElement("InspectionProcess", "BuldingType");
					selectDropdown("InspectionProcess", "BuldingType", "BuldingType", "ESG Values", "Inspection Process", 4, 1);
					selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
					scrollToElement("InspectionProcess", "Save");
					clickWebelement("InspectionProcess", "Save");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measures");
					clickWebelement("InspectionProcess", "Measures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "AddMeasures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FailCodeTest");
					clickWebelement("InspectionProcess", "AddMeasureSave");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
					clickWebelement("InspectionProcess", "Process");
					threadWait(2500);
					clickWebelement("InspectionProcess", "InstallationProcess");
					threadWait(2500);
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					threadWait(2500);
					clickWebelement("InspectionProcess", "PostInspectionProcess");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					if(Pass.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					threadWait(2500);
					Enter(KeyEvent.VK_TAB);
					threadWait(2500);
					if(Fail.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					clickWebelement("InspectionProcess", "FailCode");
					threadWait(2500);
					enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					threadWait(2500);
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					threadWait(2500);
					clickWebelement("InspectionProcess", "CorrectionLink");
					clickWebelement("InspectionProcess", "FailCode");
					enterTextboxValue("InspectionProcess", "CorrectionInfo", "ESG Values", "Inspection Process", 13, 1);
					threadWait(2500);
					selectDropdown("InspectionProcess", "EmployeeName", "EmployeeName", "ESG Values", "Inspection Process", 10, 1);
					selectActualReviewDate();
					clickonProcess();
					threadWait(2500);
					clickWebelement("InspectionProcess", "ReInspectionLink");
					threadWait(2500);
					selectDropdown("InspectionProcess", "EmployeeName", "EmployeeName", "ESG Values", "Inspection Process", 12, 1);
					clickWebelement("InspectionProcess", "FailCode");
					WebElement Pass1 = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					WebElement Fail1 = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					if(Pass1.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 8, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					threadWait(2500);
					Enter(KeyEvent.VK_TAB);
					threadWait(2500);
					if(Fail1.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 7, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "OutcomeRefused");
					threadWait(2000);
					clickonProcess();
					
					ValidateWithElement("InspectionProcess", "ReInspectionStatus","Cancelled - Refused","Cancelled - Refused","Cancelled - Refused", "Correction status is validated", "Correction Value is not as Expected");
					//Job Cost Summary Validation
					scrollToElement("InspectionProcess", "JobCostSummary");
					clickWebelement("InspectionProcess", "JobCostSummary");
					threadWait(2500);
					ValidateWithElement("InspectionProcess", "JobCostSummaryValidation","No records to display.","No records to display.","No records to display.","Job cost Summary Values are validated", "Job cost Summary Value is not as Expected");
					clickWebelement("InspectionProcess", "Close");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measure1");
					threadWait(2500);
					clickWebelement("InspectionProcess", "Measure1");
					threadWait(2500);
					ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
				}
				public static void ReInspectionCancelModule() {
					Enrollment();
					scrollToElement("InspectionProcess", "BuldingType");
					selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
					selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
					scrollToElement("InspectionProcess", "Save");
					clickWebelement("InspectionProcess", "Save");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measures");
					clickWebelement("InspectionProcess", "Measures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "AddMeasures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FailCodeTest");
					clickWebelement("InspectionProcess", "AddMeasureSave");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
					clickWebelement("InspectionProcess", "Process");
					threadWait(2500);
					clickWebelement("InspectionProcess", "InstallationProcess");
					threadWait(2500);
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					threadWait(2500);
					clickWebelement("InspectionProcess", "PostInspectionProcess");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					if(Pass.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					threadWait(2500);
					Enter(KeyEvent.VK_TAB);
					threadWait(2500);
					if(Fail.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					clickWebelement("InspectionProcess", "FailCode");
					threadWait(2500);
					enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					threadWait(2500);
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					threadWait(2500);
					clickWebelement("InspectionProcess", "CorrectionLink");
					clickWebelement("InspectionProcess", "FailCode");
					enterTextboxValue("InspectionProcess", "CorrectionInfo", "ESG Values", "Inspection Process", 13, 1);
					threadWait(2500);
					selectDropdown("InspectionProcess", "EmployeeName","EmployeeName", "ESG Values", "Inspection Process", 10, 1);
					selectActualReviewDate();
					clickonProcess();
					threadWait(2500);
					clickWebelement("InspectionProcess", "ReInspectionLink");
					threadWait(2500);
					selectDropdown("InspectionProcess", "EmployeeName","EmployeeName", "ESG Values", "Inspection Process", 12, 1);
					clickWebelement("InspectionProcess", "FailCode");
					WebElement Pass1 = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					WebElement Fail1 = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					if(Pass1.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 8, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					threadWait(2500);
					Enter(KeyEvent.VK_TAB);
					threadWait(2500);
					if(Fail1.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 7, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "OutComeCancel");
					clickonProcess();
					
					ValidateWithElement("InspectionProcess", "ReInspectionStatus","Cancelled - Cancelled","Cancelled - Cancelled","Cancelled - Cancelled", "Correction status is validated", "Correction Value is not as Expected");
					//Job Cost Summary Validation
					scrollToElement("InspectionProcess", "JobCostSummary");
					clickWebelement("InspectionProcess", "JobCostSummary");
					threadWait(2500);
					ValidateWithElement("InspectionProcess", "JobCostSummaryValidation","No records to display.","No records to display.","No records to display.","Job cost Summary Values are validated", "Job cost Summary Value is not as Expected");
					clickWebelement("InspectionProcess", "Close");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measure1");
					threadWait(2500);
					clickWebelement("InspectionProcess", "Measure1");
					threadWait(2500);
					ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
		}
				public static void CorrectionStepDisabledAllFail() {
						//Enrollment();
						scrollToElement("InspectionProcess", "BuldingType");
						selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
						selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
						scrollToElement("InspectionProcess", "Save");
						clickWebelement("InspectionProcess", "Save");
						threadWait(2500);
						scrollToElement("InspectionProcess", "Measures");
						clickWebelement("InspectionProcess", "Measures");
						threadWait(2500);
						clickWebelement("InspectionProcess", "AddMeasures");
						threadWait(2500);
						clickWebelement("InspectionProcess", "FailCodeTest");
						clickWebelement("InspectionProcess", "AddMeasureSave");
						threadWait(2500);
						clickWebelement("InspectionProcess", "FCT");
						enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
						clickWebelement("InspectionProcess", "Process");
						threadWait(2500);
						clickWebelement("InspectionProcess", "InstallationProcess");
						threadWait(2500);
						selectActualReviewDate();
						clickWebelement("InspectionProcess", "InstallationProc");
						threadWait(2500);
						clickWebelement("InspectionProcess", "PostInspectionProcess");
						threadWait(2500);
						clickWebelement("InspectionProcess", "FCT");
						WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
						WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
						if(Pass.isEnabled())
						{
							enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 8, 1);
						}
						else
						{
							System.out.println("Object is Disabled");
						}
						threadWait(2500);
						Enter(KeyEvent.VK_TAB);
						threadWait(2500);
						if(Fail.isEnabled())
						{
							enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 7, 1);
						}
						else
						{
							System.out.println("Object is Disabled");
						}
						selectActualReviewDate();
						clickWebelement("InspectionProcess", "InstallationProc");
						ValidateWithElement("InspectionProcess", "PostInspectionStatus","Closed - Work Completed","Closed - Work Completed","Closed - Work Completed", "Post Inspection status is validated", "Post Inspection Value is not as Expected");
						//Job Cost Summary Validation
						scrollToElement("InspectionProcess", "JobCostSummary");
						clickWebelement("InspectionProcess", "JobCostSummary");
						threadWait(2500);
						ValidateWithElement("InspectionProcess", "JobCostSummaryPayee","Customer, Automated Workflow","Customer, Automated Workflow","Customer, Automated Workflow","Payee of Job Cost Summary is Verified", "Payee of Job Cost Summary is not as Expected");
						ValidateWithElement("InspectionProcess", "JobCostSummaryMeasure","Fail Code Test (FCT)","Fail Code Test (FCT)","Fail Code Test (FCT)","Measure Name of Job Cost Summary is Verified", "Measure Name of Job Cost Summary is not as Expected");
						ValidateWithElement("InspectionProcess", "JobCostSummaryQty","1","1","1","Quantity of Job Cost Summary is Verified", "Quantity of Job Cost Summary is not as Expected");
						ValidateWithElement("InspectionProcess", "JobCostSummaryAmount","$10.00","$10.00","$10.00","Amount of Job Cost Summary is Verified", "Amount of Job Cost Summary is not as Expected");
						clickWebelement("InspectionProcess", "Close");
						threadWait(2500);
						scrollToElement("InspectionProcess", "Measure1");
						threadWait(2500);
						clickWebelement("InspectionProcess", "Measure1");
						threadWait(2500);
						ValidateWithElement("InspectionProcess","MeasureQty","1","1","1","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
						ValidateWithElement("InspectionProcess","IncentiveAmount","$10.00","$10.00","$10.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
						ValidateWithElement("InspectionProcess","SavingsKwh","10.0000","10.0000","10.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
						ValidateWithElement("InspectionProcess","SavingsKW","1000.0000","1000.0000","1000.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
						ValidateWithElement("InspectionProcess","Therms","500.0000","500.0000","500.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
					}	
				public static void CorrectionStepDisabledPartialFail() {
					Enrollment();
					scrollToElement("InspectionProcess", "BuldingType");
					selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
					selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
					scrollToElement("InspectionProcess", "Save");
					clickWebelement("InspectionProcess", "Save");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measures");
					clickWebelement("InspectionProcess", "Measures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "AddMeasures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FailCodeTest");
					clickWebelement("InspectionProcess", "AddMeasureSave");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
					clickWebelement("InspectionProcess", "Process");
					threadWait(2500);
					clickWebelement("InspectionProcess", "InstallationProcess");
					threadWait(2500);
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					threadWait(2500);
					clickWebelement("InspectionProcess", "PostInspectionProcess");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					if(Pass.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 8, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					threadWait(2500);
					Enter(KeyEvent.VK_TAB);
					threadWait(2500);
					if(Fail.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 7, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					//ValidateWithElement(filename, Path, i, ExpectedComment, ActualComment, PassLogs, FailLogs);
					//Job Cost Summary Validation
					scrollToElement("InspectionProcess", "JobCostSummary");
					clickWebelement("InspectionProcess", "JobCostSummary");
					threadWait(2500);
					ValidateWithElement("InspectionProcess", "JobCostSummaryPayee","Customer, Automated Workflow","Customer, Automated Workflow","Customer, Automated Workflow","Payee of Job Cost Summary is Verified", "Payee of Job Cost Summary is not as Expected");
					ValidateWithElement("InspectionProcess", "JobCostSummaryMeasure","Fail Code Test (FCT)","Fail Code Test (FCT)","Fail Code Test (FCT)","Measure Name of Job Cost Summary is Verified", "Measure Name of Job Cost Summary is not as Expected");
					ValidateWithElement("InspectionProcess", "JobCostSummaryQty","1","1","1","Quantity of Job Cost Summary is Verified", "Quantity of Job Cost Summary is not as Expected");
					ValidateWithElement("InspectionProcess", "JobCostSummaryAmount","$10.00","$10.00","$10.00","Amount of Job Cost Summary is Verified", "Amount of Job Cost Summary is not as Expected");
					clickWebelement("InspectionProcess", "Close");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measure1");
					threadWait(2500);
					clickWebelement("InspectionProcess", "Measure1");
					threadWait(2500);
					ValidateWithElement("InspectionProcess","MeasureQty","1","1","1","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","IncentiveAmount","$10.00","$10.00","$10.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKwh","10.0000","10.0000","10.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKW","1000.0000","1000.0000","1000.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","Therms","500.0000","500.0000","500.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
				}	
				public static void FailCodeNoCorrectionRequired() {
					//Enrollment();
					scrollToElement("InspectionProcess", "BuldingType");
					selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
					selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
					scrollToElement("InspectionProcess", "Save");
					clickWebelement("InspectionProcess", "Save");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measures");
					clickWebelement("InspectionProcess", "Measures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "AddMeasures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FailCodeTest");
					clickWebelement("InspectionProcess", "AddMeasureSave");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
					clickWebelement("InspectionProcess", "Process");
					threadWait(2500);
					clickWebelement("InspectionProcess", "InstallationProcess");
					threadWait(2500);
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					threadWait(2500);
					clickWebelement("InspectionProcess", "PostInspectionProcess");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					if(Pass.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					threadWait(2500);
					Enter(KeyEvent.VK_TAB);
					threadWait(2500);
					if(Fail.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					clickWebelement("InspectionProcess", "FailCode");
					threadWait(2500);
					enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 14, 1);
					threadWait(2500);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					threadWait(2500);
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					threadWait(2500);
					ValidateWithElement("InspectionProcess", "PostInspectionStatus","Closed - Work Completed","Closed - Work Completed","Closed - Work Completed", "Post Inspection status is validated", "Post Inspection Value is not as Expected");
					//Job Cost Summary Validation
					scrollToElement("InspectionProcess", "JobCostSummary");
					clickWebelement("InspectionProcess", "JobCostSummary");
					threadWait(2500);
					ValidateWithElement("InspectionProcess", "JobCostSummaryValidation","No records to display.","No records to display.","No records to display.","Job cost Summary Values are validated", "Job cost Summary Value is not as Expected");
					clickWebelement("InspectionProcess", "Close");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measure1");
					threadWait(2500);
					clickWebelement("InspectionProcess", "Measure1");
					threadWait(2500);
					ValidateWithElement("InspectionProcess","MeasureQty","0","0","0","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","IncentiveAmount","$0.00","$0.00","$0.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKwh","0.0000","0.0000","0.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKW","0.0000","0.0000","0.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","Therms","0.0000","0.0000","0.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
		}
				public static void PositiveCorrectionAndReInspection() {
						//Enrollment();
						scrollToElement("InspectionProcess", "BuldingType");
						selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
						selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
						scrollToElement("InspectionProcess", "Save");
						clickWebelement("InspectionProcess", "Save");
						threadWait(2500);
						scrollToElement("InspectionProcess", "Measures");
						clickWebelement("InspectionProcess", "Measures");
						threadWait(2500);
						clickWebelement("InspectionProcess", "AddMeasures");
						threadWait(2500);
						clickWebelement("InspectionProcess", "FailCodeTest");
						clickWebelement("InspectionProcess", "AddMeasureSave");
						threadWait(2500);
						clickWebelement("InspectionProcess", "FCT");
						enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
						clickWebelement("InspectionProcess", "Process");
						threadWait(2500);
						clickWebelement("InspectionProcess", "InstallationProcess");
						threadWait(2500);
						selectActualReviewDate();
						clickWebelement("InspectionProcess", "InstallationProc");
						threadWait(2500);
						clickWebelement("InspectionProcess", "PostInspectionProcess");
						threadWait(2500);
						clickWebelement("InspectionProcess", "FCT");
						WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
						WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
						if(Pass.isEnabled())
						{
							enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 7, 1);
						}
						else
						{
							System.out.println("Object is Disabled");
						}
						threadWait(2500);
						Enter(KeyEvent.VK_TAB);
						threadWait(2500);
						if(Fail.isEnabled())
						{
							enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 8, 1);
						}
						else
						{
							System.out.println("Object is Disabled");
						}
						clickWebelement("InspectionProcess", "FailCode");
						threadWait(2500);
						enterTextboxValue("InspectionProcess", "FailCodeType", "ESG Values", "Inspection Process", 9, 1);
						Enter(KeyEvent.VK_DOWN);
						Enter(KeyEvent.VK_ENTER);
						threadWait(2500);
						selectActualReviewDate();
						clickWebelement("InspectionProcess", "InstallationProc");
						threadWait(2500);
						clickWebelement("InspectionProcess", "CorrectionLink");
						clickWebelement("InspectionProcess", "FailCode");
						enterTextboxValue("InspectionProcess", "CorrectionInfo", "ESG Values", "Inspection Process", 13, 1);
						threadWait(2500);
						selectDropdown("InspectionProcess", "EmployeeName", "EmployeeName", "ESG Values", "Inspection Process", 10, 1);
						selectActualReviewDate();
						clickonProcess();
						threadWait(2500);
						clickWebelement("InspectionProcess", "ReInspectionLink");
						threadWait(2500);
						selectDropdown("InspectionProcess", "EmployeeName", "EmployeeName", "ESG Values", "Inspection Process", 12, 1);
						clickWebelement("InspectionProcess", "FailCode");
						WebElement Pass1 = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
						WebElement Fail1 = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
						if(Pass1.isEnabled())
						{
							enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 8, 1);
						}
						else
						{
							System.out.println("Object is Disabled");
						}
						threadWait(2500);
						Enter(KeyEvent.VK_TAB);
						threadWait(2500);
						if(Fail1.isEnabled())
						{
							enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 7, 1);
						}
						else
						{
							System.out.println("Object is Disabled");
						}
						selectActualReviewDate();
						//clickWebelement("InspectionProcess", "OutComeCancel");
						clickonProcess();
						
						ValidateWithElement("InspectionProcess", "ReInspectionStatus","Closed - Work Completed","Closed - Work Completed","Closed - Work Completed", "Correction status is validated", "Correction Value is not as Expected");
						//Job Cost Summary Validation
						scrollToElement("InspectionProcess", "JobCostSummary");
						clickWebelement("InspectionProcess", "JobCostSummary");
						threadWait(2500);
						ValidateWithElement("InspectionProcess", "JobCostSummaryPayee","Customer, Automated Workflow","Customer, Automated Workflow","Customer, Automated Workflow","Payee of Job Cost Summary is Verified", "Payee of Job Cost Summary is not as Expected");
						ValidateWithElement("InspectionProcess", "JobCostSummaryMeasure","Fail Code Test (FCT)","Fail Code Test (FCT)","Fail Code Test (FCT)","Measure Name of Job Cost Summary is Verified", "Measure Name of Job Cost Summary is not as Expected");
						ValidateWithElement("InspectionProcess", "JobCostSummaryQty","1","1","1","Quantity of Job Cost Summary is Verified", "Quantity of Job Cost Summary is not as Expected");
						ValidateWithElement("InspectionProcess", "JobCostSummaryAmount","$10.00","$10.00","$10.00","Amount of Job Cost Summary is Verified", "Amount of Job Cost Summary is not as Expected");
						clickWebelement("InspectionProcess", "Close");
						threadWait(2500);
						scrollToElement("InspectionProcess", "Measure1");
						threadWait(2500);
						clickWebelement("InspectionProcess", "Measure1");
						threadWait(2500);
						ValidateWithElement("InspectionProcess","MeasureQty","1","1","1","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
						ValidateWithElement("InspectionProcess","IncentiveAmount","$10.00","$10.00","$10.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
						ValidateWithElement("InspectionProcess","SavingsKwh","10.0000","10.0000","10.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
						ValidateWithElement("InspectionProcess","SavingsKW","1000.0000","1000.0000","1000.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
						ValidateWithElement("InspectionProcess","Therms","500.0000","500.0000","500.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
			}
				public static void PositiveInspectionNoCorrectionNeeded() {
					Enrollment();
					scrollToElement("InspectionProcess", "BuldingType");
					selectDropdown("InspectionProcess", "BuldingType","BuldingType", "ESG Values", "Inspection Process", 4, 1);
					selectDropdown("InspectionProcess", "OccupancyStatus","OccupancyStatus", "ESG Values", "Inspection Process", 5, 1);
					scrollToElement("InspectionProcess", "Save");
					clickWebelement("InspectionProcess", "Save");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measures");
					clickWebelement("InspectionProcess", "Measures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "AddMeasures");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FailCodeTest");
					clickWebelement("InspectionProcess", "AddMeasureSave");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					enterTextboxValue("InspectionProcess", "MeasureQTY", "ESG Values", "Inspection Process", 6, 1);
					clickWebelement("InspectionProcess", "Process");
					threadWait(2500);
					clickWebelement("InspectionProcess", "InstallationProcess");
					threadWait(2500);
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					threadWait(2500);
					clickWebelement("InspectionProcess", "PostInspectionProcess");
					threadWait(2500);
					clickWebelement("InspectionProcess", "FCT");
					WebElement Pass = driver.findElement(By.xpath("//td[11]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					WebElement Fail = driver.findElement(By.xpath("//td[12]//div[1]//div[1]//span[1]//span[1]//input[1]"));
					if(Pass.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasurePassQTY", "ESG Values", "Inspection Process", 8, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					threadWait(2500);
					Enter(KeyEvent.VK_TAB);
					threadWait(2500);
					if(Fail.isEnabled())
					{
						enterTextboxValue("InspectionProcess", "MeasureFailQTY", "ESG Values", "Inspection Process", 7, 1);
					}
					else
					{
						System.out.println("Object is Disabled");
					}
					selectActualReviewDate();
					clickWebelement("InspectionProcess", "InstallationProc");
					//Job Cost Summary Validation
					scrollToElement("InspectionProcess", "JobCostSummary");
					clickWebelement("InspectionProcess", "JobCostSummary");
					threadWait(2500);
					ValidateWithElement("InspectionProcess", "JobCostSummaryPayee","Customer, Automated Workflow","Customer, Automated Workflow","Customer, Automated Workflow","Payee of Job Cost Summary is Verified", "Payee of Job Cost Summary is not as Expected");
					ValidateWithElement("InspectionProcess", "JobCostSummaryMeasure","Fail Code Test (FCT)","Fail Code Test (FCT)","Fail Code Test (FCT)","Measure Name of Job Cost Summary is Verified", "Measure Name of Job Cost Summary is not as Expected");
					ValidateWithElement("InspectionProcess", "JobCostSummaryQty","1","1","1","Quantity of Job Cost Summary is Verified", "Quantity of Job Cost Summary is not as Expected");
					ValidateWithElement("InspectionProcess", "JobCostSummaryAmount","$10.00","$10.00","$10.00","Amount of Job Cost Summary is Verified", "Amount of Job Cost Summary is not as Expected");
					clickWebelement("InspectionProcess", "Close");
					threadWait(2500);
					scrollToElement("InspectionProcess", "Measure1");
					threadWait(2500);
					clickWebelement("InspectionProcess", "Measure1");
					threadWait(2500);
					ValidateWithElement("InspectionProcess","MeasureQty","1","1","1","The Measure quantity Value is Verified Successfully","The Measure Values is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","IncentiveAmount","$10.00","$10.00","$10.00","The Incentive Amount is Verified Successfully","The Incentive Amount is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKwh","10.0000","10.0000","10.0000","The Savings Kwh Value is Verified Successfully","The Savings Kwh Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","SavingsKW","1000.0000","1000.0000","1000.0000","The Savings KW Value is Verified Successfully","The Savings KW Value is not equal to the Expected Value");
					ValidateWithElement("InspectionProcess","Therms","500.0000","500.0000","500.0000","The Therms Value is Verified Successfully","The Therms Value is not equal to the Expected Value");
				}	
			}
			

		
		
		

