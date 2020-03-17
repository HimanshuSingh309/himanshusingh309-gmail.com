package com.myntra.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.pages.MyntraLoginPage;
import com.myntra.qa.pages.UserHomePage;

public class UserHomePageTest extends TestBase {
	
	
	MyntraLoginPage myntraLogin;
	UserHomePage userPage;
	
public UserHomePageTest() {
		
		super();
	}
	
	@BeforeMethod()
	public void setup() {
		initialization();
		
		myntraLogin = new MyntraLoginPage();
		userPage = myntraLogin.clickOnLoginButton(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void userNameTest() throws Exception {
		
		 userPage.clickOnUserId();
		
		}
	
	@Test(priority=2)
	public void menTabTest() throws Exception {
		
		 userPage.mousehoverMenTab();
		
		}
	
	@Test(priority=3)
	public void womenTabTest() throws Exception {
		
		 userPage.mousehoverWoMenTab();
		
		}
	
	@Test(priority=4)
	public void kidsTabTest() throws Exception {
		
		 userPage.mousehoverKidsTab();
		
		}
	
	@Test(priority=5)
	public void discoverTabTest() throws Exception {
		
		 userPage.mousehoverDiscoverTab();
		
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
