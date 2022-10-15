package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConditionalMethods {
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		    
		        WebDriver driver=new ChromeDriver();                                // To open chrome browser
		        driver.manage().window().maximize();                                // To used maximize the window
		        
			   driver.get("https://opensource-demo.orangehrmlive.com/");            // To open facebook in chrome
			   
			   WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
			   username.sendKeys("Admin");
			   
			   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			   password.sendKeys("admin123");
			   
			   
			   WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
			   login.click();
			   
			   driver.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();
//-----------------------------------------------------------------------------------------------------------------------			   
			   WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_54']"));
			   boolean ischeckboxisdisplayed = checkbox.isDisplayed();
			   System.out.println("is check box is displayed on the page "+ischeckboxisdisplayed);  //true
			   
    		   boolean isenabled = checkbox.isEnabled();
			   System.out.println("is enabled variable value is "+isenabled);   //true
			   
			   boolean isselected = checkbox.isSelected();
			   System.out.println("is selected variable value is "+isselected);  //false
			   
			   checkbox.click();
			   boolean checkedafterclick = checkbox.isSelected();
			   System.out.println("checked after click status is "+checkedafterclick);    //true
			   
			   WebElement hiddenelement = driver.findElement(By.xpath("//*[@id='likedOrSharedEmployeeForm_id']"));
    		   boolean isvissibleoverpage = hiddenelement.isDisplayed();
    		   System.out.println(isvissibleoverpage);                                      //false
			   
			   
	}
}
