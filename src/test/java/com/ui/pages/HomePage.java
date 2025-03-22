package com.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.utility.BrowserClass;

public final class HomePage extends BrowserClass{

	
	@FindBy(xpath ="//*[contains(text(),'Sign in')]") WebElement signin;
	
	public HomePage(String BrowserName)
	{
		super(BrowserName);
		PageFactory.initElements(BrowserName,this);
		gotowebsite("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	}
	
	public LoginPage gotoLogin()
	{
		clickOn(signin);
			LoginPage lp=new LoginPage(getDriver());
			return lp;
	}

}