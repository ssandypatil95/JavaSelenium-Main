package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestTagExecution2 {
	
	@Test
	public void orangeTest() throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
		    
	       WebDriver driver=new ChromeDriver();                                // To open chrome browser
	       driver.manage().window().maximize();                                // To used maximize the window
	        
		   driver.get("https://opensource-demo.orangehrmlive.com/");            // To open facebook in chrome
		   
		   driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		      
		   driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();
		   
		   for(int i=2; i<=45; i++)
		   {
		     driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")).click();
           }
	}
}			

	
	
	


