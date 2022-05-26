package learning;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Zoho_Automation{


		public static void main (String aa[]) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://www.zoho.com/people/");
			driver.findElement(By.linkText("SIGN IN")).click();
			driver.findElement(By.xpath("//*[@id='login_id']")).sendKeys("ankur.sharma@kmgin.com");
			driver.findElement(By.xpath("//*[@id='nextbtn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Anku4125@");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='nextbtn']/span")).click();
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='zp_logo']")));
			
			String Text = driver.findElement(By.xpath("//*[@id='ZPD_Top_Att_Stat']")).getText();
			LocalTime now = LocalTime.now();
			LocalTime limit = LocalTime.parse( "09:00:00.000" );
			Boolean isLate = now.isAfter( limit );
			
			if (Text.equalsIgnoreCase("Check-in") && isLate==false );
			
			{
				driver.findElement(By.xpath("//*[@id='ZPD_Top_Att_Stat']")).click();
			}
			Thread.sleep(5000);
			
		driver.close();
			
			}
		

	}


