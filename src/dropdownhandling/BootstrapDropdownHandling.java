package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		driver.findElement(By.xpath("//*[@id='select-item-select-0-10']")).click();
		
		driver.findElement(By.xpath("//*[@id='select-1']")).click();
		driver.findElement(By.xpath("//*[@id='select-item-select-1-11']")).click();
		
		driver.findElement(By.xpath("//*[@id='select-2']")).click();
		driver.findElement(By.xpath("//*[@id='select-item-select-2-13']")).click();
		
		driver.findElement(By.xpath("//*[@class='continue_button zm-button--primary zm-button--large zm-button']")).click();
		
	}
}
