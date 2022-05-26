package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class temp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub{
//		String dir = System.getProperty("user.dir");
//		System.out.println(dir);

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\browser_driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://demoqa.com/automation-practice-form");
		//driver.findElement(By.id("Firstname")).sendKeys("Rishabh");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rishabh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Vats");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ankurkaushik4125@gmail.com");
	
		

/*
boolean status=		driver.findElement(By.xpath("//input[@name='gender' and @value='male' ]")).isSelected();
if(status==false)
{
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
*/

		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("100");
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("New Delhi");
		driver.findElement(By.id("Submit")).click();
		//driver.findElement(By.id("subjectsContainer")).
		
		
		
		
	}
	
	//WebDriver driver = new FirefoxDriver();


	}


