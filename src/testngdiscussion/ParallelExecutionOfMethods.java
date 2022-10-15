package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecutionOfMethods {
	
	@Test
	public void launchchrome() 
	{
		
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
	
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/signup");
        
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("spatil");
	   	
	   	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
			
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8459266525");
		
	}
        
    @Test
    public void launchFirefox() 
    {
    	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\firefox\\geckodriver.exe");	
             
       WebDriver driver = new FirefoxDriver();
       
       driver.get("https://www.facebook.com/signup");
       
       driver.manage().window().maximize();
       
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("spatil");
	   	
	   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
		
       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8459266525");
		   		
     }
    	
}
