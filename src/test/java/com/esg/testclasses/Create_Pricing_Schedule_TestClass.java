package com.esg.testclasses;

import com.esg.utilities.HelperClass;

public class Create_Pricing_Schedule_TestClass extends HelperClass{
	
	public static void Navigate_To_Program_Page() {
		ClickByActionClass("End_To_End_Program_Configuration", "Configuration", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 1, 1);
	}

	public static void Create_New_Schedule() {
		WaitForElement(30, "End_To_End_Program_Configuration", "New_Button");
		clickWebelement("End_To_End_Program_Configuration", "New_Button");
		selectDropdown("End_To_End_Program_Configuration", "Program_Year","Program_Year_Search", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 2, 1);
		Effective_Date();
	//	selectDropdown("End_To_End_Program_Configuration", "Trade_Ally_Dropdown","Trade_Ally_Search", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 3, 1);
		threadWait(2500);
		selectDropdown("End_To_End_Program_Configuration", "Incentive_Information","", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 4, 1);
		clearWebelement("End_To_End_Program_Configuration", "Incentive_Information_Amount");
		enterTextboxValue("End_To_End_Program_Configuration", "Incentive_Information_Amount", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 5, 1);
		threadWait(2500);
		selectDropdown("End_To_End_Program_Configuration", "Measure_Cost","", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 6, 1);
		clearWebelement("End_To_End_Program_Configuration", "Measure_Cost_Amount");
		enterTextboxValue("End_To_End_Program_Configuration", "Measure_Cost_Amount", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 7, 1);
		threadWait(2500);
		selectDropdown("End_To_End_Program_Configuration", "Incremental_Measure_Cost","", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 8, 1);
		clearWebelement("End_To_End_Program_Configuration", "Incremental_Measure_Cost_Amount");
		enterTextboxValue("End_To_End_Program_Configuration", "Incremental_Measure_Cost_Amount", "End_To_End_Configuration", "Create_New_Pricing_Schedule", 9, 1);
		HandleErrorCodeOnSave("End_To_End_Program_Configuration", "SaveButton", "");
		
	}
	public static void Budget_Allocation() {
		WaitForElement(30, "End_To_End_Program_Configuration", "Budget_Allocation_Button");
		clickWebelement("End_To_End_Program_Configuration", "Budget_Allocation_Button");
		
	}
}