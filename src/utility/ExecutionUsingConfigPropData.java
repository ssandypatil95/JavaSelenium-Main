package utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecutionUsingConfigPropData {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		
		String browsername = ReadDataFromConfigProperties.getProData("browser");
		
		System.out.println(browsername);
		
		if(browsername.equals("chrome")) 
		{
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chrome//chromedriver.exe");
				
				driver=new ChromeDriver();			
		}
		else 
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//gecko//firefoxdriver.exe");
			
			    driver=new FirefoxDriver();		
		}
		
		driver.get(ReadDataFromConfigProperties.getProData("testsiteurl"));
		driver.manage().window().maximize();
		
				
		driver.findElement(By.id("txtUsername")).sendKeys(ReadDataFromConfigProperties.getProData("username"));
					   
		driver.findElement(By.id("txtPassword")).sendKeys(ReadDataFromConfigProperties.getProData("password"));
					   
		driver.findElement(By.id("btnLogin")).click();
					 
	}

}
