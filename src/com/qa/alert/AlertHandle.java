package com.qa.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertHandle {


		public static void main (String [] args) throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.id("OKTab")).click();
	
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);
		Assert.assertEquals(message, "I am an alert box!");
		
		alert.accept();
		//driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		driver.close();
		
	
		

	}

}