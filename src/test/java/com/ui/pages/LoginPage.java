package com.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.utility.BrowserClass;

public class LoginPage extends BrowserClass{

	@FindBy(xpath="//input[@id='email']") WebElement emaillogin;
	@FindBy(xpath="//input[@id='passwd']") WebElement Passwordlogin;
	@FindBy(xpath="//button[@id='SubmitLogin']") WebElement submitLogin;
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	public MyAccountPage doLoginCredential(String emailaddress,String password)
	{
		enterText(emaillogin, emailaddress);
		enterText(Passwordlogin, password);
		clickOn(submitLogin);
		MyAccountPage myacc=new MyAccountPage(getDriver());
		return myacc;
	}
	

	
	  
	

}
