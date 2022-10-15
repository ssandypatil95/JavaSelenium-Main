package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCases2 {
	
	@Test(groups = "sanity")                      
	public void viewProfile() 
	{
		System.out.println("View profile test case");
	}
	
	@Test(groups ={"functional","sanity"})                            
	public void logout() 
	{
		System.out.println("Logout from application test case");
	}


}
