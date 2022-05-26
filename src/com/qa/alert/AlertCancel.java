package com.qa.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertCancel {


		public static void main (String [] args) throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='CancelTab']//button")).click();
		
		
	
		

	}

}