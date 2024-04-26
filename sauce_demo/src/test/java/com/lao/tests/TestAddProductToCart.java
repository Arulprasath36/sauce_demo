package com.lao.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lao.common.BaseTest;
import com.lao.pageObjects.HomePage;
import com.lao.pageObjects.LoginPage;

public class TestAddProductToCart extends BaseTest{
	//super()
	
	@Test
	public void addProductToCart() {
		new LoginPage(driver)
		.goToUrl()
		.enterUserName("standard_user")
		.enterPassword("secret_sauce")
		.clickLogin()
		.clickAddToCart();
		
		
		
		
	}
	

}
