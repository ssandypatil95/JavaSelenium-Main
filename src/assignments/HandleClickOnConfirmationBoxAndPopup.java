package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleClickOnConfirmationBoxAndPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		
		String confirmationboxmessage = driver.switchTo().alert().getText();
		
		System.out.println(confirmationboxmessage);
		
//		driver.switchTo().alert().dismiss();   // click on to the cencel button
		
		driver.switchTo().alert().accept();   // click on to the ok button
		
  }
}