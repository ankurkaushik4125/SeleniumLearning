package com.qa.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();

String title = driver.getTitle();
System.out.println(title);
	}

}
