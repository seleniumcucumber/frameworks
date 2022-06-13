package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUsersPage {
	WebDriver driver;
	
	@FindBy(xpath ="//p[text()='Admin Users']")
	private WebElement adminUsers;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userNamefiled;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordfield;
	@FindBy(xpath = "//select[@name='user_type']")
	@CacheLookup
	private WebElement userType;
	
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement newButton;
	
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAdminUsers() {
		adminUsers.click();
	}
	
	public void createUser(String userName,String password)
	{
		clickOnAdminUsers();
		
		newButton.click();
	}

}
