package zzPractice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class YatraScript {

		public static void main(String[] args) throws InterruptedException {
			
	    System.setProperty("webdriver.chrome.driver","D:\\Software\\Java Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(2000);
		
//		WebElement departButton = driver.findElement(By.xpath("//*[@id='BE_flight_origin_city']"));
		driver.findElement(By.xpath("//*[@id='BE_flight_origin_city']")).click();
			
	    Actions act = new Actions(driver);
	    
//	    act.contextClick(departButton).perform();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[text()='Chhatrapati Shivaji International']")).click();
	    
	    Thread.sleep(2000);
			
		WebElement arrival = driver.findElement(By.xpath("//*[@id='BE_flight_arrival_city']"));
		arrival.click();
		
//		act.contextClick(arrival).perform();
		
		driver.findElement(By.xpath("//*[text()='Kempegowda International']")).click();
		
		driver.findElement(By.xpath("//*[@id='BE_flight_origin_date']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='15/10/2022']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@value='Search Flights']")).click();
		
		}
	

}
