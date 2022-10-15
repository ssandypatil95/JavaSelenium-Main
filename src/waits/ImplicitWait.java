package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		 driver.get("https://www.google.co.in/");
		    
		 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("india");
		 
		 Actions act = new Actions(driver);
		 
		 act.sendKeys(Keys.ENTER).perform();
		 
		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//*[text()='Central Bank of India']")).click();
		    
		    
		    
		   

  }
}
