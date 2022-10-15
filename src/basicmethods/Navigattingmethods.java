package basicmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigattingmethods {
	public static void main(String[] args)throws InterruptedException  {
		
	    System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();                  // To open chrome browser
	    
	    driver.manage().window().maximize();                  // To used maximize the window
	    //driver.get("https://www.gmail.com");
	    
		   driver.get("https://www.facebook.com");            // To open facebook in chrome
		    Thread.sleep(2000);                               // To stop next action for 2 sec then perform next action
	    
		   driver.get("https://www.google.com");              // To open google in chrome
		    Thread.sleep(2000);                               // To stop next action for 2 sec then perform next action
		    
		   // driver.close();                                 // To close the Chrome browser
		    
		    driver.navigate().back();                         // To perform back navigation in chrome browser
		    Thread.sleep(2000);
		    driver.navigate().forward();                      // To perform forward navigation in chrome browser
		    Thread.sleep(2000);
		    driver.navigate().refresh();                      // To perform refresh navigation in chrome browser
		    
		    driver.close();   


		}
}
	



 