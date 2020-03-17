package com.myntra.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myntra.qa.DataDrivenUtility.ExcelUtil;
import com.myntra.qa.base.TestBase;
import com.myntra.qa.pages.AddAddressPage;
import com.myntra.qa.pages.MyntraLoginPage;
import com.myntra.qa.pages.UserHomePage;

public class NewAddressPageTest extends TestBase {
	
	MyntraLoginPage myntraLogin;
	UserHomePage userPage;
	AddAddressPage NewAddress;
	ExcelUtil EU;
	String sheetName = "myntra";
	
public NewAddressPageTest() {
		
		super();
	}
	
	@BeforeMethod()
	public void setup() throws Exception {
		initialization();
		
		myntraLogin = new MyntraLoginPage();
		userPage = new UserHomePage();
		EU = new ExcelUtil();
		userPage = myntraLogin.clickOnLoginButton(prop.getProperty("username"), prop.getProperty("password"));	
		NewAddress = new AddAddressPage();
		
		
	}
	
	/*@DataProvider
	public Object[][] getMyntraTestData(){
		Object data[][]  = ExcelUtil.getTestData(sheetName);
		return data;	
	}*/
	
	@Test(priority = 1/*dataProvider = "getMyntraTestData"*/)
	public void addAddressTest(/*String Name, String Mobile, String Pincode, String Address, String Locality, String TypeOfAddress*/) throws Exception{
		NewAddress = userPage.clickOnEditProfile();
		//NewAddress.addressUpdate(Name, Mobile, Pincode, Address, Locality, TypeOfAddress);
		
		NewAddress.addressUpdate("Himansu", "9650044200", "201301", "A-306, 11t Avenue", "Gaur City-2", "Home");
	}
}



