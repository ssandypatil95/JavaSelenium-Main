package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	public void BeforeTest() 
	{
		System.out.println("Before Test");
	}
//-------------------------------------------------------	
	@AfterTest
	public void AfterTest() 
	{
		System.out.println("After Test");
	}
//-------------------------------------------------------	
	@BeforeClass
	public void BeforeClass() 
	{
		System.out.println("before class");	
	}
//-------------------------------------------------------		
	@AfterClass
	public void AfterClass() 
	{
		System.out.println("AfterClass");	
	}
//-------------------------------------------------------	
	@BeforeMethod
	public void BeforeMethod() 
	{
	   System.out.println("BeforeMethod");	
	}
//-------------------------------------------------------		
	@AfterMethod
	public void AfterMethod() 
	{
		System.out.println("AfterMethod");
	}
//-------------------------------------------------------		
	@Test
	public void searchmobile() 
	{
		System.out.println("search mobbile test case");
	}
//-------------------------------------------------------		
	@Test
	public void searchlaptop() 
	{
		System.out.println("search laptop test case");
	}

}
