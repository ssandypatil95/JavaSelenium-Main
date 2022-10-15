package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSelectTagDropdownUsingFindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
//----------------------------------------------------------------------------------------------------------		
		 List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
                                                    // find the common xpath for all the values which is shown upper side by using findelements method		 
		 
		 for(WebElement value:dayvalues)            // to use loop for multiple ittration
		 {
			 String day = value.getText();           // using gettext method for print the value as it is to the text
			 System.out.println(day);		         // for find all value printed in to the console
		                                         	// to find the output printed in to the console from 1 to 31 by the day value
			 if(day.equals("12"))
			 {
				 value.click();
				 break;
			 }
		 }
		 
//---------------------------------------------------------------------------------------------------------		 
		 
		 List<WebElement> monthvalues = driver.findElements(By.xpath("//*[@id='month']//option"));
		 
		 for(WebElement value:monthvalues)
		 {
			 String month = value.getText();
			 System.out.println(month);	 
		 }
//------------------------------------------------------------------------------------------------------		 
		 
		 List<WebElement> yearvalues = driver.findElements(By.xpath("//*[@id='year']//option"));
		 
		 for(WebElement value:yearvalues) 
		 {
			String year = value.getText();
			System.out.println(year); 
		 }
		 
		 
 }
}
