package com.at.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.qa.base.AutoTestBase;
import com.at.qa.pages.AcDetails;
import com.at.qa.pages.AddressKey;
import com.at.qa.pages.AtHomePage;
import com.at.qa.pages.AtLoginPage;
import com.at.qa.pages.DemoSite;
import com.at.qa.pages.OrderKey;


public class AtHomePageTest extends AutoTestBase{
	AtLoginPage alp;
	AtHomePage atHomePage;
	AcDetails acDetails;
	AddressKey addressk;
	OrderKey orderK;
	DemoSite demoSite;
	public AtHomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		alp=new AtLoginPage();
		demoSite =new DemoSite();
		atHomePage=new AtHomePage();
		atHomePage=alp.loginpage(prop.getProperty("id"), prop.getProperty("Password"));
	}
	@Test(priority=1)
	public void verifyAtHomePageTitleTest() {
		String atHomePagetitle=atHomePage.verifyAtHomePageTitle();
		Assert.assertEquals(atHomePagetitle, "My Account – Automation Practice Site","Home Page Title Not Matched");
	}
	@Test(priority=2)
	public void verifyvisImageTest() {
		boolean flag=atHomePage.visauImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void verifyvislogOutKeyTest() {
		boolean flag=atHomePage.vislogOutKey();
		Assert.assertTrue(flag);
	}
	@Test(priority=4)
	public void verifyvissiteLogoTest() {
		boolean flag=atHomePage.vissiteLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=5)
	public void verifyvissearchBoxTest() {
		boolean flag=atHomePage.vissearchBox();
		Assert.assertTrue(flag);
	}
	@Test(priority=6)
	public void verifyvissubscrbBtnTest() {
		Assert.assertTrue(atHomePage.vissubscrbBtn());
	}
	@Test(enabled=false)
	public void verifyclickOnacDetailsTest() {
		acDetails=atHomePage.clickOnacDetails();
	}
	@Test(enabled=false)
	public void verifyclickOnaddressKeyTest() {
		addressk=atHomePage.clickOnaddressKey();
	}
	@Test(enabled=false)
	public void verifyclickOnOrderKeyTest() {
		orderK=atHomePage.clickOnOrderKey();
	}
	@Test(priority=10)
	public void verifyclickOndemoSiteTest() {
		demoSite=atHomePage.clickOndemoSite();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
