package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		 driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
//------------------------------------------------------------------------------------------------------------------------------------
		 
		 driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		 
		 WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		 
// To check the element is able to perform the click operation		 
		 wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		 
		 driver.findElement(By.xpath("//*[@id='enable-button']")).click();
//----------------------------------------------------------------------------------------------------------------------------------		 
		 
		 driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		 
		 WebElement hiddenbutton = driver.findElement(By.xpath("//*[@id='hidden']"));
		 
// To check the element is able to perform the click operation		 		 
		 wait.until(ExpectedConditions.visibilityOf(hiddenbutton));
		 
		 driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
//----------------------------------------------------------------------------------------------------------------------------------
		 
		 driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		 
		 WebElement hiddensite = driver.findElement(By.xpath("//*[@id='h2']"));
		 
		 wait.until(ExpectedConditions.textToBePresentInElement(hiddensite,"Selenium Webdriver"));
		 
		 driver.findElement(By.xpath("//*[@id='populate-text']")).click();
//---------------------------------------------------------------------------------------------------------------------------------
		 
	//	 driver.findElement(By.xpath("//*[@id='alert']")).click();
		 
	//	 wait.until(ExpectedConditions.alertIsPresent());
		 
	//   driver.findElement(By.xpath("//*[@id='alert']")).click();
//---------------------------------------------------------------------------------------------------------------------------------
		 
		 driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		 
		 WebElement checkbox = driver.findElement(By.xpath("//*[@id='ch']"));
		 
		 wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox,true));
		 
		 driver.findElement(By.xpath("//*[@id='checkbox']")).click();

//----------------------------------------------------------------------------------------
		 
		 driver.findElement(By.xpath("//*[@id='alert']")).click();
		 
		 wait.until(ExpectedConditions.alertIsPresent());
				 
		 driver.findElement(By.xpath("//*[@id='alert']")).click();  //------------------discuss with sir--------------
		 driver.findElement(By.xpath("//*[@id='alert']")).click();

		 
		 

		
		 
		 
		 
		 
		 
		 
		 

		 
		 


		 
		 
		 
		 
		 
	
		 

		 
		
	
	}
}
