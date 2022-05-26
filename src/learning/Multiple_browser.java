package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_browser {
	
	public static void main (String aa[]) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\SELENIUM FRAMEWORK\\browser_driver\\firefox\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	
	
	driver.get("https://demoqa.com/automation-practice-form");
	//driver.findElement(By.linkText("Home")).click();


	}
}
