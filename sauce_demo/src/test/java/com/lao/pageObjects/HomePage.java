package com.lao.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By btnAddToCart=By.id("add-to-cart-sauce-labs-backpack");
	
	private By drpdwnFilter=By.className("product_sort_container");
	
	
	public void clickAddToCart() {
		driver.findElement(btnAddToCart).click();
	}

	
	public void selectFilter() {
		Select select= new Select(driver.findElement(drpdwnFilter));
		select.selectByIndex(2);
	}
}
