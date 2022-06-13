package com.supermarket.tests;


import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.pages.AdminUsersPage;
import com.supermarket.pages.LoginPage;

public class AdminUsersTest extends Base {
	
	LoginPage login;
	AdminUsersPage adminuserpage;
	
	@Test
	public void createUser()
	{
		login=new LoginPage(driver);
		login.loginUtility();
		adminuserpage=new AdminUsersPage(driver);
		adminuserpage.clickOnAdminUsers();
		adminuserpage.createUser("amal","123");
		
	}
	

}
