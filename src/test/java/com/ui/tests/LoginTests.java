package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ui.pages.HomePage;



public class LoginTests {

	public static void main(String[] args) throws InterruptedException {
		
	
		HomePage hp=new HomePage("chrome");
		//LoginPage lp=hp.gotoLogin();
		//hp.maximizeWin();
		//lp.doLoginCredential("cavopes863@jomspar.com","Password");
		
		String userName=hp.gotoLogin().doLoginCredential("cavopes863@jomspar.com","Password").getUserName();
		System.out.println("UserName is "+userName);
		
		
		
		
		
		
		/*
		 * BrowserClass BC =new BrowserClass(wd);
		 * 
		 * BC.gotowebsite(
		 * "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account"
		 * ); BC.maximizeWin();
		 * 
		 * WebElement
		 * signIn=wd.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
		 * BC.clickOn(signIn);
		 * 
		 * WebElement emaillogin=wd.findElement(By.xpath("//input[@id='email']"));
		 * BC.enterText(emaillogin,"cavopes863@jomspar.com");
		 * 
		 * WebElement Passwordlogin=wd.findElement(By.xpath("//input[@id='passwd']"));
		 * BC.enterText(Passwordlogin,"Password");
		 * 
		 * WebElement
		 * submitLogin=wd.findElement(By.xpath("//button[@id='SubmitLogin']"));
		 * submitLogin.click();
		 */
		
		
		
	}

}
