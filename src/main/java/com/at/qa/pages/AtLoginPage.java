package com.at.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.qa.base.AutoTestBase;
import com.crm.qa.pages.HomePage;

public class AtLoginPage extends AutoTestBase {
	
	@FindBy(id="username")
	WebElement uid;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@title=\"Automation Practice Site\"]")
	WebElement auImage;
	
	@FindBy(xpath="//li[@id=\"menu-item-224\"]//a")
	WebElement testCases;
	
	@FindBy(xpath="//div[@class=\"u-column1 col-1\"]//h2")
	WebElement LoginKey;
	
	public AtLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean visibleImage() {
		return auImage.isDisplayed();
	}
	public boolean testCaseVisible() {
		return testCases.isDisplayed();
	}
	
	public boolean visibleLoginKey() {
		return LoginKey.isDisplayed();
	}
	
	public AtHomePage loginpage(String ui,String pw) {
		uid.sendKeys(ui);
		pass.sendKeys(pw);
		loginBtn.click();
		return new AtHomePage();
	}
	
}
