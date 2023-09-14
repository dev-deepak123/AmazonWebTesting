package AmazonPagesWithHeadless;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseFile.TestBase2;

public class LoginPage1 extends TestBase2{
	
	@FindBy(xpath="//*[@id=\"nav-signin-tooltip\"]/a/span")
	WebElement signInBtn;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement press;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement submit;
	
	//Initializing the page Objects
	public LoginPage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public String validationLoginPage()
	{
		return driver.getTitle();
	}
	
	public HomePage1 login(String userName , String pwd)
	{
		signInBtn.click();
		email.sendKeys(userName);
		press.click();
		password.sendKeys(pwd);
		submit.click();
		//return home page class object
		return new HomePage1();
		
	}

	
	
	
	

}
