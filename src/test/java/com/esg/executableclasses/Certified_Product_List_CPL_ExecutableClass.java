package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Certified_Product_List_CPL_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Certified_Product_List_CPL_ExecutableClass  extends Certified_Product_List_CPL_TestClass{
	
	
	@BeforeTest(groups = {"CEERefrigerator","CEEClotheswasher","CEEDishwasher","WaterSense_Irrigation_Controller","WaterSense_Showerhead","WaterSense_Toilet","AHRI_Heat_Pump","AHRI_Furnace","Air_Conditioner","CeilingFan","ClothesWasher","ClothesDryer","Energy_Star","CeilingFan_MobileApplication","ClothesWasher_MobileApplication","ClothesDryer_MobileApplication"
			,"Energy_Star_MobileApplication","CeilingFan_BackendEnrollment","ClothesWasher_BackendEnrollment","ClothesDryer_BackendEnrollment","Energy_Star_BackendEnrollment"})
	public static void Initialization() {
		initialization();
	}	
	
	/*@Test(priority = 1,  groups = {"Air_Conditioner"})
	public static void AHRI_Air_Conditioner_Residential() {
		test = Report.startTest("AHRI_Air_Conditioner_Residential");
		OpenBrowser("helper", "BaseURL");
		OnlineApplication();
		Step1_Getting_Started_AHRI_Air_Conditioner();
		Step2_Equipment_Information_AHRI_Air_Conditioner();
		EnrollmentApplication_AHRI_Air_Conditioner();
		MeasurePropertiesValidationAirConditioner();
		Close();
	}
	@Test(priority = 2,  groups = {"AHRI_Furnace"})
	public static void AHRI_Furnace_Residential() {
		test = Report.startTest("AHRI_Air_Furnace_Residential");
		OpenBrowser("helper", "BaseURL");
		OnlineApplication();
		Step1_Getting_Started_AHRI_Furnace();
		Step2_Equipment_Information_AHRI_Furnace();
		EnrollmentApplication_AHRI_Furnace();
		MeasurePropertiesValidationFurnace();
		Close();
	}
	@Test(priority = 3, groups = {"AHRI_Heat_Pump"})
	public static void AHRI_Heat_Pump_OnlineApplication() {
		test = Report.startTest("AHRI_Air_Heat_Pump_OnlineApplication");
		OpenBrowser("helper", "BaseURL");
		OnlineApplication();
		Step1_Getting_Started_AHRI_Heat_Pump_OnlineApplication();
		Step2_Equipment_Information_AHRI_Heat_Pump_OnlineApplication();
		EnrollmentApplication_AHRI_Heat_Pump_OnlineApplication();
		MeasurePropertiesValidation_Heat_Pump_OnlineApplication();
		Close();
	}
	@Test(priority = 4, groups = {"Air_Conditioner"})
	public static void AHRI_Air_Conditioner_Residential_Mobile_Application() {
		test = Report.startTest("AHRI Air Conditioner Residential Mobile Application");
		OpenBrowser("helper", "BaseURL");
		MobileOnlineApplication();
		Equipment_Information_AHRI_Air_Conditioner_Mobile_Application();
		EnrollmentApplication_AHRI_Air_Conditioner_Mobile_Application();
		Close();
	}*/
/*	@Test(priority = 5, groups = {"AHRI_Furnace"})	
	public static void AHRI_Furnace_Residential_Mobile_Application() {
		test = Report.startTest("AHRI Furnace Residential Mobile Application");
		OpenBrowser("helper", "BaseURL");
		AHRI_Furnace_MobileOnlineApplication();
		Equipment_Information_AHRI_Furnace_Mobile_Application();
		EnrollmentApplication_AHRI_Furnace_Mobile_Application();
		Close();
	}*/
/*	@Test(priority = 6, groups = {"AHRI_Heat_Pump"})
	public static void AHRI_Heat_Pump_Residential_Mobile_Application() {
		test = Report.startTest("AHRI Heat Pump Residential Mobile Application");
		OpenBrowser("helper", "BaseURL");
		AHRI_Heat_Pump_MobileOnlineApplication();
		Equipment_Information_AHRI_Heat_Pump_Mobile_Application();
		EnrollmentApplication_AHRI_Heat_Pump_Mobile_Application();
		Close();
	}*/
/*	@Test(priority = 7, groups = {"WaterSense_Toilet"})
	public static void WaterSense_Toilet_Residential_Online_Application() {
		test = Report.startTest("WaterSense Toilet Residential Online Application");
		OpenBrowser("helper", "BaseURL");
		OnlineApplication();
		Step1_Getting_Started_WaterSense_Toilet_Residential_OnlineApplication();
		Step2_Equipment_Information_WaterSense_Toilet_Residential_OnlineApplication();
		EnrollmentApplication_WaterSense_Toilet_Residential_OnlineApplication();
		MeasurePropertiesValidation_WaterSense_Toilet_Residential_OnlineApplication();
		Close();
	}*/
/*	@Test(priority = 8, groups = {"WaterSense_Showerhead"})
	public static void WaterSense_Showerhead_Residential_Online_Application() {
		test = Report.startTest("WaterSense Showerhead Residential Online Application");
		OpenBrowser("helper", "BaseURL");
		OnlineApplication();
		Step1_Getting_Started_WaterSense_Showerhead_Residential_OnlineApplication();
		Step2_Equipment_Information_WaterSense_Showerhead_Residential_OnlineApplication();
		EnrollmentApplication_WaterSense_Showerhead_Residential_OnlineApplication();
		MeasurePropertiesValidation_WaterSense_Showerhead_Residential_OnlineApplication();
		Close();
	}*/
/*	@Test(priority = 9, groups = {"WaterSense_Irrigation_Controller"})
	public static void WaterSense_Irrigation_Controller_Online_Application() {
		test = Report.startTest("WaterSense Irrigation Controller Online Application");
		OpenBrowser("helper", "BaseURL");
		OnlineApplication();
		Step1_Getting_Started_WaterSense_Irrigation_Controller_OnlineApplication();
		Step2_Equipment_Information_WaterSense_Irrigation_Controller_OnlineApplication();
		EnrollmentApplication_WaterSense_Irrigation_Controller_OnlineApplication();
		MeasurePropertiesValidation_WaterSense_Irrigation_Controller_OnlineApplication();
		Close();
	}*/
/*	@Test(priority = 10, groups = {"WaterSense_Toilet"})
	public static void WaterSense_Toilet_Residential_Mobile_Application() {
		test = Report.startTest("WaterSense Toilet Residential Mobile Application");
		OpenBrowser("helper", "BaseURL");
		WaterSense_Toilet_Residential_MobileOnlineApplication();
		Equipment_Information_WaterSense_Toilet_Residential_Mobile_Application();
		EnrollmentApplication_WaterSense_Toilet_Residential_Mobile_Application();
		Close();
	}
	@Test(priority = 11, groups = {"WaterSense_Showerhead"})
	public static void WaterSense_ShowerHead_Residential_Mobile_Application() {
		test = Report.startTest("WaterSense Showerhead Residential Mobile Application");
		OpenBrowser("helper", "BaseURL");
		WaterSense_Showerhead_Residential_MobileOnlineApplication();
		Equipment_Information_WaterSense_Showerhead_Residential_Mobile_Application();
		EnrollmentApplication_WaterSense_Showerhead_Residential_Mobile_Application();
		Close();
	}
	@Test(priority = 12, groups = {"WaterSense_Irrigation_Controller"})
	public static void WaterSense_Irrigation_Controller_Residential_Mobile_Application() {
		test = Report.startTest("WaterSense Irrigation Controller Residential Mobile Application");
		OpenBrowser("helper", "BaseURL");
		WaterSense_Irrigation_Controller_Residential_MobileOnlineApplication();
		Equipment_Information_WaterSense_Irrigation_Controller_Residential_Mobile_Application();
		EnrollmentApplication_WaterSense_Irrigation_Controller_Residential_Mobile_Application();
		Close();
	}*/
	/*@Test(priority = 13, groups = {"WaterSense_Toilet"})
	public static void WaterSense_Toilet_Residential_Backend_Enrollment() {
		test = Report.startTest("WaterSense Toilet Residential Backend Enrollment");
		OpenBrowser("helper", "BaseURL");
		WaterSense_Toilet_Residential_Backend_Enrollment_Login();
		WaterSense_Toilet_Residential_Backend_Enrollment_EnrollmentPage();
		WaterSense_Toilet_Residential_Backend_Enrollment_Before_Process();
		WaterSense_Toilet_Residential_Backend_Enrollment_After_Process();
		Close();
	}
	@Test(priority = 14, groups = {"WaterSense_Showerhead"})
	public static void WaterSense_Showerhead_Residential_Backend_Enrollment() {
		test = Report.startTest("WaterSense Showerhead Residential Backend Enrollment");
		OpenBrowser("helper", "BaseURL");
		WaterSense_ShowerHead_Residential_Backend_Enrollment_Login();
		WaterSense_ShowerHead_Residential_Backend_Enrollment_EnrollmentPage();
		WaterSense_ShowerHead_Residential_Backend_Enrollment_Before_Process();
		WaterSense_Showerhead_Residential_Backend_Enrollment_After_Process();
		Close();
	}
	@Test(priority = 15, groups = {"WaterSense_Irrigation_Controller"})
	public static void WaterSense_Irrigation_Controller_Residential_Backend_Enrollment() {
		test = Report.startTest("WaterSense Irrigation Controller Residential Backend Enrollment");
		OpenBrowser("helper", "BaseURL");
		WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Login();
		WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_EnrollmentPage();
		WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Before_Process();
		WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_Process();
		Close();
	}
	
	@Test(priority = 16, groups = {"Air_Conditioner"})
	public static void AHRI_Air_Conditioner_Residential_Backend_Enrollment() {
		test = Report.startTest("AHRI Air Conditioner Residential Backend Enrollment");
		OpenBrowser("helper", "BaseURL");
		AHRI_Air_Conditioner_Residential_Backend_Enrollment_Login();
		AHRI_Air_Conditioner_Residential_Backend_Enrollment_EnrollmentPage();
		AHRI_Air_Conditioner_Residential_Backend_Enrollment_Before_Process();
		AHRI_Air_Conditioner_Residential_Backend_Enrollment_After_Process();
		Close();
	}
	@Test(priority = 17, groups = {"AHRI_Furnace"})
	public static void AHRI_Furnace_Residential_Residential_Backend_Enrollment() {
		test = Report.startTest("AHRI Furnace Residential Backend Enrollment");
		OpenBrowser("helper", "BaseURL");
		AHRI_Furnace_Residential_Backend_Enrollment_Login();
		AHRI_Furnace_Residential_Backend_Enrollment_EnrollmentPage();
		AHRI_Furnace_Residential_Backend_Enrollment_Before_Process();
		AHRI_Furnace_Residential_Backend_Enrollment_After_Process();
		Close();
	}
	@Test(priority = 18, groups = {"AHRI_Heat_Pump"})
	public static void AHRI_HeatPump_Residential_Backend_Enrollment() {
		test = Report.startTest("AHRI Heat PumpResidential Backend Enrollment");
		OpenBrowser("helper", "BaseURL");
		AHRI_HeatPump_Residential_Backend_Enrollment_Login();
		AHRI_HeatPump_Residential_Backend_Enrollment_EnrollmentPage();
		AHRI_HeatPump_Residential_Backend_Enrollment_Before_Process();
		AHRI_HeatPump_Residential_Backend_Enrollment_After_Process();
		Close();
	}*/
	@Test(priority = 19, groups={"CEERefrigerator"})
	public static void CEERefrigerator() throws IOException {
		test=Report.startTest("CPL_CEE_Refrigerator");
		OpenBrowser("helper", "BaseURL");
		OnlineApplication();
		Refrigerator();
		EECPApplicationRefrigerator();
	}
/*	@Test(priority = 20, groups ={"CEEDishwasher"})
	public static void CEEDishwasher() throws IOException {
		test=Report.startTest("CPL_CEE_Dishwasher");
		OpenBrowser("helper", "BaseURL");
		OnlineApplication();
		Dishwasher();
		EECPApplicationDishwasher();
	}
	@Test(priority = 21, groups = {"CEEClotheswasher"})
	public static void CEEClotheswasher() {
		test=Report.startTest("CPL_CEE_Clotheswasher");
		OnlineApplication();
		Clotheswasher();
		EECPApplicationClotheswasher();
	}
	@Test(priority = 22, groups={"CEERefrigerator"})
	public static void CEERefrigerator_MobileApplication() {
		test=Report.startTest("CPL_CEE_Refrigerator_MobileApplication");
		OpenBrowser("helper", "BaseURL");
		RefrigeratorMobileApplicationURL();
		RefrigeratorMobileApplication();
		EECPApplicationRefrigerator_MobileApplication();
	}
	@Test(priority = 23, groups ={"CEEDishwasher"})
	public static void CEEDishwasher_MobileApplication() {
		test=Report.startTest("CPL_CEE_Dishwasher_MobileApplication");
		OpenBrowser("helper", "BaseURL");
		DishwasherMobileApplicationURL();
		DishwasherMobileApplication();
		EECPApplicationDishwasher_MobileApplication();
	}
	@Test(priority = 24, groups = {"CEEClotheswasher"})
	public static void CEEClotheswasher_MobileApplication() {
		test=Report.startTest("CPL_CEE_Clotheswasher_MobileApplication");
		OpenBrowser("helper", "BaseURL");
		ClotheswasherMobileApplicationURL();
		ClotheswasherMobileApplication();
		EECPApplicationClotheswasher_MobileApplication();
	}
	@Test(priority = 25, groups={"CEERefrigerator"})
	public static void CEERefrigerator_BackendEnrollment() {
		test=Report.startTest("CPL_CEE_Refrigerator_BackendEnrollment");
		OpenBrowser("helper", "BaseURL");
		CEERefrigeratorBackendEnrollment();
	}
	@Test(priority = 26, groups ={"CEEDishwasher"})
	public static void CEEDishwasher_BackendEnrollment() {
		test=Report.startTest("CPL_CEE_Dishwasher_BackendEnrollment");
		CEEDishwasherBackendEnrollment();
	}
	@Test(priority = 27, groups = {"CEEClotheswasher"})
	public static void CEEClotheswasher_BackendEnrollment() {
		test=Report.startTest("CPL_CEE_Clotheswasher_BackendEnrollment");
		OpenBrowser("helper", "BaseURL");
		CEEClotheswasherBackendEnrollment();
	}
	//*****************************************************CPL Energy Star Ceiling Fan*************************************************************************************
	@Test(priority = 28 , groups = {"CeilingFan","Energy_Star"})
public static void CPL_Energy_Star_CeilingFan_Login() {
	OpenOnlineApplication();
}
@Test(priority = 29 , groups = {"CeilingFan","Energy_Star"})
public static void CPL_Energy_Star_CeilingFan_OnlineApplication_Step_1() {
	test = Report.startTest("CPL Energy Star Online Application Step-1");
	Step1_Complete_GettingStarted_EnergyStar_CeilingFan();
}
@Test(priority = 30 , groups = {"CeilingFan","Energy_Star"})
public static void CPL_Energy_Star_CeilingFan_OnlineApplication_Step_2() {
	test = Report.startTest("CPL Energy Star Online Application Step-2");
	Step2_Complete_CustomerInformation_EnergyStar_CeilingFan();
}
@Test(priority = 31 , groups = {"CeilingFan","Energy_Star"})
public static void CPL_Energy_Star_CeilingFan_OnlineApplication_Step_3() {
	test = Report.startTest("CPL Energy Star Online Application Step-3");
	Step3_Complete_EquipmentInformation_EnergyStar_CeilingFan();
}
@Test(priority = 32 , groups = {"CeilingFan","Energy_Star"})
public static void CPL_Energy_Star_CeilingFan_OnlineApplication_Step_4() {
	test = Report.startTest("CPL Energy Star Online Application Step-4");
	Step4_Complete_ReviewandSubmit_EnergyStar_CeilingFan();
	CloseBrowserWindow();
}
@Test(priority = 33 , groups = {"CeilingFan","Energy_Star"})
public static void CPL_Energy_Star_CeilingFan_OnlineApplication_VerifyEnrollment() {
	test = Report.startTest("CPL Energy Star Online Application Verify Enrollment");
	Verify_Enrollment_EnergyStar_CeilingFan();
	
}
@Test(priority = 34 , groups = {"CeilingFan","Energy_Star"})
public static void CPL_Energy_Star_CeilingFan_Verify_ApplicationWorkflowStep() {
	test = Report.startTest("CPL Energy Star Verify Application Workflow Step");
	Verify_ApplicationWorkflowStep_EnergyStar_CeilingFan();
	
}
@Test(priority = 35 , groups = {"CeilingFan","Energy_Star"})
public static void CPL_Energy_Star_CeilingFan_Verify_ApplicationWorkflowStep_After_Process() {
	test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
	Verify_ApplicationWorkflowStep_After_Process_EnergyStar_CeilingFan();
	CloseBrowserWindow();
}
//*****************************************************CPL Energy Star Clothes Washer*************************************************************************************
	@Test(priority = 36 , groups = {"ClothesWasher","Energy_Star"})
	public static void CPL_Energy_Star_ClothesWasher_Login() {
		OpenOnlineApplication();
	}
	@Test(priority = 37 , groups = {"ClothesWasher","Energy_Star"})
	public static void CPL_Energy_Star_ClothesWasher_OnlineApplication_Step_1() {
		test = Report.startTest("CPL Energy Star Online Application Step-1");
		Step1_Complete_GettingStarted_EnergyStar_ClothesWasher();
	}
	@Test(priority = 38 , groups = {"ClothesWasher","Energy_Star"})
	public static void CPL_Energy_Star_ClothesWasher_OnlineApplication_Step_2() {
		test = Report.startTest("CPL Energy Star Online Application Step-2");
		Step2_Complete_CustomerInformation_EnergyStar_ClothesWasher();
	}
	@Test(priority = 39 , groups = {"ClothesWasher","Energy_Star"})
	public static void CPL_Energy_Star_ClothesWasher_OnlineApplication_Step_3() {
		test = Report.startTest("CPL Energy Star Online Application Step-3");
		Step3_Complete_EquipmentInformation_EnergyStar_ClothesWasher();
	}
	
	@Test(priority = 40 , groups = {"ClothesWasher","Energy_Star"})
	public static void CPL_Energy_Star_ClothesWasher_OnlineApplication_Step_4() {
		test = Report.startTest("CPL Energy Star Online Application Step-4");
		Step4_Complete_ReviewandSubmit_EnergyStar_ClothesWasher();
		CloseBrowserWindow();
	}
	@Test(priority = 41 , groups = {"ClothesWasher","Energy_Star"})
	public static void CPL_Energy_Star_ClothesWasher_OnlineApplication_VerifyEnrollment() {
		test = Report.startTest("CPL Energy Star Online Application Verify Enrollment");
		Verify_Enrollment_EnergyStar_ClothesWasher();
		
	}
	
	@Test(priority = 42 , groups = {"ClothesWasher","Energy_Star"})
	public static void CPL_Energy_Star_ClothesWasher_Verify_ApplicationWorkflowStep() {
		test = Report.startTest("CPL Energy Star Verify Application Workflow Step");
		Verify_ApplicationWorkflowStep_EnergyStar_ClothesWasher();
		
	}
	
	@Test(priority = 43 , groups = {"ClothesWasher","Energy_Star"})
	public static void CPL_Energy_Star_ClothesWasher_Verify_ApplicationWorkflowStep_After_Process() {
		test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
		Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesWasher();
		CloseBrowserWindow();
	}
	
//*****************************************************CPL Energy Star Clothes Dryer*************************************************************************************
			@Test(priority = 44 , groups = {"ClothesDryer","Energy_Star"})
			public static void CPL_Energy_Star_ClothesDryer_Login() {
				OpenOnlineApplication();
			}
			@Test(priority = 45 , groups = {"ClothesDryer","Energy_Star"})
			public static void CPL_Energy_Star_ClothesDryer_OnlineApplication_Step_1() {
				test = Report.startTest("CPL Energy Star Online Application Step-1");
				Step1_Complete_GettingStarted_EnergyStar_ClothesDryer();
			}
			@Test(priority = 46 , groups = {"ClothesDryer","Energy_Star"})
			public static void CPL_Energy_Star_ClothesDryer_OnlineApplication_Step_2() {
				test = Report.startTest("CPL Energy Star Online Application Step-2");
				Step2_Complete_CustomerInformation_EnergyStar_ClothesDryer();
			}
			@Test(priority = 47 , groups = {"ClothesDryer","Energy_Star"})
			public static void CPL_Energy_Star_ClothesDryer_OnlineApplication_Step_3() {
				test = Report.startTest("CPL Energy Star Online Application Step-3");
				Step3_Complete_EquipmentInformation_EnergyStar_ClothesDryer();
			}
			
			@Test(priority = 48 , groups = {"ClothesDryer","Energy_Star"})
			public static void CPL_Energy_Star_ClothesDryer_OnlineApplication_Step_4() {
				test = Report.startTest("CPL Energy Star Online Application Step-4");
				Step4_Complete_ReviewandSubmit_EnergyStar_ClothesDryer();
				CloseBrowserWindow();
			}
			@Test(priority = 49 , groups = {"ClothesDryer","Energy_Star"})
			public static void CPL_Energy_Star_ClothesDryer_OnlineApplication_VerifyEnrollment() {
				test = Report.startTest("CPL Energy Star Online Application Verify Enrollment");
				Verify_Enrollment_EnergyStar_ClothesDryer();
				
			}
			
			@Test(priority = 50 , groups = {"ClothesDryer","Energy_Star"})
			public static void CPL_Energy_Star_ClothesDryer_Verify_ApplicationWorkflowStep() {
				test = Report.startTest("CPL Energy Star Verify Application Workflow Step");
				Verify_ApplicationWorkflowStep_EnergyStar_ClothesDryer();
				
			}
			
			@Test(priority = 51 , groups = {"ClothesDryer","Energy_Star"})
			public static void CPL_Energy_Star_ClothesDryer_Verify_ApplicationWorkflowStep_After_Process() {
				test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
				Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesDryer();
				CloseBrowserWindow();
			}
			
//*****************************************************CPL Energy Star Ceiling Fan Mobile Application*************************************************************************************
			@Test(priority = 52 , groups = {"CeilingFan_MobileApplication","Energy_Star_MobileApplication"})
			public static void CPL_Energy_Star_CeilingFan_MobileApplication_Login() {
				Open_MobileApplication_EnergyStar_CeilingFan();
			}
			@Test(priority = 53 , groups = {"CeilingFan_MobileApplication","Energy_Star_MobileApplication"})
			public static void CPL_Energy_Star_CeilingFan_MobileApplication_Step_1() {
				test = Report.startTest("CPL Energy Star Mobile Application Step-1");
				Complete_EnergyStar_CeilingFan_MobileApplication_Step1();
			}
			@Test(priority = 54 , groups = {"CeilingFan_MobileApplication","Energy_Star_MobileApplication"})
			public static void CPL_Energy_Star_CeilingFan_MobileApplication_Step_2() {
				test = Report.startTest("CPL Energy Star Mobile Application Step-2");
				Complete_EnergyStar_CeilingFan_MobileApplication_Step2();
				CloseBrowserWindow();
			}
			@Test(priority = 55 , groups = {"CeilingFan_MobileApplication","Energy_Star_MobileApplication"})
			public static void CPL_Energy_Star_CeilingFan_MobileApplication_OnlineApplication_VerifyEnrollment() {
				test = Report.startTest("CPL Energy Star Mobile Application Verify Enrollment");
				Verify_Enrollment_EnergyStar_CeilingFan_MobileApplication();
				
			}
			
			@Test(priority = 56 , groups = {"CeilingFan_MobileApplication","Energy_Star_MobileApplication"})
			public static void CPL_Energy_Star_CeilingFan_MobileApplication_Verify_ApplicationWorkflowStep() {
				test = Report.startTest("CPL Energy Star Verify Application Workflow Step");
				Verify_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication();
				
			}
			
			@Test(priority = 57 , groups = {"CeilingFan_MobileApplication","Energy_Star_MobileApplication"})
			public static void CPL_Energy_Star_CeilingFan_MobileApplication_Verify_ApplicationWorkflowStep_After_Process() {
				test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
				Verify_ApplicationWorkflowStep_After_Process_EnergyStar_CeilingFan_MobileApplication();
				CloseBrowserWindow();
			}
			
//*****************************************************CPL Energy Star Clothes Washer Mobile Application*************************************************************************************
				@Test(priority = 58 , groups = {"ClothesWasher_MobileApplication","Energy_Star_MobileApplication"})
				public static void CPL_Energy_Star_ClothesWasher_MobileApplication_Login() {
					Open_MobileApplication_EnergyStar_ClothesWasher();
				}
				@Test(priority = 59 , groups = {"ClothesWasher_MobileApplication","Energy_Star_MobileApplication"})
				public static void CPL_Energy_Star_ClothesWasher_MobileApplication_Step_1() {
					test = Report.startTest("CPL Energy Star Mobile Application Step-1");
					Complete_ClothesWasher_MobileApplication_Step1();
				}
				@Test(priority = 60 , groups = {"ClothesWasher_MobileApplication","Energy_Star_MobileApplication"})
				public static void CPL_Energy_Star_ClothesWasher_MobileApplication_Step_2() {
					test = Report.startTest("CPL Energy Star Mobile Application Step-2");
					Complete_EnergyStar_ClothesWasher_MobileApplication_Step2();
					CloseBrowserWindow();			
				}
				@Test(priority = 61 , groups = {"ClothesWasher_MobileApplication","Energy_Star_MobileApplication"})
				public static void CPL_Energy_Star_ClothesWasher_MobileApplication_OnlineApplication_VerifyEnrollment() {
					test = Report.startTest("CPL Energy Star Mobile Application Verify Enrollment");
					Verify_Enrollment_EnergyStar_ClothesWasher_MobileApplication();
					
				}
				
				@Test(priority = 62 , groups = {"ClothesWasher_MobileApplication","Energy_Star_MobileApplication"})
				public static void CPL_Energy_Star_ClothesWasher_MobileApplication_Verify_ApplicationWorkflowStep() {
					test = Report.startTest("CPL Energy Star Verify Application Workflow Step");
					Verify_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication();
					
				}
				
				@Test(priority = 63 , groups = {"ClothesWasher_MobileApplication","Energy_Star_MobileApplication"})
				public static void CPL_Energy_Star_ClothesWasher_MobileApplication_Verify_ApplicationWorkflowStep_After_Process() {
					test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
					Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesWasher_MobileApplication();
					CloseBrowserWindow();
				}
				
//*****************************************************CPL Energy Star Clothes Dryer Mobile Application*************************************************************************************
									@Test(priority = 64 , groups = {"ClothesDryer_MobileApplication","Energy_Star_MobileApplication"})
						public static void CPL_Energy_Star_ClothesDryer_MobileApplication_Login() {
							Open_MobileApplication_EnergyStar_ClothesDryer();
						}
						@Test(priority = 65 , groups = {"ClothesDryer_MobileApplication","Energy_Star_MobileApplication"})
						public static void CPL_Energy_Star_ClothesDryer_MobileApplication_Step_1() {
							test = Report.startTest("CPL Energy Star Mobile Application Step-1");
							Complete_ClothesDryer_MobileApplication_Step1();
						}
						@Test(priority = 66 , groups = {"ClothesDryer_MobileApplication","Energy_Star_MobileApplication"})
						public static void CPL_Energy_Star_ClothesDryer_MobileApplication_Step_2() {
							test = Report.startTest("CPL Energy Star Mobile Application Step-2");
							Complete_EnergyStar_ClothesDryer_MobileApplication_Step2();
							CloseBrowserWindow();
						}
						@Test(priority = 67 , groups = {"ClothesDryer_MobileApplication","Energy_Star_MobileApplication"})
						public static void CPL_Energy_Star_ClothesDryer_MobileApplication_OnlineApplication_VerifyEnrollment() {
							test = Report.startTest("CPL Energy Star Mobile Application Verify Enrollment");
							Verify_Enrollment_EnergyStar_ClothesDryer_MobileApplication();
							
						}
						
						@Test(priority = 68 , groups = {"ClothesDryer_MobileApplication","Energy_Star_MobileApplication"})
						public static void CPL_Energy_Star_ClothesDryer_MobileApplication_Verify_ApplicationWorkflowStep() {
							test = Report.startTest("CPL Energy Star Verify Application Workflow Step");
							Verify_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication();
							
						}
						
						@Test(priority = 69 , groups = {"ClothesDryer_MobileApplication","Energy_Star_MobileApplication"})
						public static void CPL_Energy_Star_ClothesDryer_MobileApplication_Verify_ApplicationWorkflowStep_After_Process() {
							test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
							Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesDryer_MobileApplication();
							CloseBrowserWindow();
						}
						
						
//*****************************************************CPL Energy Star Ceiling Fan Backend Enrollment*************************************************************************************
						@Test(priority = 70 , groups = {"CeilingFan_BackendEnrollment","Energy_Star_BackendEnrollment"})
						public static void CPL_Energy_Star_CeilingFan_BackendEnrollment_LoginEECP() {
							test = Report.startTest("CPL Energy Star Ceiling Fan Backend Enrollment LoginEECP");
							Open_BackendEnrollment_EnergyStar_CeilingFan();
						}
						@Test(priority = 71 , groups = {"CeilingFan_BackendEnrollment","Energy_Star_BackendEnrollment"})
						public static void CPL_Energy_Star_Complete_Measure_CeilingFan_BackendEnrollment() {
							test = Report.startTest("CPL Energy Star Ceiling Fan Backend Enrollment Complete Measure");
							Complete_Measure_EnergyStar_CeilingFan_BackendEnrollment();
						}
						
						@Test(priority = 72 , groups = {"CeilingFan_BackendEnrollment","Energy_Star_BackendEnrollment"})
						public static void CPL_Energy_Star_CeilingFan_BackendEnrollment_Verify_ApplicationWorkflowStep_After_Process() {
							test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
							Verify_ApplicationWorkflowStep_After_Process_EnergyStar_CeilingFan_BackendEnrollment();
							CloseBrowserWindow();
						}
						
//*****************************************************CPL Energy Star Clothes Washer Backend Enrollment*************************************************************************************
							@Test(priority = 73 , groups = {"ClothesWasher_BackendEnrollment","Energy_Star_BackendEnrollment"})
							public static void CPL_Energy_Star_ClothesWasher_BackendEnrollment_Login() {
								test = Report.startTest("CPL Energy Star Clothes Washer Backend Enrollment LoginEECP");
								Open_BackendEnrollment_EnergyStar_ClothesWasher();
							}
							
							@Test(priority = 74 , groups = {"ClothesWasher_BackendEnrollment","Energy_Star_BackendEnrollment"})
							public static void CPL_Energy_Star_Complete_Measure_ClothesWasher_BackendEnrollment_Verify_ApplicationWorkflowStep() {
								test = Report.startTest("CPL Energy Star Clothes Washer Backend Enrollment Complete Measure");
								Complete_Measure_ClothesWasher_BackendEnrollment();
								
							}
							
							@Test(priority = 75 , groups = {"ClothesWasher_BackendEnrollment","Energy_Star_BackendEnrollment"})
							public static void CPL_Energy_Star_ClothesWasher_BackendEnrollment_Verify_ApplicationWorkflowStep_After_Process() {
								test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
								Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesWasher_BackendEnrollment();
								CloseBrowserWindow();
							}
							
//*****************************************************CPL Energy Star Clothes Dryer Backend Enrollment*************************************************************************************
									@Test(priority = 76 , groups = {"ClothesDryer_BackendEnrollment","Energy_Star_BackendEnrollment"})
									public static void CPL_Energy_Star_ClothesDryer_BackendEnrollment_Login() {
										test = Report.startTest("CPL Energy Star Clothes Dryer Backend Enrollment LoginEECP");
										Open_BackendEnrollment_EnergyStar_ClothesDryer();
									}
									
									@Test(priority = 77 , groups = {"ClothesDryer_BackendEnrollment","Energy_Star_BackendEnrollment"})
									public static void CPL_Energy_Star_Complete_Measure_ClothesDryer_BackendEnrollment_Verify_ApplicationWorkflowStep() {
										test = Report.startTest("CPL Energy Star Clothes Dryer Backend Enrollment Complete Measure");
										Complete_Measure_ClothesDryer_BackendEnrollment();
										
									}
									
									@Test(priority = 78 , groups = {"ClothesDryer_BackendEnrollment","Energy_Star_BackendEnrollment"})
									public static void CPL_Energy_Star_ClothesDryer_BackendEnrollment_Verify_ApplicationWorkflowStep_After_Process() {
										test = Report.startTest("CPL Energy Star Verify Application Workflow Step After Process");
										Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesDryer_BackendEnrollment();
										CloseBrowserWindow();
									}*/
	
	@AfterMethod(groups = {"CEERefrigerator","CEEClotheswasher","CEEDishwasher","WaterSense_Irrigation_Controller","WaterSense_Showerhead","WaterSense_Toilet","AHRI_Heat_Pump","AHRI_Furnace","Air_Conditioner","CeilingFan","ClothesWasher","ClothesDryer","Energy_Star","CeilingFan_MobileApplication","ClothesWasher_MobileApplication","ClothesDryer_MobileApplication"
			,"Energy_Star_MobileApplication","CeilingFan_BackendEnrollment","ClothesWasher_BackendEnrollment","ClothesDryer_BackendEnrollment","Energy_Star_BackendEnrollment"})
	public static void getStatusWithScreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = GetScreenShot.capture(driver);
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		}
		Report.endTest(test);
	}

	@AfterTest(groups = {"CEERefrigerator","CEEClotheswasher","CEEDishwasher","WaterSense_Irrigation_Controller","WaterSense_Showerhead","WaterSense_Toilet","AHRI_Heat_Pump","AHRI_Furnace","Air_Conditioner","CeilingFan","ClothesWasher","ClothesDryer","Energy_Star","CeilingFan_MobileApplication","ClothesWasher_MobileApplication","ClothesDryer_MobileApplication"
			,"Energy_Star_MobileApplication","CeilingFan_BackendEnrollment","ClothesWasher_BackendEnrollment","ClothesDryer_BackendEnrollment","Energy_Star_BackendEnrollment"})
	public static void Report() {
		generateReport();
	}}