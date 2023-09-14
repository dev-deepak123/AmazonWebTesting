package AmazonPagesWithLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFile.TestBase;

public class AccountPage extends TestBase {
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement accountAndListLable;
	
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div")
	WebElement yourOrderBoxLinkLable;
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a")
	WebElement loginAndSecurityBoxLinkLable;
	
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement accountLinkLable;
	
	
	
	Actions actions = new Actions(TestBase.driver); 
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AccountPage hoverOnAccountAndList() {
		
		actions.moveToElement(accountAndListLable).build().perform();
		accountLinkLable.click();
		return new AccountPage();
	}
	
	public String verifyYourAccountLable() {
		
		return driver.getTitle();
			
	}
	
	public ReturnAndOrderPage verifyYourOrderBoxLinkLable() {
		
		yourOrderBoxLinkLable.click();
		return new ReturnAndOrderPage();
	}
	
    public LoginPage verifyLoginAndSecurityLable() {
		
    	loginAndSecurityBoxLinkLable.click();
		return new LoginPage();
	}
	
	

}
