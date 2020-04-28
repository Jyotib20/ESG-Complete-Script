package com.esg.testclasses;

import java.awt.event.KeyEvent;

import org.openqa.selenium.NoSuchElementException;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class ThresholdsTestClass extends HelperClass {
	public static void login() {

		login("Helper","BaseURL", 1, 0, 1, 1);
	}

	public static void NavigateToEnrollment(int Progrow, int progcolumn, int Accountnorow, int Accountnocolumn, String Required_Customer) {
		threadWait(2000);
		//enterTextboxValue("Threshold", "MainMenu", "ESG Values", "Thresholds", 1, 1);
		linkText("Main Menu").click();
		linkText("Enrollments").click();
		clickWebelement("Threshold", "NewEnrollment");
		selectDropdown("Threshold", "SelectProgram","SelectProgram", "ESG Values", "Thresholds", Progrow, progcolumn);
		clickWebelement("Threshold", "NextButton");
		enterTextboxValue("Threshold", "AccountNumber", "ESG Values", "Thresholds", Accountnorow, Accountnocolumn);
		clickWebelement("Threshold", "Go");
		doubleClickWebelement("Threshold", Required_Customer);
		threadWait(5000);
	}

	public static void Process_Application() {
		scrollToElement("Threshold", "ApplicantInformation");
		clickWebelement("Threshold", "ApplicantInformation");
		clickonSave();
		clickonProcess();
	}

	public static void Complete_Installation() {
		test.log(LogStatus.INFO, "Installation Workflow Step exists on this Enrollment");
		clickWebelement("Threshold", "Installation_WorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Verify_PreInspection_KickOff() {
		try {
			Xpath("Threshold", "Pre_Inspection_WorkflowStep").isDisplayed();
			Complete_PreInspection();
		} catch (NoSuchElementException e) {
			test.log(LogStatus.INFO, "Pre-Inspection Workflow Step does not exists on this Enrollment");
		}

	}

	public static void Complete_PreInspection() {
		test.log(LogStatus.INFO, "Pre-Inspection Workflow Step exists on this Enrollment");
		clickWebelement("Threshold", "Pre_Inspection_WorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickonProcess();
	}

	public static void Verify_Post_Inspection_KickOff() {
		try {
			Xpath("Threshold", "Post_Inspection_WorkflowStep").isDisplayed();
			Complete_Post_Inspection();
		} catch (NoSuchElementException e) {
			test.log(LogStatus.INFO, "Post-Inspection Workflow Step does not exists on this Enrollment");
		}

	}

	public static void Complete_Post_Inspection() {
		test.log(LogStatus.INFO, "Post-Inspection Workflow Step exists on this Enrollment");
		clickWebelement("Threshold", "Post_Inspection_WorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickWebelement("Threshold", "ClickOn_FCT");
		enterTextboxValue("Threshold", "Post_Inspection_FailedQty", "ESG Values", "Thresholds", 4, 1);
		if (Xpath("Threshold", "Post_Inspection_2ndFailedQty").isDisplayed()) {
			clickWebelement("Threshold", "ClickOnIM");
			enterTextboxValue("Threshold", "Post_Inspection_2ndFailedQty", "ESG Values", "Thresholds", 4, 1);
		} else {
			System.out.println("2nd Measure is not added");
		}
		/*try {
		Xpath("Threshold", "Post_Inspection_2ndFailedQty").isDisplayed();
			clickWebelement("Threshold", "ClickOnIM");
			enterTextboxValue("Threshold", "Post_Inspection_2ndFailedQty", "ESG Values", "Thresholds", 4, 1);
			
		} catch (Exception e) {
			System.out.println("2nd Measure is not added");
		}*/
		clickonProcess();
		}
	
	public static void Verify_PreEngineering_KickOff() {
		try {
			Xpath("Threshold", "Pre_Engineering_WorkflowStep").isDisplayed();
			Complete_PreEngineering();
		} catch (NoSuchElementException e) {
			test.log(LogStatus.INFO, "Pre-Engineering Workflow Step does not exists on this Enrollment");
		}
		
	}

	public static void Complete_PreEngineering() {
		test.log(LogStatus.INFO, "Pre-Engineering Workflow Step exists on this Enrollment");
		clickWebelement("Threshold", "Pre_Engineering_WorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickonProcess();
	}
	
	public static void Verify_Post_Engineering_KickOff() {
		try {
			Xpath("Threshold", "Post_Engineering_WorkflowStep").isDisplayed();
			Complete_Post_Engineering();
		} catch (NoSuchElementException e) {
			test.log(LogStatus.INFO, "Post-Engineering Workflow Step does not exists on this Enrollment");
		}
		
	}

	public static void Complete_Post_Engineering() {
		test.log(LogStatus.INFO, "Post-Engineering Workflow Step exists on this Enrollment");
		clickWebelement("Threshold", "Post_Engineering_WorkflowStep");
		threadWait(2000);
		selectActualVisitDate();
		clickonProcess();
	}
	
	public static void Verify_MandV_KickOff() {
		try {
			Xpath("Threshold", "MandV_WorkflowStep").isDisplayed();
			test.log(LogStatus.INFO, "M&V Workflow Step exists on this Enrollment");
		} catch (NoSuchElementException e) {
			test.log(LogStatus.INFO, "M&V Workflow Step does not exists on this Enrollment");
		}
		
	}
	
	public static void Verify_QAReview_KickOff() {
		try {
			Xpath("Threshold", "QAReview_WorkflowStep").isDisplayed();
			test.log(LogStatus.INFO, "QA Review Workflow Step exists on this Enrollment");
			clickWebelement("Threshold", "QAReview_WorkflowStep");
			threadWait(3000);
		} catch (NoSuchElementException e) {
			test.log(LogStatus.INFO, "QA Review Workflow Step does not exists on this Enrollment");
		}
		
	}
	
    public static void NavigateAndOpenAddMeasurewindow() {
    	scrollToElement("Threshold", "Measure");
    	clickWebelement("Threshold", "Measure");
		threadWait(2000);
		clickWebelement("Threshold", "AddMeasureImage");
		threadWait(2000);
	}
    
	public static void Program_Percent() {
		NavigateToEnrollment(5, 1, 3, 1,"Customer");
		NavigateAndOpenAddMeasurewindow();
		clickWebelement("Threshold", "Select_Basic");
		clickWebelement("Threshold", "SaveMeasure");
		threadWait(3000);
		Process_Application();
		Verify_PreInspection_KickOff();
		Verify_PreEngineering_KickOff();
		Complete_Installation();
		Verify_Post_Inspection_KickOff();
		Verify_Post_Engineering_KickOff();
		Verify_MandV_KickOff();
	}
	public static void Measure_Percent() {
		NavigateToEnrollment(5, 1, 3, 1,"Customer");
		NavigateAndOpenAddMeasurewindow();
		clickWebelement("Threshold", "Select_IM");
		clickWebelement("Threshold", "Select_FCT");
		clickWebelement("Threshold", "SaveMeasure");
		threadWait(2000);
		clickWebelement("Threshold", "ClickOn_FCT");
		enterTextboxValue("Threshold", "FCT_EnterMeasureQty", "ESG Values", "Thresholds", 6, 1);
		threadWait(3000);
		Process_Application();
		Verify_PreInspection_KickOff();
		Verify_PreEngineering_KickOff();
		Complete_Installation();
		Verify_Post_Inspection_KickOff();
		Verify_Post_Engineering_KickOff();
		Verify_MandV_KickOff();
	}
	
	public static void Not_Necessary() {
		NavigateToEnrollment(5, 1, 3, 1,"Customer");
		NavigateAndOpenAddMeasurewindow();
		clickWebelement("Threshold", "Select_MQ");
		clickWebelement("Threshold", "Select_FCT");
		clickWebelement("Threshold", "SaveMeasure");
		threadWait(2000);
		clickWebelement("Threshold", "ClickOn_FCT");
		enterTextboxValue("Threshold", "FCT_EnterMeasureQty", "ESG Values", "Thresholds", 6, 1);
		threadWait(3000);
		Process_Application();
		Verify_PreInspection_KickOff();
		Verify_PreEngineering_KickOff();
		Complete_Installation();
		Verify_Post_Inspection_KickOff();
		Verify_Post_Engineering_KickOff();
		Verify_MandV_KickOff();
	}
	
	public static void Mandatory() {
		NavigateToEnrollment(5, 1, 3, 1,"Customer");
		NavigateAndOpenAddMeasurewindow();
		clickWebelement("Threshold", "Select_STM_SCA");
		clickWebelement("Threshold", "Select_FCT");
		clickWebelement("Threshold", "SaveMeasure");
		threadWait(2000);
		clickWebelement("Threshold", "ClickOn_FCT");
		enterTextboxValue("Threshold", "FCT_EnterMeasureQty", "ESG Values", "Thresholds", 6, 1);
		threadWait(3000);
		Process_Application();
		Verify_PreInspection_KickOff();
		Verify_PreEngineering_KickOff();
		Complete_Installation();
		Verify_Post_Inspection_KickOff();
		Verify_Post_Engineering_KickOff();
		Verify_MandV_KickOff();
	}
	
	public static void Zero_Percent() {
		
		NavigateToEnrollment(7, 1, 8, 1,"Customer_QAReview");
		
		//clickWebelement("Threshold", "ProcessorTradeAlly");
		selectDropdown("Threshold", "ProcessorTradeAlly", "SearchFromList", "ESG Values", "Thresholds", 10, 1);
		//Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		//clickWebelement("Threshold", "ProcessorEmployee");
		selectDropdown("Threshold", "ProcessorEmployee", "SearchFromList", "ESG Values", "Thresholds", 14, 1);
		//Enter(KeyEvent.VK_ENTER);
		
		clickonSave();
		Process_Application();
		Verify_QAReview_KickOff();
	}
	
    public static void Fifty_Percent() {
		
		NavigateToEnrollment(7, 1, 8, 1,"Customer_QAReview");
		
		clickWebelement("Threshold", "ProcessorTradeAlly");
		enterTextboxValue("Threshold", "SearchFromList", "ESG Values", "Thresholds", 10, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickWebelement("Threshold", "ProcessorEmployee");
		enterTextboxValue("Threshold", "SearchFromList", "ESG Values", "Thresholds", 13, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		Process_Application();
		Verify_QAReview_KickOff();
	}
	
    public static void Hundred_Percent() {
		
		NavigateToEnrollment(7, 1, 8, 1,"Customer_QAReview");
		
		clickWebelement("Threshold", "ProcessorTradeAlly");
		enterTextboxValue("Threshold", "SearchFromList", "ESG Values", "Thresholds", 10, 1);
		Enter(KeyEvent.VK_ENTER);
		threadWait(3000);
		clickWebelement("Threshold", "ProcessorEmployee");
		enterTextboxValue("Threshold", "SearchFromList", "ESG Values", "Thresholds", 14, 1);
		Enter(KeyEvent.VK_ENTER);
		clickonSave();
		Process_Application();
		Verify_QAReview_KickOff();
	}





}
