package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class LocatorXpath{


		public static void main (String aa[]) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.rediff.com/");
			driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
			driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("a@test.com");
	Thread.sleep(2000l);
	WebElement Value=driver.findElement(By.xpath("//input[@id='login1']"));
			String Value_str=Value.getText();
			int size=Value_str.length();
			
			for(int i=0;i<size;i++)
			{
				driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(Keys.BACK_SPACE);
					
			}
			
			
			
			
			
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("aq123");

		driver.findElement(By.xpath("//input [contains(@name,'procee')]")).click();
		
		//driver.findElement(By.xpath("//input[@name='proceed']")).click();
				
			
			}
		

	}


