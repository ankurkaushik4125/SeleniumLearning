package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathRegualar{


		public static void main (String aa[]) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.id("username")).sendKeys("ankurkaushik4125@gmail.com");
			driver.findElement(By.id("password")).sendKeys("test@123");
			
			driver.findElement(By.className("button r4 wide primary")).click();
			
			
		
			
			}
		

	}


