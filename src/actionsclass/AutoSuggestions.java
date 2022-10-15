package actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    	    
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.google.co.in/");
	    
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	    
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> searchedoptions = driver.findElements(By.xpath("//*[@class='pcTkSc']//*[text()='selenium']"));
	    
	    for(WebElement option:searchedoptions) 
	    {
	    	String displayingoption = option.getText();
	    	System.out.println(displayingoption);
	    	
	    	
	    	if(displayingoption.equalsIgnoreCase("selenium webdriver")) 
	    	{
	    		option.click();
	    		break;
	    	}    	
	    }
	    
	
 }
}
