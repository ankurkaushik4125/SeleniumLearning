package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SELENIUM FRAMEWORK\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

	}

}
