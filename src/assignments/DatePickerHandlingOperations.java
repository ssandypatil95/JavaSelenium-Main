package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerHandlingOperations {
	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    
       WebDriver driver=new ChromeDriver();                                // To open chrome browser
       driver.manage().window().maximize();                                // To used maximize the window
        
	   driver.get("https://jqueryui.com/datepicker/");   
                                                     // For the special functionalty,first entering in to the special functionalty i.e.(iframe)	  
	   WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

	   driver.switchTo().frame(iframe);                                            // Using this method switching to the iframe	                                 
	   
	   driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	  
	   while(true)
	   {
		   
	   String tital = driver.findElement(By.xpath("	 //*[@class='ui-datepicker-title']")).getText();

	   System.out.println(tital);
	   
	   if (!(tital.equals("September 2018")))
	     {
		  driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	     }
	   else 
	     {
		   break;
	     }
	    
	   }
	   
	   
	   driver.findElement(By.xpath("//*[@data-handler='selectDay']//*[text()='12']")).click();

 }
}
