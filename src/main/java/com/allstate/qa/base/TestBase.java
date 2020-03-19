package com.allstate.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

import com.allstate.qa.util.TestUtil;


public class TestBase {
public static WebDriver driver;
public static Properties prop;
public static EventFiringWebDriver e_driver;


public TestBase() throws IOException
{
	prop = new Properties();
FileInputStream ip = new FileInputStream("C:\\Users\\LT\\eclipse-workspace\\Mavenprojet\\src\\main\\java\\com\\allstate\\qa\\config\\config.properties");	
prop.load(ip);
}
public static void intialization() throws IOException
{
	String browsername = prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LT\\Desktop\\selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	else if(browsername.equalsIgnoreCase("firefox")) {
			
	}
	/*e_driver = new EventFiringWebDriver(driver);
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
driver = e_driver;*/
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}


public static void takeScreenshotAtEndOfTest() throws Throwable  {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	
		FileUtils.copyFile(scrFile, new File("C:\\Users\\LT\\eclipse-workspace\\Mavenprojet\\screenshots\\Testfail.png"));
	
}
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}
}
