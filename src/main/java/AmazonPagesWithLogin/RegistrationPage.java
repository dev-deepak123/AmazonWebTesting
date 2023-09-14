package AmazonPagesWithLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFile.TestBase;

public class RegistrationPage extends TestBase{
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement signInLinkLable;
	
	@FindBy(xpath="//a[text()='Start here.']")
	WebElement startHareLable;
	
	@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	WebElement yourName;
	
	@FindBy(xpath="//*[@id=\"ap_phone_number\"]")
	WebElement phoneNo;
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement Continue;
	
	
	
	
	
	Actions actions = new Actions(TestBase.driver);
	//Initializing the page Objects
		public RegistrationPage()
		{
			PageFactory.initElements(driver, this);
		}
	//action
		public HomePage registration(String name, String pwd,String pNo,String em )
		{
			actions.moveToElement(signInLinkLable).build().perform();
//			signInLinkLable.click();
			startHareLable.click();
			yourName.sendKeys(name);
			phoneNo.sendKeys(pNo);
			email.sendKeys(em);
			password.sendKeys(pwd);
			
			//return home page class object
			return new HomePage();
			
		}

}
