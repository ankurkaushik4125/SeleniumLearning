package WebComponent;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DynamicDropdownParentChild{


		public static void main (String aa[]) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.spicejet.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a [@value='BOM']" )).click();
			
			Thread.sleep(2000);
			// to handle duplicate webelement value
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a [@value='GOI']" )).click();
			
System.out.println( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			
System.out.println( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
// to count all checkbox in page
Dimension x =driver.findElement(By.cssSelector("input[type='checkbox']")).getSize();
System.out.println(x );		

		}	}


