package AmazonPagesWithHeadless;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseFile.TestBase2;

public class SignUpPage1 extends TestBase2{
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement accountAndListLable;
	
	@FindBy(xpath = "//span[contains(text(),'Sign Out')]")
	WebElement signUpButton;
	
	Actions actions = new Actions(driver);
	
    public SignUpPage1() {
		
		PageFactory.initElements(driver, this);
	}
    public LoginPage1 signUpAmazonAccount (){
		
    	
    	actions.moveToElement(accountAndListLable).build().perform();
    	signUpButton.click();
    	
    	return new LoginPage1();
	}
    
    
	
}
