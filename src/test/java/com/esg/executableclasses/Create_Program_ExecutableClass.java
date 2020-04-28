/*package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Create_Program_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Create_Program_ExecutableClass extends Create_Program_TestClass {
	@BeforeTest
	public static void Initialization() {
		
		initialization();
	}
	@Test(priority = 1)
	public static void Login() {
		
		login("Helper","BaseURL", 1, 0, 1, 1);
	
	}
	
	@Test(priority = 2)
	public static void Delete_Program() {
		test = Report.startTest("Delete_Program");
		Delete_Existing_Program();
	
	}
	@Test(priority = 2)
	public static void Navigate_TO_Programs() {
		test = Report.startTest("Navigate_TO_Programs");
		Navigate_To_Program_Page();
	
	}
	@Test(priority = 3)
	public static void New_Programs() {
		test = Report.startTest("New_Program");
		New_Program();
	}
	
	@Test(priority = 4)
	public static void Qualified_Trade_Ally_Tab() {
		test = Report.startTest("Qualified_Trade_Ally Tab");
		Qualified_Trade_Ally();
	}
	@Test(priority = 5)
	public static void WorkFlow() {
		test = Report.startTest("WorkFlow Tab");
		WorkFlow_Tab();
	}
	@Test(priority = 6)
	public static void Field_Option_Tab() {
		test = Report.startTest("Field_Option_Tab");
		Field_Option();
	}
	@Test(priority = 7)
	public static void Add_Inspection_WorkFlow_Step() {
		test = Report.startTest("Add_Inspection_WorkFlow_Step");
		Add_Inspection_WorkFlow();
	}
	@Test(priority = 8)
	public static void QA_Review_WorkFlow_Step() {
		test = Report.startTest("QA_Review_WorkFlow_Step");
		QA_Review_WorkFlow();
	}
	@Test(priority = 9)
	public static void Initiate_Payment_WorkFlow_Step() {
		test = Report.startTest("QA_Review_WorkFlow_Step");
		Initiate_Payment_WorkFlow();
	}
	@Test(priority = 10)
	public static void Eligibility_Tab_Step() {
		test = Report.startTest("Eligibility_Tab");
		Eligibility_Tab();
	}
	@Test(priority = 11)
	public static void Online_Application_Tab() {
		test = Report.startTest("Online_Application_Tab");
		Online_Application();
	}
	@AfterMethod
	 public void getResult(ITestResult result) throws IOException
	    {
	        if(result.getStatus() == ITestResult.FAILURE)
	        {
	            String screenShotPath = GetScreenShot.capture(driver);
	            test.log(LogStatus.FAIL, result.getThrowable());
	            test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	        }
	        Report.endTest(test);
	    }

	@AfterTest
	 public static void Generate() {
		 
		generateReport();
	 }
}*/