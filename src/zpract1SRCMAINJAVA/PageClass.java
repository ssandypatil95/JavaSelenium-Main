package zpract1SRCMAINJAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PageClass {
	static WebDriver driver;
	
	public PageClass(WebDriver driver) 
	{
		this.driver = driver;
	}
		
	public void enterDataAndLogin() 
	{  		
//		   WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
//		   username.sendKeys("Admin");
//		   
//		   WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
//		   password.sendKeys("admin123");
//		 		   
//		   WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
//		   login.click();
		   
		   
		   
		   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("spatil");
		   
			//	driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys("spatil");
			// when we have only single attribute for locators and continuaslly change of attributes value then we used contains method.
				
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
			//	driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("patil");
			// when we have only single attribute for locators and continuaslly change of attributes value then we used contains method.
			
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8459266525");
				
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
				
				WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//				when dropdown is "selecttag" types means dropdowns locators tagname is "select" then this process follows
				Select selday = new Select(day);
				selday.selectByVisibleText("12");
		//1		by handle select tagname dropdown using selectByVisibleText method,we write as it is dropdown text.
						
				WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
				Select selmonth = new Select(month);
				selmonth.selectByValue("11");
		//2		by handle select tagname dropdown using selectByValue method,we write value of the particular dropdown.

				
				WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
				Select selyear = new Select(year);
				selyear.selectByIndex(32);
		//3		by handle select tagname dropdown using selectByIndex method,we write the index no of dropdown where starts from 0index to next..

		//here 1,2,3 are three mehtods but we can use any one method for handling all select tagname dropdowns		
				
				driver.findElement(By.xpath("//input[@value='2']")).click();
				
				driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				

	}
	
	public void getTitle() 
	{
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}

}
