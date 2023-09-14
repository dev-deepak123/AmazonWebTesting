package AmazonPagesWithLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFile.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement accountAndListLable;
	
	@FindBy(xpath = "//span[contains(text(),'Sign Out')]")
	WebElement signUpButton;
	
	Actions actions = new Actions(TestBase.driver);
	
    public SignUpPage() {
		
		PageFactory.initElements(driver, this);
	}
    public LoginPage signUpAmazonAccount (){
		
    	
    	actions.moveToElement(accountAndListLable).build().perform();
    	signUpButton.click();
    	
    	return new LoginPage();
	}
    
    
	
}
