package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasicss2 {
	
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
  
    @Test(priority=1)
    public void ValidateTitleTest()
    {
    	Assert.assertEquals(true, false);
    	System.out.println("ValidateTitleTest");	
    }
    
    @Test(dependsOnMethods ="ValidateTitleTest" )
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
