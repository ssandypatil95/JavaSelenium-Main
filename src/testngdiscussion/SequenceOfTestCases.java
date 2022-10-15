package testngdiscussion;

import org.testng.annotations.Test;

public class SequenceOfTestCases {
	
	@Test
	public void login() 
	{
		System.out.println("Login to the Application");
	}
	
	@Test
	public void home() 
	{
		System.out.println("Home page of the Application");
	}

	@Test
	public void dashBoard() 
	{
		System.out.println("DashBoard of the Application");
	}

	@Test
	public void logout() 
	{
		System.out.println("Login from the Application");
	}
	
	@Test
	public void profile() 
	{
		System.out.println("Profile of the Application");
	}
	
}
