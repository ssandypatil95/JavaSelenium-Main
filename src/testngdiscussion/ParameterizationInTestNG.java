package testngdiscussion;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationInTestNG {
	
	@Parameters("browser")
	@Test
	public void launchBrowser(String readvalue) 
	{
		System.out.println("Browser name is "+readvalue);
	}
	
	@Parameters({"environment","buildversion"})
	@Test
	public void buidInfo(String env, String version) 
	{
		System.out.println("Env value is "+env);
		System.out.println("Version value is "+version);

	}

}
