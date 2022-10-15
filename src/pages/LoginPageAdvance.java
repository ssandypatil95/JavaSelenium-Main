package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAdvance {
	
WebDriver driver;
@FindBy(xpath = "//input[@name='txtUsername']") WebElement username;
@FindBy(xpath = "//input[@type='password']") WebElement password;
@FindBy(xpath = "//input[@value='LOGIN']") WebElement loginbutton;

// @FindBy(xpath = "//input[@name='txtUsername']") List<WebElement> elements;     //---for using multiple webelements (for ex. multiple checkboxes )
	
	public LoginPageAdvance(WebDriver driver) 
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this );    // For initialize the all WebElements from the globally defined webElements 
	}
		
	public void enterCredentialsAndLogin() 
	{
		   username.sendKeys("Admin");		   
		   password.sendKeys("admin123");		   		   
		   loginbutton.click();		 
	 }
		
	public void getTitleOfPage() 
	{
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
	}

}
