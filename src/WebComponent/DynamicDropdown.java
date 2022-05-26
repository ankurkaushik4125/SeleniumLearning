package WebComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DynamicDropdown{


		public static void main (String aa[]) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.spicejet.com/");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("//div[id='divpaxinfo']")).click();
			Thread.sleep(2000L);
			int x=1;
			while (x<5)
			{
			driver.findElement(By.id("hrefIncAdt")).click();
			x++;
			}
			driver.findElement(By.id("btnclosepaxoption")).click();	
			
			/*
			
			Select S = new Select(driver.findElement(By.xpath("//select [@id='ctl00_mainContent_DropDownListCurrency']")));
				S.selectByVisibleText("USD");
				*/
			}
		

	}


