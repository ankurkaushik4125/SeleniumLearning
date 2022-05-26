package learning;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {

	WebDriver Driver=null;
	public boolean switchToTab(WebDriver driver,String tabName){
	
	    ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
	    ArrayList<String> tabList = new ArrayList<>();
	    for (int i =0;i<tab.size();i++){
	        tabList.add(i,driver.switchTo().window(tab.get(i)).getTitle());
	        driver.switchTo().window(tab.get(0));
	        if(tabList.get(i).equals(tabName)){
	            driver.switchTo().window(tab.get(i));
	                return true;
	        }
	    }
	    return false;
	}

		public static void main (String aa[]) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://upsee.nic.in/webinfo/public/home.aspx");
			driver.findElement(By.linkText("Online Registration and Fee Payment, Choice Filling Round-2")).click();
			
			LocatorId li= new LocatorId();
			li.switchToTab(driver, "Online Counselling System");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRegno")).sendKeys("33910439");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword")).sendKeys("Admin@123");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnsignin")).click();
			
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			 
			 System.out.println(allLinks.size());
			 
			 for(WebElement links:allLinks)
			 
			 {
			 
		
			 System.out.println(links.getText() + " - " + links.getAttribute("href"));
			 }
			//driver.findElement(By.id("loginbutton")).click();
			
			
			}
		

	}


