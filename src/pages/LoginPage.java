package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
	public void enterCredentialsAndLogin() 
	{
		  WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		   username.sendKeys("Admin");
		   
		   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		   password.sendKeys("admin123");
		   		   
		   WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		   login.click();		 
	 }
	
	
	public void getTitleOfPage() 
	{
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
	}

}
