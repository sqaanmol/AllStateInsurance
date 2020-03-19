package com.allstate.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.allstate.qa.base.TestBase;

public class PostalCodeVerification2 extends TestBase {
	
	@FindBy (xpath = "//a[@title='Get your free car insurance quote']")
	@CacheLookup
	WebElement quotee;
	

public PostalCodeVerification2() throws IOException {
	PageFactory.initElements(driver, this);
	// TODO Auto-generated constructor stub
}
public void clickquote() {
	quotee.click();
	}

}