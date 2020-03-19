package com.allstate.qa.testcases;

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


public class PostalCodeVerificationtestcase extends TestBase {
	PersonalInfo per;
	PostalCodeVerification pcv;
	
	public PostalCodeVerificationtestcase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
public void setup() throws IOException {
		intialization();
		pcv = new PostalCodeVerification();
	}
	
	
	@Test(priority=1)
    public void PostalPageVerification() throws IOException {
		pcv.autoinsurancepage();
		pcv.carinsurance();
	    
	
	
	
	}
	
	
	@AfterMethod
public void closeup() {
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
	
	
}
}
