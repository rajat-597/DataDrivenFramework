package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.datadriven.Base.BaseClass;

public class Homepage extends BaseClass {
	
	@FindBy(xpath = "//a[@id=\"item_4_title_link\"]")
	WebElement item1;
	
	@FindBy(xpath = "//a[@id='item_1_title_link']")
	WebElement item2;
	
	@FindBy(xpath = "//span[text()='Products']")
	WebElement product;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProduct() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(item1));
		item1.click();
		
	}
	
	public void isElementPresent() {
		product.isDisplayed();
	}
}
