package testngdiscussion;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethodsActuals {
	WebDriver driver;
	
	@Test(priority = 1)
	public void getTitleOfPage() 
	{

	 System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
	 driver=new ChromeDriver();                                // To open chrome browser
     driver.manage().window().maximize();                                // To used maximize the window
		        
	 driver.get("https://opensource-demo.orangehrmlive.com/");            // To open facebook in chrome
			    
	 String title = driver.getTitle();
	 System.out.println(title);
	}
	
//-------------------------------------------------------------------------------------------------------	
	@Test(priority = 2,dependsOnMethods ="getTitleOfPage" )
	public void loginToApp() 
	{
	 WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	 username.sendKeys("Admin");	   
     WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
     password.sendKeys("admin123");	   
     WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
	 login.click();		  
	}

//--------------------------------------------------------------------------------------------------------	
	@Test(priority = 3,dependsOnMethods = "loginToApp")
	public void navToAdminTab() 
	{
	 driver.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();
	}

//----------------------------------------------------------------------------------------------------------	
	@Test(priority = 4,dependsOnMethods = "navToAdminTab")
	public void handlingCheckBox() 
	{
		 for(int j=2; j<=45; j++) {
				if(j%2!=0)
			{
		       driver.findElement(By.xpath("(//input[@type='checkbox'])["+j+"]")).click();
			}
	}
  }
}




