package com.lao.tests;

import org.testng.annotations.Test;

import com.lao.common.BaseTest;
import com.lao.pageObjects.HomePage;
import com.lao.pageObjects.LoginPage;

public class TestSortProductByPriceLowtoHigh extends BaseTest{
	
	@Test
	public void sortProductPriceLowTohigh() {
		new LoginPage(driver)
		.goToUrl()
		.enterUserName("standard_user")
		.enterPassword("secret_sauce")
		.clickLogin()
		.selectFilter();
		
		
	}

}
