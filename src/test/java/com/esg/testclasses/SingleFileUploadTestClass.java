package com.esg.testclasses;

import java.awt.AWTException;

import com.esg.utilities.HelperClass;

public class SingleFileUploadTestClass extends HelperClass {

public static void Login() {
		
		login("Helper","BaseURL", 1, 0, 1, 1);
	}
public static void UploadFile() throws AWTException {
	
	ClickByActionClass("SingleFileUpload", "MainMenu", "ESG Values", "SingleFileUpload", 1, 1);
	selectDropdownByVisibleText("SingleFileUpload", "UploadType", "ESG Values", "SingleFileUpload", 2, 1);
	selectDropdownByVisibleText("SingleFileUpload", "TradeAlly", "ESG Values", "SingleFileUpload", 3, 1);
	explicitWaitForClickable(3000, "SingleFileUpload", "SelectUpload");
	clickWebelement("SingleFileUpload", "SelectUpload");
	UploadFile("SingleFileUpload", "Filepath");
	explicitWaitForClickable(3000, "SingleFileUpload", "UploadButton");
	clickWebelement("SingleFileUpload", "UploadButton");
	explicitWait(300, "SingleFileUpload", "CompletedStatus");
	VarifyElementForExistingValueWithText("SingleFileUpload", "TotalRecords", "ESG Values", "SingleFileUpload", 4, 1);
	VarifyElementForExistingValueWithText("SingleFileUpload", "SuccessfullEnrollments", "ESG Values", "SingleFileUpload", 5, 1);
}
	public static void Enrollment() {
		
	}

}

