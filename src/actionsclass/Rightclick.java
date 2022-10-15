package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		        driver.manage().window().maximize();                                // To used maximize the window
		        
			   driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");            
			   
			   WebElement rightclickbuutton = driver.findElement(By.xpath("//*[@id='double-click']"));
			   
			   Actions act = new Actions(driver);
			   
//			   act.contextClick().perform();                      // right clicked to anywhere on to the page,no defined any element
			   
			   act.contextClick(rightclickbuutton).perform();     // right clicked on to the particular web-element through this method 
			   
			   
}

}
