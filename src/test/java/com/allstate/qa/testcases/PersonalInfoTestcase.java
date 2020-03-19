package com.allstate.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.http.util.Asserts;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.remote.server.handler.GetTagName;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allstate.qa.base.TestBase;
import com.allstate.qa.pages.PersonalInfo;
import com.allstate.qa.pages.PostalCodeVerification;
import com.allstate.qa.pages.PostalCodeVerification2;
import com.allstate.qa.pages.PostalCodeVerification3;
import com.allstate.qa.util.TestUtil;


public class PersonalInfoTestcase extends TestBase {
	PersonalInfo per;
	PostalCodeVerification pcv;
	PostalCodeVerification2 pcv2;
	PostalCodeVerification3 pcv3;
	public PersonalInfoTestcase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@DataProvider
	public Object[][] getexceldata() throws FileNotFoundException{
		
			Object data[][] = TestUtil.getTestData("Sheet1");
		
		return data;
	}
	@BeforeMethod
public void setup() throws IOException {
		intialization();
		pcv = new PostalCodeVerification();
		pcv2 = new PostalCodeVerification2();
		pcv3 = new PostalCodeVerification3();
		pcv.autoinsurancepage();
		pcv.carinsurance();
		pcv.newwindow();
		pcv2.clickquote();
		
		
			
	}
	
	@DataProvider
	public Object[][] getexceldata1() throws FileNotFoundException{
		
			Object data[][] = TestUtil.getTestData("Sheet2");
		
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
	    
	
	
	@Test(priority=2, dataProvider = "getexceldata1" )
    public void personalinfoo3(String Age, String Gender, String Year, String Make, String Model)  {
	try {
		per = new 	PersonalInfo();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
try {
	per.selectvehicleinformation(Age, Gender, Year, Make, Model);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
	
		
	
	
@AfterMethod
public void closeup() {
		
		
	
	
}
}
