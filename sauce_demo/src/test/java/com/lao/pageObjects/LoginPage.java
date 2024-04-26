package com.lao.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	//Locators and their corresponding actions will be in the page class itself.
	WebDriver driver;//null 
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	private	By txtUserName=By.id("user-name");
	private By txtPassword=By.id("password");
	private By btnLogin=By.id("login-button");

	public LoginPage goToUrl() {
		driver.get("http://saucedemo.com");
		return this;
	}

	public LoginPage enterUserName(String username) {
		driver.findElement(txtUserName).sendKeys(username);	
		return this;

	}
	
	public LoginPage enterPassword(String password) {
	driver.findElement(txtPassword).sendKeys(password);
	return this;
	}
	
	public HomePage clickLogin() {
		driver.findElement(btnLogin).click();
		return new HomePage(driver);
	}



}
