package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SampleTest2 extends SampleTest1 {
	
	@Test(priority = 3)
  	public void enterDetails() 
  	{ 	
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("spatil");
	
  	}
	
	@Test(priority = 4)
  	public void selectBirthDate() 
  	{ 	
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select selday = new Select(day);
		selday.selectByVisibleText("12");
				
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select selmonth = new Select(month);
		selmonth.selectByValue("11");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selyear = new Select(year);
		selyear.selectByIndex(32);

  	}
}
