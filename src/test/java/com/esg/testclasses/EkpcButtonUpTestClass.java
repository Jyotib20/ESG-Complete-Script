package com.esg.testclasses;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.esg.utilities.HelperClass;

public class EkpcButtonUpTestClass extends HelperClass {
	public static void Login() {
		login("helper","BaseURL", 1, 0, 1, 1);
	}
	
	public static void Enrollment() {
		
		ClickByActionClass("EKPCButtonUp", "MainMenu", "ESG Values", "EKPC ButtonUp", 1, 1);
		clickWebelement("EKPCButtonUp", "NewButton");
		selectDropdownByVisibleText("EKPCButtonUp", "SelectProgram", "ESG Values", "EKPC ButtonUp", 2, 1);
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "NextButton");
		enterTextboxValue("EKPCButtonUp", "SearchType", "ESG Values", "EKPC ButtonUp", 3, 1);
		clickWebelement("EKPCButtonUp", "SearchGo");
		clickWebelement("EKPCButtonUp", "Customer");
		clickWebelement("EKPCButtonUp", "NextGo");
	}
	public static void Lead() {
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "Email");
		threadWait(2500);
		scrollToElement("EKPCButtonUp", "Street");
		clearWebelement("EKPCButtonUp", "Street");
		threadWait(2500);
		enterTextboxValue("EKPCButtonUp", "Street", "ESG values", "EKPC ButtonUp", 4, 1);
		threadWait(2500);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "resolveLead");
		clickWebelement("EKPCButtonUp", "StatusCompleted");
		threadWait(2500);
		enterTextboxValue("EKPCButtonUp", "TextBox", "ESG values", "EKPC ButtonUp", 5, 1);
		clickWebelement("EKPCButtonUp", "Ok");
		threadWait(5000);
}
	public static void NeedToBeRammed() {
		ClickByActionClass("EKPCButtonUp", "MainMenu", "ESG Values", "EKPC ButtonUp", 11, 1);
		clickWebelement("EKPCButtonUp", "NewButton");
		selectDropdownByVisibleText("EKPCButtonUp", "SelectProgram", "ESG Values", "EKPC ButtonUp", 2, 1);
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "NextButton");
		enterTextboxValue("EKPCButtonUp", "SearchType", "ESG Values", "EKPC ButtonUp", 3, 1);
		clickWebelement("EKPCButtonUp", "SearchGo");
		clickWebelement("EKPCButtonUp", "Customer");
		clickWebelement("EKPCButtonUp", "NextGo");
		clickWebelement("EKPCButtonUp", "InstallationDate");
		clickWebelement("EKPCButtonUp", "Date");
		scrollToElement("EKPCButtonUp", "TradeAlly");
		clickWebelement("EKPCButtonUp", "TradeAlly");
		handlePopup();
		enterTextboxValue("EKPCButtonUp", "SelectTradeAlly", "ESG values", "EKPC ButtonUp", 9, 1);
		threadWait(2500);
		enterTextboxValue("EKPCButtonUp", "TradeAllyName", "ESG values", "EKPC ButtonUp", 10, 1);
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "SaveTradeAlly");
		threadWait(5000);
		enterTextboxValue("EKPCButtonUp", "AgeOfHome", "ESG values", "EKPC ButtonUp", 31, 1);
		enterTextboxValue("EKPCButtonUp", "PremiseSqft", "ESG values", "EKPC ButtonUp", 32, 1);
		clickonSave();
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "Measure");
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "AddMeasure");
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "SelectAddMeasure");
		clickWebelement("EKPCButtonUp", "SaveAddMeasure");
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "MeasureID");
		WebElement Pass = driver.findElement(By.xpath("//td[@class='numeric-cell']//input[@class='k-formatted-value k-input']"));
		if(Pass.isEnabled())
		{
			enterValueByActionClass("EKPCButtonUp", "MeasureQty", "ESG Values", "EKPC ButtonUp", 12, 1);
		}
		else
		{
			System.out.println("Object is Disabled");
		}
		threadWait(2500);
		enterTextboxValue("EKPCButtonUp", "Foundation", "ESG values", "EKPC ButtonUp", 13, 1);
		enterTextboxValue("EKPCButtonUp", "ConstructionQuality", "ESG values", "EKPC ButtonUp", 14, 1);
		enterTextboxValue("EKPCButtonUp", "PrimaryHeatSource", "ESG values", "EKPC ButtonUp", 15, 1);
		enterTextboxValue("EKPCButtonUp", "SecondaryHeatSource", "ESG values", "EKPC ButtonUp", 16, 1);
		enterTextboxValue("EKPCButtonUp", "AirConditioningSystem", "ESG values", "EKPC ButtonUp", 17, 1);
		enterTextboxValue("EKPCButtonUp", "PrimaryHVACDuctLocation", "ESG values", "EKPC ButtonUp", 18, 1);
		enterTextboxValue("EKPCButtonUp", "SecondaryHVACDuctLocation", "ESG values", "EKPC ButtonUp", 19, 1);
		enterTextboxValue("EKPCButtonUp", "DuctsInsulated", "ESG values", "EKPC ButtonUp", 20, 1);
		clickWebelement("EKPCButtonUp", "BTUHCeiling");
		enterValueByActionClass("EKPCButtonUp", "BTUHCeiling", "ESG values", "EKPC ButtonUp", 21, 1);
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "BTUHFloor");
		enterValueByActionClass("EKPCButtonUp", "BTUHFloor", "ESG values", "EKPC ButtonUp", 22, 1);
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "BTUHWindows");
		enterValueByActionClass("EKPCButtonUp", "BTUHWindows", "ESG values", "EKPC ButtonUp", 23, 1);
		enterTextboxValue("EKPCButtonUp", "BTUHWall", "ESG values", "EKPC ButtonUp", 24, 1);
		enterTextboxValue("EKPCButtonUp", "BTUHAirSealing", "ESG values", "EKPC ButtonUp", 25, 1);
		clickWebelement("EKPCButtonUp", "BTUHDoor");
		enterValueByActionClass("EKPCButtonUp", "BTUHDoor", "ESG values", "EKPC ButtonUp", 26, 1);
		clickWebelement("EKPCButtonUp", "BTUHBasementWalls");
		enterValueByActionClass("EKPCButtonUp", "BTUHBasementWalls", "ESG values", "EKPC ButtonUp", 27, 1);
		scrollToElement("EKPCButtonUp", "BTUHKneeWalls");
		enterTextboxValue("EKPCButtonUp", "BTUHKneeWalls", "ESG values", "EKPC ButtonUp", 28, 1);
		enterTextboxValue("EKPCButtonUp", "BTUHBandBoard", "ESG values", "EKPC ButtonUp", 29, 1);
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "LabourHours");
		enterValueByActionClass("EKPCButtonUp", "LabourHours", "ESG values", "EKPC ButtonUp", 30, 1);
		clickWebelement("EKPCButtonUp", "AdministrativeCost");
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "AministrativeCpstCheckBox");
		clickWebelement("EKPCButtonUp", "LostRevenue");
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "LostRevenueCheckbox");
		clickonSave();
	}
	public static void Verification() {
		ValidateWithElement("EKPCButtonUp", "MeasureIQtyValidation", "1", "1", "1", "Measure Quantity value is Validated", "Measure Quantity value is In Correct");
		ValidateWithElement("EKPCButtonUp", "IncentiveUnitpriceValidation", "$404.04", "$404.04", "$404.04", "Incentive unit price value is Validated", "Incentive unit price value is In Correct");
		ValidateWithElement("EKPCButtonUp", "IncentiveAmountValidation", "$404.04", "$404.04", "$404.04", "Incentive Amount value is Validated", "Incentive Amount value is In Correct");
		ValidateWithElement("EKPCButtonUp", "SavingsKWhValidation", "1,708.7862", "1,708.7862", "1,708.7862", "Savings KWh value is Validated", "Savings KWh value is In Correct");
		ValidateWithElement("EKPCButtonUp", "SavingsWinterKWValidation", "1.3214", "1.3214", "1.3214", "Savings Winter KW value is Validated", "Savings Winter KW value is In Correct");
		ValidateWithElement("EKPCButtonUp", "SavingsSummerKWValidation", "0.4020", "0.4020", "0.4020", "Savings Summer KW value is Validated", "Savings Summer KW value is In Correct");
		ValidateWithElement("EKPCButtonUp", "ThermsValidation", "0.0000", "0.0000", "0.0000", "Therms value is Validated", "Therms value is In Correct");
		scrollToElement("EKPCButtonUp", "GrandTotalIncentive");
		ValidateWithElement("EKPCButtonUp", "GrandTotalIncentive", "$404.04", "$404.04", "$404.04", "Grand Total Incentive Amount value is Validated", "Grand Total Incentive Amount value is In Correct");
		ValidateWithElement("EKPCButtonUp", "GrandTotalKWh", "1,708.7862", "1,708.7862", "1,708.7862", "Grand Total Savings KWh value is Validated", "Grand Total Savings KWh value is In Correct");
		ValidateWithElement("EKPCButtonUp", "GrandTotalWinterKW", "1.3214", "1.3214", "1.3214", "Grand Total Savings Winter KW value is Validated", "Grand Total Savings Winter KW value is In Correct");
		ValidateWithElement("EKPCButtonUp", "GrandTotalSummerKW", "0.4020", "0.4020", "0.4020", "Grand Total Savings Summer KW value is Validated", "Grand Total Savings Summer KW value is In Correct");
		ValidateWithElement("EKPCButtonUp", "GrandTotalTherms", "0.0000", "0.0000", "0.0000", "Grand Total Therms value is Validated", "Grand Total Therms value is In Correct");
		ValidateWithElement("EKPCButtonUp", "AdministrationCost", "$230.00", "$230.00", "$230.00", "Administrative Cost Fee Amount is Validated", "Administrative Cost Fee Amount is In Correct");
		ValidateWithElement("EKPCButtonUp", "LostRevenue", "$303.03", "$303.03", "$303.03", "Lost Revsenue Fee Amount is Validated", "Lost Revenue Fee Amount is In Correct");
		ValidateWithElement("EKPCButtonUp", "TotalAmount", "$533.03", "$533.03", "$533.03", "Total Amount is Validated", "Total Amount is In Correct");
		ValidateWithElement("EKPCButtonUp", "WorkFlowStepSavingsKWh", "1708.7862", "1708.7862", "1708.7862", "WorkFlow Step Savings KWh value is Validated", "WorkFlow Step Savings KWh value is In Correct");
		ValidateWithElement("EKPCButtonUp", "WorkFlowStepSavingsWinterKW", "1.3214", "1.3214", "1.3214", "WorkFlow Step Savings Winter KW value is Validated", "WorkFlow Step Savings Winter KW value is In Correct");
		ValidateWithElement("EKPCButtonUp", "WorkFlowStepSavingsSummerKW", "0.4020", "0.4020", "0.4020", "WorkFlow Step Savings Summer KW value is Validated", "WorkFlow Step Savings Summer KW value is In Correct");
		ValidateWithElement("EKPCButtonUp", "WorkFlowStepSavingsTherms", "0.0000", "0.0000", "0.0000", "WorkFlow Step Therms value is Validated", "WorkFlow Step Therms value is In Correct");
		ValidateWithElement("EKPCButtonUp", "WorkFlowStepCostsIncentive", "$404.04", "$404.04", "$404.04", "WorkFlow Step Incentive value is Validated", "WorkFlow Step Therms value is In Correct");
		ValidateWithElement("EKPCButtonUp", "WorkFlowStepCostsFeeCost", "$533.03", "$533.03", "$533.03", "WorkFlow Step Fee Cost value is Validated", "WorkFlow Step Therms value is In Correct");
		ValidateWithElement("EKPCButtonUp", "WorkFlowStepCostsTotalCost", "$937.07", "$937.07", "$937.07", "WorkFlow Step Total Cost value is Validated", "WorkFlow Step Therms value is In Correct");
		ValidateWithElement("EKPCButtonUp", "TotalBTUHReduction", "10101", "10101", "10101", "Total BTUH Reduction value is Validated", "Total BTUH Reduction value is In Correct");
		clickonProcess();
	}
	public static void Invoicing() {
		threadWait(2500);
		ClickByActionClass("EKPCButtonUp", "MainMenu", "ESG Values", "EKPC ButtonUp", 36, 1);
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "NewInvoice");
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "InvoiceNext");
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "Invoiceprgrm");
		enterTextboxValue("EKPCButtonUp", "InvoicePrgmName", "ESG values", "EKPC ButtonUp", 33, 1);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("EKPCButtonUp", "InvoicePrgmYear");
		enterTextboxValue("EKPCButtonUp", "InvoicePrgmDate", "ESG values", "EKPC ButtonUp", 34, 1);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("EKPCButtonUp", "InvoicePayee");
		enterTextboxValue("EKPCButtonUp", "InvoicePayeeName", "ESG values", "EKPC ButtonUp", 35, 1);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("EKPCButtonUp", "CreateInvoice");
		threadWait(10000);
		if (driver.getPageSource().contains("A draft Invoice(s) already exists, would you like to proceed and over-write the existing draft Invoice(s)?")) {
			
			clickWebelement("EKPCButtonUp", "DraftOk");
			
		} else {
				System.out.println("Does not display Popup Window");
		}
		enterTextboxValue("EKPCButtonUp", "PayeeName", "ESG values", "EKPC ButtonUp", 37, 1);
		threadWait(2500);
		clickWebelement("EKPCButtonUp", "GenerateInvoice");
		handlePopup();
		threadWait(5000);
		ValidateWithElement("EKPCButtonUp", "InvoiceStatus", "Pending Approval", "Pending Approval", "Pending Approval", "Invoice Status is Validated", "Invoice Status is In Correct");
		ValidateWithElement("EKPCButtonUp", "SummaryInvoiceTotal", "$937.07", "$937.07", "$937.07", "Invoice Total is Validated", "Invoice Total is In Correct");
		ValidateWithElement("EKPCButtonUp", "InvoiceTotal", "$937.07", "$937.07", "$937.07", "Invoice Total is Validated", "Invoice Total is In Correct");
		clickWebelement("EKPCButtonUp", "ApproveInvoice");
		threadWait(2500);
		ValidateWithElement("EKPCButtonUp", "InvoiceStatus", "Submitted to Accounting - Awaiting Payment", "Submitted to Accounting - Awaiting Payment", "Submitted to Accounting - Awaiting Payment", "Invoice Status is Validated", "Invoice Status is In Correct");
		
	}

}