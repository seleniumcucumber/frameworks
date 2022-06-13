package com.supermarket.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class ManageUsersPage {
	WebDriver driver;
	GeneralUtilities general;
	PageUtility pageutility;
	
	@FindBy(xpath = "//p[text()='Manage Users']")
	private WebElement manageUsers;

	public ManageUsersPage(WebDriver driver) {
		this.driver = driver;
		general=new GeneralUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnManageUsers() {
		manageUsers.click();
	}
	
	public void clickOnDeactivateButton(String usersName)
	{
		pageutility=new PageUtility(driver);
		int j=0;
		List<String>namestext=new ArrayList<String>();
		namestext=general.getTextAllElements("//tr//td[1]");
		for ( j = 0; j < namestext.size(); j++) {
			if (namestext.get(j).equals(usersName)) {
				j++;
				break;
			}
		}
		WebElement deactivateButton=driver.findElement(By.xpath("//tbody//tr["+j+"]//td[6]//a[1]"));
		pageutility.scrollAndClick(deactivateButton);
	}

}
