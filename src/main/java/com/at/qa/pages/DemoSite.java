package com.at.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.qa.base.AutoTestBase;

public class DemoSite extends AutoTestBase {
	
	@FindBy(xpath="//div[@class=\"container center\"]//h2")
	WebElement regKey;
	
	@FindBy(xpath="//input[@placeholder=\"First Name\"]")
	WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder=\"Last Name\"]")
	WebElement lastName;
	
	@FindBy(xpath="//input[@ng-model=\"EmailAdress\"]")
	WebElement emailAdd;
	
	@FindBy(xpath="//input[@ng-model=\"Phone\"]")
	WebElement phoneNum;
	
	@FindBy(xpath="//input[@value=\"Male\"]")
	WebElement maleLabel;
	
	@FindBy(xpath="//input[@value=\"FeMale\"]")
	WebElement femaleLabel;
	
	@FindBy(xpath="//select[@id=\"countries\"]")
	WebElement country;
	
	@FindBy(xpath="//img[@id=\"imagetrgt\"]")
	WebElement sbBtn;
	
	@FindBy(xpath="//button[@id=\"Button1\"]")
	WebElement refBtn;
	
    public DemoSite() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyregKey() {
		return regKey.isDisplayed();
	}
	public boolean verifysbBtn() {
		return sbBtn.isDisplayed();
	}
	public boolean verifyrefBtn() {
		return refBtn.isDisplayed();
	}
	
	public void selectData(String ftName,String ltName,String eMail,String phNum) {
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		emailAdd.sendKeys(eMail);
		phoneNum.sendKeys(phNum);
		maleLabel.click();
		country.click();
		sbBtn.click();
		
	}
}
