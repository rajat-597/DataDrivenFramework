package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.datadriven.Base.BaseClass;
import com.dataprovider.DataProviders;
import com.pageobject.Homepage;
import com.pageobject.Loginpage;



public class LoginTest extends BaseClass {
	
	Homepage homepage;
	
	@BeforeMethod
	public void setUp() {
		launchBrowser("Chrome");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(dataProvider = "input", dataProviderClass = DataProviders.class)
	public void loginCredentials(String uname, String pswd) throws InterruptedException {
		Loginpage login = new Loginpage();
		homepage = login.credentials(uname,pswd);	
		homepage.isElementPresent();
	}
}
