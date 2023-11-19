package com.peri.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.peri.qa.base.TestBase;
import com.peri.qa.pages.DashboardPage;
import com.peri.qa.pages.LoginPage;


public class LoginPageTest extends TestBase 
{
	LoginPage login;
	DashboardPage dashboardpage;
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		login = new LoginPage();	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void LoginApp()
	{
		System.out.println(prop.getProperty("Submitter_EmailId"));
		System.out.println(prop.getProperty("Password"));
		dashboardpage= login.login(prop.getProperty("Submitter_EmailId"), prop.getProperty("Password"));
	}
	
	
	
	
	
}
