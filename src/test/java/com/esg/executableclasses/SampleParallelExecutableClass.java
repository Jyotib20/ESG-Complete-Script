package com.esg.executableclasses;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleParallelExecutableClass {

     WebDriver driver;
     String baseURL, nodeURL;

     @BeforeTest
     public void setUp() throws MalformedURLException {
         baseURL = "http://demo.guru99.com/test/guru99home/";
         nodeURL = "http://172.16.52.228:4444/wd/hub";
        /* DesiredCapabilities capability = DesiredCapabilities.chrome();
         capability.setBrowserName("chrome");
         capability.setPlatform(Platform.WIN8_1);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);*/
         
         DesiredCapabilities capability = DesiredCapabilities.firefox();
         capability.setBrowserName("firefox");
         capability.setPlatform(Platform.WIN8_1);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);
         
        /* DesiredCapabilities capability2 = DesiredCapabilities.internetExplorer();
         capability2.setBrowserName("internetExplorer");
         capability2.setPlatform(Platform.WIN8_1);
         driver = new RemoteWebDriver(new URL(nodeURL), capability2);*/
     }

     @AfterTest
     public void afterTest() {
         driver.quit();
     }
     @Test
     public void sampleTest() {
         driver.get(baseURL);
         driver.get(baseURL);

         if (driver.getPageSource().contains("MOBILE TESTING")) {
             Assert.assertTrue(true, "Mobile Testing Link Found");
         } else {
             Assert.assertTrue(false, "Failed: Link not found");
         }

     }

 }