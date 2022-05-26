


package WebComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.*;



	public class Pagination{


			public static void main (String aa[]) throws InterruptedException 
			{
				
				System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			
				driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				// to count all Checkbox in page
				
				List <WebElement> NameElements =driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));

				List <String> Names = new ArrayList<String>();
			for (WebElement NameElement : NameElements)
			{
				Names.add(NameElement.getText());
				
	
				
			}
			
			String next_button_classname=driver.findElement(By.id("example_next")).getAttribute("class");
			
			while(!next_button_classname.contains("disabled"))
				
			{
				driver.findElement(By.id("example_next")).click();
				
			 NameElements =driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));

				for (WebElement NameElement : NameElements)
				{
					Names.add(NameElement.getText());
					
			
					
				}
				 next_button_classname=driver.findElement(By.id("example_next")).getAttribute("class");
				
				
			}
			for (String Name : Names)
			{
			System.out.println(Name);
			
			}
			
			int totalnames = Names.size();
			
			System.out.println(totalnames);
			}
			}
	
	



