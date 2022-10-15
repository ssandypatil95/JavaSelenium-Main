package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;
import pages.LoginPageAdvance;

public class BaseTest {
   static WebDriver driver;
	LoginPageAdvance lp;
	
	@BeforeSuite
	public void initBrowser() 
	{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
	    
        driver=new ChromeDriver();                                          // To open chrome browser
        driver.manage().window().maximize();                                // To used maximize the window
        
	   driver.get("https://opensource-demo.orangehrmlive.com/");            	
	}
	
	@BeforeClass
	public void creatObject() 
	{
		lp = new LoginPageAdvance(driver);
	}
	
		
	@AfterSuite
	public void tearDown() 
	{
		driver.quit();
	}
	
	

}
