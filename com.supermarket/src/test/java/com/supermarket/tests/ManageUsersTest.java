package com.supermarket.tests;

import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageUsersPage;

public class ManageUsersTest extends Base {
	
	LoginPage  login;
	ManageUsersPage manageusers;
	@Test(groups = "testgroup")
	public void manageUsersDelete()
	{
		login=new LoginPage(driver);
		login.loginUtility();
		manageusers=new ManageUsersPage(driver);
		manageusers.clickOnManageUsers();
		manageusers.clickOnDeactivateButton("test last");
		
	}

}
