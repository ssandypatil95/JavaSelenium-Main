package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    
        WebDriver driver=new ChromeDriver();                                // To open chrome browser
        driver.manage().window().maximize();                                // To used maximize the window
        
	   driver.get("https://jqueryui.com/draggable/");
	   
// For the special functionalty,when we perform mouse action so first entering in to the special functionalty i.e.(iframe)	  
	   WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	   
	   driver.switchTo().frame(iframe);                                       // Using this method switching to the iframe
	   
	   WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
	   Actions act = new Actions(driver);
	   
	   act.clickAndHold(draggable).moveByOffset(70, 90).release(draggable).build().perform();
	   
	

	}

}
