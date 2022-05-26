package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;


public class HandleDynamicValues {
	
	WebDriver driver=null;
	
@BeforeTest

public void Setup()

{
	
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	
}
	@Test
	public void soft_Assert() throws InterruptedException
	{
		
		
		
			driver.findElement(By.xpath("//*[@id='msdd']")).click();
		String value="English";
			List<WebElement> dropdown_data=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li//a"));
			
int Size=dropdown_data.size();
			
			for(int size = 0; size<= Size-1; size++){
				WebElement ele=dropdown_data.get(size);
				String type=ele.getText();
				
				if(type.equalsIgnoreCase(value)){
					ele.click();
					
					Thread.sleep(1000);
					break ;
				}
	}
	


			String title = driver.getTitle();
			Assert.assertEquals(title, "Register1");
			
			
}
	
	
	@Test
	public void hard_assert() throws InterruptedException
	{
		
		
		
			driver.findElement(By.xpath("//*[@id='msdd']")).click();
		String value="English";
			List<WebElement> dropdown_data=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li//a"));
			
int Size=dropdown_data.size();
			
			for(int size = 0; size<= Size-1; size++){
				WebElement ele=dropdown_data.get(size);
				String type=ele.getText();
				
				if(type.equalsIgnoreCase(value)){
					ele.click();
					
					Thread.sleep(1000);
					break ;
				}
	}
			String title = driver.getTitle();
			SoftAssert softAssertion= new SoftAssert();
			softAssertion.assertEquals(title, "Register");
		
			
}
	
}
