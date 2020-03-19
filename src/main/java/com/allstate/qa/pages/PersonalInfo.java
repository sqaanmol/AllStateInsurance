package com.allstate.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import com.allstate.qa.base.TestBase;


public class PersonalInfo extends TestBase {

	
	@FindBy(id = "ctl00_ctl00_ctl00_pagecontent_pagecontent_cphBody_txtPostalCode")
	
	WebElement PostalCodeValue;
	@FindBy(id = "ctl00_ctl00_ctl00_pagecontent_pagecontent_cphBody_txtAge")
	
	WebElement age;
	@FindBy(name = "ctl00$ctl00$ctl00$pagecontent$pagecontent$cphBody$rdoGender")
	
	WebElement gender;
	@FindBy(id = "ctl00_ctl00_ctl00_pagecontent_pagecontent_cphBody_ddlVehicleYear")
	
	WebElement selectvehicleyear;
@FindBy(id = "ctl00_ctl00_ctl00_pagecontent_pagecontent_cphBody_ddlVehicleMake")

	WebElement selectvehiclemake;
@FindBy(id = "ctl00_ctl00_ctl00_pagecontent_pagecontent_cphBody_ddlVehicleModel")

WebElement selectvehiclemodel;	
@FindBy(name = "ctl00$ctl00$ctl00$pagecontent$pagecontent$cphBody$btnGetEstimate")

WebElement continuee;	

public PersonalInfo() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public String postalcodevaluee() {
	String s = PostalCodeValue.getAttribute("value");
	return s;
	}
	public boolean verifypostal(String postal)
	{
		
		if(PostalCodeValue.getAttribute("value").equalsIgnoreCase(postal))
		{
			return true;
			
		}
		else
		{
		return false;
		}
		}

public void selectgender() {
	gender.click();
	
}
public void selectvehicleinformation(String Age, String Gender,String Year, String Make, String Model) throws InterruptedException {
	age.sendKeys(Age);
	gender.sendKeys(Gender);
	selectvehicleyear.sendKeys(Year);
	Thread.sleep(5000);
	selectvehiclemake.sendKeys(Make);
	Thread.sleep(5000);
	selectvehiclemodel.sendKeys(Model);
	Thread.sleep(5000);
	continuee.click();
	
}
}
