package com.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.utility.BrowserClass;

public class MyAccountPage extends BrowserClass {

	
	@FindBy(xpath="//a[@title='View my customer account']/span") WebElement myAccountName;
	public MyAccountPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
		
	}
	public String getUserName()
	{
		return getVisibleText(myAccountName);
	}
	
}
