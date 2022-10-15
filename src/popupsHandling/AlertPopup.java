package popupsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		
		String textonalert = driver.switchTo().alert().getText();
		
		System.out.println(textonalert);                                       // To get the text msg in to the console
		
		driver.switchTo().alert().accept();                                    // this method is handle to alert popup
	
	}
}
