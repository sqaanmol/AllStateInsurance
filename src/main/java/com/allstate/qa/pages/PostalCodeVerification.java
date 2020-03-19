package com.allstate.qa.pages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.allstate.qa.base.TestBase;
@Test
public class PostalCodeVerification extends TestBase {
	
	
	//OBJECTREPO
	@FindBy(id="mainnav_ctl00_rptNavigationLevel1_lnkNavPane_0")
	@CacheLookup
	WebElement AutoInsurance;
	
	@FindBy(id = "mainnav_ctl00_rptNavigationLevel1_rptNavigationLevel2_0_lnkNavPaneSubnav_1")
	@CacheLookup
	WebElement carinsurance;	
	
	
	
	//INTILAZATION THE PAGE OBJECTS
	public PostalCodeVerification() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	//ACTIONS
	
	public void  autoinsurancepage() {
		Actions action = new Actions(driver);
		action.moveToElement(AutoInsurance);
		action.build().perform();
	}
	public void carinsurance() {
		carinsurance.click();	
	}
	public void newwindow() {
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		

		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		
	}


}

			
		

