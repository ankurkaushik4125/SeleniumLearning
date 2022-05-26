package testng;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	//we don't need the main class

	@BeforeSuite
	public void SetProperty()
	{
		System.out.println("Set Property ");

	}
	@BeforeTest
	public void LauchBrowser()
	{
		System.out.println("launch browser");

	}
	
	@BeforeClass
	public void EnterURL()
	{
		System.out.println("enterURL");
	}
	@BeforeMethod
	public void Login()
	{
		System.out.println("login method");
	}
	@Test(priority=1)
	public void TitleTest()
	{
		System.out.println("TitleTest");
	}
	@Test(priority=2)
	public void DashboardTest()
	{
		System.out.println("DashboardTest");
	}
	
	@Test(priority=3)
	public void LogoTest()
	{
		System.out.println("LogoTest");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout from system");
	}
 	@AfterTest
	public void DeleteCookies()
	{
		System.out.println("delete cookies");
	}
	
	@AfterClass
	public void closebrowser()
	{
		System.out.println("closebrowser");
	}
	
	@AfterSuite
	public void Report()
	{
		System.out.println("Report");
	}
}
