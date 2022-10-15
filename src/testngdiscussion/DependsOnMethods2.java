package testngdiscussion;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	
	@Test(priority = 1,dependsOnMethods = "testngdiscussion.DependsOnMethods.handlingCheckBox")
	public void editProfile() 
	{
		System.out.println("Edit Profile test case");
	}
	
	@Test(priority = 2)
	public void viewProfile() 
	{
		System.out.println("View profile test case");
	}


}
