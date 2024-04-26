package com.lao.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest { //BaseTest
	
	public  WebDriver driver;//risky //parallel //thread local
	
	
	@BeforeMethod
	public void launchBrowser() {
		driver= new ChromeDriver();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}
