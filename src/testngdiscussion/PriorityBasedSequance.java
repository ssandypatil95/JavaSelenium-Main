package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityBasedSequance {
	
	@Test(priority = -1)
	public void login() 
	{
		System.out.println("Login to the Application");
	}
	
	@Test(invocationCount = 5)                               // -------------- invocationcount used for execute multiple times
	public void home() 
	{
		System.out.println("Home page of the Application");
	}

	@Test(priority = 4,invocationCount = 2)                  // -------------- invocationcount used for execute multiple times
	public void dashBoard() 
	{
		System.out.println("DashBoard of the Application");
	}

	@Test(priority = 5)
	public void logout() 
	{
		System.out.println("Login from the Application");
	}
	
	@Test(priority = 3)
	public void profile() 
	{
		System.out.println("Profile of the Application");
	}
	
}
