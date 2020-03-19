package com.allstate.qa.util;


/*************************************** PURPOSE **********************************
 - This class implements the WebDriverEventListener, which is included under events.
 The purpose of implementing this interface is to override all the methods and define certain useful  Log statements 
 which would be displayed/logged as the application under test is being run.
 Do not call any of these methods, instead these methods will be invoked automatically
 as an when the action done (click, findBy etc). 
 */

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.IListenersAnnotation;

import com.allstate.qa.base.TestBase;



public class CustomListener extends TestBase implements ITestListener {

	public CustomListener() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("Exception occured: " );
			
				try {
					takeScreenshotAtEndOfTest();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

		
	}
	
	

	