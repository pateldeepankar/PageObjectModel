package com.at.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.qa.base.AutoTestBase;

public class AtHomePage extends AutoTestBase{
	
	@FindBy(xpath="//img[@alt=\"Automation Practice Site\"]")
	WebElement ausImage;
	
	@FindBy(xpath="//li[@class=\"woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders\"]//a")
	WebElement orderKey;
	
	@FindBy(xpath="//li[@class=\"woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address\"]//a")
	WebElement addressKey;
	
	@FindBy(xpath="//li[@class=\"woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account\"]//a")
	WebElement acDetails;
	
	@FindBy(xpath="//li[@class=\"woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout\"]//a")
	WebElement logOutKey;
	
	@FindBy(xpath="//img[@alt=\"Site Logo\"]")
	WebElement siteLogo;
	
	@FindBy(name="EMAIL")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement subscrbBtn;
	
	@FindBy(xpath="//li[@id=\"menu-item-251\"]//a")
	WebElement demoSite;
	
	public String verifyAtHomePageTitle() {
		return driver.getTitle();
	}
	public AtHomePage() {
		PageFactory.initElements(driver, this);
	}
	public boolean visauImage() {
		return ausImage.isDisplayed();
	}
	public boolean vislogOutKey() {
		return logOutKey.isDisplayed();
	}
	public boolean vissiteLogo() {
		return siteLogo.isDisplayed();
	}
	public boolean vissearchBox() {
		return searchBox.isDisplayed();
	}
	public boolean vissubscrbBtn() {
		return subscrbBtn.isDisplayed();
	}
	public AcDetails clickOnacDetails() {
		 acDetails.click();
		 return new AcDetails();
	}
	public AddressKey clickOnaddressKey() {
		 addressKey.click();
		 return new AddressKey();
	}
	public OrderKey clickOnOrderKey() {
		orderKey.click();
		return new OrderKey();
	}
	public DemoSite clickOndemoSite() {
		 demoSite.click();
		 return new DemoSite();
	}
}
