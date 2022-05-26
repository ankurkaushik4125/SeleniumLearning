package WebComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input [@id='fromCity']")).click();
		WebElement source=driver.findElement(By.xpath("//input [@placeholder='From']"));
		source.sendKeys("BLR");
		source.sendKeys(Keys.ARROW_DOWN);

		source.sendKeys(Keys.ENTER);
		source = driver.findElement(By.xpath("//input[@placeholder='To']"));

		Thread.sleep(1000);

		source.click();

		Thread.sleep(1000);

		source.sendKeys("DEL");

		Thread.sleep(1000);

		for(int i=1;i<3;i++)

		{

		source.sendKeys(Keys.ARROW_DOWN);

		}

		source.sendKeys(Keys.ENTER);

		
		
	}

}
