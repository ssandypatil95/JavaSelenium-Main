package assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelReader;

public class FbsignupWithExcelSheet {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
// for using excel reader,we put the data from excel sheet		
		ExcelReader er = new ExcelReader();
		String firstname = er.readdata(20,1);
		String lastname = er.readdata(21,1);
		String mailid = er.readdata(22,1);
		String password = er.readdata(23,1);
		
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
//	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(er.readdata(2,0));  ----------------or another way to direct calling
	   	
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(er.readdata(2,1);    ----------------or another way to direct calling
		
		
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mailid);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//		when dropdown is "selecttag" types means dropdowns locators tagname is "select" then this process follows
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
}
