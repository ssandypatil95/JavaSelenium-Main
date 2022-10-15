 package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBootstrapdropdownUsingFindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
//---------------------------------------------------------------------------------------------------------------------		
		List<WebElement> monthvalues = driver.findElements(By.xpath("//*[contains(@id,'select-item-select-0-')]"));
		
		for(WebElement value:monthvalues) 
		{
			String month = value.getText();
			System.out.println(month);
			
			if(month.equals("Jun"))
		    {
				value.click();
				break;
		    }                                      //       PENDING FOR CHECK AND CORRECT       //
	    }
//------------------------------------------------------------------------------------------------------------------		
	
  }
}
