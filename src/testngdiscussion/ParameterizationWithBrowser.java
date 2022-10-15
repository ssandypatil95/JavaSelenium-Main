package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationWithBrowser {
	WebDriver driver;
	
	@Parameters("browser")
	@Test(priority = 1)
	public void launchBrowser(String browsername) 
	{
		if(browsername.equals("chrome")) 
		{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
        
        driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
		  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\firefox\\geckodriver.exe");	
        
        driver = new FirefoxDriver();
		}
		
        driver.get("https://www.facebook.com/signup");
        
	}
	
	@Test(priority = 2)
	public void enterValues() 
	{
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("spatil");
		   	
	   	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
			
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8459266525");
			
	}
	    

}
