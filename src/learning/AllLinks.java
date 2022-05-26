package learning;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {


	public static void main (String aa[])
	{
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://people.zoho.com/");
	
List<WebElement> all_elements=driver.findElements(By.tagName("a"));

for(int i=0;i<all_elements.size();i++)
{
System.out.println(all_elements.get(i).getAttribute("href"));	
}

	
}
}
