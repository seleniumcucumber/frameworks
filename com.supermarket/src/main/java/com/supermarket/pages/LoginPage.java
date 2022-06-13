package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PropHandler;

public class LoginPage {
	
	WebDriver driver;
	PropHandler prophandler=new PropHandler();
	GeneralUtilities generalUtil=new GeneralUtilities();
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	@FindBy(xpath ="//button[text()='Sign In']")
	private WebElement loginBtn;
	@FindBy(xpath = "//li[@class='nav-item dropdown']//a[@class='nav-link']//img")
	private WebElement profileText;
	
	@FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible']/h5")
	private WebElement invalidLogintext;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		userName.sendKeys(username);
	}

	public void enterPassword(String paswd) {
		password.sendKeys(paswd);
	}

	public void click_OnLoginButton() {
		loginBtn.click();
	}

	public void loginUtility(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		click_OnLoginButton();
	}
	
	public void loginUtility() {
		enterUserName(prophandler.getPropertiesFileData("username"));
		enterPassword(prophandler.getPropertiesFileData("password"));
		click_OnLoginButton();
	}
	
	public void verifyLoginFunctionality() {
		loginUtility();
		generalUtil.getElementText(profileText);

	}
	
	public void verifyInvalidLogin(String userName,String password)
	{
		enterUserName(userName);
		enterPassword(password);
		click_OnLoginButton();
		generalUtil.getElementText(invalidLogintext);
	}
	
	
}
