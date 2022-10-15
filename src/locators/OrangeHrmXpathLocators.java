package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmXpathLocators {
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		        driver.manage().window().maximize();                                // To used maximize the window
		        
			   driver.get("https://opensource-demo.orangehrmlive.com/");            
			   
			   WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
			   username.sendKeys("Admin");
			   
			   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			   password.sendKeys("admin123");
			   
//			   WebElement forgotpassword = driver.findElement(By.linkText("Forgot your password?"));
//			   forgotpassword.click();
			   
//			   driver.navigate().back();                                                 
			   
			   WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
			   login.click();
			   
			   driver.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();
			   
			   driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_39']")).click();
			   
//			   driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();                // Xpath indexing method



	
	}
}
