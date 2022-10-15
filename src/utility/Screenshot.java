package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	

	public static void captureScreenshot(WebDriver driver,String filename) throws IOException
	{
        TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png";      
		
		File destination = new File(path);
		
		FileHandler.copy(source, destination);    		                    	// calling this method from classname.methodname for the screenshot
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Screenshot.captureScreenshot(driver,"fbsignup5"); // method calling for the screenshot
		// calling this method anywhere of the project
	
	}
}
