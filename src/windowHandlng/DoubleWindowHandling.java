package windowHandlng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleWindowHandling {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");              ///index.php/dashboard
//-----------------------------------------------------------------------------------------------------------------------------------------		
// To get parent window id		
		String parentid = driver.getWindowHandle();               // use this to find the parent window id
		System.out.println(parentid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc.")).click();               //OrangeHRM, Inc.   OrangeHRM, Inc

//--------------------------------------------------------------------------------------------------------------------------------------		
// To get all window (parent + all child) id		
		Set<String> allwindowid = driver.getWindowHandles();
		
		for(String winid:allwindowid) 
		{
			System.out.println(winid);
			if(!parentid.equals(winid))
			{
//       Switching to the child window 	---------------------------------------------------------------------------------------------------			
				driver.switchTo().window(winid);
			}
		}
		driver.findElement(By.xpath("//*[@class='btn-orange trial-btn pulse ']")).click();
		
//---------------------------------------------------------------------------------------------------------------------------------------		
//      Switching back to the parent window 						
		driver.switchTo().window(parentid);
		
		
		 WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		   username.sendKeys("Admin");
		   
		   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		   password.sendKeys("admin123");
		   		   
		   WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		   login.click();
		
	}
}
