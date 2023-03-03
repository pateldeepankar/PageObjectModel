package com.at.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.at.qa.base.AutoTestBase;
import com.at.qa.pages.AcDetails;
import com.at.qa.pages.AddressKey;
import com.at.qa.pages.AtHomePage;
import com.at.qa.pages.AtLoginPage;
import com.at.qa.pages.DemoSite;
import com.at.qa.pages.OrderKey;
import com.at.qa.pages.Web;
import com.at.qa.util.ATestUtil;

public class DemoSiteTest extends AutoTestBase{
	AtLoginPage alp;
	AtHomePage atHomePage;
	AcDetails acDetails;
	AddressKey addressk;
	OrderKey orderK;
	DemoSite demoSite;
	Web web;
	String sheetName="Register";
	public DemoSiteTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		alp=new AtLoginPage();
		demoSite =new DemoSite();
		atHomePage=new AtHomePage();
		atHomePage=alp.loginpage(prop.getProperty("id"), prop.getProperty("Password"));
		demoSite=atHomePage.clickOndemoSite();
		
	}
	
	@Test(priority=1)
	public void verifyregKeyTest() {
		boolean flag=demoSite.verifyregKey();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void verifysbBtnTest() {
		boolean flag=demoSite.verifysbBtn();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void verifyrefBtnTest() {
		boolean flag=demoSite.verifyrefBtn();
		Assert.assertTrue(flag);
	}
	
	@DataProvider
	public Object[][] getExcelData() {
		Object data[][]=ATestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=4,dataProvider="getExcelData")
	public void validateNewRegister(String ftName,String ltName,String eMail,String phNum ) {
    //demoSite.selectCountry("Amar", "Yadaw", "weudg@gmail.com", "4214547554");
		demoSite.selectData(ftName, ltName, eMail, phNum);
		
	}    
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
