package windowHandlng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.domsnapshot.model.ArrayOfStrings;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		
//-----------------------------------------------------------------------------------------------------------------------------------------		
// To get parent window id		
		String parentid = driver.getWindowHandle();               // use this to find the parent window id
		System.out.println(parentid);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("OrangeHRM, Inc"))).click();

		
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();      // open one more window
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();      // open one more window


//--------------------------------------------------------------------------------------------------------------------------------------		
// To get all window (parent + all child) id		
		Set<String> allwindowid = driver.getWindowHandles();
		
		int numberofwindow = allwindowid.size();
		System.out.println("Total no of window is : "+numberofwindow);
		
		String [] winid = new String [numberofwindow];
		
		int i=0;
		for(String id:allwindowid) 
		{
			winid [i] = id;
			i++;
		}
		
		for(String arrayelement:winid)
		{
			System.out.println(arrayelement);
		}
		
		driver.switchTo().window(winid[1]);
		
		driver.findElement(By.xpath("//*[@class='btn-orange trial-btn pulse ']")).click();
		
		driver.close();              // Only curent single window will close
		
		Thread.sleep(1000);
		
		driver.quit();               // all window will be close

		
	}
}
