package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToEelementAndClick {
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		        driver.manage().window().maximize();                                // To used maximize the window
		        
			   driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");            
			   
// WAP to handle the the image output by hover the "sub-menu" option and click any one option on it ---------------------------------------------	
			   
			   WebElement submenuoption = driver.findElement(By.xpath("//*[@id='sub-menu']"));
			   Actions act = new Actions(driver); 
			   act.moveToElement(submenuoption).perform();
			   
			   WebElement googlebutton = driver.findElement(By.xpath("//*[@id='link2']"));
			   act.click(googlebutton).perform();		   
	}
}
