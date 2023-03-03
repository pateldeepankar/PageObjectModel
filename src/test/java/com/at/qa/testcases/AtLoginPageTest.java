package com.at.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.qa.base.AutoTestBase;
import com.at.qa.pages.AtHomePage;
import com.at.qa.pages.AtLoginPage;

public class AtLoginPageTest extends AutoTestBase{
	AtLoginPage alp;
	AtHomePage hPage;
	@BeforeMethod
		public void setUp() {
		initialization();
		alp=new AtLoginPage();
	}
	@Test(priority=1)
	public void auImageTest() {
		boolean flag=alp.visibleImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=2)
	public void visibleTestCasesTest() {
		boolean flag=alp.testCaseVisible();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginKeyTest() {
		boolean flag=alp.visibleLoginKey();
		Assert.assertTrue(flag);
	}
	@Test(priority=4)
	public void LoginTest() {
		hPage=alp.loginpage(prop.getProperty("id"), prop.getProperty("Password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
