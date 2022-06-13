package com.supermarket.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtility {
	WebDriver driver;
	JavascriptExecutor js;

	public PageUtility(WebDriver driver) {
		this.driver = driver;
	}
	


	public boolean clickStatus(WebElement element) {
		try {
			element.click();
			return false;
		} catch (Exception e) {
			return true;
		}
	}
	
	public void scrollAndClick(WebElement element) {
		int x = 0;
		js = (JavascriptExecutor) driver;

		while (clickStatus(element)) {
			js.executeScript("window.scrollBy(0," + x + ")");
			x = x + 50;
		}
	}

}
