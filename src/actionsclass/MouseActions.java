package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		        driver.manage().window().maximize();                                // To used maximize the window
		        
			   driver.get("https://opensource-demo.orangehrmlive.com/");            
			   
			   WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
			   username.sendKeys("Admin");
			   
			   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			   password.sendKeys("admin123");
			   			   
			   WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
			   login.click();
			   
			   WebElement admintab = driver.findElement(By.xpath("//a[@class='firstLevelMenu']"));
			   
			   Actions act = new Actions(driver);
			   Thread.sleep(1000);
			   act.moveToElement(admintab).perform();
//---------------------------------------------------------------------------------------------------------------------------assignment			   
			   WebElement usermanagementtab = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
			   Thread.sleep(1000);

			   act.moveToElement(usermanagementtab).perform();
			   
			   WebElement userstab = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
			   Thread.sleep(1000);

			   act.click(userstab).perform();
			   	
	}
}
