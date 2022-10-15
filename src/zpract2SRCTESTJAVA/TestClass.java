package zpract2SRCTESTJAVA;

import org.testng.annotations.Test;

import zpract1SRCMAINJAVA.PageClass;

public class TestClass extends BaseClass {

	
	@Test
	public void validateEnterDataAndLogin() 
	{
		
		pc.enterDataAndLogin();
	}
	
	
	@Test
	public void validatGetTitle() 
	{	
		pc.getTitle();
	}

}
