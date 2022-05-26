package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassname{


		public static void main (String aa[]) {
			
			System.setProperty("webdriver.chrome.driver", "D:SELENIUM FRAMEWORKchromedriver_win32chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.xpath("//*[@id='username']")).sendKeys("ankurkaushik4125@gmail.com");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
			
			driver.findElement(By.xpath("//*[@id='Login']")).click();
			
			//*[@id="username"]
			//*[@id="password"]
			
			}
		

	}


