package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.datadriven.Base.BaseClass;
import com.pageobject.Homepage;
import com.pageobject.Loginpage;

public class HomePageTest extends BaseClass {
	
Homepage homepage;
	
	@BeforeMethod
	public void setUp() {
		launchBrowser("Chrome");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void homePage() throws Exception {
		Loginpage login = new Loginpage();
		homepage = login.credentials(prop.getProperty("username"), prop.getProperty("password"));
	}

}
