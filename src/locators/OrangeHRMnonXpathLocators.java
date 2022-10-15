package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMnonXpathLocators {
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		    
		        driver.manage().window().maximize();                                // To used maximize the window
		        //driver.get("https://www.gmail.com");
		    
			   driver.get("https://opensource-demo.orangehrmlive.com/");            // To open facebook in chrome
			   
			   WebElement username = driver.findElement(By.id("txtUsername"));
			   
//Exception    // when we use wrong text at the place of "textUsername",then we will get "no such element exception" 
			   // becauuse unable to locate that wrong text type element
			   
			   username.sendKeys("Admin");
			   
			   WebElement password = driver.findElement(By.id("txtPassword"));
			   password.sendKeys("admin123");
			   
			   WebElement login = driver.findElement(By.id("btnLogin"));
			   login.click();
			   
			   
//-----------------------------------------------------------------------------------------------------------------------
			   
			   
			   
			   
			
	}
    
}
