package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeableOperations {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    
        WebDriver driver=new ChromeDriver();                                // To open chrome browser
        driver.manage().window().maximize();                                // To used maximize the window
        
	   driver.get("https://jqueryui.com/resizable/");
	   
// For the special functionalty,when we perform mouse action so first entering in to the special functionalty i.e.(iframe)	  
	   WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

// Using this method switching to the iframe	   
	   driver.switchTo().frame(iframe);                                      
	   
	   WebElement resizeable = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	   Actions act = new Actions(driver);
	   
	   act.clickAndHold(resizeable).moveByOffset(90, 120).release(resizeable).build().perform();
	   
// switching out to the parent frame----------------------------------------------------------------------------------------------
	   driver.switchTo().parentFrame();
	   
	   driver.findElement(By.xpath("//*[text()='Draggable']")).click();

 }
}