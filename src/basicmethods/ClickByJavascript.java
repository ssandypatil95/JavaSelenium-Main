package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByJavascript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		
	     WebElement julymonth = driver.findElement(By.xpath("//*[@id='select-item-select-0-6']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", julymonth);  // click operation performed with the help of javascriptexecutor
	
	}
}
