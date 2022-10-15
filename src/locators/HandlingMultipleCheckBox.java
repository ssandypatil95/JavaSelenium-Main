package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleCheckBox {
	public static void main(String[] args)throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		        driver.manage().window().maximize();                                // To used maximize the window
		        
			   driver.get("https://opensource-demo.orangehrmlive.com/");            // To open facebook in chrome
			   
			   driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
			   
			 //  driver.findElement(By.linkText("Forgot your password?")).click();
			 //  driver.navigate().back();                                                 
			   
			   driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();
			   
			  // for(int i=2; i<=45; i++)
			  // {
			  // driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")).click();
	          // }
	
			 // for(int k=2; k<=45; j++) {
		    //	if(k%2==0)
			// {
			// driver.findElement(By.xpath("(//input[@type='checkbox'])["+k+"]")).click();
		    // }

			   for(int j=2; j<=45; j++) {
					if(j%2!=0)
				{
			   driver.findElement(By.xpath("(//input[@type='checkbox'])["+j+"]")).click();
				}
		}
	 }			
}

