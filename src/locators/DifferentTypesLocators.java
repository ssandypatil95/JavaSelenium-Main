package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentTypesLocators {
	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    
	   // ChromeDriver driver=new ChromeDriver();
	    
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
//-------------------------------------------------------------------------------------------------------------------------------	    
// 01. Using id Locator :-	
	    
		   WebElement username = driver.findElement(By.id("txtUsername"));
		   username.sendKeys("Admin");
//------------------------------------------------------------------------------------------------------------------------------

// 02. Using name Locator	    
	    
	    WebElement usern = driver.findElement(By.name("textUsername"));
	    usern.sendKeys("Admin");

	    //driver.findElement(By.name("textUsername")).sendKeys("Admin");              // directlly written 2 line code in 1 line
//------------------------------------------------------------------------------------------------------------------------------
	    
// 03. Using className Locators
	    
		   WebElement login = driver.findElement(By.className("button"));
		   login.click();
	   
		  // driver.findElement(By.className("button")).click();
//----------------------------------------------------------------------------------------------------------------------------
		   
// 04. Using linkText Locators
		   
		   WebElement forgotlink = driver.findElement(By.linkText("Forgot your password?"));
		   forgotlink.click();
		   
		 // driver.findElement(By.linkText("Forgot your password?")).click();
//-----------------------------------------------------------------------------------------------------------------------------
		   
// 05. Using partialLinkText Locators
	   
		   WebElement linkforpassword = driver.findElement(By.partialLinkText("ur password?"));
		   linkforpassword.click();
		   
		 // driver.findElement(By.partialLinkText("ur password?")).click();	   
//-----------------------------------------------------------------------------------------------------------------------------		   
		   
// 06. Using tagName Locators
		   
		   WebElement uname = driver.findElement(By.tagName("input"));
		   uname.click();
		   
		 // driver.findElement(By.tagName("input")).click();   
//-----------------------------------------------------------------------------------------------------------------------------
		   
// 07. Using Xpath Locators
		   
		   //Syntax of Xpath :-
		                          //tagname[@attribute_name='attribute_value]
		   
		   WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		   pwd.sendKeys("admin123");
		   
		  // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	}

}





