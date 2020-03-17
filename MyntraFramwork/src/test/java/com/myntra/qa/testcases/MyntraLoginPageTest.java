package com.myntra.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.qa.base.TestBase;

import com.myntra.qa.pages.MyntraLoginPage;
import com.myntra.qa.pages.UserHomePage;

public class MyntraLoginPageTest extends TestBase {
	
	
	MyntraLoginPage myntraLogin;
	UserHomePage userPage;
	
public MyntraLoginPageTest() {
		
		super();
	}
	
	@BeforeMethod()
	public void setup() {
		initialization();
		
		myntraLogin = new MyntraLoginPage();
		//userPage = myntraLogin.clickOnLoginButton(prop.getProperty("username"), prop.getProperty("password"));	
		
	}
	
	@Test(priority=1)
	public void myntraHomePageUrlTest() {
		String url = myntraLogin.getCurrentUrlMyntraHomePage();
		//Assert.assertEquals(title);
		System.out.println(url);
	}
	
	@Test(priority=2)
	public void myntraHomePageTitleTest() {
		String title = myntraLogin.validateMyntraHomePageTitle();
		Assert.assertEquals(title, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
		System.out.println(title);
	}
	
	@Test(priority=3)
	public void loginTest() throws Exception {
		userPage = myntraLogin.clickOnLoginButton(prop.getProperty("username"), prop.getProperty("password"));
	}
		
	@Test(priority=4)
		public void titleTestAfterLogin() {
			String UserHomePagetitle = userPage.getTitleOfUserHomePage();
			//Assert.assertEquals(title);
			System.out.println(UserHomePagetitle);
	}
	
	
	
	@AfterMethod()
	public void closeBrowser()
	{
	    try 
	    {
	        driver.close();
	        Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");

	    }
	    catch (Exception anException) 
	    {
	        anException.printStackTrace();
	    }
	}

}
