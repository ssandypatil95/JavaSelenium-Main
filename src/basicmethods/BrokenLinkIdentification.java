package basicmethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkIdentification {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/newtours/");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	int numberoflinks = links.size();
	
	for(int i=0; i<numberoflinks; i++) 
	{
		WebElement element = links.get(i);
		
		String url = element.getAttribute("href");
		
		System.out.println(url);
		
		try 
		{
		URL link = new URL(url);
		
		HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
		
		Thread.sleep(1000);
		
		httpconn.connect();
		
		int rescode = httpconn.getResponseCode();
		
		System.out.println(rescode);
    	}
		
		catch(Exception e) 
		{
			System.out.println("exception arrived please check the code");
		}
	}
 }
}
