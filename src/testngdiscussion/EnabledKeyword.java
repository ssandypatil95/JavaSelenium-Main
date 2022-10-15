package testngdiscussion;

import org.testng.annotations.Test;

public class EnabledKeyword {
	
	@Test(enabled = false)
	public void getAppUrl() 
	{
		System.out.println("Current Url test case");
	}
	
	@Test
	public void loginToApp() 
	{
		System.out.println("Login test case");
	}


}
