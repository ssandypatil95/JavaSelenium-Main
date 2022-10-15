package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetErrorMassagebyXpath {
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		        driver.manage().window().maximize();                                // To used maximize the window
		        
			   driver.get("https://opensource-demo.orangehrmlive.com/");            // To open facebook in chrome
			   
			   WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
			   username.sendKeys("Adminn");
// for finding invalid creadential we write here wrong userneme as a Adminn			   
			   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			   password.sendKeys("admin123");
			   			   
			   WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
			   login.click();

//down side--- for finding print of the error text message in to the console			   
			   WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
			   String msg = message.getText();
			   System.out.println(msg);
// the message get in to the console is :- "Invalid credentials"
			   
	}	
}
