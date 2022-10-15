package testngdiscussion;

import org.testng.annotations.Test;

public class TimeOutKeyword {
	
	@Test(timeOut = 5000)
	public void loginPerformance()
	{
		System.out.println("Login performance");
	}
	
	
	@Test(timeOut = 5000)
	public void loginDelay() throws InterruptedException
	{
		System.out.println("Login test");
		Thread.sleep(6000);
	}

}
