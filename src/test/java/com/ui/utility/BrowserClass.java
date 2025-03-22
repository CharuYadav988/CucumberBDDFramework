package com.ui.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class BrowserClass {

	private WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public BrowserClass(WebDriver driver)
	{
		super();
		this.driver=driver;
		
	}

	
	public BrowserClass(String BrowserName)
	{
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("wrong browser");
		}
			
	}
	public void gotowebsite(String url)
	{
		driver.get(url);
	}
	
	public void maximizeWin()
	{
		driver.manage().window().maximize();
	}
	
	public void clickOn(WebElement element)
	{
		element.click();
	}
	
	public void enterText(WebElement element,String textToEnter)
	{
		element.sendKeys(textToEnter);
	}
	
	public String getVisibleText(WebElement element)
	{
		String text=element.getText();
		return text;
	}
}
