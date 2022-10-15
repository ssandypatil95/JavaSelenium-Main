package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysByJavascriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='sandy'", firstname);  // sendkeys operation performed with the help of javascriptexecutor
	
		
	
	}
}
