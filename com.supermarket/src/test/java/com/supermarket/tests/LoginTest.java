package com.supermarket.tests;


import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.pages.LoginPage;
import com.supermarket.utilities.DataProviders;
import com.supermarket.utilities.Excel;


public class LoginTest extends Base {
	
	LoginPage login;
	Excel excel=new Excel();
	
	
	
	@Test(groups = "smoke")
	public void verifyLogin() {
		login = new LoginPage(driver);
		login.loginUtility();
		
	}
	
	@Test(enabled =true)
	public void verifyInvalidLoginCredentials()
	{
		login = new LoginPage(driver);
		login.loginUtility("Amal","Cucumber");
	}
	
    @Test(dataProvider = "userlogindemo",dataProviderClass = DataProviders.class,groups = {"smoke","regression"})
    public void verifyUserLogin(String userName,String password)
    {
    	login = new LoginPage(driver);
    	login.loginUtility(userName,password);
    }
    @Test(dataProvider ="userlogin",dataProviderClass = DataProviders.class)
	public void verifyUser(String userName, String password) {
		login = new LoginPage(driver);
		login.loginUtility(userName, password);
	}

}
