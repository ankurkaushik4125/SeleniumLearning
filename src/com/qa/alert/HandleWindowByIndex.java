package com.qa.alert;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowByIndex {
	
     static WebDriver driver=null;

     public static void getWindow (WebDriver driver, int index)
		{
    	 String windowID=null;
			Set<String> window_handle = driver.getWindowHandles();
			 Iterator<String>  iter = window_handle.iterator();
			 
			 for (int i=1;i<=index; i++)
			 {
				 windowID=iter.next(); 
			 }
			 
	
			 driver.switchTo().window(windowID);
				System.out.println(driver.getTitle());
			 
		}
     
     public static void takeScreenshot(WebDriver driver, String path) throws IOException
 	{
         TakesScreenshot scrShot =((TakesScreenshot)driver);
         
         File Source_file= scrShot.getScreenshotAs(OutputType.FILE);

         File DestFile = new File(path);
   
         FileUtils.copyFile(Source_file, DestFile); 

 	}	
 		
 		
 	
     
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement tabbed_window = driver.findElement(By.xpath("//div[@id='Tabbed']/a/button"));
		tabbed_window.click();
		
		
		getWindow(driver, 2);

		takeScreenshot(driver,"D:\\SELENIUM FRAMEWORK\\Selenium_learning\\Screenshots\\a.png");
		driver.quit();
		

}}
