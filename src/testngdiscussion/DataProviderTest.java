package testngdiscussion;

import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "testdata", dataProviderClass = testngdiscussion.DataProviderClass.class)
	public void testCase(String s1, String s2) {
		
		System.out.println(s1+" "+s2);
		
	}

}
