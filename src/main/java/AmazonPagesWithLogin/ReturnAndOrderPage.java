package AmazonPagesWithLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFile.TestBase;

public class ReturnAndOrderPage extends TestBase {
	 
	
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[3]/ul/li[1]")
	WebElement orderLable;
	
	@FindBy(xpath="//a[text()='Buy Again']")
	WebElement buyAgainLable;
	
	@FindBy(xpath="//a[text()='Not Yet Shipped']")
	WebElement notYetShippedLable;
	
	@FindBy(xpath="//a[text()='Cancelled Orders']")
	WebElement cancelOrderLable;
	
	Actions actions = new Actions(TestBase.driver);
	public ReturnAndOrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ReturnAndOrderPage verifyOrderlable() {
		
		orderLable.click();
		return new ReturnAndOrderPage();
	}
	
	public ReturnAndOrderPage verifyBuyAgainlable() {
		
		buyAgainLable.click();
		return new ReturnAndOrderPage();
	}
	public ReturnAndOrderPage verifyNotYetShippedlable() {
		
		notYetShippedLable.click();
		return new ReturnAndOrderPage();
	}
	
    public ReturnAndOrderPage verifyCancelOrderlable() {
		
    	cancelOrderLable.click();
    	return new ReturnAndOrderPage();
	}
	

}
