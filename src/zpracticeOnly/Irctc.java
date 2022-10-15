package zpracticeOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {
	public static void main(String[] args) throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();                               //Create object ChromeDriver
		driver.manage().window().maximize();                               //maximize chrome window
		
		driver.get("https://www.irctc.co.in/nget/train-search");           //Use get method for enter particular URL
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();        // click inside box where is from station 
		Thread.sleep(1000);
		//Throw the Exception for hold the Execution for 2 sec. and handle this exception with throws keyword with main method
		
		driver.findElement(By.xpath("//*[@aria-controls='pr_id_1_list']")).sendKeys("PUNE");    //send value in from station
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@aria-controls='pr_id_1_list']")).sendKeys(Keys.TAB);  //select drop-down name using Keys.TAB
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@aria-controls='pr_id_2_list']")).sendKeys("BADNERA");  //send value in To station
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@aria-controls='pr_id_2_list']")).sendKeys(Keys.TAB);   //select drop-down name using Keys.TAB
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='ng-tns-c59-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).sendKeys("7/10/2022");
		//Select the date and send-keys send any particular date
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='ui-state-default ng-tns-c59-10 ui-state-active ng-star-inserted']")).click();
		// after send particular date calendar opened then click particular highlighted date.
		Thread.sleep(1000);
//------------------------------------------------------------------------
		
		driver.findElement(By.xpath("//*[@class='ng-tns-c66-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		// click inside box where is the option for select the class and after drop-down opened different types of classes
		driver.findElement(By.xpath("//*[@aria-label='AC 2 Tier (2A)']")).click();
		//after selection the particular class and click on particular class
		Thread.sleep(1000);
//--------------------------------------------------------------		
		
		driver.findElement(By.xpath("//*[@formcontrolname='journeyQuota']")).click();
		// click inside box where is the option for select the category and after drop-down opened different types of category 

		driver.findElement(By.xpath("//*[@aria-label='LOWER BERTH/SR.CITIZEN']")).click();
		//after selection the particular category and click on particular category
		driver.findElement(By.xpath("//*[@class='ui-button-text ui-clickable']")).click();
		//click ok for the condition massage of senior citizens age limits
		Thread.sleep(1000);

			
//    	driver.findElement(By.xpath("//*[@aria-label='GENERAL']")).click();
		//after selection the particular category and click on particular category
		
    	driver.findElement(By.xpath("//*[@for='concessionBooking']")).click();            
		//click on person with disability concession 
		driver.findElement(By.xpath("//*[@class='ui-button-text ui-clickable']")).click();
		//click on ok for the confirmation massage
		Thread.sleep(1000);
//----------------------------
    	driver.findElement(By.xpath("//*[@for='dateSpecific']")).click(); 
    	Thread.sleep(1000);

//---------------------------------		
		
    	driver.findElement(By.xpath("//*[@for='availableBerth']")).click();
    	Thread.sleep(1000);

//--------------------------------	
    	driver.findElement(By.xpath("//*[@for='passBooking']")).click(); 
    	driver.findElement(By.xpath("//*[@class='ui-button-icon-left ui-clickable pi pi-check']")).click();
    	Thread.sleep(1000);
    	
//--------------------------------------
    	
    	driver.findElement(By.xpath("//*[@class='search_btn train_Search']")).click(); 
	
	}

}
