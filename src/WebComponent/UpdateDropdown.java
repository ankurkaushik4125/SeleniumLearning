package WebComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class UpdateDropdown{


		public static void main (String aa[]) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.spicejet.com/");
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
			driver.findElement(By.xpath("//a [@value='BOM']" )).click();
			
			Thread.sleep(2000);
			// to handle duplicate webelement value
			driver.findElement(By.xpath("(//a [@value='DEL'])[2]" )).click();

			
			
			
			}
		

	}


