package com.esg.utilities;

public class HelperClass extends ExtentReport
{	
	
	public static void OpenBrowser(String Filename,String URL) 
	{
		  //setProperty("helper", "ie", "IE_Path");
		  setProperty("helper", "chrome", "Chrome_Path");
		  //openInternetExploer();		  
		  openChrome();
		  maximizeWindow();
	  	  implicitlywait(30);
		  openURL(Filename,URL);
		  
		}   	
	public static void login(String Relevant_Filename,String Provided_URL,int UsernameRow,int UsernameColumn,int PasswordRow,int PasswordColumn) 
	{
		  ExecutingAgainst("helper", "Version");
		  OpenBrowser(Relevant_Filename, Provided_URL);
		  enterTextboxValue("helper", "Username_Xpath", "LoginData", "Login", UsernameRow, UsernameColumn);
		  enterTextboxValue("helper", "Password_Xpath", "LoginData", "Login", PasswordRow, PasswordColumn);
		  clickWebelement("helper","Login_Xpath");
		  defineLogs("Logout", "Logout", "Logout", "User was Loggedin Successfully", "User is not able to Login","helper", "Logout_Xpath");
		  Report.endTest(test);
	}   	
	
	
public static void login2(int UsernameRow,int UsernameColumn,int PasswordRow,int PasswordColumn) {
		
		openURL("helper", "BaseURL");
		if (driver.getPageSource().contains("Logout")) {
			clickWebelement("helper", "Logout_Xpath");
		}
		else
			threadWait(2500);
		  enterTextboxValue("helper", "Username_Xpath", "LoginData", "Login", UsernameRow, UsernameColumn);
		  enterTextboxValue("helper", "Password_Xpath", "LoginData", "Login", PasswordRow, PasswordColumn);
		  clickWebelement("helper","Login_Xpath");
		  maximizeWindow();	
	}
	public static void createEnrollment(int programRow,int programCoulmn,int accountRow,int accountCoulmn )
	{
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		clickWebelement("helper", "NewButton");
		selectDropdownValue("helper", "SelectProgram_Dropdown", "CreateEnrollments", "Enrollments", programRow,programCoulmn);
		explicitWaitForClickable(3000, "helper", "NextButton");
		clickWebelement("helper", "NextButton");
		clickWebelement("helper", "GeneralSearch_Dropdown");		
		selectDropdownValue("helper", "GeneralSearch_Dropdown", "CreateEnrollments", "Enrollments", 3, 0);
		enterTextboxValue("helper", "EnterAccountNumber", "CreateEnrollments", "Enrollments", accountRow, accountCoulmn);
		clickWebelement("helper", "ClickOn_GoButton");
	    clickWebelement("helper", "ClickOn_CustomerName");	
	    explicitWaitForClickable(3000, "helper", "NextButton");
	    clickWebelement("helper", "NextButton");	   
	    //enterlogs("Enrollment was Created Successfully");
	    defineLogs("Application - Applicant Information - New", "Application - Applicant Information - New", "Application - Applicant Information - New", "Enrollment was Created Successfully", "Enrollment was not Created", "helper", "Varify_Enrollment");
	
	}
	public static void clickonProcess()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		scrollToElement("helper", "ProcessButton");
		clickWebelement("helper", "ProcessButton");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}
	public static void clickonSave()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		scrollToElement("helper", "SaveButton");
		clickWebelement("helper", "SaveButton");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}	
	public static void selectMeasures()
	{
		scrollToElement("helper", "MeasureSub_Section");
		clickWebelement("helper", "MeasureSub_Section");
	}
	
	public static void selectApplicantInformation()
	{
		scrollToElement("helper", "ApplicantInformationSub_Section");
		clickWebelement("helper", "ApplicantInformationSub_Section");
	}
	public static void selectActualReviewDate()
	{
		clickWebelement("helper", "ActualReviewDateImage");				
		clickWebelement("helper", "SelectDate");
		clickonSave();
	}
	public static void selectActualVisitDate()
	{
		clickWebelement("helper", "ActualVisitDateImage");				
		clickWebelement("helper", "SelectDate");
		clickonSave();
	}
	public static void selectLOIApprovedDate()
	{
		clickWebelement("helper", "LOIApprovedDateImage");				
		clickWebelement("helper", "SelectDate");
		clickonSave();
	}
	public static void selectDueDate()
	{
		clickWebelement("helper", "DueDateImage");				
		clickWebelement("helper", "SelectDate");
		clickonSave();
	}
	public static void SelectIncentiveAgreementTargetDate()
	{
		clickWebelement("helper", "IncentiveAgreementTargetDateImage");				
		clickWebelement("helper", "SelectDate");
		clickonSave();
	}
	public static void SelectEstimatedInstallationCompletionDate()
	{
		clickWebelement("helper", "EstimatedInstallationCompletionDateImage");				
		clickWebelement("helper", "SelectDate");
		clickonSave();
	}
	public static void selectReadyForPayment()
	{	
		scrollToElement("helper", "ReadyForPayment_YES");
		clickWebelement("helper", "ReadyForPayment_YES");
		clickonSave();
	}
	public static void InstallationDate() {
		clickWebelement("helper", "InstallationDate");
		threadWait(2500);
		clickWebelement("helper", "SelectDate");
	}
	public static void CustomerSignDate() {
		clickWebelement("helper", "InstallationDate");
		threadWait(2500); 
		clickWebelement("helper", "CustomerSignDate");
	}
	public static void ApplicationInstallationDate() {
		clickWebelement("helper", "ApplicationInstallationDate");
		threadWait(2500);
		clickWebelement("helper", "ApplicationDate");
		clickonSave();
	}  
	public static void EICompletedDate() {
		clickWebelement("helper", "EICompleteDate");
		threadWait(2500);
		clickWebelement("helper", "SelectDate");
		
	}
	public static void EIConstructionStartDate() {
		clickWebelement("helper", "ECStartDate");
		threadWait(2500);
		clickWebelement("helper", "SelectDate");
	}
	public static void AgreementSignDateApplicant() {
		clickWebelement("helper", "AgreementSignDateApplicant");
		threadWait(2500);
		clickWebelement("helper", "SelectDate");
}	
	public static void AgreementSignDateManagement() {
		clickWebelement("helper", "AgreementSignDateManagement");
		threadWait(2500);
		clickWebelement("helper", "SelectDate");
		
	}
	public static void clickonclose()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		scrollToElement("helper", "CloseButton");
		clickWebelement("helper", "CloseButton");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}

		public static void PurchaseDate() {
		clickWebelement("helper", "PurchaseDate");
		threadWait(2500);
		clickWebelement("helper", "SelectPurchaseDate");
	}
		public static void InstallationDate2() {
			clickWebelement("helper", "InstallationDate2");
			threadWait(2500);
			clickWebelement("helper", "SelectDate");
		}
}	
