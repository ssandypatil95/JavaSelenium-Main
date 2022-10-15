package testngdiscussion;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
	@BeforeGroups("functional")
	public void beforegroups() 
	{
		System.out.println("Exucating the before group for functional");
	}
	
	@AfterGroups("functional")
	public void aftergroups()
	{
		System.out.println("Exucating the after group for functional");
	}
	
	@Test(groups ={"regression","sanity"})                           // { }is used to more than one group name defined on a single test case
	public void getTitleOfPage() 
	{
		System.out.println("Title of page");
	}
	
	@Test(groups = {"sanity","functional"})                        
	public void loginToApp() 
	{
		System.out.println("Login to application test case");
	}

	@Test(groups = {"regression","functional"})                                      // ------ directly defined the group on a test case
	public void navToAdminTab() 
	{
		System.out.println("Navigate to Admin");
	}

	@Test(groups = "sanity")
	public void handlingCheckBox() 
	{
	    System.out.println("Check box handling case");
	}




}
