package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleClickOnPromptAndPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@name='prompt']")).click();
		
		String promptmessage = driver.switchTo().alert().getText();
		
		System.out.println(promptmessage);
		
		driver.switchTo().alert().accept();
	

  }
}