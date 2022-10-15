package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    	    
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.google.co.in/");
	    
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	    
	    Actions act = new Actions(driver);
	    
//	    act.sendKeys(Keys.ENTER).perform();           // type the search bar is selenium and enter by using actions class
//---------------------------------------------------------------------------------------------------------	    
	    Thread.sleep(2000);
	    
	    act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	    // after type in google search selenium, go down and enter after 2times arrowdown search bar
	    	    
	}
}
