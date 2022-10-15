package waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaits {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		 driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		 
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                      .withTimeout(Duration.ofMinutes(10))
				                      .pollingEvery(Duration.ofSeconds(9))
				                      .ignoring(NoSuchElementException.class);
		 
		 
         driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		 
		 WebElement checkbox = driver.findElement(By.xpath("//*[@id='ch']"));
		 
		 wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox,true));
		
		 
	
	}
}
