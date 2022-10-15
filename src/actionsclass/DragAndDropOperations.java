package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperations {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    
        WebDriver driver=new ChromeDriver();                                // To open chrome browser
        driver.manage().window().maximize();                                // To used maximize the window
        
	   driver.get("https://jqueryui.com/droppable/");
	   
// For the special functionalty,when we perform mouse action so first entering in to the special functionalty i.e.(iframe)	  
	   WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	   
	   driver.switchTo().frame(iframe);                                       // Using this method switching to the iframe
	   
	   WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
	   Actions act = new Actions(driver);
	   
	   WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
	   
	   act.clickAndHold(draggable).moveToElement(droppable).release(draggable).build().perform();
	   
// second way of perform drag and drop actions------------------------------------------------------------------------------
	   
	 // act.dragAndDrop(draggable, droppable).perform();
	
	}
}
