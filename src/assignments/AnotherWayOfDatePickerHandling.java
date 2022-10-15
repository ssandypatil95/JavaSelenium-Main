package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherWayOfDatePickerHandling {
	
	public static void datepicker(WebDriver driver,String day,String monthyear) {}      //-------------------new line added--------------

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
	       WebDriver driver=new ChromeDriver();                                // To open chrome browser
	       driver.manage().window().maximize();                                // To used maximize the window
	        
		   driver.get("https://jqueryui.com/datepicker/");   
	                                                     // For the special functionalty,first entering in to the special functionalty i.e.(iframe)	  
		   WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

		   driver.switchTo().frame(iframe);                                            // Using this method switching to the iframe	                                 
		   
		   driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		   
		   datepicker(driver,"15","May 2019");                   //-------------------------------------------new line added------------------

// ---------------------------only copypaste not undastand byself so confirm in class---------------------------------------------
		   
}
}