package utility;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

import utility.ExcelApiTest;
public class ExcelToDataProvider {
	ExcelApiTest eat=null;
	String xlfilePath="D://SELENIUM FRAMEWORK//Selenium_learning//src//TestData//config.xlsx";
	String sheetName="Data";
	int rown;
	
	@Test(dataProvider="Logindata")
	
	public void filluserfrom(String role, String Username,String password,String execute,String testcol) throws InterruptedException
	{
		
		System.out.println(role);
		System.out.println(Username);
		System.out.println(password);
		System.out.println(execute);
		System.out.println(testcol);
		
		System.out.println("********************************");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(5000l);
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(5000l);
		
	driver.close();	
	}
	
	@DataProvider(name = "Logindata")
	
	public Object [][] LoginFormData() throws Exception
	{
		ExcelData ed =new ExcelData();
		
		Object [][] data = ed.exlData(sheetName, "y", "auto");
		return data;
	}
	
	
	
	// read the data from excel sheet
	
	// double dimension object array to store row and coloum data

}