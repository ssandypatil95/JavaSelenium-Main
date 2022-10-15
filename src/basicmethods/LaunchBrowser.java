package basicmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class LaunchBrowser {
	public static void main(String[] args) throws IOException {
		
    System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
//	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\firefox\\geckodriver.exe");	
    
 //   ChromeDriver driver1=new ChromeDriver();
    
    WebDriver driver=new ChromeDriver();
	
//	WebDriver driver = new FirefoxDriver();
    
    driver.manage().window().maximize();
    
   // RemoteWebDriver driver2=new ChromeDriver();
        
//    Excelreaddata erd = new  Excelreaddata();         ----------------object created for excel sheet data used
    
//    String URL = erd.dataread(3,3);
       
      driver.get("https://www.google.com");
    	
    
    }
}

