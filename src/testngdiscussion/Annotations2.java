package testngdiscussion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
//-------------------------------------------------------	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
//-------------------------------------------------------			
	@Test
	public void buyHeadPhones()
	{
		System.out.println("Head phone buy test");		
	}
//-------------------------------------------------------		
	@Test
	public void buyMouse()
	{
		System.out.println("Mouse test case");		
	}

}
