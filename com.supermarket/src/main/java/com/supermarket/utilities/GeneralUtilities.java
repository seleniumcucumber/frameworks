package com.supermarket.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.supermarket.base.Base;

public class GeneralUtilities{

	WebDriver driver;

	
	public GeneralUtilities(WebDriver driver) {
		this.driver = driver;
	}
	public GeneralUtilities()
	{
		
	}
	public String getElementText(WebElement element) {
		System.out.println(element.getText());
		return element.getText();
	}

	public boolean validateElementText(WebElement element, String expectedText){
		return element.getText().contains(expectedText);
	}
	
	
	public List<String> getTextAllElements(String columnXpath) {
		List<String> text = new ArrayList<String>();
		List<WebElement> column = driver.findElements(By.xpath(columnXpath));
		for (WebElement s : column) {
			text.add(s.getText());
		}
		return text;
	}

}
