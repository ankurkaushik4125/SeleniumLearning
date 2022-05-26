package com.qa.alert;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoaderHandling {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Loader.html");
		driver.findElement(By.xpath("//button[@id='loader']")).click();
		
		WebElement waitElement = null;
		 
		//Sets FluentWait Setup
		FluentWait<RemoteWebDriver> fwait = new FluentWait<RemoteWebDriver>((RemoteWebDriver) driver)
		        .withTimeout(3, TimeUnit.SECONDS)
		        .pollingEvery(500, TimeUnit.MILLISECONDS)
		        .ignoring(NoSuchElementException.class)
		        .ignoring(TimeoutException.class);
		 
		//First checking to see if the loading indicator is found
		// we catch and throw no exception here in case they aren't ignored
		try {
		  waitElement = fwait.until(new Function<RemoteWebDriver, WebElement>() {
		   public WebElement apply(RemoteWebDriver driver) {
		      return driver.findElement(By.xpath("//h1[normalize-space()='Please wait...']"));
		   }
		 });
		    } catch (Exception e) {
		   }
		 
		//checking if loading indicator was found and if so we wait for it to
		//disappear
		  if (waitElement != null) {
		      WebDriverWait wait = new WebDriverWait(driver, 60);
		      wait.until(ExpectedConditions.invisibilityOfElementLocated(
		                 By.xpath("//h1[normalize-space()='Please wait...']"))
		            );
		        }
	
driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[3]/button[1]")).click();
driver.quit();
		  
	}

}
