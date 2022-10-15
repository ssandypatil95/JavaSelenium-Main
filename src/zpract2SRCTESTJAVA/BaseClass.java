package zpract2SRCTESTJAVA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import zpract1SRCMAINJAVA.PageClass;

public class BaseClass {
	WebDriver driver;
	PageClass pc;
	
	@BeforeSuite
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    
        driver=new ChromeDriver();                                // To open chrome browser
        driver.manage().window().maximize();                                // To used maximize the window
        
//	   driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	   driver.get("https://www.facebook.com/signup");
		
	}
	
	@BeforeClass
	public void createNewObject() 
	{
		pc = new PageClass(driver);
	}
	
	
	
	@AfterSuite
	public void closeBrowser() 
	{
	//	driver.quit();
	}

}
