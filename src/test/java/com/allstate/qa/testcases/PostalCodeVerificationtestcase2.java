package com.allstate.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.remote.server.handler.GetTagName;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.allstate.qa.base.TestBase;
import com.allstate.qa.pages.PersonalInfo;
import com.allstate.qa.pages.PostalCodeVerification;
import com.allstate.qa.pages.PostalCodeVerification2;


public class PostalCodeVerificationtestcase2 extends TestBase {
	
	PostalCodeVerification pcv;
	PostalCodeVerification2 pcv2;
	public PostalCodeVerificationtestcase2() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
public void setup() throws IOException {
		intialization();
		pcv = new PostalCodeVerification();
		pcv.autoinsurancepage();
		pcv.carinsurance();
	System.out.println(driver.getTitle());
	pcv.newwindow();
	
	
		
	}
	
	
	@Test(priority=1)
    public void PostalPageVerification() throws IOException {
	
		pcv2 = new PostalCodeVerification2();
		System.out.println(driver.getTitle());
		pcv2.clickquote();
	    
		
	
	
	}
	
	
	@AfterMethod
public void closeup() {
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
	
	
}
}
