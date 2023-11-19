package com.peri.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peri.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = "(//input[@id='mat-input-0'])[1]")
	WebElement loginName;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator btn btn-primary myBtn width100 mat-button mat-button-base']")
	WebElement nextBtn;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='login_btn']")
	WebElement loginBtn;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public DashboardPage login(String email,String pwd)
	{
		loginName.sendKeys(email);
		nextBtn.click();
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new DashboardPage();
	}
	
	

}
