package com.supermarket.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageUsersPage;
import com.supermarket.utilities.PDFReader;

public class ManageUsersTest extends Base {
	
	LoginPage  login;
	ManageUsersPage manageusers;
	PDFReader pdfreader=new PDFReader();
	@Test(groups = "testgroup",enabled=false)
	public void manageUsersDelete()
	{
		login=new LoginPage(driver);
		login.loginUtility();
		manageusers=new ManageUsersPage(driver);
		manageusers.clickOnManageUsers();
		manageusers.clickOnDeactivateButton("test last");
		
	}
	
	
	
	@Test
	public void TestPDFReader()
	{
		HashMap<String,String>dataMap=new HashMap<String,String>();
		dataMap=pdfreader.readPdf_data("ExamplePdf");
		System.out.println(dataMap);
	}

}
