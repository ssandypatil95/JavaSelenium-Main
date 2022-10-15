package zzPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pract1 {
	
	public static void main(String[] args) throws IOException {
		
	    System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
			
  
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    
	      driver.get("https://www.makemytrip.com/");
	      driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	      
	      driver.findElement(By.xpath("//*[@class='langCardClose']")).click();
	      
	      WebElement sourcecity = driver.findElement(By.xpath("//*[@id='fromCity']"));
		   
	      sourcecity.sendKeys("Mumbai");
		    
		    WebElement fromcity = driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']"));

		    fromcity.click();
		    
		    
		    WebElement destcity = driver.findElement(By.xpath("//*[@id='toCity']"));
			   
		    destcity.sendKeys("new delhi");
		    
		    //destcity.click();
		    WebElement tocity = driver.findElement(By.xpath("//*[text()='New Delhi, India']"));

		    tocity.click();
		    
     	    driver.findElement(By.xpath("//*[@class='fsw_inputBox dates inactiveWidget ']//*[@for='departure']")).click();

     	    
     	   while(true)
   		{
   		
//  		String title = driver.findElement(By.xpath("//*[text()='October 2022']")).getText();
  		
  		String title = driver.findElement(By.xpath("(//*[@class='DayPicker-Caption'])[2]")).getText();

  		//(//*[@class='DayPicker-Caption'])[2]/div
   		System.out.println(title);

   		if(!(title.equals("January 2023")))
   		{
   		 

 		driver.findElement(By.xpath("(//*[@class='DayPicker-NavButton DayPicker-NavButton--next'])[1]")).click();
 		
// 		driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();

// 		driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
 		
   	
   		}
   		else
   		{
   			break;
   		}
   		}
   		
   		 WebElement cld = driver.findElement(By.xpath("(//*[@class='DayPicker-Day'])[8]"));
   		cld.click();
   	}
  
}

	
	


