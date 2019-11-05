package com.esg.executableclasses;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.PayeeRegressionTestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class PayeeRegressionExecutableClass extends PayeeRegressionTestClass{
	
	@BeforeTest
	public static void Intilize() {
	
	initialization();
	}
	@Test(priority=1)
	public static void enrollment() {
		test = Report.startTest("Enrollment");
		login("helper","BaseURL",1, 0, 1, 1);
	}
	@Test(priority=2)
	public static void payeeRegression_NoInstall_Standard()
	{
		test = Report.startTest("payeeRegression_NoInstall_Standard");
		test.log(LogStatus.INFO, "Test is running against the version = https://esg-eecp-qa2.directapps.int/45.1/");
		createEnrollment(1, 0, 1, 2);
		payee_Applicant_NoInstall_Standard();
		createEnrollment(1, 0, 1, 2);
		payee_AccountHolder_NoInstall_Standard();
		createEnrollment(1, 0, 1, 2);
		payee_Installer_NoInstall_Standard();
		createEnrollment(1, 0, 1, 2);
		payee_AlternatePayee_NoInstall_Standard();
		createEnrollment(1, 0, 1, 2);
		payee_SecondaryTradeAlly_NoInstall_Standard();
		test.log(LogStatus.INFO, "payeeRegression_NoInstall_Standard Module is completed");
		Report.endTest(test);
	}
	@Test(priority=3)
	public static void payeeRegression_NoInstall_Measure_Override()
	{
		test = Report.startTest("payeeRegression_NoInstall_Measure_Override");
		test.log(LogStatus.INFO, "Test is running against the version = https://esg-eecp-qa2.directapps.int/45.1/");
		createEnrollment(1, 0, 1, 2);
		payee_Applicant_Override_To_Installer_NoInstall_MeasureOverride();
		createEnrollment(1, 0, 1, 2);
		payee_AccountHolder_Override_To_Installer_NoInstall_MeasureOverride();
		createEnrollment(1, 0, 1, 2);
		payee_Installer_Override_To_SecondaryInstaller_NoInstall_MeasureOverride();
		createEnrollment(1, 0, 1, 2);
		payee_AlternatePayee_Override_To_Installer_NoInstall_MeasureOverride();
		createEnrollment(1, 0, 1, 2);
		payee_SecondaryTradeAlly_Override_To_PrimaryInstaller_NoInstall_MeasureOverride();
		test.log(LogStatus.INFO, "payeeRegression_NoInstall_Measure_Override Module is completed");
		Report.endTest(test);
	}
	@Test(priority=4)
	public static void payeeRegression_NoInstall_ReOpenApplicationAndChangePayee()
	{
		test = Report.startTest("payeeRegression_NoInstall_ReOpenApplicationAndChangePayee");
		test.log(LogStatus.INFO, "Test is running against the version = https://esg-eecp-qa2.directapps.int/45.1/");
		createEnrollment(1, 0, 1, 2);
		payee_Applicant_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee();
		createEnrollment(1, 0, 1, 2);
		payee_AccountHolder_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee();
		createEnrollment(1, 0, 1, 2);
		payee_Installer_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee();
		createEnrollment(1, 0, 1, 2);
		payee_AlternatePayee_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee();
		createEnrollment(1, 0, 1, 2);
		payee_SecondaryTradeAlly_ReOpenChangePayee_NoInstall_ReOpenApplicationAndChangePayee();
		test.log(LogStatus.INFO, "payeeRegression_NoInstall_ReOpenApplicationAndChangePayee Module is completed");
		Report.endTest(test);
	}
	@Test(priority=5)
	public static void payeeRegression_Install_Standard()
	{
		test = Report.startTest("payeeRegression_Install_Standard");
		test.log(LogStatus.INFO, "Test is running against the version = https://esg-eecp-qa2.directapps.int/45.1/");
		createEnrollment(2, 0, 1, 2);
		payee_Applicant_Install_Standard();
		createEnrollment(2, 0, 1, 2);
		payee_AccountHolder_Install_Standard();
		createEnrollment(2, 0, 1, 2);
		payee_Installer_Install_Standard();
		createEnrollment(2, 0, 1, 2);
		payee_AlternatePayee_Install_Standard();
		createEnrollment(2, 0, 1, 2);
		payee_SecondaryTradeAlly_Install_Standard();	
		test.log(LogStatus.INFO, "payeeRegression_Install_Standard Module is completed");
		Report.endTest(test);
	}
	@Test(priority=6)
	public static void payeeRegression_Install_Measure_Override()
	{
		test = Report.startTest("payeeRegression_Install_Measure_Override");
		test.log(LogStatus.INFO, "Test is running against the version = https://esg-eecp-qa2.directapps.int/45.1/");
		createEnrollment(2, 0, 1, 2);
		payee_Applicant_Override_To_Installer_MeasureOverride();
		createEnrollment(2, 0, 1, 2);
		payee_AccountHolder_Override_To_Installer_MeasureOverride();
		createEnrollment(2, 0, 1, 2);
		payee_Installer_Override_To_SecondaryInstaller_MeasureOverride();
		createEnrollment(2, 0, 1, 2);
		payee_AlternatePayee_Override_To_Installer_MeasureOverride();
		createEnrollment(2, 0, 1, 2);
		payee_SecondaryTradeAlly_Override_To_PrimaryInstaller_MeasureOverride();
		test.log(LogStatus.INFO, "payeeRegression_Install_Measure_Override Module is completed");
		Report.endTest(test);
	}
	@Test(priority=7)
	public static void payeeRegression_InstallStep_Open_ReOpenApplicationAndChangePayee()
	{
		test = Report.startTest("payeeRegression_InstallStep_Open_ReOpenApplicationAndChangePayee");
		test.log(LogStatus.INFO, "Test is running against the version = https://esg-eecp-qa2.directapps.int/45.1/");
		createEnrollment(2, 0, 1, 2);
		payee_Applicant_InstallStep_Override_To_Installer_Open_ReOpenApplicationAndChangePayee();
		createEnrollment(2, 0, 1, 2);
		payee_AccountHolder_InstallStep_Override_To_Installer_Open_ReOpenApplicationAndChangePayee();
		createEnrollment(2, 0, 1, 2);
		payee_Installer_InstallStep_Override_To_SecondaryInstaller_Open_ReOpenApplicationAndChangePayee();
		createEnrollment(2, 0, 1, 2);
		payee_AlternatePayee_InstallStep_Override_To_Installer_Open_ReOpenApplicationAndChangePayee();
		createEnrollment(2, 0, 1, 2);
		payee_SecondaryTradeAlly_InstallStep_Override_To_PrimaryInstaller_Open_ReOpenApplicationAndChangePayee();
		test.log(LogStatus.INFO, "payeeRegression_InstallStep_Open_ReOpenApplicationAndChangePayee Module is completed");
		Report.endTest(test);
	}
	@Test(priority=8)
	public static void payeeRegression_InstallStep_Closed_ReOpenApplicationAndChangePayee()
	{
		test = Report.startTest("payeeRegression_InstallStep_Closed_ReOpenApplicationAndChangePayee");
		test.log(LogStatus.INFO, "Test is running against the version = https://esg-eecp-qa2.directapps.int/45.1/");
		createEnrollment(2, 0, 1, 2);
		payee_Applicant_InstallStep_ReopenedPayee_Closed_ReOpenApplicationAndChangePayee();
		createEnrollment(2, 0, 1, 2);
		payee_AccountHolder_InstallStep_ReopenedPayee_Closed_ReOpenApplicationAndChangePayee();
		createEnrollment(2, 0, 1, 2);
		payee_Installer_InstallStep_ReopenedPayee_Closed_ReOpenApplicationAndChangePayee();
		createEnrollment(2, 0, 1, 2);
		payee_AlternatePayee_InstallStep_ReopenedPayee_Closed_ReOpenApplicationAndChangePayee();
		createEnrollment(2, 0, 1, 2);
		payee_SecondaryTradeAlly_InstallStep_Override_To_PrimaryInstaller_Closed_ReOpenApplicationAndChangePayee();
		test.log(LogStatus.INFO, "payeeRegression_InstallStep_Closed_ReOpenApplicationAndChangePayee Module is completed");
		Report.endTest(test);
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
	
}
