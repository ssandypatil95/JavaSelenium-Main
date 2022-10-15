package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	
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
			   
			   List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectedRecord_')]"));
		//	 upper line we used xpath with contains method so that xpath shows all check boxes highlighted  
	   //    for use upper webelements method we click at a time all check boxes without selecting any no of check boxes         
	           for(WebElement check:checkboxes) 
	           {
	        	   check.click();	   
	           }
	}
}
