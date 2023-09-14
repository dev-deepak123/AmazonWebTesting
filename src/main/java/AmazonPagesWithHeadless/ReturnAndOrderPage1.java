package AmazonPagesWithHeadless;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseFile.TestBase2;

public class ReturnAndOrderPage1 extends TestBase2 {
	 
	
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[3]/ul/li[1]")
	WebElement orderLable;
	
	@FindBy(xpath="//a[text()='Buy Again']")
	WebElement buyAgainLable;
	
	@FindBy(xpath="//a[text()='Not Yet Shipped']")
	WebElement notYetShippedLable;
	
	@FindBy(xpath="//a[text()='Cancelled Orders']")
	WebElement cancelOrderLable;
	
	Actions actions = new Actions(driver);
	public ReturnAndOrderPage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ReturnAndOrderPage1 verifyOrderlable() {
		
		orderLable.click();
		return new ReturnAndOrderPage1();
	}
	
	public ReturnAndOrderPage1 verifyBuyAgainlable() {
		
		buyAgainLable.click();
		return new ReturnAndOrderPage1();
	}
	public ReturnAndOrderPage1 verifyNotYetShippedlable() {
		
		notYetShippedLable.click();
		return new ReturnAndOrderPage1();
	}
	
    public ReturnAndOrderPage1 verifyCancelOrderlable() {
		
    	cancelOrderLable.click();
    	return new ReturnAndOrderPage1();
	}
	

}
