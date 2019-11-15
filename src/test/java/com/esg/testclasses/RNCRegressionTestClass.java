package com.esg.testclasses;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import com.esg.utilities.HelperClass;

public class RNCRegressionTestClass extends HelperClass {
	public static void Login() {
		login("helper", "BaseURL", 1, 0, 1, 1);
	}
	public static void Enrollment() {
		ClickByActionClass("RNCRegression", "MainMenu", "ESG Values", "RNC_Regression", 1, 1);
		clickWebelement("RNCRegression", "NewButton");
		selectDropdownByVisibleText("RNCRegression", "SelectProgram", "ESG Values", "RNC_Regression", 2, 1);
		threadWait(2500);
		clickWebelement("RNCRegression", "NextButton");
		enterTextboxValue("RNCRegression", "SearchType", "ESG Values", "RNC_Regression", 3, 1);
		clickWebelement("RNCRegression", "SearchGo");
		clickWebelement("RNCRegression", "Customer");
		clickWebelement("RNCRegression", "NextGo");
	}
	public static void Application() {
				EICompletedDate();
				EIConstructionStartDate();
				enterTextboxValue("RNCRegression", "EmailAddress", "ESG Values", "RNC_Regression", 4, 1);
				clickonSave();
				//Lot 1
				clickWebelement("RNCRegression", "Lots");
				clickWebelement("RNCRegression", "NewLots");
				enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 6, 1);
				enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 7, 1);
				enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 8, 1);
				enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 9, 1);
				enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 10, 1);
				enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 11, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				//Lot 2
				clickWebelement("RNCRegression", "NewLots");
				enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 13, 1);
				enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 14, 1);
				enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 15, 1);
				enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 16, 1);
				enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 17, 1);
				enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 18, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				//Lot 3
				clickWebelement("RNCRegression", "NewLots");
				enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 20, 1);
				enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 21, 1);
				enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 22, 1);
				enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 23, 1);
				enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 24, 1);
				enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 25, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				//Lot 4
				clickWebelement("RNCRegression", "NewLots");
				enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 27, 1);
				enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 28, 1);
				enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 29, 1);
				enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 30, 1);
				enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 31, 1);
				enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 32, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				//Lot 5
				clickWebelement("RNCRegression", "NewLots");
				enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 34, 1);
				enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 35, 1);
				enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 36, 1);
				enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 37, 1);
				enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 38, 1);
				enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 39, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				//Lot 6
				clickWebelement("RNCRegression", "NewLots");
				enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 41, 1);
				enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 42, 1);
				enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 43, 1);
				enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 44, 1);
				enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 45, 1);
				enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 46, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				clickWebelement("RNCRegression", "Close");
				clickonProcess();
				ValidateWithElement("RNCRegression", "WorkflowValidation", "Pre-Engineering", "Pre-Engineering", "Pre-Engineering", "Pre-Engineering workflow step has been generated", "Pre-Engineering workflow step has not generated");
	}
				
				public static void PreEnginneringMethod() {
				clickWebelement("RNCRegression", "WorkflowValidation");
				selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
				threadWait(5000);
				selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
				selectActualReviewDate();
				AgreementSignDateApplicant();
				AgreementSignDateManagement();
				clickonSave();
				scrollToElement("RNCRegression", "Plans");
				clickWebelement("RNCRegression", "Plans");
				clickWebelement("RNCRegression", "NewPlans");
				enterTextboxValue("RNCRegression", "PlanName", "ESG Values", "RNC_Regression", 48, 1);
				selectDropdownByVisibleText("RNCRegression", "PlanType", "ESG Values", "RNC_Regression", 49, 1);
				threadWait(2500);
				ClickWebelementByActionClass("helper", "SaveButton");
				//clickonSave();
				scrollToElement("RNCRegression", "AddOrientation");
				explicitWaitForClickable(3000, "RNCRegression", "AddOrientation");
				clickWebelement("RNCRegression", "AddOrientation");
				//Test Plan 1
				//North Orientation
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 52, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//South Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 53, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//East Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 54, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//West Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 55, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//Test Plan 2
				clickWebelement("RNCRegression", "NewPlans");
				enterTextboxValue("RNCRegression", "PlanName", "ESG Values", "RNC_Regression", 48, 2);
				selectDropdownByVisibleText("RNCRegression", "PlanType", "ESG Values", "RNC_Regression", 49, 1);
				clickonSave();
				clickWebelement("RNCRegression", "AddOrientation");
				
				//North Orientation
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 52, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//South Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 53, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//East Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 54, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//West Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 55, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//Test Plan 3
				clickWebelement("RNCRegression", "NewPlans");
				enterTextboxValue("RNCRegression", "PlanName", "ESG Values", "RNC_Regression", 48, 3);
				selectDropdownByVisibleText("RNCRegression", "PlanType", "ESG Values", "RNC_Regression", 49, 1);
				clickonSave();
				clickWebelement("RNCRegression", "AddOrientation");
				
				//North Orientation
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 52, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//South Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 53, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//East Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 54, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				
				//West Orientation
				clickWebelement("RNCRegression", "AddOrientation");
				selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 55, 1);	
				enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
				enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
				clickonSave();
				explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
				clickWebelement("RNCRegression", "AddMeasureButton");
				SwitchToFrame("RNCRegression", "AddMeasureFrame");
				clickWebelement("RNCRegression", "TestMeasureCheckBox");
				driver.switchTo().defaultContent();
				clickWebelement("RNCRegression", "SaveMeasure");
				threadWait(3000);
				enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
				enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
				enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
				enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
				enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
				enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				clickWebelement("RNCRegression", "Close");
				clickonProcess();
	}
				public static void Lot1() {
					threadWait(2500);
					clickWebelement("RNCRegression", "Lots");
					threadWait(2500);
					clickWebelement("RNCRegression", "Lot11");
					clickWebelement("RNCRegression", "Lot21");
					clickWebelement("RNCRegression", "Generate");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					selectDropdownByVisibleText("RNCRegression", "SelectTestPlan11", "ESG Values", "RNC_Regression", 69, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "OrientationName11", "ESG Values", "RNC_Regression", 70, 1);
					enterTextboxValue("RNCRegression", "HersRater11", "ESG Values", "RNC_Regression", 71, 1);
					clickWebelement("RNCRegression", "HersTestedDate11");
					clickWebelement("RNCRegression", "SelectDate");
					enterTextboxValue("RNCRegression", "DwellingUnits11", "ESG Values", "RNC_Regression", 72, 1);
					//Lot 2-1 Module
					selectDropdownByVisibleText("RNCRegression", "SelectTestPlan21", "ESG Values", "RNC_Regression", 69, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "OrientationName21", "ESG Values", "RNC_Regression", 70, 2);
					threadWait(10000);
					enterTextboxValue("RNCRegression", "HersRater21", "ESG Values", "RNC_Regression", 71, 1);
					clickWebelement("RNCRegression", "HersTestedDate21");
					clickWebelement("RNCRegression", "SelectDate");
					enterTextboxValue("RNCRegression", "DwellingUnits21", "ESG Values", "RNC_Regression", 72, 1);
					clickonSave();
					clickonProcess();
				}
				public static void PostEngineeringMethod() {
					threadWait(2500);
					clickWebelement("RNCRegression", "PostEngineering");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickonProcess();
				}
				public static void QAreviewMethod() {
					clickWebelement("RNCRegression", "QAReview");
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName2", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName2", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickWebelement("RNCRegression", "PaymentRequest");
					clickWebelement("RNCRegression", "Verify11");
					clickWebelement("RNCRegression", "Verify21");
					clickonSave();
					clickonProcess();
				}
				public static void InitiatePaymentMethod() {
					clickWebelement("RNCRegression", "InitiatePayment");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName3", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName3", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickWebelement("RNCRegression", "InitiatePaymentRequest");
					clickonSave();
					clickonProcess();
					ValidateWithElement("RNCRegression", "VerifyStatus", "Pending Approval", "Pending Approval", "Pending Approval", "Payment Request Status is Verified", "Payment Request Status is not Verified");
					ValidateWithElement("RNCRegression", "VerifyPayee", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyAmount", "$20,000.00", "$20,000.00", "$20,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					clickWebelement("RNCRegression", "PaymentrequestLink");
					TextBoxvalue("Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified", "RNCRegression", "VerifyPayeeName");
					//ValidateWithElement("RNCRegression", "VerifyPayeeName", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyTotalAmount", "$20,000.00", "$20,000.00", "$20,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					threadWait(2500);
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "WorkflowStep");
				}
	public static void Lot2() {
					
					clickWebelement("RNCRegression", "Lots");
					threadWait(2500);
					clickWebelement("RNCRegression", "Lot12");
					clickWebelement("RNCRegression", "Lot22");
					clickWebelement("RNCRegression", "Generate");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					selectDropdownByVisibleText("RNCRegression", "SelectTestPlan11", "ESG Values", "RNC_Regression", 74, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "OrientationName11", "ESG Values", "RNC_Regression", 75, 1);
					enterTextboxValue("RNCRegression", "HersRater11", "ESG Values", "RNC_Regression", 76, 1);
					clickWebelement("RNCRegression", "HersTestedDate11");
					clickWebelement("RNCRegression", "SelectDate");
					enterTextboxValue("RNCRegression", "DwellingUnits11", "ESG Values", "RNC_Regression", 77, 1);
					//Lot 2-1 Module
					selectDropdownByVisibleText("RNCRegression", "SelectTestPlan21", "ESG Values", "RNC_Regression", 74, 1);
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "OrientationName21", "ESG Values", "RNC_Regression", 75, 2);
					enterTextboxValue("RNCRegression", "HersRater21", "ESG Values", "RNC_Regression", 76, 1);
					clickWebelement("RNCRegression", "HersTestedDate21");
					clickWebelement("RNCRegression", "SelectDate");
					enterTextboxValue("RNCRegression", "DwellingUnits21", "ESG Values", "RNC_Regression", 77, 1);
					clickonSave();
					clickonProcess();
				}
				public static void CloseMethod() {
					clickWebelement("RNCRegression", "AddWorkFlowStep");
					threadWait(2500);
					SwitchToFrame("RNCRegression", "SwitchFrame");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "Workflowstep", "ESG Values", "RNC_Regression", 78, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "AssignTo", "ESG Values", "RNC_Regression", 79, 1);
					threadWait(2500);
					clickWebelement("RNCRegression", "Apply");
					threadWait(2500);
					clickWebelement("RNCRegression", "CloseoutLink");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickonProcess();
					ValidateWithElement("RNCRegression", "ApplicationStatus", "Closed", "Closed", "Closed", "Application Status is successfully Verified", "Application Status is not Verified");
					}
				public static void PastPricingApplication() {
					ApplicationInstallationDate();
					EICompletedDate();
					EIConstructionStartDate();
					/*enterTextboxValue("RNCRegression", "ApplicationDate", "ESG Values", "RNC_Regression", 93, 1);
					enterTextboxValue("RNCRegression", "EstimatedCompleteDate", "ESG Values", "RNC_Regression", 93, 1);
					enterTextboxValue("RNCRegression", "EstimatedConstructionDate", "ESG Values", "RNC_Regression", 94, 1);*/
						enterTextboxValue("RNCRegression", "EmailAddress", "ESG Values", "RNC_Regression", 4, 1);
						clickonSave();
						//Lot 1
						clickWebelement("RNCRegression", "Lots");
						clickWebelement("RNCRegression", "NewLots");
						enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 6, 1);
						enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 7, 1);
						enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 8, 1);
						enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 9, 1);
						enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 10, 1);
						enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 11, 1);
						clickonSave();
						clickWebelement("RNCRegression", "Close");
						clickWebelement("RNCRegression", "Close");
						clickonProcess();
						ValidateWithElement("RNCRegression", "WorkflowValidation", "Pre-Engineering", "Pre-Engineering", "Pre-Engineering", "Pre-Engineering workflow step has been generated", "Pre-Engineering workflow step has not generated");
				}
				public static void PastPricingPreEnginneringMethod() {
					clickWebelement("RNCRegression", "WorkflowValidation");
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(10000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					AgreementSignDateApplicant();
					AgreementSignDateManagement();
					clickonSave();
					threadWait(2500);
					clickWebelement("RNCRegression", "Plans");
					clickWebelement("RNCRegression", "NewPlans");
					enterTextboxValue("RNCRegression", "PlanName", "ESG Values", "RNC_Regression", 48, 1);
					selectDropdownByVisibleText("RNCRegression", "PlanType", "ESG Values", "RNC_Regression", 49, 1);
					clickonSave();
					clickWebelement("RNCRegression", "AddOrientation");
					//Test Plan 1
					//North Orientation
					selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 52, 1);	
					enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
					enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
					clickonSave();
					explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
					clickWebelement("RNCRegression", "AddMeasureButton");
					SwitchToFrame("RNCRegression", "AddMeasureFrame");
					clickWebelement("RNCRegression", "TestMeasureCheckBox");
					driver.switchTo().defaultContent();
					clickWebelement("RNCRegression", "SaveMeasure");
					threadWait(3000);
					enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
					enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
					enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
					enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					
					//East Orientation
					clickWebelement("RNCRegression", "AddOrientation");
					selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 54, 1);	
					enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
					enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
					clickonSave();
					explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
					clickWebelement("RNCRegression", "AddMeasureButton");
					SwitchToFrame("RNCRegression", "AddMeasureFrame");
					clickWebelement("RNCRegression", "TestMeasureCheckBox");
					driver.switchTo().defaultContent();
					clickWebelement("RNCRegression", "SaveMeasure");
					threadWait(3000);
					enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
					enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
					enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
					enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "Close");
					clickonProcess();
		
				}
				public static void PastPricingLot() {
					threadWait(2500);
					clickWebelement("RNCRegression", "Lots");
					threadWait(2500);
					clickWebelement("RNCRegression", "Lot11");
					clickWebelement("RNCRegression", "Generate");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "SelectTestPlan11", "ESG Values", "RNC_Regression", 69, 1);
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "OrientationName11", "ESG Values", "RNC_Regression", 70, 1);
					enterTextboxValue("RNCRegression", "HersRater11", "ESG Values", "RNC_Regression", 71, 1);
					clickWebelement("RNCRegression", "HersTestedDate11");
					clickWebelement("RNCRegression", "SelectDate");
					enterTextboxValue("RNCRegression", "DwellingUnits11", "ESG Values", "RNC_Regression", 72, 1);
					clickonSave();
					clickonProcess();
	}
				public static void PastPricingQAreviewMethod() {
					clickWebelement("RNCRegression", "QAReview");
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName2", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName2", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickWebelement("RNCRegression", "PaymentRequest");
					clickWebelement("RNCRegression", "Verify11");
					clickonSave();
					clickonProcess();
				}
				public static void PastPricingInitiatePaymentMethod() {
					clickWebelement("RNCRegression", "InitiatePayment");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName3", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName3", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickWebelement("RNCRegression", "InitiatePaymentRequest");
					clickonSave();
					clickonProcess();
					ValidateWithElement("RNCRegression", "VerifyStatus", "Pending Approval", "Pending Approval", "Pending Approval", "Payment Request Status is Verified", "Payment Request Status is not Verified");
					ValidateWithElement("RNCRegression", "VerifyPayee", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyAmount", "$10,000.00", "$10,000.00", "$10,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					clickWebelement("RNCRegression", "PaymentrequestLink");
					TextBoxvalue("Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified", "RNCRegression", "VerifyPayeeName");
					//ValidateWithElement("RNCRegression", "VerifyPayeeName", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyTotalAmount", "$10,000.00", "$10,000.00", "$10,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					threadWait(2500);
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "WorkflowStep");
				}public static void ChangingOrientationApplication() {
				EICompletedDate();
				EIConstructionStartDate();
				enterTextboxValue("RNCRegression", "EmailAddress", "ESG Values", "RNC_Regression", 4, 1);
				clickonSave();
				//Lot 1
				clickWebelement("RNCRegression", "Lots");
				clickWebelement("RNCRegression", "NewLots");
				enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 6, 1);
				enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 7, 1);
				enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 8, 1);
				enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 9, 1);
				enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 10, 1);
				enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 11, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				//Lot 2
				clickWebelement("RNCRegression", "NewLots");
				enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 13, 1);
				enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 14, 1);
				enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 15, 1);
				enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 16, 1);
				enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 17, 1);
				enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 18, 1);
				clickonSave();
				clickWebelement("RNCRegression", "Close");
				clickWebelement("RNCRegression", "Close");
				clickonProcess();
				ValidateWithElement("RNCRegression", "WorkflowValidation", "Pre-Engineering", "Pre-Engineering", "Pre-Engineering", "Pre-Engineering workflow step has been generated", "Pre-Engineering workflow step has not generated");
}
				public static void ChangingOrientationPreEnginneringMethod() {
					clickWebelement("RNCRegression", "WorkflowValidation");
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					AgreementSignDateApplicant();
					AgreementSignDateManagement();
					clickonSave();
					threadWait(2500);
					clickWebelement("RNCRegression", "Plans");
					clickWebelement("RNCRegression", "NewPlans");
					enterTextboxValue("RNCRegression", "PlanName", "ESG Values", "RNC_Regression", 48, 1);
					selectDropdownByVisibleText("RNCRegression", "PlanType", "ESG Values", "RNC_Regression", 49, 1);
					clickonSave();
					clickWebelement("RNCRegression", "AddOrientation");
					//Test Plan 1
					//North Orientation
					selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 52, 1);	
					enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
					enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
					clickonSave();
					explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
					clickWebelement("RNCRegression", "AddMeasureButton");
					SwitchToFrame("RNCRegression", "AddMeasureFrame");
					clickWebelement("RNCRegression", "TestMeasureCheckBox");
					driver.switchTo().defaultContent();
					clickWebelement("RNCRegression", "SaveMeasure");
					threadWait(3000);
					enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
					enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
					enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
					enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
					enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
					enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
					clickonSave();
					
					//East Orientation
					clickWebelement("RNCRegression", "AddOrientation");
					selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 54, 1);	
					enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
					enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
					clickonSave();
					explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
					clickWebelement("RNCRegression", "AddMeasureButton");
					SwitchToFrame("RNCRegression", "AddMeasureFrame");
					clickWebelement("RNCRegression", "TestMeasureCheckBox");
					driver.switchTo().defaultContent();
					clickWebelement("RNCRegression", "SaveMeasure");
					threadWait(3000);
					enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
					enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
					enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
					enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
					enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
					enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					
					//TestPlan 2
					clickWebelement("RNCRegression", "NewPlans");
					enterTextboxValue("RNCRegression", "PlanName", "ESG Values", "RNC_Regression", 48, 2);
					selectDropdownByVisibleText("RNCRegression", "PlanType", "ESG Values", "RNC_Regression", 49, 1);
					clickonSave();
					clickWebelement("RNCRegression", "AddOrientation");
		
					//North Orientation
					selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 52, 1);	
					enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
					enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
					clickonSave();
					explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
					clickWebelement("RNCRegression", "AddMeasureButton");
					SwitchToFrame("RNCRegression", "AddMeasureFrame");
					clickWebelement("RNCRegression", "TestMeasureCheckBox");
					driver.switchTo().defaultContent();
					clickWebelement("RNCRegression", "SaveMeasure");
					threadWait(3000);
					enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
					enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
					enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
					enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
					enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
					enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
					clickonSave();
					
					//East Orientation
					clickWebelement("RNCRegression", "AddOrientation");
					selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 54, 1);	
					enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
					enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
					clickonSave();
					explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
					clickWebelement("RNCRegression", "AddMeasureButton");
					SwitchToFrame("RNCRegression", "AddMeasureFrame");
					clickWebelement("RNCRegression", "TestMeasureCheckBox");
					driver.switchTo().defaultContent();
					clickWebelement("RNCRegression", "SaveMeasure");
					threadWait(3000);
					enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
					enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
					enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
					enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
					enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
					enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					
					//TestPlan 3
					clickWebelement("RNCRegression", "NewPlans");
					enterTextboxValue("RNCRegression", "PlanName", "ESG Values", "RNC_Regression", 48, 3);
					selectDropdownByVisibleText("RNCRegression", "PlanType", "ESG Values", "RNC_Regression", 49, 1);
					clickonSave();
					clickWebelement("RNCRegression", "AddOrientation");
		
					//North Orientation
					selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 52, 1);	
					enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
					enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
					clickonSave();
					explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
					clickWebelement("RNCRegression", "AddMeasureButton");
					SwitchToFrame("RNCRegression", "AddMeasureFrame");
					clickWebelement("RNCRegression", "TestMeasureCheckBox");
					driver.switchTo().defaultContent();
					clickWebelement("RNCRegression", "SaveMeasure");
					threadWait(3000);
					enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
					enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
					enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
					enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
					enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
					enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
					clickonSave();
					
					//East Orientation
					clickWebelement("RNCRegression", "AddOrientation");
					selectDropdownByVisibleText("RNCRegression", "SelectOrientation", "ESG Values", "RNC_Regression", 54, 1);	
					enterTextboxValue("RNCRegression", "AboveCode", "ESG Values", "RNC_Regression", 56, 1);
					enterTextboxValue("RNCRegression", "Score", "ESG Values", "RNC_Regression", 57, 1);
					clickonSave();
					explicitWaitForClickable(3000, "RNCRegression", "AddMeasureButton");
					clickWebelement("RNCRegression", "AddMeasureButton");
					SwitchToFrame("RNCRegression", "AddMeasureFrame");
					clickWebelement("RNCRegression", "TestMeasureCheckBox");
					driver.switchTo().defaultContent();
					clickWebelement("RNCRegression", "SaveMeasure");
					threadWait(3000);
					enterTextboxValue("RNCRegression", "Incentive", "ESG Values", "RNC_Regression", 58, 1);
					enterTextboxValue("RNCRegression", "MeasureCost", "ESG Values", "RNC_Regression", 59, 1);
					enterTextboxValue("RNCRegression", "IMC", "ESG Values", "RNC_Regression", 60, 1);
					enterTextboxValue("RNCRegression", "KWh", "ESG Values", "RNC_Regression", 61, 1);
					enterTextboxValue("RNCRegression", "KW", "ESG Values", "RNC_Regression", 62, 1);
					enterTextboxValue("RNCRegression", "Therms", "ESG Values", "RNC_Regression", 65, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					selectDropdownByVisibleText("RNCRegression", "PlanStatus", "ESG Values", "RNC_Regression", 50, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "Close");
					clickonProcess();
				}
				public static void ChangingOrientationInitiatePaymentMethod() {
					clickWebelement("RNCRegression", "InitiatePayment");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName3", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName3", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickWebelement("RNCRegression", "InitiatePaymentRequest");
					clickonSave();
					clickonProcess();
					ValidateWithElement("RNCRegression", "VerifyStatus", "Pending Approval", "Pending Approval", "Pending Approval", "Payment Request Status is Verified", "Payment Request Status is not Verified");
					ValidateWithElement("RNCRegression", "VerifyPayee", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyAmount", "$20,000.00", "$20,000.00", "$20,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					clickWebelement("RNCRegression", "PaymentrequestLink");
					TextBoxvalue("Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified", "RNCRegression", "VerifyPayeeName");
					//ValidateWithElement("RNCRegression", "VerifyPayeeName", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyTotalAmount", "$20,000.00", "$20,000.00", "$20,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					threadWait(2500);
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "Lots");
					String Copy1 = driver.findElement(By.xpath("//tr[@id='ctl00_cphSiteMaster_rgLots_ctl00__0']//td[10]")).getText();
					String Copy2 = driver.findElement(By.xpath("//tr[@id='ctl00_cphSiteMaster_rgLots_ctl00__1']//td[10]")).getText();
					ValidateWithElement("RNCRegression", "Lot11Verification", Copy1, Copy1, Copy1, "Invoice number is successfully verified", "Invoice number is not verified");
					ValidateWithElement("RNCRegression", "Lot12Verification", Copy2, Copy2, Copy2, "Invoice number is successfully verified", "Invoice number is not verified");
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "WorkflowStep");
				}
				public static void NonVerifiedLotApplication() {
					EICompletedDate();
					EIConstructionStartDate();
					enterTextboxValue("RNCRegression", "EmailAddress", "ESG Values", "RNC_Regression", 4, 1);
					clickonSave();
					//Lot 1
					clickWebelement("RNCRegression", "Lots");
					clickWebelement("RNCRegression", "NewLots");
					enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 6, 1);
					enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 7, 1);
					enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 8, 1);
					enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 9, 1);
					enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 10, 1);
					enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 11, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					//Lot 2
					clickWebelement("RNCRegression", "NewLots");
					enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 13, 1);
					enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 14, 1);
					enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 15, 1);
					enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 16, 1);
					enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 17, 1);
					enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 18, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					//Lot 3
					clickWebelement("RNCRegression", "NewLots");
					enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 20, 1);
					enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 21, 1);
					enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 22, 1);
					enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 23, 1);
					enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 24, 1);
					enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 25, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					//Lot 4
					clickWebelement("RNCRegression", "NewLots");
					enterTextboxValue("RNCRegression", "LotNumber", "ESG Values", "RNC_Regression", 27, 1);
					enterTextboxValue("RNCRegression", "TrackNumber", "ESG Values", "RNC_Regression", 28, 1);
					enterTextboxValue("RNCRegression", "Street", "ESG Values", "RNC_Regression", 29, 1);
					enterTextboxValue("RNCRegression", "City", "ESG Values", "RNC_Regression", 30, 1);
					enterTextboxValue("RNCRegression", "State", "ESG Values", "RNC_Regression", 31, 1);
					enterTextboxValue("RNCRegression", "ZipCode", "ESG Values", "RNC_Regression", 32, 1);
					clickonSave();
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "Close");
					clickonProcess();
					ValidateWithElement("RNCRegression", "WorkflowValidation", "Pre-Engineering", "Pre-Engineering", "Pre-Engineering", "Pre-Engineering workflow step has been generated", "Pre-Engineering workflow step has not generated");
		}
				public static void NonVerifiedInitiatePaymentMethod1() {
					clickWebelement("RNCRegression", "InitiatePayment");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName3", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName3", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickWebelement("RNCRegression", "InitiatePaymentRequest");
					clickonSave();
					clickonProcess();
					ValidateWithElement("RNCRegression", "VerifyStatus", "Pending Approval", "Pending Approval", "Pending Approval", "Payment Request Status is Verified", "Payment Request Status is not Verified");
					ValidateWithElement("RNCRegression", "VerifyPayee", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyAmount", "$20,000.00", "$20,000.00", "$20,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					clickWebelement("RNCRegression", "PaymentrequestLink");
					TextBoxvalue("Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified", "RNCRegression", "VerifyPayeeName");
					//ValidateWithElement("RNCRegression", "VerifyPayeeName", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyTotalAmount", "$20,000.00", "$20,000.00", "$20,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					threadWait(2500);
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "Lots");
					String Copy1 = driver.findElement(By.xpath("//tr[@id='ctl00_cphSiteMaster_rgLots_ctl00__0']//td[10]")).getText();
					String Copy2 = driver.findElement(By.xpath("//tr[@id='ctl00_cphSiteMaster_rgLots_ctl00__1']//td[10]")).getText();
					ValidateWithElement("RNCRegression", "Lot11Verification", Copy1, Copy1, Copy1, "Invoice number is successfully verified", "Invoice number is not verified");
					ValidateWithElement("RNCRegression", "Lot12Verification", Copy2, Copy2, Copy2, "Invoice number is successfully verified", "Invoice number is not verified");
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "WorkflowStep");
				}
				public static void NonVerifiedInitiatePaymentMethod2() {
					clickWebelement("RNCRegression", "InitialPayment2");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName3", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName3", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickWebelement("RNCRegression", "InitiatePaymentRequest");
					clickonSave();
					clickonProcess();
					ValidateWithElement("RNCRegression", "VerifyStatus", "Pending Approval", "Pending Approval", "Pending Approval", "Payment Request Status is Verified", "Payment Request Status is not Verified");
					ValidateWithElement("RNCRegression", "VerifyPayee", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyAmount", "$20,000.00", "$20,000.00", "$20,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					clickWebelement("RNCRegression", "PaymentRequestLink2");
					TextBoxvalue("Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified", "RNCRegression", "VerifyPayeeName");
					//ValidateWithElement("RNCRegression", "VerifyPayeeName", "Hall, Rose Nash", "Hall, Rose Nash", "Hall, Rose Nash", "Payee Name is Verified", "Payee Name is not Verified");
					ValidateWithElement("RNCRegression", "VerifyTotalAmount", "$20,000.00", "$20,000.00", "$20,000.00", "Amount is Verified Successfully", "Amount is not Verified");
					threadWait(2500);
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "Lots");
					String Copy1 = driver.findElement(By.xpath("//tr[@id='ctl00_cphSiteMaster_rgLots_ctl00__2']//td[10]")).getText();
					String Copy2 = driver.findElement(By.xpath("//tr[@id='ctl00_cphSiteMaster_rgLots_ctl00__3']//td[10]")).getText();
					ValidateWithElement("RNCRegression", "Lot21Verification", Copy1, Copy1, Copy1, "Invoice number is successfully verified", "Invoice number is not verified");
					ValidateWithElement("RNCRegression", "Lot22Verification", Copy2, Copy2, Copy2, "Invoice number is successfully verified", "Invoice number is not verified");
					clickWebelement("RNCRegression", "Close");
					clickWebelement("RNCRegression", "WorkflowStep");
				}
				public static void PostEngineeringMethod2() {
					threadWait(2500);
					clickWebelement("RNCRegression", "PostEngineering2");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickonProcess();
				}
				public static void QAreviewMethod2() {
					clickWebelement("RNCRegression", "QAReview2");
					threadWait(5000);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName2", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(6000);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName2", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickWebelement("RNCRegression", "PaymentRequest");
					clickWebelement("RNCRegression", "Verify11");
					clickWebelement("RNCRegression", "Verify21");
					clickonSave();
					clickonProcess();
				}
				public static void CloseMethod2() {
					clickWebelement("RNCRegression", "AddWorkFlowStep");
					threadWait(2500);
					SwitchToFrame("RNCRegression", "SwitchFrame");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "Workflowstep", "ESG Values", "RNC_Regression", 78, 1);
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "AssignTo", "ESG Values", "RNC_Regression", 79, 1);
					threadWait(10000);
					clickWebelement("RNCRegression", "Apply");
					threadWait(2500);
					clickWebelement("RNCRegression", "Closeout2");
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "tradeAllyName", "ESG Values", "RNC_Regression", 66, 1);
					threadWait(2500);
					selectDropdownByVisibleText("RNCRegression", "EmployeeName", "ESG Values", "RNC_Regression", 67, 1);
					selectActualReviewDate();
					clickonProcess();
					ValidateWithElement("RNCRegression", "ApplicationStatus", "Closed", "Closed", "Closed", "Application Status is successfully Verified", "Application Status is not Verified");
					}
}
