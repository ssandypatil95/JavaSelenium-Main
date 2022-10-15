package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestTagExecution {
	
	 WebDriver driver;
	 
		@Test(priority = 1)
		public void launchchrome() 
		{			
	        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
	        
	        driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
			
	        driver.get("https://www.facebook.com/signup");
	   
		}
		
		@Test(priority = 2)
		public void enterDetails() 
		{        
	        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("spatil");
		   	
		   	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
				
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8459266525");		
		}
	
	

}
