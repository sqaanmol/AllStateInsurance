package com.allstate.qa.testcases;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.remote.server.handler.GetTagName;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.allstate.qa.base.TestBase;
import com.allstate.qa.pages.PersonalInfo;
import com.allstate.qa.pages.PostalCodeVerification;
import com.allstate.qa.pages.PostalCodeVerification2;
import com.allstate.qa.pages.PostalCodeVerification3;
import com.allstate.qa.util.CustomListener;
import com.allstate.qa.util.TestUtil;


@Listeners(CustomListener.class)
public class PostalCodeVerificationtestcase3 extends TestBase {
	public  String sheetname = "Sheet1";
	PostalCodeVerification pcv;
	PostalCodeVerification2 pcv2;
	PostalCodeVerification3 pcv3;
	public PostalCodeVerificationtestcase3() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
public void setup() throws IOException {
		intialization();
		pcv = new PostalCodeVerification();
		pcv2 = new PostalCodeVerification2();
		pcv.autoinsurancepage();
		pcv.carinsurance();
	    pcv.newwindow();
	    pcv2.clickquote();
	   
	    
	
		
		
	}
	@DataProvider
	public Object[][] getexceldata() throws FileNotFoundException{
		
			Object data[][] = TestUtil.getTestData(sheetname);
		
		return data;
	}
	
	@Test(priority=1, dataProvider= "getexceldata")
    public void PostalPageVerification3(String Postalcode, String insuranceType)  {
	
		try {
			pcv3 = new PostalCodeVerification3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pcv3.PostalCodeandInsuranceType(Postalcode, insuranceType);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	
	
	}
	
	
	

}
