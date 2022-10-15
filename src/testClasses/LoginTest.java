package testClasses;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void validateLogin() 
	{		
		lp.enterCredentialsAndLogin();
	}
	
	
	@Test
	public void validateTitle() 
	{
		lp.getTitleOfPage();
	}

}
