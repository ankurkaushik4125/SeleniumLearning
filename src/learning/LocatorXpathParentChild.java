package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathParentChild{


		public static void main (String aa[]) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("ankurkaushik4125@gmail.com");
			driver.findElement(By.xpath("//input[name='btnK']")).click();
			
			//driver.findElement(By.className("button r4 wide primary")).click();
			
			
			//img[contains(@src,’Profile’)]
			
			}
		

	}


