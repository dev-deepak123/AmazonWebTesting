package AmazonPagesWithHeadless;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseFile.TestBase2;

public class AccountPage1 extends TestBase2 {
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement accountAndListLable;
	
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div")
	WebElement yourOrderBoxLinkLable;
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a")
	WebElement loginAndSecurityBoxLinkLable;
	
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement accountLinkLable;
	
	
	
	Actions actions = new Actions(TestBase2.driver); 
	
	public AccountPage1() {
		PageFactory.initElements(driver, this);
	}
	
	public AccountPage1 hoverOnAccountAndList() {
		
		actions.moveToElement(accountAndListLable).build().perform();
		accountLinkLable.click();
		return new AccountPage1();
	}
	
	public String verifyYourAccountLable() {
		
		return driver.getTitle();
			
	}
	
	public ReturnAndOrderPage1 verifyYourOrderBoxLinkLable() {
		
		yourOrderBoxLinkLable.click();
		return new ReturnAndOrderPage1();
	}
	
    public LoginPage1 verifyLoginAndSecurityLable() {
		
    	loginAndSecurityBoxLinkLable.click();
		return new LoginPage1();
	}
	
	

}
