package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datadriven.Base.BaseClass;


public class Loginpage extends BaseClass{

	@FindBy(id = "user-name")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(id = "login-button") 
	WebElement loginBtn;
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public Homepage credentials(String un, String pass) throws InterruptedException {
		userName.sendKeys(un);
		Thread.sleep(1000);
		pwd.sendKeys(pass);
		Thread.sleep(1000);
		loginBtn.click();
		return new Homepage();
	}
}
