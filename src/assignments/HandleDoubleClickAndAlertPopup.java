package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDoubleClickAndAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		        driver.manage().window().maximize();                                // To used maximize the window
		        
			   driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");            
			   
			   WebElement doubleclickbuutton = driver.findElement(By.xpath("//*[@id='double-click']"));
			   
			   Actions act = new Actions(driver);
			   
			   act.doubleClick(doubleclickbuutton).perform();
			   
			   String popupmessage = driver.switchTo().alert().getText();
			   
			   System.out.println(popupmessage);
			   
			   driver.switchTo().alert().accept();
			   
  }
}
