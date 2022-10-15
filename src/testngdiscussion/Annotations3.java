package testngdiscussion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
	
	@BeforeTest
	public void BeforeTest() 
	{
		System.out.println("Before Test Healthcare");
	}
//-------------------------------------------------------		
	@AfterTest
	public void AfterTest() 
	{
		System.out.println("After Test Healthcare");
	}
//-------------------------------------------------------		
	@Test
	public void buyHealthAidKit()
	{
		System.out.println("Buy Health Aid Kit test case");
	}

}
