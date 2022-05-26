package learning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
     driver.get("http://demo.automationtesting.in/Windows.html");
  driver.manage().deleteAllCookies();
  driver.manage().window().maximize();
  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
  System.out.println(driver.getTitle());
  driver.findElement(By.xpath("//div[@id='Tabbed']//a//button")).click();

  System.out.println(driver.getTitle());
  
  Set<String> windowIDs = driver.getWindowHandles();
  
  Iterator<String>  iter = windowIDs.iterator();
	String main_window = iter.next();
	String child_window = iter.next();
	
	driver.switchTo().window(child_window);
	
	System.out.println(driver.getTitle());
	driver.quit();

	}

}
