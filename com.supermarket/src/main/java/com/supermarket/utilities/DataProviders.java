package com.supermarket.utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	Excel excel;
	
	@DataProvider(name = "userlogindemo")
	public Object[][] userdemoDataProvider() {
		return new Object[][] { { "Selenium","1234" }, { "Amal","cucu" }, { "cucumbers","cucu" } };
	}
	
	@DataProvider(name = "userlogin")
	public Object[][] userCredentials() {
		excel = new Excel();
		excel.setExcelFile("InvalidLogin", "user");
		Object data[][] = excel.getMultidimentionalData(4, 2);
		return data;
	}
	
	
}
