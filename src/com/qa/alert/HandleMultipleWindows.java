package com.qa.alert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement tabbed_window = driver.findElement(By.xpath("//div[@id='Tabbed']/a/button"));
		tabbed_window.click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String>  iter = windowIDs.iterator();
		String main_window = iter.next();
		String child_window = iter.next();
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		
	}

}
