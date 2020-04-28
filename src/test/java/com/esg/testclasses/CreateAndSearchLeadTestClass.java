package com.esg.testclasses;

import java.awt.event.KeyEvent;

import com.esg.utilities.HelperClass;

public class CreateAndSearchLeadTestClass extends HelperClass {

	public static void login() {

		login("Helper","BaseURL", 1, 0, 1, 1);
	}

	public static void NavigateToLeadList() {
		//enterTextboxValue("Create_SearchLead", "MainMenu", "ESG Values", "CreateAndSearchLead", 1, 1);
		linkText("Main Menu").click();
		linkText("Leads").click();
		threadWait(2000);
		selectDropdown("Create_SearchLead", "AssignedToTradeAlly", "AssignedToTradeAlly", "ESG Values", "CreateAndSearchLead", 2,
				1);
		threadWait(2000);
		selectDropdown("Create_SearchLead", "LeadStatus","LeadStatus", "ESG Values", "CreateAndSearchLead", 3, 1);
		threadWait(3000);
		selectDropdown("Create_SearchLead", "Employee","Employee", "ESG Values", "CreateAndSearchLead", 4, 1);
		threadWait(2000);
	}
	public static void ClickonSearchButton() {
		threadWait(5000);
		scrollToElement("Create_SearchLead", "SearchButton");
		clickWebelement("Create_SearchLead", "SearchButton");
		threadWait(5000);
	}

	public static void Navigate_To_LeadDetailsPage() {
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "NewButton");
		selectDropdown("Create_SearchLead", "SelectProgram","SelectProgram", "ESG Values", "CreateAndSearchLead", 5, 1);
		threadWait(2000);
		clickWebelement("Create_SearchLead", "NextButton");
		threadWait(7000);
		enterTextboxValue("Create_SearchLead", "SearchType", "ESG Values", "CreateAndSearchLead", 6, 1);
		clickWebelement("Create_SearchLead", "Go");
		threadWait(4000);
		clickWebelement("Create_SearchLead", "Customer");
		clickWebelement("Create_SearchLead", "NextButton");
		threadWait(6000);
		defineLogs("Lead Summary", "Lead Summary", "Lead Summary",
				"Navigate to Lead Detail page Successfully", "Unable to Navigate to Lead Detail Page",
				"Create_SearchLead", "VerifyLeadDetail");
	}

	public static void Create_Lead() {
		clickWebelement("Create_SearchLead", "DuedateImage");
		Enter(KeyEvent.VK_ENTER);
		enterTextboxValue("Create_SearchLead", "Lastname", "ESG Values", "CreateAndSearchLead", 8, 1);
		enterTextboxValue("Create_SearchLead", "Email", "ESG Values", "CreateAndSearchLead", 9, 1);

		clickWebelement("Create_SearchLead", "PrimaryLanguage");
		enterTextboxValue("Create_SearchLead", "SearchFromList", "ESG Values", "CreateAndSearchLead", 10, 1);
		Enter(KeyEvent.VK_ENTER);
		clickWebelement("Create_SearchLead", "BuildingType");
		enterTextboxValue("Create_SearchLead", "SearchFromList", "ESG Values", "CreateAndSearchLead", 11, 1);
		Enter(KeyEvent.VK_ENTER);

		scrollToElement("Create_SearchLead", "AppointmentDateImage");
		clickWebelement("Create_SearchLead", "AppointmentDateImage");
		Enter(KeyEvent.VK_ENTER);
		
		threadWait(3000);
		clickWebelement("Create_SearchLead", "AccountExecutive");
		enterTextboxValue("Create_SearchLead", "SearchFromList", "ESG Values", "CreateAndSearchLead", 12, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickWebelement("Create_SearchLead", "LeadSourceCategory");
		enterTextboxValue("Create_SearchLead", "SearchFromList", "ESG Values", "CreateAndSearchLead", 13, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickWebelement("Create_SearchLead", "LeadSource");
		enterTextboxValue("Create_SearchLead", "SearchFromList", "ESG Values", "CreateAndSearchLead", 14, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickWebelement("Create_SearchLead", "Campaign");
		enterTextboxValue("Create_SearchLead", "SearchFromList", "ESG Values", "CreateAndSearchLead", 15, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickWebelement("Create_SearchLead", "OutreachSourceTradeAlly");
		enterTextboxValue("Create_SearchLead", "SearchFromList", "ESG Values", "CreateAndSearchLead", 16, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickWebelement("Create_SearchLead", "OutreachSourceEmployee");
		enterTextboxValue("Create_SearchLead", "SearchFromList", "ESG Values", "CreateAndSearchLead", 17, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickonSave();
		clickWebelement("Create_SearchLead", "ResolveLead");
		clickWebelement("Create_SearchLead", "Completed");
		enterTextboxValue("Create_SearchLead", "Comments_Section", "ESG Values", "CreateAndSearchLead", 18, 1);
		clickWebelement("Create_SearchLead", "OkButton");
		threadWait(4000);
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "DuedateFromImage");
		Enter(KeyEvent.VK_ENTER);
		threadWait(2000);
		clickWebelement("Create_SearchLead", "DuedateToImage");
		Enter(KeyEvent.VK_ENTER);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"New Lead Creted Successfully", "Failed to create the new Lead", "Create_SearchLead",
				"VerifyCreatedLead");
	}
	
	public static void Search_Lead() {
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterAccountNumber");
		enterTextboxValue("Create_SearchLead", "EnterAccountNumber", "ESG Values", "CreateAndSearchLead", 20, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Account Number validated Successfully", "Failed to validate Account Number", "Create_SearchLead",
				"VerifyAccountNumber");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterLeadNumber");
		enterTextboxValue("Create_SearchLead", "EnterLeadNumber", "ESG Values", "CreateAndSearchLead", 21, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Lead Number validated Successfully", "Failed to validate Lead Number", "Create_SearchLead",
				"VerifyLeadNumber");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterTaxID_SSN");
		enterTextboxValue("Create_SearchLead", "EnterTaxID_SSN", "ESG Values", "CreateAndSearchLead", 22, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Tax ID/SSN validated Successfully", "Failed to validate Tax ID/SSN", "Create_SearchLead",
				"VerifyTaxID_SSN");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterCustomerName");
		enterTextboxValue("Create_SearchLead", "EnterCustomerName", "ESG Values", "CreateAndSearchLead", 23, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Customer Name validated Successfully", "Failed to validate Customer Name", "Create_SearchLead",
				"VerifyCustomerName");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterPhone");
		enterTextboxValue("Create_SearchLead", "EnterPhone", "ESG Values", "CreateAndSearchLead", 24, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Phone Number validated Successfully", "Failed to validate Phone Number", "Create_SearchLead",
				"VerifyPhone");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterCity");
		enterTextboxValue("Create_SearchLead", "EnterCity", "ESG Values", "CreateAndSearchLead", 25, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"City Name validated Successfully", "Failed to validate City Name", "Create_SearchLead",
				"VerifyCity");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterZip");
		enterTextboxValue("Create_SearchLead", "EnterZip", "ESG Values", "CreateAndSearchLead", 26, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Zip Code validated Successfully", "Failed to validate Zip Code", "Create_SearchLead",
				"VerifyZip");
		
		NavigateToLeadList();
		selectDropdown("Create_SearchLead", "EnterZone","EnterZone", "ESG Values", "CreateAndSearchLead", 27, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Entered Zone validated Successfully", "Failed to validate Entered Zone", "Create_SearchLead",
				"VerifyZone");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterAssignedDate");
		enterTextboxValue("Create_SearchLead", "EnterAssignedDate", "ESG Values", "CreateAndSearchLead", 28, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Assigned Date validated Successfully", "Failed to validate Assigned Date", "Create_SearchLead",
				"VerifyAssignedDate");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterScheduledDate");
		enterTextboxValue("Create_SearchLead", "EnterScheduledDate", "ESG Values", "CreateAndSearchLead", 29, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Scheduled Date validated Successfully", "Failed to validate Scheduled Date", "Create_SearchLead",
				"VerifyScheduledDate");
		
		NavigateToLeadList();
		clickWebelement("Create_SearchLead", "EnterDueDate");
		enterTextboxValue("Create_SearchLead", "EnterDueDate", "ESG Values", "CreateAndSearchLead", 30, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Due Date validated Successfully", "Failed to validate Due Date", "Create_SearchLead",
				"VerifyDueDate");
		
		NavigateToLeadList();
		selectDropdown("Create_SearchLead", "EnterAssignedTradeAlly","EnterAssignedTradeAlly", "ESG Values", "CreateAndSearchLead", 31, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Assigned TradeAlly validated Successfully", "Failed to validate Assigned TradeAlly", "Create_SearchLead",
				"VerifyAssignedTradeAlly");
		
		NavigateToLeadList();
		selectDropdown("Create_SearchLead", "EnterProgram","EnterProgram", "ESG Values", "CreateAndSearchLead", 32, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Program Name validated Successfully", "Failed to validate Program Name", "Create_SearchLead",
				"VerifyProgram");
		
		NavigateToLeadList();
		selectDropdown("Create_SearchLead", "EnterLeadType","EnterLeadType", "ESG Values", "CreateAndSearchLead", 33, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Lead Type validated Successfully", "Failed to validate Lead Type", "Create_SearchLead",
				"VerifyLeadType");
		
		NavigateToLeadList();
		selectDropdown("Create_SearchLead", "EnterLeadStatus","EnterLeadStatus", "ESG Values", "CreateAndSearchLead", 34, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Lead Status validated Successfully", "Failed to validate Lead Status", "Create_SearchLead",
				"VerifyLeadStatus");
		
		NavigateToLeadList();
		selectDropdown("Create_SearchLead", "EnterEmployee","EnterEmployee", "ESG Values", "CreateAndSearchLead", 35, 1);
		ClickonSearchButton();
		defineLogs("Show Search Details...", "Show Search Details...", "Show Search Details...",
				"Employee validated Successfully", "Failed to validate Employee", "Create_SearchLead",
				"VerifyEmployee");
	}
	
}
