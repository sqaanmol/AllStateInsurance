package com.allstate.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.allstate.qa.base.TestBase;


public class PostalCodeVerification3 extends TestBase {
	


	@FindBy(id = "ctl00_ctl00_ctl00_pagecontent_pagecontent_cphQQLanding_txtPostalCode") 
	
	WebElement TypePostalCode;
	@FindBy(id = "ctl00_ctl00_ctl00_pagecontent_pagecontent_cphQQLanding_ddlProdu")
	
	WebElement chooseInsuranceType;

	@FindBy(xpath = "//input[@title='Go']")
	
	WebElement ClickGo;


public PostalCodeVerification3() throws IOException {
	PageFactory.initElements(driver, this);
	// TODO Auto-generated constructor stub
}

public void  PostalCodeandInsuranceType(String postal, String insurance) throws IOException {
	TypePostalCode.sendKeys(postal);
	chooseInsuranceType.sendKeys(insurance);
	ClickGo.click();
	
}

}