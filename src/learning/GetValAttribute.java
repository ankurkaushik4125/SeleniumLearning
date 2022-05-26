package learning;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class GetValAttribute{
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
      String url = "https://www.5gshoppings.com/e/member/login/";
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
      // identify element
      WebElement l = driver.findElement(By.id("gsc-i-id1"));
      // enter texts
      l.sendKeys("Selenium");
      // get value attribute with getAttribute()
      String val = l.getAttribute("value");
      
     int Size = val.length();
     for (int i=0;i<Size;i++)
     {
    	 l.sendKeys(Keys.BACK_SPACE);
     }
      System.out.println("Entered text is: " + val);
      driver.quit();
   }
}