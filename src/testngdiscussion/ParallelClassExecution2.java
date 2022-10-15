package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelClassExecution2 {
	
	 WebDriver driver;
	 
		@Test(priority = 1)
		public void launchFirefox() 
		{			
	    	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\firefox\\geckodriver.exe");	
            
		    driver = new FirefoxDriver();
		    
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
