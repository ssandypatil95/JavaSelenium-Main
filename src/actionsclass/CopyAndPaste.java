package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/signup");
				
				WebElement firstname = driver.findElement(By.xpath("//*[contains(@id,'u_0_b_')]"));
				
				Actions act = new Actions(driver);
				
				// down side we use second option of sendkeys through direct put value with the help of webelement
				
// Performing control + a operation				
				act.sendKeys(firstname, "sandy")
				.keyDown(Keys.CONTROL)
				.sendKeys("a")
				.keyUp(Keys.CONTROL)
				.build().perform();
				
// Performing control + c operation				
				act.keyDown(Keys.CONTROL)
				.sendKeys("c")
				.keyUp(Keys.CONTROL)
				.build().perform();
				
// Performing control + v operation				
				act.sendKeys(Keys.TAB)
				.keyDown(Keys.CONTROL)
				.sendKeys("v")
				.keyUp(Keys.CONTROL)
				.build().perform();

//-----------------------------------------------------------------------------------------------------------------------------------
				
//get attribute method
				WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));
				mobilenumber.sendKeys("9876543210");
				
				String enteredtext = mobilenumber.getAttribute("value");           // here by default we write value
				System.out.println(enteredtext);
				
	}
}
