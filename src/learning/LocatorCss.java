package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorCss{


		public static void main (String aa[]) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("ankurkaushik4125@gmail.com");
			//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ankurkaushik4125@gmail.com");

			driver.findElement(By.cssSelector("[value='Log In']")).click();
			
			//driver.findElement(By.className("button r4 wide primary")).click();
			
			
		//driver.close();
			
			}
		

	}


