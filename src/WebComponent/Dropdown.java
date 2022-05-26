package WebComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown{


		public static void main (String aa[]) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			/*driver.get("https://www.spicejet.com/");
		
			Thread.sleep(10000);
			Select S = new Select(driver.findElement(By.xpath("//select [@id='ctl00_mainContent_DropDownListCurrency']")));
				S.selectByVisibleText("USD");
			*/	
				driver.get("https://www.msn.com/en-in/");
				
				
				//driver.findElement(By.xpath("//div[@id='meCtrl']//a//span")).click();
				
				
				//driver.findElement(By.xpath("//a[@title='Sign in']")).click();
				driver.findElement(By.xpath("//span[@class='mectrlname mectrlsignin' and contains(text(),'Sign in') ]")).click();
				
			
			}
		

	}

