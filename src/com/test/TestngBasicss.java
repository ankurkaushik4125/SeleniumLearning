package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasicss {
	
	/*
	 * SetProperty
InvokeChrome
GetURL
login
ValidateTitleTest
PASSED: ValidateTitleTest
	 */
	  @BeforeSuite
		public void SetProperty()
		{
			System.out.println("SetProperty");
		}
	  
	@BeforeTest
	
	public void InvokeChrome()
	
	{
		System.out.println("InvokeChrome");
	}
	@BeforeClass
	public void GetURL()
	{
		System.out.println("GetURL");
	}
    @BeforeMethod
    public void login()
    {
    	System.out.println("login");
    	
    }
  
    @Test()
    public void ValidateTitleTest()
    {
    	System.out.println("ValidateTitleTest");	
    }
    
    @Test()
    public void DashboardTest()
    {
    	System.out.println("DashboardTest");	
    }
    @Test()
    public void SearchTest()
    {
    	System.out.println("SearchTest");	
    }
    @AfterMethod
    public void Logout()
    {
    	System.out.println("Logout");
    	
    }
    @AfterClass
    public void Close()
    {
    	System.out.println("close window");
    	
    }
    
    @AfterTest
    public void exit()
    {
    	System.out.println("exit from chrome");
    	
    }
    @AfterSuite
    public void Endsuite()
    {
    	System.out.println("Endsuite");
    	
    }
    
}
