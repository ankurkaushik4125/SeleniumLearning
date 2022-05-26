package work;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_Search {
	
	public static void main (String aa[]) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver  = new ChromeDriver();
	driver.get("https://www.google.com");
	
	String send_text="amazon";
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(send_text);
	driver.findElement(By.xpath("	/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	
	List<WebElement> all_elements=driver.findElements(By.tagName("a"));

	for(int i=0;i<all_elements.size();i++)
	{
	System.out.println(all_elements.get(i).getText());	
	}



	}
}
